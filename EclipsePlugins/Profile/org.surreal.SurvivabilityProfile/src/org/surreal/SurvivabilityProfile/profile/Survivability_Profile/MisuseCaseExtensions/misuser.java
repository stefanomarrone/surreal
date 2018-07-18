/**
 */
package org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Actor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>misuser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.misuser#getBase_Actor <em>Base Actor</em>}</li>
 * </ul>
 *
 * @see org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getmisuser()
 * @model
 * @generated
 */
public interface misuser extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Actor</em>' reference.
	 * @see #setBase_Actor(Actor)
	 * @see org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getmisuser_Base_Actor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Actor getBase_Actor();

	/**
	 * Sets the value of the '{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.misuser#getBase_Actor <em>Base Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Actor</em>' reference.
	 * @see #getBase_Actor()
	 * @generated
	 */
	void setBase_Actor(Actor value);

} // misuser
