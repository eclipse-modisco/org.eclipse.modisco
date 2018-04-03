/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v1.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar21;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Res Sharing Scope Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The res-sharing-scope type specifies whether connections
 * 	obtained through the given resource manager connection
 * 	factory reference can be shared. The value, if specified,
 * 	must be one of the two following:
 * 
 * 	    Shareable
 * 	    Unshareable
 * 
 * 	The default value is Shareable.
 * 
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getResSharingScopeType()
 * @model extendedMetaData="name='res-sharing-scopeType' kind='simple'"
 * @generated
 */
public interface ResSharingScopeType extends org.eclipse.modisco.jee.ejbjar.EjbJar21.String {
} // ResSharingScopeType
