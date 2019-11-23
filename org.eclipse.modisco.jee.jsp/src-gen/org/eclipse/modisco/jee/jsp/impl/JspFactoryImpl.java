/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *   	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.jsp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.modisco.jee.jsp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JspFactoryImpl extends EFactoryImpl implements JspFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JspFactory init() {
		try {
			JspFactory theJspFactory = (JspFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/JSP/0.1.incubation/jsp"); //$NON-NLS-1$ 
			if (theJspFactory != null) {
				return theJspFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JspFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JspFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JspPackage.JSP_SCRIPT: return createJSPScript();
			case JspPackage.JSP_SCRIPTLET: return createJSPScriptlet();
			case JspPackage.JSP_EXPRESSION: return createJSPExpression();
			case JspPackage.JSP_DECLARATION: return createJSPDeclaration();
			case JspPackage.JSP_ACTION: return createJSPAction();
			case JspPackage.JSP_STD_ACTION: return createJSPStdAction();
			case JspPackage.JSP_DIRECTIVE: return createJSPDirective();
			case JspPackage.JSP_TAG_LIB: return createJSPTagLib();
			case JspPackage.JAVA_SCRIPT: return createJavaScript();
			case JspPackage.JSP_COMMENT: return createJSPComment();
			case JspPackage.PAGE: return createPage();
			case JspPackage.MODEL: return createModel();
			case JspPackage.COMPOSED_ATTRIBUTE: return createComposedAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSPScript createJSPScript() {
		JSPScriptImpl jspScript = new JSPScriptImpl();
		return jspScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSPScriptlet createJSPScriptlet() {
		JSPScriptletImpl jspScriptlet = new JSPScriptletImpl();
		return jspScriptlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSPExpression createJSPExpression() {
		JSPExpressionImpl jspExpression = new JSPExpressionImpl();
		return jspExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSPDeclaration createJSPDeclaration() {
		JSPDeclarationImpl jspDeclaration = new JSPDeclarationImpl();
		return jspDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSPAction createJSPAction() {
		JSPActionImpl jspAction = new JSPActionImpl();
		return jspAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSPStdAction createJSPStdAction() {
		JSPStdActionImpl jspStdAction = new JSPStdActionImpl();
		return jspStdAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSPDirective createJSPDirective() {
		JSPDirectiveImpl jspDirective = new JSPDirectiveImpl();
		return jspDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSPTagLib createJSPTagLib() {
		JSPTagLibImpl jspTagLib = new JSPTagLibImpl();
		return jspTagLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaScript createJavaScript() {
		JavaScriptImpl javaScript = new JavaScriptImpl();
		return javaScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSPComment createJSPComment() {
		JSPCommentImpl jspComment = new JSPCommentImpl();
		return jspComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedAttribute createComposedAttribute() {
		ComposedAttributeImpl composedAttribute = new ComposedAttributeImpl();
		return composedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JspPackage getJspPackage() {
		return (JspPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JspPackage getPackage() {
		return JspPackage.eINSTANCE;
	}

} //JspFactoryImpl
