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
import org.eclipse.modisco.java.EnumConstantDeclaration;
import org.eclipse.modisco.java.EnumDeclaration;
import org.eclipse.modisco.java.ImportDeclaration;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Enum Declaration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.nousages.cdo.impl.EnumDeclarationImpl#getEnumConstants <em>Enum Constants</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumDeclarationImpl extends AbstractTypeDeclarationImpl implements
		EnumDeclaration {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getEnumDeclaration();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EnumConstantDeclaration> getEnumConstants() {
		return (EList<EnumConstantDeclaration>)eGet(JavaPackage.eINSTANCE.getEnumDeclaration_EnumConstants(), true);
	}

	public EList<ImportDeclaration> getUsagesInImports() {
		// no usages references
		return null;
	}

	public EList<TypeAccess> getUsagesInTypeAccess() {
		// no usages references
		return null;
	}

} // EnumDeclarationImpl
