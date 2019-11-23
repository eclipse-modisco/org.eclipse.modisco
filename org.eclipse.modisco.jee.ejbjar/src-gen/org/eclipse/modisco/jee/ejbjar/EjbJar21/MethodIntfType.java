/**
 * Copyright (c) 2010, 2019 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar21;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Intf Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The method-intf element allows a method element to
 * 	differentiate between the methods with the same name and
 * 	signature that are multiply defined across the home and
 * 	component interfaces (e.g, in both an enterprise bean's
 * 	remote and local interfaces or in both an enterprise bean's
 * 	home and remote interfaces, etc.); the component and web
 * 	service endpoint interfaces, and so on.
 * 
 * 	The method-intf element must be one of the following:
 * 
 * 	    Home
 * 	    Remote
 * 	    LocalHome
 * 	    Local
 * 	    ServiceEndpoint
 * 
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getMethodIntfType()
 * @model extendedMetaData="name='method-intfType' kind='simple'"
 * @generated
 */
public interface MethodIntfType extends org.eclipse.modisco.jee.ejbjar.EjbJar21.String {
} // MethodIntfType
