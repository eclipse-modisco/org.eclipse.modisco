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
package org.eclipse.gmt.modisco.omg.kdm.data.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.modisco.omg.kdm.action.ActionElement;
import org.eclipse.gmt.modisco.omg.kdm.core.impl.KDMEntityImpl;
import org.eclipse.gmt.modisco.omg.kdm.data.AbstractContentElement;
import org.eclipse.gmt.modisco.omg.kdm.data.AbstractDataRelationship;
import org.eclipse.gmt.modisco.omg.kdm.data.ComplexContentType;
import org.eclipse.gmt.modisco.omg.kdm.data.DataPackage;
import org.eclipse.gmt.modisco.omg.kdm.source.SourceRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.data.impl.ComplexContentTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.data.impl.ComplexContentTypeImpl#getDataRelation <em>Data Relation</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.data.impl.ComplexContentTypeImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.data.impl.ComplexContentTypeImpl#getContentElement <em>Content Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexContentTypeImpl extends KDMEntityImpl implements ComplexContentType {
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
	 * The cached value of the '{@link #getDataRelation() <em>Data Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDataRelationship> dataRelation;

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
	 * The cached value of the '{@link #getContentElement() <em>Content Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractContentElement> contentElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexContentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.COMPLEX_CONTENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRef> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, DataPackage.COMPLEX_CONTENT_TYPE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractDataRelationship> getDataRelation() {
		if (dataRelation == null) {
			dataRelation = new EObjectContainmentEList<AbstractDataRelationship>(AbstractDataRelationship.class, this, DataPackage.COMPLEX_CONTENT_TYPE__DATA_RELATION);
		}
		return dataRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionElement> getAbstraction() {
		if (abstraction == null) {
			abstraction = new EObjectContainmentEList<ActionElement>(ActionElement.class, this, DataPackage.COMPLEX_CONTENT_TYPE__ABSTRACTION);
		}
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractContentElement> getContentElement() {
		if (contentElement == null) {
			contentElement = new EObjectContainmentEList<AbstractContentElement>(AbstractContentElement.class, this, DataPackage.COMPLEX_CONTENT_TYPE__CONTENT_ELEMENT);
		}
		return contentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.COMPLEX_CONTENT_TYPE__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case DataPackage.COMPLEX_CONTENT_TYPE__DATA_RELATION:
				return ((InternalEList<?>)getDataRelation()).basicRemove(otherEnd, msgs);
			case DataPackage.COMPLEX_CONTENT_TYPE__ABSTRACTION:
				return ((InternalEList<?>)getAbstraction()).basicRemove(otherEnd, msgs);
			case DataPackage.COMPLEX_CONTENT_TYPE__CONTENT_ELEMENT:
				return ((InternalEList<?>)getContentElement()).basicRemove(otherEnd, msgs);
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
			case DataPackage.COMPLEX_CONTENT_TYPE__SOURCE:
				return getSource();
			case DataPackage.COMPLEX_CONTENT_TYPE__DATA_RELATION:
				return getDataRelation();
			case DataPackage.COMPLEX_CONTENT_TYPE__ABSTRACTION:
				return getAbstraction();
			case DataPackage.COMPLEX_CONTENT_TYPE__CONTENT_ELEMENT:
				return getContentElement();
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
			case DataPackage.COMPLEX_CONTENT_TYPE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case DataPackage.COMPLEX_CONTENT_TYPE__DATA_RELATION:
				getDataRelation().clear();
				getDataRelation().addAll((Collection<? extends AbstractDataRelationship>)newValue);
				return;
			case DataPackage.COMPLEX_CONTENT_TYPE__ABSTRACTION:
				getAbstraction().clear();
				getAbstraction().addAll((Collection<? extends ActionElement>)newValue);
				return;
			case DataPackage.COMPLEX_CONTENT_TYPE__CONTENT_ELEMENT:
				getContentElement().clear();
				getContentElement().addAll((Collection<? extends AbstractContentElement>)newValue);
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
			case DataPackage.COMPLEX_CONTENT_TYPE__SOURCE:
				getSource().clear();
				return;
			case DataPackage.COMPLEX_CONTENT_TYPE__DATA_RELATION:
				getDataRelation().clear();
				return;
			case DataPackage.COMPLEX_CONTENT_TYPE__ABSTRACTION:
				getAbstraction().clear();
				return;
			case DataPackage.COMPLEX_CONTENT_TYPE__CONTENT_ELEMENT:
				getContentElement().clear();
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
			case DataPackage.COMPLEX_CONTENT_TYPE__SOURCE:
				return source != null && !source.isEmpty();
			case DataPackage.COMPLEX_CONTENT_TYPE__DATA_RELATION:
				return dataRelation != null && !dataRelation.isEmpty();
			case DataPackage.COMPLEX_CONTENT_TYPE__ABSTRACTION:
				return abstraction != null && !abstraction.isEmpty();
			case DataPackage.COMPLEX_CONTENT_TYPE__CONTENT_ELEMENT:
				return contentElement != null && !contentElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComplexContentTypeImpl
