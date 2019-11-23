/**
 * *******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.xml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.xml.ProcessingInstruction#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.xml.emf.MoDiscoXMLPackage#getProcessingInstruction()
 * @model
 * @generated
 */
public interface ProcessingInstruction extends Node {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see org.eclipse.modisco.xml.emf.MoDiscoXMLPackage#getProcessingInstruction_Data()
	 * @model required="true"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.xml.ProcessingInstruction#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

} // ProcessingInstruction
