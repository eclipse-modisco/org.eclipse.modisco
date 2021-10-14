/**
 * 
 * Copyright (c) 2009, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.source;

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.omg.kdm.core.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.source.SourceRef#getRegion <em>Region</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.source.SourceRef#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.source.SourceRef#getSnippet <em>Snippet</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.source.SourcePackage#getSourceRef()
 * @model
 * @generated
 */
public interface SourceRef extends Element {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.source.SourceRegion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.source.SourcePackage#getSourceRef_Region()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceRegion> getRegion();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.eclipse.modisco.omg.kdm.source.SourcePackage#getSourceRef_Language()
	 * @model dataType=org.eclipse.modisco.omg.kdm.core.String"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.kdm.source.SourceRef#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Snippet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snippet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snippet</em>' attribute.
	 * @see #setSnippet(String)
	 * @see org.eclipse.modisco.omg.kdm.source.SourcePackage#getSourceRef_Snippet()
	 * @model dataType=org.eclipse.modisco.omg.kdm.core.String"
	 * @generated
	 */
	String getSnippet();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.kdm.source.SourceRef#getSnippet <em>Snippet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snippet</em>' attribute.
	 * @see #getSnippet()
	 * @generated
	 */
	void setSnippet(String value);

} // SourceRef
