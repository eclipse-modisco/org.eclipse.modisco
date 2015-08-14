/*********************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	  Nicolas Guyomar (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - deprecating (new discovery framework)
 *********************************************************************************/
package org.eclipse.modisco.jee.actions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.modisco.jee.JEEActivator;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

/**
 * Deployment descriptor discoverers use for now single file discovery, which could be extended for
 * discovering packages, projects ...
 * 
 * The proposed class facilitates the creation of new Deployement Descriptor discoverer on a
 * container.
 * 
 * @deprecated replaced by {@link AbstractProjectDeploymentDescriptorDiscoverer}, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=474883
 * 
 */
@Deprecated
public abstract class ProjectDeploymentDescriptorDiscoverer implements Discoverer {
	public static final int FLUSH_LIMIT = 10000;
	private final ArrayList<Resource> listOfResource = new ArrayList<Resource>();

	private static List<DiscoveryParameter> parametersKeys = null;
	private static final String XMI_EXTENSION = "xmi"; //$NON-NLS-1$

	public abstract DeploymentDescriptorDiscoverer getSingleFileDiscoverer();

	public abstract Factory getDiscovererFactory();

	public boolean isApplicableTo(final Object source) {
		if (source instanceof IFolder) {
			return true;
		} else if (source instanceof IPackageFragment) {
			return true;
		} else if (source instanceof IJavaProject) {
			return ((IJavaProject) source).getProject().isAccessible();
		} else if (source instanceof IProject) {
			IProject project = (IProject) source;
			if (project.isAccessible()) {
				return true;
			}
		}
		return false;
	}

	public void listXmlFiles(final String path, final ArrayList<File> listPath) {
		File projectFile = new File(path);
		File[] list = projectFile.listFiles();
		for (File element : list) {
			if (element.isDirectory()) {
				listXmlFiles(element.getPath(), listPath);
			} else {
				if (element.getName().contains(".")) { //$NON-NLS-1$
					if (element.getName()
							.substring(element.getName().lastIndexOf(".")).equalsIgnoreCase(".xml")) { //$NON-NLS-1$ //$NON-NLS-2$						
						listPath.add(element);
					}
				}
			}
		}
	}

	public static IProject getSourceProject(final Object source) {
		IProject tempProject = null;
		if (source instanceof IProject) {
			tempProject = (IProject) source;
		} else if (source instanceof IJavaProject) {
			tempProject = ((IJavaProject) source).getProject();
		} else if (source instanceof IFolder) {
			tempProject = ((IFolder) source).getProject();
		} else if (source instanceof IPackageFragment) {
			tempProject = ((IPackageFragment) source).getResource().getProject();
		}
		return tempProject;
	}

	public static String getSourcePath(final Object source) {
		String path = null;
		if (source instanceof IProject) {
			path = ((IProject) source).getLocation().toOSString();
		} else if (source instanceof IJavaProject) {
			path = ((IJavaProject) source).getPath().toOSString();
		} else if (source instanceof IFolder) {
			path = ((IFolder) source).getLocation().toOSString();
		} else if (source instanceof IPackageFragment) {
			path = ((IPackageFragment) source).getPath().toOSString();
		}
		return path;
	}

	public static Resource createResource(final String resourceName) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI(resourceName));
		return resource;
	}

	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		boolean isSilent = false;
		parameters.put(DeploymentDescriptorDiscoverer.PARAMETER_SILENT_MODE, new Boolean(true));
		parameters.put(DeploymentDescriptorDiscoverer.PARAMETER_SERIALIZE_XMI, new Boolean(false));
		final IProject project = getSourceProject(source);
		final IPath path = project.getProject().getLocation().addTrailingSeparator()
				.append(project.getName())
				.addFileExtension(ProjectDeploymentDescriptorDiscoverer.XMI_EXTENSION);
		// discovering
		Job job = new Job(Messages.ProjectDeploymentDescriptorDiscoverer_1) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				IStatus result = null;
				monitor.beginTask("", IProgressMonitor.UNKNOWN); //$NON-NLS-1$
				try {
					Resource resource = createResource("platform:/resource/" //$NON-NLS-1$
							+ project.getProject().getName()
							+ "/" //$NON-NLS-1$
							+ project.getProject().getName()
							+ "." + ProjectDeploymentDescriptorDiscoverer.XMI_EXTENSION); //$NON-NLS-1$
					ArrayList<File> listFiles = new ArrayList<File>();
					// List all the XML files contained in the source
					listXmlFiles(getSourcePath(source), listFiles);
					ArrayList<Resource> resourceList = new ArrayList<Resource>();
					for (File file : listFiles) {
						getSingleFileDiscoverer().discoverElement(file, parameters);
						if (parameters
								.get(DeploymentDescriptorDiscoverer.PARAMETER_TARGET_RESOURCE) != null) {
							resourceList.add((Resource) parameters
									.get(DeploymentDescriptorDiscoverer.PARAMETER_TARGET_RESOURCE));
						}
					}
					for (Resource r : resourceList) {
						resource.getContents().addAll(r.getContents());
					}
					saveResource(resource, monitor);
					if (monitor.isCanceled()) {
						return Status.CANCEL_STATUS;
					}
					result = Status.OK_STATUS;
				} catch (Exception e) {
					MoDiscoLogger.logError(e.getMessage(), JEEActivator.getDefault());
				} finally {
					monitor.done();
					try {
						project.refreshLocal(IResource.DEPTH_ONE, new NullProgressMonitor());
						if (monitor.isCanceled()) {
							IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
							IFile ifile = root.getFileForLocation(path);
							if (ifile.exists()) {
								ifile.delete(true, new NullProgressMonitor());
							}
						}
					} catch (Exception e1) {
						MoDiscoLogger.logError(e1.getMessage(), JEEActivator.getDefault());
					}
				}
				return result;
			}
		};
		if (!isSilent) {
			parameters
					.put(DeploymentDescriptorDiscoverer.PARAMETER_SILENT_MODE, new Boolean(false));
			scheduleEditorOpening(
					ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(path), job,
					parameters);
		}
		job.schedule();
		try {
			job.join();
		} catch (InterruptedException e) {
			MoDiscoLogger.logError(e.getMessage(), JEEActivator.getDefault());
		}
	}

	@SuppressWarnings("boxing")
	public static void saveResource(final Resource resource, final IProgressMonitor monitor)
			throws IOException {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_FLUSH_THRESHOLD,
				ProjectDeploymentDescriptorDiscoverer.FLUSH_LIMIT);
		options.put(XMLResource.OPTION_USE_FILE_BUFFER, new Boolean(true));
		monitor.subTask(Messages.ProjectDeploymentDescriptorDiscoverer_2);
		resource.save(options);
	}

	public List<DiscoveryParameter> getDiscovererParameters() {
		if (ProjectDeploymentDescriptorDiscoverer.parametersKeys == null) {
			ProjectDeploymentDescriptorDiscoverer.parametersKeys = new ArrayList<DiscoveryParameter>();
			ProjectDeploymentDescriptorDiscoverer.parametersKeys
					.add(DeploymentDescriptorDiscoverer.PARAMETER_SILENT_MODE);
			ProjectDeploymentDescriptorDiscoverer.parametersKeys
					.add(DeploymentDescriptorDiscoverer.PARAMETER_TARGET_RESOURCE);
			ProjectDeploymentDescriptorDiscoverer.parametersKeys
					.add(DeploymentDescriptorDiscoverer.PARAMETER_SERIALIZE_XMI);
		}
		return ProjectDeploymentDescriptorDiscoverer.parametersKeys;
	}

	protected static final void openEditor(final IFile source) {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				try {
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getActivePage();
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
					MoDiscoLogger.logError(e.getMessage(), JEEActivator.getDefault());
				}
			}
		});
	}

	protected static void scheduleEditorOpening(final IFile source, final Job job,
			final Map<DiscoveryParameter, Object> parameters) {
		boolean isSilent = false;
		if (parameters != null) {
			isSilent = Boolean.TRUE.equals(parameters
					.get(DeploymentDescriptorDiscoverer.PARAMETER_SILENT_MODE));
		}
		if (!isSilent) {
			job.addJobChangeListener(new JobChangeAdapter() {
				@Override
				public void done(final IJobChangeEvent event) {
					if (event.getJob().getResult().isOK()) {
						openEditor(source);
					}
				}
			});
		}
	}

	public Resource discoverElement(final Object source, final URI target) {
		Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
		parameters.put(DeploymentDescriptorDiscoverer.PARAMETER_SILENT_MODE, new Boolean(true));
		parameters.put(DeploymentDescriptorDiscoverer.PARAMETER_SERIALIZE_XMI, new Boolean(false));
		discoverElement(source, parameters);
		return (Resource) parameters.get(DeploymentDescriptorDiscoverer.PARAMETER_TARGET_RESOURCE);
	}

	protected ArrayList<Resource> getListOfResource() {
		return this.listOfResource;
	}
}