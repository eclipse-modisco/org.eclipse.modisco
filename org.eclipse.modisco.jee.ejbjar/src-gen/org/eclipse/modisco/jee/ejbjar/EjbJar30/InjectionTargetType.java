/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar30;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Injection Target Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	An injection target specifies a class and a name within
 * 	that class into which a resource should be injected.
 * 
 * 	The injection target class specifies the fully qualified
 * 	class name that is the target of the injection.  The
 * 	Java EE specifications describe which classes can be an
 * 	injection target.
 * 
 * 	The injection target name specifies the target within
 * 	the specified class.  The target is first looked for as a
 * 	JavaBeans property name.  If not found, the target is
 * 	looked for as a field name.
 * 
 * 	The specified resource will be injected into the target
 * 	during initialization of the class by either calling the
 * 	set method for the target property or by setting a value
 * 	into the named field.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InjectionTargetType#getInjectionTargetClass <em>Injection Target Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InjectionTargetType#getInjectionTargetName <em>Injection Target Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getInjectionTargetType()
 * @model extendedMetaData="name='injection-targetType' kind='elementOnly'"
 * @generated
 */
public interface InjectionTargetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Injection Target Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Injection Target Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injection Target Class</em>' containment reference.
	 * @see #setInjectionTargetClass(FullyQualifiedClassType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getInjectionTargetType_InjectionTargetClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='injection-target-class' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	FullyQualifiedClassType getInjectionTargetClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InjectionTargetType#getInjectionTargetClass <em>Injection Target Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Injection Target Class</em>' containment reference.
	 * @see #getInjectionTargetClass()
	 * @generated
	 */
	void setInjectionTargetClass(FullyQualifiedClassType value);

	/**
	 * Returns the value of the '<em><b>Injection Target Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Injection Target Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injection Target Name</em>' containment reference.
	 * @see #setInjectionTargetName(JavaIdentifierType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getInjectionTargetType_InjectionTargetName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='injection-target-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	JavaIdentifierType getInjectionTargetName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InjectionTargetType#getInjectionTargetName <em>Injection Target Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Injection Target Name</em>' containment reference.
	 * @see #getInjectionTargetName()
	 * @generated
	 */
	void setInjectionTargetName(JavaIdentifierType value);

} // InjectionTargetType
