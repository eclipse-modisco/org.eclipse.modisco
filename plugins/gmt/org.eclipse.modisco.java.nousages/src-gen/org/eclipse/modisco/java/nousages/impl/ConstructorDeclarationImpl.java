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
package org.eclipse.modisco.java.nousages.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.ConstructorDeclaration;
import org.eclipse.modisco.java.ImportDeclaration;
import org.eclipse.modisco.java.MethodRef;
import org.eclipse.modisco.java.nousages.meta.JavaPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Constructor Declaration</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class ConstructorDeclarationImpl extends AbstractMethodDeclarationImpl
		implements ConstructorDeclaration {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ConstructorDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getConstructorDeclaration();
	}

	public EList<AbstractMethodInvocation> getUsages() {
		// TODO Auto-generated method stub
		return null;
	}

	public EList<MethodRef> getUsagesInDocComments() {
		// no usage references
		return null;
	}

	public EList<ImportDeclaration> getUsagesInImports() {
		// no usage references
		return null;
	}

} // ConstructorDeclarationImpl
