/**
 */
package org.surreal.SurvivabilityProfile.SAMExtensions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.surreal.SurvivabilityProfile.SAMExtensions.SAMExtensionsPackage
 * @generated
 */
public interface SAMExtensionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SAMExtensionsFactory eINSTANCE = org.surreal.SurvivabilityProfile.SAMExtensions.impl.SAMExtensionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>scenario</em>'.
	 * @generated
	 */
	scenario createscenario();

	/**
	 * Returns a new object of class '<em>MSactivation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MSactivation</em>'.
	 * @generated
	 */
	MSactivation createMSactivation();

	/**
	 * Returns a new object of class '<em>mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>mode</em>'.
	 * @generated
	 */
	mode createmode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SAMExtensionsPackage getSAMExtensionsPackage();

} //SAMExtensionsFactory
