/**
 * Copyright (c) 2009 Mia-Software and others.
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
package org.eclipse.modisco.infra.query.runtime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Query Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.query.runtime.ModelQueryResult#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.runtime.ModelQueryResult#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.runtime.ModelQueryResult#getException <em>Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.query.runtime.RuntimePackage#getModelQueryResult()
 * @model
 * @generated
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public interface ModelQueryResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EObject)
	 * @see org.eclipse.modisco.infra.query.runtime.RuntimePackage#getModelQueryResult_Source()
	 * @model required="true"
	 * @generated
	 */
	EObject getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.query.runtime.ModelQueryResult#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EObject value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see org.eclipse.modisco.infra.query.runtime.RuntimePackage#getModelQueryResult_Value()
	 * @model
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.query.runtime.ModelQueryResult#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' attribute.
	 * @see #setException(Exception)
	 * @see org.eclipse.modisco.infra.query.runtime.RuntimePackage#getModelQueryResult_Exception()
	 * @model dataType=org.eclipse.modisco.infra.query.runtime.JavaException"
	 * @generated
	 */
	Exception getException();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.query.runtime.ModelQueryResult#getException <em>Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' attribute.
	 * @see #getException()
	 * @generated
	 */
	void setException(Exception value);

} // ModelQueryResult
