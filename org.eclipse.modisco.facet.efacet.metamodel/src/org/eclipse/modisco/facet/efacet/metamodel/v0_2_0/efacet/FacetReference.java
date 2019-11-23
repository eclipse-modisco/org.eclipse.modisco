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
package org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A FacetReference is a virtual reference added to all the eObjects which conform to the Facet owning the FacetReference.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetReference#getFOpposite <em>FOpposite</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.EFacetPackage#getFacetReference()
 * @model
 * @generated
 */
public interface FacetReference extends EReference, DerivedTypedElement {

	/**
	 * Returns the value of the '<em><b>FOpposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FOpposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FOpposite</em>' reference.
	 * @see #setFOpposite(FacetReference)
	 * @see org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.EFacetPackage#getFacetReference_FOpposite()
	 * @model
	 * @generated
	 * @since 1.0
	 */
	FacetReference getFOpposite();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetReference#getFOpposite <em>FOpposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FOpposite</em>' reference.
	 * @see #getFOpposite()
	 * @generated
	 * @since 1.0
	 */
	void setFOpposite(FacetReference value);
} // FacetReference
