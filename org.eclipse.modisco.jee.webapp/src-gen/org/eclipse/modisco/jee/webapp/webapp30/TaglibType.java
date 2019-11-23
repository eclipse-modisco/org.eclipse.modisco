/**
 *   Copyright (c) 2010 Mia-Software.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp30;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Taglib Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The taglibType defines the syntax for declaring in
 *         the deployment descriptor that a tag library is
 *         available to the application.  This can be done
 *         to override implicit map entries from TLD files and
 *         from the container.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.TaglibType#getTaglibUri <em>Taglib Uri</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.TaglibType#getTaglibLocation <em>Taglib Location</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.TaglibType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getTaglibType()
 * @model extendedMetaData="name='taglibType' kind='elementOnly'"
 * @generated
 */
public interface TaglibType extends EObject {
	/**
	 * Returns the value of the '<em><b>Taglib Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             A taglib-uri element describes a URI identifying a
	 *             tag library used in the web application.  The body
	 *             of the taglib-uri element may be either an
	 *             absolute URI specification, or a relative URI.
	 *             There should be no entries in web.xml with the
	 *             same taglib-uri value.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Taglib Uri</em>' containment reference.
	 * @see #setTaglibUri(org.eclipse.modisco.jee.webapp.webapp30.String)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getTaglibType_TaglibUri()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='taglib-uri' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.webapp.webapp30.String getTaglibUri();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.TaglibType#getTaglibUri <em>Taglib Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taglib Uri</em>' containment reference.
	 * @see #getTaglibUri()
	 * @generated
	 */
	void setTaglibUri(org.eclipse.modisco.jee.webapp.webapp30.String value);

	/**
	 * Returns the value of the '<em><b>Taglib Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             the taglib-location element contains the location
	 *             (as a resource relative to the root of the web
	 *             application) where to find the Tag Library
	 *             Description file for the tag library.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Taglib Location</em>' containment reference.
	 * @see #setTaglibLocation(PathType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getTaglibType_TaglibLocation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='taglib-location' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	PathType getTaglibLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.TaglibType#getTaglibLocation <em>Taglib Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taglib Location</em>' containment reference.
	 * @see #getTaglibLocation()
	 * @generated
	 */
	void setTaglibLocation(PathType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getTaglibType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.TaglibType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // TaglibType
