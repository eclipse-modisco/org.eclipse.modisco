/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.query.core.java.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.internal.MoDiscoProject;
import org.eclipse.gmt.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog.ModiscoCatalogChangeListener;
import org.eclipse.gmt.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog.NonValidFileListener;
import org.eclipse.gmt.modisco.infra.common.core.internal.builder.CatalogJob;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.query.JavaModelQuery;
import org.eclipse.gmt.modisco.infra.query.ModelQuery;
import org.eclipse.gmt.modisco.infra.query.ModelQuerySet;
import org.eclipse.gmt.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.gmt.modisco.infra.query.core.internal.Activator;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

/**
 * Listens to changes in the workspace and query set catalog, and revalidates
 * the projects containing QuerySets when the Java implementation class
 * referenced by one of their queries is modified.
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public final class JavaQueryImplMarkerChangeListener implements IResourceChangeListener,
		ModiscoCatalogChangeListener, NonValidFileListener {

	private static JavaQueryImplMarkerChangeListener singleton;
	private final Map<IFile, IFile> javaFileToJavaQueryFileMap = new HashMap<IFile, IFile>();
	private final Map<IFile, List<IFile>> querySetToJavaQueriesMap = new HashMap<IFile, List<IFile>>();
	private final List<IFile> nonValidFiles = new ArrayList<IFile>();

	private JavaQueryImplMarkerChangeListener() {
		ModelQuerySetCatalog.getSingleton().addChangeListener(this);
		ModelQuerySetCatalog.getSingleton().addNonValidFileListener(this);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

	public static JavaQueryImplMarkerChangeListener getSingleton() {
		if (JavaQueryImplMarkerChangeListener.singleton == null) {
			JavaQueryImplMarkerChangeListener.singleton = new JavaQueryImplMarkerChangeListener();
		}
		return JavaQueryImplMarkerChangeListener.singleton;
	}

	public void resourceChanged(final IResourceChangeEvent event) {
		IMarkerDelta[] markerDeltas = event.findMarkerDeltas(IMarker.PROBLEM, true);
		final HashSet<IFile> toBeUpdated = new HashSet<IFile>();
		for (IMarkerDelta markerDelta : markerDeltas) {
			IResource resource = markerDelta.getResource();
			Object fileExtension = resource.getFileExtension();
			if (resource instanceof IFile && fileExtension != null
					&& fileExtension.equals(JavaValidationQueryBuilder.FILE_EXTENSION)) {
				try {
					IProject project = resource.getProject();
					// only for MoDisco projects
					if (project != null && project.exists() && project.isOpen()
							&& project.getNature(MoDiscoProject.NATURE_ID) != null) {
						IFile javaFile = (IFile) resource;
						IFile querySetFile = this.javaFileToJavaQueryFileMap.get(javaFile);
						if (querySetFile != null) {
							toBeUpdated.add(querySetFile);
						}
						for (IFile nonValidFile : this.nonValidFiles) {
							toBeUpdated.add(nonValidFile);
						}
					}
				} catch (CoreException e) {
					MoDiscoLogger.logError(e, Activator.getDefault());
				}
			}
		}
		if (!toBeUpdated.isEmpty()) {
			Runnable action = new Runnable() {
				public void run() {
					Set<IProject> projectsToUpdate = new HashSet<IProject>();
					for (IFile file : toBeUpdated) {
						ModelQuerySetCatalog.getSingleton().scheduleUpdateWSFile(file);
						projectsToUpdate.add(file.getProject());
					}
					for (IProject project : projectsToUpdate) {
						ModelQuerySetCatalog.getSingleton().revalidateAll(project);
					}
				}
			};
			CatalogJob.getInstance().addAction(action);
		}

	}

	public void changed(final EObject eObject, final IFile file) {
		// Nothing to do
	}

	public void added(final EObject eObject, final IFile queryFile) {
		if (eObject instanceof ModelQuerySet) {
			ModelQuerySet modelQuerySet = (ModelQuerySet) eObject;
			for (ModelQuery query : modelQuerySet.getQueries()) {
				if (query instanceof JavaModelQuery) {
					JavaModelQuery javaModelQuery = (JavaModelQuery) query;
					String implementationClassName = javaModelQuery.getImplementationClassName();
					if (queryFile != null) {
						try {
							IProject project = queryFile.getProject();
							IJavaProject javaProject = JavaCore.create(project);
							IType type = javaProject.findType(javaModelQuery
									.getImplementationClassName());
							IPath cuPath = type.getCompilationUnit().getPath();
							IFile javaFile = project.getFile(cuPath);
							associate(queryFile, javaFile);
						} catch (JavaModelException e) {
							MoDiscoLogger.logError(e,
									"Failed to find the Java class associated to the query: " //$NON-NLS-1$
											+ implementationClassName, Activator.getDefault());
						}
					}
				}

			}
		}
	}

	private void associate(final IFile queryFile, final IFile javaFile) {
		this.javaFileToJavaQueryFileMap.put(javaFile, queryFile);
		List<IFile> javaFiles = this.querySetToJavaQueriesMap.get(queryFile);
		if (javaFiles == null) {
			javaFiles = new ArrayList<IFile>();
			this.querySetToJavaQueriesMap.put(queryFile, javaFiles);
		}
		javaFiles.add(javaFile);
	}

	public void removed(final IFile file) {
		List<IFile> javaFiles = this.querySetToJavaQueriesMap.get(file);
		this.javaFileToJavaQueryFileMap.remove(javaFiles);
	}

	public void nonValidFile(final IFile file, final Resource resource) {
		this.nonValidFiles.add(file);
	}
}