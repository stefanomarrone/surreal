/**
 */
package org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions;

import org.eclipse.emf.common.util.EList;

import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.affectConsequence;
import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>recovery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.recovery#getAffects <em>Affects</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.recovery#getMTTR <em>MTTR</em>}</li>
 * </ul>
 *
 * @see org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getrecovery()
 * @model
 * @generated
 */
public interface recovery extends strategy {
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
	 * @see org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getrecovery_Affects()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<affectConsequence> getAffects();

	/**
	 * Returns the value of the '<em><b>MTTR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTTR</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTTR</em>' containment reference.
	 * @see #setMTTR(duration)
	 * @see org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getrecovery_MTTR()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	duration getMTTR();

	/**
	 * Sets the value of the '{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.recovery#getMTTR <em>MTTR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MTTR</em>' containment reference.
	 * @see #getMTTR()
	 * @generated
	 */
	void setMTTR(duration value);

} // recovery
