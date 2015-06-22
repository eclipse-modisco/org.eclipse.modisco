/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.infra.browser.custom;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.infra.browser.custom.CustomView#getCustomizedFeatures <em>Customized Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomPackage#getCustomView()
 * @model abstract="true"
 * @generated
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public interface CustomView extends EObject {
	/**
	 * Returns the value of the '<em><b>Customized Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.infra.browser.custom.CustomViewFeature}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.infra.browser.custom.CustomViewFeature#getCustomView <em>Custom View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customized Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customized Features</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomPackage#getCustomView_CustomizedFeatures()
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.CustomViewFeature#getCustomView
	 * @model opposite="customView" containment="true"
	 * @generated
	 */
	EList<CustomViewFeature> getCustomizedFeatures();

} // CustomView
