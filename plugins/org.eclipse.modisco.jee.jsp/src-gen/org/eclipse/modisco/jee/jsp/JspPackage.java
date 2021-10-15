/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 *    All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *   	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.jsp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.modisco.xml.emf.MoDiscoXMLPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.jsp.JspFactory
 * @model kind="package"
 * @generated
 */
public interface JspPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jsp"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/JSP/0.1.incubation/jsp"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jsp"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JspPackage eINSTANCE = org.eclipse.modisco.jee.jsp.impl.JspPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.jsp.impl.JSPScriptImpl <em>JSP Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.jsp.impl.JSPScriptImpl
	 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJSPScript()
	 * @generated
	 */
	int JSP_SCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_SCRIPT__NAME = MoDiscoXMLPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_SCRIPT__PARENT = MoDiscoXMLPackage.ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_SCRIPT__CHILDREN = MoDiscoXMLPackage.ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Is Tag Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_SCRIPT__IS_TAG_FRAGMENT = MoDiscoXMLPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JSP Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_SCRIPT_FEATURE_COUNT = MoDiscoXMLPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.jsp.impl.JSPScriptletImpl <em>JSP Scriptlet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.jsp.impl.JSPScriptletImpl
	 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJSPScriptlet()
	 * @generated
	 */
	int JSP_SCRIPTLET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_SCRIPTLET__NAME = JSP_SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_SCRIPTLET__PARENT = JSP_SCRIPT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_SCRIPTLET__CHILDREN = JSP_SCRIPT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Is Tag Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_SCRIPTLET__IS_TAG_FRAGMENT = JSP_SCRIPT__IS_TAG_FRAGMENT;

	/**
	 * The number of structural features of the '<em>JSP Scriptlet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_SCRIPTLET_FEATURE_COUNT = JSP_SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.jsp.impl.JSPExpressionImpl <em>JSP Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.jsp.impl.JSPExpressionImpl
	 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJSPExpression()
	 * @generated
	 */
	int JSP_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_EXPRESSION__NAME = JSP_SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_EXPRESSION__PARENT = JSP_SCRIPT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_EXPRESSION__CHILDREN = JSP_SCRIPT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Is Tag Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_EXPRESSION__IS_TAG_FRAGMENT = JSP_SCRIPT__IS_TAG_FRAGMENT;

	/**
	 * The number of structural features of the '<em>JSP Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_EXPRESSION_FEATURE_COUNT = JSP_SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.jsp.impl.JSPDeclarationImpl <em>JSP Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.jsp.impl.JSPDeclarationImpl
	 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJSPDeclaration()
	 * @generated
	 */
	int JSP_DECLARATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_DECLARATION__NAME = JSP_SCRIPT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_DECLARATION__PARENT = JSP_SCRIPT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_DECLARATION__CHILDREN = JSP_SCRIPT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Is Tag Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_DECLARATION__IS_TAG_FRAGMENT = JSP_SCRIPT__IS_TAG_FRAGMENT;

	/**
	 * The number of structural features of the '<em>JSP Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_DECLARATION_FEATURE_COUNT = JSP_SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.jsp.impl.JSPActionImpl <em>JSP Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.jsp.impl.JSPActionImpl
	 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJSPAction()
	 * @generated
	 */
	int JSP_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_ACTION__NAME = MoDiscoXMLPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_ACTION__PARENT = MoDiscoXMLPackage.ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_ACTION__CHILDREN = MoDiscoXMLPackage.ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Is Tag Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_ACTION__IS_TAG_FRAGMENT = MoDiscoXMLPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JSP Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_ACTION_FEATURE_COUNT = MoDiscoXMLPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.jsp.impl.JSPStdActionImpl <em>JSP Std Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.jsp.impl.JSPStdActionImpl
	 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJSPStdAction()
	 * @generated
	 */
	int JSP_STD_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_STD_ACTION__NAME = JSP_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_STD_ACTION__PARENT = JSP_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_STD_ACTION__CHILDREN = JSP_ACTION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Is Tag Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_STD_ACTION__IS_TAG_FRAGMENT = JSP_ACTION__IS_TAG_FRAGMENT;

	/**
	 * The number of structural features of the '<em>JSP Std Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_STD_ACTION_FEATURE_COUNT = JSP_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.jsp.impl.JSPDirectiveImpl <em>JSP Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.jsp.impl.JSPDirectiveImpl
	 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJSPDirective()
	 * @generated
	 */
	int JSP_DIRECTIVE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_DIRECTIVE__NAME = MoDiscoXMLPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_DIRECTIVE__PARENT = MoDiscoXMLPackage.ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_DIRECTIVE__CHILDREN = MoDiscoXMLPackage.ELEMENT__CHILDREN;

	/**
	 * The number of structural features of the '<em>JSP Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_DIRECTIVE_FEATURE_COUNT = MoDiscoXMLPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.jsp.impl.JSPTagLibImpl <em>JSP Tag Lib</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.jsp.impl.JSPTagLibImpl
	 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJSPTagLib()
	 * @generated
	 */
	int JSP_TAG_LIB = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_TAG_LIB__NAME = JSP_DIRECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_TAG_LIB__PARENT = JSP_DIRECTIVE__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_TAG_LIB__CHILDREN = JSP_DIRECTIVE__CHILDREN;

	/**
	 * The number of structural features of the '<em>JSP Tag Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_TAG_LIB_FEATURE_COUNT = JSP_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.jsp.impl.JavaScriptImpl <em>Java Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.jsp.impl.JavaScriptImpl
	 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJavaScript()
	 * @generated
	 */
	int JAVA_SCRIPT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT__NAME = MoDiscoXMLPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT__PARENT = MoDiscoXMLPackage.ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT__CHILDREN = MoDiscoXMLPackage.ELEMENT__CHILDREN;

	/**
	 * The number of structural features of the '<em>Java Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_FEATURE_COUNT = MoDiscoXMLPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.jsp.impl.JSPCommentImpl <em>JSP Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.jsp.impl.JSPCommentImpl
	 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJSPComment()
	 * @generated
	 */
	int JSP_COMMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_COMMENT__NAME = MoDiscoXMLPackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_COMMENT__PARENT = MoDiscoXMLPackage.NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Is Tag Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_COMMENT__IS_TAG_FRAGMENT = MoDiscoXMLPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JSP Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSP_COMMENT_FEATURE_COUNT = MoDiscoXMLPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.jsp.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.jsp.impl.PageImpl
	 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 10;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ORIGINAL_FILE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Xml Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__XML_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Doctype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DOCTYPE = 2;

	/**
	 * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__OWNED_ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Page Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGE_OWNER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 5;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.jsp.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.jsp.impl.ModelImpl
	 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 11;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PAGES = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.jee.jsp.impl.ComposedAttributeImpl <em>Composed Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.jee.jsp.impl.ComposedAttributeImpl
	 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getComposedAttribute()
	 * @generated
	 */
	int COMPOSED_ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ATTRIBUTE__NAME = MoDiscoXMLPackage.ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ATTRIBUTE__PARENT = MoDiscoXMLPackage.ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ATTRIBUTE__CHILDREN = MoDiscoXMLPackage.ELEMENT__CHILDREN;

	/**
	 * The number of structural features of the '<em>Composed Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ATTRIBUTE_FEATURE_COUNT = MoDiscoXMLPackage.ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.jsp.JSPScript <em>JSP Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSP Script</em>'.
	 * @see org.eclipse.modisco.jee.jsp.JSPScript
	 * @generated
	 */
	EClass getJSPScript();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.jsp.JSPScript#isIsTagFragment <em>Is Tag Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Tag Fragment</em>'.
	 * @see org.eclipse.modisco.jee.jsp.JSPScript#isIsTagFragment()
	 * @see #getJSPScript()
	 * @generated
	 */
	EAttribute getJSPScript_IsTagFragment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.jsp.JSPScriptlet <em>JSP Scriptlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSP Scriptlet</em>'.
	 * @see org.eclipse.modisco.jee.jsp.JSPScriptlet
	 * @generated
	 */
	EClass getJSPScriptlet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.jsp.JSPExpression <em>JSP Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSP Expression</em>'.
	 * @see org.eclipse.modisco.jee.jsp.JSPExpression
	 * @generated
	 */
	EClass getJSPExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.jsp.JSPDeclaration <em>JSP Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSP Declaration</em>'.
	 * @see org.eclipse.modisco.jee.jsp.JSPDeclaration
	 * @generated
	 */
	EClass getJSPDeclaration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.jsp.JSPAction <em>JSP Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSP Action</em>'.
	 * @see org.eclipse.modisco.jee.jsp.JSPAction
	 * @generated
	 */
	EClass getJSPAction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.jsp.JSPAction#isIsTagFragment <em>Is Tag Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Tag Fragment</em>'.
	 * @see org.eclipse.modisco.jee.jsp.JSPAction#isIsTagFragment()
	 * @see #getJSPAction()
	 * @generated
	 */
	EAttribute getJSPAction_IsTagFragment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.jsp.JSPStdAction <em>JSP Std Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSP Std Action</em>'.
	 * @see org.eclipse.modisco.jee.jsp.JSPStdAction
	 * @generated
	 */
	EClass getJSPStdAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.jsp.JSPDirective <em>JSP Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSP Directive</em>'.
	 * @see org.eclipse.modisco.jee.jsp.JSPDirective
	 * @generated
	 */
	EClass getJSPDirective();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.jsp.JSPTagLib <em>JSP Tag Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSP Tag Lib</em>'.
	 * @see org.eclipse.modisco.jee.jsp.JSPTagLib
	 * @generated
	 */
	EClass getJSPTagLib();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.jsp.JavaScript <em>Java Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Script</em>'.
	 * @see org.eclipse.modisco.jee.jsp.JavaScript
	 * @generated
	 */
	EClass getJavaScript();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.jsp.JSPComment <em>JSP Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSP Comment</em>'.
	 * @see org.eclipse.modisco.jee.jsp.JSPComment
	 * @generated
	 */
	EClass getJSPComment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.jsp.JSPComment#isIsTagFragment <em>Is Tag Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Tag Fragment</em>'.
	 * @see org.eclipse.modisco.jee.jsp.JSPComment#isIsTagFragment()
	 * @see #getJSPComment()
	 * @generated
	 */
	EAttribute getJSPComment_IsTagFragment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.jsp.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.eclipse.modisco.jee.jsp.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.jsp.Page#getOriginalFilePath <em>Original File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original File Path</em>'.
	 * @see org.eclipse.modisco.jee.jsp.Page#getOriginalFilePath()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_OriginalFilePath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.jsp.Page#getXmlDeclaration <em>Xml Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml Declaration</em>'.
	 * @see org.eclipse.modisco.jee.jsp.Page#getXmlDeclaration()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_XmlDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.jsp.Page#getDoctype <em>Doctype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doctype</em>'.
	 * @see org.eclipse.modisco.jee.jsp.Page#getDoctype()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Doctype();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.jsp.Page#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Elements</em>'.
	 * @see org.eclipse.modisco.jee.jsp.Page#getOwnedElements()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_OwnedElements();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.modisco.jee.jsp.Page#getPageOwner <em>Page Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Page Owner</em>'.
	 * @see org.eclipse.modisco.jee.jsp.Page#getPageOwner()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_PageOwner();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.jee.jsp.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modisco.jee.jsp.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.jsp.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.modisco.jee.jsp.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.jee.jsp.Model#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see org.eclipse.modisco.jee.jsp.Model#getPages()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Pages();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.jee.jsp.ComposedAttribute <em>Composed Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Attribute</em>'.
	 * @see org.eclipse.modisco.jee.jsp.ComposedAttribute
	 * @generated
	 */
	EClass getComposedAttribute();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JspFactory getJspFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.jsp.impl.JSPScriptImpl <em>JSP Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.jsp.impl.JSPScriptImpl
		 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJSPScript()
		 * @generated
		 */
		EClass JSP_SCRIPT = eINSTANCE.getJSPScript();

		/**
		 * The meta object literal for the '<em><b>Is Tag Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSP_SCRIPT__IS_TAG_FRAGMENT = eINSTANCE.getJSPScript_IsTagFragment();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.jsp.impl.JSPScriptletImpl <em>JSP Scriptlet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.jsp.impl.JSPScriptletImpl
		 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJSPScriptlet()
		 * @generated
		 */
		EClass JSP_SCRIPTLET = eINSTANCE.getJSPScriptlet();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.jsp.impl.JSPExpressionImpl <em>JSP Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.jsp.impl.JSPExpressionImpl
		 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJSPExpression()
		 * @generated
		 */
		EClass JSP_EXPRESSION = eINSTANCE.getJSPExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.jsp.impl.JSPDeclarationImpl <em>JSP Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.jsp.impl.JSPDeclarationImpl
		 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJSPDeclaration()
		 * @generated
		 */
		EClass JSP_DECLARATION = eINSTANCE.getJSPDeclaration();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.jsp.impl.JSPActionImpl <em>JSP Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.jsp.impl.JSPActionImpl
		 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJSPAction()
		 * @generated
		 */
		EClass JSP_ACTION = eINSTANCE.getJSPAction();

		/**
		 * The meta object literal for the '<em><b>Is Tag Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSP_ACTION__IS_TAG_FRAGMENT = eINSTANCE.getJSPAction_IsTagFragment();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.jsp.impl.JSPStdActionImpl <em>JSP Std Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.jsp.impl.JSPStdActionImpl
		 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJSPStdAction()
		 * @generated
		 */
		EClass JSP_STD_ACTION = eINSTANCE.getJSPStdAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.jsp.impl.JSPDirectiveImpl <em>JSP Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.jsp.impl.JSPDirectiveImpl
		 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJSPDirective()
		 * @generated
		 */
		EClass JSP_DIRECTIVE = eINSTANCE.getJSPDirective();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.jsp.impl.JSPTagLibImpl <em>JSP Tag Lib</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.jsp.impl.JSPTagLibImpl
		 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJSPTagLib()
		 * @generated
		 */
		EClass JSP_TAG_LIB = eINSTANCE.getJSPTagLib();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.jsp.impl.JavaScriptImpl <em>Java Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.jsp.impl.JavaScriptImpl
		 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJavaScript()
		 * @generated
		 */
		EClass JAVA_SCRIPT = eINSTANCE.getJavaScript();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.jsp.impl.JSPCommentImpl <em>JSP Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.jsp.impl.JSPCommentImpl
		 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getJSPComment()
		 * @generated
		 */
		EClass JSP_COMMENT = eINSTANCE.getJSPComment();

		/**
		 * The meta object literal for the '<em><b>Is Tag Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSP_COMMENT__IS_TAG_FRAGMENT = eINSTANCE.getJSPComment_IsTagFragment();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.jsp.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.jsp.impl.PageImpl
		 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Original File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__ORIGINAL_FILE_PATH = eINSTANCE.getPage_OriginalFilePath();

		/**
		 * The meta object literal for the '<em><b>Xml Declaration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__XML_DECLARATION = eINSTANCE.getPage_XmlDeclaration();

		/**
		 * The meta object literal for the '<em><b>Doctype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__DOCTYPE = eINSTANCE.getPage_Doctype();

		/**
		 * The meta object literal for the '<em><b>Owned Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__OWNED_ELEMENTS = eINSTANCE.getPage_OwnedElements();

		/**
		 * The meta object literal for the '<em><b>Page Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PAGE_OWNER = eINSTANCE.getPage_PageOwner();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.jsp.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.jsp.impl.ModelImpl
		 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PAGES = eINSTANCE.getModel_Pages();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.jee.jsp.impl.ComposedAttributeImpl <em>Composed Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.jee.jsp.impl.ComposedAttributeImpl
		 * @see org.eclipse.modisco.jee.jsp.impl.JspPackageImpl#getComposedAttribute()
		 * @generated
		 */
		EClass COMPOSED_ATTRIBUTE = eINSTANCE.getComposedAttribute();

	}

} //JspPackage
