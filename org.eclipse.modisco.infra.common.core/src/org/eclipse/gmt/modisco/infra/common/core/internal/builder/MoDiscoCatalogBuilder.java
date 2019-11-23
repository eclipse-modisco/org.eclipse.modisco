/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.common.core.internal.builder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.gmt.modisco.infra.common.core.internal.CommonModiscoActivator;
import org.eclipse.gmt.modisco.infra.common.core.internal.validation.ValidationUtils;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;

public abstract class MoDiscoCatalogBuilder implements IModiscoBuilder {

	private static final String DEBUG_ID = "org.eclipse.gmt.modisco.infra.common.core/debug/MoDiscoCatalogBuilder/debug"; //$NON-NLS-1$
	static final boolean DEBUG = CommonModiscoActivator.getDefault().isDebugging()
			&& Boolean.parseBoolean(Platform.getDebugOption(MoDiscoCatalogBuilder.DEBUG_ID));

	public void clean(final IncrementalProjectBuilder builder, final IProgressMonitor monitor)
			throws CoreException {
		final IProject project = builder.getProject();
		getCatalog().clean(project);
		validateModelDeclared(project);
	}

	public IProject[] build(final IncrementalProjectBuilder builder, final int kind,
			final Map<?, ?> args, final IProgressMonitor monitor) throws CoreException {
		getCatalog(); // make sure catalog is initialized (for listening referenced resources changes)
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

	private void fullBuild(final IncrementalProjectBuilder builder) {
		try {
			builder.getProject().accept(new IResourceVisitor() {
				public boolean visit(final IResource resource) throws CoreException {
					String fileExtension = resource.getFileExtension();
					if (fileExtension != null && fileExtension.equals(getFileExtension())) {
						try {
							getCatalog().scheduleAddWSFile((IFile) resource);
						} catch (ClassCastException e) {
							IStatus status = new Status(IStatus.ERROR, getActivator().getBundle()
									.getSymbolicName(), "Failed to build: " //$NON-NLS-1$
									+ resource.getProject().getName(), e);
							getActivator().getLog().log(status);
						}
					}
					return true;
				}
			});
		} catch (CoreException e) {
			IStatus status = new Status(IStatus.ERROR,
					getActivator().getBundle().getSymbolicName(),
					"Failed to build: " + builder.getProject(), e); //$NON-NLS-1$
			getActivator().getLog().log(status);
		}
		validateModelDeclared(builder.getProject());
	}

	private void incrementalBuild(final IncrementalProjectBuilder builder,
			final IResourceDelta resourceDelta) {
		try {
			final Set<IProject> projectsToValidate = new HashSet<IProject>();
			final List<IFile> toBeAdded = new ArrayList<IFile>();
			final List<IFile> toBeRemoved = new ArrayList<IFile>();
			final List<IFile> toBeUpdated = new ArrayList<IFile>();
			resourceDelta.accept(new IResourceDeltaVisitor() {
				public boolean visit(final IResourceDelta delta) {
					IResource resource = delta.getResource();
					if ("plugin.xml".equals(resource.getName()) || "build.properties".equals(resource.getName())) { //$NON-NLS-1$ //$NON-NLS-2$
						projectsToValidate.add(resource.getProject());
					}
					String fileExtension = resource.getFileExtension();
					if (resource instanceof IFile && fileExtension != null
							&& fileExtension.equals(getFileExtension())) {
						final IFile file = (IFile) resource;
						projectsToValidate.add(file.getProject());
						switch (delta.getKind()) {
						case IResourceDelta.ADDED:
							if (MoDiscoCatalogBuilder.DEBUG) {
								System.out.println(MoDiscoCatalogBuilder.this.getClass()
										.getSimpleName()
										+ ": ADDED: " + file); //$NON-NLS-1$
							}
							toBeAdded.add(file);
							break;
						case IResourceDelta.REMOVED:
							if (MoDiscoCatalogBuilder.DEBUG) {
								System.out.println(MoDiscoCatalogBuilder.this.getClass()
										.getSimpleName()
										+ ": REMOVED: " + file); //$NON-NLS-1$
							}
							toBeRemoved.add(file);
							break;
						case IResourceDelta.CHANGED:
							if (MoDiscoCatalogBuilder.DEBUG) {
								System.out.println(MoDiscoCatalogBuilder.this.getClass()
										.getSimpleName()
										+ ": CHANGED: " + file); //$NON-NLS-1$
							}
							toBeUpdated.add(file);
							break;
						case IResourceDelta.ADDED_PHANTOM:
							if (MoDiscoCatalogBuilder.DEBUG) {
								System.out.println(MoDiscoCatalogBuilder.this.getClass()
										.getSimpleName()
										+ ": ADDED_PHANTOM: " + file); //$NON-NLS-1$
							}
							toBeAdded.add(file);
							break;
						case IResourceDelta.REMOVED_PHANTOM:
							if (MoDiscoCatalogBuilder.DEBUG) {
								System.out.println(MoDiscoCatalogBuilder.this.getClass()
										.getSimpleName()
										+ ": REMOVED_PHANTOM: " + file); //$NON-NLS-1$
							}
							toBeRemoved.add(file);
							break;
						default:
							MoDiscoLogger.logError("Unknown delta kind: " //$NON-NLS-1$
									+ delta.getKind(), getActivator());
							break;
						}
					}
					return true;
				}
			});
			for (IFile file : toBeRemoved) {
				getCatalog().scheduleRemoveWSFile(file);
			}
			for (IFile file : toBeAdded) {
				getCatalog().scheduleAddWSFile(file);
			}
			for (IFile file : toBeUpdated) {
				getCatalog().scheduleUpdateWSFile(file);
			}
			for (IProject project : projectsToValidate) {
				validateModelDeclared(project);
			}
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, "Failed to build: " + builder.getProject(), getActivator()); //$NON-NLS-1$
		}
	}

	private void validateModelDeclared(final IProject project) {
		if (getRegistrationExtensionPoint() != null) {
			ValidationUtils.validateRegistered(project, getFileExtension(), getMarkerType(),
					getElementType(), getRegistrationExtensionPoint());
		}
	}

	protected abstract AbstractMoDiscoCatalog getCatalog();

	protected abstract String getElementType();

	protected abstract String getRegistrationExtensionPoint();

	protected abstract String getMarkerType();

	protected abstract String getFileExtension();

	protected abstract Plugin getActivator();

}
