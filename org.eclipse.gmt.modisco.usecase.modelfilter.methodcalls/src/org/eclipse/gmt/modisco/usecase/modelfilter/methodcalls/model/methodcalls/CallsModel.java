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

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Calls Model</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallsModel#getCallNodes
 * <em>Call Nodes</em>}</li>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallsModel#getRootNodes
 * <em>Root Nodes</em>}</li>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallsModel#getName
 * <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodcallsPackage#getCallsModel()
 * @model
 * @generated
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public interface CallsModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Call Nodes</b></em>' containment reference list. The list
	 * contents are of type
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Nodes</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Call Nodes</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodcallsPackage#getCallsModel_CallNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<CallNode> getCallNodes();

	/**
	 * Returns the value of the '<em><b>Root Nodes</b></em>' reference list. The list contents are
	 * of type
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Nodes</em>' reference list isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Root Nodes</em>' reference list.
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodcallsPackage#getCallsModel_RootNodes()
	 * @model derived="true"
	 * @generated
	 */
	EList<CallNode> getRootNodes();

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
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodcallsPackage#getCallsModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallsModel#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CallsModel
