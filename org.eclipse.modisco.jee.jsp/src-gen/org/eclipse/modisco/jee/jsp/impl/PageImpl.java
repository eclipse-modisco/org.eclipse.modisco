/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *   
 *   	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.jsp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.jee.jsp.JspPackage;
import org.eclipse.modisco.jee.jsp.Model;
import org.eclipse.modisco.jee.jsp.Page;
import org.eclipse.modisco.xml.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.jsp.impl.PageImpl#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.jsp.impl.PageImpl#getXmlDeclaration <em>Xml Declaration</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.jsp.impl.PageImpl#getDoctype <em>Doctype</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.jsp.impl.PageImpl#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.jsp.impl.PageImpl#getPageOwner <em>Page Owner</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.jsp.impl.PageImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends EObjectImpl implements Page {
	/**
	 * The default value of the '{@link #getOriginalFilePath() <em>Original File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalFilePath() <em>Original File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalFilePath()
	 * @generated
	 * @ordered
	 */
	protected String originalFilePath = ORIGINAL_FILE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getXmlDeclaration() <em>Xml Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_DECLARATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlDeclaration() <em>Xml Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlDeclaration()
	 * @generated
	 * @ordered
	 */
	protected String xmlDeclaration = XML_DECLARATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoctype() <em>Doctype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctype()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoctype() <em>Doctype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctype()
	 * @generated
	 * @ordered
	 */
	protected String doctype = DOCTYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedElements() <em>Owned Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> ownedElements;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JspPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginalFilePath() {
		return originalFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalFilePath(String newOriginalFilePath) {
		String oldOriginalFilePath = originalFilePath;
		originalFilePath = newOriginalFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JspPackage.PAGE__ORIGINAL_FILE_PATH, oldOriginalFilePath, originalFilePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXmlDeclaration() {
		return xmlDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlDeclaration(String newXmlDeclaration) {
		String oldXmlDeclaration = xmlDeclaration;
		xmlDeclaration = newXmlDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JspPackage.PAGE__XML_DECLARATION, oldXmlDeclaration, xmlDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDoctype() {
		return doctype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoctype(String newDoctype) {
		String oldDoctype = doctype;
		doctype = newDoctype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JspPackage.PAGE__DOCTYPE, oldDoctype, doctype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getOwnedElements() {
		if (ownedElements == null) {
			ownedElements = new EObjectContainmentEList<Node>(Node.class, this, JspPackage.PAGE__OWNED_ELEMENTS);
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getPageOwner() {
		if (eContainerFeatureID() != JspPackage.PAGE__PAGE_OWNER) return null;
		return (Model)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageOwner(Model newPageOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPageOwner, JspPackage.PAGE__PAGE_OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageOwner(Model newPageOwner) {
		if (newPageOwner != eInternalContainer() || (eContainerFeatureID() != JspPackage.PAGE__PAGE_OWNER && newPageOwner != null)) {
			if (EcoreUtil.isAncestor(this, newPageOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPageOwner != null)
				msgs = ((InternalEObject)newPageOwner).eInverseAdd(this, JspPackage.MODEL__PAGES, Model.class, msgs);
			msgs = basicSetPageOwner(newPageOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JspPackage.PAGE__PAGE_OWNER, newPageOwner, newPageOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JspPackage.PAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JspPackage.PAGE__PAGE_OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPageOwner((Model)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JspPackage.PAGE__OWNED_ELEMENTS:
				return ((InternalEList<?>)getOwnedElements()).basicRemove(otherEnd, msgs);
			case JspPackage.PAGE__PAGE_OWNER:
				return basicSetPageOwner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JspPackage.PAGE__PAGE_OWNER:
				return eInternalContainer().eInverseRemove(this, JspPackage.MODEL__PAGES, Model.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JspPackage.PAGE__ORIGINAL_FILE_PATH:
				return getOriginalFilePath();
			case JspPackage.PAGE__XML_DECLARATION:
				return getXmlDeclaration();
			case JspPackage.PAGE__DOCTYPE:
				return getDoctype();
			case JspPackage.PAGE__OWNED_ELEMENTS:
				return getOwnedElements();
			case JspPackage.PAGE__PAGE_OWNER:
				return getPageOwner();
			case JspPackage.PAGE__NAME:
				return getName();
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
			case JspPackage.PAGE__ORIGINAL_FILE_PATH:
				setOriginalFilePath((String)newValue);
				return;
			case JspPackage.PAGE__XML_DECLARATION:
				setXmlDeclaration((String)newValue);
				return;
			case JspPackage.PAGE__DOCTYPE:
				setDoctype((String)newValue);
				return;
			case JspPackage.PAGE__OWNED_ELEMENTS:
				getOwnedElements().clear();
				getOwnedElements().addAll((Collection<? extends Node>)newValue);
				return;
			case JspPackage.PAGE__PAGE_OWNER:
				setPageOwner((Model)newValue);
				return;
			case JspPackage.PAGE__NAME:
				setName((String)newValue);
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
			case JspPackage.PAGE__ORIGINAL_FILE_PATH:
				setOriginalFilePath(ORIGINAL_FILE_PATH_EDEFAULT);
				return;
			case JspPackage.PAGE__XML_DECLARATION:
				setXmlDeclaration(XML_DECLARATION_EDEFAULT);
				return;
			case JspPackage.PAGE__DOCTYPE:
				setDoctype(DOCTYPE_EDEFAULT);
				return;
			case JspPackage.PAGE__OWNED_ELEMENTS:
				getOwnedElements().clear();
				return;
			case JspPackage.PAGE__PAGE_OWNER:
				setPageOwner((Model)null);
				return;
			case JspPackage.PAGE__NAME:
				setName(NAME_EDEFAULT);
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
			case JspPackage.PAGE__ORIGINAL_FILE_PATH:
				return ORIGINAL_FILE_PATH_EDEFAULT == null ? originalFilePath != null : !ORIGINAL_FILE_PATH_EDEFAULT.equals(originalFilePath);
			case JspPackage.PAGE__XML_DECLARATION:
				return XML_DECLARATION_EDEFAULT == null ? xmlDeclaration != null : !XML_DECLARATION_EDEFAULT.equals(xmlDeclaration);
			case JspPackage.PAGE__DOCTYPE:
				return DOCTYPE_EDEFAULT == null ? doctype != null : !DOCTYPE_EDEFAULT.equals(doctype);
			case JspPackage.PAGE__OWNED_ELEMENTS:
				return ownedElements != null && !ownedElements.isEmpty();
			case JspPackage.PAGE__PAGE_OWNER:
				return getPageOwner() != null;
			case JspPackage.PAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (originalFilePath: "); //$NON-NLS-1$
		result.append(originalFilePath);
		result.append(", xmlDeclaration: "); //$NON-NLS-1$
		result.append(xmlDeclaration);
		result.append(", doctype: "); //$NON-NLS-1$
		result.append(doctype);
		result.append(", name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PageImpl
