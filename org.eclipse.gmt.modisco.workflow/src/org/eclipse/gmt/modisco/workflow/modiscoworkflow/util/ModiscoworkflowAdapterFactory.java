/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.workflow.modiscoworkflow.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.ExportInfos;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Work;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameter;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterBooleanValue;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterIntegerValue;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterMapValue;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterStringListValue;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterStringValue;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterValue;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Workflow;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@Deprecated
public class ModiscoworkflowAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	protected static ModiscoworkflowPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public ModiscoworkflowAdapterFactory() {
		if (ModiscoworkflowAdapterFactory.modelPackage == null) {
			ModiscoworkflowAdapterFactory.modelPackage = ModiscoworkflowPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
	 * --> This implementation returns <code>true</code> if the object is either the model's package
	 * or is an instance object of the model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	@Override
	public boolean isFactoryForType(final Object object) {
		if (object == ModiscoworkflowAdapterFactory.modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == ModiscoworkflowAdapterFactory.modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	protected ModiscoworkflowSwitch<Adapter> modelSwitch = new ModiscoworkflowSwitch<Adapter>() {
		@Override
		public Adapter caseElement(final Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter caseWorkflow(final Workflow object) {
			return createWorkflowAdapter();
		}

		@Override
		public Adapter caseWork(final Work object) {
			return createWorkAdapter();
		}

		@Override
		public Adapter caseWorkParameter(final WorkParameter object) {
			return createWorkParameterAdapter();
		}

		@Override
		public Adapter caseWorkParameterValue(final WorkParameterValue object) {
			return createWorkParameterValueAdapter();
		}

		@Override
		public Adapter caseWorkParameterStringValue(final WorkParameterStringValue object) {
			return createWorkParameterStringValueAdapter();
		}

		@Override
		public Adapter caseWorkParameterStringListValue(final WorkParameterStringListValue object) {
			return createWorkParameterStringListValueAdapter();
		}

		@Override
		public Adapter caseWorkParameterBooleanValue(final WorkParameterBooleanValue object) {
			return createWorkParameterBooleanValueAdapter();
		}

		@Override
		public Adapter caseWorkParameterIntegerValue(final WorkParameterIntegerValue object) {
			return createWorkParameterIntegerValueAdapter();
		}

		@Override
		public Adapter caseWorkParameterMapValue(final WorkParameterMapValue object) {
			return createWorkParameterMapValueAdapter();
		}

		@Override
		public Adapter caseWorkParameterEntryValue(
				final Map.Entry<String, WorkParameterValue> object) {
			return createWorkParameterEntryValueAdapter();
		}

		@Override
		public Adapter caseExportInfos(final ExportInfos object) {
			return createExportInfosAdapter();
		}

		@Override
		public Adapter defaultCase(final EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	@Override
	public Adapter createAdapter(final Notifier target) {
		return this.modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element <em>Element</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.Workflow <em>Workflow</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.Workflow
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public Adapter createWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.Work <em>Work</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.Work
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public Adapter createWorkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameter
	 * <em>Work Parameter</em>}'. <!-- begin-user-doc --> This default implementation returns null
	 * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameter
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public Adapter createWorkParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterValue
	 * <em>Work Parameter Value</em>}'. <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
	 * catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterValue
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public Adapter createWorkParameterValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterStringValue
	 * <em>Work Parameter String Value</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterStringValue
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public Adapter createWorkParameterStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterStringListValue
	 * <em>Work Parameter String List Value</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterStringListValue
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public Adapter createWorkParameterStringListValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterBooleanValue
	 * <em>Work Parameter Boolean Value</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterBooleanValue
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public Adapter createWorkParameterBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterIntegerValue
	 * <em>Work Parameter Integer Value</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterIntegerValue
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public Adapter createWorkParameterIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterMapValue
	 * <em>Work Parameter Map Value</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterMapValue
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public Adapter createWorkParameterMapValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry
	 * <em>Work Parameter Entry Value</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public Adapter createWorkParameterEntryValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.ExportInfos <em>Export Infos</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.ExportInfos
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public Adapter createExportInfosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
	 * implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	public Adapter createEObjectAdapter() {
		return null;
	}

} // ModiscoworkflowAdapterFactory
