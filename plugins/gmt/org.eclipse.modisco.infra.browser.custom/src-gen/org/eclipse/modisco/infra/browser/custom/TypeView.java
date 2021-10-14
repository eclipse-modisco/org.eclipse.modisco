/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.browser.custom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.TypeView#getMetaclassName <em>Metaclass Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.TypeView#isAppliesToSubInstances <em>Applies To Sub Instances</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.TypeView#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.TypeView#getReferences <em>References</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.TypeView#getMetamodelView <em>Metamodel View</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getTypeView()
 * @model
 * @generated
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public interface TypeView extends CustomView {
	/**
	 * Returns the value of the '<em><b>Metaclass Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metaclass Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metaclass Name</em>' attribute.
	 * @see #setMetaclassName(String)
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getTypeView_MetaclassName()
	 * @model
	 * @generated
	 */
	String getMetaclassName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.browser.custom.TypeView#getMetaclassName <em>Metaclass Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metaclass Name</em>' attribute.
	 * @see #getMetaclassName()
	 * @generated
	 */
	void setMetaclassName(String value);

	/**
	 * Returns the value of the '<em><b>Applies To Sub Instances</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To Sub Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To Sub Instances</em>' attribute.
	 * @see #setAppliesToSubInstances(boolean)
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getTypeView_AppliesToSubInstances()
	 * @model default="true"
	 * @generated
	 */
	boolean isAppliesToSubInstances();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.browser.custom.TypeView#isAppliesToSubInstances <em>Applies To Sub Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To Sub Instances</em>' attribute.
	 * @see #isAppliesToSubInstances()
	 * @generated
	 */
	void setAppliesToSubInstances(boolean value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.infra.browser.custom.AttributeView}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.infra.browser.custom.AttributeView#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getTypeView_Attributes()
	 * @see org.eclipse.modisco.infra.browser.custom.AttributeView#getType
	 * @model opposite="type" containment="true"
	 * @generated
	 */
	EList<AttributeView> getAttributes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.infra.browser.custom.ReferenceView}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.infra.browser.custom.ReferenceView#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getTypeView_References()
	 * @see org.eclipse.modisco.infra.browser.custom.ReferenceView#getType
	 * @model opposite="type" containment="true"
	 * @generated
	 */
	EList<ReferenceView> getReferences();

	/**
	 * Returns the value of the '<em><b>Metamodel View</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.infra.browser.custom.MetamodelView#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel View</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel View</em>' container reference.
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getTypeView_MetamodelView()
	 * @see org.eclipse.modisco.infra.browser.custom.MetamodelView#getTypes
	 * @model opposite="types" required="true" transient="false" changeable="false"
	 * @generated
	 */
	MetamodelView getMetamodelView();

} // TypeView
