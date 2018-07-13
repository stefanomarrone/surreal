/**
 */
package org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl;

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

import org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage;
import org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse;

import org.survTool.SurvivabilityProfile.profile.Survivability_profile.TypesLibrary.affectConsequence;
import org.survTool.SurvivabilityProfile.profile.Survivability_profile.TypesLibrary.duration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>misuse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.misuseImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.misuseImpl#getAffects <em>Affects</em>}</li>
 *   <li>{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.misuseImpl#getSuccessProb <em>Success Prob</em>}</li>
 *   <li>{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.misuseImpl#getAttackDelay <em>Attack Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class misuseImpl extends MinimalEObjectImpl.Container implements misuse {
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
	public UseCase getBase_UseCase() {
		if (base_UseCase != null && base_UseCase.eIsProxy()) {
			InternalEObject oldBase_UseCase = (InternalEObject)base_UseCase;
			base_UseCase = (UseCase)eResolveProxy(oldBase_UseCase);
			if (base_UseCase != oldBase_UseCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MisuseCaseExtensionsPackage.MISUSE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MisuseCaseExtensionsPackage.MISUSE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
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
			case MisuseCaseExtensionsPackage.MISUSE__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
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
			case MisuseCaseExtensionsPackage.MISUSE__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
				return;
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
			case MisuseCaseExtensionsPackage.MISUSE__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
				return;
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
			case MisuseCaseExtensionsPackage.MISUSE__BASE_USE_CASE:
				return base_UseCase != null;
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
