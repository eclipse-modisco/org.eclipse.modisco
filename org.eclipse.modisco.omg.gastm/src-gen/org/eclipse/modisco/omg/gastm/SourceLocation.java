/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm;

import java.lang.Integer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.SourceLocation#getStartLine <em>Start Line</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.SourceLocation#getStartPosition <em>Start Position</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.SourceLocation#getEndLine <em>End Line</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.SourceLocation#getEndPosition <em>End Position</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.SourceLocation#getInSourceFile <em>In Source File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getSourceLocation()
 * @model
 * @generated
 */
public interface SourceLocation extends GASTMSourceObject {
	/**
	 * Returns the value of the '<em><b>Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Line</em>' attribute.
	 * @see #setStartLine(Integer)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getSourceLocation_StartLine()
	 * @model
	 * @generated
	 */
	Integer getStartLine();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.SourceLocation#getStartLine <em>Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Line</em>' attribute.
	 * @see #getStartLine()
	 * @generated
	 */
	void setStartLine(Integer value);

	/**
	 * Returns the value of the '<em><b>Start Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Position</em>' attribute.
	 * @see #setStartPosition(Integer)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getSourceLocation_StartPosition()
	 * @model
	 * @generated
	 */
	Integer getStartPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.SourceLocation#getStartPosition <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Position</em>' attribute.
	 * @see #getStartPosition()
	 * @generated
	 */
	void setStartPosition(Integer value);

	/**
	 * Returns the value of the '<em><b>End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Line</em>' attribute.
	 * @see #setEndLine(Integer)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getSourceLocation_EndLine()
	 * @model
	 * @generated
	 */
	Integer getEndLine();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.SourceLocation#getEndLine <em>End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Line</em>' attribute.
	 * @see #getEndLine()
	 * @generated
	 */
	void setEndLine(Integer value);

	/**
	 * Returns the value of the '<em><b>End Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Position</em>' attribute.
	 * @see #setEndPosition(Integer)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getSourceLocation_EndPosition()
	 * @model
	 * @generated
	 */
	Integer getEndPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.SourceLocation#getEndPosition <em>End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Position</em>' attribute.
	 * @see #getEndPosition()
	 * @generated
	 */
	void setEndPosition(Integer value);

	/**
	 * Returns the value of the '<em><b>In Source File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Source File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Source File</em>' containment reference.
	 * @see #setInSourceFile(SourceFile)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getSourceLocation_InSourceFile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SourceFile getInSourceFile();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.SourceLocation#getInSourceFile <em>In Source File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Source File</em>' containment reference.
	 * @see #getInSourceFile()
	 * @generated
	 */
	void setInSourceFile(SourceFile value);

} // SourceLocation
