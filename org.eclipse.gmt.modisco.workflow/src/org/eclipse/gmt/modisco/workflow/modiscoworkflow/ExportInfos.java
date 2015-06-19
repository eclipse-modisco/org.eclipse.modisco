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
package org.eclipse.gmt.modisco.workflow.modiscoworkflow;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Export Infos</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.ExportInfos#getPackageBase <em>
 * Package Base</em>}</li>
 * <li>{@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.ExportInfos#getSymbolicName <em>
 * Symbolic Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getExportInfos()
 * @model
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@Deprecated
public interface ExportInfos extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Base</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Base</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Package Base</em>' attribute.
	 * @see #setPackageBase(String)
	 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getExportInfos_PackageBase()
	 * @model
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	String getPackageBase();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.ExportInfos#getPackageBase
	 * <em>Package Base</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Package Base</em>' attribute.
	 * @see #getPackageBase()
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	void setPackageBase(String value);

	/**
	 * Returns the value of the '<em><b>Symbolic Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbolic Name</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Symbolic Name</em>' attribute.
	 * @see #setSymbolicName(String)
	 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getExportInfos_SymbolicName()
	 * @model
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	String getSymbolicName();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.ExportInfos#getSymbolicName
	 * <em>Symbolic Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Symbolic Name</em>' attribute.
	 * @see #getSymbolicName()
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	void setSymbolicName(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	EList<Element> getAllUnitsOfWork();

} // ExportInfos
