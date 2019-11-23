/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.celleditors.composite;

import org.eclipse.emf.common.util.URI;
import org.eclipse.modisco.facet.widgets.celleditors.AbstractCellEditorComposite;
import org.eclipse.modisco.facet.widgets.celleditors.ICompositeEditorFactory;
import org.eclipse.swt.widgets.Composite;

public class TargetURICompositeFactory implements ICompositeEditorFactory<URI> {
	public AbstractCellEditorComposite<URI> createCompositeEditor(final Composite parent,
			final int style) {
		return new TargetURIComposite(parent, style);
	}

	public Class<URI> getHandledType() {
		return URI.class;
	}
}
