package org.surreal.samgen.kripkemodel;

import java.util.Hashtable;
import java.util.Vector;

import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UseCase;
import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.misuseImpl;
import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.recoveryImpl;
import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.serviceImpl;
import org.surreal.SurvivabilityProfile.SurvTypes.affectConsequence;
import org.surreal.SurvivabilityProfile.SurvTypes.index;
import org.surreal.common.modeloracle.MUCDHandler;
import org.surreal.samgen.kripkemodel.attacks.Affect;
import org.surreal.samgen.kripkemodel.attacks.Attack;
import org.surreal.samgen.kripkemodel.attacks.AttackAffectFactory;
import org.surreal.samgen.kripkemodel.protections.RecovAffectFactory;
import org.surreal.samgen.kripkemodel.protections.Recovery;
import org.surreal.samgen.kripkemodel.services.Index;
import org.surreal.samgen.kripkemodel.services.IndexFactory;
import org.surreal.samgen.kripkemodel.services.Service;

public class SystemModelFactory {

	public static SystemModel generate(MUCDHandler o) {
		SystemModel retval = new SystemModel();
		// Taking care of essential services
		Vector<serviceImpl> servs = o.getServices();
		for (serviceImpl si: servs) {
			Service ss = SystemModelFactory.generateEssential(si);
			retval.addService(ss);
		}
		// Taking care of attacks
		Vector<misuseImpl> misus = o.getMisuses();
		for (misuseImpl mu: misus) {
			Attack aa = SystemModelFactory.generateAttack(mu,retval.getServiceList());
			retval.addAttack(aa);
		}
		// Taking care of recovery
		Vector<recoveryImpl> recos = o.getRecoveries();
		for (recoveryImpl rc: recos) {
			Recovery rr = SystemModelFactory.generateRecovery(o,rc,retval.getAttackList());
			retval.addRecovery(rr);
		}
		// Finalization of the activity
		retval = SystemModelFactory.complete(retval,misus,recos,o);
		return retval;
	}
	
	private static SystemModel complete(SystemModel sm, Vector<misuseImpl> ms, Vector<recoveryImpl> rs, MUCDHandler o) {
		// Complete Service-Attack relationships
		Hashtable<String,Vector<String>> a_to_s = SystemModelFactory.getASMap(ms,o);
		for (String keyA: a_to_s.keySet()) {
			Vector<String> relServs = a_to_s.get(keyA);
			Attack aa = sm.getAttack(keyA);
			for (String rels: relServs) {
				Service ss = sm.getService(rels);
//				aa.addService(ss);
				ss.addAttack(aa);
			}
		}
		// Complete Attack-Recoveries relationships
		Hashtable<String,Vector<String>> r_to_a = SystemModelFactory.getRAMap(rs,o);
		for (String keyR: r_to_a.keySet()) {
			Vector<String> relAtts = r_to_a.get(keyR);
			Recovery rr = sm.getRecovery(keyR);
			for (String rela: relAtts) {
				Attack aa = sm.getAttack(rela);
				aa.addRecovery(rr);
//				rr.addAttack(aa);
			}
		}
		return sm;
	}

	public static Service generateEssential(serviceImpl si) {
		String name = si.getBase_UseCase().getName();
		Service retval = new Service(name);
		for (index i: si.getIndices()) {
			Index idx = IndexFactory.generate(i);
			retval.addIndex(idx);
		}
		return retval;
	}
	
	public static Attack generateAttack(misuseImpl mu, Vector<Service> ss) {
		UseCase usecase = mu.getBase_UseCase();
		String name = usecase.getName();
		Attack retval = new Attack(name);
		for (affectConsequence ac: mu.getAffects()) {
			Affect aft = AttackAffectFactory.generate(ac);
			retval.addAffect(aft);
		}
		int maxSS = ss.size();
		for (Dependency d: usecase.getClientDependencies()) {
			for (NamedElement ne: d.getSuppliers()) {
				String sname = ne.getName();
				boolean found = false;
				int counter = 0;
				while ((counter < maxSS) && (found == false)) {
					if (ss.elementAt(counter).getName().equals(sname)) {
						retval.addService(ss.elementAt(counter));
						found = true;
					}
					counter++;
				}
			}
		}
		return retval;
	}

	public static Recovery generateRecovery(MUCDHandler o, recoveryImpl rc, Vector<Attack> aas) {
		UseCase usecase = rc.getBase_UseCase();
		String name = usecase.getName();
		Recovery retval = new Recovery(name);
		for (affectConsequence ri: rc.getAffects()) {
			Affect aft = RecovAffectFactory.generate(ri);
			retval.addAffect(aft);
		}
		int maxAA = aas.size();
		for (Dependency d: usecase.getClientDependencies()) {
			for (NamedElement ne: d.getSuppliers()) {
				String aname = ne.getName();
				boolean found = false;
				int counter = 0;
				while ((counter < maxAA) && (found == false)) {
					if (aas.elementAt(counter).getName().equals(aname)) {
						retval.addAttack(aas.elementAt(counter));
						found = true;
					}
					counter++;
				}
			}
		}
		return retval;
	}

	private static Hashtable<String, Vector<String>> getASMap(Vector<misuseImpl> misues, MUCDHandler o) {
		Hashtable<String, Vector<String>> retval = new Hashtable<String, Vector<String>>(); 
		for (misuseImpl mu: misues) {
			UseCase uc = mu.getBase_UseCase();
			String ucName = uc.getName();
			Vector<String> solution = new Vector<String>();
			for (Dependency d: uc.getClientDependencies()) {
				for (NamedElement supplier: d.getSuppliers()) {
					for (serviceImpl ss: o.getServices()) {
						String suppName = supplier.getName();
						String ssName = ss.getBase_UseCase().getName();
						if (suppName.equals(ssName)) {
							solution.add(ssName);
						}
					}
				}
			}
			retval.put(ucName,solution);
		}
		return retval;
	}

	private static Hashtable<String, Vector<String>> getRAMap(Vector<recoveryImpl> recoveries, MUCDHandler o) {
		Hashtable<String, Vector<String>> retval = new Hashtable<String, Vector<String>>(); 
		for (recoveryImpl ru: recoveries) {
			UseCase uc = ru.getBase_UseCase();
			String ucName = uc.getName();
			Vector<String> solution = new Vector<String>();
			for (Dependency d: uc.getClientDependencies()) {
				for (NamedElement supplier: d.getSuppliers()) {
					for (misuseImpl ss: o.getMisuses()) {
						String suppName = supplier.getName();
						String ssName = ss.getBase_UseCase().getName();
						if (suppName.equals(ssName)) {
							solution.add(ssName);
						}
					}
				}
			}
			retval.put(ucName,solution);
		}
		return retval;
	}
	
	// Technical Debt - rifattorizzare passando al nuovo paradigma
//	private static Hashtable<String, Vector<String>> getDependencyMap(Vector<UseCase> source, String profile, String trgLabel, String depLabel, UMLHandler o) {
//		UMLHelper h = o.getHelper();
//		Hashtable<String, Vector<String>> retval = new Hashtable<String, Vector<String>>();
//		for (UseCase s: source) {
//			Vector<String> payload = new Vector<String>();
//			for (Dependency d: s.getClientDependencies()) {
//				boolean flag = (depLabel != null) ? h.isAnnotated(d, profile, depLabel) : true; 
//				if (flag) {
//					for (EObject supp: d.getSuppliers()) {
//						if (h.isAnnotated(supp, profile, trgLabel)) {
//							UseCase usupp = (UseCase) supp;
//							payload.add(usupp.getName());
//						}
//					}
//				}
//			}
//			retval.put(s.getName(),payload);
//		}
//		return retval;
//	}
}

