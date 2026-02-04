/**
 * <copyright>
 * Copyright (c) 2009, 2019 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.Dimension#getLowBound <em>Low Bound</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.Dimension#getHighBound <em>High Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDimension()
 * @model
 * @generated
 */
public interface Dimension extends MinorSyntaxObject {
	/**
	 * Returns the value of the '<em><b>Low Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Bound</em>' containment reference.
	 * @see #setLowBound(Expression)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDimension_LowBound()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLowBound();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.Dimension#getLowBound <em>Low Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Bound</em>' containment reference.
	 * @see #getLowBound()
	 * @generated
	 */
	void setLowBound(Expression value);

	/**
	 * Returns the value of the '<em><b>High Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Bound</em>' containment reference.
	 * @see #setHighBound(Expression)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDimension_HighBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getHighBound();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.Dimension#getHighBound <em>High Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Bound</em>' containment reference.
	 * @see #getHighBound()
	 * @generated
	 */
	void setHighBound(Expression value);

} // Dimension
