/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - meta-model design
 *     Gregoire DUPE (Mia-Software) - design and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Model Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * JavaModelQuery is a sub class of ModelQuery which points to a Java implemented query.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.query.JavaModelQuery#getImplementationClassName <em>Implementation Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.query.QueryPackage#getJavaModelQuery()
 * @model
 * @generated
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public interface JavaModelQuery extends ModelQuery {
	/**
	 * Returns the value of the '<em><b>Implementation Class Name</b></em>'
	 * attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Class Name</em>' attribute
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc --> <!-- begin-model-doc -->
	 * JavaModelQuery::implemenationClassName contains the qualified name of the
	 * class implementing the query. This class must be a sub class of
	 * org.eclipse.modisco.infra.query.core.java.IJavaModelQuery. The Java
	 * implementation class must be stored in the same plug-in (or plug-in
	 * project) than the query model. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Implementation Class Name</em>' attribute.
	 * @see #setImplementationClassName(String)
	 * @see org.eclipse.modisco.infra.query.QueryPackage#getJavaModelQuery_ImplementationClassName()
	 * @model
	 * @generated
	 */
	String getImplementationClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.query.JavaModelQuery#getImplementationClassName <em>Implementation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Class Name</em>' attribute.
	 * @see #getImplementationClassName()
	 * @generated
	 */
	void setImplementationClassName(String value);

} // JavaModelQuery
