/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - meta-model design
 *     Gregoire DUPE (Mia-Software) - design and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.query.runtime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.modisco.infra.query.runtime.RuntimeFactory
 * @model kind="package"
 * @generated
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public interface RuntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "runtime"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/infra/properties/query/runtime/0.8.unstable"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "runtime"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimePackage eINSTANCE = org.eclipse.modisco.infra.query.runtime.impl.RuntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.query.runtime.impl.ModelQueryContextImpl <em>Model Query Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.query.runtime.impl.ModelQueryContextImpl
	 * @see org.eclipse.modisco.infra.query.runtime.impl.RuntimePackageImpl#getModelQueryContext()
	 * @generated
	 */
	int MODEL_QUERY_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Selected Model Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_CONTEXT__SELECTED_MODEL_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Selected Models</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_CONTEXT__SELECTED_MODELS = 1;

	/**
	 * The number of structural features of the '<em>Model Query Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.query.runtime.impl.ModelQueryParameterValueImpl <em>Model Query Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.query.runtime.impl.ModelQueryParameterValueImpl
	 * @see org.eclipse.modisco.infra.query.runtime.impl.RuntimePackageImpl#getModelQueryParameterValue()
	 * @generated
	 */
	int MODEL_QUERY_PARAMETER_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_PARAMETER_VALUE__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_PARAMETER_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Model Query Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_PARAMETER_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.query.runtime.impl.ModelQueryResultImpl <em>Model Query Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.query.runtime.impl.ModelQueryResultImpl
	 * @see org.eclipse.modisco.infra.query.runtime.impl.RuntimePackageImpl#getModelQueryResult()
	 * @generated
	 */
	int MODEL_QUERY_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_RESULT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_RESULT__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_RESULT__EXCEPTION = 2;

	/**
	 * The number of structural features of the '<em>Model Query Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_RESULT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '<em>Java Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.eclipse.modisco.infra.query.runtime.impl.RuntimePackageImpl#getJavaException()
	 * @generated
	 */
	int JAVA_EXCEPTION = 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.query.runtime.ModelQueryContext <em>Model Query Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Query Context</em>'.
	 * @see org.eclipse.modisco.infra.query.runtime.ModelQueryContext
	 * @generated
	 */
	EClass getModelQueryContext();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.infra.query.runtime.ModelQueryContext#getSelectedModelElements <em>Selected Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected Model Elements</em>'.
	 * @see org.eclipse.modisco.infra.query.runtime.ModelQueryContext#getSelectedModelElements()
	 * @see #getModelQueryContext()
	 * @generated
	 */
	EReference getModelQueryContext_SelectedModelElements();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.infra.query.runtime.ModelQueryContext#getSelectedModels <em>Selected Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Selected Models</em>'.
	 * @see org.eclipse.modisco.infra.query.runtime.ModelQueryContext#getSelectedModels()
	 * @see #getModelQueryContext()
	 * @generated
	 */
	EAttribute getModelQueryContext_SelectedModels();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.query.runtime.ModelQueryParameterValue <em>Model Query Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Query Parameter Value</em>'.
	 * @see org.eclipse.modisco.infra.query.runtime.ModelQueryParameterValue
	 * @generated
	 */
	EClass getModelQueryParameterValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.infra.query.runtime.ModelQueryParameterValue#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.eclipse.modisco.infra.query.runtime.ModelQueryParameterValue#getParameter()
	 * @see #getModelQueryParameterValue()
	 * @generated
	 */
	EReference getModelQueryParameterValue_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.query.runtime.ModelQueryParameterValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.infra.query.runtime.ModelQueryParameterValue#getValue()
	 * @see #getModelQueryParameterValue()
	 * @generated
	 */
	EAttribute getModelQueryParameterValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.query.runtime.ModelQueryResult <em>Model Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Query Result</em>'.
	 * @see org.eclipse.modisco.infra.query.runtime.ModelQueryResult
	 * @generated
	 */
	EClass getModelQueryResult();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.infra.query.runtime.ModelQueryResult#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.modisco.infra.query.runtime.ModelQueryResult#getSource()
	 * @see #getModelQueryResult()
	 * @generated
	 */
	EReference getModelQueryResult_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.query.runtime.ModelQueryResult#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.infra.query.runtime.ModelQueryResult#getValue()
	 * @see #getModelQueryResult()
	 * @generated
	 */
	EAttribute getModelQueryResult_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.query.runtime.ModelQueryResult#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception</em>'.
	 * @see org.eclipse.modisco.infra.query.runtime.ModelQueryResult#getException()
	 * @see #getModelQueryResult()
	 * @generated
	 */
	EAttribute getModelQueryResult_Exception();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Java Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getJavaException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RuntimeFactory getRuntimeFactory();

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
	 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
	 */
	@Deprecated
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.query.runtime.impl.ModelQueryContextImpl <em>Model Query Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.query.runtime.impl.ModelQueryContextImpl
		 * @see org.eclipse.modisco.infra.query.runtime.impl.RuntimePackageImpl#getModelQueryContext()
		 * @generated
		 */
		EClass MODEL_QUERY_CONTEXT = eINSTANCE.getModelQueryContext();

		/**
		 * The meta object literal for the '<em><b>Selected Model Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_QUERY_CONTEXT__SELECTED_MODEL_ELEMENTS = eINSTANCE.getModelQueryContext_SelectedModelElements();

		/**
		 * The meta object literal for the '<em><b>Selected Models</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY_CONTEXT__SELECTED_MODELS = eINSTANCE.getModelQueryContext_SelectedModels();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.query.runtime.impl.ModelQueryParameterValueImpl <em>Model Query Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.query.runtime.impl.ModelQueryParameterValueImpl
		 * @see org.eclipse.modisco.infra.query.runtime.impl.RuntimePackageImpl#getModelQueryParameterValue()
		 * @generated
		 */
		EClass MODEL_QUERY_PARAMETER_VALUE = eINSTANCE.getModelQueryParameterValue();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_QUERY_PARAMETER_VALUE__PARAMETER = eINSTANCE.getModelQueryParameterValue_Parameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY_PARAMETER_VALUE__VALUE = eINSTANCE.getModelQueryParameterValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.query.runtime.impl.ModelQueryResultImpl <em>Model Query Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.query.runtime.impl.ModelQueryResultImpl
		 * @see org.eclipse.modisco.infra.query.runtime.impl.RuntimePackageImpl#getModelQueryResult()
		 * @generated
		 */
		EClass MODEL_QUERY_RESULT = eINSTANCE.getModelQueryResult();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_QUERY_RESULT__SOURCE = eINSTANCE.getModelQueryResult_Source();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY_RESULT__VALUE = eINSTANCE.getModelQueryResult_Value();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY_RESULT__EXCEPTION = eINSTANCE.getModelQueryResult_Exception();

		/**
		 * The meta object literal for the '<em>Java Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.eclipse.modisco.infra.query.runtime.impl.RuntimePackageImpl#getJavaException()
		 * @generated
		 */
		EDataType JAVA_EXCEPTION = eINSTANCE.getJavaException();

	}

} //RuntimePackage
