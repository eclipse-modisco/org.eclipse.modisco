/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Romain DERVAUX (Mia-Software) - initial API and implementation
 *    Fabien GIQUEL (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.java.actions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.IOWrappedException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterDirectionKind;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterImpl;
import org.eclipse.gmt.modisco.java.JavaActivator;
import org.eclipse.gmt.modisco.java.Messages;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.kdm.source.extension.discovery.AbstractRegionDiscoverer;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

/**
 * A default implementation of a discoverer suitable for subclassing.
 * @deprecated the whole plug-in is replaced by
 *             "org.eclipse.modisco.java.discoverer" (without the "gmt" part),
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public abstract class DefaultDiscoverer extends AbstractRegionDiscoverer {

	private static final int FLUSH_LIMIT = 10000;
	public static final String JAVA_FILE_EXTENSION = "javaxmi"; //$NON-NLS-1$
	private Resource resourceResult = null;

	public Resource getResourceResult() {
		return this.resourceResult;
	}

	public void setResourceResult(final Resource resourceResult) {
		this.resourceResult = resourceResult;
	}

	/**
	 * A parameter key for indicating to work without user interaction.
	 */
	public static final DiscoveryParameter PARAMETER_SILENT_MODE = new DiscoveryParameterImpl(
			"OPTION_SILENT_MODE", DiscoveryParameterDirectionKind.in, //$NON-NLS-1$
			Boolean.class, false);

	/**
	 * A parameter key for indicating a target Resource instance.
	 */
	public static final DiscoveryParameter PARAMETER_TARGET_RESOURCE = new DiscoveryParameterImpl(
			"TARGET_RESOURCE", DiscoveryParameterDirectionKind.out, //$NON-NLS-1$
			Resource.class, false);

	/**
	 * A parameter key for indicating to open the result model in a editor (no
	 * effect if parameter PARAMETER_SILENT_MODE is set to false)
	 */
	public static final DiscoveryParameter PARAMETER_BROWSE_RESULT = new DiscoveryParameterImpl(
			"PARAMETER_BROWSE_RESULT", DiscoveryParameterDirectionKind.in, //$NON-NLS-1$
			Boolean.class, false);

	/**
	 * A parameter key for indicating to overwrite the output result file if it
	 * exists. This parameter is optional and the default behavior is to
	 * overwrite any existing file.
	 */
	public static final DiscoveryParameter PARAMETER_OVERWRITE_RESULT = new DiscoveryParameterImpl(
			"PARAMETER_OVERWRITE_RESULT", DiscoveryParameterDirectionKind.in, //$NON-NLS-1$
			Boolean.class, false);

	/**
	 * A parameter key for indicating to log warnings from java analysis.
	 * 
	 * For instance, sometimes java bindings (reference to a Java type, method,
	 * ...) cannot be completed. Such java binding problems occurs typically
	 * when there are some missing libraries in Java project classpath. Such
	 * java bindings problems will result in some missing informations in
	 * resulting Java model (occurences of
	 * {@link org.eclipse.gmt.modisco.java.UnresolvedItem})
	 */
	public static final DiscoveryParameter PARAMETER_LOG_JAVA_ANALYSIS_WARNINGS = new DiscoveryParameterImpl(
			"PARAMETER_LOG_JAVA_ANALYSIS_WARNINGS", DiscoveryParameterDirectionKind.in, //$NON-NLS-1$
			Boolean.class, false);

	public Resource getResource(final String resourceName, final IJavaProject javaProject) {
		ResourceSet resourceSet = new ResourceSetImpl();
		IPath javaModelPath = javaProject.getProject().getFullPath().addTrailingSeparator()
				.append(javaProject.getProject().getName())
				.addFileExtension(DefaultDiscoverer.JAVA_FILE_EXTENSION);
		URI javaModelURI = URI.createPlatformResourceURI(javaModelPath.toString(), true);

		Resource resource = resourceSet.createResource(javaModelURI);
		return resource;
	}

	/**
	 * Discovers a Java model and open MoDisco editor or default editor.
	 * 
	 * @param source
	 *            a {@link IJavaProject} instance
	 * @param target
	 *            should be null here.
	 */
	public Resource discoverElement(final Object source, final URI target) {
		Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
		parameters.put(DefaultDiscoverer.PARAMETER_SILENT_MODE, false);
		discoverElement(source, parameters);
		return (Resource) parameters.get(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
	}

	public void saveResource(final URI target, final IPath path, final Resource resource,
			final IProgressMonitor monitor) throws IOException {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_FLUSH_THRESHOLD, DefaultDiscoverer.FLUSH_LIMIT);
		options.put(XMLResource.OPTION_USE_FILE_BUFFER, true);
		if (target != null) {
			resource.setURI(target);
		} else {
			URI uri = URI.createPlatformResourceURI(path.toString(), true);
			resource.setURI(uri);
		}
		monitor.subTask(Messages.DefaultDiscoverer_savingTaskLabel);
		try {
			resource.save(options);
		} catch (IOWrappedException e) { // TODO here is a temporary fix
											// for bugzilla 323247
			if (e.getCause() != null && (e.getCause() instanceof CoreException)) {
				MoDiscoLogger
						.logWarning(
								e,
								"XMI serialization has failed... Trying again without File Buffer. File is " + resource.getURI(), //$NON-NLS-1$
								JavaActivator.getDefault());
				options.clear();
				resource.save(options);
				MoDiscoLogger.logWarning("XMI serialization is done for " + resource.getURI(), //$NON-NLS-1$
						JavaActivator.getDefault());
			} else {
				throw e;
			}
		}
	}

	public JavaFactory getEFactory() {
		return org.eclipse.gmt.modisco.java.emf.JavaFactory.eINSTANCE;
	}

	protected void openEditor(final IFile source, final Map<DiscoveryParameter, Object> parameters) {
		boolean isSilent = false;
		boolean browseResult = true;

		if (parameters != null) {
			isSilent = Boolean.TRUE.equals(parameters.get(DefaultDiscoverer.PARAMETER_SILENT_MODE));
			browseResult = !(Boolean.FALSE.equals(parameters
					.get(DefaultDiscoverer.PARAMETER_BROWSE_RESULT)));
		}
		if (!isSilent && browseResult) {
			this.openEditor(source);
		}

	}

	protected final void openEditor(final IFile source) {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				try {

					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getActivePage();

					// We must close precedent editor opened
					// on javaxmi file
					IEditorPart existingEditorOnResource = page.findEditor(new FileEditorInput(
							source));
					if (existingEditorOnResource != null) {
						page.closeEditor(existingEditorOnResource, true);
					}

					IEditorDescriptor editDesc = PlatformUI.getWorkbench().getEditorRegistry()
							.findEditor("org.eclipse.gmt.modisco.infra.browser.editorID"); //$NON-NLS-1$

					if (editDesc != null) {
						IDE.openEditor(page, source, editDesc.getId());
					} else {
						IDE.openEditor(page, source);
					}

				} catch (PartInitException e) {
					IStatus status = new Status(IStatus.ERROR, JavaActivator.PLUGIN_ID, e
							.getMessage(), e);
					JavaActivator.getDefault().getLog().log(status);
				}
			}
		});
	}

	protected void scheduleEditorOpening(final IFile source, final Job job,
			final Map<DiscoveryParameter, Object> parameters) {
		boolean isSilent = false;
		boolean browseResult = true;

		if (parameters != null) {
			isSilent = Boolean.TRUE.equals(parameters.get(DefaultDiscoverer.PARAMETER_SILENT_MODE));
			browseResult = !(Boolean.FALSE.equals(parameters
					.get(DefaultDiscoverer.PARAMETER_BROWSE_RESULT)));
		}

		if (!isSilent && browseResult) {
			job.addJobChangeListener(new JobChangeAdapter() {
				@Override
				public void done(final IJobChangeEvent event) {
					if (event.getJob().getResult().isOK()) {
						DefaultDiscoverer.this.openEditor(source);
					}
				}
			});
		}
	}

}
