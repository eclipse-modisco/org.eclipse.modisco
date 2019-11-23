/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.java.discoverer.ui.internal;

import org.eclipse.modisco.facet.widgets.celleditors.AbstractCellEditorComposite;
import org.eclipse.modisco.facet.widgets.celleditors.ICompositeEditorFactory;
import org.eclipse.modisco.java.discoverer.ElementsToAnalyze;
import org.eclipse.swt.widgets.Composite;

public class JavaElementsToAnalyzeCompositeFactory implements
		ICompositeEditorFactory<ElementsToAnalyze> {

	public AbstractCellEditorComposite<ElementsToAnalyze> createCompositeEditor(
			final Composite parent, final int style) {
		return new JavaElementsToAnalyzeComposite(parent, style);
	}

	public Class<ElementsToAnalyze> getHandledType() {
		return ElementsToAnalyze.class;
	}

}
