/**
 *  Copyright (c) 2011, 2019 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 * 	Gregoire Dupe (Mia-Software) - Design
 * 	Nicolas Guyomar (Mia-Software) - Implementation
 * 	Emmanuelle Rouillé (Mia-Software) - Bug 352618 - To be able to use non derived facet structural features and save them values. 
 * 	Nicolas Bros (Mia-Software) - Bug 361823 - [Restructuring] eFacet2 meta-model
 *       Gregoire Dupe (Mia-Software) - Bug 366055 - NavigationQuery
 *       Gregoire Dupe (Mia-Software) - Bug 369673 - [Facet] IsOneOfQuery
 *       Olivier Remaud (Soft-Maint) - Bug 369824 - Add a simple way to return string literal constants from a customization query
 *       Gregoire Dupe (Mia-software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *       Gregoire Dupe (Mia-software) - Bug 364325 - [Restructuring] The user must be able to navigate into a model using the Facet.
 */
package org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.runtime;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETyped Element EObject List Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the result of evaluating the value of a multiplicity-many DerivedTypedElement by means of a multi-valued query .
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.runtime.ETypedElementEObjectListResult#getResultList <em>Result List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.runtime.RuntimePackage#getETypedElementEObjectListResult()
 * @model
 * @generated
 */
public interface ETypedElementEObjectListResult<T extends EObject> extends ETypedElementResult {
	/**
	 * Returns the value of the '<em><b>Result List</b></em>' reference list.
	 * The list contents are of type {@link T}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result List</em>' reference list.
	 * @see org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.runtime.RuntimePackage#getETypedElementEObjectListResult_ResultList()
	 * @model
	 * @generated
	 */
	EList<T> getResultList();

} // ETypedElementEObjectListResult
