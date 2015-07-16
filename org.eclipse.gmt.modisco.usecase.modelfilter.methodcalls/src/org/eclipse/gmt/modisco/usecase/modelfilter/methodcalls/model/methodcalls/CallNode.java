/**
 * *******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *     
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Call Node</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode#getMethodCalls
 * <em>Method Calls</em>}</li>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode#getSubMethods
 * <em>Sub Methods</em>}</li>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode#getJavaMethod
 * <em>Java Method</em>}</li>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode#getName
 * <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodcallsPackage#getCallNode()
 * @model
 * @generated
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public interface CallNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Method Calls</b></em>' containment reference list. The list
	 * contents are of type
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodCall}.
	 * It is bidirectional and its opposite is '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodCall#getParent
	 * <em>Parent</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Calls</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Method Calls</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodcallsPackage#getCallNode_MethodCalls()
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodCall#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<MethodCall> getMethodCalls();

	/**
	 * Returns the value of the '<em><b>Sub Methods</b></em>' reference list. The list contents are
	 * of type
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Methods</em>' reference list isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Sub Methods</em>' reference list.
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodcallsPackage#getCallNode_SubMethods()
	 * @model
	 * @generated
	 */
	EList<CallNode> getSubMethods();

	/**
	 * Returns the value of the '<em><b>Java Method</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Method</em>' reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Java Method</em>' reference.
	 * @see #setJavaMethod(AbstractMethodDeclaration)
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodcallsPackage#getCallNode_JavaMethod()
	 * @model required="true"
	 * @generated
	 */
	AbstractMethodDeclaration getJavaMethod();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode#getJavaMethod
	 * <em>Java Method</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Java Method</em>' reference.
	 * @see #getJavaMethod()
	 * @generated
	 */
	void setJavaMethod(AbstractMethodDeclaration value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodcallsPackage#getCallNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CallNode
