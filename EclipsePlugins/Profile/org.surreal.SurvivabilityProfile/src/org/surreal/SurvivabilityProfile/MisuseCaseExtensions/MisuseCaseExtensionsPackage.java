/**
 */
package org.surreal.SurvivabilityProfile.MisuseCaseExtensions;

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
 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.MisuseCaseExtensionsFactory
 * @model kind="package"
 * @generated
 */
public interface MisuseCaseExtensionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MisuseCaseExtensions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.surreal.SurvivabilityProfile/profiles/MisuseCaseExtensions/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MisuseCaseExtensions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MisuseCaseExtensionsPackage eINSTANCE = org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.serviceMSImpl <em>service MS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.serviceMSImpl
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getserviceMS()
	 * @generated
	 */
	int SERVICE_MS = 2;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MS__BASE_USE_CASE = 0;

	/**
	 * The number of structural features of the '<em>service MS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>service MS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.strategyImpl <em>strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.strategyImpl
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getstrategy()
	 * @generated
	 */
	int STRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__BASE_USE_CASE = SERVICE_MS__BASE_USE_CASE;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__SUCCESS_PROB = SERVICE_MS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = SERVICE_MS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = SERVICE_MS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.recoveryImpl <em>recovery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.recoveryImpl
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getrecovery()
	 * @generated
	 */
	int RECOVERY = 0;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY__BASE_USE_CASE = STRATEGY__BASE_USE_CASE;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY__SUCCESS_PROB = STRATEGY__SUCCESS_PROB;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY__AFFECTS = STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MTTR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY__MTTR = STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>recovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_FEATURE_COUNT = STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>recovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY_OPERATION_COUNT = STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.misuseImpl <em>misuse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.misuseImpl
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getmisuse()
	 * @generated
	 */
	int MISUSE = 3;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISUSE__BASE_USE_CASE = SERVICE_MS__BASE_USE_CASE;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISUSE__AFFECTS = SERVICE_MS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISUSE__SUCCESS_PROB = SERVICE_MS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attack Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISUSE__ATTACK_DELAY = SERVICE_MS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>misuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISUSE_FEATURE_COUNT = SERVICE_MS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>misuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISUSE_OPERATION_COUNT = SERVICE_MS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.serviceImpl <em>service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.serviceImpl
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getservice()
	 * @generated
	 */
	int SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Indices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__INDICES = 0;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__BASE_USE_CASE = 1;

	/**
	 * The number of structural features of the '<em>service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.threatensImpl <em>threatens</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.threatensImpl
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getthreatens()
	 * @generated
	 */
	int THREATENS = 5;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREATENS__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>threatens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREATENS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>threatens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREATENS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.mitigatesImpl <em>mitigates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.mitigatesImpl
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getmitigates()
	 * @generated
	 */
	int MITIGATES = 6;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATES__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>mitigates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>mitigates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITIGATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.misuserImpl <em>misuser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.misuserImpl
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getmisuser()
	 * @generated
	 */
	int MISUSER = 7;

	/**
	 * The feature id for the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISUSER__BASE_ACTOR = 0;

	/**
	 * The number of structural features of the '<em>misuser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISUSER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>misuser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISUSER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.resistanceImpl <em>resistance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.resistanceImpl
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getresistance()
	 * @generated
	 */
	int RESISTANCE = 8;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTANCE__BASE_USE_CASE = STRATEGY__BASE_USE_CASE;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTANCE__SUCCESS_PROB = STRATEGY__SUCCESS_PROB;

	/**
	 * The number of structural features of the '<em>resistance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTANCE_FEATURE_COUNT = STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>resistance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTANCE_OPERATION_COUNT = STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.recognitionImpl <em>recognition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.recognitionImpl
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getrecognition()
	 * @generated
	 */
	int RECOGNITION = 9;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOGNITION__BASE_USE_CASE = STRATEGY__BASE_USE_CASE;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOGNITION__SUCCESS_PROB = STRATEGY__SUCCESS_PROB;

	/**
	 * The number of structural features of the '<em>recognition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOGNITION_FEATURE_COUNT = STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>recognition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOGNITION_OPERATION_COUNT = STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.ServiceModeDefinitionImpl <em>Service Mode Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.ServiceModeDefinitionImpl
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getServiceModeDefinition()
	 * @generated
	 */
	int SERVICE_MODE_DEFINITION = 10;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODE_DEFINITION__BASE_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODE_DEFINITION__FORMULA = 1;

	/**
	 * The number of structural features of the '<em>Service Mode Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODE_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Mode Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODE_DEFINITION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.recovery <em>recovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>recovery</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.recovery
	 * @generated
	 */
	EClass getrecovery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.recovery#getAffects <em>Affects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affects</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.recovery#getAffects()
	 * @see #getrecovery()
	 * @generated
	 */
	EReference getrecovery_Affects();

	/**
	 * Returns the meta object for the containment reference '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.recovery#getMTTR <em>MTTR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MTTR</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.recovery#getMTTR()
	 * @see #getrecovery()
	 * @generated
	 */
	EReference getrecovery_MTTR();

	/**
	 * Returns the meta object for class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.strategy <em>strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>strategy</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.strategy
	 * @generated
	 */
	EClass getstrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.strategy#getSuccessProb <em>Success Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success Prob</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.strategy#getSuccessProb()
	 * @see #getstrategy()
	 * @generated
	 */
	EAttribute getstrategy_SuccessProb();

	/**
	 * Returns the meta object for class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.serviceMS <em>service MS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>service MS</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.serviceMS
	 * @generated
	 */
	EClass getserviceMS();

	/**
	 * Returns the meta object for the reference '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.serviceMS#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.serviceMS#getBase_UseCase()
	 * @see #getserviceMS()
	 * @generated
	 */
	EReference getserviceMS_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.misuse <em>misuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>misuse</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.misuse
	 * @generated
	 */
	EClass getmisuse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.misuse#getAffects <em>Affects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affects</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.misuse#getAffects()
	 * @see #getmisuse()
	 * @generated
	 */
	EReference getmisuse_Affects();

	/**
	 * Returns the meta object for the attribute '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.misuse#getSuccessProb <em>Success Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success Prob</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.misuse#getSuccessProb()
	 * @see #getmisuse()
	 * @generated
	 */
	EAttribute getmisuse_SuccessProb();

	/**
	 * Returns the meta object for the containment reference '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.misuse#getAttackDelay <em>Attack Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attack Delay</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.misuse#getAttackDelay()
	 * @see #getmisuse()
	 * @generated
	 */
	EReference getmisuse_AttackDelay();

	/**
	 * Returns the meta object for class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.service <em>service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>service</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.service
	 * @generated
	 */
	EClass getservice();

	/**
	 * Returns the meta object for the containment reference list '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.service#getIndices <em>Indices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indices</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.service#getIndices()
	 * @see #getservice()
	 * @generated
	 */
	EReference getservice_Indices();

	/**
	 * Returns the meta object for the reference '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.service#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.service#getBase_UseCase()
	 * @see #getservice()
	 * @generated
	 */
	EReference getservice_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.threatens <em>threatens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>threatens</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.threatens
	 * @generated
	 */
	EClass getthreatens();

	/**
	 * Returns the meta object for the reference '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.threatens#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.threatens#getBase_Dependency()
	 * @see #getthreatens()
	 * @generated
	 */
	EReference getthreatens_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.mitigates <em>mitigates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>mitigates</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.mitigates
	 * @generated
	 */
	EClass getmitigates();

	/**
	 * Returns the meta object for the reference '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.mitigates#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.mitigates#getBase_Dependency()
	 * @see #getmitigates()
	 * @generated
	 */
	EReference getmitigates_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.misuser <em>misuser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>misuser</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.misuser
	 * @generated
	 */
	EClass getmisuser();

	/**
	 * Returns the meta object for the reference '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.misuser#getBase_Actor <em>Base Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Actor</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.misuser#getBase_Actor()
	 * @see #getmisuser()
	 * @generated
	 */
	EReference getmisuser_Base_Actor();

	/**
	 * Returns the meta object for class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.resistance <em>resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>resistance</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.resistance
	 * @generated
	 */
	EClass getresistance();

	/**
	 * Returns the meta object for class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.recognition <em>recognition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>recognition</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.recognition
	 * @generated
	 */
	EClass getrecognition();

	/**
	 * Returns the meta object for class '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.ServiceModeDefinition <em>Service Mode Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Mode Definition</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.ServiceModeDefinition
	 * @generated
	 */
	EClass getServiceModeDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.ServiceModeDefinition#getBase_Constraint <em>Base Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Constraint</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.ServiceModeDefinition#getBase_Constraint()
	 * @see #getServiceModeDefinition()
	 * @generated
	 */
	EReference getServiceModeDefinition_Base_Constraint();

	/**
	 * Returns the meta object for the attribute list '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.ServiceModeDefinition#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Formula</em>'.
	 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.ServiceModeDefinition#getFormula()
	 * @see #getServiceModeDefinition()
	 * @generated
	 */
	EAttribute getServiceModeDefinition_Formula();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MisuseCaseExtensionsFactory getMisuseCaseExtensionsFactory();

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
		 * The meta object literal for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.recoveryImpl <em>recovery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.recoveryImpl
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getrecovery()
		 * @generated
		 */
		EClass RECOVERY = eINSTANCE.getrecovery();

		/**
		 * The meta object literal for the '<em><b>Affects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOVERY__AFFECTS = eINSTANCE.getrecovery_Affects();

		/**
		 * The meta object literal for the '<em><b>MTTR</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECOVERY__MTTR = eINSTANCE.getrecovery_MTTR();

		/**
		 * The meta object literal for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.strategyImpl <em>strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.strategyImpl
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getstrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getstrategy();

		/**
		 * The meta object literal for the '<em><b>Success Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__SUCCESS_PROB = eINSTANCE.getstrategy_SuccessProb();

		/**
		 * The meta object literal for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.serviceMSImpl <em>service MS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.serviceMSImpl
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getserviceMS()
		 * @generated
		 */
		EClass SERVICE_MS = eINSTANCE.getserviceMS();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MS__BASE_USE_CASE = eINSTANCE.getserviceMS_Base_UseCase();

		/**
		 * The meta object literal for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.misuseImpl <em>misuse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.misuseImpl
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getmisuse()
		 * @generated
		 */
		EClass MISUSE = eINSTANCE.getmisuse();

		/**
		 * The meta object literal for the '<em><b>Affects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISUSE__AFFECTS = eINSTANCE.getmisuse_Affects();

		/**
		 * The meta object literal for the '<em><b>Success Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISUSE__SUCCESS_PROB = eINSTANCE.getmisuse_SuccessProb();

		/**
		 * The meta object literal for the '<em><b>Attack Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISUSE__ATTACK_DELAY = eINSTANCE.getmisuse_AttackDelay();

		/**
		 * The meta object literal for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.serviceImpl <em>service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.serviceImpl
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getservice()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getservice();

		/**
		 * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__INDICES = eINSTANCE.getservice_Indices();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__BASE_USE_CASE = eINSTANCE.getservice_Base_UseCase();

		/**
		 * The meta object literal for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.threatensImpl <em>threatens</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.threatensImpl
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getthreatens()
		 * @generated
		 */
		EClass THREATENS = eINSTANCE.getthreatens();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREATENS__BASE_DEPENDENCY = eINSTANCE.getthreatens_Base_Dependency();

		/**
		 * The meta object literal for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.mitigatesImpl <em>mitigates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.mitigatesImpl
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getmitigates()
		 * @generated
		 */
		EClass MITIGATES = eINSTANCE.getmitigates();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MITIGATES__BASE_DEPENDENCY = eINSTANCE.getmitigates_Base_Dependency();

		/**
		 * The meta object literal for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.misuserImpl <em>misuser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.misuserImpl
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getmisuser()
		 * @generated
		 */
		EClass MISUSER = eINSTANCE.getmisuser();

		/**
		 * The meta object literal for the '<em><b>Base Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISUSER__BASE_ACTOR = eINSTANCE.getmisuser_Base_Actor();

		/**
		 * The meta object literal for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.resistanceImpl <em>resistance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.resistanceImpl
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getresistance()
		 * @generated
		 */
		EClass RESISTANCE = eINSTANCE.getresistance();

		/**
		 * The meta object literal for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.recognitionImpl <em>recognition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.recognitionImpl
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getrecognition()
		 * @generated
		 */
		EClass RECOGNITION = eINSTANCE.getrecognition();

		/**
		 * The meta object literal for the '{@link org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.ServiceModeDefinitionImpl <em>Service Mode Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.ServiceModeDefinitionImpl
		 * @see org.surreal.SurvivabilityProfile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getServiceModeDefinition()
		 * @generated
		 */
		EClass SERVICE_MODE_DEFINITION = eINSTANCE.getServiceModeDefinition();

		/**
		 * The meta object literal for the '<em><b>Base Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MODE_DEFINITION__BASE_CONSTRAINT = eINSTANCE.getServiceModeDefinition_Base_Constraint();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_MODE_DEFINITION__FORMULA = eINSTANCE.getServiceModeDefinition_Formula();

	}

} //MisuseCaseExtensionsPackage
