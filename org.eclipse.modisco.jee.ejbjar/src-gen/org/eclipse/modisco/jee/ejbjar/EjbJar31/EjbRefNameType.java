/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar31;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ejb Ref Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <![CDATA[[
 *         The ejb-ref-name element contains the name of an EJB
 *         reference. The EJB reference is an entry in the
 *         Deployment Component's environment and is relative to the
 *         java:comp/env context.  The name must be unique within the
 *         Deployment Component.
 *         
 *         It is recommended that name is prefixed with "ejb/".
 *         
 *         Example:
 *         
 *         <ejb-ref-name>ejb/Payroll</ejb-ref-name>
 *         
 *         ]]>
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getEjbRefNameType()
 * @model extendedMetaData="name='ejb-ref-nameType' kind='simple'"
 * @generated
 */
public interface EjbRefNameType extends JndiNameType {
} // EjbRefNameType
