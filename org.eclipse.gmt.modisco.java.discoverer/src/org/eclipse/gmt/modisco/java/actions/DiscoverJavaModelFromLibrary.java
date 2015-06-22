/*
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Romain Dervaux (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.gmt.modisco.java.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.IModelReader;
import org.eclipse.gmt.modisco.java.JavaActivator;
import org.eclipse.gmt.modisco.java.Messages;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.io.library.LibraryReader;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;

/**
 * Action to discover a Java model from a library of a Java project.
 * 
 * @see IPackageFragmentRoot
 * @deprecated the whole plug-in is replaced by
 *             "org.eclipse.modisco.java.discoverer" (without the "gmt" part),
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public class DiscoverJavaModelFromLibrary extends DefaultDiscoverer {

	private static List<DiscoveryParameter> parametersKeys = null;

	/**
	 * @see Discoverer#isApplicableTo
	 */
	public final boolean isApplicableTo(final Object source) {
		boolean result = false;
		try {
			if (source instanceof IPackageFragmentRoot
					&& ((IPackageFragmentRoot) source).getKind() == IPackageFragmentRoot.K_BINARY) {
				result = true;
			}
		} catch (JavaModelException e) {
			// nothing
			assert (true); // dummy code for "EmpyBlock" rule
		}

		return result;
	}

	/**
	 * Discovers a Java model.
	 * 
	 * @param source
	 *            a {@link IJavaProject} instance
	 * @param parameters
	 *            <ul>
	 *            <li>SILENT_MODE : IN parameter; if not set or set to
	 *            <code>false</code>, the discovered model will be opened in an
	 *            editor.
	 *            <li>TARGET_RESOURCE : OUT parameter; the discovered model is
	 *            stored with this key.
	 *            </ul>
	 */
	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		setResourceResult(null);

		final IPackageFragmentRoot lib = (IPackageFragmentRoot) source;
		final IJavaProject project = lib.getJavaProject();
		final IPath path = project.getProject().getFullPath().addTrailingSeparator()
				.append(lib.getElementName()).addFileExtension("javaxmi"); //$NON-NLS-1$

		// discovering
		Job job = new Job(Messages.DiscoverJavaModelFromLibrary_jobLabel) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				IStatus result = null;
				monitor.beginTask("", IProgressMonitor.UNKNOWN); //$NON-NLS-1$
				try {
					URI sourceURI = URI.createPlatformResourceURI(path.toString(), true);
					Resource resource = getResource("", project); //$NON-NLS-1$

					Model model = getEFactory().createModel();
					resource.getContents().add(model);
					IModelReader reader = getLibraryReader();
					reader.readModel(lib, model, monitor);

					if (monitor.isCanceled()) {
						result = Status.CANCEL_STATUS;
						return result;
					}
					reader.terminate(monitor);
					saveResource(sourceURI, path, resource, monitor);

					if (monitor.isCanceled()) {
						result = Status.CANCEL_STATUS;
						return result;
					}
					result = Status.OK_STATUS;
					DiscoverJavaModelFromLibrary.this.setResourceResult(resource);
				} catch (Exception e) {
					result = Status.CANCEL_STATUS;
					IStatus status = new Status(IStatus.ERROR, JavaActivator.PLUGIN_ID,
							"Unkown error.", e); //$NON-NLS-1$
					JavaActivator.getDefault().getLog().log(status);
				} finally {
					monitor.done();
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
		scheduleEditorOpening(ResourcesPlugin.getWorkspace().getRoot().getFile(path), job,
				parameters);

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

	protected LibraryReader getLibraryReader() {
		return new LibraryReader(getEFactory());
	}

	@Override
	public String toString() {
		return Messages.DiscoverJavaModelFromLibrary_title;
	}

	public List<DiscoveryParameter> getDiscovererParameters() {
		if (DiscoverJavaModelFromLibrary.parametersKeys == null) {
			DiscoverJavaModelFromLibrary.parametersKeys = new ArrayList<DiscoveryParameter>();
			DiscoverJavaModelFromLibrary.parametersKeys.add(DefaultDiscoverer.PARAMETER_SILENT_MODE);
			DiscoverJavaModelFromLibrary.parametersKeys.add(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
		}
		return DiscoverJavaModelFromLibrary.parametersKeys;
	}

	protected Resource getResource(final String resourceName, final IPackageFragmentRoot lib) {
		return getResource(resourceName, lib.getJavaProject());
	}

}
