/*******************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   Nicolas Bros (Mia-Software) - initial API and implementation
 *   Nicolas Bros (Mia-Software) - Bug 339855 - ModelCellEditor class should not be exposed
 *******************************************************************************/
package org.eclipse.modisco.facet.widgets.celleditors.internal;

import org.eclipse.core.runtime.Platform;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.facet.widgets.celleditors.modelCellEditor.AbstractModelCellEditor;

public class ModelCellEditor {
	private final String bundleName;
	private final AbstractModelCellEditor modelCellEditor;

	public ModelCellEditor(final String bundleName, final AbstractModelCellEditor modelCellEditor) {
		this.bundleName = bundleName;
		this.modelCellEditor = modelCellEditor;
	}

	public String getBundleName() {
		return this.bundleName;
	}

	public String getCellID() {
		return this.modelCellEditor.getCellId();
	}

	public AbstractModelCellEditor getModelCellEditor() {
		return this.modelCellEditor;
	}

	public Object getCellEditorImplementation() {
		String className = this.modelCellEditor.getModelCellEditorImpl();

		Class<?> classInstance = null;
		try {
			classInstance = Platform.getBundle(this.bundleName).loadClass(className);
		} catch (Exception e) {
			Logger.logError("Could not find class: " + className, //$NON-NLS-1$
					Activator.getDefault());
			return null;
		}

		Object instance = null;
		try {
			instance = classInstance.newInstance();
		} catch (Exception e) {
			Logger.logError("Could not instantiate class: " + className, //$NON-NLS-1$
					Activator.getDefault());
			return null;
		}
		return instance;
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof ModelCellEditor) {
			ModelCellEditor other = (ModelCellEditor) obj;
			return other.getCellID().equals(getCellID());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return getCellID().hashCode();
	}

	@Override
	public String toString() {
		return getBundleName() + "#" + getCellID(); //$NON-NLS-1$
	}
}