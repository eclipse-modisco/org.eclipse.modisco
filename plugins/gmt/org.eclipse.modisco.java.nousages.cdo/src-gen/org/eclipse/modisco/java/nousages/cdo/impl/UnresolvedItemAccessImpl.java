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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.UnresolvedItem;
import org.eclipse.modisco.java.UnresolvedItemAccess;
import org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unresolved Item Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.nousages.cdo.impl.UnresolvedItemAccessImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.nousages.cdo.impl.UnresolvedItemAccessImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnresolvedItemAccessImpl extends ExpressionImpl implements UnresolvedItemAccess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedItemAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getUnresolvedItemAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedItem getElement() {
		return (UnresolvedItem)eGet(JavaPackage.eINSTANCE.getUnresolvedItemAccess_Element(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(UnresolvedItem newElement) {
		eSet(JavaPackage.eINSTANCE.getUnresolvedItemAccess_Element(), newElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASTNode getQualifier() {
		return (ASTNode)eGet(JavaPackage.eINSTANCE.getUnresolvedItemAccess_Qualifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(ASTNode newQualifier) {
		eSet(JavaPackage.eINSTANCE.getUnresolvedItemAccess_Qualifier(), newQualifier);
	}

} //UnresolvedItemAccessImpl
