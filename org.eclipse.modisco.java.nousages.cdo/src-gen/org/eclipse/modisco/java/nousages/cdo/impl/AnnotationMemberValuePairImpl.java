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
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.AnnotationTypeMemberDeclaration;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.ImportDeclaration;
import org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Annotation Member Value Pair</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.nousages.cdo.impl.AnnotationMemberValuePairImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.nousages.cdo.impl.AnnotationMemberValuePairImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationMemberValuePairImpl extends NamedElementImpl implements
		AnnotationMemberValuePair {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationMemberValuePairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getAnnotationMemberValuePair();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationTypeMemberDeclaration getMember() {
		return (AnnotationTypeMemberDeclaration)eGet(JavaPackage.eINSTANCE.getAnnotationMemberValuePair_Member(), true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMember(AnnotationTypeMemberDeclaration newMember) {
		eSet(JavaPackage.eINSTANCE.getAnnotationMemberValuePair_Member(), newMember);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValue() {
		return (Expression)eGet(JavaPackage.eINSTANCE.getAnnotationMemberValuePair_Value(), true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Expression newValue) {
		eSet(JavaPackage.eINSTANCE.getAnnotationMemberValuePair_Value(), newValue);
	}

	public EList<ImportDeclaration> getUsagesInImports() {
		// no usages references
		return null;
	}

} // AnnotationMemberValuePairImpl
