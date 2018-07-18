/**
 */
package org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.uml2.uml.Constraint;

import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage;
import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.ServiceModeContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Mode Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.impl.ServiceModeContextImpl#getBase_Constraint <em>Base Constraint</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.impl.ServiceModeContextImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceModeContextImpl extends MinimalEObjectImpl.Container implements ServiceModeContext {
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
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<String> definition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceModeContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MisuseCaseExtensionsPackage.Literals.SERVICE_MODE_CONTEXT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MisuseCaseExtensionsPackage.SERVICE_MODE_CONTEXT__BASE_CONSTRAINT, oldBase_Constraint, base_Constraint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MisuseCaseExtensionsPackage.SERVICE_MODE_CONTEXT__BASE_CONSTRAINT, oldBase_Constraint, base_Constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDefinition() {
		if (definition == null) {
			definition = new EDataTypeUniqueEList<String>(String.class, this, MisuseCaseExtensionsPackage.SERVICE_MODE_CONTEXT__DEFINITION);
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MisuseCaseExtensionsPackage.SERVICE_MODE_CONTEXT__BASE_CONSTRAINT:
				if (resolve) return getBase_Constraint();
				return basicGetBase_Constraint();
			case MisuseCaseExtensionsPackage.SERVICE_MODE_CONTEXT__DEFINITION:
				return getDefinition();
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
			case MisuseCaseExtensionsPackage.SERVICE_MODE_CONTEXT__BASE_CONSTRAINT:
				setBase_Constraint((Constraint)newValue);
				return;
			case MisuseCaseExtensionsPackage.SERVICE_MODE_CONTEXT__DEFINITION:
				getDefinition().clear();
				getDefinition().addAll((Collection<? extends String>)newValue);
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
			case MisuseCaseExtensionsPackage.SERVICE_MODE_CONTEXT__BASE_CONSTRAINT:
				setBase_Constraint((Constraint)null);
				return;
			case MisuseCaseExtensionsPackage.SERVICE_MODE_CONTEXT__DEFINITION:
				getDefinition().clear();
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
			case MisuseCaseExtensionsPackage.SERVICE_MODE_CONTEXT__BASE_CONSTRAINT:
				return base_Constraint != null;
			case MisuseCaseExtensionsPackage.SERVICE_MODE_CONTEXT__DEFINITION:
				return definition != null && !definition.isEmpty();
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
		result.append(" (definition: ");
		result.append(definition);
		result.append(')');
		return result.toString();
	}

} //ServiceModeContextImpl
