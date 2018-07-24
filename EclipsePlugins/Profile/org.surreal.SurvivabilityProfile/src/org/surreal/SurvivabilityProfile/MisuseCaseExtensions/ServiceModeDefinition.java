/**
 */
package org.surreal.SurvivabilityProfile.MisuseCaseExtensions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Mode Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.ServiceModeDefinition#getBase_Constraint <em>Base Constraint</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.ServiceModeDefinition#getFormula <em>Formula</em>}</li>
 * </ul>
 *
 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getServiceModeDefinition()
 * @model
 * @generated
 */
public interface ServiceModeDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Constraint</em>' reference.
	 * @see #setBase_Constraint(Constraint)
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getServiceModeDefinition_Base_Constraint()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Constraint getBase_Constraint();

	/**
	 * Sets the value of the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.ServiceModeDefinition#getBase_Constraint <em>Base Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Constraint</em>' reference.
	 * @see #getBase_Constraint()
	 * @generated
	 */
	void setBase_Constraint(Constraint value);

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' attribute list.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getServiceModeDefinition_Formula()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getFormula();

} // ServiceModeDefinition
