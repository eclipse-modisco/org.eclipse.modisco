/**
 * 
 * Copyright (c) 2009, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.code.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.omg.kdm.action.EntryFlow;
import org.eclipse.modisco.omg.kdm.code.AbstractCodeElement;
import org.eclipse.modisco.omg.kdm.code.AbstractCodeRelationship;
import org.eclipse.modisco.omg.kdm.code.CodePackage;
import org.eclipse.modisco.omg.kdm.code.CommentUnit;
import org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl;
import org.eclipse.modisco.omg.kdm.source.SourceRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Code Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.code.impl.AbstractCodeElementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.code.impl.AbstractCodeElementImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.code.impl.AbstractCodeElementImpl#getCodeRelation <em>Code Relation</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.code.impl.AbstractCodeElementImpl#getEntryFlow <em>Entry Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractCodeElementImpl extends KDMEntityImpl implements AbstractCodeElement {
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
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected EList<CommentUnit> comment;

	/**
	 * The cached value of the '{@link #getCodeRelation() <em>Code Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCodeRelationship> codeRelation;

	/**
	 * The cached value of the '{@link #getEntryFlow() <em>Entry Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryFlow> entryFlow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCodeElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackage.Literals.ABSTRACT_CODE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRef> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, CodePackage.ABSTRACT_CODE_ELEMENT__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommentUnit> getComment() {
		if (comment == null) {
			comment = new EObjectContainmentEList<CommentUnit>(CommentUnit.class, this, CodePackage.ABSTRACT_CODE_ELEMENT__COMMENT);
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractCodeRelationship> getCodeRelation() {
		if (codeRelation == null) {
			codeRelation = new EObjectContainmentEList<AbstractCodeRelationship>(AbstractCodeRelationship.class, this, CodePackage.ABSTRACT_CODE_ELEMENT__CODE_RELATION);
		}
		return codeRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryFlow> getEntryFlow() {
		if (entryFlow == null) {
			entryFlow = new EObjectResolvingEList<EntryFlow>(EntryFlow.class, this, CodePackage.ABSTRACT_CODE_ELEMENT__ENTRY_FLOW);
		}
		return entryFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodePackage.ABSTRACT_CODE_ELEMENT__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case CodePackage.ABSTRACT_CODE_ELEMENT__COMMENT:
				return ((InternalEList<?>)getComment()).basicRemove(otherEnd, msgs);
			case CodePackage.ABSTRACT_CODE_ELEMENT__CODE_RELATION:
				return ((InternalEList<?>)getCodeRelation()).basicRemove(otherEnd, msgs);
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
			case CodePackage.ABSTRACT_CODE_ELEMENT__SOURCE:
				return getSource();
			case CodePackage.ABSTRACT_CODE_ELEMENT__COMMENT:
				return getComment();
			case CodePackage.ABSTRACT_CODE_ELEMENT__CODE_RELATION:
				return getCodeRelation();
			case CodePackage.ABSTRACT_CODE_ELEMENT__ENTRY_FLOW:
				return getEntryFlow();
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
			case CodePackage.ABSTRACT_CODE_ELEMENT__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case CodePackage.ABSTRACT_CODE_ELEMENT__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends CommentUnit>)newValue);
				return;
			case CodePackage.ABSTRACT_CODE_ELEMENT__CODE_RELATION:
				getCodeRelation().clear();
				getCodeRelation().addAll((Collection<? extends AbstractCodeRelationship>)newValue);
				return;
			case CodePackage.ABSTRACT_CODE_ELEMENT__ENTRY_FLOW:
				getEntryFlow().clear();
				getEntryFlow().addAll((Collection<? extends EntryFlow>)newValue);
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
			case CodePackage.ABSTRACT_CODE_ELEMENT__SOURCE:
				getSource().clear();
				return;
			case CodePackage.ABSTRACT_CODE_ELEMENT__COMMENT:
				getComment().clear();
				return;
			case CodePackage.ABSTRACT_CODE_ELEMENT__CODE_RELATION:
				getCodeRelation().clear();
				return;
			case CodePackage.ABSTRACT_CODE_ELEMENT__ENTRY_FLOW:
				getEntryFlow().clear();
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
			case CodePackage.ABSTRACT_CODE_ELEMENT__SOURCE:
				return source != null && !source.isEmpty();
			case CodePackage.ABSTRACT_CODE_ELEMENT__COMMENT:
				return comment != null && !comment.isEmpty();
			case CodePackage.ABSTRACT_CODE_ELEMENT__CODE_RELATION:
				return codeRelation != null && !codeRelation.isEmpty();
			case CodePackage.ABSTRACT_CODE_ELEMENT__ENTRY_FLOW:
				return entryFlow != null && !entryFlow.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractCodeElementImpl
