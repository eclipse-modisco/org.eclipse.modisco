/*********************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * 	  Nicolas Guyomar (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - adapted to new discovery framework
 *********************************************************************************/
package org.eclipse.modisco.jee.webapp.discoverer;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.Messages;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.jee.actions.AbstractDeploymentDescriptorDiscoverer;
import org.eclipse.modisco.jee.webapp.webapp22.util.Webapp22ResourceFactoryImpl;
import org.eclipse.modisco.jee.webapp.webapp23.util.Webapp23ResourceFactoryImpl;
import org.eclipse.modisco.jee.webapp.webapp24.util.Webapp24ResourceFactoryImpl;
import org.eclipse.modisco.jee.webapp.webapp25.util.Webapp25ResourceFactoryImpl;
import org.eclipse.modisco.jee.webapp.webapp30.util.Webapp30ResourceFactoryImpl;

/**
 * Discover web.xml generic model action.
 */
public class WebXmlDiscoverer2 extends AbstractDeploymentDescriptorDiscoverer<IFile> {

	private static Resource.Factory modiscoResourceFactory;

	public static final String ID = "org.eclipse.modisco.jee.webapp.discoverer"; //$NON-NLS-1$
	public static final String ROOT_NAME = "web-app"; //$NON-NLS-1$
	public static final String DTD_URL = "http://java.sun.com/"; //$NON-NLS-1$

	public boolean isApplicableTo(final IFile source) {
		return isAnIFileWithExtension(source, "xml"); //$NON-NLS-1$
	}

	/**
	 * Alternate discoverer service with File as input instead of IFile. If you
	 * want to discover an {@link IFile}, use
	 * {@link IDiscoverer#discoverElement(Object, IProgressMonitor)} instead
	 *
	 * @param file
	 *            the file to discover
	 * @param monitor
	 *            a {@link IProgressMonitor progress monitor} (may be a
	 *            {@link NullProgressMonitor} if progress monitoring is not
	 *            desired)
	 * @throws DiscoveryException
	 */
	public void discoverElement(final File file, final IProgressMonitor monitor)
			throws DiscoveryException {

		setDefaultTargetURI(URI.createFileURI(file.getPath().concat(
				WebXMLDIscoveryConstants.WEB_XML_MODEL_FILE_SUFFIX)));

		final URI sourceURI = URI.createFileURI(file.getPath().toString());
		initializeResourceFactory(file);
		discoverResource(sourceURI);

		monitor.setTaskName(Messages.AbstractModelDiscoverer_savingModel);
		if (isTargetSerializationChosen()) {
			try {
				saveTargetModel();
			} catch (Exception e) {
				throw new DiscoveryException("Error saving discovery result model", e); //$NON-NLS-1$
			}
		}
	}

	@Override
	protected void basicDiscoverElement(final IFile source, final IProgressMonitor monitor)
			throws DiscoveryException {
		setDefaultTargetURI(URI.createPlatformResourceURI(
				source.getFullPath().toString()
						.concat(WebXMLDIscoveryConstants.WEB_XML_MODEL_FILE_SUFFIX), true));
		initializeResourceFactory(source);
		URI sourceURI = URI.createPlatformResourceURI(source.getFullPath().toString(), true);
		discoverResource(sourceURI);
	}

	private static void initializeResourceFactory(final Object source) throws DiscoveryException {
		String version = getDescXmlVersion(WebXmlActivator.getDefault(), source,
				WebXmlDiscoverer2.ROOT_NAME, WebXmlDiscoverer2.DTD_URL);

		// Chose the right Factory according to the detected version
		if (version.equalsIgnoreCase("2.2")) { //$NON-NLS-1$
			WebXmlDiscoverer2.modiscoResourceFactory = new Webapp22ResourceFactoryImpl();
		} else if (version.equalsIgnoreCase("2.3")) { //$NON-NLS-1$
			WebXmlDiscoverer2.modiscoResourceFactory = new Webapp23ResourceFactoryImpl();
		} else if (version.equalsIgnoreCase("2.4")) { //$NON-NLS-1$
			WebXmlDiscoverer2.modiscoResourceFactory = new Webapp24ResourceFactoryImpl();
		} else if (version.equalsIgnoreCase("2.5")) { //$NON-NLS-1$
			WebXmlDiscoverer2.modiscoResourceFactory = new Webapp25ResourceFactoryImpl();
		} else if (version.equalsIgnoreCase("3.0")) { //$NON-NLS-1$
			WebXmlDiscoverer2.modiscoResourceFactory = new Webapp30ResourceFactoryImpl();
		} else {
			// no version was detected
			throw new DiscoveryException(
					"No known version of web.xml detected; aborting the process"); //$NON-NLS-1$
		}
	}

	private void discoverResource(final URI sourceURI) throws DiscoveryException {
		try {
			Resource resource = getModiscoResourceFactory().createResource(sourceURI);
			// A ResourceSet is necessary for EPackage.Registry
			// access through ResourceSet.getResource() during model
			// loading
			getResourceSet().getResources().add(resource);

			resource.load(null);
			setTargetModel(resource);

			Map<EObject, AnyType> unknowFeature = ((XMLResource) resource)
					.getEObjectToExtensionMap();

			// Unknown feature management:
			for (AnyType anyType : unknowFeature.values()) {
				Logger.logWarning("Unknown feature detected:" + anyType.toString(), //$NON-NLS-1$
						WebXmlActivator.getDefault());
			}
		} catch (IOException e) {
			throw new DiscoveryException(
					"An error occurred during model discovery from: " + sourceURI.toString(), e); //$NON-NLS-1$
		}
	}

	protected static Resource.Factory getModiscoResourceFactory() {
		return WebXmlDiscoverer2.modiscoResourceFactory;
	}

	protected static void setModiscoResourceFactory(final Resource.Factory modiscoResourceFactory) {
		WebXmlDiscoverer2.modiscoResourceFactory = modiscoResourceFactory;
	}

	/** Overridden to save as XMI with {@link XMIResource}. */
	@Override
	protected void saveTargetModel() throws IOException {
		Resource xmlResource = getTargetModel();
		Resource xmiResource = createTargetModel();
		xmiResource.getContents().addAll(xmlResource.getContents());
		xmlResource.getResourceSet().getResources().remove(xmlResource);
		super.saveTargetModel();
	}
}
