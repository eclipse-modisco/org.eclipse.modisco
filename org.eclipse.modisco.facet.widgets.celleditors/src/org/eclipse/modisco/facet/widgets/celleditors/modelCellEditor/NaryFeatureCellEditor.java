/**
 * Copyright (c) 2010, 2019 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.facet.widgets.celleditors.modelCellEditor;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Nary Feature Cell Editor</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.modisco.facet.widgets.celleditors.modelCellEditor.NaryFeatureCellEditor#getNaryFeatureCellEditorImpl
 * <em>Nary Feature Cell Editor Impl</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.modisco.facet.widgets.celleditors.modelCellEditor.ModelCellEditorPackage#getNaryFeatureCellEditor()
 * @model
 * @generated
 */
public interface NaryFeatureCellEditor extends AbstractModelCellEditor {
	/**
	 * Returns the value of the '<em><b>Nary Feature Cell Editor Impl</b></em>'
	 * attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nary Feature Cell Editor Impl</em>' attribute
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Nary Feature Cell Editor Impl</em>'
	 *         attribute.
	 * @see #setNaryFeatureCellEditorImpl(String)
	 * @see org.eclipse.modisco.facet.widgets.celleditors.modelCellEditor.ModelCellEditorPackage#getNaryFeatureCellEditor_NaryFeatureCellEditorImpl()
	 * @model required="true"
	 * @generated
	 */
	String getNaryFeatureCellEditorImpl();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.modisco.facet.widgets.celleditors.modelCellEditor.NaryFeatureCellEditor#getNaryFeatureCellEditorImpl
	 * <em>Nary Feature Cell Editor Impl</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Nary Feature Cell Editor Impl</em>'
	 *            attribute.
	 * @see #getNaryFeatureCellEditorImpl()
	 * @generated
	 */
	void setNaryFeatureCellEditorImpl(String value);

} // NaryFeatureCellEditor
