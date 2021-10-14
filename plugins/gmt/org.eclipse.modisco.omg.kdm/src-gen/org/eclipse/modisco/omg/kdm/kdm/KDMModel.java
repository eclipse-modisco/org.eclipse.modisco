/**
 * 
 * Copyright (c) 2009, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.kdm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.omg.kdm.core.KDMEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KDM Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A KDM model corresponds to one of the well-known architecture views of software systems. KDM defines several
 * concrete subclasses of the KDMModel class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.kdm.KDMModel#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.kdm.KdmPackage#getKDMModel()
 * @model abstract="true"
 * @generated
 */
public interface KDMModel extends KDMFramework {
	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.core.KDMEntity}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.kdm.core.KDMEntity#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instances of KDM entities owned by the model. Each KDM
	 * model defines specific subclasses of KDMEntity class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference list.
	 * @see org.eclipse.modisco.omg.kdm.kdm.KdmPackage#getKDMModel_OwnedElement()
	 * @see org.eclipse.modisco.omg.kdm.core.KDMEntity#getModel
	 * @model opposite="model" changeable="false" derived="true"
	 * @generated
	 */
	EList<KDMEntity> getOwnedElement();

} // KDMModel
