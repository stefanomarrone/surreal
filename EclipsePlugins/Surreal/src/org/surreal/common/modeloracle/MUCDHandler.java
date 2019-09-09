package org.surreal.common.modeloracle;

import java.io.IOException;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;
import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.serviceMS;
import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.ServiceModeDefinitionImpl;
import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.misuseImpl;
import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.recoveryImpl;
import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.serviceImpl;
import org.surreal.SurvivabilityProfile.SAMExtensions.MSactivation;
import org.surreal.SurvivabilityProfile.SAMExtensions.impl.MSactivationImpl;
import org.surreal.common.utils.Dictionary;
import org.surreal.samgen.modes.Behaviour;

@SuppressWarnings("restriction")
public class MUCDHandler {
	
	protected Resource res;

	protected Model model;
	
	protected EList<EObject> elements;
	
	protected EList<DynamicEObjectImpl> stereotypes;
	
	protected EList<serviceImpl> services;

	protected EList<misuseImpl> misuses;

	protected EList<recoveryImpl> recoveries;

	protected EList<ClassImpl> classes;

	protected ServiceModeDefinitionImpl modesDefinition;

	protected EList<Profile> profiles;
	
	protected UMLHelper helper;
	
	public MUCDHandler() {
		this.res = null;
		this.model = null;
		this.elements = new BasicEList<EObject>();
		this.stereotypes = new BasicEList<DynamicEObjectImpl>();
		this.services = new BasicEList<serviceImpl>();
		this.misuses = new BasicEList<misuseImpl>();
		this.modesDefinition = null;
		this.recoveries = new BasicEList<recoveryImpl>();
		this.classes  = new BasicEList<ClassImpl>();
		this.profiles = new BasicEList<Profile>();
		this.helper = new UMLHelper(this);
	}
	
	public void setModel(Model mm) {
		this.model = mm;
	}
	
	public void addElement(EObject e) {
		this.elements.add(e);
	}
	
	public void addStereotype(DynamicEObjectImpl s) {
		this.stereotypes.add(s);
	}

	public void addService(serviceImpl s) {
		this.services.add(s);
	}

	public void addRecovery(recoveryImpl s) {
		this.recoveries.add(s);
	}

	public void addMisuse(misuseImpl ss) {
		this.misuses.add(ss);
	}

	public Vector<serviceImpl> getServices() {
		Vector<serviceImpl> retval = new Vector<serviceImpl>();
		for (serviceImpl s: this.services) {
			retval.add(s);
		}
		return retval;
	}

	public Vector<misuseImpl> getMisuses() {
		Vector<misuseImpl> retval = new Vector<misuseImpl>();
		for (misuseImpl s: this.misuses) {
			retval.add(s);
		}
		return retval;
	}

	public Vector<recoveryImpl> getRecoveries() {
		Vector<recoveryImpl> retval = new Vector<recoveryImpl>();
		for (recoveryImpl s: this.recoveries) {
			retval.add(s);
		}
		return retval;
	}

	public void addClass(ClassImpl c) {
		this.classes.add(c);
	}

	public void addProfile(Profile p) {
		this.profiles.add(p);
	}

	public Vector<UseCase> getEssentialServiceList() {
		return this.getAnnotatedUCList(Dictionary.serviceST);
	}

	public UMLHelper getHelper() {
		return this.helper;
	}

	public Vector<UseCase> getMisuseList() {
		return this.getAnnotatedUCList(Dictionary.misuseST);
	}

	private Vector<UseCase> getAnnotatedUCList(String tag) {
		Vector<UseCase> retval = new Vector<UseCase>();
		for (int i=0; i<this.elements.size(); i++) {
			if (this.elements.get(i) instanceof UseCase) {
				UseCase uc = (UseCase) this.elements.get(i);
				boolean annotationFlag = this.helper.isAnnotated(uc,Dictionary.profileName,tag);
				if (annotationFlag) {
					retval.add(uc);
				}
			}
		}
		return retval;
	}
	
	public void addStateMachine(Behaviour sme) {
		// preliminaries
		org.eclipse.uml2.uml.Class SMContainer = (org.eclipse.uml2.uml.Class) this.model.createOwnedType("SM Container",UMLPackage.Literals.CLASS);
		StateMachine umlSM = (StateMachine)SMContainer.createOwnedBehavior("global mode",UMLPackage.Literals.STATE_MACHINE);
		Region mainRegion = umlSM.createRegion("main");
		// Metamodelling
		Profile samExts = this.model.getAppliedProfile("Survivability::Extensions::SAMExtensions",true);
		Stereotype modeST = (Stereotype) samExts.getPackagedElement("mode");
		Stereotype scenarioST = (Stereotype) samExts.getPackagedElement("scenario");
        Property sequenceTV = scenarioST.getOwnedAttribute("path",null);
        Property priorityTV = modeST.getOwnedAttribute("severity",null);
		// State generation
		Hashtable<String,State> stateLookup = new Hashtable<String,State>();
		for (String sname: sme.getNames()) {
			State s = (State) mainRegion.createSubvertex(sname,UMLPackage.Literals.STATE);
			s.applyStereotype(modeST);
			s.setValue(modeST,priorityTV.getName(),sme.getSeverity(sname));
			stateLookup.put(sname,s);			
		}
		// Generate Transitions
		for (String srcName: sme.getNames()) {
			State src = stateLookup.get(srcName);
			for (String dstName: sme.getNames()) {
				State dest = stateLookup.get(dstName);
				org.surreal.samgen.modes.Transition t_from = sme.getTransition(srcName,dstName);				
				if (t_from != null) {
					if (t_from.isEmpty() == false) {
						Transition t = mainRegion.createTransition("T_" + srcName + "_" + dstName);
						t.applyStereotype(scenarioST);
						t.setSource(src);
						t.setTarget(dest);
						EList<String> tempNameList = new BasicEList<String>(t_from.getStepList());
						EList<MSactivation> tempList = new BasicEList<MSactivation>();
						for (String s: tempNameList) {
							String s_name = this.filterMsName(s); 
							String s_value = this.filterMsValue(s);
							int s_step = this.filterMsStep(s);
							serviceMS sms = this.getServiceMS(s_name);
							MSactivationImpl temp = new MSActivationHelper(sms,s_value,s_step);
							tempList.add(temp);						
						}			
						t.setValue(scenarioST,sequenceTV.getName(),tempList);
					}

				}
			}
		}		
	}

	private String filterMsName(String s) {
		String retval = s;
		int fcIndex = s.indexOf(')');
		int lcIndex = s.indexOf('-');
		retval = s.substring(fcIndex+1,lcIndex);
		return retval;
	}

	private String filterMsValue(String s) {
		String retval = s;
		int fcIndex = s.indexOf("->") + 1;
		int lcIndex = s.length();
		retval = s.substring(fcIndex+1,lcIndex);
		return retval;
	}

	private int filterMsStep(String s) {
		int retval = 0;
		int fcIndex = s.indexOf("@");
		int lcIndex = s.indexOf(":");
		retval = new Integer(s.substring(fcIndex+1,lcIndex));
		return retval;
	}

	private serviceMS getServiceMS(String name) {
		serviceMS retval = null;
		Vector<serviceMS> pool = new Vector<serviceMS>();
		pool.addAll(this.recoveries);
		pool.addAll(this.misuses);
		int counter = 0;
		int len = pool.size();
		while ((counter < len) && (retval == null)) {
			serviceMS temp = pool.elementAt(counter);
			if (temp.getBase_UseCase().getName().equals(name)) {
				retval = temp;
			}
			counter++;
		}
		return retval;
	}
	
	public Vector<UseCase> getRecoveryList() {
		return this.getAnnotatedUCList("recovery");
	}

	public void save(IFile f) {
//		InputStream stream = new ByteArrayInputStream(payload.getBytes(StandardCharsets.UTF_8));
//		f.setContents(stream,true,false,null);
		URI uri = URI.createPlatformResourceURI(f.getFullPath().toString(), true);
		Resource resource = new ResourceSetImpl().createResource(uri);
		resource.getContents().addAll(this.res.getContents());
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Vector<String> getModesDefinitions() {
		Vector<String> retval = new Vector<String>();
		for (String smd: this.modesDefinition.getFormula()) {
			retval.add(smd);
		}
		return retval;
	}

	public Vector<String> getModesDefinitionNames() {
		Vector<String> temp = this.getModesDefinitions();
		Vector<String> retval = new Vector<String>();
		for (String t: temp) {
			StringTokenizer tkzr = new StringTokenizer(t,",");
			retval.add(tkzr.nextToken());
		}
		return retval;
	}

	public void setMode(ServiceModeDefinitionImpl it) {
		this.modesDefinition = it;
	}
}