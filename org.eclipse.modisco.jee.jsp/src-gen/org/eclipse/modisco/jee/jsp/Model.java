/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *   	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.jsp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.jsp.Model#getPages <em>Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.jsp.JspPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.jsp.Page}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.jee.jsp.Page#getPageOwner <em>Page Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.jsp.JspPackage#getModel_Pages()
	 * @see org.eclipse.modisco.jee.jsp.Page#getPageOwner
	 * @model opposite="pageOwner" containment="true"
	 * @generated
	 */
	EList<Page> getPages();

} // Model
