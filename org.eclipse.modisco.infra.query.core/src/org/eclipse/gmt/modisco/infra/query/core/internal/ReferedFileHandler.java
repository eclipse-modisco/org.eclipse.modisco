/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.query.core.internal;

import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.query.ModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.osgi.framework.Bundle;

/**
 * This class represents a reference to a file pointed by a model query
 * attribute.
 *
 * @author Gregoire DUPE (Mia-Software)
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public final class ReferedFileHandler {

	private Bundle bundle;
	private IProject project;
	private String location;

	/**
	 * This method returns an instance of ReferedFileHandler. The instance of
	 * ReferedFileHandler can be used to check the existence of a file and get
	 * its input stream.
	 *
	 * @param containerName
	 *            The name of the containing plug-in or project. If
	 *            containerName is null, the query model element container
	 *            (plug-in or project) is used.
	 * @param fileLocation
	 *            The location of the file into the container.
	 * @return a file handler referring a file
	 */
	public ReferedFileHandler(final String containerName, final String fileLocation,
			final ModelQuery modelQuery) {
		if (modelQuery == null) {
			throw new RuntimeException("The modelQueryParameter is null"); //$NON-NLS-1$
		}
		if (containerName == null || containerName.length() == 0) {
			String projectName = null;
			try {
				Resource resource = modelQuery.eResource();
				URI querySetModelUri = resource.getURI();
				if (!querySetModelUri.isPlatform()) {
					throw new Exception();
				}
				projectName = querySetModelUri.segment(1);
			} catch (Exception e) {
				URI querySetModelUri = ModelQuerySetCatalog.getSingleton().getURI(
						modelQuery.getModelQuerySet().getName());
				projectName = querySetModelUri.segment(1);
			}
			this.project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			if (!this.project.exists()) {
				this.bundle = Platform.getBundle(projectName);
				this.project = null;
			}
		} else {
			this.project = ResourcesPlugin.getWorkspace().getRoot().getProject(containerName);
			if (!this.project.exists()) {
				this.bundle = Platform.getBundle(containerName);
				this.project = null;
			}
		}
		this.location = fileLocation;
	}

	ReferedFileHandler(final IProject project, final Bundle bundle, final String asmLocation) {
		this.bundle = bundle;
		this.project = project;
		this.location = asmLocation;
	}

	/**
	 * This method returns true is the file exists.
	 *
	 * @return Returns true is the file exists.
	 */
	public boolean exists() {
		boolean exists = false;
		try {
			if (this.project != null) {
				IFile file = this.project.getFile(new Path(this.location));
				exists = file.exists();
			} else if (this.bundle != null) {
				exists = (this.bundle.getResource(this.location) != null);
			}
		} catch (Exception e) {
			IStatus status = new Status(IStatus.WARNING, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		}
		return exists;
	}

	/**
	 * Return a input stream to the corresponding file
	 *
	 * @return an input stream
	 * @throws Exception
	 *             If the file is not readable
	 */
	public InputStream getInputStream() throws Exception {
		InputStream inputStream;
		if (this.project != null) {
			IFile file = this.project.getFile(new Path(this.location));
			inputStream = file.getContents();
		} else if (this.bundle != null) {
			inputStream = this.bundle.getResource(this.location).openStream();
		} else {
			throw new ModelQueryExecutionException(
					"ASM file not found. project=" + this.project + "bundle=" //$NON-NLS-1$ //$NON-NLS-2$
							+ this.bundle + " location=" + this.location); //$NON-NLS-1$
		}
		return inputStream;
	}

	/**
	 * If the referred file is a workspace file, this method return return an
	 * IFile instance representing the referred file
	 *
	 * @return an IFile instance representing the referred file, null if this
	 *         referred file is not a workspace file.
	 */
	public IFile getWSFile() {
		IFile file;
		if (this.project != null) {
			IPath path = new Path(this.location);
			file = this.project.getFile(path);
		} else {
			file = null;
		}
		return file;
	}
}
