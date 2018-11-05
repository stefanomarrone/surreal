/**
 */
package org.surreal.SurvivabilityProfile.SAMExtensions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.surreal.SurvivabilityProfile.SAMExtensions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SAMExtensionsFactoryImpl extends EFactoryImpl implements SAMExtensionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SAMExtensionsFactory init() {
		try {
			SAMExtensionsFactory theSAMExtensionsFactory = (SAMExtensionsFactory)EPackage.Registry.INSTANCE.getEFactory(SAMExtensionsPackage.eNS_URI);
			if (theSAMExtensionsFactory != null) {
				return theSAMExtensionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SAMExtensionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAMExtensionsFactoryImpl() {
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
			case SAMExtensionsPackage.SCENARIO: return createscenario();
			case SAMExtensionsPackage.MSACTIVATION: return createMSactivation();
			case SAMExtensionsPackage.MODE: return createmode();
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
	public MSactivation createMSactivation() {
		MSactivationImpl mSactivation = new MSactivationImpl();
		return mSactivation;
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
	public SAMExtensionsPackage getSAMExtensionsPackage() {
		return (SAMExtensionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SAMExtensionsPackage getPackage() {
		return SAMExtensionsPackage.eINSTANCE;
	}

} //SAMExtensionsFactoryImpl
