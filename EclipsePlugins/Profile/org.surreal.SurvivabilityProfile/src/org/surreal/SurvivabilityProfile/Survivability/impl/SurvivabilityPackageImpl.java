/**
 */
package org.surreal.SurvivabilityProfile.Survivability.impl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.MisuseCaseExtensionsPackage;

import org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl;

import org.surreal.SurvivabilityProfile.SAMExtensions.SAMExtensionsPackage;

import org.surreal.SurvivabilityProfile.SAMExtensions.impl.SAMExtensionsPackageImpl;

import org.surreal.SurvivabilityProfile.SurvTypes.SurvTypesPackage;

import org.surreal.SurvivabilityProfile.SurvTypes.impl.SurvTypesPackageImpl;

import org.surreal.SurvivabilityProfile.Survivability.SurvivabilityFactory;
import org.surreal.SurvivabilityProfile.Survivability.SurvivabilityPackage;
import org.surreal.SurvivabilityProfile.Survivability.dummy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SurvivabilityPackageImpl extends EPackageImpl implements SurvivabilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dummyEEnum = null;

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
	 * @see org.surreal.SurvivabilityProfile.Survivability.SurvivabilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SurvivabilityPackageImpl() {
		super(eNS_URI, SurvivabilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SurvivabilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SurvivabilityPackage init() {
		if (isInited) return (SurvivabilityPackage)EPackage.Registry.INSTANCE.getEPackage(SurvivabilityPackage.eNS_URI);

		// Obtain or create and register package
		SurvivabilityPackageImpl theSurvivabilityPackage = (SurvivabilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SurvivabilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SurvivabilityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		MisuseCaseExtensionsPackageImpl theMisuseCaseExtensionsPackage = (MisuseCaseExtensionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MisuseCaseExtensionsPackage.eNS_URI) instanceof MisuseCaseExtensionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MisuseCaseExtensionsPackage.eNS_URI) : MisuseCaseExtensionsPackage.eINSTANCE);
		SurvTypesPackageImpl theSurvTypesPackage = (SurvTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SurvTypesPackage.eNS_URI) instanceof SurvTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SurvTypesPackage.eNS_URI) : SurvTypesPackage.eINSTANCE);
		SAMExtensionsPackageImpl theSAMExtensionsPackage = (SAMExtensionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SAMExtensionsPackage.eNS_URI) instanceof SAMExtensionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SAMExtensionsPackage.eNS_URI) : SAMExtensionsPackage.eINSTANCE);

		// Create package meta-data objects
		theSurvivabilityPackage.createPackageContents();
		theMisuseCaseExtensionsPackage.createPackageContents();
		theSurvTypesPackage.createPackageContents();
		theSAMExtensionsPackage.createPackageContents();

		// Initialize created meta-data
		theSurvivabilityPackage.initializePackageContents();
		theMisuseCaseExtensionsPackage.initializePackageContents();
		theSurvTypesPackage.initializePackageContents();
		theSAMExtensionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSurvivabilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SurvivabilityPackage.eNS_URI, theSurvivabilityPackage);
		return theSurvivabilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getdummy() {
		return dummyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurvivabilityFactory getSurvivabilityFactory() {
		return (SurvivabilityFactory)getEFactoryInstance();
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

		// Create enums
		dummyEEnum = createEEnum(DUMMY);
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
		MisuseCaseExtensionsPackage theMisuseCaseExtensionsPackage = (MisuseCaseExtensionsPackage)EPackage.Registry.INSTANCE.getEPackage(MisuseCaseExtensionsPackage.eNS_URI);
		SurvTypesPackage theSurvTypesPackage = (SurvTypesPackage)EPackage.Registry.INSTANCE.getEPackage(SurvTypesPackage.eNS_URI);
		SAMExtensionsPackage theSAMExtensionsPackage = (SAMExtensionsPackage)EPackage.Registry.INSTANCE.getEPackage(SAMExtensionsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theMisuseCaseExtensionsPackage);
		getESubpackages().add(theSurvTypesPackage);
		getESubpackages().add(theSAMExtensionsPackage);

		// Initialize enums and add enum literals
		initEEnum(dummyEEnum, dummy.class, "dummy");

		// Create resource
		createResource(eNS_URI);
	}

} //SurvivabilityPackageImpl
