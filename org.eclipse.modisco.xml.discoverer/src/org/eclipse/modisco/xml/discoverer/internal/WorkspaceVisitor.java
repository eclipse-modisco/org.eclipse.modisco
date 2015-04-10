/*********************************************************************************
 * Copyright (c) 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 464300 - To be able to discover XML models from a folder/project
 ********************************************************************************/
package org.eclipse.modisco.xml.discoverer.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.framework.Bundle;

public class WorkspaceVisitor implements IResourceVisitor {

	private final Resource globalResource;
	private final boolean lightweightModel;
	private final boolean ignoreWhitespace;
	private final List<IStatus> errors = new ArrayList<IStatus>();

	public WorkspaceVisitor(final Resource globalResource, final boolean lightweightModel,
			final boolean ignoreWhitespace) {
		this.globalResource = globalResource;
		this.lightweightModel = lightweightModel;
		this.ignoreWhitespace = ignoreWhitespace;
	}

	public boolean visit(final IResource fsResource) throws CoreException {
		boolean result = false;
		if (fsResource instanceof IFile) {
			try {
				final IFile source = (IFile) fsResource;
				if (Utils.isXmlFile(fsResource)) {
					final URI sourceURI = Utils.createSourceURI(source);
					final boolean isIgnoreWS = this.ignoreWhitespace;
					final boolean isLwModel = this.lightweightModel;
					final Resource emfResource = Utils.discoverResource(
							sourceURI, isIgnoreWS, isLwModel);
					final EList<EObject> roots = emfResource.getContents();
					this.globalResource.getContents().addAll(roots);
				}
				this.globalResource.save(Collections.EMPTY_MAP);
			} catch (Exception e) {
				final Bundle bundle = XmlActivator.getDefault().getBundle();
				final String bundleName = bundle.getSymbolicName();
				final IPath location = fsResource.getLocation();
				final String message = String.format(
						"Error append when trying to parse %s.", //$NON-NLS-1$
						location.toOSString());
				final Status status = new Status(IStatus.ERROR, bundleName, message);
				this.errors.add(status);
			}
		} else if (fsResource instanceof IFolder) {
			result = true;
		} else if (fsResource instanceof IProject) {
			result = true;
		}
		return result;
	}
	
	public List<IStatus> getErrors() {
		return this.errors;
	}

	public void check() throws CoreException {
		if (!this.errors.isEmpty()) {
			final IStatus[] newChildren = this.errors.toArray(new IStatus[0]);
			final int code = IStatus.ERROR;
			final Bundle bundle = XmlActivator.getDefault().getBundle();
			final String pluginId = bundle.getSymbolicName();
			final MultiStatus status = new MultiStatus(
					pluginId,
					code,
					newChildren,
					"Some erros append during the discovery", //$NON-NLS-1$
					null);
			throw new CoreException(status);
		}
	}

}
