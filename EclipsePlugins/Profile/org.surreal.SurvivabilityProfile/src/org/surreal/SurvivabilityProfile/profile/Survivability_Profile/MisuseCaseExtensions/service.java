/**
 */
package org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.UseCase;

import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.index;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.service#getIndices <em>Indices</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.service#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @see org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getservice()
 * @model
 * @generated
 */
public interface service extends EObject {
	/**
	 * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
	 * The list contents are of type {@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.index}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indices</em>' containment reference list.
	 * @see org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getservice_Indices()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<index> getIndices();

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
	 * @see org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getservice_Base_UseCase()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.service#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

} // service
