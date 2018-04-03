/**
 * *******************************************************************************
 * Copyright (c) 2008 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KDM Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A KDM relationship is a model element that represents semantic association between two entities.
 * In the meta-model, KDMRelationship is a subclass of ModelElement. Each KDM package defines some specific KDM
 * relations that are either direct or indirect subclasses of KDMRelationship. Specific subclasses of KDMRelationship are
 * typed associations between some specific subclasses of KDMEntity.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.gmt.modisco.omg.kdm.core.CorePackage#getKDMRelationship()
 * @model abstract="true"
 * @generated
 */
public interface KDMRelationship extends ModelElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation returns the KDM entity that is the to-endpoint (the target) of the current
	 * relationship
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	KDMEntity getTo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation returns the KDM entity that is the from-endpoint (the origin) of the
	 * current relationship.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	KDMEntity getFrom();

} // KDMRelationship
