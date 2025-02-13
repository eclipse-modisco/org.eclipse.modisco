/*****************************************************************************
 * Copyright (c) 2010, 2019 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   Nicolas Guyomar (Mia-Software) - initial API and implementation
 *   Nicolas Bros (Mia-Software) - Bug 334539 - [celleditors] change listener
 *****************************************************************************/
package org.eclipse.modisco.facet.widgets.celleditors.ecore;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.facet.widgets.celleditors.IListener;
import org.eclipse.modisco.facet.widgets.celleditors.IModelCellEditHandler;
import org.eclipse.modisco.facet.widgets.celleditors.IModelCellEditor;
import org.eclipse.modisco.facet.widgets.celleditors.ecore.composite.FloatComposite;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/** A cell editor for Float */
public class EFloatCellEditor implements IModelCellEditor {

	private FloatComposite composite = null;

	public Control activateCell(final Composite parent, final Object originalValue,
			final IModelCellEditHandler editHandler, final EStructuralFeature feature,
			final EObject source) {
		this.composite = new FloatComposite(parent);
		if (originalValue != null) {
			if (originalValue instanceof Float) {
				this.composite.setValue((Float) originalValue);
			} else {
				Logger.logError("An instance of Float was expected", //$NON-NLS-1$
						Activator.getDefault());
			}
		}
		this.composite.addCommitListener(new IListener() {
			public void handleEvent() {
				editHandler.commit();
			}
		});
		return this.composite;
	}

	public Object getValue() {
		return this.composite.getValue();
	}

}
