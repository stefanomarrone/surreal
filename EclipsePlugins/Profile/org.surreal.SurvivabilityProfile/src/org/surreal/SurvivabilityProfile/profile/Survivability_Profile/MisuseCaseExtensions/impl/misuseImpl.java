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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage;
import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.misuse;

import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.affectConsequence;
import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.duration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>misuse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.impl.misuseImpl#getAffects <em>Affects</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.impl.misuseImpl#getSuccessProb <em>Success Prob</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.impl.misuseImpl#getAttackDelay <em>Attack Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class misuseImpl extends serviceMSImpl implements misuse {
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
	 * The default value of the '{@link #getSuccessProb() <em>Success Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessProb()
	 * @generated
	 * @ordered
	 */
	protected static final double SUCCESS_PROB_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSuccessProb() <em>Success Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessProb()
	 * @generated
	 * @ordered
	 */
	protected double successProb = SUCCESS_PROB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttackDelay() <em>Attack Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackDelay()
	 * @generated
	 * @ordered
	 */
	protected duration attackDelay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected misuseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MisuseCaseExtensionsPackage.Literals.MISUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<affectConsequence> getAffects() {
		if (affects == null) {
			affects = new EObjectContainmentEList<affectConsequence>(affectConsequence.class, this, MisuseCaseExtensionsPackage.MISUSE__AFFECTS);
		}
		return affects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSuccessProb() {
		return successProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessProb(double newSuccessProb) {
		double oldSuccessProb = successProb;
		successProb = newSuccessProb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MisuseCaseExtensionsPackage.MISUSE__SUCCESS_PROB, oldSuccessProb, successProb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public duration getAttackDelay() {
		return attackDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttackDelay(duration newAttackDelay, NotificationChain msgs) {
		duration oldAttackDelay = attackDelay;
		attackDelay = newAttackDelay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MisuseCaseExtensionsPackage.MISUSE__ATTACK_DELAY, oldAttackDelay, newAttackDelay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackDelay(duration newAttackDelay) {
		if (newAttackDelay != attackDelay) {
			NotificationChain msgs = null;
			if (attackDelay != null)
				msgs = ((InternalEObject)attackDelay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MisuseCaseExtensionsPackage.MISUSE__ATTACK_DELAY, null, msgs);
			if (newAttackDelay != null)
				msgs = ((InternalEObject)newAttackDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MisuseCaseExtensionsPackage.MISUSE__ATTACK_DELAY, null, msgs);
			msgs = basicSetAttackDelay(newAttackDelay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MisuseCaseExtensionsPackage.MISUSE__ATTACK_DELAY, newAttackDelay, newAttackDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MisuseCaseExtensionsPackage.MISUSE__AFFECTS:
				return ((InternalEList<?>)getAffects()).basicRemove(otherEnd, msgs);
			case MisuseCaseExtensionsPackage.MISUSE__ATTACK_DELAY:
				return basicSetAttackDelay(null, msgs);
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
			case MisuseCaseExtensionsPackage.MISUSE__AFFECTS:
				return getAffects();
			case MisuseCaseExtensionsPackage.MISUSE__SUCCESS_PROB:
				return getSuccessProb();
			case MisuseCaseExtensionsPackage.MISUSE__ATTACK_DELAY:
				return getAttackDelay();
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
			case MisuseCaseExtensionsPackage.MISUSE__AFFECTS:
				getAffects().clear();
				getAffects().addAll((Collection<? extends affectConsequence>)newValue);
				return;
			case MisuseCaseExtensionsPackage.MISUSE__SUCCESS_PROB:
				setSuccessProb((Double)newValue);
				return;
			case MisuseCaseExtensionsPackage.MISUSE__ATTACK_DELAY:
				setAttackDelay((duration)newValue);
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
			case MisuseCaseExtensionsPackage.MISUSE__AFFECTS:
				getAffects().clear();
				return;
			case MisuseCaseExtensionsPackage.MISUSE__SUCCESS_PROB:
				setSuccessProb(SUCCESS_PROB_EDEFAULT);
				return;
			case MisuseCaseExtensionsPackage.MISUSE__ATTACK_DELAY:
				setAttackDelay((duration)null);
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
			case MisuseCaseExtensionsPackage.MISUSE__AFFECTS:
				return affects != null && !affects.isEmpty();
			case MisuseCaseExtensionsPackage.MISUSE__SUCCESS_PROB:
				return successProb != SUCCESS_PROB_EDEFAULT;
			case MisuseCaseExtensionsPackage.MISUSE__ATTACK_DELAY:
				return attackDelay != null;
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
		result.append(" (successProb: ");
		result.append(successProb);
		result.append(')');
		return result.toString();
	}

} //misuseImpl
