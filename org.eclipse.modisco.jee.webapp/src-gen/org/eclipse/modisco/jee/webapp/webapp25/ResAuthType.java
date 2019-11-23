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
package org.eclipse.modisco.jee.webapp.webapp25;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Res Auth Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The res-authType specifies whether the Deployment Component
 * 	code signs on programmatically to the resource manager, or
 * 	whether the Container will sign on to the resource manager
 * 	on behalf of the Deployment Component. In the latter case,
 * 	the Container uses information that is supplied by the
 * 	Deployer.
 * 
 * 	The value must be one of the two following:
 * 
 * 	    Application
 * 	    Container
 * 
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getResAuthType()
 * @model extendedMetaData="name='res-authType' kind='simple'"
 * @generated
 */
public interface ResAuthType extends org.eclipse.modisco.jee.webapp.webapp25.String {
} // ResAuthType
