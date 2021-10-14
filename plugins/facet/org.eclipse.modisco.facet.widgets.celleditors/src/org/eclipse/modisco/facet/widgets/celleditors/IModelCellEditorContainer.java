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
package org.eclipse.modisco.facet.widgets.celleditors;

import org.eclipse.modisco.facet.widgets.celleditors.modelCellEditor.AbstractModelCellEditor;

public interface IModelCellEditorContainer<T extends AbstractModelCellEditor> {

	public String getBundleName();

	public void setBundleName(String bundleName);

	public AbstractModelCellEditor getModelCellEditor();
	
	public void setModelCellEditor(AbstractModelCellEditor modelCellEditor);
}
