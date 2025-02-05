/**
 * *******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
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
package org.eclipse.modisco.java.nousages.cdo.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.Comment;
import org.eclipse.modisco.java.CompilationUnit;
import org.eclipse.modisco.java.ImportDeclaration;
import org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Compilation Unit</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.nousages.cdo.impl.CompilationUnitImpl#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.nousages.cdo.impl.CompilationUnitImpl#getCommentList <em>Comment List</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.nousages.cdo.impl.CompilationUnitImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.nousages.cdo.impl.CompilationUnitImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.nousages.cdo.impl.CompilationUnitImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompilationUnitImpl extends NamedElementImpl implements
		CompilationUnit {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getCompilationUnit();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginalFilePath() {
		return (String)eGet(JavaPackage.eINSTANCE.getCompilationUnit_OriginalFilePath(), true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalFilePath(String newOriginalFilePath) {
		eSet(JavaPackage.eINSTANCE.getCompilationUnit_OriginalFilePath(), newOriginalFilePath);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Comment> getCommentList() {
		return (EList<Comment>)eGet(JavaPackage.eINSTANCE.getCompilationUnit_CommentList(), true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ImportDeclaration> getImports() {
		return (EList<ImportDeclaration>)eGet(JavaPackage.eINSTANCE.getCompilationUnit_Imports(), true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.java.Package getPackage() {
		return (org.eclipse.modisco.java.Package)eGet(JavaPackage.eINSTANCE.getCompilationUnit_Package(), true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(org.eclipse.modisco.java.Package newPackage) {
		eSet(JavaPackage.eINSTANCE.getCompilationUnit_Package(), newPackage);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractTypeDeclaration> getTypes() {
		return (EList<AbstractTypeDeclaration>)eGet(JavaPackage.eINSTANCE.getCompilationUnit_Types(), true);
	}

	public EList<ImportDeclaration> getUsagesInImports() {
		// no usages references
		return null;
	}

} // CompilationUnitImpl
