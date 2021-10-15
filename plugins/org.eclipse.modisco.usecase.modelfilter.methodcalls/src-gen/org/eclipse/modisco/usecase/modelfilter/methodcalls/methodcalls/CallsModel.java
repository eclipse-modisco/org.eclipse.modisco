/**
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Gabriel Barbier (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 */
package org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calls Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallsModel#getCallNodes <em>Call Nodes</em>}</li>
 *   <li>{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallsModel#getRootNodes <em>Root Nodes</em>}</li>
 *   <li>{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallsModel#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodcallsPackage#getCallsModel()
 * @model
 * @generated
 */
public interface CallsModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Call Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Nodes</em>' containment reference list.
	 * @see org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodcallsPackage#getCallsModel_CallNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<CallNode> getCallNodes();

	/**
	 * Returns the value of the '<em><b>Root Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Nodes</em>' reference list.
	 * @see org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodcallsPackage#getCallsModel_RootNodes()
	 * @model derived="true"
	 * @generated
	 */
	EList<CallNode> getRootNodes();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodcallsPackage#getCallsModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallsModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CallsModel
