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
 * A representation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodCall#getOrder <em>Order</em>}</li>
 *   <li>{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodCall#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodCall#getCallee <em>Callee</em>}</li>
 *   <li>{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodCall#getFilteredSubMethods <em>Filtered Sub Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodcallsPackage#getMethodCall()
 * @model
 * @generated
 */
public interface MethodCall extends EObject {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodcallsPackage#getMethodCall_Order()
	 * @model
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodCall#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallNode#getMethodCalls <em>Method Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(CallNode)
	 * @see org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodcallsPackage#getMethodCall_Parent()
	 * @see org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallNode#getMethodCalls
	 * @model opposite="methodCalls" required="true" transient="false"
	 * @generated
	 */
	CallNode getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodCall#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CallNode value);

	/**
	 * Returns the value of the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callee</em>' reference.
	 * @see #setCallee(CallNode)
	 * @see org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodcallsPackage#getMethodCall_Callee()
	 * @model required="true"
	 * @generated
	 */
	CallNode getCallee();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodCall#getCallee <em>Callee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callee</em>' reference.
	 * @see #getCallee()
	 * @generated
	 */
	void setCallee(CallNode value);

	/**
	 * Returns the value of the '<em><b>Filtered Sub Methods</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filtered Sub Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filtered Sub Methods</em>' reference list.
	 * @see org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodcallsPackage#getMethodCall_FilteredSubMethods()
	 * @model
	 * @generated
	 */
	EList<CallNode> getFilteredSubMethods();

} // MethodCall
