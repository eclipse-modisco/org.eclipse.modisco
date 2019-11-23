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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.Archive;
import org.eclipse.modisco.omg.kdm.source.BinaryFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Jar2 File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.JavaJar2File#getJavaArchive <em>Java Archive</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.JavaJar2File#getFile <em>File</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.JavaJar2File#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJavaJar2File()
 * @model
 * @generated
 */
public interface JavaJar2File extends EObject {
	/**
	 * Returns the value of the '<em><b>Java Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Archive</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Archive</em>' reference.
	 * @see #setJavaArchive(Archive)
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJavaJar2File_JavaArchive()
	 * @model required="true"
	 * @generated
	 */
	Archive getJavaArchive();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.composition.javaapplication.JavaJar2File#getJavaArchive <em>Java Archive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Archive</em>' reference.
	 * @see #getJavaArchive()
	 * @generated
	 */
	void setJavaArchive(Archive value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' reference.
	 * @see #setFile(BinaryFile)
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJavaJar2File_File()
	 * @model required="true"
	 * @generated
	 */
	BinaryFile getFile();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.composition.javaapplication.JavaJar2File#getFile <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(BinaryFile value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.composition.javaapplication.JavaApplication#getJar2FileChildren <em>Jar2 File Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(JavaApplication)
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJavaJar2File_Parent()
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaApplication#getJar2FileChildren
	 * @model opposite="jar2FileChildren" required="true" transient="false"
	 * @generated
	 */
	JavaApplication getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.composition.javaapplication.JavaJar2File#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(JavaApplication value);

} // JavaJar2File
