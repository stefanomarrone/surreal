/**
 */
package org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.uml2.uml.Constraint;

import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.MisuseCaseExtensionsPackage;
import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.ServiceModeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Mode Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.ServiceModeDefinitionImpl#getBase_Constraint <em>Base Constraint</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.ServiceModeDefinitionImpl#getFormula <em>Formula</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceModeDefinitionImpl extends MinimalEObjectImpl.Container implements ServiceModeDefinition {
	/**
	 * The cached value of the '{@link #getBase_Constraint() <em>Base Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Constraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint base_Constraint;

	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected EList<String> formula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceModeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MisuseCaseExtensionsPackage.Literals.SERVICE_MODE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getBase_Constraint() {
		if (base_Constraint != null && base_Constraint.eIsProxy()) {
			InternalEObject oldBase_Constraint = (InternalEObject)base_Constraint;
			base_Constraint = (Constraint)eResolveProxy(oldBase_Constraint);
			if (base_Constraint != oldBase_Constraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MisuseCaseExtensionsPackage.SERVICE_MODE_DEFINITION__BASE_CONSTRAINT, oldBase_Constraint, base_Constraint));
			}
		}
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetBase_Constraint() {
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Constraint(Constraint newBase_Constraint) {
		Constraint oldBase_Constraint = base_Constraint;
		base_Constraint = newBase_Constraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MisuseCaseExtensionsPackage.SERVICE_MODE_DEFINITION__BASE_CONSTRAINT, oldBase_Constraint, base_Constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFormula() {
		if (formula == null) {
			formula = new EDataTypeUniqueEList<String>(String.class, this, MisuseCaseExtensionsPackage.SERVICE_MODE_DEFINITION__FORMULA);
		}
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MisuseCaseExtensionsPackage.SERVICE_MODE_DEFINITION__BASE_CONSTRAINT:
				if (resolve) return getBase_Constraint();
				return basicGetBase_Constraint();
			case MisuseCaseExtensionsPackage.SERVICE_MODE_DEFINITION__FORMULA:
				return getFormula();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MisuseCaseExtensionsPackage.SERVICE_MODE_DEFINITION__BASE_CONSTRAINT:
				setBase_Constraint((Constraint)newValue);
				return;
			case MisuseCaseExtensionsPackage.SERVICE_MODE_DEFINITION__FORMULA:
				getFormula().clear();
				getFormula().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MisuseCaseExtensionsPackage.SERVICE_MODE_DEFINITION__BASE_CONSTRAINT:
				setBase_Constraint((Constraint)null);
				return;
			case MisuseCaseExtensionsPackage.SERVICE_MODE_DEFINITION__FORMULA:
				getFormula().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MisuseCaseExtensionsPackage.SERVICE_MODE_DEFINITION__BASE_CONSTRAINT:
				return base_Constraint != null;
			case MisuseCaseExtensionsPackage.SERVICE_MODE_DEFINITION__FORMULA:
				return formula != null && !formula.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (formula: ");
		result.append(formula);
		result.append(')');
		return result.toString();
	}

} //ServiceModeDefinitionImpl
