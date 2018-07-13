/**
 */
package org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.MisuseCaseExtensionsFactory;
import org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage;
import org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse;
import org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuser;
import org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.mitigates;
import org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.recognition;
import org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.recovery;
import org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.resistance;
import org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.service;
import org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.strategy;
import org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.threatens;

import org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.SurvivabilityModelExtensionsPackage;

import org.survTool.SurvivabilityProfile.profile.Survivability_profile.SurvivabilityModelExtensions.impl.SurvivabilityModelExtensionsPackageImpl;

import org.survTool.SurvivabilityProfile.profile.Survivability_profile.TypesLibrary.TypesLibraryPackage;

import org.survTool.SurvivabilityProfile.profile.Survivability_profile.TypesLibrary.impl.TypesLibraryPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MisuseCaseExtensionsPackageImpl extends EPackageImpl implements MisuseCaseExtensionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recoveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass misuseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatensEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mitigatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass misuserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resistanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recognitionEClass = null;

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
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MisuseCaseExtensionsPackageImpl() {
		super(eNS_URI, MisuseCaseExtensionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MisuseCaseExtensionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MisuseCaseExtensionsPackage init() {
		if (isInited) return (MisuseCaseExtensionsPackage)EPackage.Registry.INSTANCE.getEPackage(MisuseCaseExtensionsPackage.eNS_URI);

		// Obtain or create and register package
		MisuseCaseExtensionsPackageImpl theMisuseCaseExtensionsPackage = (MisuseCaseExtensionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MisuseCaseExtensionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MisuseCaseExtensionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TypesLibraryPackageImpl theTypesLibraryPackage = (TypesLibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesLibraryPackage.eNS_URI) instanceof TypesLibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesLibraryPackage.eNS_URI) : TypesLibraryPackage.eINSTANCE);
		SurvivabilityModelExtensionsPackageImpl theSurvivabilityModelExtensionsPackage = (SurvivabilityModelExtensionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SurvivabilityModelExtensionsPackage.eNS_URI) instanceof SurvivabilityModelExtensionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SurvivabilityModelExtensionsPackage.eNS_URI) : SurvivabilityModelExtensionsPackage.eINSTANCE);

		// Create package meta-data objects
		theMisuseCaseExtensionsPackage.createPackageContents();
		theTypesLibraryPackage.createPackageContents();
		theSurvivabilityModelExtensionsPackage.createPackageContents();

		// Initialize created meta-data
		theMisuseCaseExtensionsPackage.initializePackageContents();
		theTypesLibraryPackage.initializePackageContents();
		theSurvivabilityModelExtensionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMisuseCaseExtensionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MisuseCaseExtensionsPackage.eNS_URI, theMisuseCaseExtensionsPackage);
		return theMisuseCaseExtensionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getrecovery() {
		return recoveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getrecovery_Affects() {
		return (EReference)recoveryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getrecovery_MTTR() {
		return (EReference)recoveryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getstrategy() {
		return strategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getstrategy_SuccessProb() {
		return (EAttribute)strategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getstrategy_Base_UseCase() {
		return (EReference)strategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmisuse() {
		return misuseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmisuse_Base_UseCase() {
		return (EReference)misuseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmisuse_Affects() {
		return (EReference)misuseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getmisuse_SuccessProb() {
		return (EAttribute)misuseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmisuse_AttackDelay() {
		return (EReference)misuseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getservice() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getservice_Indices() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getservice_Base_UseCase() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getthreatens() {
		return threatensEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getthreatens_Base_Dependency() {
		return (EReference)threatensEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmitigates() {
		return mitigatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmitigates_Base_Dependency() {
		return (EReference)mitigatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmisuser() {
		return misuserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmisuser_Base_Actor() {
		return (EReference)misuserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getresistance() {
		return resistanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getrecognition() {
		return recognitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MisuseCaseExtensionsFactory getMisuseCaseExtensionsFactory() {
		return (MisuseCaseExtensionsFactory)getEFactoryInstance();
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
		recoveryEClass = createEClass(RECOVERY);
		createEReference(recoveryEClass, RECOVERY__AFFECTS);
		createEReference(recoveryEClass, RECOVERY__MTTR);

		strategyEClass = createEClass(STRATEGY);
		createEAttribute(strategyEClass, STRATEGY__SUCCESS_PROB);
		createEReference(strategyEClass, STRATEGY__BASE_USE_CASE);

		misuseEClass = createEClass(MISUSE);
		createEReference(misuseEClass, MISUSE__BASE_USE_CASE);
		createEReference(misuseEClass, MISUSE__AFFECTS);
		createEAttribute(misuseEClass, MISUSE__SUCCESS_PROB);
		createEReference(misuseEClass, MISUSE__ATTACK_DELAY);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__INDICES);
		createEReference(serviceEClass, SERVICE__BASE_USE_CASE);

		threatensEClass = createEClass(THREATENS);
		createEReference(threatensEClass, THREATENS__BASE_DEPENDENCY);

		mitigatesEClass = createEClass(MITIGATES);
		createEReference(mitigatesEClass, MITIGATES__BASE_DEPENDENCY);

		misuserEClass = createEClass(MISUSER);
		createEReference(misuserEClass, MISUSER__BASE_ACTOR);

		resistanceEClass = createEClass(RESISTANCE);

		recognitionEClass = createEClass(RECOGNITION);
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
		TypesLibraryPackage theTypesLibraryPackage = (TypesLibraryPackage)EPackage.Registry.INSTANCE.getEPackage(TypesLibraryPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		recoveryEClass.getESuperTypes().add(this.getstrategy());
		resistanceEClass.getESuperTypes().add(this.getstrategy());
		recognitionEClass.getESuperTypes().add(this.getstrategy());

		// Initialize classes, features, and operations; add parameters
		initEClass(recoveryEClass, recovery.class, "recovery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getrecovery_Affects(), theTypesLibraryPackage.getaffectConsequence(), null, "affects", null, 0, -1, recovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getrecovery_MTTR(), theTypesLibraryPackage.getduration(), null, "MTTR", null, 0, 1, recovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(strategyEClass, strategy.class, "strategy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getstrategy_SuccessProb(), theTypesPackage.getReal(), "successProb", null, 0, 1, strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getstrategy_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 1, 1, strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(misuseEClass, misuse.class, "misuse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmisuse_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 1, 1, misuse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getmisuse_Affects(), theTypesLibraryPackage.getaffectConsequence(), null, "affects", null, 0, -1, misuse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getmisuse_SuccessProb(), theTypesPackage.getReal(), "successProb", null, 0, 1, misuse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getmisuse_AttackDelay(), theTypesLibraryPackage.getduration(), null, "attackDelay", null, 0, 1, misuse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceEClass, service.class, "service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getservice_Indices(), theTypesLibraryPackage.getindex(), null, "indices", null, 0, -1, service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getservice_Base_UseCase(), theUMLPackage.getUseCase(), null, "base_UseCase", null, 1, 1, service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(threatensEClass, threatens.class, "threatens", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getthreatens_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, threatens.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mitigatesEClass, mitigates.class, "mitigates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmitigates_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, mitigates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(misuserEClass, misuser.class, "misuser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmisuser_Base_Actor(), theUMLPackage.getActor(), null, "base_Actor", null, 1, 1, misuser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(resistanceEClass, resistance.class, "resistance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recognitionEClass, recognition.class, "recognition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
			 "originalName", "MisuseCase Extensions"
		   });
	}

} //MisuseCaseExtensionsPackageImpl
