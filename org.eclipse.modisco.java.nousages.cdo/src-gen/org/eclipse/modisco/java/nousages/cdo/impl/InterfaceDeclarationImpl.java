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
import org.eclipse.modisco.java.ImportDeclaration;
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Interface Declaration</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InterfaceDeclarationImpl extends TypeDeclarationImpl implements
		InterfaceDeclaration {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getInterfaceDeclaration();
	}

	public EList<ImportDeclaration> getUsagesInImports() {
		// no usages references
		return null;
	}

	public EList<TypeAccess> getUsagesInTypeAccess() {
		// no usages references
		return null;
	}

} // InterfaceDeclarationImpl
