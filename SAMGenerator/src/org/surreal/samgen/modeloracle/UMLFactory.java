package org.surreal.samgen.modeloracle;

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
import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.serviceImpl;
import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.misuseImpl;
import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.recoveryImpl;

public class UMLFactory {
	
	public static UMLHandler generate(String modelpath) {
		UMLHandler retval = new UMLHandler();
		ResourceSet set = new ResourceSetImpl();
		set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		set.getPackageRegistry().put(EcorePackage.eNS_URI,EcorePackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		Resource res = set.getResource(URI.createFileURI(modelpath), true);
		retval.res = res;
		EList<EObject> list = res.getContents();
		for(EObject o: list){
			EcoreUtil.resolveAll(o);
		}
		EObject it = null;
		for (int i=0; i<list.size(); i++) {
			it = list.get(i);
			if (it instanceof ModelImpl) {
				ModelImpl mit = (ModelImpl) it;
				retval.setModel(mit);
				for (Profile p: mit.getAllAppliedProfiles()) {
					retval.addProfile(p);
				}
				for (PackageableElement pe : mit.getPackagedElements()) {
					retval.addElement((EObject) pe);
				}
			} else if (it instanceof PackageImpl){
				PackageImpl pit = (PackageImpl) it;
				for (PackageableElement pe : pit.getPackagedElements()) {
					retval.addElement((EObject) pe);
				}
			} else if (it instanceof ClassImpl) {
				retval.addClass((ClassImpl)it);
			} else if (it instanceof DynamicEObjectImpl) {
				retval.addStereotype((DynamicEObjectImpl)it);
			} else if (it instanceof serviceImpl) {
				retval.addService((serviceImpl)it);
			} else if (it instanceof recoveryImpl) {
				retval.addRecovery((recoveryImpl)it);
			} else if (it instanceof misuseImpl) {
				retval.addMisuse((misuseImpl)it);
			} else {
				String warning = "[WARN] there is an unmatched element " + it.toString();
				System.err.println(warning);
			}
		}
		return retval;
	}
}

/*

	public Model read(String modelpath){
		Model retval = null;
		ResourceSet set = new ResourceSetImpl();
		set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		Resource res = set.getResource(URI.createFileURI(modelpath), true);
		EList<EObject> list = res.getContents();
		for(EObject o: list){
			EcoreUtil.resolveAll(o);
		}
		EList<ClassImpl> classes = new BasicEList<ClassImpl>();
		EList<AnyTypeImpl> sterotapps = new BasicEList<AnyTypeImpl>();
		EList<Profile> types = null;
		
		EObject it = null;
		for (int i=0; i<list.size(); i++) {
			it = list.get(i);
			if (it instanceof ModelImpl) {
				ModelImpl mit = (ModelImpl) it;
				types = mit.getAllAppliedProfiles();
				for (PackageableElement pe : mit.getPackagedElements()) {
					list.add((EObject) pe);
				}
			} else if (it instanceof PackageImpl){
				PackageImpl pit = (PackageImpl) it;
				for (PackageableElement pe : pit.getPackagedElements()) {
					list.add((EObject) pe);
				}
			} else if (it instanceof ClassImpl) {
				classes.add((ClassImpl)it);
			} else if (it instanceof AnyTypeImpl) {
				sterotapps.add((AnyTypeImpl)it);
			}
			System.out.println("BLUUU");
			System.out.println(it.toString());
		}
		for (AnyTypeImpl a: sterotapps) {
			for (int i=0; i<a.getAnyAttribute().size(); i++) {
				EStructuralFeature esf = a.getAnyAttribute().get(i).getEStructuralFeature();
				if (esf.getName().equals("base_Class")) {
					System.out.println("** base ** " + a.getAnyAttribute().get(i).getValue());
				}
			}
		}
		return retval;
	}


*/