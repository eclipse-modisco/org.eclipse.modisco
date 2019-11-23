/**
 * *******************************************************************************
 * Copyright (c) 2008 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.ui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.omg.kdm.action.ActionElement;
import org.eclipse.modisco.omg.kdm.code.AbstractCodeElement;
import org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl;
import org.eclipse.modisco.omg.kdm.source.SourceRef;
import org.eclipse.modisco.omg.kdm.ui.AbstractUIElement;
import org.eclipse.modisco.omg.kdm.ui.AbstractUIRelationship;
import org.eclipse.modisco.omg.kdm.ui.UIResource;
import org.eclipse.modisco.omg.kdm.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.ui.impl.UIResourceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.ui.impl.UIResourceImpl#getUIRelation <em>UI Relation</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.ui.impl.UIResourceImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.ui.impl.UIResourceImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.ui.impl.UIResourceImpl#getUIElement <em>UI Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIResourceImpl extends KDMEntityImpl implements UIResource {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceRef> source;

	/**
	 * The cached value of the '{@link #getUIRelation() <em>UI Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUIRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractUIRelationship> uiRelation;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCodeElement> implementation;

	/**
	 * The cached value of the '{@link #getAbstraction() <em>Abstraction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstraction()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionElement> abstraction;

	/**
	 * The cached value of the '{@link #getUIElement() <em>UI Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUIElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractUIElement> uiElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRef> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, UiPackage.UI_RESOURCE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractUIRelationship> getUIRelation() {
		if (uiRelation == null) {
			uiRelation = new EObjectContainmentEList<AbstractUIRelationship>(AbstractUIRelationship.class, this, UiPackage.UI_RESOURCE__UI_RELATION);
		}
		return uiRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractCodeElement> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectResolvingEList<AbstractCodeElement>(AbstractCodeElement.class, this, UiPackage.UI_RESOURCE__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionElement> getAbstraction() {
		if (abstraction == null) {
			abstraction = new EObjectContainmentEList<ActionElement>(ActionElement.class, this, UiPackage.UI_RESOURCE__ABSTRACTION);
		}
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractUIElement> getUIElement() {
		if (uiElement == null) {
			uiElement = new EObjectContainmentEList<AbstractUIElement>(AbstractUIElement.class, this, UiPackage.UI_RESOURCE__UI_ELEMENT);
		}
		return uiElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.UI_RESOURCE__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case UiPackage.UI_RESOURCE__UI_RELATION:
				return ((InternalEList<?>)getUIRelation()).basicRemove(otherEnd, msgs);
			case UiPackage.UI_RESOURCE__ABSTRACTION:
				return ((InternalEList<?>)getAbstraction()).basicRemove(otherEnd, msgs);
			case UiPackage.UI_RESOURCE__UI_ELEMENT:
				return ((InternalEList<?>)getUIElement()).basicRemove(otherEnd, msgs);
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
			case UiPackage.UI_RESOURCE__SOURCE:
				return getSource();
			case UiPackage.UI_RESOURCE__UI_RELATION:
				return getUIRelation();
			case UiPackage.UI_RESOURCE__IMPLEMENTATION:
				return getImplementation();
			case UiPackage.UI_RESOURCE__ABSTRACTION:
				return getAbstraction();
			case UiPackage.UI_RESOURCE__UI_ELEMENT:
				return getUIElement();
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
			case UiPackage.UI_RESOURCE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case UiPackage.UI_RESOURCE__UI_RELATION:
				getUIRelation().clear();
				getUIRelation().addAll((Collection<? extends AbstractUIRelationship>)newValue);
				return;
			case UiPackage.UI_RESOURCE__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends AbstractCodeElement>)newValue);
				return;
			case UiPackage.UI_RESOURCE__ABSTRACTION:
				getAbstraction().clear();
				getAbstraction().addAll((Collection<? extends ActionElement>)newValue);
				return;
			case UiPackage.UI_RESOURCE__UI_ELEMENT:
				getUIElement().clear();
				getUIElement().addAll((Collection<? extends AbstractUIElement>)newValue);
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
			case UiPackage.UI_RESOURCE__SOURCE:
				getSource().clear();
				return;
			case UiPackage.UI_RESOURCE__UI_RELATION:
				getUIRelation().clear();
				return;
			case UiPackage.UI_RESOURCE__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case UiPackage.UI_RESOURCE__ABSTRACTION:
				getAbstraction().clear();
				return;
			case UiPackage.UI_RESOURCE__UI_ELEMENT:
				getUIElement().clear();
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
			case UiPackage.UI_RESOURCE__SOURCE:
				return source != null && !source.isEmpty();
			case UiPackage.UI_RESOURCE__UI_RELATION:
				return uiRelation != null && !uiRelation.isEmpty();
			case UiPackage.UI_RESOURCE__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case UiPackage.UI_RESOURCE__ABSTRACTION:
				return abstraction != null && !abstraction.isEmpty();
			case UiPackage.UI_RESOURCE__UI_ELEMENT:
				return uiElement != null && !uiElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UIResourceImpl
