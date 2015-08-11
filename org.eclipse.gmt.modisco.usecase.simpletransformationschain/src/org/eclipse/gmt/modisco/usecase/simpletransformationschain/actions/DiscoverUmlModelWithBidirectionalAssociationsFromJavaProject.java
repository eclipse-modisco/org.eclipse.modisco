<<<<<<< HEAD   (3a7127 Bug 474680 - [Deprecated] org.eclipse.gmt.modisco.usecase.si)
=======
/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/

package org.eclipse.gmt.modisco.usecase.simpletransformationschain.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.internal.logging.MoDiscoLogHandler;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterDirectionKind;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterImpl;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.KnowledgeDiscoveryInterface;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.Messages;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ModelplexKnowledgeDiscoveryFramework;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ModelplexKnowledgeDiscoveryFrameworkPlugin;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.m2m.atl.common.ATLLogger;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *  cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474680
 */
@Deprecated
public class DiscoverUmlModelWithBidirectionalAssociationsFromJavaProject implements Discoverer {

	private final String targetExtension = "uml"; //$NON-NLS-1$

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.infra.discoverymanager.DiscovererInterface#applyTo
	 * (java.lang.Object)
	 */
	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		if (source instanceof IJavaProject) {
			result = ((IJavaProject) source).getProject().isAccessible();
		} else if (source instanceof IProject) {
			IProject project = (IProject) source;
			try {
				if ((project.isAccessible()) && (project.hasNature(JavaCore.NATURE_ID))) {
					result = true;
				}
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
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
	public Resource discoverElement(final Object source, final URI target) {
		Resource resource = null;
		final Logger logger = Logger.getLogger(ATLLogger.LOGGER_ID);
		// retrieval of Java project
		IJavaProject tempProject = null;
		if (source instanceof IJavaProject) {
			tempProject = (IJavaProject) source;
		} else if (source instanceof IProject) {
			IProject project = (IProject) source;
			try {
				if (project.hasNature(JavaCore.NATURE_ID)) {
					tempProject = JavaCore.create(project);
				}
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
			}
		}
		final IJavaProject project = tempProject;

		// retrieval of target path
		IPath tempPath = project.getProject().getLocation().addTrailingSeparator()
				.append(project.getElementName()).addFileExtension(this.targetExtension);
		if (target != null) {
			if (target.isRelative()) {
				tempPath = ResourcesPlugin.getWorkspace().getRoot().getFullPath()
						.append(target.path());
			} else {
				tempPath = new Path(target.toFileString());
			}
		}

		final IPath path = tempPath;

		final MoDiscoLogHandler logHandler = new MoDiscoLogHandler(path.toString() + ".log"); //$NON-NLS-1$
		logger.addHandler(logHandler);
		try {
			final URI outputURI = URI.createFileURI(path.toString());
			final KnowledgeDiscoveryInterface discoverer = new ModelplexKnowledgeDiscoveryFramework();
			discoverer.getUML2ModelFromJavaSource(project, outputURI);

			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IFile ifile = root.getFileForLocation(path);
			if ((ifile != null) && ifile.exists()) {
				discoverer.detectBidirectionalAssociationsInUmlModel(ifile, null);
			}
		} catch (Exception e) {
			logger.log(Level.WARNING, "Error in discovery of java project", e); //$NON-NLS-1$
		} finally {
			logger.removeHandler(logHandler);
			logHandler.close();
			try {
				project.getCorrespondingResource().refreshLocal(1, null);
			} catch (Exception e1) {
				// give up
			}
		}
		// access UI resources so that we can obtain the current eclipse
		// workbench activePage
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				try {
					IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
					IFile ifile = root.getFileForLocation(path);
					if ((ifile != null) && ifile.exists()) {
						IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
								.getActivePage();
						// programmatically opens the j2se5 model using the
						// default editor if one is present
						IDE.openEditor(page, ifile);
					}
				} catch (PartInitException e) {
					MoDiscoLogger.logError(e,
							ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
				}
			}
		});

		return resource;
	}

	@Override
	public String toString() {
		return Messages.DiscoverUmlModelWithBidirectionalAssociationsFromJavaProject_3;
	}

	public DiscoverUmlModelWithBidirectionalAssociationsFromJavaProject() {
		this.targetModel = new DiscoveryParameterImpl("TargetModel", //$NON-NLS-1$
				DiscoveryParameterDirectionKind.out, Resource.class, false);
		this.discovererParameters.add(this.targetModel);
		this.targetUri = new DiscoveryParameterImpl("TargetUri", //$NON-NLS-1$
				DiscoveryParameterDirectionKind.in, URI.class, false);
		this.discovererParameters.add(this.targetUri);
	}

	private final DiscoveryParameterImpl targetModel;
	private final DiscoveryParameterImpl targetUri;
	private final List<DiscoveryParameter> discovererParameters = new ArrayList<DiscoveryParameter>();

	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		URI targetUri = null;
		if (parameters.containsKey(this.targetUri)) {
			Object value = parameters.get(this.targetUri);
			if (value instanceof URI) {
				targetUri = (URI) value;
			}
		}
		Resource result = this.discoverElement(source, targetUri);
		parameters.put(this.targetModel, result);
	}

	public List<DiscoveryParameter> getDiscovererParameters() {
		return Collections.unmodifiableList(this.discovererParameters);
	}
}
>>>>>>> BRANCH (6b51ed Merge remote-tracking branch 'origin/maintenance-0.13')
