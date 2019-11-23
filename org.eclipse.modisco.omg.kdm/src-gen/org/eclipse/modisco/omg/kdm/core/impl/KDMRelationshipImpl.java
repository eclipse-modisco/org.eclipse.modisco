/**
 * 
 * Copyright (c) 2009 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.omg.kdm.core.CorePackage;
import org.eclipse.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.modisco.omg.kdm.core.KDMRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KDM Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class KDMRelationshipImpl extends ModelElementImpl implements KDMRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KDMRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.KDM_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sub classes should override this method
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public KDMEntity getTo() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sub classes should override this method
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public KDMEntity getFrom() {
		throw new UnsupportedOperationException();
	}

} //KDMRelationshipImpl
