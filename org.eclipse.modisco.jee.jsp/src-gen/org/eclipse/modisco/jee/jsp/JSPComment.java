/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *   
 *   	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.jsp;

import org.eclipse.gmt.modisco.xml.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSP Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * &#60;%-- Here is a JSP Comment --%&#62;
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.jsp.JSPComment#isIsTagFragment <em>Is Tag Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.jsp.JspPackage#getJSPComment()
 * @model
 * @generated
 */
public interface JSPComment extends Node {
	/**
	 * Returns the value of the '<em><b>Is Tag Fragment</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tag Fragment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tag Fragment</em>' attribute.
	 * @see #setIsTagFragment(boolean)
	 * @see org.eclipse.modisco.jee.jsp.JspPackage#getJSPComment_IsTagFragment()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsTagFragment();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.jsp.JSPComment#isIsTagFragment <em>Is Tag Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tag Fragment</em>' attribute.
	 * @see #isIsTagFragment()
	 * @generated
	 */
	void setIsTagFragment(boolean value);

} // JSPComment
