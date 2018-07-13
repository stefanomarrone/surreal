/**
 */
package org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.UseCase;

import org.survTool.SurvivabilityProfile.profile.Survivability_profile.TypesLibrary.affectConsequence;
import org.survTool.SurvivabilityProfile.profile.Survivability_profile.TypesLibrary.duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>misuse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse#getAffects <em>Affects</em>}</li>
 *   <li>{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse#getSuccessProb <em>Success Prob</em>}</li>
 *   <li>{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse#getAttackDelay <em>Attack Delay</em>}</li>
 * </ul>
 *
 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getmisuse()
 * @model
 * @generated
 */
public interface misuse extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Use Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(UseCase)
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getmisuse_Base_UseCase()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Affects</b></em>' containment reference list.
	 * The list contents are of type {@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.TypesLibrary.affectConsequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affects</em>' containment reference list.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getmisuse_Affects()
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
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getmisuse_SuccessProb()
	 * @model dataType="org.eclipse.uml2.types.Real" ordered="false"
	 * @generated
	 */
	double getSuccessProb();

	/**
	 * Sets the value of the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse#getSuccessProb <em>Success Prob</em>}' attribute.
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
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getmisuse_AttackDelay()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	duration getAttackDelay();

	/**
	 * Sets the value of the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse#getAttackDelay <em>Attack Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attack Delay</em>' containment reference.
	 * @see #getAttackDelay()
	 * @generated
	 */
	void setAttackDelay(duration value);

} // misuse
