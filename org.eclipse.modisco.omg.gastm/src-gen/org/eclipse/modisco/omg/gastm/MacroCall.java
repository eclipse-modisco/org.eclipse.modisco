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
 * A representation of the model object '<em><b>Macro Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.MacroCall#getRefersTo <em>Refers To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getMacroCall()
 * @model
 * @generated
 */
public interface MacroCall extends PreprocessorElement {
	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' containment reference.
	 * @see #setRefersTo(MacroDefinition)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getMacroCall_RefersTo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MacroDefinition getRefersTo();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.MacroCall#getRefersTo <em>Refers To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' containment reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(MacroDefinition value);

} // MacroCall
