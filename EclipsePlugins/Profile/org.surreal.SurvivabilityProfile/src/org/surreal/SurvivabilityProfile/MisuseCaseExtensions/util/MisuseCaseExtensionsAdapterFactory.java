/**
 */
package org.surreal.SurvivabilityProfile.MisuseCaseExtensions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.MisuseCaseExtensionsPackage
 * @generated
 */
public class MisuseCaseExtensionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MisuseCaseExtensionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MisuseCaseExtensionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MisuseCaseExtensionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MisuseCaseExtensionsSwitch<Adapter> modelSwitch =
		new MisuseCaseExtensionsSwitch<Adapter>() {
			@Override
			public Adapter caserecovery(recovery object) {
				return createrecoveryAdapter();
			}
			@Override
			public Adapter casestrategy(strategy object) {
				return createstrategyAdapter();
			}
			@Override
			public Adapter caseserviceMS(serviceMS object) {
				return createserviceMSAdapter();
			}
			@Override
			public Adapter casemisuse(misuse object) {
				return createmisuseAdapter();
			}
			@Override
			public Adapter caseservice(service object) {
				return createserviceAdapter();
			}
			@Override
			public Adapter casethreatens(threatens object) {
				return createthreatensAdapter();
			}
			@Override
			public Adapter casemitigates(mitigates object) {
				return createmitigatesAdapter();
			}
			@Override
			public Adapter casemisuser(misuser object) {
				return createmisuserAdapter();
			}
			@Override
			public Adapter caseresistance(resistance object) {
				return createresistanceAdapter();
			}
			@Override
			public Adapter caserecognition(recognition object) {
				return createrecognitionAdapter();
			}
			@Override
			public Adapter caseServiceModeDefinition(ServiceModeDefinition object) {
				return createServiceModeDefinitionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.recovery <em>recovery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.recovery
	 * @generated
	 */
	public Adapter createrecoveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.strategy <em>strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.strategy
	 * @generated
	 */
	public Adapter createstrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.serviceMS <em>service MS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.serviceMS
	 * @generated
	 */
	public Adapter createserviceMSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.misuse <em>misuse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.misuse
	 * @generated
	 */
	public Adapter createmisuseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.service <em>service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.service
	 * @generated
	 */
	public Adapter createserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.threatens <em>threatens</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.threatens
	 * @generated
	 */
	public Adapter createthreatensAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.mitigates <em>mitigates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.mitigates
	 * @generated
	 */
	public Adapter createmitigatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.misuser <em>misuser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.misuser
	 * @generated
	 */
	public Adapter createmisuserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.resistance <em>resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.resistance
	 * @generated
	 */
	public Adapter createresistanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.recognition <em>recognition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.recognition
	 * @generated
	 */
	public Adapter createrecognitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.ServiceModeDefinition <em>Service Mode Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.ServiceModeDefinition
	 * @generated
	 */
	public Adapter createServiceModeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MisuseCaseExtensionsAdapterFactory
