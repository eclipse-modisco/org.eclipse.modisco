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
 * A representation of the model object '<em><b>Ejb Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 	<![CDATA[
 * 
 * 	  The ejb-nameType specifies an enterprise bean's name. It is
 * 	  used by ejb-name elements. This name is assigned by the
 * 	  ejb-jar file producer to name the enterprise bean in the
 * 	  ejb-jar file's deployment descriptor. The name must be
 * 	  unique among the names of the enterprise beans in the same
 * 	  ejb-jar file.
 * 
 * 	  There is no architected relationship between the used
 * 	  ejb-name in the deployment descriptor and the JNDI name that
 * 	  the Deployer will assign to the enterprise bean's home.
 * 
 * 	  The name for an entity bean must conform to the lexical
 * 	  rules for an NMTOKEN.
 * 
 * 	  Example:
 * 
 * 	  <ejb-name>EmployeeService</ejb-name>
 * 
 * 	  ]]>
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getEjbNameType()
 * @model extendedMetaData="name='ejb-nameType' kind='simple'"
 * @generated
 */
public interface EjbNameType extends XsdNMTOKENType {
} // EjbNameType
