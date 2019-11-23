/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software)
 */
package org.eclipse.modisco.infra.query.core.java.internal;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.modisco.infra.common.core.internal.builder.IModiscoBuilder;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.modisco.infra.query.core.internal.Activator;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class JavaValidationQueryBuilder implements IModiscoBuilder {

	public JavaValidationQueryBuilder() {
		JavaQueryImplMarkerChangeListener.getSingleton();
	}

	public static final String FILE_EXTENSION = "java"; //$NON-NLS-1$

	public IProject[] build(final IncrementalProjectBuilder builder, final int kind,
			final Map<?, ?> args, final IProgressMonitor monitor) throws CoreException {
		if (kind == IncrementalProjectBuilder.FULL_BUILD) {
			fullBuild(builder);
		} else {
			IProject project = builder.getProject();
			IResourceDelta delta = builder.getDelta(project);
			if (delta == null) {
				fullBuild(builder);
			} else {
				incrementalBuild(builder, delta);
			}
		}
		return null;
	}

	private void incrementalBuild(final IncrementalProjectBuilder builder,
			final IResourceDelta resourceDelta) {
		try {
			final Set<IProject> projectsToRevalidate = new HashSet<IProject>();
			resourceDelta.accept(new IResourceDeltaVisitor() {
				public boolean visit(final IResourceDelta delta) {
					IResource resource = delta.getResource();
					String fileExtension = resource.getFileExtension();
					if (resource instanceof IFile && fileExtension != null
							&& fileExtension.equals(JavaValidationQueryBuilder.FILE_EXTENSION)) {
						projectsToRevalidate.add(resource.getProject());
					}
					return true;
				}
			});
			for (IProject project : projectsToRevalidate) {
				ModelQuerySetCatalog.getSingleton().revalidateAll(project);
			}
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, "Failed to build: " + builder.getProject(), Activator //$NON-NLS-1$
					.getDefault());
		}
	}

	private void fullBuild(final IncrementalProjectBuilder builder) {
		try {
			final Set<IProject> projectsToRevalidate = new HashSet<IProject>();
			builder.getProject().accept(new IResourceVisitor() {
				public boolean visit(final IResource resource) throws CoreException {
					String fileExtension = resource.getFileExtension();
					if (fileExtension != null
							&& fileExtension.equals(JavaValidationQueryBuilder.FILE_EXTENSION)) {
						projectsToRevalidate.add(resource.getProject());
					}
					return true;
				}
			});
			for (IProject project : projectsToRevalidate) {
				ModelQuerySetCatalog.getSingleton().revalidateAll(project);
			}
		} catch (CoreException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					"Failed to build: " + builder.getProject(), e); //$NON-NLS-1$
			Activator.getDefault().getLog().log(status);
		}
	}

	public void clean(final IncrementalProjectBuilder builder, final IProgressMonitor monitor)
			throws CoreException {
		// Nothing to do
	}
}
