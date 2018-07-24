/**
 */
package org.surreal.SurvivabilityProfile.SAMExtensions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.surreal.SurvivabilityProfile.SAMExtensions.SAMExtensionsFactory
 * @model kind="package"
 * @generated
 */
public interface SAMExtensionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SAMExtensions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.surreal.SurvivabilityProfile/profiles/SAMExtensions/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SAMExtensions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SAMExtensionsPackage eINSTANCE = org.surreal.SurvivabilityProfile.SAMExtensions.impl.SAMExtensionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.surreal.SurvivabilityProfile.SAMExtensions.impl.scenarioImpl <em>scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.surreal.SurvivabilityProfile.SAMExtensions.impl.scenarioImpl
	 * @see org.surreal.SurvivabilityProfile.SAMExtensions.impl.SAMExtensionsPackageImpl#getscenario()
	 * @generated
	 */
	int SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PATH = 0;

	/**
	 * The feature id for the '<em><b>Base Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__BASE_TRANSITION = 1;

	/**
	 * The number of structural features of the '<em>scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.surreal.SurvivabilityProfile.SAMExtensions.impl.modeImpl <em>mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.surreal.SurvivabilityProfile.SAMExtensions.impl.modeImpl
	 * @see org.surreal.SurvivabilityProfile.SAMExtensions.impl.SAMExtensionsPackageImpl#getmode()
	 * @generated
	 */
	int MODE = 1;

	/**
	 * The feature id for the '<em><b>Base State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__BASE_STATE = 0;

	/**
	 * The number of structural features of the '<em>mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.surreal.SurvivabilityProfile.SAMExtensions.scenario <em>scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>scenario</em>'.
	 * @see org.surreal.SurvivabilityProfile.SAMExtensions.scenario
	 * @generated
	 */
	EClass getscenario();

	/**
	 * Returns the meta object for the reference list '{@link org.surreal.SurvivabilityProfile.SAMExtensions.scenario#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.surreal.SurvivabilityProfile.SAMExtensions.scenario#getPath()
	 * @see #getscenario()
	 * @generated
	 */
	EReference getscenario_Path();

	/**
	 * Returns the meta object for the reference '{@link org.surreal.SurvivabilityProfile.SAMExtensions.scenario#getBase_Transition <em>Base Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Transition</em>'.
	 * @see org.surreal.SurvivabilityProfile.SAMExtensions.scenario#getBase_Transition()
	 * @see #getscenario()
	 * @generated
	 */
	EReference getscenario_Base_Transition();

	/**
	 * Returns the meta object for class '{@link org.surreal.SurvivabilityProfile.SAMExtensions.mode <em>mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>mode</em>'.
	 * @see org.surreal.SurvivabilityProfile.SAMExtensions.mode
	 * @generated
	 */
	EClass getmode();

	/**
	 * Returns the meta object for the reference '{@link org.surreal.SurvivabilityProfile.SAMExtensions.mode#getBase_State <em>Base State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base State</em>'.
	 * @see org.surreal.SurvivabilityProfile.SAMExtensions.mode#getBase_State()
	 * @see #getmode()
	 * @generated
	 */
	EReference getmode_Base_State();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SAMExtensionsFactory getSAMExtensionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.surreal.SurvivabilityProfile.SAMExtensions.impl.scenarioImpl <em>scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.surreal.SurvivabilityProfile.SAMExtensions.impl.scenarioImpl
		 * @see org.surreal.SurvivabilityProfile.SAMExtensions.impl.SAMExtensionsPackageImpl#getscenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getscenario();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__PATH = eINSTANCE.getscenario_Path();

		/**
		 * The meta object literal for the '<em><b>Base Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__BASE_TRANSITION = eINSTANCE.getscenario_Base_Transition();

		/**
		 * The meta object literal for the '{@link org.surreal.SurvivabilityProfile.SAMExtensions.impl.modeImpl <em>mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.surreal.SurvivabilityProfile.SAMExtensions.impl.modeImpl
		 * @see org.surreal.SurvivabilityProfile.SAMExtensions.impl.SAMExtensionsPackageImpl#getmode()
		 * @generated
		 */
		EClass MODE = eINSTANCE.getmode();

		/**
		 * The meta object literal for the '<em><b>Base State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__BASE_STATE = eINSTANCE.getmode_Base_State();

	}

} //SAMExtensionsPackage
