/**
 *   Copyright (c) 2010, 2019 Mia-Software and others.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp30;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jdbc Url Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <![CDATA[[
 *         The jdbc-urlType contains the url pattern of the mapping.
 *         It must follow the rules specified in Section 9.3 of the
 *         JDBC Specification where the format is:
 *         
 *         jdbc:<subprotocol>:<subname>
 *         
 *         Example:
 *         
 *         <url>jdbc:mysql://localhost:3307/testdb</url>
 *         
 *         ]]>
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getJdbcUrlType()
 * @model extendedMetaData="name='jdbc-urlType' kind='simple'"
 * @generated
 */
public interface JdbcUrlType extends org.eclipse.modisco.jee.webapp.webapp30.String {
} // JdbcUrlType
