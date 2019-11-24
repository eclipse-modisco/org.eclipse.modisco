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
import org.eclipse.modisco.jee.webapp.webapp25.IconType;
import org.eclipse.modisco.jee.webapp.webapp25.JspPropertyGroupType;
import org.eclipse.modisco.jee.webapp.webapp25.PathType;
import org.eclipse.modisco.jee.webapp.webapp25.TrueFalseType;
import org.eclipse.modisco.jee.webapp.webapp25.UrlPatternType;
import org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jsp Property Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.JspPropertyGroupTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.JspPropertyGroupTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.JspPropertyGroupTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.JspPropertyGroupTypeImpl#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.JspPropertyGroupTypeImpl#getElIgnored <em>El Ignored</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.JspPropertyGroupTypeImpl#getPageEncoding <em>Page Encoding</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.JspPropertyGroupTypeImpl#getScriptingInvalid <em>Scripting Invalid</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.JspPropertyGroupTypeImpl#getIsXml <em>Is Xml</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.JspPropertyGroupTypeImpl#getIncludePrelude <em>Include Prelude</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.JspPropertyGroupTypeImpl#getIncludeCoda <em>Include Coda</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.JspPropertyGroupTypeImpl#getDeferredSyntaxAllowedAsLiteral <em>Deferred Syntax Allowed As Literal</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.JspPropertyGroupTypeImpl#getTrimDirectiveWhitespaces <em>Trim Directive Whitespaces</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.JspPropertyGroupTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JspPropertyGroupTypeImpl extends EObjectImpl implements JspPropertyGroupType {
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
	 * The cached value of the '{@link #getUrlPattern() <em>Url Pattern</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlPattern()
	 * @generated
	 * @ordered
	 */
	protected EList<UrlPatternType> urlPattern;

	/**
	 * The cached value of the '{@link #getElIgnored() <em>El Ignored</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElIgnored()
	 * @generated
	 * @ordered
	 */
	protected TrueFalseType elIgnored;

	/**
	 * The cached value of the '{@link #getPageEncoding() <em>Page Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageEncoding()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.webapp.webapp25.String pageEncoding;

	/**
	 * The cached value of the '{@link #getScriptingInvalid() <em>Scripting Invalid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptingInvalid()
	 * @generated
	 * @ordered
	 */
	protected TrueFalseType scriptingInvalid;

	/**
	 * The cached value of the '{@link #getIsXml() <em>Is Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsXml()
	 * @generated
	 * @ordered
	 */
	protected TrueFalseType isXml;

	/**
	 * The cached value of the '{@link #getIncludePrelude() <em>Include Prelude</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludePrelude()
	 * @generated
	 * @ordered
	 */
	protected EList<PathType> includePrelude;

	/**
	 * The cached value of the '{@link #getIncludeCoda() <em>Include Coda</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeCoda()
	 * @generated
	 * @ordered
	 */
	protected EList<PathType> includeCoda;

	/**
	 * The cached value of the '{@link #getDeferredSyntaxAllowedAsLiteral() <em>Deferred Syntax Allowed As Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferredSyntaxAllowedAsLiteral()
	 * @generated
	 * @ordered
	 */
	protected TrueFalseType deferredSyntaxAllowedAsLiteral;

	/**
	 * The cached value of the '{@link #getTrimDirectiveWhitespaces() <em>Trim Directive Whitespaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrimDirectiveWhitespaces()
	 * @generated
	 * @ordered
	 */
	protected TrueFalseType trimDirectiveWhitespaces;

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
	protected JspPropertyGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp25Package.Literals.JSP_PROPERTY_GROUP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DESCRIPTION);
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
			displayName = new EObjectContainmentEList<DisplayNameType>(DisplayNameType.class, this, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DISPLAY_NAME);
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
			icon = new EObjectContainmentEList<IconType>(IconType.class, this, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__ICON);
		}
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UrlPatternType> getUrlPattern() {
		if (urlPattern == null) {
			urlPattern = new EObjectContainmentEList<UrlPatternType>(UrlPatternType.class, this, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__URL_PATTERN);
		}
		return urlPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType getElIgnored() {
		return elIgnored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElIgnored(TrueFalseType newElIgnored, NotificationChain msgs) {
		TrueFalseType oldElIgnored = elIgnored;
		elIgnored = newElIgnored;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__EL_IGNORED, oldElIgnored, newElIgnored);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElIgnored(TrueFalseType newElIgnored) {
		if (newElIgnored != elIgnored) {
			NotificationChain msgs = null;
			if (elIgnored != null)
				msgs = ((InternalEObject)elIgnored).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.JSP_PROPERTY_GROUP_TYPE__EL_IGNORED, null, msgs);
			if (newElIgnored != null)
				msgs = ((InternalEObject)newElIgnored).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.JSP_PROPERTY_GROUP_TYPE__EL_IGNORED, null, msgs);
			msgs = basicSetElIgnored(newElIgnored, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__EL_IGNORED, newElIgnored, newElIgnored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.webapp.webapp25.String getPageEncoding() {
		return pageEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageEncoding(org.eclipse.modisco.jee.webapp.webapp25.String newPageEncoding, NotificationChain msgs) {
		org.eclipse.modisco.jee.webapp.webapp25.String oldPageEncoding = pageEncoding;
		pageEncoding = newPageEncoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__PAGE_ENCODING, oldPageEncoding, newPageEncoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageEncoding(org.eclipse.modisco.jee.webapp.webapp25.String newPageEncoding) {
		if (newPageEncoding != pageEncoding) {
			NotificationChain msgs = null;
			if (pageEncoding != null)
				msgs = ((InternalEObject)pageEncoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.JSP_PROPERTY_GROUP_TYPE__PAGE_ENCODING, null, msgs);
			if (newPageEncoding != null)
				msgs = ((InternalEObject)newPageEncoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.JSP_PROPERTY_GROUP_TYPE__PAGE_ENCODING, null, msgs);
			msgs = basicSetPageEncoding(newPageEncoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__PAGE_ENCODING, newPageEncoding, newPageEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType getScriptingInvalid() {
		return scriptingInvalid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScriptingInvalid(TrueFalseType newScriptingInvalid, NotificationChain msgs) {
		TrueFalseType oldScriptingInvalid = scriptingInvalid;
		scriptingInvalid = newScriptingInvalid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__SCRIPTING_INVALID, oldScriptingInvalid, newScriptingInvalid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptingInvalid(TrueFalseType newScriptingInvalid) {
		if (newScriptingInvalid != scriptingInvalid) {
			NotificationChain msgs = null;
			if (scriptingInvalid != null)
				msgs = ((InternalEObject)scriptingInvalid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.JSP_PROPERTY_GROUP_TYPE__SCRIPTING_INVALID, null, msgs);
			if (newScriptingInvalid != null)
				msgs = ((InternalEObject)newScriptingInvalid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.JSP_PROPERTY_GROUP_TYPE__SCRIPTING_INVALID, null, msgs);
			msgs = basicSetScriptingInvalid(newScriptingInvalid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__SCRIPTING_INVALID, newScriptingInvalid, newScriptingInvalid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType getIsXml() {
		return isXml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsXml(TrueFalseType newIsXml, NotificationChain msgs) {
		TrueFalseType oldIsXml = isXml;
		isXml = newIsXml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__IS_XML, oldIsXml, newIsXml);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsXml(TrueFalseType newIsXml) {
		if (newIsXml != isXml) {
			NotificationChain msgs = null;
			if (isXml != null)
				msgs = ((InternalEObject)isXml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.JSP_PROPERTY_GROUP_TYPE__IS_XML, null, msgs);
			if (newIsXml != null)
				msgs = ((InternalEObject)newIsXml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.JSP_PROPERTY_GROUP_TYPE__IS_XML, null, msgs);
			msgs = basicSetIsXml(newIsXml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__IS_XML, newIsXml, newIsXml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathType> getIncludePrelude() {
		if (includePrelude == null) {
			includePrelude = new EObjectContainmentEList<PathType>(PathType.class, this, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__INCLUDE_PRELUDE);
		}
		return includePrelude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathType> getIncludeCoda() {
		if (includeCoda == null) {
			includeCoda = new EObjectContainmentEList<PathType>(PathType.class, this, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__INCLUDE_CODA);
		}
		return includeCoda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType getDeferredSyntaxAllowedAsLiteral() {
		return deferredSyntaxAllowedAsLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeferredSyntaxAllowedAsLiteral(TrueFalseType newDeferredSyntaxAllowedAsLiteral, NotificationChain msgs) {
		TrueFalseType oldDeferredSyntaxAllowedAsLiteral = deferredSyntaxAllowedAsLiteral;
		deferredSyntaxAllowedAsLiteral = newDeferredSyntaxAllowedAsLiteral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DEFERRED_SYNTAX_ALLOWED_AS_LITERAL, oldDeferredSyntaxAllowedAsLiteral, newDeferredSyntaxAllowedAsLiteral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeferredSyntaxAllowedAsLiteral(TrueFalseType newDeferredSyntaxAllowedAsLiteral) {
		if (newDeferredSyntaxAllowedAsLiteral != deferredSyntaxAllowedAsLiteral) {
			NotificationChain msgs = null;
			if (deferredSyntaxAllowedAsLiteral != null)
				msgs = ((InternalEObject)deferredSyntaxAllowedAsLiteral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DEFERRED_SYNTAX_ALLOWED_AS_LITERAL, null, msgs);
			if (newDeferredSyntaxAllowedAsLiteral != null)
				msgs = ((InternalEObject)newDeferredSyntaxAllowedAsLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DEFERRED_SYNTAX_ALLOWED_AS_LITERAL, null, msgs);
			msgs = basicSetDeferredSyntaxAllowedAsLiteral(newDeferredSyntaxAllowedAsLiteral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DEFERRED_SYNTAX_ALLOWED_AS_LITERAL, newDeferredSyntaxAllowedAsLiteral, newDeferredSyntaxAllowedAsLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType getTrimDirectiveWhitespaces() {
		return trimDirectiveWhitespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrimDirectiveWhitespaces(TrueFalseType newTrimDirectiveWhitespaces, NotificationChain msgs) {
		TrueFalseType oldTrimDirectiveWhitespaces = trimDirectiveWhitespaces;
		trimDirectiveWhitespaces = newTrimDirectiveWhitespaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__TRIM_DIRECTIVE_WHITESPACES, oldTrimDirectiveWhitespaces, newTrimDirectiveWhitespaces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrimDirectiveWhitespaces(TrueFalseType newTrimDirectiveWhitespaces) {
		if (newTrimDirectiveWhitespaces != trimDirectiveWhitespaces) {
			NotificationChain msgs = null;
			if (trimDirectiveWhitespaces != null)
				msgs = ((InternalEObject)trimDirectiveWhitespaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.JSP_PROPERTY_GROUP_TYPE__TRIM_DIRECTIVE_WHITESPACES, null, msgs);
			if (newTrimDirectiveWhitespaces != null)
				msgs = ((InternalEObject)newTrimDirectiveWhitespaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.JSP_PROPERTY_GROUP_TYPE__TRIM_DIRECTIVE_WHITESPACES, null, msgs);
			msgs = basicSetTrimDirectiveWhitespaces(newTrimDirectiveWhitespaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__TRIM_DIRECTIVE_WHITESPACES, newTrimDirectiveWhitespaces, newTrimDirectiveWhitespaces));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.JSP_PROPERTY_GROUP_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DISPLAY_NAME:
				return ((InternalEList<?>)getDisplayName()).basicRemove(otherEnd, msgs);
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__ICON:
				return ((InternalEList<?>)getIcon()).basicRemove(otherEnd, msgs);
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__URL_PATTERN:
				return ((InternalEList<?>)getUrlPattern()).basicRemove(otherEnd, msgs);
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__EL_IGNORED:
				return basicSetElIgnored(null, msgs);
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__PAGE_ENCODING:
				return basicSetPageEncoding(null, msgs);
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__SCRIPTING_INVALID:
				return basicSetScriptingInvalid(null, msgs);
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__IS_XML:
				return basicSetIsXml(null, msgs);
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__INCLUDE_PRELUDE:
				return ((InternalEList<?>)getIncludePrelude()).basicRemove(otherEnd, msgs);
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__INCLUDE_CODA:
				return ((InternalEList<?>)getIncludeCoda()).basicRemove(otherEnd, msgs);
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DEFERRED_SYNTAX_ALLOWED_AS_LITERAL:
				return basicSetDeferredSyntaxAllowedAsLiteral(null, msgs);
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__TRIM_DIRECTIVE_WHITESPACES:
				return basicSetTrimDirectiveWhitespaces(null, msgs);
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
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__ICON:
				return getIcon();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__URL_PATTERN:
				return getUrlPattern();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__EL_IGNORED:
				return getElIgnored();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__PAGE_ENCODING:
				return getPageEncoding();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__SCRIPTING_INVALID:
				return getScriptingInvalid();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__IS_XML:
				return getIsXml();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__INCLUDE_PRELUDE:
				return getIncludePrelude();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__INCLUDE_CODA:
				return getIncludeCoda();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DEFERRED_SYNTAX_ALLOWED_AS_LITERAL:
				return getDeferredSyntaxAllowedAsLiteral();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__TRIM_DIRECTIVE_WHITESPACES:
				return getTrimDirectiveWhitespaces();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__ID:
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
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				getDisplayName().addAll((Collection<? extends DisplayNameType>)newValue);
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__ICON:
				getIcon().clear();
				getIcon().addAll((Collection<? extends IconType>)newValue);
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__URL_PATTERN:
				getUrlPattern().clear();
				getUrlPattern().addAll((Collection<? extends UrlPatternType>)newValue);
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__EL_IGNORED:
				setElIgnored((TrueFalseType)newValue);
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__PAGE_ENCODING:
				setPageEncoding((org.eclipse.modisco.jee.webapp.webapp25.String)newValue);
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__SCRIPTING_INVALID:
				setScriptingInvalid((TrueFalseType)newValue);
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__IS_XML:
				setIsXml((TrueFalseType)newValue);
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__INCLUDE_PRELUDE:
				getIncludePrelude().clear();
				getIncludePrelude().addAll((Collection<? extends PathType>)newValue);
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__INCLUDE_CODA:
				getIncludeCoda().clear();
				getIncludeCoda().addAll((Collection<? extends PathType>)newValue);
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DEFERRED_SYNTAX_ALLOWED_AS_LITERAL:
				setDeferredSyntaxAllowedAsLiteral((TrueFalseType)newValue);
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__TRIM_DIRECTIVE_WHITESPACES:
				setTrimDirectiveWhitespaces((TrueFalseType)newValue);
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__ID:
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
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__ICON:
				getIcon().clear();
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__URL_PATTERN:
				getUrlPattern().clear();
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__EL_IGNORED:
				setElIgnored((TrueFalseType)null);
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__PAGE_ENCODING:
				setPageEncoding((org.eclipse.modisco.jee.webapp.webapp25.String)null);
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__SCRIPTING_INVALID:
				setScriptingInvalid((TrueFalseType)null);
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__IS_XML:
				setIsXml((TrueFalseType)null);
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__INCLUDE_PRELUDE:
				getIncludePrelude().clear();
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__INCLUDE_CODA:
				getIncludeCoda().clear();
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DEFERRED_SYNTAX_ALLOWED_AS_LITERAL:
				setDeferredSyntaxAllowedAsLiteral((TrueFalseType)null);
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__TRIM_DIRECTIVE_WHITESPACES:
				setTrimDirectiveWhitespaces((TrueFalseType)null);
				return;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__ID:
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
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DISPLAY_NAME:
				return displayName != null && !displayName.isEmpty();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__ICON:
				return icon != null && !icon.isEmpty();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__URL_PATTERN:
				return urlPattern != null && !urlPattern.isEmpty();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__EL_IGNORED:
				return elIgnored != null;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__PAGE_ENCODING:
				return pageEncoding != null;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__SCRIPTING_INVALID:
				return scriptingInvalid != null;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__IS_XML:
				return isXml != null;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__INCLUDE_PRELUDE:
				return includePrelude != null && !includePrelude.isEmpty();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__INCLUDE_CODA:
				return includeCoda != null && !includeCoda.isEmpty();
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__DEFERRED_SYNTAX_ALLOWED_AS_LITERAL:
				return deferredSyntaxAllowedAsLiteral != null;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__TRIM_DIRECTIVE_WHITESPACES:
				return trimDirectiveWhitespaces != null;
			case Webapp25Package.JSP_PROPERTY_GROUP_TYPE__ID:
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
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //JspPropertyGroupTypeImpl
