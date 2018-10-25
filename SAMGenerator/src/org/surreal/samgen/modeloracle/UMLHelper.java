package org.surreal.samgen.modeloracle;

import java.util.Hashtable;
import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.UseCase;
import org.surreal.samgen.dictionary.Dictionary;

public class UMLHelper {
	
	protected UMLHandler model;
	
	public UMLHelper(UMLHandler m) {
		this.model = m;
	}
	
	public boolean isEssentialService(UseCase uc) {
		return this.isAnnotated(uc,Dictionary.profileName,Dictionary.serviceST);
	}	

	public boolean isMisuse(UseCase uc) {
		return this.isAnnotated(uc,Dictionary.profileName,Dictionary.misuseST);
	}	

	public boolean isRecovery(UseCase uc) {
		return this.isAnnotated(uc,Dictionary.profileName,Dictionary.recoveryST);
	}	

	public boolean isAnnotated(EObject obj, String profileName, String stereotypeName) {
		boolean retval = false;
		int counter = 0;
		int size = this.model.stereotypes.size();
		while ((counter < size) && (!retval)) {
			DynamicEObjectImpl s = this.model.stereotypes.get(counter);
			if (UMLUtils.getProfileName(s).equals(profileName)) {
				if (UMLUtils.getStereotypeName(s).equals(stereotypeName)) {
					int i = 0;
					int refsize = s.eCrossReferences().size();
					while ((!retval) && (i<refsize)) {
						EObject temp = s.eCrossReferences().get(i);
						retval = (temp == obj);
						i++;
					}
				}
			}
			counter++;
		}
		return retval;
	}
	
	public DynamicEObjectImpl getAnnotation(EObject obj, String pname, String sname) {
		DynamicEObjectImpl retval = null;
		int size = this.model.stereotypes.size();
		int counter = 0;
		while ((counter < size) && (retval == null)) {
			DynamicEObjectImpl s = this.model.stereotypes.get(counter);
			if (UMLUtils.getProfileName(s).equals(pname)) {
				if (UMLUtils.getStereotypeName(s).equals(sname)) {
					int applicableCounter = 0;
					boolean found = false;
					while ((!found) && (applicableCounter<s.eCrossReferences().size())) {
						EObject ttemp = s.eCrossReferences().get(applicableCounter);
						found = (obj == ttemp);
						if (found) {
							retval = s;
						}
						applicableCounter++;
					}
				}
			}
			counter++;
		}
		return retval;
	}
	
	public Vector<Hashtable<String,String>> getTaggedValues(EObject obj, String pname, String sname, Vector<String> tags) {
		Vector<Hashtable<String,String>> taggedvalues = null; 
		if (this.isAnnotated(obj,pname,sname)) {
			taggedvalues = new Vector<Hashtable<String,String>>();
			DynamicEObjectImpl annotation = this.getAnnotation(obj,pname,sname);
			for (String t: tags) {
				//TEST&CLEAN
//				TaggedValue tvManager = TaggedValueFactory.generate(sname,t);
				int featureNumber = this.getDynamicFeatureNumber(annotation);
				for (int counter = 0; counter < featureNumber; counter++) {
					try {
						Object misterx = annotation.dynamicGet(counter);
						EList<DynamicEObjectImpl> templist = (EList<DynamicEObjectImpl>) misterx;
						for (DynamicEObjectImpl tagname: templist) {
							if (tagname.eClass().getName().equals(t)) {
								Hashtable<String,String> rawdata = this.extractData(tagname);
								taggedvalues.add(rawdata);
							}
						}
					} catch (ClassCastException e) {
					}
				}
			}
		}
		return taggedvalues;
	}

	private int getDynamicFeatureNumber(DynamicEObjectImpl x) {
		int retval = 0;
		boolean stopFlag = false;
		do {
			try {
				x.dynamicGet(retval);
				retval++;
			} catch (Exception e) {
				stopFlag = true;							
			}
		} while (!stopFlag);
		return retval;
	}
	
	private Hashtable<String,String> extractData(DynamicEObjectImpl tagname) {
		Hashtable<String,String> retval = new Hashtable<String,String>();
		EClassImpl type = (EClassImpl) tagname.eClass();
		EList<EAttribute> kinds = type.getEAllAttributes();
		int counter = 0;
		boolean stopFlag = false;
		do {
			try {
				EAttribute kind = kinds.get(counter);
				Object temp = tagname.dynamicGet(counter);
				if ((temp != null) && (kind != null)) {
					retval.put(kind.getName(),temp.toString());
				}
				counter++;
			} catch (Exception e) {
				stopFlag = true;
			}
		} while (!stopFlag);
		return retval;
	}

	public boolean isThreatens(Dependency d) {
		return this.isAnnotated(d,Dictionary.profileName,Dictionary.threatensST);
	}
}