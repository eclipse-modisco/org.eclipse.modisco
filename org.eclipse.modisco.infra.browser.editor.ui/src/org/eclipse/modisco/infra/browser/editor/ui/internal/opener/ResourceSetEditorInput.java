/**
 * Copyright (c) 2015 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 442800 - API to open new MoDisco Browser
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.opener;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class ResourceSetEditorInput implements IEditorInput {

	private final ResourceSet resourceSet;

	public ResourceSetEditorInput(final ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}

	public ResourceSet getResourceSet() {
		return this.resourceSet;
	}

	@Override
	public boolean equals(final Object other) {
		boolean result = false;
		if (other instanceof ResourceSetEditorInput) {
			final ResourceSetEditorInput otherEditorInput = (ResourceSetEditorInput) other;
			final ResourceSet otherResourceSet = otherEditorInput
					.getResourceSet();
			result = otherResourceSet.equals(this.resourceSet);
		}
		return result;
	}

	@Override
	public int hashCode() {
		return this.resourceSet.hashCode();
	}

	public Object getAdapter(@SuppressWarnings("rawtypes") final Class adapter) {
		// @SuppressWarnings("rawtypes") : imposed by the implemented interface.
		return null;
	}

	public boolean exists() {
		return false;
	}

	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	public String getName() {
		return this.resourceSet.toString();
	}

	public IPersistableElement getPersistable() {
		return null;
	}

	public String getToolTipText() {
		return getName();
	}

}
