/**
 */
package org.surreal.SurvivabilityProfile.SurvTypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.surreal.SurvivabilityProfile.SurvTypes.SurvTypesFactory
 * @model kind="package"
 * @generated
 */
public interface SurvTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SurvTypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.surreal.SurvivabilityProfile/profiles/SurvTypes/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SurvTypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SurvTypesPackage eINSTANCE = org.surreal.SurvivabilityProfile.SurvTypes.impl.SurvTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.surreal.SurvivabilityProfile.SurvTypes.impl.indexImpl <em>index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.impl.indexImpl
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.impl.SurvTypesPackageImpl#getindex()
	 * @generated
	 */
	int INDEX = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__KIND = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__VALUES = 2;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__INITIAL = 3;

	/**
	 * The number of structural features of the '<em>index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.surreal.SurvivabilityProfile.SurvTypes.impl.durationImpl <em>duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.impl.durationImpl
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.impl.SurvTypesPackageImpl#getduration()
	 * @generated
	 */
	int DURATION = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__UNIT = 1;

	/**
	 * The number of structural features of the '<em>duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.surreal.SurvivabilityProfile.SurvTypes.impl.affectConsequenceImpl <em>affect Consequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.impl.affectConsequenceImpl
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.impl.SurvTypesPackageImpl#getaffectConsequence()
	 * @generated
	 */
	int AFFECT_CONSEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_CONSEQUENCE__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_CONSEQUENCE__SET = 1;

	/**
	 * The feature id for the '<em><b>Inc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_CONSEQUENCE__INC = 2;

	/**
	 * The feature id for the '<em><b>Dec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_CONSEQUENCE__DEC = 3;

	/**
	 * The number of structural features of the '<em>affect Consequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_CONSEQUENCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>affect Consequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_CONSEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.surreal.SurvivabilityProfile.SurvTypes.indexKind <em>index Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.indexKind
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.impl.SurvTypesPackageImpl#getindexKind()
	 * @generated
	 */
	int INDEX_KIND = 3;


	/**
	 * Returns the meta object for class '{@link org.surreal.SurvivabilityProfile.SurvTypes.index <em>index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>index</em>'.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.index
	 * @generated
	 */
	EClass getindex();

	/**
	 * Returns the meta object for the attribute '{@link org.surreal.SurvivabilityProfile.SurvTypes.index#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.index#getName()
	 * @see #getindex()
	 * @generated
	 */
	EAttribute getindex_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.surreal.SurvivabilityProfile.SurvTypes.index#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.index#getKind()
	 * @see #getindex()
	 * @generated
	 */
	EAttribute getindex_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.surreal.SurvivabilityProfile.SurvTypes.index#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.index#getValues()
	 * @see #getindex()
	 * @generated
	 */
	EAttribute getindex_Values();

	/**
	 * Returns the meta object for the attribute '{@link org.surreal.SurvivabilityProfile.SurvTypes.index#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.index#getInitial()
	 * @see #getindex()
	 * @generated
	 */
	EAttribute getindex_Initial();

	/**
	 * Returns the meta object for class '{@link org.surreal.SurvivabilityProfile.SurvTypes.duration <em>duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>duration</em>'.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.duration
	 * @generated
	 */
	EClass getduration();

	/**
	 * Returns the meta object for the attribute '{@link org.surreal.SurvivabilityProfile.SurvTypes.duration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.duration#getValue()
	 * @see #getduration()
	 * @generated
	 */
	EAttribute getduration_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.surreal.SurvivabilityProfile.SurvTypes.duration#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.duration#getUnit()
	 * @see #getduration()
	 * @generated
	 */
	EAttribute getduration_Unit();

	/**
	 * Returns the meta object for class '{@link org.surreal.SurvivabilityProfile.SurvTypes.affectConsequence <em>affect Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>affect Consequence</em>'.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.affectConsequence
	 * @generated
	 */
	EClass getaffectConsequence();

	/**
	 * Returns the meta object for the attribute '{@link org.surreal.SurvivabilityProfile.SurvTypes.affectConsequence#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.affectConsequence#getIndex()
	 * @see #getaffectConsequence()
	 * @generated
	 */
	EAttribute getaffectConsequence_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.surreal.SurvivabilityProfile.SurvTypes.affectConsequence#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set</em>'.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.affectConsequence#getSet()
	 * @see #getaffectConsequence()
	 * @generated
	 */
	EAttribute getaffectConsequence_Set();

	/**
	 * Returns the meta object for the attribute '{@link org.surreal.SurvivabilityProfile.SurvTypes.affectConsequence#getInc <em>Inc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inc</em>'.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.affectConsequence#getInc()
	 * @see #getaffectConsequence()
	 * @generated
	 */
	EAttribute getaffectConsequence_Inc();

	/**
	 * Returns the meta object for the attribute '{@link org.surreal.SurvivabilityProfile.SurvTypes.affectConsequence#getDec <em>Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dec</em>'.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.affectConsequence#getDec()
	 * @see #getaffectConsequence()
	 * @generated
	 */
	EAttribute getaffectConsequence_Dec();

	/**
	 * Returns the meta object for enum '{@link org.surreal.SurvivabilityProfile.SurvTypes.indexKind <em>index Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>index Kind</em>'.
	 * @see org.surreal.SurvivabilityProfile.SurvTypes.indexKind
	 * @generated
	 */
	EEnum getindexKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SurvTypesFactory getSurvTypesFactory();

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
		 * The meta object literal for the '{@link org.surreal.SurvivabilityProfile.SurvTypes.impl.indexImpl <em>index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.surreal.SurvivabilityProfile.SurvTypes.impl.indexImpl
		 * @see org.surreal.SurvivabilityProfile.SurvTypes.impl.SurvTypesPackageImpl#getindex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getindex();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__NAME = eINSTANCE.getindex_Name();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__KIND = eINSTANCE.getindex_Kind();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__VALUES = eINSTANCE.getindex_Values();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__INITIAL = eINSTANCE.getindex_Initial();

		/**
		 * The meta object literal for the '{@link org.surreal.SurvivabilityProfile.SurvTypes.impl.durationImpl <em>duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.surreal.SurvivabilityProfile.SurvTypes.impl.durationImpl
		 * @see org.surreal.SurvivabilityProfile.SurvTypes.impl.SurvTypesPackageImpl#getduration()
		 * @generated
		 */
		EClass DURATION = eINSTANCE.getduration();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__VALUE = eINSTANCE.getduration_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__UNIT = eINSTANCE.getduration_Unit();

		/**
		 * The meta object literal for the '{@link org.surreal.SurvivabilityProfile.SurvTypes.impl.affectConsequenceImpl <em>affect Consequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.surreal.SurvivabilityProfile.SurvTypes.impl.affectConsequenceImpl
		 * @see org.surreal.SurvivabilityProfile.SurvTypes.impl.SurvTypesPackageImpl#getaffectConsequence()
		 * @generated
		 */
		EClass AFFECT_CONSEQUENCE = eINSTANCE.getaffectConsequence();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECT_CONSEQUENCE__INDEX = eINSTANCE.getaffectConsequence_Index();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECT_CONSEQUENCE__SET = eINSTANCE.getaffectConsequence_Set();

		/**
		 * The meta object literal for the '<em><b>Inc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECT_CONSEQUENCE__INC = eINSTANCE.getaffectConsequence_Inc();

		/**
		 * The meta object literal for the '<em><b>Dec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECT_CONSEQUENCE__DEC = eINSTANCE.getaffectConsequence_Dec();

		/**
		 * The meta object literal for the '{@link org.surreal.SurvivabilityProfile.SurvTypes.indexKind <em>index Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.surreal.SurvivabilityProfile.SurvTypes.indexKind
		 * @see org.surreal.SurvivabilityProfile.SurvTypes.impl.SurvTypesPackageImpl#getindexKind()
		 * @generated
		 */
		EEnum INDEX_KIND = eINSTANCE.getindexKind();

	}

} //SurvTypesPackage
