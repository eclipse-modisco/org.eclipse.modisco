/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source File Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.SourceFileReference#getLocationInfo <em>Location Info</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.SourceFileReference#getOfSourceFile <em>Of Source File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getSourceFileReference()
 * @model
 * @generated
 */
public interface SourceFileReference extends SourceFile {
	/**
	 * Returns the value of the '<em><b>Location Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Info</em>' containment reference.
	 * @see #setLocationInfo(SourceLocation)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getSourceFileReference_LocationInfo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SourceLocation getLocationInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.SourceFileReference#getLocationInfo <em>Location Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Info</em>' containment reference.
	 * @see #getLocationInfo()
	 * @generated
	 */
	void setLocationInfo(SourceLocation value);

	/**
	 * Returns the value of the '<em><b>Of Source File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of Source File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of Source File</em>' reference.
	 * @see #setOfSourceFile(SourceFile)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getSourceFileReference_OfSourceFile()
	 * @model required="true"
	 * @generated
	 */
	SourceFile getOfSourceFile();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.SourceFileReference#getOfSourceFile <em>Of Source File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Of Source File</em>' reference.
	 * @see #getOfSourceFile()
	 * @generated
	 */
	void setOfSourceFile(SourceFile value);

} // SourceFileReference
