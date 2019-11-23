/**
 *  Copyright (c) 2010, 2019 Mia-Software.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *          Fabien Giquel (Mia-Software) - initial API and implementation
 *  	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 * 
 */
package org.eclipse.modisco.java.composition.javaapplication;

import org.eclipse.modisco.java.CompilationUnit;
import org.eclipse.modisco.kdm.source.extension.CodeUnit2File;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java2 File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.Java2File#getJavaUnit <em>Java Unit</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.Java2File#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJava2File()
 * @model
 * @generated
 */
public interface Java2File extends CodeUnit2File {
	/**
	 * Returns the value of the '<em><b>Java Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Unit</em>' reference.
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJava2File_JavaUnit()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	CompilationUnit getJavaUnit();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.composition.javaapplication.Java2Directory#getJava2FileChildren <em>Java2 File Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Java2Directory)
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJava2File_Parent()
	 * @see org.eclipse.modisco.java.composition.javaapplication.Java2Directory#getJava2FileChildren
	 * @model opposite="java2FileChildren" required="true"
	 * @generated
	 */
	Java2Directory getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.composition.javaapplication.Java2File#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Java2Directory value);

} // Java2File
