/**
 */
package org.surreal.SurvivabilityProfile.SAMExtensions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.MisuseCaseExtensionsPackage;

import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl;

import org.surreal.SurvivabilityProfile.SAMExtensions.MSactivation;
import org.surreal.SurvivabilityProfile.SAMExtensions.SAMExtensionsFactory;
import org.surreal.SurvivabilityProfile.SAMExtensions.SAMExtensionsPackage;
import org.surreal.SurvivabilityProfile.SAMExtensions.mode;
import org.surreal.SurvivabilityProfile.SAMExtensions.scenario;

import org.surreal.SurvivabilityProfile.SurvTypes.SurvTypesPackage;

import org.surreal.SurvivabilityProfile.SurvTypes.impl.SurvTypesPackageImpl;

import org.surreal.SurvivabilityProfile.Survivability.SurvivabilityPackage;

import org.surreal.SurvivabilityProfile.Survivability.impl.SurvivabilityPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SAMExtensionsPackageImpl extends EPackageImpl implements SAMExtensionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mSactivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.surreal.SurvivabilityProfile.SAMExtensions.SAMExtensionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SAMExtensionsPackageImpl() {
		super(eNS_URI, SAMExtensionsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SAMExtensionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SAMExtensionsPackage init() {
		if (isInited) return (SAMExtensionsPackage)EPackage.Registry.INSTANCE.getEPackage(SAMExtensionsPackage.eNS_URI);

		// Obtain or create and register package
		SAMExtensionsPackageImpl theSAMExtensionsPackage = (SAMExtensionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SAMExtensionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SAMExtensionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SurvivabilityPackageImpl theSurvivabilityPackage = (SurvivabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SurvivabilityPackage.eNS_URI) instanceof SurvivabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SurvivabilityPackage.eNS_URI) : SurvivabilityPackage.eINSTANCE);
		MisuseCaseExtensionsPackageImpl theMisuseCaseExtensionsPackage = (MisuseCaseExtensionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MisuseCaseExtensionsPackage.eNS_URI) instanceof MisuseCaseExtensionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MisuseCaseExtensionsPackage.eNS_URI) : MisuseCaseExtensionsPackage.eINSTANCE);
		SurvTypesPackageImpl theSurvTypesPackage = (SurvTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SurvTypesPackage.eNS_URI) instanceof SurvTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SurvTypesPackage.eNS_URI) : SurvTypesPackage.eINSTANCE);

		// Create package meta-data objects
		theSAMExtensionsPackage.createPackageContents();
		theSurvivabilityPackage.createPackageContents();
		theMisuseCaseExtensionsPackage.createPackageContents();
		theSurvTypesPackage.createPackageContents();

		// Initialize created meta-data
		theSAMExtensionsPackage.initializePackageContents();
		theSurvivabilityPackage.initializePackageContents();
		theMisuseCaseExtensionsPackage.initializePackageContents();
		theSurvTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSAMExtensionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SAMExtensionsPackage.eNS_URI, theSAMExtensionsPackage);
		return theSAMExtensionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getscenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscenario_Base_Transition() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getscenario_Path() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSactivation() {
		return mSactivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSactivation_Service() {
		return (EReference)mSactivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMSactivation_Value() {
		return (EAttribute)mSactivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMSactivation_Step() {
		return (EAttribute)mSactivationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmode() {
		return modeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmode_Base_State() {
		return (EReference)modeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getmode_Severity() {
		return (EAttribute)modeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAMExtensionsFactory getSAMExtensionsFactory() {
		return (SAMExtensionsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__BASE_TRANSITION);
		createEReference(scenarioEClass, SCENARIO__PATH);

		mSactivationEClass = createEClass(MSACTIVATION);
		createEReference(mSactivationEClass, MSACTIVATION__SERVICE);
		createEAttribute(mSactivationEClass, MSACTIVATION__VALUE);
		createEAttribute(mSactivationEClass, MSACTIVATION__STEP);

		modeEClass = createEClass(MODE);
		createEReference(modeEClass, MODE__BASE_STATE);
		createEAttribute(modeEClass, MODE__SEVERITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		MisuseCaseExtensionsPackage theMisuseCaseExtensionsPackage = (MisuseCaseExtensionsPackage)EPackage.Registry.INSTANCE.getEPackage(MisuseCaseExtensionsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(scenarioEClass, scenario.class, "scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getscenario_Base_Transition(), theUMLPackage.getTransition(), null, "base_Transition", null, 1, 1, scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getscenario_Path(), this.getMSactivation(), null, "path", null, 0, -1, scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mSactivationEClass, MSactivation.class, "MSactivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSactivation_Service(), theMisuseCaseExtensionsPackage.getserviceMS(), null, "service", null, 0, 1, MSactivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMSactivation_Value(), theTypesPackage.getString(), "value", null, 0, 1, MSactivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMSactivation_Step(), theTypesPackage.getInteger(), "step", null, 0, 1, MSactivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modeEClass, mode.class, "mode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmode_Base_State(), theUMLPackage.getState(), null, "base_State", null, 1, 1, mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getmode_Severity(), theTypesPackage.getInteger(), "severity", null, 0, 1, mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //SAMExtensionsPackageImpl
