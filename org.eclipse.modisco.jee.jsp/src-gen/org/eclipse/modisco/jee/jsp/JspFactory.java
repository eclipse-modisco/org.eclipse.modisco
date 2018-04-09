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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.jsp.JspPackage
 * @generated
 */
public interface JspFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JspFactory eINSTANCE = org.eclipse.modisco.jee.jsp.impl.JspFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>JSP Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSP Script</em>'.
	 * @generated
	 */
	JSPScript createJSPScript();

	/**
	 * Returns a new object of class '<em>JSP Scriptlet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSP Scriptlet</em>'.
	 * @generated
	 */
	JSPScriptlet createJSPScriptlet();

	/**
	 * Returns a new object of class '<em>JSP Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSP Expression</em>'.
	 * @generated
	 */
	JSPExpression createJSPExpression();

	/**
	 * Returns a new object of class '<em>JSP Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSP Declaration</em>'.
	 * @generated
	 */
	JSPDeclaration createJSPDeclaration();

	/**
	 * Returns a new object of class '<em>JSP Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSP Action</em>'.
	 * @generated
	 */
	JSPAction createJSPAction();

	/**
	 * Returns a new object of class '<em>JSP Std Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSP Std Action</em>'.
	 * @generated
	 */
	JSPStdAction createJSPStdAction();

	/**
	 * Returns a new object of class '<em>JSP Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSP Directive</em>'.
	 * @generated
	 */
	JSPDirective createJSPDirective();

	/**
	 * Returns a new object of class '<em>JSP Tag Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSP Tag Lib</em>'.
	 * @generated
	 */
	JSPTagLib createJSPTagLib();

	/**
	 * Returns a new object of class '<em>Java Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Script</em>'.
	 * @generated
	 */
	JavaScript createJavaScript();

	/**
	 * Returns a new object of class '<em>JSP Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSP Comment</em>'.
	 * @generated
	 */
	JSPComment createJSPComment();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Composed Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composed Attribute</em>'.
	 * @generated
	 */
	ComposedAttribute createComposedAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JspPackage getJspPackage();

} //JspFactory
