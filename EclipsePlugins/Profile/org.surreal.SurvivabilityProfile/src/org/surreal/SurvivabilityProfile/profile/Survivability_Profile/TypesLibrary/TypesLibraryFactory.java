/**
 */
package org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.TypesLibraryPackage
 * @generated
 */
public interface TypesLibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesLibraryFactory eINSTANCE = org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.impl.TypesLibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>affect Consequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>affect Consequence</em>'.
	 * @generated
	 */
	affectConsequence createaffectConsequence();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypesLibraryPackage getTypesLibraryPackage();

} //TypesLibraryFactory
