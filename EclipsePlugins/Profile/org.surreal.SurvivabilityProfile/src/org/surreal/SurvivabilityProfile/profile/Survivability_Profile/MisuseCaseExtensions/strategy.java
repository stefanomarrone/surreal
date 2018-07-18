/**
 */
package org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.strategy#getSuccessProb <em>Success Prob</em>}</li>
 * </ul>
 *
 * @see org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getstrategy()
 * @model abstract="true"
 * @generated
 */
public interface strategy extends serviceMS {
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
	 * @see org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#getstrategy_SuccessProb()
	 * @model dataType="org.eclipse.uml2.types.Real" ordered="false"
	 * @generated
	 */
	double getSuccessProb();

	/**
	 * Sets the value of the '{@link org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.strategy#getSuccessProb <em>Success Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Prob</em>' attribute.
	 * @see #getSuccessProb()
	 * @generated
	 */
	void setSuccessProb(double value);

} // strategy
