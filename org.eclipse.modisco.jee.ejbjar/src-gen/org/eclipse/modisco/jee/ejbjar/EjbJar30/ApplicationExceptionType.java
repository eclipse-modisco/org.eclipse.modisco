/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v1.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar30;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Exception Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The application-exceptionType declares an application
 *         exception. The declaration consists of:
 * 
 *             - the exception class. When the container receives
 *               an exception of this type, it is required to
 *               forward this exception as an applcation exception
 *               to the client regardless of whether it is a checked
 *               or unchecked exception.
 *             - an optional rollback element. If this element is
 *               set to true, the container must rollback the current
 *               transaction before forwarding the exception to the
 *               client.  If not specified, it defaults to false.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType#getExceptionClass <em>Exception Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getApplicationExceptionType()
 * @model extendedMetaData="name='application-exceptionType' kind='elementOnly'"
 * @generated
 */
public interface ApplicationExceptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Exception Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Class</em>' containment reference.
	 * @see #setExceptionClass(FullyQualifiedClassType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getApplicationExceptionType_ExceptionClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='exception-class' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	FullyQualifiedClassType getExceptionClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType#getExceptionClass <em>Exception Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Class</em>' containment reference.
	 * @see #getExceptionClass()
	 * @generated
	 */
	void setExceptionClass(FullyQualifiedClassType value);

	/**
	 * Returns the value of the '<em><b>Rollback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rollback</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rollback</em>' containment reference.
	 * @see #setRollback(TrueFalseType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getApplicationExceptionType_Rollback()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rollback' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TrueFalseType getRollback();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType#getRollback <em>Rollback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rollback</em>' containment reference.
	 * @see #getRollback()
	 * @generated
	 */
	void setRollback(TrueFalseType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getApplicationExceptionType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ApplicationExceptionType
