/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.editors;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;

/**
 * Unwraps the MetaclassViewer elements (see
 * {@link org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider}, from
 * which this class is derived).
 *
 */
public class MetaclassUnwrappingSelectionProvider extends
		org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider {

	public MetaclassUnwrappingSelectionProvider(final ISelectionProvider selectionProvider) {
		super(selectionProvider);
	}

	@Override
	public void setSelection(final ISelection selection) {
		// unwrap InstancesForMetaclass wrappers
		final ISelection selection2 = MetaclassViewer.unwrapSelection(selection);
		super.setSelection(selection2);
	}
}
