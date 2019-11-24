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
package org.eclipse.modisco.jee.ejbjar.EjbJar30;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interceptor Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The interceptor-bindingType element describes the binding of
 *         interceptor classes to beans within the ejb-jar.
 *         It consists of :
 * 
 *           - An optional description.
 *           - The name of an ejb within the ejb-jar or the wildcard value "*",
 *             which is used to define interceptors that are bound to all
 *             beans in the ejb-jar.
 *           - A list of interceptor classes that are bound to the contents of
 *             the ejb-name element or a specification of the total ordering
 *             over the interceptors defined for the given level and above.
 *           - An optional exclude-default-interceptors element.  If set to true,
 *             specifies that default interceptors are not to be applied to
 *             a bean-class and/or business method.
 *           - An optional exclude-class-interceptors element.  If set to true,
 *             specifies that class interceptors are not to be applied to
 *             a business method.
 *           - An optional set of method elements for describing the name/params
 *             of a method-level interceptor.
 * 
 *          Interceptors bound to all classes using the wildcard syntax
 *          "*" are default interceptors for the components in the ejb-jar.
 *          In addition, interceptors may be bound at the level of the bean
 *          class (class-level interceptors) or business methods (method-level
 *          interceptors ).
 * 
 *          The binding of interceptors to classes is additive.  If interceptors
 *          are bound at the class-level and/or default-level as well as the
 *          method-level, both class-level and/or default-level as well as
 *          method-level will apply.
 * 
 *          There are four possible styles of the interceptor element syntax :
 * 
 *          1.
 *          <interceptor-binding xmlns="http://www.w3.org/2001/XMLSchema">
 *            <ejb-name>*</ejb-name>
 *            <interceptor-class>INTERCEPTOR</interceptor-class>
 *          </interceptor-binding>
 * 
 *          Specifying the ejb-name as the wildcard value "*" designates
 *          default interceptors (interceptors that apply to all session and
 *          message-driven beans contained in the ejb-jar).
 * 
 *          2.
 *          <interceptor-binding xmlns="http://www.w3.org/2001/XMLSchema">
 *            <ejb-name>EJBNAME</ejb-name>
 *            <interceptor-class>INTERCEPTOR</interceptor-class>
 *          </interceptor-binding>
 * 
 *          This style is used to refer to interceptors associated with the
 *          specified enterprise bean(class-level interceptors).
 * 
 *          3.
 *          <interceptor-binding xmlns="http://www.w3.org/2001/XMLSchema">
 *            <ejb-name>EJBNAME</ejb-name>
 *            <interceptor-class>INTERCEPTOR</interceptor-class>
 *            <method>
 *              <method-name>METHOD</method-name>
 *            </method>
 *          </interceptor-binding>
 * 
 *          This style is used to associate a method-level interceptor with
 *          the specified enterprise bean.  If there are multiple methods
 *          with the same overloaded name, the element of this style refers
 *          to all the methods with the overloaded name.  Method-level
 *          interceptors can only be associated with business methods of the
 *          bean class.   Note that the wildcard value "*" cannot be used
 *          to specify method-level interceptors.
 * 
 *          4.
 *          <interceptor-binding xmlns="http://www.w3.org/2001/XMLSchema">
 *            <ejb-name>EJBNAME</ejb-name>
 *            <interceptor-class>INTERCEPTOR</interceptor-class>
 *            <method>
 *              <method-name>METHOD</method-name>
 *              <method-params>
 *                <method-param>PARAM-1</method-param>
 *                <method-param>PARAM-2</method-param>
 *                ...
 *                <method-param>PARAM-N</method-param>
 *              </method-params>
 *            </method>
 *          </interceptor-binding>
 * 
 *          This style is used to associate a method-level interceptor with
 *          the specified method of the specified enterprise bean.  This
 *          style is used to refer to a single method within a set of methods
 *          with an overloaded name.  The values PARAM-1 through PARAM-N
 *          are the fully-qualified Java types of the method's input parameters
 *          (if the method has no input arguments, the method-params element
 *          contains no method-param elements). Arrays are specified by the
 *          array element's type, followed by one or more pair of square
 *          brackets (e.g. int[][]).
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getInterceptorClass <em>Interceptor Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getInterceptorOrder <em>Interceptor Order</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getExcludeDefaultInterceptors <em>Exclude Default Interceptors</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getExcludeClassInterceptors <em>Exclude Class Interceptors</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getInterceptorBindingType()
 * @model extendedMetaData="name='interceptor-bindingType' kind='elementOnly'"
 * @generated
 */
public interface InterceptorBindingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getInterceptorBindingType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Ejb Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Name</em>' containment reference.
	 * @see #setEjbName(org.eclipse.modisco.jee.ejbjar.EjbJar30.String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getInterceptorBindingType_EjbName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ejb-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.ejbjar.EjbJar30.String getEjbName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getEjbName <em>Ejb Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Name</em>' containment reference.
	 * @see #getEjbName()
	 * @generated
	 */
	void setEjbName(org.eclipse.modisco.jee.ejbjar.EjbJar30.String value);

	/**
	 * Returns the value of the '<em><b>Interceptor Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.FullyQualifiedClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interceptor Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interceptor Class</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getInterceptorBindingType_InterceptorClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interceptor-class' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<FullyQualifiedClassType> getInterceptorClass();

	/**
	 * Returns the value of the '<em><b>Interceptor Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interceptor Order</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interceptor Order</em>' containment reference.
	 * @see #setInterceptorOrder(InterceptorOrderType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getInterceptorBindingType_InterceptorOrder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interceptor-order' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	InterceptorOrderType getInterceptorOrder();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getInterceptorOrder <em>Interceptor Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interceptor Order</em>' containment reference.
	 * @see #getInterceptorOrder()
	 * @generated
	 */
	void setInterceptorOrder(InterceptorOrderType value);

	/**
	 * Returns the value of the '<em><b>Exclude Default Interceptors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Default Interceptors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Default Interceptors</em>' containment reference.
	 * @see #setExcludeDefaultInterceptors(TrueFalseType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getInterceptorBindingType_ExcludeDefaultInterceptors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude-default-interceptors' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TrueFalseType getExcludeDefaultInterceptors();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getExcludeDefaultInterceptors <em>Exclude Default Interceptors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Default Interceptors</em>' containment reference.
	 * @see #getExcludeDefaultInterceptors()
	 * @generated
	 */
	void setExcludeDefaultInterceptors(TrueFalseType value);

	/**
	 * Returns the value of the '<em><b>Exclude Class Interceptors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Class Interceptors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Class Interceptors</em>' containment reference.
	 * @see #setExcludeClassInterceptors(TrueFalseType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getInterceptorBindingType_ExcludeClassInterceptors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude-class-interceptors' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TrueFalseType getExcludeClassInterceptors();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getExcludeClassInterceptors <em>Exclude Class Interceptors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Class Interceptors</em>' containment reference.
	 * @see #getExcludeClassInterceptors()
	 * @generated
	 */
	void setExcludeClassInterceptors(TrueFalseType value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(NamedMethodType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getInterceptorBindingType_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	NamedMethodType getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(NamedMethodType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getInterceptorBindingType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // InterceptorBindingType
