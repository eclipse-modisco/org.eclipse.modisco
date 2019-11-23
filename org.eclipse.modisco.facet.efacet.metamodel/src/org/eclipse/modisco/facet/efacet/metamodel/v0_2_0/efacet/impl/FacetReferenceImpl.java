/**
 *  Copyright (c) 2011, 2015 Mia-Software, and Soft-Maint.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *     Gregoire Dupe (Mia-Software) - Design
 *     Nicolas Guyomar (Mia-Software) - Implementation
 *     Emmanuelle Rouillé (Mia-Software) - Bug 352618 - To be able to use non derived facet structural features and save them values. 
 *     Nicolas Bros (Mia-Software) - Bug 361823 - [Restructuring] eFacet2 meta-model
 *     Gregoire Dupe (Mia-Software) - Bug 366055 - NavigationQuery
 *     Gregoire Dupe (Mia-Software) - Bug 369673 - [Facet] IsOneOfQuery
 *     Olivier Remaud (Soft-Maint) - Bug 369824 - Add a simple way to return string literal constants from a customization query
 *     Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *     Gregoire Dupe (Mia-software) - Bug 364325 - [Restructuring] The user must be able to navigate into a model using the Facet.
 *     Nicolas Bros (Mia-Software) - Bug 372626 - [Facet] Aggregates
 *     Nicolas Bros (Mia-Software) - Bug 376941 - [EFacet] Facet operation arguments in Facet model
 *     Gregoire Dupe (Mia-Software) - Bug 376576 - [EFacet] Change the multiplicity of Facet::extendedFacet
 *     Jonathan Pepin (Soft-Maint) - Bug 463898 - Create FacetReference not derived, without query and with opposite mechanism
 */
package org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EReferenceImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.Category;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.DerivedTypedElement;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.DocumentedElement;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.EFacetPackage;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetElement;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetReference;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.extensible.Query;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.impl.FacetReferenceImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.impl.FacetReferenceImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.impl.FacetReferenceImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.impl.FacetReferenceImpl#getOverride <em>Override</em>}</li>
 *   <li>{@link org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.impl.FacetReferenceImpl#getFOpposite <em>FOpposite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacetReferenceImpl extends EReferenceImpl implements FacetReference {
	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected Query query;

	/**
	 * The cached value of the '{@link #getOverride() <em>Override</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverride()
	 * @generated
	 * @ordered
	 */
	protected DerivedTypedElement override;

	/**
	 * The cached value of the '{@link #getFOpposite() <em>FOpposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFOpposite()
	 * @generated
	 * @ordered
	 */
	protected FacetReference fOpposite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EFacetPackage.Literals.FACET_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EFacetPackage.FACET_REFERENCE__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectResolvingEList<Category>(Category.class, this, EFacetPackage.FACET_REFERENCE__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(Query newQuery, NotificationChain msgs) {
		Query oldQuery = query;
		query = newQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EFacetPackage.FACET_REFERENCE__QUERY, oldQuery, newQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(Query newQuery) {
		if (newQuery != query) {
			NotificationChain msgs = null;
			if (query != null)
				msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EFacetPackage.FACET_REFERENCE__QUERY, null, msgs);
			if (newQuery != null)
				msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EFacetPackage.FACET_REFERENCE__QUERY, null, msgs);
			msgs = basicSetQuery(newQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EFacetPackage.FACET_REFERENCE__QUERY, newQuery, newQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedTypedElement getOverride() {
		if (override != null && override.eIsProxy()) {
			InternalEObject oldOverride = (InternalEObject)override;
			override = (DerivedTypedElement)eResolveProxy(oldOverride);
			if (override != oldOverride) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EFacetPackage.FACET_REFERENCE__OVERRIDE, oldOverride, override));
			}
		}
		return override;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedTypedElement basicGetOverride() {
		return override;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverride(DerivedTypedElement newOverride) {
		DerivedTypedElement oldOverride = override;
		override = newOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EFacetPackage.FACET_REFERENCE__OVERRIDE, oldOverride, override));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetReference getFOpposite() {
		if (fOpposite != null && fOpposite.eIsProxy()) {
			InternalEObject oldFOpposite = (InternalEObject)fOpposite;
			fOpposite = (FacetReference)eResolveProxy(oldFOpposite);
			if (fOpposite != oldFOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EFacetPackage.FACET_REFERENCE__FOPPOSITE, oldFOpposite, fOpposite));
			}
		}
		return fOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetReference basicGetFOpposite() {
		return fOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFOpposite(FacetReference newFOpposite) {
		FacetReference oldFOpposite = fOpposite;
		fOpposite = newFOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EFacetPackage.FACET_REFERENCE__FOPPOSITE, oldFOpposite, fOpposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EFacetPackage.FACET_REFERENCE__QUERY:
				return basicSetQuery(null, msgs);
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
			case EFacetPackage.FACET_REFERENCE__DOCUMENTATION:
				return getDocumentation();
			case EFacetPackage.FACET_REFERENCE__CATEGORIES:
				return getCategories();
			case EFacetPackage.FACET_REFERENCE__QUERY:
				return getQuery();
			case EFacetPackage.FACET_REFERENCE__OVERRIDE:
				if (resolve) return getOverride();
				return basicGetOverride();
			case EFacetPackage.FACET_REFERENCE__FOPPOSITE:
				if (resolve) return getFOpposite();
				return basicGetFOpposite();
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
			case EFacetPackage.FACET_REFERENCE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case EFacetPackage.FACET_REFERENCE__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case EFacetPackage.FACET_REFERENCE__QUERY:
				setQuery((Query)newValue);
				return;
			case EFacetPackage.FACET_REFERENCE__OVERRIDE:
				setOverride((DerivedTypedElement)newValue);
				return;
			case EFacetPackage.FACET_REFERENCE__FOPPOSITE:
				setFOpposite((FacetReference)newValue);
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
			case EFacetPackage.FACET_REFERENCE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case EFacetPackage.FACET_REFERENCE__CATEGORIES:
				getCategories().clear();
				return;
			case EFacetPackage.FACET_REFERENCE__QUERY:
				setQuery((Query)null);
				return;
			case EFacetPackage.FACET_REFERENCE__OVERRIDE:
				setOverride((DerivedTypedElement)null);
				return;
			case EFacetPackage.FACET_REFERENCE__FOPPOSITE:
				setFOpposite((FacetReference)null);
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
			case EFacetPackage.FACET_REFERENCE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case EFacetPackage.FACET_REFERENCE__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case EFacetPackage.FACET_REFERENCE__QUERY:
				return query != null;
			case EFacetPackage.FACET_REFERENCE__OVERRIDE:
				return override != null;
			case EFacetPackage.FACET_REFERENCE__FOPPOSITE:
				return fOpposite != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DocumentedElement.class) {
			switch (derivedFeatureID) {
				case EFacetPackage.FACET_REFERENCE__DOCUMENTATION: return EFacetPackage.DOCUMENTED_ELEMENT__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == FacetElement.class) {
			switch (derivedFeatureID) {
				case EFacetPackage.FACET_REFERENCE__CATEGORIES: return EFacetPackage.FACET_ELEMENT__CATEGORIES;
				default: return -1;
			}
		}
		if (baseClass == DerivedTypedElement.class) {
			switch (derivedFeatureID) {
				case EFacetPackage.FACET_REFERENCE__QUERY: return EFacetPackage.DERIVED_TYPED_ELEMENT__QUERY;
				case EFacetPackage.FACET_REFERENCE__OVERRIDE: return EFacetPackage.DERIVED_TYPED_ELEMENT__OVERRIDE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DocumentedElement.class) {
			switch (baseFeatureID) {
				case EFacetPackage.DOCUMENTED_ELEMENT__DOCUMENTATION: return EFacetPackage.FACET_REFERENCE__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == FacetElement.class) {
			switch (baseFeatureID) {
				case EFacetPackage.FACET_ELEMENT__CATEGORIES: return EFacetPackage.FACET_REFERENCE__CATEGORIES;
				default: return -1;
			}
		}
		if (baseClass == DerivedTypedElement.class) {
			switch (baseFeatureID) {
				case EFacetPackage.DERIVED_TYPED_ELEMENT__QUERY: return EFacetPackage.FACET_REFERENCE__QUERY;
				case EFacetPackage.DERIVED_TYPED_ELEMENT__OVERRIDE: return EFacetPackage.FACET_REFERENCE__OVERRIDE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (documentation: "); //$NON-NLS-1$
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

} //FacetReferenceImpl
