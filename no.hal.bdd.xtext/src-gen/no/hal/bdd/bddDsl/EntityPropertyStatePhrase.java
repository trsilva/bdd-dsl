/**
 * generated by Xtext 2.19.0
 */
package no.hal.bdd.bddDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Property State Phrase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.bdd.bddDsl.EntityPropertyStatePhrase#getProperty <em>Property</em>}</li>
 *   <li>{@link no.hal.bdd.bddDsl.EntityPropertyStatePhrase#getEntity <em>Entity</em>}</li>
 *   <li>{@link no.hal.bdd.bddDsl.EntityPropertyStatePhrase#getValue <em>Value</em>}</li>
 *   <li>{@link no.hal.bdd.bddDsl.EntityPropertyStatePhrase#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see no.hal.bdd.bddDsl.BddDslPackage#getEntityPropertyStatePhrase()
 * @model
 * @generated
 */
public interface EntityPropertyStatePhrase extends StatePhrase
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' reference.
   * @see #setProperty(PropertyDef)
   * @see no.hal.bdd.bddDsl.BddDslPackage#getEntityPropertyStatePhrase_Property()
   * @model
   * @generated
   */
  PropertyDef getProperty();

  /**
   * Sets the value of the '{@link no.hal.bdd.bddDsl.EntityPropertyStatePhrase#getProperty <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(PropertyDef value);

  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference.
   * @see #setEntity(EntityRef)
   * @see no.hal.bdd.bddDsl.BddDslPackage#getEntityPropertyStatePhrase_Entity()
   * @model containment="true"
   * @generated
   */
  EntityRef getEntity();

  /**
   * Sets the value of the '{@link no.hal.bdd.bddDsl.EntityPropertyStatePhrase#getEntity <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' containment reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(EntityRef value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(PropertyValue)
   * @see no.hal.bdd.bddDsl.BddDslPackage#getEntityPropertyStatePhrase_Value()
   * @model containment="true"
   * @generated
   */
  PropertyValue getValue();

  /**
   * Sets the value of the '{@link no.hal.bdd.bddDsl.EntityPropertyStatePhrase#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(PropertyValue value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link no.hal.bdd.bddDsl.PropertyValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see no.hal.bdd.bddDsl.BddDslPackage#getEntityPropertyStatePhrase_Values()
   * @model containment="true"
   * @generated
   */
  EList<PropertyValue> getValues();

} // EntityPropertyStatePhrase
