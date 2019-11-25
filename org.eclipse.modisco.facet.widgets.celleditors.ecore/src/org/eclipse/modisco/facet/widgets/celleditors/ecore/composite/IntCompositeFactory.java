/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Guyomar (Mia-Software) - Bug 334546 - [celleditors] no border on Text field
 *    Nicolas Bros (Mia-Software) - Bug 338437 - compositeEditors extension point cannot be used to register user types
 *******************************************************************************/
package org.eclipse.modisco.facet.widgets.celleditors.ecore.composite;

import org.eclipse.modisco.facet.widgets.celleditors.AbstractCellEditorComposite;
import org.eclipse.modisco.facet.widgets.celleditors.ICompositeEditorFactory;
import org.eclipse.swt.widgets.Composite;

public class IntCompositeFactory implements ICompositeEditorFactory<Integer> {

	public AbstractCellEditorComposite<Integer> createCompositeEditor(final Composite parent, final int style) {
		return new IntComposite(parent, style);
	}

	public Class<Integer> getHandledType() {
		return Integer.class;
	}

}
