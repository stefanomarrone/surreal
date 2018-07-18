/**
 */
package org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>index Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.surreal.SurvivabilityProfile.profile.Survivability_Profile.TypesLibrary.TypesLibraryPackage#getindexKind()
 * @model
 * @generated
 */
public enum indexKind implements Enumerator {
	/**
	 * The '<em><b>Integer Interval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_INTERVAL_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_INTERVAL(0, "integerInterval", "integerInterval"),

	/**
	 * The '<em><b>Enum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM(1, "enum", "enum");

	/**
	 * The '<em><b>Integer Interval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer Interval</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER_INTERVAL
	 * @model name="integerInterval"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_INTERVAL_VALUE = 0;

	/**
	 * The '<em><b>Enum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM
	 * @model name="enum"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_VALUE = 1;

	/**
	 * An array of all the '<em><b>index Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final indexKind[] VALUES_ARRAY =
		new indexKind[] {
			INTEGER_INTERVAL,
			ENUM,
		};

	/**
	 * A public read-only list of all the '<em><b>index Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<indexKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>index Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static indexKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			indexKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>index Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static indexKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			indexKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>index Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static indexKind get(int value) {
		switch (value) {
			case INTEGER_INTERVAL_VALUE: return INTEGER_INTERVAL;
			case ENUM_VALUE: return ENUM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private indexKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //indexKind
