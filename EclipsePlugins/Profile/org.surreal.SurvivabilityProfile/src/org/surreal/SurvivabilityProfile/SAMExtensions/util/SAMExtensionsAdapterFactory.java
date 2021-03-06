/**
 */
package org.surreal.SurvivabilityProfile.SAMExtensions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.surreal.SurvivabilityProfile.SAMExtensions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.surreal.SurvivabilityProfile.SAMExtensions.SAMExtensionsPackage
 * @generated
 */
public class SAMExtensionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SAMExtensionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAMExtensionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SAMExtensionsPackage.eINSTANCE;
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
	protected SAMExtensionsSwitch<Adapter> modelSwitch =
		new SAMExtensionsSwitch<Adapter>() {
			@Override
			public Adapter casescenario(scenario object) {
				return createscenarioAdapter();
			}
			@Override
			public Adapter caseMSactivation(MSactivation object) {
				return createMSactivationAdapter();
			}
			@Override
			public Adapter casemode(mode object) {
				return createmodeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.surreal.SurvivabilityProfile.SAMExtensions.scenario <em>scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.surreal.SurvivabilityProfile.SAMExtensions.scenario
	 * @generated
	 */
	public Adapter createscenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.surreal.SurvivabilityProfile.SAMExtensions.MSactivation <em>MSactivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.surreal.SurvivabilityProfile.SAMExtensions.MSactivation
	 * @generated
	 */
	public Adapter createMSactivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.surreal.SurvivabilityProfile.SAMExtensions.mode <em>mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.surreal.SurvivabilityProfile.SAMExtensions.mode
	 * @generated
	 */
	public Adapter createmodeAdapter() {
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

} //SAMExtensionsAdapterFactory
