/**
 */
package org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.scenario#getBase_Transition <em>Base Transition</em>}</li>
 *   <li>{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.scenario#getSequence <em>Sequence</em>}</li>
 * </ul>
 *
 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.SurvivabilityModelExtensionsPackage#getscenario()
 * @model
 * @generated
 */
public interface scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Transition</em>' reference.
	 * @see #setBase_Transition(Transition)
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.SurvivabilityModelExtensionsPackage#getscenario_Base_Transition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Transition getBase_Transition();

	/**
	 * Sets the value of the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.scenario#getBase_Transition <em>Base Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Transition</em>' reference.
	 * @see #getBase_Transition()
	 * @generated
	 */
	void setBase_Transition(Transition value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute list.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.SurvivabilityModelExtensionsPackage#getscenario_Sequence()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<String> getSequence();

} // scenario
