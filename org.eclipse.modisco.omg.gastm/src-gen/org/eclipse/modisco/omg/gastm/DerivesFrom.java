/**
 * <copyright>
 * Copyright (c) 2009, 2019 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derives From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.DerivesFrom#getVirtualSpecifier <em>Virtual Specifier</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.DerivesFrom#getAccessKind <em>Access Kind</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.DerivesFrom#getClassName <em>Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDerivesFrom()
 * @model
 * @generated
 */
public interface DerivesFrom extends MinorSyntaxObject {
	/**
	 * Returns the value of the '<em><b>Virtual Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Specifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Specifier</em>' containment reference.
	 * @see #setVirtualSpecifier(VirtualSpecification)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDerivesFrom_VirtualSpecifier()
	 * @model containment="true"
	 * @generated
	 */
	VirtualSpecification getVirtualSpecifier();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.DerivesFrom#getVirtualSpecifier <em>Virtual Specifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Specifier</em>' containment reference.
	 * @see #getVirtualSpecifier()
	 * @generated
	 */
	void setVirtualSpecifier(VirtualSpecification value);

	/**
	 * Returns the value of the '<em><b>Access Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Kind</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Kind</em>' containment reference.
	 * @see #setAccessKind(AccessKind)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDerivesFrom_AccessKind()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AccessKind getAccessKind();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.DerivesFrom#getAccessKind <em>Access Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Kind</em>' containment reference.
	 * @see #getAccessKind()
	 * @generated
	 */
	void setAccessKind(AccessKind value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' containment reference.
	 * @see #setClassName(NamedTypeReference)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDerivesFrom_ClassName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedTypeReference getClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.DerivesFrom#getClassName <em>Class Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' containment reference.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(NamedTypeReference value);

} // DerivesFrom
