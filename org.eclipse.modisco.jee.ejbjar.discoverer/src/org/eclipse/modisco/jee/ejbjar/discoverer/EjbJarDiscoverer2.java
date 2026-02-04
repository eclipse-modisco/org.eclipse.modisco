/*********************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *	  Nicolas Guyomar (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - adapted to new discovery framework
 *********************************************************************************/
package org.eclipse.modisco.jee.ejbjar.discoverer;

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
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.Messages;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.jee.actions.AbstractDeploymentDescriptorDiscoverer;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.util.EjbJar11ResourceFactoryImpl;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.util.EjbJar20ResourceFactoryImpl;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.util.EjbJar21ResourceFactoryImpl;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.util.EjbJar30ResourceFactoryImpl;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.util.EjbJar31ResourceFactoryImpl;

/** Creates a model from an ejbjar.xml file. */
public class EjbJarDiscoverer2 extends AbstractDeploymentDescriptorDiscoverer<IFile> {

	private Resource.Factory modiscoResourceFactory;

	public static final String ROOT_NAME = "ejb-jar"; //$NON-NLS-1$
	public static final String DTD_URL = "http://java.sun.com/j2ee/dtds/"; //$NON-NLS-1$

	public static final String ID = "org.eclipse.modisco.jee.ejbjar.discoverer"; //$NON-NLS-1$

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
				EjbJarDiscoveryConstants.EJB_JAR_MODEL_FILE_SUFFIX)));

		final URI sourceURI = URI.createFileURI(file.getPath().toString());
		initializeResourceFactory(file);
		discoverResource(sourceURI);

		monitor.setTaskName(Messages.AbstractModelDiscoverer_savingModel);
		if (isTargetSerializationChosen()) {
			try {
				saveTargetModel();
			} catch (Exception e) {
				MoDiscoLogger.logError(e,
						"Error saving discovery result model", EjbJarActivator.getDefault()); //$NON-NLS-1$
			}
		}
	}

	private void initializeResourceFactory(final Object source) throws DiscoveryException {
		String version = getDescXmlVersion(EjbJarActivator.getDefault(), source,
				EjbJarDiscoverer2.ROOT_NAME, EjbJarDiscoverer2.DTD_URL);
		// Choose the right Factory according to the detected version
		if (version.equalsIgnoreCase("1.1")) { //$NON-NLS-1$
			setModiscoResourceFactory(new EjbJar11ResourceFactoryImpl());
		} else if (version.equalsIgnoreCase("2.0")) { //$NON-NLS-1$
			setModiscoResourceFactory(new EjbJar20ResourceFactoryImpl());
		} else if (version.equalsIgnoreCase("2.1")) { //$NON-NLS-1$
			setModiscoResourceFactory(new EjbJar21ResourceFactoryImpl());
		} else if (version.equalsIgnoreCase("3.0")) { //$NON-NLS-1$
			setModiscoResourceFactory(new EjbJar30ResourceFactoryImpl());
		} else if (version.equalsIgnoreCase("3.1")) { //$NON-NLS-1$
			setModiscoResourceFactory(new EjbJar31ResourceFactoryImpl());
		} else {
			// no version was detected
			throw new DiscoveryException(
					"No known version of ejb-jar.xml detected; aborting the process"); //$NON-NLS-1$
		}
	}

	/**
	 * Discovers a generic EjbJar model.
	 *
	 * @param source
	 *            an IFile pointing to EjbJar contents
	 */
	@Override
	protected void basicDiscoverElement(final IFile source, final IProgressMonitor monitor)
			throws DiscoveryException {
		setDefaultTargetURI(URI.createPlatformResourceURI(
				source.getFullPath().toString()
						.concat(EjbJarDiscoveryConstants.EJB_JAR_MODEL_FILE_SUFFIX), true));
		initializeResourceFactory(source);
		URI sourceURI = URI.createPlatformResourceURI(source.getFullPath().toString(), true);
		discoverResource(sourceURI);
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
				MoDiscoLogger.logWarning("Unknown feature detected:" + anyType.toString(), //$NON-NLS-1$
						EjbJarActivator.getDefault());
			}

		} catch (IOException e) {
			throw new DiscoveryException(
					"An error occured during model discovery from: " + sourceURI.toString(), //$NON-NLS-1$
					e);
		}

	}

	protected void setModiscoResourceFactory(final Resource.Factory modiscoResourceFactory) {
		this.modiscoResourceFactory = modiscoResourceFactory;
	}

	protected Resource.Factory getModiscoResourceFactory() {
		return this.modiscoResourceFactory;
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