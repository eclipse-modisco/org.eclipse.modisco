/**
 *   Copyright (c) 2010, 2019 Mia-Software and others.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp25.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.modisco.jee.webapp.webapp25.ServletNameType;
import org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servlet Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ServletNameTypeImpl extends NonEmptyStringTypeImpl implements ServletNameType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServletNameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp25Package.Literals.SERVLET_NAME_TYPE;
	}

} //ServletNameTypeImpl
