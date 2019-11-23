/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.browser.custom;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Metamodel View</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.MetamodelView#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.MetamodelView#getTypes <em>Types</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.MetamodelView#getMetamodelURI <em>Metamodel URI</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.MetamodelView#isAllQuerySetsAvailable <em>All Query Sets Available</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.MetamodelView#getAvailableQuerySets <em>Available Query Sets</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.MetamodelView#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getMetamodelView()
 * @model
 * @generated
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public interface MetamodelView extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getMetamodelView_Name()
	 * @model transient="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Metamodel URI</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Metamodel URI</em>' attribute.
	 * @see #setMetamodelURI(String)
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getMetamodelView_MetamodelURI()
	 * @model
	 * @generated
	 */
	String getMetamodelURI();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.browser.custom.MetamodelView#getMetamodelURI <em>Metamodel URI</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Metamodel URI</em>' attribute.
	 * @see #getMetamodelURI()
	 * @generated
	 */
	void setMetamodelURI(String value);

	/**
	 * Returns the value of the '<em><b>All Query Sets Available</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>All Query Sets Available</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Query Sets Available</em>' attribute.
	 * @see #setAllQuerySetsAvailable(boolean)
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getMetamodelView_AllQuerySetsAvailable()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isAllQuerySetsAvailable();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.browser.custom.MetamodelView#isAllQuerySetsAvailable <em>All Query Sets Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Query Sets Available</em>' attribute.
	 * @see #isAllQuerySetsAvailable()
	 * @generated
	 */
	void setAllQuerySetsAvailable(boolean value);

	/**
	 * Returns the value of the '<em><b>Available Query Sets</b></em>' attribute
	 * list. The list contents are of type {@link java.lang.String}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Query Sets</em>' attribute list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Available Query Sets</em>' attribute list.
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getMetamodelView_AvailableQuerySets()
	 * @model
	 * @generated
	 */
	EList<String> getAvailableQuerySets();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * Defines where the customization was loaded from.
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getMetamodelView_Location()
	 * @model transient="true"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.browser.custom.MetamodelView#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc --> Defines where the
	 * customization was loaded from. <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.eclipse.modisco.infra.browser.custom.TypeView}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage#getMetamodelView_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeView> getTypes();

} // MetamodelView
