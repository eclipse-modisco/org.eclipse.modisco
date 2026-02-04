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
 * A representation of the model object '<em><b>Method Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 	<![CDATA[
 * 
 * 	  The methodType is used to denote a method of an enterprise
 * 	  bean's business, home, component, and/or web service endpoint
 * 	  interface, or, in the case of a message-driven bean, the
 * 	  bean's message listener method, or a set of such
 * 	  methods. The ejb-name element must be the name of one of the
 * 	  enterprise beans declared in the deployment descriptor; the
 * 	  optional method-intf element allows to distinguish between a
 * 	  method with the same signature that is multiply defined
 * 	  across the business, home, component, and/or web service
 *           endpoint nterfaces; the method-name element specifies the
 *           method name; and the optional method-params elements identify
 *           a single method among multiple methods with an overloaded
 * 	  method name.
 * 
 * 	  There are three possible styles of using methodType element
 * 	  within a method element:
 * 
 * 	  1.
 * 	  <method>
 * 	      <ejb-name>EJBNAME</ejb-name>
 * 	      <method-name>*</method-name>
 * 	  </method>
 * 
 * 	     This style is used to refer to all the methods of the
 * 	     specified enterprise bean's business, home, component,
 *              and/or web service endpoint interfaces.
 * 
 * 	  2.
 * 	  <method>
 * 	      <ejb-name>EJBNAME</ejb-name>
 * 	      <method-name>METHOD</method-name>
 * 	  </method>
 * 
 * 	     This style is used to refer to the specified method of
 * 	     the specified enterprise bean. If there are multiple
 * 	     methods with the same overloaded name, the element of
 * 	     this style refers to all the methods with the overloaded
 * 	     name.
 * 
 * 	  3.
 * 	  <method>
 * 	      <ejb-name>EJBNAME</ejb-name>
 * 	      <method-name>METHOD</method-name>
 * 	      <method-params>
 * 		  <method-param>PARAM-1</method-param>
 * 		  <method-param>PARAM-2</method-param>
 * 		  ...
 * 		  <method-param>PARAM-n</method-param>
 * 	      </method-params>
 * 	  </method>
 * 
 * 	     This style is used to refer to a single method within a
 * 	     set of methods with an overloaded name. PARAM-1 through
 * 	     PARAM-n are the fully-qualified Java types of the
 * 	     method's input parameters (if the method has no input
 * 	     arguments, the method-params element contains no
 * 	     method-param elements). Arrays are specified by the
 * 	     array element's type, followed by one or more pair of
 * 	     square brackets (e.g. int[][]). If there are multiple
 * 	     methods with the same overloaded name, this style refers
 * 	     to all of the overloaded methods.
 * 
 * 	  Examples:
 * 
 * 	  Style 1: The following method element refers to all the
 * 	  methods of the EmployeeService bean's business, home,
 *           component, and/or web service endpoint interfaces:
 * 
 * 	  <method>
 * 	      <ejb-name>EmployeeService</ejb-name>
 * 	      <method-name>*</method-name>
 * 	  </method>
 * 
 * 	  Style 2: The following method element refers to all the
 * 	  create methods of the EmployeeService bean's home
 * 	  interface(s).
 * 
 * 	  <method>
 * 	      <ejb-name>EmployeeService</ejb-name>
 * 	      <method-name>create</method-name>
 * 	  </method>
 * 
 * 	  Style 3: The following method element refers to the
 * 	  create(String firstName, String LastName) method of the
 * 	  EmployeeService bean's home interface(s).
 * 
 * 	  <method>
 * 	      <ejb-name>EmployeeService</ejb-name>
 * 	      <method-name>create</method-name>
 * 	      <method-params>
 * 		  <method-param>java.lang.String</method-param>
 * 		  <method-param>java.lang.String</method-param>
 * 	      </method-params>
 * 	  </method>
 * 
 * 	  The following example illustrates a Style 3 element with
 * 	  more complex parameter types. The method
 * 	  foobar(char s, int i, int[] iar, mypackage.MyClass mycl,
 * 	  mypackage.MyClass[][] myclaar) would be specified as:
 * 
 * 	  <method>
 * 	      <ejb-name>EmployeeService</ejb-name>
 * 	      <method-name>foobar</method-name>
 * 	      <method-params>
 * 		  <method-param>char</method-param>
 * 		  <method-param>int</method-param>
 * 		  <method-param>int[]</method-param>
 * 		  <method-param>mypackage.MyClass</method-param>
 * 		  <method-param>mypackage.MyClass[][]</method-param>
 * 	      </method-params>
 * 	  </method>
 * 
 * 	  The optional method-intf element can be used when it becomes
 * 	  necessary to differentiate between a method that is multiply
 * 	  defined across the enterprise bean's business, home, component,
 *           and/or web service endpoint interfaces with the same name and
 * 	  signature. However, if the same method is a method of both the
 *           local business interface, and the local component interface,
 *           the same attribute applies to the method for both interfaces.
 *           Likewise, if the same method is a method of both the remote
 *           business interface and the remote component interface, the same
 *           attribute applies to the method for both interfaces.
 * 
 * 	  For example, the method element
 * 
 * 	  <method>
 * 	      <ejb-name>EmployeeService</ejb-name>
 * 	      <method-intf>Remote</method-intf>
 * 	      <method-name>create</method-name>
 * 	      <method-params>
 * 		  <method-param>java.lang.String</method-param>
 * 		  <method-param>java.lang.String</method-param>
 * 	      </method-params>
 * 	  </method>
 * 
 * 	  can be used to differentiate the create(String, String)
 * 	  method defined in the remote interface from the
 * 	  create(String, String) method defined in the remote home
 * 	  interface, which would be defined as
 * 
 * 	  <method>
 * 	      <ejb-name>EmployeeService</ejb-name>
 * 	      <method-intf>Home</method-intf>
 * 	      <method-name>create</method-name>
 * 	      <method-params>
 * 		  <method-param>java.lang.String</method-param>
 * 		  <method-param>java.lang.String</method-param>
 * 	      </method-params>
 * 	  </method>
 * 
 * 	  and the create method that is defined in the local home
 * 	  interface which would be defined as
 * 
 * 	  <method>
 * 	      <ejb-name>EmployeeService</ejb-name>
 * 	      <method-intf>LocalHome</method-intf>
 * 	      <method-name>create</method-name>
 * 	      <method-params>
 * 		  <method-param>java.lang.String</method-param>
 * 		  <method-param>java.lang.String</method-param>
 * 	      </method-params>
 * 	  </method>
 * 
 * 	  The method-intf element can be used with all three Styles
 * 	  of the method element usage. For example, the following
 * 	  method element example could be used to refer to all the
 * 	  methods of the EmployeeService bean's remote home interface
 *           and the remote business interface.
 * 
 * 	  <method>
 * 	      <ejb-name>EmployeeService</ejb-name>
 * 	      <method-intf>Home</method-intf>
 * 	      <method-name>*</method-name>
 * 	  </method>
 * 
 * 	  ]]>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getMethodIntf <em>Method Intf</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getMethodParams <em>Method Params</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMethodType()
 * @model extendedMetaData="name='methodType' kind='elementOnly'"
 * @generated
 */
public interface MethodType extends EObject {
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMethodType_Description()
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
	 * @see #setEjbName(EjbNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMethodType_EjbName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ejb-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EjbNameType getEjbName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getEjbName <em>Ejb Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Name</em>' containment reference.
	 * @see #getEjbName()
	 * @generated
	 */
	void setEjbName(EjbNameType value);

	/**
	 * Returns the value of the '<em><b>Method Intf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Intf</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Intf</em>' containment reference.
	 * @see #setMethodIntf(MethodIntfType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMethodType_MethodIntf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method-intf' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	MethodIntfType getMethodIntf();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getMethodIntf <em>Method Intf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Intf</em>' containment reference.
	 * @see #getMethodIntf()
	 * @generated
	 */
	void setMethodIntf(MethodIntfType value);

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' containment reference.
	 * @see #setMethodName(MethodNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMethodType_MethodName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='method-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	MethodNameType getMethodName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getMethodName <em>Method Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' containment reference.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(MethodNameType value);

	/**
	 * Returns the value of the '<em><b>Method Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Params</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Params</em>' containment reference.
	 * @see #setMethodParams(MethodParamsType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMethodType_MethodParams()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method-params' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	MethodParamsType getMethodParams();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getMethodParams <em>Method Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Params</em>' containment reference.
	 * @see #getMethodParams()
	 * @generated
	 */
	void setMethodParams(MethodParamsType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMethodType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // MethodType
