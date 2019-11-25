/**
 *  Copyright (c) 2011, 2019 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 *  	Nicolas Guyomar (Mia-Software) - Bug 334615 - Java Query for EMF Facet
 *  	Emmanuelle Rouillé (Mia-Software) - Bug 352618 - To be able to use non derived facet structural features and save them values. 
 *  
 */
package org.eclipse.modisco.facet.query.java.metamodel.v0_2_0.javaquery;

import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.extensible.Query;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.facet.query.java.metamodel.v0_2_0.javaquery.JavaQuery#getImplementationClassName <em>Implementation Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.facet.query.java.metamodel.v0_2_0.javaquery.JavaQueryPackage#getJavaQuery()
 * @model
 * @generated
 */
public interface JavaQuery extends Query {
	/**
	 * Returns the value of the '<em><b>Implementation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Class Name</em>' attribute.
	 * @see #setImplementationClassName(String)
	 * @see org.eclipse.modisco.facet.query.java.metamodel.v0_2_0.javaquery.JavaQueryPackage#getJavaQuery_ImplementationClassName()
	 * @model
	 * @generated
	 */
	String getImplementationClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.facet.query.java.metamodel.v0_2_0.javaquery.JavaQuery#getImplementationClassName <em>Implementation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Class Name</em>' attribute.
	 * @see #getImplementationClassName()
	 * @generated
	 */
	void setImplementationClassName(String value);

} // JavaQuery
