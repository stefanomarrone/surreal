/**
 */
package org.surreal.SurvivabilityProfile.SurvTypes.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.surreal.SurvivabilityProfile.SurvTypes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.surreal.SurvivabilityProfile.SurvTypes.SurvTypesPackage
 * @generated
 */
public class SurvTypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SurvTypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurvTypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SurvTypesPackage.eINSTANCE;
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
	protected SurvTypesSwitch<Adapter> modelSwitch =
		new SurvTypesSwitch<Adapter>() {
			@Override
			public Adapter caseindex(index object) {
				return createindexAdapter();
			}
			@Override
			public Adapter caseduration(duration object) {
				return createdurationAdapter();
			}
			@Override
			public Adapter caseaffectConsequence(affectConsequence object) {
				return createaffectConsequenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.surreal.SurvivabilityProfile.SurvTypes.index <em>index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.index
	 * @generated
	 */
	public Adapter createindexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.surreal.SurvivabilityProfile.SurvTypes.duration <em>duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.duration
	 * @generated
	 */
	public Adapter createdurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.surreal.SurvivabilityProfile.SurvTypes.affectConsequence <em>affect Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.affectConsequence
	 * @generated
	 */
	public Adapter createaffectConsequenceAdapter() {
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

} //SurvTypesAdapterFactory
