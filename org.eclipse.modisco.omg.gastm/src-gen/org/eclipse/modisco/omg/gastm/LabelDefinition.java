/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.LabelDefinition#getLabelName <em>Label Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.LabelDefinition#getLabelType <em>Label Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getLabelDefinition()
 * @model
 * @generated
 */
public interface LabelDefinition extends DefinitionObject {
	/**
	 * Returns the value of the '<em><b>Label Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Name</em>' containment reference.
	 * @see #setLabelName(Name)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getLabelDefinition_LabelName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Name getLabelName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.LabelDefinition#getLabelName <em>Label Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Name</em>' containment reference.
	 * @see #getLabelName()
	 * @generated
	 */
	void setLabelName(Name value);

	/**
	 * Returns the value of the '<em><b>Label Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Type</em>' containment reference.
	 * @see #setLabelType(LabelType)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getLabelDefinition_LabelType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LabelType getLabelType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.LabelDefinition#getLabelType <em>Label Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Type</em>' containment reference.
	 * @see #getLabelType()
	 * @generated
	 */
	void setLabelType(LabelType value);

} // LabelDefinition
