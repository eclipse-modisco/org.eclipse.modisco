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
import org.eclipse.modisco.java.AbstractVariablesContainer;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.Modifier;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.VariableDeclarationFragment;
import org.eclipse.modisco.java.VariableDeclarationStatement;
import org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.nousages.cdo.impl.VariableDeclarationStatementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.nousages.cdo.impl.VariableDeclarationStatementImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.nousages.cdo.impl.VariableDeclarationStatementImpl#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.nousages.cdo.impl.VariableDeclarationStatementImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.nousages.cdo.impl.VariableDeclarationStatementImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDeclarationStatementImpl extends StatementImpl implements VariableDeclarationStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getVariableDeclarationStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAccess getType() {
		return (TypeAccess)eGet(JavaPackage.eINSTANCE.getAbstractVariablesContainer_Type(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeAccess newType) {
		eSet(JavaPackage.eINSTANCE.getAbstractVariablesContainer_Type(), newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VariableDeclarationFragment> getFragments() {
		return (EList<VariableDeclarationFragment>)eGet(JavaPackage.eINSTANCE.getAbstractVariablesContainer_Fragments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExtraArrayDimensions() {
		return (Integer)eGet(JavaPackage.eINSTANCE.getVariableDeclarationStatement_ExtraArrayDimensions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraArrayDimensions(int newExtraArrayDimensions) {
		eSet(JavaPackage.eINSTANCE.getVariableDeclarationStatement_ExtraArrayDimensions(), newExtraArrayDimensions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modifier getModifier() {
		return (Modifier)eGet(JavaPackage.eINSTANCE.getVariableDeclarationStatement_Modifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(Modifier newModifier) {
		eSet(JavaPackage.eINSTANCE.getVariableDeclarationStatement_Modifier(), newModifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Annotation> getAnnotations() {
		return (EList<Annotation>)eGet(JavaPackage.eINSTANCE.getVariableDeclarationStatement_Annotations(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractVariablesContainer.class) {
			switch (derivedFeatureID) {
				case JavaPackage.VARIABLE_DECLARATION_STATEMENT__TYPE: return JavaPackage.ABSTRACT_VARIABLES_CONTAINER__TYPE;
				case JavaPackage.VARIABLE_DECLARATION_STATEMENT__FRAGMENTS: return JavaPackage.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractVariablesContainer.class) {
			switch (baseFeatureID) {
				case JavaPackage.ABSTRACT_VARIABLES_CONTAINER__TYPE: return JavaPackage.VARIABLE_DECLARATION_STATEMENT__TYPE;
				case JavaPackage.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS: return JavaPackage.VARIABLE_DECLARATION_STATEMENT__FRAGMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //VariableDeclarationStatementImpl
