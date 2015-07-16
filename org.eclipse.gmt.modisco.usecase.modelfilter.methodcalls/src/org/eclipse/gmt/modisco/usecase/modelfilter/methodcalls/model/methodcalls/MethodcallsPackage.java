/**
 * *******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gabriel Barbier (Mia-Software) - initial API and implementation
 *     
 * *******************************************************************************
 *
 * $Id$
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 */
package org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodcallsFactory
 * @model kind="package"
 * @generated
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public interface MethodcallsPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "methodcalls"; //$NON-NLS-1$

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/MethodCalls/0.1.incubation/methodcalls"; //$NON-NLS-1$

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "methodcalls"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	MethodcallsPackage eINSTANCE = org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.MethodcallsPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.MethodCallImpl
	 * <em>Method Call</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.MethodCallImpl
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.MethodcallsPackageImpl#getMethodCall()
	 * @generated
	 */
	int METHOD_CALL = 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__ORDER = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Callee</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__CALLEE = 2;

	/**
	 * The feature id for the '<em><b>Filtered Sub Methods</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__FILTERED_SUB_METHODS = 3;

	/**
	 * The number of structural features of the '<em>Method Call</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.CallsModelImpl
	 * <em>Calls Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.CallsModelImpl
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.MethodcallsPackageImpl#getCallsModel()
	 * @generated
	 */
	int CALLS_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Call Nodes</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALLS_MODEL__CALL_NODES = 0;

	/**
	 * The feature id for the '<em><b>Root Nodes</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALLS_MODEL__ROOT_NODES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALLS_MODEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Calls Model</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALLS_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.CallNodeImpl
	 * <em>Call Node</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.CallNodeImpl
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.MethodcallsPackageImpl#getCallNode()
	 * @generated
	 */
	int CALL_NODE = 2;

	/**
	 * The feature id for the '<em><b>Method Calls</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_NODE__METHOD_CALLS = 0;

	/**
	 * The feature id for the '<em><b>Sub Methods</b></em>' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_NODE__SUB_METHODS = 1;

	/**
	 * The feature id for the '<em><b>Java Method</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_NODE__JAVA_METHOD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_NODE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Call Node</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_NODE_FEATURE_COUNT = 4;

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodCall
	 * <em>Method Call</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Method Call</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodCall
	 * @generated
	 */
	EClass getMethodCall();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodCall#getOrder
	 * <em>Order</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodCall#getOrder()
	 * @see #getMethodCall()
	 * @generated
	 */
	EAttribute getMethodCall_Order();

	/**
	 * Returns the meta object for the container reference '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodCall#getParent
	 * <em>Parent</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodCall#getParent()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_Parent();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodCall#getCallee
	 * <em>Callee</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Callee</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodCall#getCallee()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_Callee();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodCall#getFilteredSubMethods
	 * <em>Filtered Sub Methods</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Filtered Sub Methods</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodCall#getFilteredSubMethods()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_FilteredSubMethods();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallsModel
	 * <em>Calls Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Calls Model</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallsModel
	 * @generated
	 */
	EClass getCallsModel();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallsModel#getCallNodes
	 * <em>Call Nodes</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Call Nodes</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallsModel#getCallNodes()
	 * @see #getCallsModel()
	 * @generated
	 */
	EReference getCallsModel_CallNodes();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallsModel#getRootNodes
	 * <em>Root Nodes</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Root Nodes</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallsModel#getRootNodes()
	 * @see #getCallsModel()
	 * @generated
	 */
	EReference getCallsModel_RootNodes();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallsModel#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallsModel#getName()
	 * @see #getCallsModel()
	 * @generated
	 */
	EAttribute getCallsModel_Name();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode
	 * <em>Call Node</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Call Node</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode
	 * @generated
	 */
	EClass getCallNode();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode#getMethodCalls
	 * <em>Method Calls</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Method Calls</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode#getMethodCalls()
	 * @see #getCallNode()
	 * @generated
	 */
	EReference getCallNode_MethodCalls();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode#getSubMethods
	 * <em>Sub Methods</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Sub Methods</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode#getSubMethods()
	 * @see #getCallNode()
	 * @generated
	 */
	EReference getCallNode_SubMethods();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode#getJavaMethod
	 * <em>Java Method</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Java Method</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode#getJavaMethod()
	 * @see #getCallNode()
	 * @generated
	 */
	EReference getCallNode_JavaMethod();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode#getName()
	 * @see #getCallNode()
	 * @generated
	 */
	EAttribute getCallNode_Name();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MethodcallsFactory getMethodcallsFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.MethodCallImpl
		 * <em>Method Call</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.MethodCallImpl
		 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.MethodcallsPackageImpl#getMethodCall()
		 * @generated
		 */
		EClass METHOD_CALL = eINSTANCE.getMethodCall();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute METHOD_CALL__ORDER = eINSTANCE.getMethodCall_Order();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference METHOD_CALL__PARENT = eINSTANCE.getMethodCall_Parent();

		/**
		 * The meta object literal for the '<em><b>Callee</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference METHOD_CALL__CALLEE = eINSTANCE.getMethodCall_Callee();

		/**
		 * The meta object literal for the '<em><b>Filtered Sub Methods</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference METHOD_CALL__FILTERED_SUB_METHODS = eINSTANCE.getMethodCall_FilteredSubMethods();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.CallsModelImpl
		 * <em>Calls Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.CallsModelImpl
		 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.MethodcallsPackageImpl#getCallsModel()
		 * @generated
		 */
		EClass CALLS_MODEL = eINSTANCE.getCallsModel();

		/**
		 * The meta object literal for the '<em><b>Call Nodes</b></em>' containment reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CALLS_MODEL__CALL_NODES = eINSTANCE.getCallsModel_CallNodes();

		/**
		 * The meta object literal for the '<em><b>Root Nodes</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CALLS_MODEL__ROOT_NODES = eINSTANCE.getCallsModel_RootNodes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CALLS_MODEL__NAME = eINSTANCE.getCallsModel_Name();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.CallNodeImpl
		 * <em>Call Node</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.CallNodeImpl
		 * @see org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.MethodcallsPackageImpl#getCallNode()
		 * @generated
		 */
		EClass CALL_NODE = eINSTANCE.getCallNode();

		/**
		 * The meta object literal for the '<em><b>Method Calls</b></em>' containment reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CALL_NODE__METHOD_CALLS = eINSTANCE.getCallNode_MethodCalls();

		/**
		 * The meta object literal for the '<em><b>Sub Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CALL_NODE__SUB_METHODS = eINSTANCE.getCallNode_SubMethods();

		/**
		 * The meta object literal for the '<em><b>Java Method</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CALL_NODE__JAVA_METHOD = eINSTANCE.getCallNode_JavaMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CALL_NODE__NAME = eINSTANCE.getCallNode_Name();

	}

} // MethodcallsPackage
