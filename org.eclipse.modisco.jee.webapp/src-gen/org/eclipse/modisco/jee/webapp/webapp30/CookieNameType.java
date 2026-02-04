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
 * A representation of the model object '<em><b>Cookie Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The name that will be assigned to any session tracking
 *         cookies created by this web application.
 *         The default is JSESSIONID
 *         
 *         Used in: cookie-config
 *         
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getCookieNameType()
 * @model extendedMetaData="name='cookie-nameType' kind='simple'"
 * @generated
 */
public interface CookieNameType extends NonEmptyStringType {
} // CookieNameType
