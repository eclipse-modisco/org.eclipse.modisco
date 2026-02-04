/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - meta-model design
 *     Gregoire DUPE (Mia-Software) - design and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.ModelQueryParameter;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.query.impl.ModelQueryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.impl.ModelQueryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.impl.ModelQueryImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.impl.ModelQueryImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.impl.ModelQueryImpl#getModelQuerySet <em>Model Query Set</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.impl.ModelQueryImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.impl.ModelQueryImpl#isIsExternalContextDependent <em>Is External Context Dependent</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.impl.ModelQueryImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.impl.ModelQueryImpl#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public abstract class ModelQueryImpl extends EObjectImpl implements ModelQuery {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected EClassifier returnType;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> scope;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelQueryParameter> parameters;

	/**
	 * The default value of the '{@link #isIsExternalContextDependent() <em>Is External Context Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternalContextDependent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXTERNAL_CONTEXT_DEPENDENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExternalContextDependent() <em>Is External Context Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternalContextDependent()
	 * @generated
	 * @ordered
	 */
	protected boolean isExternalContextDependent = IS_EXTERNAL_CONTEXT_DEPENDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.MODEL_QUERY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.MODEL_QUERY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.MODEL_QUERY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (EClassifier)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QueryPackage.MODEL_QUERY__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(EClassifier newReturnType) {
		EClassifier oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.MODEL_QUERY__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getScope() {
		if (scope == null) {
			scope = new EObjectResolvingEList<EClass>(EClass.class, this, QueryPackage.MODEL_QUERY__SCOPE);
		}
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelQuerySet getModelQuerySet() {
		if (eContainerFeatureID() != QueryPackage.MODEL_QUERY__MODEL_QUERY_SET) return null;
		return (ModelQuerySet)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelQuerySet(ModelQuerySet newModelQuerySet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModelQuerySet, QueryPackage.MODEL_QUERY__MODEL_QUERY_SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelQuerySet(ModelQuerySet newModelQuerySet) {
		if (newModelQuerySet != eInternalContainer() || (eContainerFeatureID() != QueryPackage.MODEL_QUERY__MODEL_QUERY_SET && newModelQuerySet != null)) {
			if (EcoreUtil.isAncestor(this, newModelQuerySet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModelQuerySet != null)
				msgs = ((InternalEObject)newModelQuerySet).eInverseAdd(this, QueryPackage.MODEL_QUERY_SET__QUERIES, ModelQuerySet.class, msgs);
			msgs = basicSetModelQuerySet(newModelQuerySet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.MODEL_QUERY__MODEL_QUERY_SET, newModelQuerySet, newModelQuerySet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelQueryParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ModelQueryParameter>(ModelQueryParameter.class, this, QueryPackage.MODEL_QUERY__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExternalContextDependent() {
		return isExternalContextDependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExternalContextDependent(boolean newIsExternalContextDependent) {
		boolean oldIsExternalContextDependent = isExternalContextDependent;
		isExternalContextDependent = newIsExternalContextDependent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.MODEL_QUERY__IS_EXTERNAL_CONTEXT_DEPENDENT, oldIsExternalContextDependent, isExternalContextDependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(int newUpperBound) {
		int oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.MODEL_QUERY__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.MODEL_QUERY__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.MODEL_QUERY__MODEL_QUERY_SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModelQuerySet((ModelQuerySet)otherEnd, msgs);
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
			case QueryPackage.MODEL_QUERY__MODEL_QUERY_SET:
				return basicSetModelQuerySet(null, msgs);
			case QueryPackage.MODEL_QUERY__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.MODEL_QUERY__MODEL_QUERY_SET:
				return eInternalContainer().eInverseRemove(this, QueryPackage.MODEL_QUERY_SET__QUERIES, ModelQuerySet.class, msgs);
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
			case QueryPackage.MODEL_QUERY__NAME:
				return getName();
			case QueryPackage.MODEL_QUERY__DESCRIPTION:
				return getDescription();
			case QueryPackage.MODEL_QUERY__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
			case QueryPackage.MODEL_QUERY__SCOPE:
				return getScope();
			case QueryPackage.MODEL_QUERY__MODEL_QUERY_SET:
				return getModelQuerySet();
			case QueryPackage.MODEL_QUERY__PARAMETERS:
				return getParameters();
			case QueryPackage.MODEL_QUERY__IS_EXTERNAL_CONTEXT_DEPENDENT:
				return isIsExternalContextDependent();
			case QueryPackage.MODEL_QUERY__UPPER_BOUND:
				return getUpperBound();
			case QueryPackage.MODEL_QUERY__LOWER_BOUND:
				return getLowerBound();
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
			case QueryPackage.MODEL_QUERY__NAME:
				setName((String)newValue);
				return;
			case QueryPackage.MODEL_QUERY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case QueryPackage.MODEL_QUERY__RETURN_TYPE:
				setReturnType((EClassifier)newValue);
				return;
			case QueryPackage.MODEL_QUERY__SCOPE:
				getScope().clear();
				getScope().addAll((Collection<? extends EClass>)newValue);
				return;
			case QueryPackage.MODEL_QUERY__MODEL_QUERY_SET:
				setModelQuerySet((ModelQuerySet)newValue);
				return;
			case QueryPackage.MODEL_QUERY__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ModelQueryParameter>)newValue);
				return;
			case QueryPackage.MODEL_QUERY__IS_EXTERNAL_CONTEXT_DEPENDENT:
				setIsExternalContextDependent((Boolean)newValue);
				return;
			case QueryPackage.MODEL_QUERY__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case QueryPackage.MODEL_QUERY__LOWER_BOUND:
				setLowerBound((Integer)newValue);
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
			case QueryPackage.MODEL_QUERY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QueryPackage.MODEL_QUERY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case QueryPackage.MODEL_QUERY__RETURN_TYPE:
				setReturnType((EClassifier)null);
				return;
			case QueryPackage.MODEL_QUERY__SCOPE:
				getScope().clear();
				return;
			case QueryPackage.MODEL_QUERY__MODEL_QUERY_SET:
				setModelQuerySet((ModelQuerySet)null);
				return;
			case QueryPackage.MODEL_QUERY__PARAMETERS:
				getParameters().clear();
				return;
			case QueryPackage.MODEL_QUERY__IS_EXTERNAL_CONTEXT_DEPENDENT:
				setIsExternalContextDependent(IS_EXTERNAL_CONTEXT_DEPENDENT_EDEFAULT);
				return;
			case QueryPackage.MODEL_QUERY__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case QueryPackage.MODEL_QUERY__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
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
			case QueryPackage.MODEL_QUERY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QueryPackage.MODEL_QUERY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case QueryPackage.MODEL_QUERY__RETURN_TYPE:
				return returnType != null;
			case QueryPackage.MODEL_QUERY__SCOPE:
				return scope != null && !scope.isEmpty();
			case QueryPackage.MODEL_QUERY__MODEL_QUERY_SET:
				return getModelQuerySet() != null;
			case QueryPackage.MODEL_QUERY__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case QueryPackage.MODEL_QUERY__IS_EXTERNAL_CONTEXT_DEPENDENT:
				return isExternalContextDependent != IS_EXTERNAL_CONTEXT_DEPENDENT_EDEFAULT;
			case QueryPackage.MODEL_QUERY__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case QueryPackage.MODEL_QUERY__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", isExternalContextDependent: ");
		result.append(isExternalContextDependent);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(')');
		return result.toString();
	}

} //ModelQueryImpl
