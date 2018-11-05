/**
 */
package org.surreal.SurvivabilityProfile.Survivability;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.surreal.SurvivabilityProfile.Survivability.SurvivabilityFactory
 * @model kind="package"
 * @generated
 */
public interface SurvivabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Survivability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.surreal.SurvivabilityProfile/profiles/Survivability/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Survivability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SurvivabilityPackage eINSTANCE = org.surreal.SurvivabilityProfile.Survivability.impl.SurvivabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.surreal.SurvivabilityProfile.Survivability.dummy <em>dummy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.surreal.SurvivabilityProfile.Survivability.dummy
	 * @see org.surreal.SurvivabilityProfile.Survivability.impl.SurvivabilityPackageImpl#getdummy()
	 * @generated
	 */
	int DUMMY = 0;


	/**
	 * Returns the meta object for enum '{@link org.surreal.SurvivabilityProfile.Survivability.dummy <em>dummy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>dummy</em>'.
	 * @see org.surreal.SurvivabilityProfile.Survivability.dummy
	 * @generated
	 */
	EEnum getdummy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SurvivabilityFactory getSurvivabilityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.surreal.SurvivabilityProfile.Survivability.dummy <em>dummy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.surreal.SurvivabilityProfile.Survivability.dummy
		 * @see org.surreal.SurvivabilityProfile.Survivability.impl.SurvivabilityPackageImpl#getdummy()
		 * @generated
		 */
		EEnum DUMMY = eINSTANCE.getdummy();

	}

} //SurvivabilityPackage
