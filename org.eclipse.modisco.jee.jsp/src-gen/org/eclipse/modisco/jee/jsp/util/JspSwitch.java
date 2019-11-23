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
package org.eclipse.modisco.jee.jsp.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.jee.jsp.*;
import org.eclipse.modisco.xml.Element;
import org.eclipse.modisco.xml.Node;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.jsp.JspPackage
 * @generated
 */
public class JspSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JspPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JspSwitch() {
		if (modelPackage == null) {
			modelPackage = JspPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JspPackage.JSP_SCRIPT: {
				JSPScript jspScript = (JSPScript)theEObject;
				T result = caseJSPScript(jspScript);
				if (result == null) result = caseElement(jspScript);
				if (result == null) result = caseNode(jspScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JspPackage.JSP_SCRIPTLET: {
				JSPScriptlet jspScriptlet = (JSPScriptlet)theEObject;
				T result = caseJSPScriptlet(jspScriptlet);
				if (result == null) result = caseJSPScript(jspScriptlet);
				if (result == null) result = caseElement(jspScriptlet);
				if (result == null) result = caseNode(jspScriptlet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JspPackage.JSP_EXPRESSION: {
				JSPExpression jspExpression = (JSPExpression)theEObject;
				T result = caseJSPExpression(jspExpression);
				if (result == null) result = caseJSPScript(jspExpression);
				if (result == null) result = caseElement(jspExpression);
				if (result == null) result = caseNode(jspExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JspPackage.JSP_DECLARATION: {
				JSPDeclaration jspDeclaration = (JSPDeclaration)theEObject;
				T result = caseJSPDeclaration(jspDeclaration);
				if (result == null) result = caseJSPScript(jspDeclaration);
				if (result == null) result = caseElement(jspDeclaration);
				if (result == null) result = caseNode(jspDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JspPackage.JSP_ACTION: {
				JSPAction jspAction = (JSPAction)theEObject;
				T result = caseJSPAction(jspAction);
				if (result == null) result = caseElement(jspAction);
				if (result == null) result = caseNode(jspAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JspPackage.JSP_STD_ACTION: {
				JSPStdAction jspStdAction = (JSPStdAction)theEObject;
				T result = caseJSPStdAction(jspStdAction);
				if (result == null) result = caseJSPAction(jspStdAction);
				if (result == null) result = caseElement(jspStdAction);
				if (result == null) result = caseNode(jspStdAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JspPackage.JSP_DIRECTIVE: {
				JSPDirective jspDirective = (JSPDirective)theEObject;
				T result = caseJSPDirective(jspDirective);
				if (result == null) result = caseElement(jspDirective);
				if (result == null) result = caseNode(jspDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JspPackage.JSP_TAG_LIB: {
				JSPTagLib jspTagLib = (JSPTagLib)theEObject;
				T result = caseJSPTagLib(jspTagLib);
				if (result == null) result = caseJSPDirective(jspTagLib);
				if (result == null) result = caseElement(jspTagLib);
				if (result == null) result = caseNode(jspTagLib);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JspPackage.JAVA_SCRIPT: {
				JavaScript javaScript = (JavaScript)theEObject;
				T result = caseJavaScript(javaScript);
				if (result == null) result = caseElement(javaScript);
				if (result == null) result = caseNode(javaScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JspPackage.JSP_COMMENT: {
				JSPComment jspComment = (JSPComment)theEObject;
				T result = caseJSPComment(jspComment);
				if (result == null) result = caseNode(jspComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JspPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JspPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JspPackage.COMPOSED_ATTRIBUTE: {
				ComposedAttribute composedAttribute = (ComposedAttribute)theEObject;
				T result = caseComposedAttribute(composedAttribute);
				if (result == null) result = caseElement(composedAttribute);
				if (result == null) result = caseNode(composedAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSP Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSP Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSPScript(JSPScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSP Scriptlet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSP Scriptlet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSPScriptlet(JSPScriptlet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSP Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSP Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSPExpression(JSPExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSP Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSP Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSPDeclaration(JSPDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSP Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSP Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSPAction(JSPAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSP Std Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSP Std Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSPStdAction(JSPStdAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSP Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSP Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSPDirective(JSPDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSP Tag Lib</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSP Tag Lib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSPTagLib(JSPTagLib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaScript(JavaScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSP Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSP Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSPComment(JSPComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedAttribute(ComposedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //JspSwitch
