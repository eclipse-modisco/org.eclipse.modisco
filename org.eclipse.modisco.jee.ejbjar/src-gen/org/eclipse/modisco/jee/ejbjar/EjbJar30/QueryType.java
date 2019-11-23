/**
 * Copyright (c) 2010, 2019 Mia-Software.
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The queryType defines a finder or select
 * 	query. It contains
 * 	    - an optional description of the query
 * 	    - the specification of the finder or select
 * 	      method it is used by
 * 		- an optional specification of the result type
 * 		  mapping, if the query is for a select method
 * 		  and entity objects are returned.
 * 		- the EJB QL query string that defines the query.
 * 
 * 	Queries that are expressible in EJB QL must use the ejb-ql
 * 	element to specify the query. If a query is not expressible
 * 	in EJB QL, the description element should be used to
 * 	describe the semantics of the query and the ejb-ql element
 * 	should be empty.
 * 
 * 	The result-type-mapping is an optional element. It can only
 * 	be present if the query-method specifies a select method
 * 	that returns entity objects.  The default value for the
 * 	result-type-mapping element is "Local".
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getQueryMethod <em>Query Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getResultTypeMapping <em>Result Type Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getEjbQl <em>Ejb Ql</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getQueryType()
 * @model extendedMetaData="name='queryType' kind='elementOnly'"
 * @generated
 */
public interface QueryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getQueryType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Query Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Method</em>' containment reference.
	 * @see #setQueryMethod(QueryMethodType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getQueryType_QueryMethod()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='query-method' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	QueryMethodType getQueryMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getQueryMethod <em>Query Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Method</em>' containment reference.
	 * @see #getQueryMethod()
	 * @generated
	 */
	void setQueryMethod(QueryMethodType value);

	/**
	 * Returns the value of the '<em><b>Result Type Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Type Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Type Mapping</em>' containment reference.
	 * @see #setResultTypeMapping(ResultTypeMappingType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getQueryType_ResultTypeMapping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='result-type-mapping' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	ResultTypeMappingType getResultTypeMapping();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getResultTypeMapping <em>Result Type Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Type Mapping</em>' containment reference.
	 * @see #getResultTypeMapping()
	 * @generated
	 */
	void setResultTypeMapping(ResultTypeMappingType value);

	/**
	 * Returns the value of the '<em><b>Ejb Ql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Ql</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Ql</em>' containment reference.
	 * @see #setEjbQl(XsdStringType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getQueryType_EjbQl()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ejb-ql' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdStringType getEjbQl();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getEjbQl <em>Ejb Ql</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Ql</em>' containment reference.
	 * @see #getEjbQl()
	 * @generated
	 */
	void setEjbQl(XsdStringType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getQueryType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // QueryType
