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
 * A representation of the model object '<em><b>Ejb Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 	<![CDATA[
 * 
 * 	  The ejb-linkType is used by ejb-link
 * 	  elements in the ejb-ref or ejb-local-ref elements to specify
 * 	  that an EJB reference is linked to enterprise bean.
 * 
 * 	  The value of the ejb-link element must be the ejb-name of an
 * 	  enterprise bean in the same ejb-jar file or in another ejb-jar
 * 	  file in the same J2EE application unit.
 * 
 * 	  Alternatively, the name in the ejb-link element may be
 * 	  composed of a path name specifying the ejb-jar containing the
 * 	  referenced enterprise bean with the ejb-name of the target
 * 	  bean appended and separated from the path name by "#".  The
 * 	  path name is relative to the Deployment File containing
 * 	  Deployment Component that is referencing the enterprise
 * 	  bean.  This allows multiple enterprise beans with the same
 * 	  ejb-name to be uniquely identified.
 * 
 * 	  Examples:
 * 
 * 	      <ejb-link>EmployeeRecord</ejb-link>
 * 
 * 	      <ejb-link>../products/product.jar#ProductEJB</ejb-link>
 * 
 * 	  ]]>
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getEjbLinkType()
 * @model extendedMetaData="name='ejb-linkType' kind='simple'"
 * @generated
 */
public interface EjbLinkType extends org.eclipse.modisco.jee.ejbjar.EjbJar21.String {
} // EjbLinkType
