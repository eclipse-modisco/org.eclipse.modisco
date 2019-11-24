/**
 *  Copyright (c) 2010, 2019 Mia-Software and others.
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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage
 * @generated
 */
public interface JavaapplicationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaapplicationFactory eINSTANCE = org.eclipse.modisco.java.composition.javaapplication.impl.JavaapplicationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Java Node Source Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Node Source Region</em>'.
	 * @generated
	 */
	JavaNodeSourceRegion createJavaNodeSourceRegion();

	/**
	 * Returns a new object of class '<em>Java2 File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java2 File</em>'.
	 * @generated
	 */
	Java2File createJava2File();

	/**
	 * Returns a new object of class '<em>Java Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Application</em>'.
	 * @generated
	 */
	JavaApplication createJavaApplication();

	/**
	 * Returns a new object of class '<em>Java2 Directory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java2 Directory</em>'.
	 * @generated
	 */
	Java2Directory createJava2Directory();

	/**
	 * Returns a new object of class '<em>Java Jar2 File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Jar2 File</em>'.
	 * @generated
	 */
	JavaJar2File createJavaJar2File();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavaapplicationPackage getJavaapplicationPackage();

} //JavaapplicationFactory
