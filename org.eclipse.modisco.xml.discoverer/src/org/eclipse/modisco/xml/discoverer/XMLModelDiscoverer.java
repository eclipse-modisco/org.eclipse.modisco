/*********************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - adapted to new discovery framework
 ********************************************************************************/
package org.eclipse.modisco.xml.discoverer;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.Messages;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.xml.discoverer.internal.XmlActivator;
import org.eclipse.modisco.xml.internal.resource.GenericXMLHandler;
import org.eclipse.modisco.xml.resource.GenericXMLResourceFactoryImpl;
import org.eclipse.modisco.xml.resource.GenericXMLResourceImpl;

/**
 * Discover generic XML model action.
 */
public class XMLModelDiscoverer extends AbstractModelDiscoverer<IFile> {

	public static final String ID = "org.eclipse.modisco.xml.discoverer"; //$NON-NLS-1$

	private static final Resource.Factory XML_RESOURCE_FACTORY = new GenericXMLResourceFactoryImpl();

	private boolean ignoreWhitespace = false;

	@Parameter(name = "IGNORE_WHITESPACE", description = "Whether to ignore whitespace in text portions.")
	public void setIgnoreWhitespace(final boolean ignoreWhitespace) {
		this.ignoreWhitespace = ignoreWhitespace;
	}

	protected boolean isIgnoreWhitespace() {
		return this.ignoreWhitespace;
	}

	private boolean lightweightModel = false;

	@Parameter(name = "LIGHTWEIGHT", description = "Minimize the memory use of the obtained model by ignoring comments and text portions consisting only of indentation or line delimiters.")
	public void setLightweightModel(final boolean lightweightModel) {
		this.lightweightModel = lightweightModel;
	}

	protected boolean isLightweightModel() {
		return this.lightweightModel;
	}

	public boolean isApplicableTo(final IFile file) {
		if (file.exists() && file.isSynchronized(IResource.DEPTH_ZERO)) {
			try {
				IContentType xmlContentType = Platform.getContentTypeManager().getContentType(
						"org.eclipse.core.runtime.xml"); //$NON-NLS-1$
				if (file.getContentDescription() != null) {
					IContentType candidateType = file.getContentDescription().getContentType();
					if (candidateType != null) {
						return candidateType.isKindOf(xmlContentType);
					}
				}
				// without content information, propose XML discovery
				return true;
			} catch (CoreException e) {
				IStatus warning = new Status(IStatus.WARNING, XmlActivator.PLUGIN_ID,
						"Could not test xml nature for file " //$NON-NLS-1$
								+ file.toString(), e);
				XmlActivator.getDefault().getLog().log(warning);
			}
		}
		return false;
	}

	/**
	 * Alternate discoverer service with File as input instead of IFile. If you want to discover an
	 * {@link IFile}, use {@link IDiscoverer#discoverElement(Object, IProgressMonitor)} instead
	 *
	 * @param file
	 *            the file to discover
	 * @param monitor
	 *            a {@link IProgressMonitor progress monitor} (may be a {@link NullProgressMonitor}
	 *            if progress monitoring is not desired)
	 * @throws DiscoveryException
	 */
	public void discoverElement(final File file, final IProgressMonitor monitor)
			throws DiscoveryException {

		setDefaultTargetURI(URI.createFileURI(file.getPath().concat(
				XMLDiscoveryConstants.XML_MODEL_FILE_SUFFIX)));

		checkParameterValues();

		final URI sourceURI = URI.createFileURI(file.getPath().toString());
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
				source.getFullPath().removeFileExtension().toString()
						.concat(XMLDiscoveryConstants.XML_MODEL_FILE_SUFFIX), true));
		final String absolutePath = source.getFullPath().toString();
		final URI sourceURI = URI.createPlatformResourceURI(absolutePath, true);
		discoverResource(sourceURI);
	}

	private void discoverResource(final URI sourceURI) throws DiscoveryException {
		try {
			Resource resource = XMLModelDiscoverer.XML_RESOURCE_FACTORY.createResource(sourceURI);
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put(GenericXMLHandler.OPTION_IGNORE_WHITESPACE,
					Boolean.valueOf(isIgnoreWhitespace()));
			parameters.put(GenericXMLHandler.OPTION_LIGHTWEIGHT_MODEL,
					Boolean.valueOf(isLightweightModel()));
			resource.load(parameters);
			setTargetModel(resource);
		} catch (IOException e) {
			throw new DiscoveryException(
					"An error occurred during model discovery from: " + sourceURI.toString(), e); //$NON-NLS-1$
		}
	}

	/**
	 * Overridden to save as XMI with {@link XMIResource}, instead of as XML with
	 * {@link GenericXMLResourceImpl}.
	 */
	@Override
	protected void saveTargetModel() throws IOException {
		Resource xmlResource = getTargetModel();
		Resource xmiResource = new XMIResourceImpl();
		xmiResource.getContents().addAll(xmlResource.getContents());
		getResourceSet().getResources().add(xmiResource);
		setTargetModel(xmiResource);
		super.saveTargetModel();
	}
}
