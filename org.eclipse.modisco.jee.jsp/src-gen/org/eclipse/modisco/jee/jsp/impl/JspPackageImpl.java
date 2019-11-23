/**
 * Copyright (c) 2010, 2019 Mia-Software.
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.modisco.jee.jsp.ComposedAttribute;
import org.eclipse.modisco.jee.jsp.JSPAction;
import org.eclipse.modisco.jee.jsp.JSPComment;
import org.eclipse.modisco.jee.jsp.JSPDeclaration;
import org.eclipse.modisco.jee.jsp.JSPDirective;
import org.eclipse.modisco.jee.jsp.JSPExpression;
import org.eclipse.modisco.jee.jsp.JSPScript;
import org.eclipse.modisco.jee.jsp.JSPScriptlet;
import org.eclipse.modisco.jee.jsp.JSPStdAction;
import org.eclipse.modisco.jee.jsp.JSPTagLib;
import org.eclipse.modisco.jee.jsp.JavaScript;
import org.eclipse.modisco.jee.jsp.JspFactory;
import org.eclipse.modisco.jee.jsp.JspPackage;
import org.eclipse.modisco.jee.jsp.Model;
import org.eclipse.modisco.jee.jsp.Page;
import org.eclipse.modisco.xml.emf.MoDiscoXMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class JspPackageImpl extends EPackageImpl implements JspPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass jspScriptEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass jspScriptletEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass jspExpressionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass jspDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass jspActionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass jspStdActionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass jspDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass jspTagLibEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass javaScriptEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass jspCommentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass composedAttributeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.modisco.jee.jsp.JspPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JspPackageImpl() {
		super(eNS_URI, JspFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link JspPackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JspPackage init() {
		if (isInited)
			return (JspPackage) EPackage.Registry.INSTANCE
					.getEPackage(JspPackage.eNS_URI);

		// Obtain or create and register package
		JspPackageImpl theJspPackage = (JspPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof JspPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new JspPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MoDiscoXMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJspPackage.createPackageContents();

		// Initialize created meta-data
		theJspPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJspPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JspPackage.eNS_URI, theJspPackage);
		return theJspPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getJSPScript() {
		return jspScriptEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getJSPScript_IsTagFragment() {
		return (EAttribute) jspScriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getJSPScriptlet() {
		return jspScriptletEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getJSPExpression() {
		return jspExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getJSPDeclaration() {
		return jspDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getJSPAction() {
		return jspActionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getJSPAction_IsTagFragment() {
		return (EAttribute) jspActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getJSPStdAction() {
		return jspStdActionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getJSPDirective() {
		return jspDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getJSPTagLib() {
		return jspTagLibEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getJavaScript() {
		return javaScriptEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getJSPComment() {
		return jspCommentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getJSPComment_IsTagFragment() {
		return (EAttribute) jspCommentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPage_OriginalFilePath() {
		return (EAttribute) pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPage_XmlDeclaration() {
		return (EAttribute) pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPage_Doctype() {
		return (EAttribute) pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPage_OwnedElements() {
		return (EReference) pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPage_PageOwner() {
		return (EReference) pageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPage_Name() {
		return (EAttribute) pageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getModel_Pages() {
		return (EReference) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getComposedAttribute() {
		return composedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public JspFactory getJspFactory() {
		return (JspFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		jspScriptEClass = createEClass(JSP_SCRIPT);
		createEAttribute(jspScriptEClass, JSP_SCRIPT__IS_TAG_FRAGMENT);

		jspScriptletEClass = createEClass(JSP_SCRIPTLET);

		jspExpressionEClass = createEClass(JSP_EXPRESSION);

		jspDeclarationEClass = createEClass(JSP_DECLARATION);

		jspActionEClass = createEClass(JSP_ACTION);
		createEAttribute(jspActionEClass, JSP_ACTION__IS_TAG_FRAGMENT);

		jspStdActionEClass = createEClass(JSP_STD_ACTION);

		jspDirectiveEClass = createEClass(JSP_DIRECTIVE);

		jspTagLibEClass = createEClass(JSP_TAG_LIB);

		javaScriptEClass = createEClass(JAVA_SCRIPT);

		jspCommentEClass = createEClass(JSP_COMMENT);
		createEAttribute(jspCommentEClass, JSP_COMMENT__IS_TAG_FRAGMENT);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__ORIGINAL_FILE_PATH);
		createEAttribute(pageEClass, PAGE__XML_DECLARATION);
		createEAttribute(pageEClass, PAGE__DOCTYPE);
		createEReference(pageEClass, PAGE__OWNED_ELEMENTS);
		createEReference(pageEClass, PAGE__PAGE_OWNER);
		createEAttribute(pageEClass, PAGE__NAME);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__PAGES);

		composedAttributeEClass = createEClass(COMPOSED_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MoDiscoXMLPackage theMoDiscoXMLPackage = (MoDiscoXMLPackage) EPackage.Registry.INSTANCE
				.getEPackage(MoDiscoXMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jspScriptEClass.getESuperTypes().add(theMoDiscoXMLPackage.getElement());
		jspScriptletEClass.getESuperTypes().add(this.getJSPScript());
		jspExpressionEClass.getESuperTypes().add(this.getJSPScript());
		jspDeclarationEClass.getESuperTypes().add(this.getJSPScript());
		jspActionEClass.getESuperTypes().add(theMoDiscoXMLPackage.getElement());
		jspStdActionEClass.getESuperTypes().add(this.getJSPAction());
		jspDirectiveEClass.getESuperTypes().add(
				theMoDiscoXMLPackage.getElement());
		jspTagLibEClass.getESuperTypes().add(this.getJSPDirective());
		javaScriptEClass.getESuperTypes()
				.add(theMoDiscoXMLPackage.getElement());
		jspCommentEClass.getESuperTypes().add(theMoDiscoXMLPackage.getNode());
		composedAttributeEClass.getESuperTypes().add(
				theMoDiscoXMLPackage.getElement());

		// Initialize classes and features; add operations and parameters
		initEClass(
				jspScriptEClass,
				JSPScript.class,
				"JSPScript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getJSPScript_IsTagFragment(),
				ecorePackage.getEBoolean(),
				"isTagFragment", "false", 0, 1, JSPScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(
				jspScriptletEClass,
				JSPScriptlet.class,
				"JSPScriptlet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
				jspExpressionEClass,
				JSPExpression.class,
				"JSPExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
				jspDeclarationEClass,
				JSPDeclaration.class,
				"JSPDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
				jspActionEClass,
				JSPAction.class,
				"JSPAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getJSPAction_IsTagFragment(),
				ecorePackage.getEBoolean(),
				"isTagFragment", "false", 0, 1, JSPAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(
				jspStdActionEClass,
				JSPStdAction.class,
				"JSPStdAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
				jspDirectiveEClass,
				JSPDirective.class,
				"JSPDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
				jspTagLibEClass,
				JSPTagLib.class,
				"JSPTagLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
				javaScriptEClass,
				JavaScript.class,
				"JavaScript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
				jspCommentEClass,
				JSPComment.class,
				"JSPComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getJSPComment_IsTagFragment(),
				ecorePackage.getEBoolean(),
				"isTagFragment", "false", 0, 1, JSPComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(
				pageEClass,
				Page.class,
				"Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getPage_OriginalFilePath(),
				ecorePackage.getEString(),
				"originalFilePath", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getPage_XmlDeclaration(),
				ecorePackage.getEString(),
				"xmlDeclaration", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getPage_Doctype(),
				ecorePackage.getEString(),
				"doctype", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getPage_OwnedElements(),
				theMoDiscoXMLPackage.getNode(),
				null,
				"ownedElements", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getPage_PageOwner(),
				this.getModel(),
				this.getModel_Pages(),
				"pageOwner", null, 1, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getPage_Name(),
				ecorePackage.getEString(),
				"name", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				modelEClass,
				Model.class,
				"Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getModel_Pages(),
				this.getPage(),
				this.getPage_PageOwner(),
				"pages", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				composedAttributeEClass,
				ComposedAttribute.class,
				"ComposedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} // JspPackageImpl
