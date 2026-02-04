/**
 *   Copyright (c) 2010, 2019 Mia-Software and others.
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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multipart Config Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         This element specifies configuration information related to the
 *         handling of multipart/form-data requests.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getMaxFileSize <em>Max File Size</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getMaxRequestSize <em>Max Request Size</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getFileSizeThreshold <em>File Size Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getMultipartConfigType()
 * @model extendedMetaData="name='multipart-configType' kind='elementOnly'"
 * @generated
 */
public interface MultipartConfigType extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The directory location where uploaded files will be stored
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(org.eclipse.modisco.jee.webapp.webapp30.String)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getMultipartConfigType_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.webapp.webapp30.String getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(org.eclipse.modisco.jee.webapp.webapp30.String value);

	/**
	 * Returns the value of the '<em><b>Max File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The maximum size limit of uploaded files
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max File Size</em>' attribute.
	 * @see #isSetMaxFileSize()
	 * @see #unsetMaxFileSize()
	 * @see #setMaxFileSize(long)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getMultipartConfigType_MaxFileSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='max-file-size' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	long getMaxFileSize();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getMaxFileSize <em>Max File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max File Size</em>' attribute.
	 * @see #isSetMaxFileSize()
	 * @see #unsetMaxFileSize()
	 * @see #getMaxFileSize()
	 * @generated
	 */
	void setMaxFileSize(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getMaxFileSize <em>Max File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxFileSize()
	 * @see #getMaxFileSize()
	 * @see #setMaxFileSize(long)
	 * @generated
	 */
	void unsetMaxFileSize();

	/**
	 * Returns whether the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getMaxFileSize <em>Max File Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max File Size</em>' attribute is set.
	 * @see #unsetMaxFileSize()
	 * @see #getMaxFileSize()
	 * @see #setMaxFileSize(long)
	 * @generated
	 */
	boolean isSetMaxFileSize();

	/**
	 * Returns the value of the '<em><b>Max Request Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The maximum size limit of multipart/form-data requests
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Request Size</em>' attribute.
	 * @see #isSetMaxRequestSize()
	 * @see #unsetMaxRequestSize()
	 * @see #setMaxRequestSize(long)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getMultipartConfigType_MaxRequestSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='max-request-size' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	long getMaxRequestSize();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getMaxRequestSize <em>Max Request Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Request Size</em>' attribute.
	 * @see #isSetMaxRequestSize()
	 * @see #unsetMaxRequestSize()
	 * @see #getMaxRequestSize()
	 * @generated
	 */
	void setMaxRequestSize(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getMaxRequestSize <em>Max Request Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxRequestSize()
	 * @see #getMaxRequestSize()
	 * @see #setMaxRequestSize(long)
	 * @generated
	 */
	void unsetMaxRequestSize();

	/**
	 * Returns whether the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getMaxRequestSize <em>Max Request Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Request Size</em>' attribute is set.
	 * @see #unsetMaxRequestSize()
	 * @see #getMaxRequestSize()
	 * @see #setMaxRequestSize(long)
	 * @generated
	 */
	boolean isSetMaxRequestSize();

	/**
	 * Returns the value of the '<em><b>File Size Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The size threshold after which an uploaded file will be
	 *             written to disk
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Size Threshold</em>' attribute.
	 * @see #setFileSizeThreshold(BigInteger)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getMultipartConfigType_FileSizeThreshold()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='file-size-threshold' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	BigInteger getFileSizeThreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType#getFileSizeThreshold <em>File Size Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Size Threshold</em>' attribute.
	 * @see #getFileSizeThreshold()
	 * @generated
	 */
	void setFileSizeThreshold(BigInteger value);

} // MultipartConfigType
