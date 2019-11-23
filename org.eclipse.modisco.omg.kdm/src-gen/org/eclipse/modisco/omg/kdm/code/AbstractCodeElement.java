/**
 * 
 * Copyright (c) 2009 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.code;

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.omg.kdm.action.EntryFlow;
import org.eclipse.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.modisco.omg.kdm.source.SourceRef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Code Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.code.AbstractCodeElement#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.code.AbstractCodeElement#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.code.AbstractCodeElement#getCodeRelation <em>Code Relation</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.code.AbstractCodeElement#getEntryFlow <em>Entry Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.code.CodePackage#getAbstractCodeElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractCodeElement extends KDMEntity {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.source.SourceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.code.CodePackage#getAbstractCodeElement_Source()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceRef> getSource();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.code.CommentUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.code.CodePackage#getAbstractCodeElement_Comment()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CommentUnit> getComment();

	/**
	 * Returns the value of the '<em><b>Code Relation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.code.AbstractCodeRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Relation</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.code.CodePackage#getAbstractCodeElement_CodeRelation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractCodeRelationship> getCodeRelation();

	/**
	 * Returns the value of the '<em><b>Entry Flow</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.action.EntryFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Flow</em>' reference list.
	 * @see org.eclipse.modisco.omg.kdm.code.CodePackage#getAbstractCodeElement_EntryFlow()
	 * @model
	 * @generated
	 */
	EList<EntryFlow> getEntryFlow();

} // AbstractCodeElement
