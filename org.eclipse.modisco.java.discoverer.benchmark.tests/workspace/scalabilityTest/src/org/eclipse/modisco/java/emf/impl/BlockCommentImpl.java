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
package org.eclipse.modisco.java.emf.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.modisco.java.BlockComment;

import org.eclipse.modisco.java.emf.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BlockCommentImpl extends CommentImpl implements BlockComment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockCommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getBlockComment();
	}

} //BlockCommentImpl
