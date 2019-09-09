package org.surreal.common.modeloracle;

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
