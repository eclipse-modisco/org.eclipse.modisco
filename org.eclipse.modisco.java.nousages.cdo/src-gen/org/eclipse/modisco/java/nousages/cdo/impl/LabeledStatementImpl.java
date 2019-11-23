/**
 * *******************************************************************************
 * Copyright (c) 2009 Mia-Software and others.
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
import org.eclipse.modisco.java.BreakStatement;
import org.eclipse.modisco.java.ContinueStatement;
import org.eclipse.modisco.java.ImportDeclaration;
import org.eclipse.modisco.java.LabeledStatement;
import org.eclipse.modisco.java.Statement;
import org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Labeled Statement</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.nousages.cdo.impl.LabeledStatementImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabeledStatementImpl extends NamedElementImpl implements
		LabeledStatement {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LabeledStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getLabeledStatement();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getBody() {
		return (Statement)eGet(JavaPackage.eINSTANCE.getLabeledStatement_Body(), true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Statement newBody) {
		eSet(JavaPackage.eINSTANCE.getLabeledStatement_Body(), newBody);
	}

	public EList<BreakStatement> getUsagesInBreakStatements() {
		// no usages references
		return null;
	}

	public EList<ContinueStatement> getUsagesInContinueStatements() {
		// no usages references
		return null;
	}

	public EList<ImportDeclaration> getUsagesInImports() {
		// no usages references
		return null;
	}

} // LabeledStatementImpl
