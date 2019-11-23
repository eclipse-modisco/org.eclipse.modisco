/**
 * Copyright (c) 2011 Mia-Software.
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
import org.eclipse.modisco.java.AbstractMethodDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallNode#getMethodCalls <em>Method Calls</em>}</li>
 *   <li>{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallNode#getSubMethods <em>Sub Methods</em>}</li>
 *   <li>{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallNode#getJavaMethod <em>Java Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallNode#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodcallsPackage#getCallNode()
 * @model
 * @generated
 */
public interface CallNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Method Calls</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodCall}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodCall#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Calls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Calls</em>' containment reference list.
	 * @see org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodcallsPackage#getCallNode_MethodCalls()
	 * @see org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodCall#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<MethodCall> getMethodCalls();

	/**
	 * Returns the value of the '<em><b>Sub Methods</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Methods</em>' reference list.
	 * @see org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodcallsPackage#getCallNode_SubMethods()
	 * @model
	 * @generated
	 */
	EList<CallNode> getSubMethods();

	/**
	 * Returns the value of the '<em><b>Java Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Method</em>' reference.
	 * @see #setJavaMethod(AbstractMethodDeclaration)
	 * @see org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodcallsPackage#getCallNode_JavaMethod()
	 * @model required="true"
	 * @generated
	 */
	AbstractMethodDeclaration getJavaMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallNode#getJavaMethod <em>Java Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Method</em>' reference.
	 * @see #getJavaMethod()
	 * @generated
	 */
	void setJavaMethod(AbstractMethodDeclaration value);

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
	 * @see org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodcallsPackage#getCallNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CallNode
