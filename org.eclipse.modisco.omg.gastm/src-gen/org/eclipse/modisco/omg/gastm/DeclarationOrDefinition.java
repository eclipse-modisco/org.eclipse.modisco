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
 * A representation of the model object '<em><b>Declaration Or Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.DeclarationOrDefinition#getStorageSpecifiers <em>Storage Specifiers</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.DeclarationOrDefinition#getAccessKind <em>Access Kind</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.DeclarationOrDefinition#getLinkageSpecifier <em>Linkage Specifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDeclarationOrDefinition()
 * @model abstract="true"
 * @generated
 */
public interface DeclarationOrDefinition extends DefinitionObject {
	/**
	 * Returns the value of the '<em><b>Storage Specifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Specifiers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Specifiers</em>' containment reference.
	 * @see #setStorageSpecifiers(StorageSpecification)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDeclarationOrDefinition_StorageSpecifiers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StorageSpecification getStorageSpecifiers();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.DeclarationOrDefinition#getStorageSpecifiers <em>Storage Specifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Specifiers</em>' containment reference.
	 * @see #getStorageSpecifiers()
	 * @generated
	 */
	void setStorageSpecifiers(StorageSpecification value);

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
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDeclarationOrDefinition_AccessKind()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AccessKind getAccessKind();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.DeclarationOrDefinition#getAccessKind <em>Access Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Kind</em>' containment reference.
	 * @see #getAccessKind()
	 * @generated
	 */
	void setAccessKind(AccessKind value);

	/**
	 * Returns the value of the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linkage Specifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkage Specifier</em>' attribute.
	 * @see #setLinkageSpecifier(String)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDeclarationOrDefinition_LinkageSpecifier()
	 * @model
	 * @generated
	 */
	String getLinkageSpecifier();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.DeclarationOrDefinition#getLinkageSpecifier <em>Linkage Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkage Specifier</em>' attribute.
	 * @see #getLinkageSpecifier()
	 * @generated
	 */
	void setLinkageSpecifier(String value);

} // DeclarationOrDefinition
