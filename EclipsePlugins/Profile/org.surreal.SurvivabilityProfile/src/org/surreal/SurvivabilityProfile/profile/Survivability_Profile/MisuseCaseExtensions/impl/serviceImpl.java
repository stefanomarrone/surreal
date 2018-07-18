/**
 */
package org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.UseCase;

import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage;
import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.service;

import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.index;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.impl.serviceImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.impl.serviceImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class serviceImpl extends MinimalEObjectImpl.Container implements service {
	/**
	 * The cached value of the '{@link #getIndices() <em>Indices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndices()
	 * @generated
	 * @ordered
	 */
	protected EList<index> indices;

	/**
	 * The cached value of the '{@link #getBase_UseCase() <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_UseCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase base_UseCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected serviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MisuseCaseExtensionsPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<index> getIndices() {
		if (indices == null) {
			indices = new EObjectContainmentEList<index>(index.class, this, MisuseCaseExtensionsPackage.SERVICE__INDICES);
		}
		return indices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getBase_UseCase() {
		if (base_UseCase != null && base_UseCase.eIsProxy()) {
			InternalEObject oldBase_UseCase = (InternalEObject)base_UseCase;
			base_UseCase = (UseCase)eResolveProxy(oldBase_UseCase);
			if (base_UseCase != oldBase_UseCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MisuseCaseExtensionsPackage.SERVICE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
			}
		}
		return base_UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetBase_UseCase() {
		return base_UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_UseCase(UseCase newBase_UseCase) {
		UseCase oldBase_UseCase = base_UseCase;
		base_UseCase = newBase_UseCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MisuseCaseExtensionsPackage.SERVICE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MisuseCaseExtensionsPackage.SERVICE__INDICES:
				return ((InternalEList<?>)getIndices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MisuseCaseExtensionsPackage.SERVICE__INDICES:
				return getIndices();
			case MisuseCaseExtensionsPackage.SERVICE__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
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
			case MisuseCaseExtensionsPackage.SERVICE__INDICES:
				getIndices().clear();
				getIndices().addAll((Collection<? extends index>)newValue);
				return;
			case MisuseCaseExtensionsPackage.SERVICE__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
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
			case MisuseCaseExtensionsPackage.SERVICE__INDICES:
				getIndices().clear();
				return;
			case MisuseCaseExtensionsPackage.SERVICE__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
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
			case MisuseCaseExtensionsPackage.SERVICE__INDICES:
				return indices != null && !indices.isEmpty();
			case MisuseCaseExtensionsPackage.SERVICE__BASE_USE_CASE:
				return base_UseCase != null;
		}
		return super.eIsSet(featureID);
	}

} //serviceImpl
