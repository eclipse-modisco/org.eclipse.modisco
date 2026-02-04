/**
 * *******************************************************************************
 * Copyright (c) 2008, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.build;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Described By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.build.DescribedBy#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.build.DescribedBy#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.build.BuildPackage#getDescribedBy()
 * @model
 * @generated
 */
public interface DescribedBy extends AbstractBuildRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(BuildDescription)
	 * @see org.eclipse.modisco.omg.kdm.build.BuildPackage#getDescribedBy_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BuildDescription getTo();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.kdm.build.DescribedBy#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(BuildDescription value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(BuildStep)
	 * @see org.eclipse.modisco.omg.kdm.build.BuildPackage#getDescribedBy_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BuildStep getFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.kdm.build.DescribedBy#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(BuildStep value);

} // DescribedBy
