/**
 *  Copyright (c) 2012, 2019 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 *  	Gregoire Dupe (Mia-Software) - Bug 361794 - [Restructuring] New customization meta-model
 *  
 *  
 */
package org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custompt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custompt.CustomptPackage
 * @generated
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface CustomptFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CustomptFactory eINSTANCE = org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custompt.impl.CustomptFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CustomptPackage getCustomptPackage();

} //CustomptFactory
