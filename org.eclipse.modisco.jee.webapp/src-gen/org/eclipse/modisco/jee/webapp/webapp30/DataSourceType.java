/**
 *   Copyright (c) 2010 Mia-Software.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp30;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         Configuration of a DataSource.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getServerName <em>Server Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getUser <em>User</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getLoginTimeout <em>Login Timeout</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getTransactional <em>Transactional</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getIsolationLevel <em>Isolation Level</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getInitialPoolSize <em>Initial Pool Size</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getMaxPoolSize <em>Max Pool Size</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getMinPoolSize <em>Min Pool Size</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getMaxIdleTime <em>Max Idle Time</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getMaxStatements <em>Max Statements</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType()
 * @model extendedMetaData="name='data-sourceType' kind='elementOnly'"
 * @generated
 */
public interface DataSourceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Description of this DataSource.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The name element specifies the JNDI name of the
	 *             data source being defined.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(JndiNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	JndiNameType getName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(JndiNameType value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             DataSource, XADataSource or ConnectionPoolDataSource
	 *             implementation class.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Name</em>' containment reference.
	 * @see #setClassName(FullyQualifiedClassType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_ClassName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	FullyQualifiedClassType getClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getClassName <em>Class Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' containment reference.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(FullyQualifiedClassType value);

	/**
	 * Returns the value of the '<em><b>Server Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Database server name.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Server Name</em>' containment reference.
	 * @see #setServerName(org.eclipse.modisco.jee.webapp.webapp30.String)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_ServerName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='server-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.webapp.webapp30.String getServerName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getServerName <em>Server Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Name</em>' containment reference.
	 * @see #getServerName()
	 * @generated
	 */
	void setServerName(org.eclipse.modisco.jee.webapp.webapp30.String value);

	/**
	 * Returns the value of the '<em><b>Port Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Port number where a server is listening for requests.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Number</em>' containment reference.
	 * @see #setPortNumber(XsdIntegerType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_PortNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='port-number' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdIntegerType getPortNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getPortNumber <em>Port Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Number</em>' containment reference.
	 * @see #getPortNumber()
	 * @generated
	 */
	void setPortNumber(XsdIntegerType value);

	/**
	 * Returns the value of the '<em><b>Database Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Name of a database on a server.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Database Name</em>' containment reference.
	 * @see #setDatabaseName(org.eclipse.modisco.jee.webapp.webapp30.String)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_DatabaseName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='database-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.webapp.webapp30.String getDatabaseName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getDatabaseName <em>Database Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' containment reference.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(org.eclipse.modisco.jee.webapp.webapp30.String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             <![CDATA[[
	 *             A JDBC URL. If the <code>url</code> property is specified
	 *             along with other standard <code>DataSource</code> properties
	 *             such as <code>serverName</code>, <code>databaseName</code>
	 *             and <code>portNumber</code>, the more specific properties will
	 *             take precedence and <code>url</code> will be ignored.
	 *             
	 *             ]]>
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(JdbcUrlType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	JdbcUrlType getUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(JdbcUrlType value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             User name to use for connection authentication.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User</em>' containment reference.
	 * @see #setUser(org.eclipse.modisco.jee.webapp.webapp30.String)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_User()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='user' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.webapp.webapp30.String getUser();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getUser <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' containment reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(org.eclipse.modisco.jee.webapp.webapp30.String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Password to use for connection authentication.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' containment reference.
	 * @see #setPassword(org.eclipse.modisco.jee.webapp.webapp30.String)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_Password()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='password' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.webapp.webapp30.String getPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getPassword <em>Password</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' containment reference.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(org.eclipse.modisco.jee.webapp.webapp30.String value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp30.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             JDBC DataSource property.  This may be a vendor-specific
	 *             property or a less commonly used DataSource property.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<PropertyType> getProperty();

	/**
	 * Returns the value of the '<em><b>Login Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Sets the maximum time in seconds that this data source
	 *             will wait while attempting to connect to a database.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Login Timeout</em>' containment reference.
	 * @see #setLoginTimeout(XsdIntegerType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_LoginTimeout()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='login-timeout' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdIntegerType getLoginTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getLoginTimeout <em>Login Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Timeout</em>' containment reference.
	 * @see #getLoginTimeout()
	 * @generated
	 */
	void setLoginTimeout(XsdIntegerType value);

	/**
	 * Returns the value of the '<em><b>Transactional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Set to false if connections should not participate in
	 *             transactions.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transactional</em>' containment reference.
	 * @see #setTransactional(XsdBooleanType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_Transactional()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transactional' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdBooleanType getTransactional();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getTransactional <em>Transactional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transactional</em>' containment reference.
	 * @see #getTransactional()
	 * @generated
	 */
	void setTransactional(XsdBooleanType value);

	/**
	 * Returns the value of the '<em><b>Isolation Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.modisco.jee.webapp.webapp30.IsolationLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Isolation level for connections.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Isolation Level</em>' attribute.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.IsolationLevelType
	 * @see #isSetIsolationLevel()
	 * @see #unsetIsolationLevel()
	 * @see #setIsolationLevel(IsolationLevelType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_IsolationLevel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='isolation-level' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	IsolationLevelType getIsolationLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getIsolationLevel <em>Isolation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isolation Level</em>' attribute.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.IsolationLevelType
	 * @see #isSetIsolationLevel()
	 * @see #unsetIsolationLevel()
	 * @see #getIsolationLevel()
	 * @generated
	 */
	void setIsolationLevel(IsolationLevelType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getIsolationLevel <em>Isolation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsolationLevel()
	 * @see #getIsolationLevel()
	 * @see #setIsolationLevel(IsolationLevelType)
	 * @generated
	 */
	void unsetIsolationLevel();

	/**
	 * Returns whether the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getIsolationLevel <em>Isolation Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Isolation Level</em>' attribute is set.
	 * @see #unsetIsolationLevel()
	 * @see #getIsolationLevel()
	 * @see #setIsolationLevel(IsolationLevelType)
	 * @generated
	 */
	boolean isSetIsolationLevel();

	/**
	 * Returns the value of the '<em><b>Initial Pool Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Number of connections that should be created when a
	 *             connection pool is initialized.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Pool Size</em>' containment reference.
	 * @see #setInitialPoolSize(XsdIntegerType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_InitialPoolSize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initial-pool-size' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdIntegerType getInitialPoolSize();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getInitialPoolSize <em>Initial Pool Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Pool Size</em>' containment reference.
	 * @see #getInitialPoolSize()
	 * @generated
	 */
	void setInitialPoolSize(XsdIntegerType value);

	/**
	 * Returns the value of the '<em><b>Max Pool Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Maximum number of connections that should be concurrently
	 *             allocated for a connection pool.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Pool Size</em>' containment reference.
	 * @see #setMaxPoolSize(XsdIntegerType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_MaxPoolSize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='max-pool-size' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdIntegerType getMaxPoolSize();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getMaxPoolSize <em>Max Pool Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Pool Size</em>' containment reference.
	 * @see #getMaxPoolSize()
	 * @generated
	 */
	void setMaxPoolSize(XsdIntegerType value);

	/**
	 * Returns the value of the '<em><b>Min Pool Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Minimum number of connections that should be concurrently
	 *             allocated for a connection pool.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Pool Size</em>' containment reference.
	 * @see #setMinPoolSize(XsdIntegerType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_MinPoolSize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='min-pool-size' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdIntegerType getMinPoolSize();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getMinPoolSize <em>Min Pool Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Pool Size</em>' containment reference.
	 * @see #getMinPoolSize()
	 * @generated
	 */
	void setMinPoolSize(XsdIntegerType value);

	/**
	 * Returns the value of the '<em><b>Max Idle Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The number of seconds that a physical connection should
	 *             remain unused in the pool before the connection is
	 *             closed for a connection pool.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Idle Time</em>' containment reference.
	 * @see #setMaxIdleTime(XsdIntegerType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_MaxIdleTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='max-idle-time' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdIntegerType getMaxIdleTime();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getMaxIdleTime <em>Max Idle Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Idle Time</em>' containment reference.
	 * @see #getMaxIdleTime()
	 * @generated
	 */
	void setMaxIdleTime(XsdIntegerType value);

	/**
	 * Returns the value of the '<em><b>Max Statements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The total number of statements that a connection pool
	 *             should keep open.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Statements</em>' containment reference.
	 * @see #setMaxStatements(XsdIntegerType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_MaxStatements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='max-statements' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdIntegerType getMaxStatements();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getMaxStatements <em>Max Statements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Statements</em>' containment reference.
	 * @see #getMaxStatements()
	 * @generated
	 */
	void setMaxStatements(XsdIntegerType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getDataSourceType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.DataSourceType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // DataSourceType
