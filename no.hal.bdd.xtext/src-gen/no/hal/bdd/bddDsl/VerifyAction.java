/**
 * generated by Xtext 2.19.0
 */
package no.hal.bdd.bddDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verify Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.bdd.bddDsl.VerifyAction#getState <em>State</em>}</li>
 * </ul>
 *
 * @see no.hal.bdd.bddDsl.BddDslPackage#getVerifyAction()
 * @model
 * @generated
 */
public interface VerifyAction extends ActionPhrase
{
  /**
   * Returns the value of the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' containment reference.
   * @see #setState(StatePhrase)
   * @see no.hal.bdd.bddDsl.BddDslPackage#getVerifyAction_State()
   * @model containment="true"
   * @generated
   */
  StatePhrase getState();

  /**
   * Sets the value of the '{@link no.hal.bdd.bddDsl.VerifyAction#getState <em>State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' containment reference.
   * @see #getState()
   * @generated
   */
  void setState(StatePhrase value);

} // VerifyAction
