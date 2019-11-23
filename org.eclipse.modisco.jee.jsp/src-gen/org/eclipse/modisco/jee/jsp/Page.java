/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *   
 *   	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.jsp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.xml.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.jsp.Page#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.jsp.Page#getXmlDeclaration <em>Xml Declaration</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.jsp.Page#getDoctype <em>Doctype</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.jsp.Page#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.jsp.Page#getPageOwner <em>Page Owner</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.jsp.Page#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.jsp.JspPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original File Path</em>' attribute.
	 * @see #setOriginalFilePath(String)
	 * @see org.eclipse.modisco.jee.jsp.JspPackage#getPage_OriginalFilePath()
	 * @model
	 * @generated
	 */
	String getOriginalFilePath();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.jsp.Page#getOriginalFilePath <em>Original File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original File Path</em>' attribute.
	 * @see #getOriginalFilePath()
	 * @generated
	 */
	void setOriginalFilePath(String value);

	/**
	 * Returns the value of the '<em><b>Xml Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Declaration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Declaration</em>' attribute.
	 * @see #setXmlDeclaration(String)
	 * @see org.eclipse.modisco.jee.jsp.JspPackage#getPage_XmlDeclaration()
	 * @model
	 * @generated
	 */
	String getXmlDeclaration();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.jsp.Page#getXmlDeclaration <em>Xml Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Declaration</em>' attribute.
	 * @see #getXmlDeclaration()
	 * @generated
	 */
	void setXmlDeclaration(String value);

	/**
	 * Returns the value of the '<em><b>Doctype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doctype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctype</em>' attribute.
	 * @see #setDoctype(String)
	 * @see org.eclipse.modisco.jee.jsp.JspPackage#getPage_Doctype()
	 * @model
	 * @generated
	 */
	String getDoctype();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.jsp.Page#getDoctype <em>Doctype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doctype</em>' attribute.
	 * @see #getDoctype()
	 * @generated
	 */
	void setDoctype(String value);

	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.xml.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.jsp.JspPackage#getPage_OwnedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getOwnedElements();

	/**
	 * Returns the value of the '<em><b>Page Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.jee.jsp.Model#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Owner</em>' container reference.
	 * @see #setPageOwner(Model)
	 * @see org.eclipse.modisco.jee.jsp.JspPackage#getPage_PageOwner()
	 * @see org.eclipse.modisco.jee.jsp.Model#getPages
	 * @model opposite="pages" required="true" transient="false"
	 * @generated
	 */
	Model getPageOwner();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.jsp.Page#getPageOwner <em>Page Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Owner</em>' container reference.
	 * @see #getPageOwner()
	 * @generated
	 */
	void setPageOwner(Model value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.modisco.jee.jsp.JspPackage#getPage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.jsp.Page#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Page
