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
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.java.cdo.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.PackageAccess;
import org.eclipse.modisco.java.cdo.meta.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.cdo.impl.PackageImpl#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.cdo.impl.PackageImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.cdo.impl.PackageImpl#getOwnedPackages <em>Owned Packages</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.cdo.impl.PackageImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.cdo.impl.PackageImpl#getUsagesInPackageAccess <em>Usages In Package Access</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements org.eclipse.modisco.java.Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractTypeDeclaration> getOwnedElements() {
		return (EList<AbstractTypeDeclaration>)eGet(JavaPackage.eINSTANCE.getPackage_OwnedElements(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		return (Model)eGet(JavaPackage.eINSTANCE.getPackage_Model(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		eSet(JavaPackage.eINSTANCE.getPackage_Model(), newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.eclipse.modisco.java.Package> getOwnedPackages() {
		return (EList<org.eclipse.modisco.java.Package>)eGet(JavaPackage.eINSTANCE.getPackage_OwnedPackages(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.java.Package getPackage() {
		return (org.eclipse.modisco.java.Package)eGet(JavaPackage.eINSTANCE.getPackage_Package(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(org.eclipse.modisco.java.Package newPackage) {
		eSet(JavaPackage.eINSTANCE.getPackage_Package(), newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageAccess> getUsagesInPackageAccess() {
		return (EList<PackageAccess>)eGet(JavaPackage.eINSTANCE.getPackage_UsagesInPackageAccess(), true);
	}

} //PackageImpl
