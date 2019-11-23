/**
 * *******************************************************************************
 * Copyright (c) 2009 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 
 *     Sebastien Minguet (Mia-Software) - initial API and implementation
 *     Frederic Madiot (Mia-Software) - initial API and implementation
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - initial API and implementation
 *     Erwan Breton (Sodifrance) - initial API and implementation
 *     Romain Dervaux (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.Package#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.Package#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.Package#getOwnedPackages <em>Owned Packages</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.Package#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.Package#getUsagesInPackageAccess <em>Usages In Package Access</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.emf.JavaPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.AbstractTypeDeclaration}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.AbstractTypeDeclaration#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' containment reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getPackage_OwnedElements()
	 * @see org.eclipse.modisco.java.AbstractTypeDeclaration#getPackage
	 * @model opposite="package" containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractTypeDeclaration> getOwnedElements();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.Model#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getPackage_Model()
	 * @see org.eclipse.modisco.java.Model#getOwnedElements
	 * @model opposite="ownedElements" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.Package#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Owned Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.Package}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.Package#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Packages</em>' containment reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getPackage_OwnedPackages()
	 * @see org.eclipse.modisco.java.Package#getPackage
	 * @model opposite="package" containment="true" ordered="false"
	 * @generated
	 */
	EList<Package> getOwnedPackages();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.Package#getOwnedPackages <em>Owned Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(Package)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getPackage_Package()
	 * @see org.eclipse.modisco.java.Package#getOwnedPackages
	 * @model opposite="ownedPackages" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Package getPackage();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.Package#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(Package value);

	/**
	 * Returns the value of the '<em><b>Usages In Package Access</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.PackageAccess}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.PackageAccess#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usages In Package Access</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages In Package Access</em>' reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getPackage_UsagesInPackageAccess()
	 * @see org.eclipse.modisco.java.PackageAccess#getPackage
	 * @model opposite="package" ordered="false"
	 * @generated
	 */
	EList<PackageAccess> getUsagesInPackageAccess();

} // Package
