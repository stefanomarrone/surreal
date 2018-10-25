package org.surreal.samgen.modeloracle;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;

public class UMLUtils {

	public static String getProfileName(DynamicEObjectImpl s) {
		EClass sClass = s.eClass();
		EPackage sPackage = sClass.getEPackage();
		return sPackage.getNsPrefix();
	}
	
	public static String getStereotypeName(DynamicEObjectImpl s) {
		EClass sClass = s.eClass();
		return sClass.getName();
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