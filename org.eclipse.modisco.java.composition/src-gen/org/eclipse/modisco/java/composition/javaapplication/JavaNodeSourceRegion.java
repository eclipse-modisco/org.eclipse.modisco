/**
 *  Copyright (c) 2010, 2019 Mia-Software.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *          Fabien Giquel (Mia-Software) - initial API and implementation
 *  	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 * 
 */
package org.eclipse.modisco.java.composition.javaapplication;

import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Node Source Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.composition.javaapplication.JavaNodeSourceRegion#getJavaNode <em>Java Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJavaNodeSourceRegion()
 * @model
 * @generated
 */
public interface JavaNodeSourceRegion extends ASTNodeSourceRegion {
	/**
	 * Returns the value of the '<em><b>Java Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Node</em>' reference.
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#getJavaNodeSourceRegion_JavaNode()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	ASTNode getJavaNode();

} // JavaNodeSourceRegion
