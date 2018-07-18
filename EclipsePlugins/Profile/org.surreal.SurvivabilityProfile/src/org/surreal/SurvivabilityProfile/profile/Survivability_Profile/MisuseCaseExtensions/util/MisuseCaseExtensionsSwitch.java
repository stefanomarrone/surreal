/**
 */
package org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.surreal.SurvivabilityProfile.profile.Survivability_Profile.MisuseCaseExtensions.MisuseCaseExtensionsPackage
 * @generated
 */
public class MisuseCaseExtensionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MisuseCaseExtensionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MisuseCaseExtensionsSwitch() {
		if (modelPackage == null) {
			modelPackage = MisuseCaseExtensionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MisuseCaseExtensionsPackage.RECOVERY: {
				recovery recovery = (recovery)theEObject;
				T result = caserecovery(recovery);
				if (result == null) result = casestrategy(recovery);
				if (result == null) result = caseserviceMS(recovery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MisuseCaseExtensionsPackage.STRATEGY: {
				strategy strategy = (strategy)theEObject;
				T result = casestrategy(strategy);
				if (result == null) result = caseserviceMS(strategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MisuseCaseExtensionsPackage.SERVICE_MS: {
				serviceMS serviceMS = (serviceMS)theEObject;
				T result = caseserviceMS(serviceMS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MisuseCaseExtensionsPackage.MISUSE: {
				misuse misuse = (misuse)theEObject;
				T result = casemisuse(misuse);
				if (result == null) result = caseserviceMS(misuse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MisuseCaseExtensionsPackage.SERVICE: {
				service service = (service)theEObject;
				T result = caseservice(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MisuseCaseExtensionsPackage.THREATENS: {
				threatens threatens = (threatens)theEObject;
				T result = casethreatens(threatens);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MisuseCaseExtensionsPackage.MITIGATES: {
				mitigates mitigates = (mitigates)theEObject;
				T result = casemitigates(mitigates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MisuseCaseExtensionsPackage.MISUSER: {
				misuser misuser = (misuser)theEObject;
				T result = casemisuser(misuser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MisuseCaseExtensionsPackage.RESISTANCE: {
				resistance resistance = (resistance)theEObject;
				T result = caseresistance(resistance);
				if (result == null) result = casestrategy(resistance);
				if (result == null) result = caseserviceMS(resistance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MisuseCaseExtensionsPackage.RECOGNITION: {
				recognition recognition = (recognition)theEObject;
				T result = caserecognition(recognition);
				if (result == null) result = casestrategy(recognition);
				if (result == null) result = caseserviceMS(recognition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MisuseCaseExtensionsPackage.SERVICE_MODE_CONTEXT: {
				ServiceModeContext serviceModeContext = (ServiceModeContext)theEObject;
				T result = caseServiceModeContext(serviceModeContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>recovery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>recovery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caserecovery(recovery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestrategy(strategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>service MS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>service MS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseserviceMS(serviceMS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>misuse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>misuse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemisuse(misuse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseservice(service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>threatens</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>threatens</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casethreatens(threatens object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>mitigates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>mitigates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemitigates(mitigates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>misuser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>misuser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemisuser(misuser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>resistance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>resistance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseresistance(resistance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>recognition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>recognition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caserecognition(recognition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Mode Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Mode Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceModeContext(ServiceModeContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MisuseCaseExtensionsSwitch
