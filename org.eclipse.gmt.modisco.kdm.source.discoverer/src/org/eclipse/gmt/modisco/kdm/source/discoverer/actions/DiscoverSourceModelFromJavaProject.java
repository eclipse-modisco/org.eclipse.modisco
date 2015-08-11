/*
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.gmt.modisco.kdm.source.discoverer.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterDirectionKind;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterImpl;
import org.eclipse.gmt.modisco.kdm.source.discoverer.KDMSourceDiscoverer;
import org.eclipse.gmt.modisco.kdm.source.discoverer.Messages;
import org.eclipse.gmt.modisco.kdm.source.discoverer.plugin.Activator;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/**
 * @author Gabriel Barbier
 * @deprecated Use instead DiscoverSourceModelFromJavaElement or DiscoverSourceModelFromResource in
 *             plug-in org.eclipse.modisco.kdm.source.discoverer,
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=474727
 */
@Deprecated
public class DiscoverSourceModelFromJavaProject implements Discoverer {

	private final String targetExtension = "kdm"; //$NON-NLS-1$

	/**
	 * A parameter key for indicating to work without user interaction.
	 */
	public static final DiscoveryParameter PARAMETER_SILENT_MODE = new DiscoveryParameterImpl(
			"OPTION_SILENT_MODE", DiscoveryParameterDirectionKind.in, //$NON-NLS-1$
			Boolean.class, false);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.infra.discoverymanager.DiscovererInterface#applyTo
	 * (java.lang.Object)
	 */
	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		if (source instanceof IJavaProject) {
			result = true;
		} else if (source instanceof IProject) {
			IProject project = (IProject) source;
			try {
				if (project.hasNature(JavaCore.NATURE_ID)) {
					result = true;
				}
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.gmt.modisco.infra.discoverymanager.DiscovererInterface#
	 * discoverElement(java.lang.Object, org.eclipse.emf.common.util.URI)
	 */
	@Deprecated
	public Resource discoverElement(final Object source, final URI target) {
		Resource resource = null;
		// retrieval of Java project
		IJavaProject tempProject = null;
		if (source instanceof IJavaProject) {
			tempProject = (IJavaProject) source;
		} else if (source instanceof IProject) {
			IProject project = (IProject) source;
			try {
				if (project.hasNature(JavaCore.NATURE_ID)) {
					tempProject = JavaCore.create(project);
				} else {
					throw new IllegalArgumentException();
				}
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
				return null;
			}
		} else {
			throw new IllegalArgumentException();
		}
		final IJavaProject project = tempProject;

		// retrieval of target path
		URI kdmModelURI = null;
		if (target != null) {
			kdmModelURI = target;
		} else {
			IPath tempPath = project.getProject().getFullPath().addTrailingSeparator()
					.append(project.getElementName() + "_Source") //$NON-NLS-1$
					.addFileExtension(this.targetExtension);
			kdmModelURI = URI.createPlatformResourceURI(tempPath.toString(), true);
		}

		try {
			final KDMSourceDiscoverer disco = new KDMSourceDiscoverer();
			resource = disco.getKDMModelFromJavaProject(project);
			resource.setURI(kdmModelURI);
			resource.save(null);
		} catch (Exception e) {
			MoDiscoLogger.logWarning(e, "Error in discovery of container", Activator.getDefault()); //$NON-NLS-1$
		} finally {
			try {
				project.getCorrespondingResource().refreshLocal(1, null);
			} catch (Exception e1) {
				MoDiscoLogger.logError(e1, Activator.getDefault());
			}
		}

		if (!this.isSilent) {
			// access UI resources so that we can obtain the current eclipse
			// workbench activePage
			final URI kdmModelURIf = kdmModelURI;
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					try {
						IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
						IFile ifile = null;
						if (kdmModelURIf.isFile()) {
							ifile = root.getFileForLocation(new Path(kdmModelURIf.toFileString()));
						} else {
							ifile = root.getFile(new Path(kdmModelURIf.toPlatformString(true)));
						}

						if ((ifile != null) && ifile.exists()) {
							IWorkbenchPage page = PlatformUI.getWorkbench()
									.getActiveWorkbenchWindow().getActivePage();
							// programmatically opens the j2se5 model using the
							// default editor if one is present
							IDE.openEditor(page, ifile);
						}
					} catch (PartInitException e) {
						MoDiscoLogger.logError(e, Activator.getDefault());
					}
				}
			});
		}

		return resource;
	}

	@Override
	public String toString() {
		return Messages.DiscoverSourceModelFromJavaProject_4;
	}

	public DiscoverSourceModelFromJavaProject() {
		this.targetModel = new DiscoveryParameterImpl(
				"TargetModel", DiscoveryParameterDirectionKind.out, Resource.class, false); //$NON-NLS-1$
		this.discovererParameters.add(this.targetModel);
		this.targetUri = new DiscoveryParameterImpl(
				"TargetUri", DiscoveryParameterDirectionKind.in, URI.class, false); //$NON-NLS-1$
		this.discovererParameters.add(this.targetUri);
		this.discovererParameters.add(DiscoverSourceModelFromJavaProject.PARAMETER_SILENT_MODE);
	}

	private final DiscoveryParameterImpl targetModel;
	private final DiscoveryParameterImpl targetUri;
	private final List<DiscoveryParameter> discovererParameters = new ArrayList<DiscoveryParameter>();

	private boolean isSilent = false;

	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		URI targetUri2 = null;
		if (parameters.containsKey(this.targetUri)) {
			Object value = parameters.get(this.targetUri);
			if (value instanceof URI) {
				targetUri2 = (URI) value;
			}
		}

		// SILENT MODE
		if (parameters.containsKey(DiscoverSourceModelFromJavaProject.PARAMETER_SILENT_MODE)) {
			this.isSilent = Boolean.TRUE.equals(parameters
					.get(DiscoverSourceModelFromJavaProject.PARAMETER_SILENT_MODE));
		}

		Resource result = this.discoverElement(source, targetUri2);
		parameters.put(this.targetModel, result);
	}

	public List<DiscoveryParameter> getDiscovererParameters() {
		return Collections.unmodifiableList(this.discovererParameters);
	}
}
