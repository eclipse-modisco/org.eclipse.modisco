/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - meta-model design
 *     Gregoire DUPE (Mia-Software) - design and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.query.runtime;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Query Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.query.runtime.ModelQueryContext#getSelectedModelElements <em>Selected Model Elements</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.runtime.ModelQueryContext#getSelectedModels <em>Selected Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.query.runtime.RuntimePackage#getModelQueryContext()
 * @model
 * @generated
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public interface ModelQueryContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Selected Model Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Model Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Model Elements</em>' reference list.
	 * @see org.eclipse.modisco.infra.query.runtime.RuntimePackage#getModelQueryContext_SelectedModelElements()
	 * @model
	 * @generated
	 */
	EList<EObject> getSelectedModelElements();

	/**
	 * Returns the value of the '<em><b>Selected Models</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.resource.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Models</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Models</em>' attribute list.
	 * @see org.eclipse.modisco.infra.query.runtime.RuntimePackage#getModelQueryContext_SelectedModels()
	 * @model transient="true"
	 * @generated
	 */
	EList<Resource> getSelectedModels();

} // ModelQueryContext
