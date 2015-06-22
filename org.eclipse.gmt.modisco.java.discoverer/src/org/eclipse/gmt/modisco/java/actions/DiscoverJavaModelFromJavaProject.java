/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sebastien Minguet (Mia-Software) - initial API and implementation
 *    Frederic Madiot (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Erwan Breton (Sodifrance) - initial API and implementation
 *    Romain Dervaux (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.gmt.modisco.java.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterDirectionKind;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterImpl;
import org.eclipse.gmt.modisco.java.IModelReader;
import org.eclipse.gmt.modisco.java.JavaActivator;
import org.eclipse.gmt.modisco.java.Messages;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.actions.ui.JavaWizard;
import org.eclipse.gmt.modisco.java.io.java.JavaReader;
import org.eclipse.gmt.modisco.java.io.java.binding.BindingManager;
import org.eclipse.gmt.modisco.java.io.library.LibraryReader;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

/**
 * Action to discover a Java model from a Java project and optionally its
 * libraries.
 * @deprecated the whole plug-in is replaced by
 *             "org.eclipse.modisco.java.discoverer" (without the "gmt" part),
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public class DiscoverJavaModelFromJavaProject extends DefaultDiscoverer {

	private static List<DiscoveryParameter> parametersKeys = null;

	/**
	 * A parameter key. @see DiscoveryParametersBean
	 */
	public static final DiscoveryParameter PARAMETERS_BEAN = new DiscoveryParameterImpl(
			"PARAMETERS_BEAN", DiscoveryParameterDirectionKind.in, //$NON-NLS-1$
			DiscoveryParameter.class, false);

	private boolean isCancelled = false;
	private static Map<String, DiscoveryParametersBean> projectToDiscoParametersCache = new HashMap<String, DiscoveryParametersBean>();
	private DiscoveryParametersBean currentProjectParameters = null;
	private boolean logJavaAnalysisWarnings = false;

	public DiscoveryParametersBean getCurrentProjectParameters() {
		return this.currentProjectParameters;
	}

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
				MoDiscoLogger.logError(e, JavaActivator.getDefault());
			}
		}
		return result;
	}

	/**
	 * Discovers a Java model.
	 * 
	 * @param source
	 *            a {@link IJavaProject} instance
	 * @param parameters
	 *            possible keys are :
	 *            <ul>
	 *            <li>{@link DefaultDiscoverer#PARAMETER_SILENT_MODE}
	 *            <li>{@link DiscoverJavaModelFromJavaProject#PARAMETERS_BEAN}
	 *            <li>{@link DefaultDiscoverer#PARAMETER_TARGET_RESOURCE}
	 *            <li>{@link DefaultDiscoverer#PARAMETER_OVERWRITE_RESULT}
	 *            <li>
	 *            {@link DefaultDiscoverer#PARAMETER_LOG_JAVA_ANALYSIS_WARNINGS)
	 *            </ul>
	 */
	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		boolean isSilent = false;
		boolean browseResult = true;
		boolean overwriteExistingResult = true;

		if (parameters != null) {
			isSilent = Boolean.TRUE.equals(parameters.get(DefaultDiscoverer.PARAMETER_SILENT_MODE));
			browseResult = !(Boolean.FALSE.equals(parameters
					.get(DefaultDiscoverer.PARAMETER_BROWSE_RESULT)));
			if (parameters.containsKey(DefaultDiscoverer.PARAMETER_OVERWRITE_RESULT)) {
				overwriteExistingResult = (Boolean) parameters
						.get(DefaultDiscoverer.PARAMETER_OVERWRITE_RESULT);
			}
			this.logJavaAnalysisWarnings = Boolean.TRUE.equals(parameters
					.get(DefaultDiscoverer.PARAMETER_LOG_JAVA_ANALYSIS_WARNINGS));
		}
		setResourceResult(null);

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
				MoDiscoLogger.logError(e, JavaActivator.getDefault());
			}
		}
		final IJavaProject project = tempProject;

		if (project == null) {
			throw new IllegalArgumentException("Not a Java project"); //$NON-NLS-1$
		}

		final IPath path = project.getProject().getFullPath().addTrailingSeparator()
				.append(project.getElementName())
				.addFileExtension(DefaultDiscoverer.JAVA_FILE_EXTENSION);

		final List<Object> discoverableElements = retrieveDiscoveryParameters(parameters, project);

		final IFile ifile = ResourcesPlugin.getWorkspace().getRoot().getFile(path);

		Job job = null;
		if (overwriteExistingResult || (!ifile.exists())) {
			// discovering
			if (!isSilent) {
				// open the wizard (synchronous execution to block the thread)
				PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
					public void run() {
						Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
						JavaWizard wizard = new JavaWizard(project, discoverableElements,
								DiscoverJavaModelFromJavaProject.this.getCurrentProjectParameters());
						WizardDialog dialog = new WizardDialog(shell, wizard);
						int res = dialog.open();
						if (res == Window.CANCEL) {
							DiscoverJavaModelFromJavaProject.this.setCancelled(true);
						}
					}
				});

				if (isCancelled()) {
					resetDiscoverer();
					return;
				}
			}
			job = initializeDiscoveryJob(path, project);
		} else {
			// browsing only
			job = initializeBrowsingJob(ifile);
		}
		if (!isSilent && browseResult) {
			scheduleEditorOpening(ResourcesPlugin.getWorkspace().getRoot().getFile(path), job,
					parameters);
		}

		job.schedule();
		try {
			job.join();
		} catch (InterruptedException e) {
			IStatus status = new Status(IStatus.ERROR, JavaActivator.PLUGIN_ID, e.getMessage(), e);
			JavaActivator.getDefault().getLog().log(status);
		}

		if (parameters != null) {
			parameters.put(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE, getResourceResult());
		}
	}

	private List<Object> retrieveDiscoveryParameters(
			final Map<DiscoveryParameter, Object> parameters, final IJavaProject project) {
		// retrieve required projects and libraries
		Set<IJavaProject> projects = null;
		Set<IPackageFragmentRoot> libraries = null;

		try {
			projects = computeRequiredProjects(project);
			libraries = computeRequiredLibraries(projects);
		} catch (JavaModelException e) {
			MoDiscoLogger.logError(e, JavaActivator.getDefault());
		}

		final List<Object> discoverableElements = new ArrayList<Object>();
		discoverableElements.addAll(projects);
		discoverableElements.addAll(libraries);

		if (parameters != null
				&& parameters.get(DiscoverJavaModelFromJavaProject.PARAMETERS_BEAN) != null) {
			this.currentProjectParameters = (DiscoveryParametersBean) parameters
					.get(DiscoverJavaModelFromJavaProject.PARAMETERS_BEAN);
			// make sure the source java project is selected
			this.currentProjectParameters.addElementToDiscover(project);
		} else { // retrieve last user choices
			this.currentProjectParameters = getParameters(project);

			// some project/library might have been removed from project
			// classpath
			List<Object> elementsToRemove = new ArrayList<Object>();
			for (Object oldParameter : this.currentProjectParameters.getElementsToDiscover()) {
				if (!oldParameter.equals(project) && !discoverableElements.contains(oldParameter)) {
					elementsToRemove.add(oldParameter);

				}
			}
			for (Object oldParameterToRemove : elementsToRemove) {
				this.currentProjectParameters.removeElementToDiscover(oldParameterToRemove);
			}
		}

		return discoverableElements;
	}

	@Override
	public String toString() {
		return Messages.DiscoverJavaModelFromJavaProject_title;
	}

	protected Set<IJavaProject> computeRequiredProjects(final IJavaProject project)
			throws JavaModelException {
		Set<IJavaProject> projects = new LinkedHashSet<IJavaProject>();
		// we keep package fragments which are binaries
		projects.add(project);
		for (String projectName : project.getRequiredProjectNames()) {
			IJavaProject requiredProject = project.getJavaModel().getJavaProject(projectName);
			if (requiredProject.getProject().isAccessible()) {
				projects.add(requiredProject);
			}
		}
		return projects;
	}

	protected Set<IPackageFragmentRoot> computeRequiredLibraries(
			final Collection<IJavaProject> projects) throws JavaModelException {
		Set<IPackageFragmentRoot> libraries = new LinkedHashSet<IPackageFragmentRoot>();
		// we keep package fragments which are binaries
		for (IJavaProject project : projects) {
			for (IPackageFragmentRoot lib : project.getPackageFragmentRoots()) {
				if (lib.exists() && lib.getKind() == IPackageFragmentRoot.K_BINARY) {
					libraries.add(lib);
				}
			}
		}
		return libraries;
	}

	@SuppressWarnings("deprecation")
	protected Map<IModelReader, Object> getReaders() {
		Map<IModelReader, Object> readers = new HashMap<IModelReader, Object>();

		for (Object element : this.currentProjectParameters.getElementsToDiscover()) {
			Map<String, Object> elementOptions = this.currentProjectParameters
					.getDiscoveryOptions(element);
			if (element instanceof IJavaProject) {
				JavaReader newJavaReader = new JavaReader(getEFactory(), elementOptions,
						this.currentProjectParameters.isIncrementalMode(),
						this.currentProjectParameters.isFullJavaLevel(),
						this.currentProjectParameters.getExcludedElements(),
						this.currentProjectParameters.getExcludedElementsRegEx(),
						this.currentProjectParameters.getIncludedElementsRegEx(), this,
						this.logJavaAnalysisWarnings);
				readers.put(newJavaReader, element);
			} else if (element instanceof IPackageFragmentRoot) {
				readers.put(new LibraryReader(getEFactory(), elementOptions), element);
			}
		}
		return readers;
	}

	/**
	 * Reset the discoverer, as it can be used multiple times.
	 */
	protected void resetDiscoverer() {
		setCancelled(false);
	}

	protected BindingManager getBindingManager() {
		return new BindingManager(getEFactory());
	}

	protected DiscoveryParametersBean getParameters(final IJavaProject project) {
		String projectPath = project.getProject().getLocation().toString();
		DiscoveryParametersBean parameters = DiscoverJavaModelFromJavaProject.projectToDiscoParametersCache
				.get(projectPath);
		if (parameters == null) {
			parameters = new DiscoveryParametersBean();
			// the selected java project must be discovered
			parameters.addElementToDiscover(project);
			DiscoverJavaModelFromJavaProject.projectToDiscoParametersCache.put(projectPath,
					parameters);
		}
		return parameters;
	}

	public List<DiscoveryParameter> getDiscovererParameters() {
		if (DiscoverJavaModelFromJavaProject.parametersKeys == null) {
			DiscoverJavaModelFromJavaProject.parametersKeys = new ArrayList<DiscoveryParameter>();
			DiscoverJavaModelFromJavaProject.parametersKeys
					.add(DefaultDiscoverer.PARAMETER_SILENT_MODE);
			DiscoverJavaModelFromJavaProject.parametersKeys
					.add(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
			DiscoverJavaModelFromJavaProject.parametersKeys
					.add(DiscoverJavaModelFromJavaProject.PARAMETERS_BEAN);
			DiscoverJavaModelFromJavaProject.parametersKeys
					.add(DefaultDiscoverer.PARAMETER_BROWSE_RESULT);
			DiscoverJavaModelFromJavaProject.parametersKeys
					.add(DefaultDiscoverer.PARAMETER_OVERWRITE_RESULT);
		}
		return DiscoverJavaModelFromJavaProject.parametersKeys;
	}

	public void setCancelled(final boolean cancel) {
		this.isCancelled = cancel;
	}

	public boolean isCancelled() {
		return this.isCancelled;
	}

	private final Job initializeDiscoveryJob(final IPath path, final IJavaProject project) {
		Job job = new Job(Messages.DiscoverJavaModelFromJavaProject_jobLabel) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				IStatus result = null;
				monitor.beginTask("", IProgressMonitor.UNKNOWN); //$NON-NLS-1$
				try {
					URI sourceURI = URI.createPlatformResourceURI(path.toString(), true);
					Resource resource = getResource("", project); //$NON-NLS-1$

					Model model = getEFactory().createModel();
					BindingManager globalBindings = getBindingManager();
					resource.getContents().add(model);

					IModelReader reader = null;
					for (Entry<IModelReader, Object> element : getReaders().entrySet()) {
						reader = element.getKey();
						Object source1 = element.getValue();
						reader.readModel(source1, model, globalBindings, monitor);
						if (monitor.isCanceled()) {
							result = Status.CANCEL_STATUS;
							return result;
						}
					}
					if (reader != null) {
						reader.terminate(monitor);
					}
					model.setName(project.getElementName());
					// even if the serialisation throws an error, for instance,
					// if an element is not contained in a resource,
					// the resource is available for users.
					DiscoverJavaModelFromJavaProject.this.setResourceResult(resource);

					saveResource(sourceURI, path, resource, monitor);

					if (monitor.isCanceled()) {
						result = Status.CANCEL_STATUS;
						return result;
					}
					result = Status.OK_STATUS;
				} catch (Exception e) {
					result = Status.CANCEL_STATUS;
					IStatus status = new Status(IStatus.ERROR, JavaActivator.PLUGIN_ID,
							"Unknown error.", e); //$NON-NLS-1$
					JavaActivator.getDefault().getLog().log(status);
				} finally {
					monitor.done();
					resetDiscoverer();
					try {
						// refresh the folder
						project.getCorrespondingResource().refreshLocal(IResource.DEPTH_ONE,
								new NullProgressMonitor());
						if (monitor.isCanceled()) {
							// if monitor is canceled, delete the model file
							IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
							IFile ifile = root.getFileForLocation(path);
							if (ifile.exists()) {
								ifile.delete(true, new NullProgressMonitor());
							}
						}
					} catch (Exception e1) {
						IStatus status = new Status(IStatus.ERROR, JavaActivator.PLUGIN_ID,
								e1.getMessage(), e1);
						JavaActivator.getDefault().getLog().log(status);
					}
				}
				return result;
			}
		};

		return job;
	}

	private final Job initializeBrowsingJob(final IFile ifile) {
		Job job = new Job(Messages.DiscoverJavaModelFromJavaProject_browseJavaModel) {

			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				IStatus result = Status.CANCEL_STATUS;
				URI javaModelUri = URI.createPlatformResourceURI(ifile.getFullPath().toString(),
						true);
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource resource = resourceSet.getResource(javaModelUri, true);
				setResourceResult(resource);
				result = Status.OK_STATUS;
				return result;
			}
		};

		return job;
	}
}
