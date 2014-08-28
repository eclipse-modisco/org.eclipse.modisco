/** 
 * Copyright (c) 2014, 2015 Mia-Software, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 358914 - [Move to EMF Facet][Browser] Switch to EMF Facet
 *    Thomas Cicognani (Soft-Maint) - Bug 442800 - API to open new MoDisco Browser
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.opener;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

/**
 * A default implementation of {@link IResourceEditorInput}. For editors that
 * can take a {@link Resource} as an input (supported by the EmfFacet model
 * browser)
 */
public class ResourceEditorInput implements IEditorInput {

	private final Resource resource;

	public ResourceEditorInput(final Resource resource) {
		this.resource = resource;
	}

	public boolean exists() {
		return false;
	}

	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	public String getName() {
		String lastSegment = this.resource.getURI().lastSegment();
		if (lastSegment == null) {
			lastSegment = ""; //$NON-NLS-1$
		}
		return lastSegment;
	}

	public IPersistableElement getPersistable() {
		return null;
	}

	public String getToolTipText() {
		return getName();
	}

	public Object getAdapter(@SuppressWarnings("rawtypes") final Class adapter) {
		// @SuppressWarnings("rawtypes") : imposed by the implemented interface.
		return null;
	}

	public Resource getResource() {
		return this.resource;
	}

	@Override
	public boolean equals(final Object other) {
		boolean result = false;
		if (other instanceof ResourceEditorInput) {
			final ResourceEditorInput otherEditorInput = (ResourceEditorInput) other;
			final Resource otherResource = otherEditorInput.getResource();
			result = otherResource.equals(this.resource);
		}
		return result;
	}

	@Override
	public int hashCode() {
		return this.resource.hashCode();
	}

}
