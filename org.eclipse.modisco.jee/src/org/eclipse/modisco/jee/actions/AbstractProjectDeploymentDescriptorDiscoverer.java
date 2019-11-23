/*********************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation (class previously named ProjectDeploymentDescriptorDiscoverer)
 *    Nicolas Bros (Mia-Software) - refactoring for new discovery framework
 *********************************************************************************/
package org.eclipse.modisco.jee.actions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;

/**
 * Deployment descriptor discoverers use for now single file discovery, which could be extended for
 * discovering packages, projects ...
 *
 * The proposed class facilitates the creation of new Deployment Descriptor discoverer on a
 * container.
 *
 */
public abstract class AbstractProjectDeploymentDescriptorDiscoverer extends
		AbstractModelDiscoverer<Object> {
	public static final int FLUSH_LIMIT = 10000;
	private final ArrayList<Resource> resources = new ArrayList<Resource>();
	private static final String XMI_EXTENSION = "xmi"; //$NON-NLS-1$

	public abstract AbstractDeploymentDescriptorDiscoverer<File> getSingleFileDiscoverer();

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

	public void listXmlFiles(final String path, final ArrayList<File> paths) {
		File projectFile = new File(path);
		File[] files = projectFile.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				listXmlFiles(file.getPath(), paths);
			} else {
				if ("xml".equalsIgnoreCase(new Path(file.getPath()).getFileExtension())) { //$NON-NLS-1$
					paths.add(file);
				}
			}
		}
	}

	public static IProject getSourceProject(final Object source) {
		IProject project = null;
		if (source instanceof IProject) {
			project = (IProject) source;
		} else if (source instanceof IJavaProject) {
			project = ((IJavaProject) source).getProject();
		} else if (source instanceof IFolder) {
			project = ((IFolder) source).getProject();
		} else if (source instanceof IPackageFragment) {
			project = ((IPackageFragment) source).getResource().getProject();
		}
		return project;
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
		return resourceSet.createResource(URI.createURI(resourceName));
	}

	@Override
	protected void basicDiscoverElement(final Object source, final IProgressMonitor monitor)
			throws DiscoveryException {
		final IProject project = getSourceProject(source);
		try {
			Resource resource = createResource("platform:/resource/" //$NON-NLS-1$
					+ project.getProject().getName()
					+ "/" //$NON-NLS-1$
					+ project.getProject().getName()
					+ "." + AbstractProjectDeploymentDescriptorDiscoverer.XMI_EXTENSION); //$NON-NLS-1$
			ArrayList<File> files = new ArrayList<File>();
			// List all the XML files contained in the source
			listXmlFiles(getSourcePath(source), files);
			ArrayList<Resource> resourceList = new ArrayList<Resource>();
			for (File file : files) {
				getSingleFileDiscoverer().discoverElement(file, monitor);
				Resource targetModel = getSingleFileDiscoverer().getTargetModel();
				if (targetModel != null) {
					resourceList.add(targetModel);
				}
			}
			for (Resource r : resourceList) {
				resource.getContents().addAll(r.getContents());
			}
		} catch (Exception e) {
			throw new DiscoveryException(e);
		}
	}

	@Override
	protected void saveTargetModel() throws IOException {
		if (getTargetModel() != null) {
			if (getTargetURI() != null) {
				getTargetModel().setURI(getTargetURI());
			}
			Map<String, Object> options = new HashMap<String, Object>();
			options.put(XMLResource.OPTION_FLUSH_THRESHOLD,
					Integer.valueOf(AbstractProjectDeploymentDescriptorDiscoverer.FLUSH_LIMIT));
			options.put(XMLResource.OPTION_USE_FILE_BUFFER, new Boolean(true));
			getTargetModel().save(options);
		}
	}

	protected ArrayList<Resource> getResources() {
		return this.resources;
	}
}