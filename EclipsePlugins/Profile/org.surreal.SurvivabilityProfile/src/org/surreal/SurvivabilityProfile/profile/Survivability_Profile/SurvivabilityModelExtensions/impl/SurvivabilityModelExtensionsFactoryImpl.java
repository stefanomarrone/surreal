/**
 */
package org.surreal.SurvivabilityProfile.profile.Survivability_Profile.SurvivabilityModelExtensions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.SurvivabilityModelExtensions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SurvivabilityModelExtensionsFactoryImpl extends EFactoryImpl implements SurvivabilityModelExtensionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SurvivabilityModelExtensionsFactory init() {
		try {
			SurvivabilityModelExtensionsFactory theSurvivabilityModelExtensionsFactory = (SurvivabilityModelExtensionsFactory)EPackage.Registry.INSTANCE.getEFactory(SurvivabilityModelExtensionsPackage.eNS_URI);
			if (theSurvivabilityModelExtensionsFactory != null) {
				return theSurvivabilityModelExtensionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SurvivabilityModelExtensionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurvivabilityModelExtensionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SurvivabilityModelExtensionsPackage.SCENARIO: return createscenario();
			case SurvivabilityModelExtensionsPackage.MODE: return createmode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scenario createscenario() {
		scenarioImpl scenario = new scenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mode createmode() {
		modeImpl mode = new modeImpl();
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurvivabilityModelExtensionsPackage getSurvivabilityModelExtensionsPackage() {
		return (SurvivabilityModelExtensionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SurvivabilityModelExtensionsPackage getPackage() {
		return SurvivabilityModelExtensionsPackage.eINSTANCE;
	}

} //SurvivabilityModelExtensionsFactoryImpl
