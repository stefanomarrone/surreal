package org.surreal.common.modeloracle;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;
import org.eclipse.uml2.uml.internal.impl.ModelImpl;
import org.eclipse.uml2.uml.internal.impl.PackageImpl;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.ServiceModeDefinitionImpl;
import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.misuseImpl;
import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.recoveryImpl;
import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.serviceImpl;
import org.surreal.SurvivabilityProfile.SAMExtensions.impl.modeImpl;
import org.surreal.SurvivabilityProfile.SAMExtensions.impl.scenarioImpl;

//TODO: refactor this method
@SuppressWarnings("restriction")
public class UMLFactory {
	
	public static MUCDHandler generateMUCD(String modelpath) {
		MUCDHandler retval = new MUCDHandler();
		UMLFactory.buildHandler(retval,modelpath);
		return retval;
	}
	
	public static SAMHandler generateSAM(String modelpath) {
		SAMHandler retval = new SAMHandler();		
		EList<EObject> list = UMLFactory.buildHandler(retval,modelpath);
		EObject it = null;
		for (int i=0; i<list.size(); i++) {
			it = list.get(i);
			if (it instanceof modeImpl) {
				retval.addMode((modeImpl)it);
			} else if (it instanceof scenarioImpl) {
				retval.addScenario((scenarioImpl)it);
			} else {
				String warning = "[WARN] there is an unmatched element " + it.toString();
				System.err.println(warning);
			}
		}
		return retval;
	}

	
	private static EList<EObject> buildHandler(MUCDHandler h, String modelpath) {
		ResourceSet set = new ResourceSetImpl();
		set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		set.getPackageRegistry().put(EcorePackage.eNS_URI,EcorePackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		Resource res = set.getResource(URI.createFileURI(modelpath), true);
		h.res = res;
		EList<EObject> list = res.getContents();
		for(EObject o: list){
			EcoreUtil.resolveAll(o);
		}
		EObject it = null;
		for (int i=0; i<list.size(); i++) {
			it = list.get(i);
			if (it instanceof ModelImpl) {
				ModelImpl mit = (ModelImpl) it;
				h.setModel(mit);
				for (Profile p: mit.getAllAppliedProfiles()) {
					h.addProfile(p);
				}
				for (PackageableElement pe : mit.getPackagedElements()) {
					h.addElement((EObject) pe);
				}
			} else if (it instanceof PackageImpl){
				PackageImpl pit = (PackageImpl) it;
				for (PackageableElement pe : pit.getPackagedElements()) {
					h.addElement((EObject) pe);
				}
			} else if (it instanceof ClassImpl) {
				h.addClass((ClassImpl)it);
			} else if (it instanceof DynamicEObjectImpl) {
				h.addStereotype((DynamicEObjectImpl)it);
			} else if (it instanceof ServiceModeDefinitionImpl) {
				h.setMode((ServiceModeDefinitionImpl)it);
			} else if (it instanceof serviceImpl) {
				h.addService((serviceImpl)it);
			} else if (it instanceof recoveryImpl) {
				h.addRecovery((recoveryImpl)it);
			} else if (it instanceof misuseImpl) {
				h.addMisuse((misuseImpl)it);
			} else {
				String warning = "[WARN] there is an unmatched element " + it.toString();
				System.err.println(warning);
			}
		}
		return list;
	}
}