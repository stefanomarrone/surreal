/**
 */
package org.surreal.SurvivabilityProfile.SurvTypes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.surreal.SurvivabilityProfile.SurvTypes.SurvTypesPackage;
import org.surreal.SurvivabilityProfile.SurvTypes.affectConsequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>affect Consequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.surreal.SurvivabilityProfile.SurvTypes.impl.affectConsequenceImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.SurvTypes.impl.affectConsequenceImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.SurvTypes.impl.affectConsequenceImpl#getInc <em>Inc</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.SurvTypes.impl.affectConsequenceImpl#getDec <em>Dec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class affectConsequenceImpl extends MinimalEObjectImpl.Container implements affectConsequence {
	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected String index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSet() <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected static final String SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSet() <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected String set = SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getInc() <em>Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInc()
	 * @generated
	 * @ordered
	 */
	protected static final String INC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInc() <em>Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInc()
	 * @generated
	 * @ordered
	 */
	protected String inc = INC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDec() <em>Dec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDec()
	 * @generated
	 * @ordered
	 */
	protected static final String DEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDec() <em>Dec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDec()
	 * @generated
	 * @ordered
	 */
	protected String dec = DEC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected affectConsequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurvTypesPackage.Literals.AFFECT_CONSEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(String newIndex) {
		String oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurvTypesPackage.AFFECT_CONSEQUENCE__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSet() {
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(String newSet) {
		String oldSet = set;
		set = newSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurvTypesPackage.AFFECT_CONSEQUENCE__SET, oldSet, set));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInc() {
		return inc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInc(String newInc) {
		String oldInc = inc;
		inc = newInc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurvTypesPackage.AFFECT_CONSEQUENCE__INC, oldInc, inc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDec() {
		return dec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDec(String newDec) {
		String oldDec = dec;
		dec = newDec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurvTypesPackage.AFFECT_CONSEQUENCE__DEC, oldDec, dec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurvTypesPackage.AFFECT_CONSEQUENCE__INDEX:
				return getIndex();
			case SurvTypesPackage.AFFECT_CONSEQUENCE__SET:
				return getSet();
			case SurvTypesPackage.AFFECT_CONSEQUENCE__INC:
				return getInc();
			case SurvTypesPackage.AFFECT_CONSEQUENCE__DEC:
				return getDec();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SurvTypesPackage.AFFECT_CONSEQUENCE__INDEX:
				setIndex((String)newValue);
				return;
			case SurvTypesPackage.AFFECT_CONSEQUENCE__SET:
				setSet((String)newValue);
				return;
			case SurvTypesPackage.AFFECT_CONSEQUENCE__INC:
				setInc((String)newValue);
				return;
			case SurvTypesPackage.AFFECT_CONSEQUENCE__DEC:
				setDec((String)newValue);
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
			case SurvTypesPackage.AFFECT_CONSEQUENCE__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case SurvTypesPackage.AFFECT_CONSEQUENCE__SET:
				setSet(SET_EDEFAULT);
				return;
			case SurvTypesPackage.AFFECT_CONSEQUENCE__INC:
				setInc(INC_EDEFAULT);
				return;
			case SurvTypesPackage.AFFECT_CONSEQUENCE__DEC:
				setDec(DEC_EDEFAULT);
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
			case SurvTypesPackage.AFFECT_CONSEQUENCE__INDEX:
				return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
			case SurvTypesPackage.AFFECT_CONSEQUENCE__SET:
				return SET_EDEFAULT == null ? set != null : !SET_EDEFAULT.equals(set);
			case SurvTypesPackage.AFFECT_CONSEQUENCE__INC:
				return INC_EDEFAULT == null ? inc != null : !INC_EDEFAULT.equals(inc);
			case SurvTypesPackage.AFFECT_CONSEQUENCE__DEC:
				return DEC_EDEFAULT == null ? dec != null : !DEC_EDEFAULT.equals(dec);
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
		result.append(" (index: ");
		result.append(index);
		result.append(", set: ");
		result.append(set);
		result.append(", inc: ");
		result.append(inc);
		result.append(", dec: ");
		result.append(dec);
		result.append(')');
		return result.toString();
	}

} //affectConsequenceImpl
