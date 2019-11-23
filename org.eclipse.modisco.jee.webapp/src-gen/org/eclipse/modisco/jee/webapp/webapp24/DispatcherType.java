/**
 *   Copyright (c) 2010 Mia-Software.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp24;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dispatcher Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The dispatcher has four legal values: FORWARD, REQUEST, INCLUDE,
 * 	and ERROR. A value of FORWARD means the Filter will be applied
 * 	under RequestDispatcher.forward() calls.  A value of REQUEST
 * 	means the Filter will be applied under ordinary client calls to
 * 	the path or servlet. A value of INCLUDE means the Filter will be
 * 	applied under RequestDispatcher.include() calls.  A value of
 * 	ERROR means the Filter will be applied under the error page
 * 	mechanism.  The absence of any dispatcher elements in a
 * 	filter-mapping indicates a default of applying filters only under
 * 	ordinary client calls to the path or servlet.
 * 
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getDispatcherType()
 * @model extendedMetaData="name='dispatcherType' kind='simple'"
 * @generated
 */
public interface DispatcherType extends org.eclipse.modisco.jee.webapp.webapp24.String {
} // DispatcherType
