/**
 *  Copyright (c) 2010 Mia-Software.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *          Fabien Giquel (Mia-Software) - initial API and implementation
 *  	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 * 
 */
package org.eclipse.modisco.java.composition.javaapplication;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.omg.kdm.source.Directory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java2 Directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.Java2Directory#getJavaPackage <em>Java Package</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.Java2Directory#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.Java2Directory#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.Java2Directory#getJava2FileChildren <em>Java2 File Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJava2Directory()
 * @model
 * @generated
 */
public interface Java2Directory extends EObject {
	/**
	 * Returns the value of the '<em><b>Java Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Package</em>' reference.
	 * @see #setJavaPackage(org.eclipse.gmt.modisco.java.Package)
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJava2Directory_JavaPackage()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.gmt.modisco.java.Package getJavaPackage();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.composition.javaapplication.Java2Directory#getJavaPackage <em>Java Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Package</em>' reference.
	 * @see #getJavaPackage()
	 * @generated
	 */
	void setJavaPackage(org.eclipse.gmt.modisco.java.Package value);

	/**
	 * Returns the value of the '<em><b>Directory</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.source.Directory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directory</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory</em>' reference list.
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJava2Directory_Directory()
	 * @model required="true"
	 * @generated
	 */
	EList<Directory> getDirectory();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.composition.javaapplication.JavaApplication#getJava2DirectoryChildren <em>Java2 Directory Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(JavaApplication)
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJava2Directory_Parent()
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaApplication#getJava2DirectoryChildren
	 * @model opposite="java2DirectoryChildren" required="true"
	 * @generated
	 */
	JavaApplication getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.composition.javaapplication.Java2Directory#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(JavaApplication value);

	/**
	 * Returns the value of the '<em><b>Java2 File Children</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.composition.javaapplication.Java2File}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.composition.javaapplication.Java2File#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java2 File Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java2 File Children</em>' reference list.
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJava2Directory_Java2FileChildren()
	 * @see org.eclipse.modisco.java.composition.javaapplication.Java2File#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Java2File> getJava2FileChildren();

} // Java2Directory
