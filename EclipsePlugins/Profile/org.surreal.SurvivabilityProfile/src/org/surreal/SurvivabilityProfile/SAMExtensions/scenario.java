/**
 */
package org.surreal.SurvivabilityProfile.SAMExtensions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Transition;

import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.serviceMS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.surreal.SurvivabilityProfile.SAMExtensions.scenario#getPath <em>Path</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.SAMExtensions.scenario#getBase_Transition <em>Base Transition</em>}</li>
 * </ul>
 *
 * @see org.surreal.SurvivabilityProfile.SAMExtensions.SAMExtensionsPackage#getscenario()
 * @model
 * @generated
 */
public interface scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' reference list.
	 * The list contents are of type {@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.serviceMS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' reference list.
	 * @see org.surreal.SurvivabilityProfile.SAMExtensions.SAMExtensionsPackage#getscenario_Path()
	 * @model ordered="false"
	 * @generated
	 */
	EList<serviceMS> getPath();

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
	 * @see org.surreal.SurvivabilityProfile.SAMExtensions.SAMExtensionsPackage#getscenario_Base_Transition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Transition getBase_Transition();

	/**
	 * Sets the value of the '{@link org.surreal.SurvivabilityProfile.SAMExtensions.scenario#getBase_Transition <em>Base Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Transition</em>' reference.
	 * @see #getBase_Transition()
	 * @generated
	 */
	void setBase_Transition(Transition value);

} // scenario
