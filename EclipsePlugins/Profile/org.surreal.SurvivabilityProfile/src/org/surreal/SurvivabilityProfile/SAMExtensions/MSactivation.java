/**
 */
package org.surreal.SurvivabilityProfile.SAMExtensions;

import org.eclipse.emf.ecore.EObject;

import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.serviceMS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSactivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.surreal.SurvivabilityProfile.SAMExtensions.MSactivation#getService <em>Service</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.SAMExtensions.MSactivation#getValue <em>Value</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.SAMExtensions.MSactivation#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see org.surreal.SurvivabilityProfile.SAMExtensions.SAMExtensionsPackage#getMSactivation()
 * @model
 * @generated
 */
public interface MSactivation extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(serviceMS)
	 * @see org.surreal.SurvivabilityProfile.SAMExtensions.SAMExtensionsPackage#getMSactivation_Service()
	 * @model ordered="false"
	 * @generated
	 */
	serviceMS getService();

	/**
	 * Sets the value of the '{@link org.surreal.SurvivabilityProfile.SAMExtensions.MSactivation#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(serviceMS value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.surreal.SurvivabilityProfile.SAMExtensions.SAMExtensionsPackage#getMSactivation_Value()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.surreal.SurvivabilityProfile.SAMExtensions.MSactivation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(int)
	 * @see org.surreal.SurvivabilityProfile.SAMExtensions.SAMExtensionsPackage#getMSactivation_Step()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getStep();

	/**
	 * Sets the value of the '{@link org.surreal.SurvivabilityProfile.SAMExtensions.MSactivation#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(int value);

} // MSactivation
