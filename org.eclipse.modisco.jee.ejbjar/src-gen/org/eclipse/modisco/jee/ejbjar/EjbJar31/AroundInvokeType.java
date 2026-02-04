/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar31;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Around Invoke Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The around-invoke type specifies a method on a
 *         class to be called during the around invoke portion of an 
 *         ejb invocation.  Note that each class may have only one
 *         around invoke method and that the method may not be
 *         overloaded.
 *         
 *         If the class element is missing then
 *         the class defining the callback is assumed to be the
 *         interceptor class or component class in scope at the
 *         location in the descriptor in which the around invoke
 *         definition appears.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.AroundInvokeType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.AroundInvokeType#getMethodName <em>Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getAroundInvokeType()
 * @model extendedMetaData="name='around-invokeType' kind='elementOnly'"
 * @generated
 */
public interface AroundInvokeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass(FullyQualifiedClassType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getAroundInvokeType_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	FullyQualifiedClassType getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.AroundInvokeType#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(FullyQualifiedClassType value);

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' containment reference.
	 * @see #setMethodName(JavaIdentifierType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getAroundInvokeType_MethodName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='method-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	JavaIdentifierType getMethodName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.AroundInvokeType#getMethodName <em>Method Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' containment reference.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(JavaIdentifierType value);

} // AroundInvokeType
