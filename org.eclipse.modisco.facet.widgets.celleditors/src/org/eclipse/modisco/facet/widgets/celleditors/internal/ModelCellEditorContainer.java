/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - Bug 339554 - org.eclipse.modisco.facet.widgets.celleditors API cleaning
 *******************************************************************************/
package org.eclipse.modisco.facet.widgets.celleditors.internal;

import org.eclipse.modisco.facet.widgets.celleditors.IModelCellEditorContainer;
import org.eclipse.modisco.facet.widgets.celleditors.modelCellEditor.AbstractModelCellEditor;

public class ModelCellEditorContainer<T extends AbstractModelCellEditor> implements
		IModelCellEditorContainer<AbstractModelCellEditor> {

	private AbstractModelCellEditor modelCellEditor;
	private String bundleName;

	public String getBundleName() {
		return this.bundleName;
	}

	public AbstractModelCellEditor getModelCellEditor() {
		return this.modelCellEditor;
	}

	public void setBundleName(final String bundleName) {
		this.bundleName = bundleName;
	}

	public void setModelCellEditor(final AbstractModelCellEditor modelCellEditor) {
		this.modelCellEditor = modelCellEditor;

	}
}