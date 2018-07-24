/**
 */
package org.surreal.SurvivabilityProfile.SurvTypes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.surreal.SurvivabilityProfile.SurvTypes.index#getName <em>Name</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.SurvTypes.index#getKind <em>Kind</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.SurvTypes.index#getValues <em>Values</em>}</li>
 *   <li>{@link org.surreal.SurvivabilityProfile.SurvTypes.index#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @see org.surreal.SurvivabilityProfile.SurvTypes.SurvTypesPackage#getindex()
 * @model
 * @generated
 */
public interface index extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.SurvTypesPackage#getindex_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.surreal.SurvivabilityProfile.SurvTypes.index#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.surreal.SurvivabilityProfile.SurvTypes.indexKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.indexKind
	 * @see #setKind(indexKind)
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.SurvTypesPackage#getindex_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	indexKind getKind();

	/**
	 * Sets the value of the '{@link org.surreal.SurvivabilityProfile.SurvTypes.index#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.indexKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(indexKind value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute.
	 * @see #setValues(String)
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.SurvTypesPackage#getindex_Values()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getValues();

	/**
	 * Sets the value of the '{@link org.surreal.SurvivabilityProfile.SurvTypes.index#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(String value);

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' attribute.
	 * @see #setInitial(String)
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.SurvTypesPackage#getindex_Initial()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getInitial();

	/**
	 * Sets the value of the '{@link org.surreal.SurvivabilityProfile.SurvTypes.index#getInitial <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' attribute.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(String value);

} // index
