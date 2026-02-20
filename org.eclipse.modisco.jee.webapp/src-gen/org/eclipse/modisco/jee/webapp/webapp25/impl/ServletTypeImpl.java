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
package org.eclipse.modisco.jee.webapp.webapp25.impl;

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

import org.eclipse.modisco.jee.webapp.webapp25.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp25.DisplayNameType;
import org.eclipse.modisco.jee.webapp.webapp25.FullyQualifiedClassType;
import org.eclipse.modisco.jee.webapp.webapp25.IconType;
import org.eclipse.modisco.jee.webapp.webapp25.JspFileType;
import org.eclipse.modisco.jee.webapp.webapp25.ParamValueType;
import org.eclipse.modisco.jee.webapp.webapp25.RunAsType;
import org.eclipse.modisco.jee.webapp.webapp25.SecurityRoleRefType;
import org.eclipse.modisco.jee.webapp.webapp25.ServletNameType;
import org.eclipse.modisco.jee.webapp.webapp25.ServletType;
import org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servlet Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ServletTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ServletTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ServletTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ServletTypeImpl#getServletName <em>Servlet Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ServletTypeImpl#getServletClass <em>Servlet Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ServletTypeImpl#getJspFile <em>Jsp File</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ServletTypeImpl#getInitParam <em>Init Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ServletTypeImpl#getLoadOnStartup <em>Load On Startup</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ServletTypeImpl#getRunAs <em>Run As</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ServletTypeImpl#getSecurityRoleRef <em>Security Role Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.ServletTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServletTypeImpl extends EObjectImpl implements ServletType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<DescriptionType> description;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected EList<DisplayNameType> displayName;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected EList<IconType> icon;

	/**
	 * The cached value of the '{@link #getServletName() <em>Servlet Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServletName()
	 * @generated
	 * @ordered
	 */
	protected ServletNameType servletName;

	/**
	 * The cached value of the '{@link #getServletClass() <em>Servlet Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServletClass()
	 * @generated
	 * @ordered
	 */
	protected FullyQualifiedClassType servletClass;

	/**
	 * The cached value of the '{@link #getJspFile() <em>Jsp File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJspFile()
	 * @generated
	 * @ordered
	 */
	protected JspFileType jspFile;

	/**
	 * The cached value of the '{@link #getInitParam() <em>Init Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitParam()
	 * @generated
	 * @ordered
	 */
	protected EList<ParamValueType> initParam;

	/**
	 * The default value of the '{@link #getLoadOnStartup() <em>Load On Startup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadOnStartup()
	 * @generated
	 * @ordered
	 */
	protected static final Object LOAD_ON_STARTUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadOnStartup() <em>Load On Startup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadOnStartup()
	 * @generated
	 * @ordered
	 */
	protected Object loadOnStartup = LOAD_ON_STARTUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRunAs() <em>Run As</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunAs()
	 * @generated
	 * @ordered
	 */
	protected RunAsType runAs;

	/**
	 * The cached value of the '{@link #getSecurityRoleRef() <em>Security Role Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRoleRef()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRoleRefType> securityRoleRef;

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
	protected ServletTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp25Package.Literals.SERVLET_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, Webapp25Package.SERVLET_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisplayNameType> getDisplayName() {
		if (displayName == null) {
			displayName = new EObjectContainmentEList<DisplayNameType>(DisplayNameType.class, this, Webapp25Package.SERVLET_TYPE__DISPLAY_NAME);
		}
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IconType> getIcon() {
		if (icon == null) {
			icon = new EObjectContainmentEList<IconType>(IconType.class, this, Webapp25Package.SERVLET_TYPE__ICON);
		}
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServletNameType getServletName() {
		return servletName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServletName(ServletNameType newServletName, NotificationChain msgs) {
		ServletNameType oldServletName = servletName;
		servletName = newServletName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.SERVLET_TYPE__SERVLET_NAME, oldServletName, newServletName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServletName(ServletNameType newServletName) {
		if (newServletName != servletName) {
			NotificationChain msgs = null;
			if (servletName != null)
				msgs = ((InternalEObject)servletName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.SERVLET_TYPE__SERVLET_NAME, null, msgs);
			if (newServletName != null)
				msgs = ((InternalEObject)newServletName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.SERVLET_TYPE__SERVLET_NAME, null, msgs);
			msgs = basicSetServletName(newServletName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.SERVLET_TYPE__SERVLET_NAME, newServletName, newServletName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedClassType getServletClass() {
		return servletClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServletClass(FullyQualifiedClassType newServletClass, NotificationChain msgs) {
		FullyQualifiedClassType oldServletClass = servletClass;
		servletClass = newServletClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.SERVLET_TYPE__SERVLET_CLASS, oldServletClass, newServletClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServletClass(FullyQualifiedClassType newServletClass) {
		if (newServletClass != servletClass) {
			NotificationChain msgs = null;
			if (servletClass != null)
				msgs = ((InternalEObject)servletClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.SERVLET_TYPE__SERVLET_CLASS, null, msgs);
			if (newServletClass != null)
				msgs = ((InternalEObject)newServletClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.SERVLET_TYPE__SERVLET_CLASS, null, msgs);
			msgs = basicSetServletClass(newServletClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.SERVLET_TYPE__SERVLET_CLASS, newServletClass, newServletClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JspFileType getJspFile() {
		return jspFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJspFile(JspFileType newJspFile, NotificationChain msgs) {
		JspFileType oldJspFile = jspFile;
		jspFile = newJspFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.SERVLET_TYPE__JSP_FILE, oldJspFile, newJspFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJspFile(JspFileType newJspFile) {
		if (newJspFile != jspFile) {
			NotificationChain msgs = null;
			if (jspFile != null)
				msgs = ((InternalEObject)jspFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.SERVLET_TYPE__JSP_FILE, null, msgs);
			if (newJspFile != null)
				msgs = ((InternalEObject)newJspFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.SERVLET_TYPE__JSP_FILE, null, msgs);
			msgs = basicSetJspFile(newJspFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.SERVLET_TYPE__JSP_FILE, newJspFile, newJspFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamValueType> getInitParam() {
		if (initParam == null) {
			initParam = new EObjectContainmentEList<ParamValueType>(ParamValueType.class, this, Webapp25Package.SERVLET_TYPE__INIT_PARAM);
		}
		return initParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLoadOnStartup() {
		return loadOnStartup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadOnStartup(Object newLoadOnStartup) {
		Object oldLoadOnStartup = loadOnStartup;
		loadOnStartup = newLoadOnStartup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.SERVLET_TYPE__LOAD_ON_STARTUP, oldLoadOnStartup, loadOnStartup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunAsType getRunAs() {
		return runAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunAs(RunAsType newRunAs, NotificationChain msgs) {
		RunAsType oldRunAs = runAs;
		runAs = newRunAs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.SERVLET_TYPE__RUN_AS, oldRunAs, newRunAs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunAs(RunAsType newRunAs) {
		if (newRunAs != runAs) {
			NotificationChain msgs = null;
			if (runAs != null)
				msgs = ((InternalEObject)runAs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.SERVLET_TYPE__RUN_AS, null, msgs);
			if (newRunAs != null)
				msgs = ((InternalEObject)newRunAs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.SERVLET_TYPE__RUN_AS, null, msgs);
			msgs = basicSetRunAs(newRunAs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.SERVLET_TYPE__RUN_AS, newRunAs, newRunAs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRoleRefType> getSecurityRoleRef() {
		if (securityRoleRef == null) {
			securityRoleRef = new EObjectContainmentEList<SecurityRoleRefType>(SecurityRoleRefType.class, this, Webapp25Package.SERVLET_TYPE__SECURITY_ROLE_REF);
		}
		return securityRoleRef;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.SERVLET_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp25Package.SERVLET_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case Webapp25Package.SERVLET_TYPE__DISPLAY_NAME:
				return ((InternalEList<?>)getDisplayName()).basicRemove(otherEnd, msgs);
			case Webapp25Package.SERVLET_TYPE__ICON:
				return ((InternalEList<?>)getIcon()).basicRemove(otherEnd, msgs);
			case Webapp25Package.SERVLET_TYPE__SERVLET_NAME:
				return basicSetServletName(null, msgs);
			case Webapp25Package.SERVLET_TYPE__SERVLET_CLASS:
				return basicSetServletClass(null, msgs);
			case Webapp25Package.SERVLET_TYPE__JSP_FILE:
				return basicSetJspFile(null, msgs);
			case Webapp25Package.SERVLET_TYPE__INIT_PARAM:
				return ((InternalEList<?>)getInitParam()).basicRemove(otherEnd, msgs);
			case Webapp25Package.SERVLET_TYPE__RUN_AS:
				return basicSetRunAs(null, msgs);
			case Webapp25Package.SERVLET_TYPE__SECURITY_ROLE_REF:
				return ((InternalEList<?>)getSecurityRoleRef()).basicRemove(otherEnd, msgs);
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
			case Webapp25Package.SERVLET_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp25Package.SERVLET_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case Webapp25Package.SERVLET_TYPE__ICON:
				return getIcon();
			case Webapp25Package.SERVLET_TYPE__SERVLET_NAME:
				return getServletName();
			case Webapp25Package.SERVLET_TYPE__SERVLET_CLASS:
				return getServletClass();
			case Webapp25Package.SERVLET_TYPE__JSP_FILE:
				return getJspFile();
			case Webapp25Package.SERVLET_TYPE__INIT_PARAM:
				return getInitParam();
			case Webapp25Package.SERVLET_TYPE__LOAD_ON_STARTUP:
				return getLoadOnStartup();
			case Webapp25Package.SERVLET_TYPE__RUN_AS:
				return getRunAs();
			case Webapp25Package.SERVLET_TYPE__SECURITY_ROLE_REF:
				return getSecurityRoleRef();
			case Webapp25Package.SERVLET_TYPE__ID:
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
			case Webapp25Package.SERVLET_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case Webapp25Package.SERVLET_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				getDisplayName().addAll((Collection<? extends DisplayNameType>)newValue);
				return;
			case Webapp25Package.SERVLET_TYPE__ICON:
				getIcon().clear();
				getIcon().addAll((Collection<? extends IconType>)newValue);
				return;
			case Webapp25Package.SERVLET_TYPE__SERVLET_NAME:
				setServletName((ServletNameType)newValue);
				return;
			case Webapp25Package.SERVLET_TYPE__SERVLET_CLASS:
				setServletClass((FullyQualifiedClassType)newValue);
				return;
			case Webapp25Package.SERVLET_TYPE__JSP_FILE:
				setJspFile((JspFileType)newValue);
				return;
			case Webapp25Package.SERVLET_TYPE__INIT_PARAM:
				getInitParam().clear();
				getInitParam().addAll((Collection<? extends ParamValueType>)newValue);
				return;
			case Webapp25Package.SERVLET_TYPE__LOAD_ON_STARTUP:
				setLoadOnStartup(newValue);
				return;
			case Webapp25Package.SERVLET_TYPE__RUN_AS:
				setRunAs((RunAsType)newValue);
				return;
			case Webapp25Package.SERVLET_TYPE__SECURITY_ROLE_REF:
				getSecurityRoleRef().clear();
				getSecurityRoleRef().addAll((Collection<? extends SecurityRoleRefType>)newValue);
				return;
			case Webapp25Package.SERVLET_TYPE__ID:
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
			case Webapp25Package.SERVLET_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case Webapp25Package.SERVLET_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				return;
			case Webapp25Package.SERVLET_TYPE__ICON:
				getIcon().clear();
				return;
			case Webapp25Package.SERVLET_TYPE__SERVLET_NAME:
				setServletName((ServletNameType)null);
				return;
			case Webapp25Package.SERVLET_TYPE__SERVLET_CLASS:
				setServletClass((FullyQualifiedClassType)null);
				return;
			case Webapp25Package.SERVLET_TYPE__JSP_FILE:
				setJspFile((JspFileType)null);
				return;
			case Webapp25Package.SERVLET_TYPE__INIT_PARAM:
				getInitParam().clear();
				return;
			case Webapp25Package.SERVLET_TYPE__LOAD_ON_STARTUP:
				setLoadOnStartup(LOAD_ON_STARTUP_EDEFAULT);
				return;
			case Webapp25Package.SERVLET_TYPE__RUN_AS:
				setRunAs((RunAsType)null);
				return;
			case Webapp25Package.SERVLET_TYPE__SECURITY_ROLE_REF:
				getSecurityRoleRef().clear();
				return;
			case Webapp25Package.SERVLET_TYPE__ID:
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
			case Webapp25Package.SERVLET_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case Webapp25Package.SERVLET_TYPE__DISPLAY_NAME:
				return displayName != null && !displayName.isEmpty();
			case Webapp25Package.SERVLET_TYPE__ICON:
				return icon != null && !icon.isEmpty();
			case Webapp25Package.SERVLET_TYPE__SERVLET_NAME:
				return servletName != null;
			case Webapp25Package.SERVLET_TYPE__SERVLET_CLASS:
				return servletClass != null;
			case Webapp25Package.SERVLET_TYPE__JSP_FILE:
				return jspFile != null;
			case Webapp25Package.SERVLET_TYPE__INIT_PARAM:
				return initParam != null && !initParam.isEmpty();
			case Webapp25Package.SERVLET_TYPE__LOAD_ON_STARTUP:
				return LOAD_ON_STARTUP_EDEFAULT == null ? loadOnStartup != null : !LOAD_ON_STARTUP_EDEFAULT.equals(loadOnStartup);
			case Webapp25Package.SERVLET_TYPE__RUN_AS:
				return runAs != null;
			case Webapp25Package.SERVLET_TYPE__SECURITY_ROLE_REF:
				return securityRoleRef != null && !securityRoleRef.isEmpty();
			case Webapp25Package.SERVLET_TYPE__ID:
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (loadOnStartup: "); //$NON-NLS-1$
		result.append(loadOnStartup);
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ServletTypeImpl
