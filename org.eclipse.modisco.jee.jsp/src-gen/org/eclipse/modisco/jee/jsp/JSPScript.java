/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
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

import org.eclipse.modisco.xml.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSP Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.jsp.JSPScript#isIsTagFragment <em>Is Tag Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.jsp.JspPackage#getJSPScript()
 * @model
 * @generated
 */
public interface JSPScript extends Element {
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
	 * @see org.eclipse.modisco.jee.jsp.JspPackage#getJSPScript_IsTagFragment()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsTagFragment();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.jsp.JSPScript#isIsTagFragment <em>Is Tag Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tag Fragment</em>' attribute.
	 * @see #isIsTagFragment()
	 * @generated
	 */
	void setIsTagFragment(boolean value);

} // JSPScript
