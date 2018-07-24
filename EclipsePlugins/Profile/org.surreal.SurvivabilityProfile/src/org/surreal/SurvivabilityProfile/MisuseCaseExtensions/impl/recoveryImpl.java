/**
 */
package org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.MisuseCaseExtensionsPackage;
import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.recovery;

import org.surreal.SurvivabilityProfile.SurvTypes.affectConsequence;
import org.surreal.SurvivabilityProfile.SurvTypes.duration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>recovery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.recoveryImpl#getAffects <em>Affects</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.recoveryImpl#getMTTR <em>MTTR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class recoveryImpl extends strategyImpl implements recovery {
	/**
	 * The cached value of the '{@link #getAffects() <em>Affects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffects()
	 * @generated
	 * @ordered
	 */
	protected EList<affectConsequence> affects;

	/**
	 * The cached value of the '{@link #getMTTR() <em>MTTR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTTR()
	 * @generated
	 * @ordered
	 */
	protected duration mttr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected recoveryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MisuseCaseExtensionsPackage.Literals.RECOVERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<affectConsequence> getAffects() {
		if (affects == null) {
			affects = new EObjectContainmentEList<affectConsequence>(affectConsequence.class, this, MisuseCaseExtensionsPackage.RECOVERY__AFFECTS);
		}
		return affects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public duration getMTTR() {
		return mttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMTTR(duration newMTTR, NotificationChain msgs) {
		duration oldMTTR = mttr;
		mttr = newMTTR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MisuseCaseExtensionsPackage.RECOVERY__MTTR, oldMTTR, newMTTR);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMTTR(duration newMTTR) {
		if (newMTTR != mttr) {
			NotificationChain msgs = null;
			if (mttr != null)
				msgs = ((InternalEObject)mttr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MisuseCaseExtensionsPackage.RECOVERY__MTTR, null, msgs);
			if (newMTTR != null)
				msgs = ((InternalEObject)newMTTR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MisuseCaseExtensionsPackage.RECOVERY__MTTR, null, msgs);
			msgs = basicSetMTTR(newMTTR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MisuseCaseExtensionsPackage.RECOVERY__MTTR, newMTTR, newMTTR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MisuseCaseExtensionsPackage.RECOVERY__AFFECTS:
				return ((InternalEList<?>)getAffects()).basicRemove(otherEnd, msgs);
			case MisuseCaseExtensionsPackage.RECOVERY__MTTR:
				return basicSetMTTR(null, msgs);
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
			case MisuseCaseExtensionsPackage.RECOVERY__AFFECTS:
				return getAffects();
			case MisuseCaseExtensionsPackage.RECOVERY__MTTR:
				return getMTTR();
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
			case MisuseCaseExtensionsPackage.RECOVERY__AFFECTS:
				getAffects().clear();
				getAffects().addAll((Collection<? extends affectConsequence>)newValue);
				return;
			case MisuseCaseExtensionsPackage.RECOVERY__MTTR:
				setMTTR((duration)newValue);
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
			case MisuseCaseExtensionsPackage.RECOVERY__AFFECTS:
				getAffects().clear();
				return;
			case MisuseCaseExtensionsPackage.RECOVERY__MTTR:
				setMTTR((duration)null);
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
			case MisuseCaseExtensionsPackage.RECOVERY__AFFECTS:
				return affects != null && !affects.isEmpty();
			case MisuseCaseExtensionsPackage.RECOVERY__MTTR:
				return mttr != null;
		}
		return super.eIsSet(featureID);
	}

} //recoveryImpl
