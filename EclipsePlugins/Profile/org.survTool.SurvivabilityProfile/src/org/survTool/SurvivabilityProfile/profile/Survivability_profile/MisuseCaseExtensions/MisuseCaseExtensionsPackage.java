/**
 */
package org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions;

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
 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.MisuseCaseExtensionsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MisuseCase Extensions'"
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
	String eNS_URI = "http:///Survivability_profile/MisuseCaseExtensions.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Survivability_profile.MisuseCaseExtensions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MisuseCaseExtensionsPackage eINSTANCE = org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.strategyImpl <em>strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.strategyImpl
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getstrategy()
	 * @generated
	 */
	int STRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__SUCCESS_PROB = 0;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__BASE_USE_CASE = 1;

	/**
	 * The number of structural features of the '<em>strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.recoveryImpl <em>recovery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.recoveryImpl
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getrecovery()
	 * @generated
	 */
	int RECOVERY = 0;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY__SUCCESS_PROB = STRATEGY__SUCCESS_PROB;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOVERY__BASE_USE_CASE = STRATEGY__BASE_USE_CASE;

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
	 * The meta object id for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.misuseImpl <em>misuse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.misuseImpl
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getmisuse()
	 * @generated
	 */
	int MISUSE = 2;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISUSE__BASE_USE_CASE = 0;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISUSE__AFFECTS = 1;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISUSE__SUCCESS_PROB = 2;

	/**
	 * The feature id for the '<em><b>Attack Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISUSE__ATTACK_DELAY = 3;

	/**
	 * The number of structural features of the '<em>misuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISUSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>misuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.serviceImpl <em>service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.serviceImpl
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getservice()
	 * @generated
	 */
	int SERVICE = 3;

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
	 * The meta object id for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.threatensImpl <em>threatens</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.threatensImpl
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getthreatens()
	 * @generated
	 */
	int THREATENS = 4;

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
	 * The meta object id for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.mitigatesImpl <em>mitigates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.mitigatesImpl
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getmitigates()
	 * @generated
	 */
	int MITIGATES = 5;

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
	 * The meta object id for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.misuserImpl <em>misuser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.misuserImpl
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getmisuser()
	 * @generated
	 */
	int MISUSER = 6;

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
	 * The meta object id for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.resistanceImpl <em>resistance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.resistanceImpl
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getresistance()
	 * @generated
	 */
	int RESISTANCE = 7;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTANCE__SUCCESS_PROB = STRATEGY__SUCCESS_PROB;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTANCE__BASE_USE_CASE = STRATEGY__BASE_USE_CASE;

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
	 * The meta object id for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.recognitionImpl <em>recognition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.recognitionImpl
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getrecognition()
	 * @generated
	 */
	int RECOGNITION = 8;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOGNITION__SUCCESS_PROB = STRATEGY__SUCCESS_PROB;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOGNITION__BASE_USE_CASE = STRATEGY__BASE_USE_CASE;

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
	 * Returns the meta object for class '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.recovery <em>recovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>recovery</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.recovery
	 * @generated
	 */
	EClass getrecovery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.recovery#getAffects <em>Affects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affects</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.recovery#getAffects()
	 * @see #getrecovery()
	 * @generated
	 */
	EReference getrecovery_Affects();

	/**
	 * Returns the meta object for the containment reference '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.recovery#getMTTR <em>MTTR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MTTR</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.recovery#getMTTR()
	 * @see #getrecovery()
	 * @generated
	 */
	EReference getrecovery_MTTR();

	/**
	 * Returns the meta object for class '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.strategy <em>strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>strategy</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.strategy
	 * @generated
	 */
	EClass getstrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.strategy#getSuccessProb <em>Success Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success Prob</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.strategy#getSuccessProb()
	 * @see #getstrategy()
	 * @generated
	 */
	EAttribute getstrategy_SuccessProb();

	/**
	 * Returns the meta object for the reference '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.strategy#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.strategy#getBase_UseCase()
	 * @see #getstrategy()
	 * @generated
	 */
	EReference getstrategy_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse <em>misuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>misuse</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse
	 * @generated
	 */
	EClass getmisuse();

	/**
	 * Returns the meta object for the reference '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse#getBase_UseCase()
	 * @see #getmisuse()
	 * @generated
	 */
	EReference getmisuse_Base_UseCase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse#getAffects <em>Affects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affects</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse#getAffects()
	 * @see #getmisuse()
	 * @generated
	 */
	EReference getmisuse_Affects();

	/**
	 * Returns the meta object for the attribute '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse#getSuccessProb <em>Success Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success Prob</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse#getSuccessProb()
	 * @see #getmisuse()
	 * @generated
	 */
	EAttribute getmisuse_SuccessProb();

	/**
	 * Returns the meta object for the containment reference '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse#getAttackDelay <em>Attack Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attack Delay</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuse#getAttackDelay()
	 * @see #getmisuse()
	 * @generated
	 */
	EReference getmisuse_AttackDelay();

	/**
	 * Returns the meta object for class '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.service <em>service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>service</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.service
	 * @generated
	 */
	EClass getservice();

	/**
	 * Returns the meta object for the containment reference list '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.service#getIndices <em>Indices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indices</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.service#getIndices()
	 * @see #getservice()
	 * @generated
	 */
	EReference getservice_Indices();

	/**
	 * Returns the meta object for the reference '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.service#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.service#getBase_UseCase()
	 * @see #getservice()
	 * @generated
	 */
	EReference getservice_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.threatens <em>threatens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>threatens</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.threatens
	 * @generated
	 */
	EClass getthreatens();

	/**
	 * Returns the meta object for the reference '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.threatens#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.threatens#getBase_Dependency()
	 * @see #getthreatens()
	 * @generated
	 */
	EReference getthreatens_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.mitigates <em>mitigates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>mitigates</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.mitigates
	 * @generated
	 */
	EClass getmitigates();

	/**
	 * Returns the meta object for the reference '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.mitigates#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.mitigates#getBase_Dependency()
	 * @see #getmitigates()
	 * @generated
	 */
	EReference getmitigates_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuser <em>misuser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>misuser</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuser
	 * @generated
	 */
	EClass getmisuser();

	/**
	 * Returns the meta object for the reference '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuser#getBase_Actor <em>Base Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Actor</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.misuser#getBase_Actor()
	 * @see #getmisuser()
	 * @generated
	 */
	EReference getmisuser_Base_Actor();

	/**
	 * Returns the meta object for class '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.resistance <em>resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>resistance</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.resistance
	 * @generated
	 */
	EClass getresistance();

	/**
	 * Returns the meta object for class '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.recognition <em>recognition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>recognition</em>'.
	 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.recognition
	 * @generated
	 */
	EClass getrecognition();

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
		 * The meta object literal for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.recoveryImpl <em>recovery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.recoveryImpl
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getrecovery()
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
		 * The meta object literal for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.strategyImpl <em>strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.strategyImpl
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getstrategy()
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
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__BASE_USE_CASE = eINSTANCE.getstrategy_Base_UseCase();

		/**
		 * The meta object literal for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.misuseImpl <em>misuse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.misuseImpl
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getmisuse()
		 * @generated
		 */
		EClass MISUSE = eINSTANCE.getmisuse();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISUSE__BASE_USE_CASE = eINSTANCE.getmisuse_Base_UseCase();

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
		 * The meta object literal for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.serviceImpl <em>service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.serviceImpl
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getservice()
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
		 * The meta object literal for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.threatensImpl <em>threatens</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.threatensImpl
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getthreatens()
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
		 * The meta object literal for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.mitigatesImpl <em>mitigates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.mitigatesImpl
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getmitigates()
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
		 * The meta object literal for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.misuserImpl <em>misuser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.misuserImpl
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getmisuser()
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
		 * The meta object literal for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.resistanceImpl <em>resistance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.resistanceImpl
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getresistance()
		 * @generated
		 */
		EClass RESISTANCE = eINSTANCE.getresistance();

		/**
		 * The meta object literal for the '{@link org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.recognitionImpl <em>recognition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.recognitionImpl
		 * @see org.survTool.SurvivabilityProfile.profile.Survivability_profile.MisuseCaseExtensions.impl.MisuseCaseExtensionsPackageImpl#getrecognition()
		 * @generated
		 */
		EClass RECOGNITION = eINSTANCE.getrecognition();

	}

} //MisuseCaseExtensionsPackage
