/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   Nicolas Bros (Mia-Software) - initial API and implementation
 *   Nicolas Bros (Mia-Software) - Bug 339664 - org.eclipse.modisco.facet.widgets.celleditors API cleaning
 *   Nicolas Bros (Mia-Software) - Bug 334539 - [celleditors] change listener
 *   Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *****************************************************************************/
package org.eclipse.modisco.facet.widgets.celleditors.internal.core;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.modisco.facet.util.emf.core.ModelUtils;
import org.eclipse.modisco.facet.widgets.celleditors.IListener;
import org.eclipse.modisco.facet.widgets.celleditors.IModelCellEditHandler;
import org.eclipse.modisco.facet.widgets.celleditors.IModelCellEditor;
import org.eclipse.modisco.facet.widgets.celleditors.internal.core.composite.UnaryReferenceCellEditorComposite;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/** A cell editor for unary references */
public class UnaryReferenceCellEditor implements IModelCellEditor {

	private UnaryReferenceCellEditorComposite cellEditorComposite;

	public Control activateCell(final Composite parent, final Object originalValue,
			final IModelCellEditHandler editHandler, final EStructuralFeature feature,
			final EObject source) {

		List<EObject> list = ModelUtils.computeAssignableElements(feature, source);

		this.cellEditorComposite = new UnaryReferenceCellEditorComposite(parent, list);
		this.cellEditorComposite.addCommitListener(new IListener() {
			public void handleEvent() {
				editHandler.commit();
			}
		});

		return this.cellEditorComposite;
	}

	public Object getValue() {
		return this.cellEditorComposite.getValue();
	}
}
