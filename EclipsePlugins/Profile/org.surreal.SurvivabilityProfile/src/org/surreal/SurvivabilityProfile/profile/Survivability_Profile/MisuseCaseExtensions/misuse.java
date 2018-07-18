/**
 */
package org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions;

import org.eclipse.emf.common.util.EList;

import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.affectConsequence;
import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>misuse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.misuse#getAffects <em>Affects</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.misuse#getSuccessProb <em>Success Prob</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.misuse#getAttackDelay <em>Attack Delay</em>}</li>
 * </ul>
 *
 * @see org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getmisuse()
 * @model
 * @generated
 */
public interface misuse extends serviceMS {
	/**
	 * Returns the value of the '<em><b>Affects</b></em>' containment reference list.
	 * The list contents are of type {@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.affectConsequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affects</em>' containment reference list.
	 * @see org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getmisuse_Affects()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<affectConsequence> getAffects();

	/**
	 * Returns the value of the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success Prob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Prob</em>' attribute.
	 * @see #setSuccessProb(double)
	 * @see org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getmisuse_SuccessProb()
	 * @model dataType="org.eclipse.uml2.types.Real" ordered="false"
	 * @generated
	 */
	double getSuccessProb();

	/**
	 * Sets the value of the '{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.misuse#getSuccessProb <em>Success Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Prob</em>' attribute.
	 * @see #getSuccessProb()
	 * @generated
	 */
	void setSuccessProb(double value);

	/**
	 * Returns the value of the '<em><b>Attack Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attack Delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack Delay</em>' containment reference.
	 * @see #setAttackDelay(duration)
	 * @see org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getmisuse_AttackDelay()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	duration getAttackDelay();

	/**
	 * Sets the value of the '{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.misuse#getAttackDelay <em>Attack Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attack Delay</em>' containment reference.
	 * @see #getAttackDelay()
	 * @generated
	 */
	void setAttackDelay(duration value);

} // misuse
