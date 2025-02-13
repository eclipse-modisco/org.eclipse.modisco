/**
 *   Copyright (c) 2010, 2019 Mia-Software and others.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp30;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auth Method Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The auth-methodType is used to configure the authentication
 *         mechanism for the web application. As a prerequisite to
 *         gaining access to any web resources which are protected by
 *         an authorization constraint, a user must have authenticated
 *         using the configured mechanism. Legal values are "BASIC",
 *         "DIGEST", "FORM", "CLIENT-CERT", or a vendor-specific
 *         authentication scheme.
 *         
 *         Used in: login-config
 *         
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getAuthMethodType()
 * @model extendedMetaData="name='auth-methodType' kind='simple'"
 * @generated
 */
public interface AuthMethodType extends org.eclipse.modisco.jee.webapp.webapp30.String {
} // AuthMethodType
