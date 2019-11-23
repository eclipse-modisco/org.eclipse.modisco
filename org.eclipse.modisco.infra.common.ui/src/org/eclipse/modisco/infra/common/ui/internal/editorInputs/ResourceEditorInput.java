/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas BROS (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.ui.internal.editorInputs;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.modisco.infra.common.ui.internal.util.ImageProvider;
import org.eclipse.ui.IPersistableElement;

/**
 * A default implementation of {@link IResourceEditorInput}. For editors that
 * can take a {@link Resource} as an input (supported by the MoDisco model
 * browser)
 */
public class ResourceEditorInput implements IResourceEditorInput {

	private final Resource resource;

	public ResourceEditorInput(final Resource resource) {
		this.resource = resource;
	}

	public boolean exists() {
		return false;
	}

	public ImageDescriptor getImageDescriptor() {
		return ImageProvider.getInstance().getModiscoLogoDescriptor();
	}

	public String getName() {
		URI uri = this.resource.getURI();
		if (uri != null) {
			String lastSegment = uri.lastSegment();
			if (lastSegment != null) {
				return lastSegment;
			}
		}
		return ""; //$NON-NLS-1$
	}

	public IPersistableElement getPersistable() {
		return null;
	}

	public String getToolTipText() {
		return getName();
	}

	@SuppressWarnings("unchecked")
	public Object getAdapter(final Class adapter) {
		return null;
	}

	public Resource getResource() {
		return this.resource;
	}

	@Override
	public boolean equals(final Object other) {
		if (other instanceof ResourceEditorInput) {
			ResourceEditorInput otherResourceEditorInput = (ResourceEditorInput) other;
			return otherResourceEditorInput.getResource().equals(getResource());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.resource.hashCode();
	}

}
