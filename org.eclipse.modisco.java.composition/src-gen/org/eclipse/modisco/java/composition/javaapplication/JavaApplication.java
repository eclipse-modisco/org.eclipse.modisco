/**
 *  Copyright (c) 2010 Mia-Software.
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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.omg.kdm.source.InventoryModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.JavaApplication#getJavaModel <em>Java Model</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.JavaApplication#getDeploymentModel <em>Deployment Model</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.JavaApplication#getJava2DirectoryChildren <em>Java2 Directory Children</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.JavaApplication#getJar2FileChildren <em>Jar2 File Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJavaApplication()
 * @model
 * @generated
 */
public interface JavaApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Java Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Model</em>' reference.
	 * @see #setJavaModel(Model)
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJavaApplication_JavaModel()
	 * @model required="true"
	 * @generated
	 */
	Model getJavaModel();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.composition.javaapplication.JavaApplication#getJavaModel <em>Java Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Model</em>' reference.
	 * @see #getJavaModel()
	 * @generated
	 */
	void setJavaModel(Model value);

	/**
	 * Returns the value of the '<em><b>Deployment Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Model</em>' reference.
	 * @see #setDeploymentModel(InventoryModel)
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJavaApplication_DeploymentModel()
	 * @model required="true"
	 * @generated
	 */
	InventoryModel getDeploymentModel();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.composition.javaapplication.JavaApplication#getDeploymentModel <em>Deployment Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Model</em>' reference.
	 * @see #getDeploymentModel()
	 * @generated
	 */
	void setDeploymentModel(InventoryModel value);

	/**
	 * Returns the value of the '<em><b>Java2 Directory Children</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.composition.javaapplication.Java2Directory}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.composition.javaapplication.Java2Directory#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java2 Directory Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java2 Directory Children</em>' reference list.
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJavaApplication_Java2DirectoryChildren()
	 * @see org.eclipse.modisco.java.composition.javaapplication.Java2Directory#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Java2Directory> getJava2DirectoryChildren();

	/**
	 * Returns the value of the '<em><b>Jar2 File Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.composition.javaapplication.JavaJar2File}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.composition.javaapplication.JavaJar2File#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jar2 File Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jar2 File Children</em>' containment reference list.
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJavaApplication_Jar2FileChildren()
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaJar2File#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<JavaJar2File> getJar2FileChildren();

} // JavaApplication
