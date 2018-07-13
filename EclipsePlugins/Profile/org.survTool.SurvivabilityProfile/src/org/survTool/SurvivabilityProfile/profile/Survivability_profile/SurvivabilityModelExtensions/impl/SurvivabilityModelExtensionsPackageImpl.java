/**
 */
package org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage;

import org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl;

import org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.SurvivabilityModelExtensionsFactory;
import org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.SurvivabilityModelExtensionsPackage;
import org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.mode;
import org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.scenario;

import org.survTool.SurvivabilityProfile.profile.Survivability_profile.TypesLibrary.TypesLibraryPackage;

import org.survTool.SurvivabilityProfile.profile.Survivability_profile.TypesLibrary.impl.TypesLibraryPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SurvivabilityModelExtensionsPackageImpl extends EPackageImpl implements SurvivabilityModelExtensionsPackage {
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
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.SurvivabilityModelExtensionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SurvivabilityModelExtensionsPackageImpl() {
		super(eNS_URI, SurvivabilityModelExtensionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SurvivabilityModelExtensionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SurvivabilityModelExtensionsPackage init() {
		if (isInited) return (SurvivabilityModelExtensionsPackage)EPackage.Registry.INSTANCE.getEPackage(SurvivabilityModelExtensionsPackage.eNS_URI);

		// Obtain or create and register package
		SurvivabilityModelExtensionsPackageImpl theSurvivabilityModelExtensionsPackage = (SurvivabilityModelExtensionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SurvivabilityModelExtensionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SurvivabilityModelExtensionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TypesLibraryPackageImpl theTypesLibraryPackage = (TypesLibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesLibraryPackage.eNS_URI) instanceof TypesLibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesLibraryPackage.eNS_URI) : TypesLibraryPackage.eINSTANCE);
		MisuseCaseExtensionsPackageImpl theMisuseCaseExtensionsPackage = (MisuseCaseExtensionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MisuseCaseExtensionsPackage.eNS_URI) instanceof MisuseCaseExtensionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MisuseCaseExtensionsPackage.eNS_URI) : MisuseCaseExtensionsPackage.eINSTANCE);

		// Create package meta-data objects
		theSurvivabilityModelExtensionsPackage.createPackageContents();
		theTypesLibraryPackage.createPackageContents();
		theMisuseCaseExtensionsPackage.createPackageContents();

		// Initialize created meta-data
		theSurvivabilityModelExtensionsPackage.initializePackageContents();
		theTypesLibraryPackage.initializePackageContents();
		theMisuseCaseExtensionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSurvivabilityModelExtensionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SurvivabilityModelExtensionsPackage.eNS_URI, theSurvivabilityModelExtensionsPackage);
		return theSurvivabilityModelExtensionsPackage;
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
	public EAttribute getscenario_Sequence() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(1);
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
	public SurvivabilityModelExtensionsFactory getSurvivabilityModelExtensionsFactory() {
		return (SurvivabilityModelExtensionsFactory)getEFactoryInstance();
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
		createEAttribute(scenarioEClass, SCENARIO__SEQUENCE);

		modeEClass = createEClass(MODE);
		createEReference(modeEClass, MODE__BASE_STATE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(scenarioEClass, scenario.class, "scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getscenario_Base_Transition(), theUMLPackage.getTransition(), null, "base_Transition", null, 1, 1, scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getscenario_Sequence(), ecorePackage.getEString(), "sequence", null, 1, -1, scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modeEClass, mode.class, "mode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmode_Base_State(), theUMLPackage.getState(), null, "base_State", null, 1, 1, mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "SurvivabilityModel Extensions"
		   });
	}

} //SurvivabilityModelExtensionsPackageImpl
