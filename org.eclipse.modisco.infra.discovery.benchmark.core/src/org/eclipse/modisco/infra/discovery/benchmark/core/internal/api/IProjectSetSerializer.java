/*******************************************************************************
 * Copyright (c) 2011, 2019 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal.api;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.modisco.facet.util.emf.core.serialization.ISerializer;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IProjectSet;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IProjectSetFactory;

/**
 * ProjectSet Serialization facility
 * @author Guillaume Doux
 *
 */
public class IProjectSetSerializer implements ISerializer<IProjectSet> {

	public IProjectSetSerializer() {

	}

	public Class<IProjectSet> getType() {
		return IProjectSet.class;
	}

	/**
	 * Serialize the project set
	 */
	public String serialize(final IProjectSet value) {
		StringBuilder sb = new StringBuilder("");
		for (IProject iproject : value.getProjects()) {
			sb.append(iproject.getFullPath().toPortableString());
			sb.append("|");
		}
		return sb.toString();
	}

	/**
	 * Deserialize the project set
	 */
	public IProjectSet deserialize(final String serializedValue) {
		IProjectSet result = IProjectSetFactory.INSTANCE.createProjectSet();
		for (String path : serializedValue.split("\\|")) {
			Object proj = ResourcesPlugin.getWorkspace().getRoot().findMember(path);
			if (proj instanceof IProject) {
				result.add((IProject) proj);
			}
		}
		return result;
	}


}
