/**
 * Copyright (c) 2009, 2011 Mia-Software.
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
package org.eclipse.modisco.infra.facet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.infra.query.ModelQuery;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * context Facet inv: self.conditionQuery.scope->exists(e|self.extendedClass.isSuperTypeOf(self.superType))
 * 
 * context Facet inv: self.conditionQuery.retrunType.name == "EBoolean"
 * 
 * context Facet inv: self.eStructuralFeature.isKindOf(FacetStructuralFeature)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.facet.Facet#getConditionQuery <em>Condition Query</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.facet.Facet#getFacetSet <em>Facet Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.facet.FacetPackage#getFacet()
 * @model
 * @generated
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public interface Facet extends EClass {
	/**
	 * Returns the value of the '<em><b>Condition Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Query</em>' reference.
	 * @see #setConditionQuery(ModelQuery)
	 * @see org.eclipse.modisco.infra.facet.FacetPackage#getFacet_ConditionQuery()
	 * @model
	 * @generated
	 */
	ModelQuery getConditionQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.facet.Facet#getConditionQuery <em>Condition Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Query</em>' reference.
	 * @see #getConditionQuery()
	 * @generated
	 */
	void setConditionQuery(ModelQuery value);

	/**
	 * Returns the value of the '<em><b>Facet Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.infra.facet.FacetSet#getFacets <em>Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facet Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facet Set</em>' reference.
	 * @see org.eclipse.modisco.infra.facet.FacetPackage#getFacet_FacetSet()
	 * @see org.eclipse.modisco.infra.facet.FacetSet#getFacets
	 * @model opposite="facets" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	FacetSet getFacetSet();

} // Facet
