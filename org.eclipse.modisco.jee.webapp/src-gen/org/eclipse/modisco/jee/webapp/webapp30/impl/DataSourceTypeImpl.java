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
package org.eclipse.modisco.jee.webapp.webapp30.impl;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.jee.webapp.webapp30.DataSourceType;
import org.eclipse.modisco.jee.webapp.webapp30.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp30.FullyQualifiedClassType;
import org.eclipse.modisco.jee.webapp.webapp30.IsolationLevelType;
import org.eclipse.modisco.jee.webapp.webapp30.JdbcUrlType;
import org.eclipse.modisco.jee.webapp.webapp30.JndiNameType;
import org.eclipse.modisco.jee.webapp.webapp30.PropertyType;
import org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package;
import org.eclipse.modisco.jee.webapp.webapp30.XsdBooleanType;
import org.eclipse.modisco.jee.webapp.webapp30.XsdIntegerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getServerName <em>Server Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getLoginTimeout <em>Login Timeout</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getTransactional <em>Transactional</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getIsolationLevel <em>Isolation Level</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getInitialPoolSize <em>Initial Pool Size</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getMaxPoolSize <em>Max Pool Size</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getMinPoolSize <em>Min Pool Size</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getMaxIdleTime <em>Max Idle Time</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getMaxStatements <em>Max Statements</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.DataSourceTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSourceTypeImpl extends EObjectImpl implements DataSourceType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DescriptionType description;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected JndiNameType name;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected FullyQualifiedClassType className;

	/**
	 * The cached value of the '{@link #getServerName() <em>Server Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.webapp.webapp30.String serverName;

	/**
	 * The cached value of the '{@link #getPortNumber() <em>Port Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected XsdIntegerType portNumber;

	/**
	 * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.webapp.webapp30.String databaseName;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected JdbcUrlType url;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.webapp.webapp30.String user;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.webapp.webapp30.String password;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyType> property;

	/**
	 * The cached value of the '{@link #getLoginTimeout() <em>Login Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginTimeout()
	 * @generated
	 * @ordered
	 */
	protected XsdIntegerType loginTimeout;

	/**
	 * The cached value of the '{@link #getTransactional() <em>Transactional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactional()
	 * @generated
	 * @ordered
	 */
	protected XsdBooleanType transactional;

	/**
	 * The default value of the '{@link #getIsolationLevel() <em>Isolation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolationLevel()
	 * @generated
	 * @ordered
	 */
	protected static final IsolationLevelType ISOLATION_LEVEL_EDEFAULT = IsolationLevelType.TRANSACTIONREADUNCOMMITTED;

	/**
	 * The cached value of the '{@link #getIsolationLevel() <em>Isolation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolationLevel()
	 * @generated
	 * @ordered
	 */
	protected IsolationLevelType isolationLevel = ISOLATION_LEVEL_EDEFAULT;

	/**
	 * This is true if the Isolation Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isolationLevelESet;

	/**
	 * The cached value of the '{@link #getInitialPoolSize() <em>Initial Pool Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPoolSize()
	 * @generated
	 * @ordered
	 */
	protected XsdIntegerType initialPoolSize;

	/**
	 * The cached value of the '{@link #getMaxPoolSize() <em>Max Pool Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPoolSize()
	 * @generated
	 * @ordered
	 */
	protected XsdIntegerType maxPoolSize;

	/**
	 * The cached value of the '{@link #getMinPoolSize() <em>Min Pool Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPoolSize()
	 * @generated
	 * @ordered
	 */
	protected XsdIntegerType minPoolSize;

	/**
	 * The cached value of the '{@link #getMaxIdleTime() <em>Max Idle Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIdleTime()
	 * @generated
	 * @ordered
	 */
	protected XsdIntegerType maxIdleTime;

	/**
	 * The cached value of the '{@link #getMaxStatements() <em>Max Statements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStatements()
	 * @generated
	 * @ordered
	 */
	protected XsdIntegerType maxStatements;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp30Package.eINSTANCE.getDataSourceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		DescriptionType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JndiNameType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(JndiNameType newName, NotificationChain msgs) {
		JndiNameType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(JndiNameType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedClassType getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassName(FullyQualifiedClassType newClassName, NotificationChain msgs) {
		FullyQualifiedClassType oldClassName = className;
		className = newClassName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__CLASS_NAME, oldClassName, newClassName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(FullyQualifiedClassType newClassName) {
		if (newClassName != className) {
			NotificationChain msgs = null;
			if (className != null)
				msgs = ((InternalEObject)className).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__CLASS_NAME, null, msgs);
			if (newClassName != null)
				msgs = ((InternalEObject)newClassName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__CLASS_NAME, null, msgs);
			msgs = basicSetClassName(newClassName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__CLASS_NAME, newClassName, newClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.webapp.webapp30.String getServerName() {
		return serverName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerName(org.eclipse.modisco.jee.webapp.webapp30.String newServerName, NotificationChain msgs) {
		org.eclipse.modisco.jee.webapp.webapp30.String oldServerName = serverName;
		serverName = newServerName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__SERVER_NAME, oldServerName, newServerName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerName(org.eclipse.modisco.jee.webapp.webapp30.String newServerName) {
		if (newServerName != serverName) {
			NotificationChain msgs = null;
			if (serverName != null)
				msgs = ((InternalEObject)serverName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__SERVER_NAME, null, msgs);
			if (newServerName != null)
				msgs = ((InternalEObject)newServerName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__SERVER_NAME, null, msgs);
			msgs = basicSetServerName(newServerName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__SERVER_NAME, newServerName, newServerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdIntegerType getPortNumber() {
		return portNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortNumber(XsdIntegerType newPortNumber, NotificationChain msgs) {
		XsdIntegerType oldPortNumber = portNumber;
		portNumber = newPortNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__PORT_NUMBER, oldPortNumber, newPortNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortNumber(XsdIntegerType newPortNumber) {
		if (newPortNumber != portNumber) {
			NotificationChain msgs = null;
			if (portNumber != null)
				msgs = ((InternalEObject)portNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__PORT_NUMBER, null, msgs);
			if (newPortNumber != null)
				msgs = ((InternalEObject)newPortNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__PORT_NUMBER, null, msgs);
			msgs = basicSetPortNumber(newPortNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__PORT_NUMBER, newPortNumber, newPortNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.webapp.webapp30.String getDatabaseName() {
		return databaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabaseName(org.eclipse.modisco.jee.webapp.webapp30.String newDatabaseName, NotificationChain msgs) {
		org.eclipse.modisco.jee.webapp.webapp30.String oldDatabaseName = databaseName;
		databaseName = newDatabaseName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__DATABASE_NAME, oldDatabaseName, newDatabaseName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseName(org.eclipse.modisco.jee.webapp.webapp30.String newDatabaseName) {
		if (newDatabaseName != databaseName) {
			NotificationChain msgs = null;
			if (databaseName != null)
				msgs = ((InternalEObject)databaseName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__DATABASE_NAME, null, msgs);
			if (newDatabaseName != null)
				msgs = ((InternalEObject)newDatabaseName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__DATABASE_NAME, null, msgs);
			msgs = basicSetDatabaseName(newDatabaseName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__DATABASE_NAME, newDatabaseName, newDatabaseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JdbcUrlType getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(JdbcUrlType newUrl, NotificationChain msgs) {
		JdbcUrlType oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(JdbcUrlType newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.webapp.webapp30.String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(org.eclipse.modisco.jee.webapp.webapp30.String newUser, NotificationChain msgs) {
		org.eclipse.modisco.jee.webapp.webapp30.String oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__USER, oldUser, newUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(org.eclipse.modisco.jee.webapp.webapp30.String newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject)user).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__USER, null, msgs);
			if (newUser != null)
				msgs = ((InternalEObject)newUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__USER, null, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.webapp.webapp30.String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassword(org.eclipse.modisco.jee.webapp.webapp30.String newPassword, NotificationChain msgs) {
		org.eclipse.modisco.jee.webapp.webapp30.String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__PASSWORD, oldPassword, newPassword);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(org.eclipse.modisco.jee.webapp.webapp30.String newPassword) {
		if (newPassword != password) {
			NotificationChain msgs = null;
			if (password != null)
				msgs = ((InternalEObject)password).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__PASSWORD, null, msgs);
			if (newPassword != null)
				msgs = ((InternalEObject)newPassword).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__PASSWORD, null, msgs);
			msgs = basicSetPassword(newPassword, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__PASSWORD, newPassword, newPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<PropertyType>(PropertyType.class, this, Webapp30Package.DATA_SOURCE_TYPE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdIntegerType getLoginTimeout() {
		return loginTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoginTimeout(XsdIntegerType newLoginTimeout, NotificationChain msgs) {
		XsdIntegerType oldLoginTimeout = loginTimeout;
		loginTimeout = newLoginTimeout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__LOGIN_TIMEOUT, oldLoginTimeout, newLoginTimeout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoginTimeout(XsdIntegerType newLoginTimeout) {
		if (newLoginTimeout != loginTimeout) {
			NotificationChain msgs = null;
			if (loginTimeout != null)
				msgs = ((InternalEObject)loginTimeout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__LOGIN_TIMEOUT, null, msgs);
			if (newLoginTimeout != null)
				msgs = ((InternalEObject)newLoginTimeout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__LOGIN_TIMEOUT, null, msgs);
			msgs = basicSetLoginTimeout(newLoginTimeout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__LOGIN_TIMEOUT, newLoginTimeout, newLoginTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdBooleanType getTransactional() {
		return transactional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactional(XsdBooleanType newTransactional, NotificationChain msgs) {
		XsdBooleanType oldTransactional = transactional;
		transactional = newTransactional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__TRANSACTIONAL, oldTransactional, newTransactional);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactional(XsdBooleanType newTransactional) {
		if (newTransactional != transactional) {
			NotificationChain msgs = null;
			if (transactional != null)
				msgs = ((InternalEObject)transactional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__TRANSACTIONAL, null, msgs);
			if (newTransactional != null)
				msgs = ((InternalEObject)newTransactional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__TRANSACTIONAL, null, msgs);
			msgs = basicSetTransactional(newTransactional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__TRANSACTIONAL, newTransactional, newTransactional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsolationLevelType getIsolationLevel() {
		return isolationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsolationLevel(IsolationLevelType newIsolationLevel) {
		IsolationLevelType oldIsolationLevel = isolationLevel;
		isolationLevel = newIsolationLevel == null ? ISOLATION_LEVEL_EDEFAULT : newIsolationLevel;
		boolean oldIsolationLevelESet = isolationLevelESet;
		isolationLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__ISOLATION_LEVEL, oldIsolationLevel, isolationLevel, !oldIsolationLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsolationLevel() {
		IsolationLevelType oldIsolationLevel = isolationLevel;
		boolean oldIsolationLevelESet = isolationLevelESet;
		isolationLevel = ISOLATION_LEVEL_EDEFAULT;
		isolationLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Webapp30Package.DATA_SOURCE_TYPE__ISOLATION_LEVEL, oldIsolationLevel, ISOLATION_LEVEL_EDEFAULT, oldIsolationLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsolationLevel() {
		return isolationLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdIntegerType getInitialPoolSize() {
		return initialPoolSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialPoolSize(XsdIntegerType newInitialPoolSize, NotificationChain msgs) {
		XsdIntegerType oldInitialPoolSize = initialPoolSize;
		initialPoolSize = newInitialPoolSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__INITIAL_POOL_SIZE, oldInitialPoolSize, newInitialPoolSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialPoolSize(XsdIntegerType newInitialPoolSize) {
		if (newInitialPoolSize != initialPoolSize) {
			NotificationChain msgs = null;
			if (initialPoolSize != null)
				msgs = ((InternalEObject)initialPoolSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__INITIAL_POOL_SIZE, null, msgs);
			if (newInitialPoolSize != null)
				msgs = ((InternalEObject)newInitialPoolSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__INITIAL_POOL_SIZE, null, msgs);
			msgs = basicSetInitialPoolSize(newInitialPoolSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__INITIAL_POOL_SIZE, newInitialPoolSize, newInitialPoolSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdIntegerType getMaxPoolSize() {
		return maxPoolSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxPoolSize(XsdIntegerType newMaxPoolSize, NotificationChain msgs) {
		XsdIntegerType oldMaxPoolSize = maxPoolSize;
		maxPoolSize = newMaxPoolSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__MAX_POOL_SIZE, oldMaxPoolSize, newMaxPoolSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPoolSize(XsdIntegerType newMaxPoolSize) {
		if (newMaxPoolSize != maxPoolSize) {
			NotificationChain msgs = null;
			if (maxPoolSize != null)
				msgs = ((InternalEObject)maxPoolSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__MAX_POOL_SIZE, null, msgs);
			if (newMaxPoolSize != null)
				msgs = ((InternalEObject)newMaxPoolSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__MAX_POOL_SIZE, null, msgs);
			msgs = basicSetMaxPoolSize(newMaxPoolSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__MAX_POOL_SIZE, newMaxPoolSize, newMaxPoolSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdIntegerType getMinPoolSize() {
		return minPoolSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinPoolSize(XsdIntegerType newMinPoolSize, NotificationChain msgs) {
		XsdIntegerType oldMinPoolSize = minPoolSize;
		minPoolSize = newMinPoolSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__MIN_POOL_SIZE, oldMinPoolSize, newMinPoolSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinPoolSize(XsdIntegerType newMinPoolSize) {
		if (newMinPoolSize != minPoolSize) {
			NotificationChain msgs = null;
			if (minPoolSize != null)
				msgs = ((InternalEObject)minPoolSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__MIN_POOL_SIZE, null, msgs);
			if (newMinPoolSize != null)
				msgs = ((InternalEObject)newMinPoolSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__MIN_POOL_SIZE, null, msgs);
			msgs = basicSetMinPoolSize(newMinPoolSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__MIN_POOL_SIZE, newMinPoolSize, newMinPoolSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdIntegerType getMaxIdleTime() {
		return maxIdleTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxIdleTime(XsdIntegerType newMaxIdleTime, NotificationChain msgs) {
		XsdIntegerType oldMaxIdleTime = maxIdleTime;
		maxIdleTime = newMaxIdleTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__MAX_IDLE_TIME, oldMaxIdleTime, newMaxIdleTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxIdleTime(XsdIntegerType newMaxIdleTime) {
		if (newMaxIdleTime != maxIdleTime) {
			NotificationChain msgs = null;
			if (maxIdleTime != null)
				msgs = ((InternalEObject)maxIdleTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__MAX_IDLE_TIME, null, msgs);
			if (newMaxIdleTime != null)
				msgs = ((InternalEObject)newMaxIdleTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__MAX_IDLE_TIME, null, msgs);
			msgs = basicSetMaxIdleTime(newMaxIdleTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__MAX_IDLE_TIME, newMaxIdleTime, newMaxIdleTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdIntegerType getMaxStatements() {
		return maxStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxStatements(XsdIntegerType newMaxStatements, NotificationChain msgs) {
		XsdIntegerType oldMaxStatements = maxStatements;
		maxStatements = newMaxStatements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__MAX_STATEMENTS, oldMaxStatements, newMaxStatements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxStatements(XsdIntegerType newMaxStatements) {
		if (newMaxStatements != maxStatements) {
			NotificationChain msgs = null;
			if (maxStatements != null)
				msgs = ((InternalEObject)maxStatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__MAX_STATEMENTS, null, msgs);
			if (newMaxStatements != null)
				msgs = ((InternalEObject)newMaxStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.DATA_SOURCE_TYPE__MAX_STATEMENTS, null, msgs);
			msgs = basicSetMaxStatements(newMaxStatements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__MAX_STATEMENTS, newMaxStatements, newMaxStatements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.DATA_SOURCE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp30Package.DATA_SOURCE_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case Webapp30Package.DATA_SOURCE_TYPE__NAME:
				return basicSetName(null, msgs);
			case Webapp30Package.DATA_SOURCE_TYPE__CLASS_NAME:
				return basicSetClassName(null, msgs);
			case Webapp30Package.DATA_SOURCE_TYPE__SERVER_NAME:
				return basicSetServerName(null, msgs);
			case Webapp30Package.DATA_SOURCE_TYPE__PORT_NUMBER:
				return basicSetPortNumber(null, msgs);
			case Webapp30Package.DATA_SOURCE_TYPE__DATABASE_NAME:
				return basicSetDatabaseName(null, msgs);
			case Webapp30Package.DATA_SOURCE_TYPE__URL:
				return basicSetUrl(null, msgs);
			case Webapp30Package.DATA_SOURCE_TYPE__USER:
				return basicSetUser(null, msgs);
			case Webapp30Package.DATA_SOURCE_TYPE__PASSWORD:
				return basicSetPassword(null, msgs);
			case Webapp30Package.DATA_SOURCE_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case Webapp30Package.DATA_SOURCE_TYPE__LOGIN_TIMEOUT:
				return basicSetLoginTimeout(null, msgs);
			case Webapp30Package.DATA_SOURCE_TYPE__TRANSACTIONAL:
				return basicSetTransactional(null, msgs);
			case Webapp30Package.DATA_SOURCE_TYPE__INITIAL_POOL_SIZE:
				return basicSetInitialPoolSize(null, msgs);
			case Webapp30Package.DATA_SOURCE_TYPE__MAX_POOL_SIZE:
				return basicSetMaxPoolSize(null, msgs);
			case Webapp30Package.DATA_SOURCE_TYPE__MIN_POOL_SIZE:
				return basicSetMinPoolSize(null, msgs);
			case Webapp30Package.DATA_SOURCE_TYPE__MAX_IDLE_TIME:
				return basicSetMaxIdleTime(null, msgs);
			case Webapp30Package.DATA_SOURCE_TYPE__MAX_STATEMENTS:
				return basicSetMaxStatements(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Webapp30Package.DATA_SOURCE_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp30Package.DATA_SOURCE_TYPE__NAME:
				return getName();
			case Webapp30Package.DATA_SOURCE_TYPE__CLASS_NAME:
				return getClassName();
			case Webapp30Package.DATA_SOURCE_TYPE__SERVER_NAME:
				return getServerName();
			case Webapp30Package.DATA_SOURCE_TYPE__PORT_NUMBER:
				return getPortNumber();
			case Webapp30Package.DATA_SOURCE_TYPE__DATABASE_NAME:
				return getDatabaseName();
			case Webapp30Package.DATA_SOURCE_TYPE__URL:
				return getUrl();
			case Webapp30Package.DATA_SOURCE_TYPE__USER:
				return getUser();
			case Webapp30Package.DATA_SOURCE_TYPE__PASSWORD:
				return getPassword();
			case Webapp30Package.DATA_SOURCE_TYPE__PROPERTY:
				return getProperty();
			case Webapp30Package.DATA_SOURCE_TYPE__LOGIN_TIMEOUT:
				return getLoginTimeout();
			case Webapp30Package.DATA_SOURCE_TYPE__TRANSACTIONAL:
				return getTransactional();
			case Webapp30Package.DATA_SOURCE_TYPE__ISOLATION_LEVEL:
				return getIsolationLevel();
			case Webapp30Package.DATA_SOURCE_TYPE__INITIAL_POOL_SIZE:
				return getInitialPoolSize();
			case Webapp30Package.DATA_SOURCE_TYPE__MAX_POOL_SIZE:
				return getMaxPoolSize();
			case Webapp30Package.DATA_SOURCE_TYPE__MIN_POOL_SIZE:
				return getMinPoolSize();
			case Webapp30Package.DATA_SOURCE_TYPE__MAX_IDLE_TIME:
				return getMaxIdleTime();
			case Webapp30Package.DATA_SOURCE_TYPE__MAX_STATEMENTS:
				return getMaxStatements();
			case Webapp30Package.DATA_SOURCE_TYPE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Webapp30Package.DATA_SOURCE_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__NAME:
				setName((JndiNameType)newValue);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__CLASS_NAME:
				setClassName((FullyQualifiedClassType)newValue);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__SERVER_NAME:
				setServerName((org.eclipse.modisco.jee.webapp.webapp30.String)newValue);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__PORT_NUMBER:
				setPortNumber((XsdIntegerType)newValue);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__DATABASE_NAME:
				setDatabaseName((org.eclipse.modisco.jee.webapp.webapp30.String)newValue);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__URL:
				setUrl((JdbcUrlType)newValue);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__USER:
				setUser((org.eclipse.modisco.jee.webapp.webapp30.String)newValue);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__PASSWORD:
				setPassword((org.eclipse.modisco.jee.webapp.webapp30.String)newValue);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__LOGIN_TIMEOUT:
				setLoginTimeout((XsdIntegerType)newValue);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__TRANSACTIONAL:
				setTransactional((XsdBooleanType)newValue);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__ISOLATION_LEVEL:
				setIsolationLevel((IsolationLevelType)newValue);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__INITIAL_POOL_SIZE:
				setInitialPoolSize((XsdIntegerType)newValue);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__MAX_POOL_SIZE:
				setMaxPoolSize((XsdIntegerType)newValue);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__MIN_POOL_SIZE:
				setMinPoolSize((XsdIntegerType)newValue);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__MAX_IDLE_TIME:
				setMaxIdleTime((XsdIntegerType)newValue);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__MAX_STATEMENTS:
				setMaxStatements((XsdIntegerType)newValue);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__ID:
				setId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Webapp30Package.DATA_SOURCE_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__NAME:
				setName((JndiNameType)null);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__CLASS_NAME:
				setClassName((FullyQualifiedClassType)null);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__SERVER_NAME:
				setServerName((org.eclipse.modisco.jee.webapp.webapp30.String)null);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__PORT_NUMBER:
				setPortNumber((XsdIntegerType)null);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__DATABASE_NAME:
				setDatabaseName((org.eclipse.modisco.jee.webapp.webapp30.String)null);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__URL:
				setUrl((JdbcUrlType)null);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__USER:
				setUser((org.eclipse.modisco.jee.webapp.webapp30.String)null);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__PASSWORD:
				setPassword((org.eclipse.modisco.jee.webapp.webapp30.String)null);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__PROPERTY:
				getProperty().clear();
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__LOGIN_TIMEOUT:
				setLoginTimeout((XsdIntegerType)null);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__TRANSACTIONAL:
				setTransactional((XsdBooleanType)null);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__ISOLATION_LEVEL:
				unsetIsolationLevel();
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__INITIAL_POOL_SIZE:
				setInitialPoolSize((XsdIntegerType)null);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__MAX_POOL_SIZE:
				setMaxPoolSize((XsdIntegerType)null);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__MIN_POOL_SIZE:
				setMinPoolSize((XsdIntegerType)null);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__MAX_IDLE_TIME:
				setMaxIdleTime((XsdIntegerType)null);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__MAX_STATEMENTS:
				setMaxStatements((XsdIntegerType)null);
				return;
			case Webapp30Package.DATA_SOURCE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Webapp30Package.DATA_SOURCE_TYPE__DESCRIPTION:
				return description != null;
			case Webapp30Package.DATA_SOURCE_TYPE__NAME:
				return name != null;
			case Webapp30Package.DATA_SOURCE_TYPE__CLASS_NAME:
				return className != null;
			case Webapp30Package.DATA_SOURCE_TYPE__SERVER_NAME:
				return serverName != null;
			case Webapp30Package.DATA_SOURCE_TYPE__PORT_NUMBER:
				return portNumber != null;
			case Webapp30Package.DATA_SOURCE_TYPE__DATABASE_NAME:
				return databaseName != null;
			case Webapp30Package.DATA_SOURCE_TYPE__URL:
				return url != null;
			case Webapp30Package.DATA_SOURCE_TYPE__USER:
				return user != null;
			case Webapp30Package.DATA_SOURCE_TYPE__PASSWORD:
				return password != null;
			case Webapp30Package.DATA_SOURCE_TYPE__PROPERTY:
				return property != null && !property.isEmpty();
			case Webapp30Package.DATA_SOURCE_TYPE__LOGIN_TIMEOUT:
				return loginTimeout != null;
			case Webapp30Package.DATA_SOURCE_TYPE__TRANSACTIONAL:
				return transactional != null;
			case Webapp30Package.DATA_SOURCE_TYPE__ISOLATION_LEVEL:
				return isSetIsolationLevel();
			case Webapp30Package.DATA_SOURCE_TYPE__INITIAL_POOL_SIZE:
				return initialPoolSize != null;
			case Webapp30Package.DATA_SOURCE_TYPE__MAX_POOL_SIZE:
				return maxPoolSize != null;
			case Webapp30Package.DATA_SOURCE_TYPE__MIN_POOL_SIZE:
				return minPoolSize != null;
			case Webapp30Package.DATA_SOURCE_TYPE__MAX_IDLE_TIME:
				return maxIdleTime != null;
			case Webapp30Package.DATA_SOURCE_TYPE__MAX_STATEMENTS:
				return maxStatements != null;
			case Webapp30Package.DATA_SOURCE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isolationLevel: "); //$NON-NLS-1$
		if (isolationLevelESet) result.append(isolationLevel); else result.append("<unset>"); //$NON-NLS-1$
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //DataSourceTypeImpl
