/**
 */
package org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions;

import org.eclipse.emf.ecore.EAttribute;
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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.SurvivabilityModelExtensionsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SurvivabilityModel Extensions'"
 * @generated
 */
public interface SurvivabilityModelExtensionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SurvivabilityModelExtensions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Survivability_profile/SurvivabilityModelExtensions.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Survivability_profile.SurvivabilityModelExtensions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SurvivabilityModelExtensionsPackage eINSTANCE = org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.impl.SurvivabilityModelExtensionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.impl.scenarioImpl <em>scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.impl.scenarioImpl
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.impl.SurvivabilityModelExtensionsPackageImpl#getscenario()
	 * @generated
	 */
	int SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Base Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__BASE_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SEQUENCE = 1;

	/**
	 * The number of structural features of the '<em>scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.impl.modeImpl <em>mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.impl.modeImpl
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.impl.SurvivabilityModelExtensionsPackageImpl#getmode()
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
	 * The number of operations of the '<em>mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.scenario <em>scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>scenario</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.scenario
	 * @generated
	 */
	EClass getscenario();

	/**
	 * Returns the meta object for the reference '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.scenario#getBase_Transition <em>Base Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Transition</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.scenario#getBase_Transition()
	 * @see #getscenario()
	 * @generated
	 */
	EReference getscenario_Base_Transition();

	/**
	 * Returns the meta object for the attribute list '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.scenario#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sequence</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.scenario#getSequence()
	 * @see #getscenario()
	 * @generated
	 */
	EAttribute getscenario_Sequence();

	/**
	 * Returns the meta object for class '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.mode <em>mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>mode</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.mode
	 * @generated
	 */
	EClass getmode();

	/**
	 * Returns the meta object for the reference '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.mode#getBase_State <em>Base State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base State</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.mode#getBase_State()
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
	SurvivabilityModelExtensionsFactory getSurvivabilityModelExtensionsFactory();

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
		 * The meta object literal for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.impl.scenarioImpl <em>scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.impl.scenarioImpl
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.impl.SurvivabilityModelExtensionsPackageImpl#getscenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getscenario();

		/**
		 * The meta object literal for the '<em><b>Base Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__BASE_TRANSITION = eINSTANCE.getscenario_Base_Transition();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__SEQUENCE = eINSTANCE.getscenario_Sequence();

		/**
		 * The meta object literal for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.impl.modeImpl <em>mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.impl.modeImpl
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.impl.SurvivabilityModelExtensionsPackageImpl#getmode()
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

} //SurvivabilityModelExtensionsPackage
