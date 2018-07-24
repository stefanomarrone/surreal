/**
 */
package org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MisuseCaseExtensionsFactoryImpl extends EFactoryImpl implements MisuseCaseExtensionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MisuseCaseExtensionsFactory init() {
		try {
			MisuseCaseExtensionsFactory theMisuseCaseExtensionsFactory = (MisuseCaseExtensionsFactory)EPackage.Registry.INSTANCE.getEFactory(MisuseCaseExtensionsPackage.eNS_URI);
			if (theMisuseCaseExtensionsFactory != null) {
				return theMisuseCaseExtensionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MisuseCaseExtensionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MisuseCaseExtensionsFactoryImpl() {
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
			case MisuseCaseExtensionsPackage.RECOVERY: return createrecovery();
			case MisuseCaseExtensionsPackage.MISUSE: return createmisuse();
			case MisuseCaseExtensionsPackage.SERVICE: return createservice();
			case MisuseCaseExtensionsPackage.THREATENS: return createthreatens();
			case MisuseCaseExtensionsPackage.MITIGATES: return createmitigates();
			case MisuseCaseExtensionsPackage.MISUSER: return createmisuser();
			case MisuseCaseExtensionsPackage.RESISTANCE: return createresistance();
			case MisuseCaseExtensionsPackage.RECOGNITION: return createrecognition();
			case MisuseCaseExtensionsPackage.SERVICE_MODE_DEFINITION: return createServiceModeDefinition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public recovery createrecovery() {
		recoveryImpl recovery = new recoveryImpl();
		return recovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public misuse createmisuse() {
		misuseImpl misuse = new misuseImpl();
		return misuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public service createservice() {
		serviceImpl service = new serviceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public threatens createthreatens() {
		threatensImpl threatens = new threatensImpl();
		return threatens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mitigates createmitigates() {
		mitigatesImpl mitigates = new mitigatesImpl();
		return mitigates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public misuser createmisuser() {
		misuserImpl misuser = new misuserImpl();
		return misuser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public resistance createresistance() {
		resistanceImpl resistance = new resistanceImpl();
		return resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public recognition createrecognition() {
		recognitionImpl recognition = new recognitionImpl();
		return recognition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceModeDefinition createServiceModeDefinition() {
		ServiceModeDefinitionImpl serviceModeDefinition = new ServiceModeDefinitionImpl();
		return serviceModeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MisuseCaseExtensionsPackage getMisuseCaseExtensionsPackage() {
		return (MisuseCaseExtensionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MisuseCaseExtensionsPackage getPackage() {
		return MisuseCaseExtensionsPackage.eINSTANCE;
	}

} //MisuseCaseExtensionsFactoryImpl
