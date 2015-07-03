/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.PostIncrement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Increment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PostIncrementImpl extends UnaryOperatorImpl implements PostIncrement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostIncrementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getPostIncrement();
	}

} //PostIncrementImpl