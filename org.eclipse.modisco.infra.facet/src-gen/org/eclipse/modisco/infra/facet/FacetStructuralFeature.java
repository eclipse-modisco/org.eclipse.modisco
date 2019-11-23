/**
 * Copyright (c) 2009, 2011 Mia-Software and others.
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.query.ModelQuery;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.facet.FacetStructuralFeature#getValueQuery <em>Value Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.facet.FacetPackage#getFacetStructuralFeature()
 * @model abstract="true"
 * @generated
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public interface FacetStructuralFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Query</em>' reference.
	 * @see #setValueQuery(ModelQuery)
	 * @see org.eclipse.modisco.infra.facet.FacetPackage#getFacetStructuralFeature_ValueQuery()
	 * @model required="true"
	 * @generated
	 */
	ModelQuery getValueQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.facet.FacetStructuralFeature#getValueQuery <em>Value Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Query</em>' reference.
	 * @see #getValueQuery()
	 * @generated
	 */
	void setValueQuery(ModelQuery value);

} // FacetStructuralFeature
