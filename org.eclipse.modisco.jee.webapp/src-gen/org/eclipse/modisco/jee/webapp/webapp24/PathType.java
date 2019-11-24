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
package org.eclipse.modisco.jee.webapp.webapp24;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The elements that use this type designate either a relative
 * 	path or an absolute path starting with a "/".
 * 
 * 	In elements that specify a pathname to a file within the
 * 	same Deployment File, relative filenames (i.e., those not
 * 	starting with "/") are considered relative to the root of
 * 	the Deployment File's namespace.  Absolute filenames (i.e.,
 * 	those starting with "/") also specify names in the root of
 * 	the Deployment File's namespace.  In general, relative names
 * 	are preferred.  The exception is .war files where absolute
 * 	names are preferred for consistency with the Servlet API.
 * 
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getPathType()
 * @model extendedMetaData="name='pathType' kind='simple'"
 * @generated
 */
public interface PathType extends org.eclipse.modisco.jee.webapp.webapp24.String {
} // PathType
