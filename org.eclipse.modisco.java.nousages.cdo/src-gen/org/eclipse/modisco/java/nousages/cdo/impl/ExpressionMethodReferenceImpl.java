/**
 * *******************************************************************************
 * Copyright (c) 2009, 2018 Mia-Software and others.
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
 */
package org.eclipse.modisco.java.nousages.cdo.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.ExpressionMethodReference;

import org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Method Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.nousages.cdo.impl.ExpressionMethodReferenceImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.nousages.cdo.impl.ExpressionMethodReferenceImpl#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionMethodReferenceImpl extends MethodReferenceImpl implements ExpressionMethodReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionMethodReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getExpressionMethodReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExpression() {
		return (Expression)eGet(JavaPackage.eINSTANCE.getExpressionMethodReference_Expression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(Expression newExpression) {
		eSet(JavaPackage.eINSTANCE.getExpressionMethodReference_Expression(), newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMethodDeclaration getMethod() {
		return (AbstractMethodDeclaration)eGet(JavaPackage.eINSTANCE.getExpressionMethodReference_Method(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(AbstractMethodDeclaration newMethod) {
		eSet(JavaPackage.eINSTANCE.getExpressionMethodReference_Method(), newMethod);
	}

} //ExpressionMethodReferenceImpl
