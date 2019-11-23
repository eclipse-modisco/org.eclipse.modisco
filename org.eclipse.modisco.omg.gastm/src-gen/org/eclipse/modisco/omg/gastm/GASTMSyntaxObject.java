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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Syntax Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.GASTMSyntaxObject#getLocationInfo <em>Location Info</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.GASTMSyntaxObject#getPreProcessorElements <em>Pre Processor Elements</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.GASTMSyntaxObject#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getGASTMSyntaxObject()
 * @model abstract="true"
 * @generated
 */
public interface GASTMSyntaxObject extends GASTMObject {
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
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getGASTMSyntaxObject_LocationInfo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SourceLocation getLocationInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.GASTMSyntaxObject#getLocationInfo <em>Location Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Info</em>' containment reference.
	 * @see #getLocationInfo()
	 * @generated
	 */
	void setLocationInfo(SourceLocation value);

	/**
	 * Returns the value of the '<em><b>Pre Processor Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.PreprocessorElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Processor Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Processor Elements</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getGASTMSyntaxObject_PreProcessorElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<PreprocessorElement> getPreProcessorElements();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.AnnotationExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getGASTMSyntaxObject_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnnotationExpression> getAnnotations();

} // GASTMSyntaxObject
