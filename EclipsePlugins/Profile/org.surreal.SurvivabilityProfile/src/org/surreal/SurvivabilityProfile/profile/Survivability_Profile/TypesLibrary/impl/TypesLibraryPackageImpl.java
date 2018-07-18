/**
 */
package org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage;

import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl;

import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.SurvivabilityModelExtensions.SurvivabilityModelExtensionsPackage;

import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.SurvivabilityModelExtensions.impl.SurvivabilityModelExtensionsPackageImpl;

import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.TypesLibraryFactory;
import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.TypesLibraryPackage;
import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.affectConsequence;
import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.duration;
import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.index;
import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.indexKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesLibraryPackageImpl extends EPackageImpl implements TypesLibraryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affectConsequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum indexKindEEnum = null;

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
	 * @see org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.TypesLibraryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypesLibraryPackageImpl() {
		super(eNS_URI, TypesLibraryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TypesLibraryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypesLibraryPackage init() {
		if (isInited) return (TypesLibraryPackage)EPackage.Registry.INSTANCE.getEPackage(TypesLibraryPackage.eNS_URI);

		// Obtain or create and register package
		TypesLibraryPackageImpl theTypesLibraryPackage = (TypesLibraryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypesLibraryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypesLibraryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		MisuseCaseExtensionsPackageImpl theMisuseCaseExtensionsPackage = (MisuseCaseExtensionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MisuseCaseExtensionsPackage.eNS_URI) instanceof MisuseCaseExtensionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MisuseCaseExtensionsPackage.eNS_URI) : MisuseCaseExtensionsPackage.eINSTANCE);
		SurvivabilityModelExtensionsPackageImpl theSurvivabilityModelExtensionsPackage = (SurvivabilityModelExtensionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SurvivabilityModelExtensionsPackage.eNS_URI) instanceof SurvivabilityModelExtensionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SurvivabilityModelExtensionsPackage.eNS_URI) : SurvivabilityModelExtensionsPackage.eINSTANCE);

		// Create package meta-data objects
		theTypesLibraryPackage.createPackageContents();
		theMisuseCaseExtensionsPackage.createPackageContents();
		theSurvivabilityModelExtensionsPackage.createPackageContents();

		// Initialize created meta-data
		theTypesLibraryPackage.initializePackageContents();
		theMisuseCaseExtensionsPackage.initializePackageContents();
		theSurvivabilityModelExtensionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypesLibraryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypesLibraryPackage.eNS_URI, theTypesLibraryPackage);
		return theTypesLibraryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaffectConsequence() {
		return affectConsequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getaffectConsequence_Index() {
		return (EAttribute)affectConsequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getaffectConsequence_Set() {
		return (EAttribute)affectConsequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getaffectConsequence_Inc() {
		return (EAttribute)affectConsequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getaffectConsequence_Dec() {
		return (EAttribute)affectConsequenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getindex() {
		return indexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getindex_Name() {
		return (EAttribute)indexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getindex_Kind() {
		return (EAttribute)indexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getindex_Values() {
		return (EAttribute)indexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getindex_Initial() {
		return (EAttribute)indexEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getduration() {
		return durationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getduration_Value() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getduration_Unit() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getindexKind() {
		return indexKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesLibraryFactory getTypesLibraryFactory() {
		return (TypesLibraryFactory)getEFactoryInstance();
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
		affectConsequenceEClass = createEClass(AFFECT_CONSEQUENCE);
		createEAttribute(affectConsequenceEClass, AFFECT_CONSEQUENCE__INDEX);
		createEAttribute(affectConsequenceEClass, AFFECT_CONSEQUENCE__SET);
		createEAttribute(affectConsequenceEClass, AFFECT_CONSEQUENCE__INC);
		createEAttribute(affectConsequenceEClass, AFFECT_CONSEQUENCE__DEC);

		indexEClass = createEClass(INDEX);
		createEAttribute(indexEClass, INDEX__NAME);
		createEAttribute(indexEClass, INDEX__KIND);
		createEAttribute(indexEClass, INDEX__VALUES);
		createEAttribute(indexEClass, INDEX__INITIAL);

		durationEClass = createEClass(DURATION);
		createEAttribute(durationEClass, DURATION__VALUE);
		createEAttribute(durationEClass, DURATION__UNIT);

		// Create enums
		indexKindEEnum = createEEnum(INDEX_KIND);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(affectConsequenceEClass, affectConsequence.class, "affectConsequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getaffectConsequence_Index(), theTypesPackage.getString(), "index", null, 0, 1, affectConsequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getaffectConsequence_Set(), theTypesPackage.getString(), "set", null, 0, 1, affectConsequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getaffectConsequence_Inc(), theTypesPackage.getInteger(), "inc", null, 0, 1, affectConsequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getaffectConsequence_Dec(), theTypesPackage.getString(), "dec", null, 0, 1, affectConsequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(indexEClass, index.class, "index", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getindex_Name(), theTypesPackage.getString(), "name", null, 1, 1, index.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getindex_Kind(), this.getindexKind(), "kind", null, 1, 1, index.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getindex_Values(), theTypesPackage.getString(), "values", null, 1, 1, index.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getindex_Initial(), theTypesPackage.getString(), "initial", null, 1, 1, index.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(durationEClass, duration.class, "duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getduration_Value(), theTypesPackage.getReal(), "value", null, 1, 1, duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getduration_Unit(), theTypesPackage.getString(), "unit", null, 1, 1, duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(indexKindEEnum, indexKind.class, "indexKind");
		addEEnumLiteral(indexKindEEnum, indexKind.INTEGER_INTERVAL);
		addEEnumLiteral(indexKindEEnum, indexKind.ENUM);

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
			 "originalName", "Types Library"
		   });
	}

} //TypesLibraryPackageImpl
