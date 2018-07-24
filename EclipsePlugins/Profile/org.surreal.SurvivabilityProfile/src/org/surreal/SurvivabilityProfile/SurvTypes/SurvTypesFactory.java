/**
 */
package org.surreal.SurvivabilityProfile.SurvTypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.surreal.SurvivabilityProfile.SurvTypes.SurvTypesPackage
 * @generated
 */
public interface SurvTypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SurvTypesFactory eINSTANCE = org.surreal.SurvivabilityProfile.SurvTypes.impl.SurvTypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>index</em>'.
	 * @generated
	 */
	index createindex();

	/**
	 * Returns a new object of class '<em>duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>duration</em>'.
	 * @generated
	 */
	duration createduration();

	/**
	 * Returns a new object of class '<em>affect Consequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>affect Consequence</em>'.
	 * @generated
	 */
	affectConsequence createaffectConsequence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SurvTypesPackage getSurvTypesPackage();

} //SurvTypesFactory
