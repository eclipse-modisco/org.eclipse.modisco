/*******************************************************************************
 * Copyright (c) 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.facet.util.emf.core.internal.serialization.serializers;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.modisco.facet.util.emf.core.serialization.ISerializer;

public class IResourceSerializer implements ISerializer<IResource> {

	public IResourceSerializer() {
		//
	}

	public Class<IResource> getType() {
		return IResource.class;
	}

	public String serialize(final IResource value) {
		return value.getFullPath().toPortableString();
	}

	public IResource deserialize(final String serializedValue) {
		return ResourcesPlugin.getWorkspace().getRoot().findMember(serializedValue);
	}
}
