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
package org.eclipse.modisco.jee.ejbjar.EjbJar30;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trans Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The trans-attributeType specifies how the container must
 * 	manage the transaction boundaries when delegating a method
 * 	invocation to an enterprise bean's business method.
 * 
 * 	The value must be one of the following:
 * 
 * 	    NotSupported
 * 	    Supports
 * 	    Required
 * 	    RequiresNew
 * 	    Mandatory
 * 	    Never
 * 
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getTransAttributeType()
 * @model extendedMetaData="name='trans-attributeType' kind='simple'"
 * @generated
 */
public interface TransAttributeType extends org.eclipse.modisco.jee.ejbjar.EjbJar30.String {
} // TransAttributeType
