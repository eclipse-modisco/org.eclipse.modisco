/**
 *  Copyright (c) 2011, 2019 Mia-Software, and Soft-Maint.
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
package org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet;

import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.extensible.Query;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A derivable typed element is a structural feature that the value can be computed by using a query.
 * 
 * NB: DerivedTypeElement must be named "DerivableTypeElement". Old definition: A derived typed element is a virtual structural feature the value of which is computed using a query.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.DerivedTypedElement#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.DerivedTypedElement#getOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.EFacetPackage#getDerivedTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface DerivedTypedElement extends FacetElement {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(Query)
	 * @see org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.EFacetPackage#getDerivedTypedElement_Query()
	 * @model containment="true"
	 * @generated
	 */
	Query getQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.DerivedTypedElement#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Query value);

	/**
	 * Returns the value of the '<em><b>Override</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If it exists a facet A which extends a facet B then a derived typed element of A can override a typed element of B; if the both typed elements have the same name, same multiplicity, and same type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Override</em>' reference.
	 * @see #setOverride(DerivedTypedElement)
	 * @see org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.EFacetPackage#getDerivedTypedElement_Override()
	 * @model
	 * @generated
	 */
	DerivedTypedElement getOverride();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.DerivedTypedElement#getOverride <em>Override</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override</em>' reference.
	 * @see #getOverride()
	 * @generated
	 */
	void setOverride(DerivedTypedElement value);

} // DerivedTypedElement
