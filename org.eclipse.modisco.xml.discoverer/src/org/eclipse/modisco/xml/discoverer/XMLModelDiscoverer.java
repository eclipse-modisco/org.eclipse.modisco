/*********************************************************************************
 * Copyright (c) 2011, 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - adapted to new discovery framework
 *    Grégoire Dupé (Mia-Software) - Bug 464300 - To be able to discover XML models from a folder/project
 ********************************************************************************/
package org.eclipse.modisco.xml.discoverer;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.gmt.modisco.xml.resource.GenericXMLResourceImpl;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.Messages;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.xml.discoverer.internal.AbstractXMLModelDiscoverer;
import org.eclipse.modisco.xml.discoverer.internal.Utils;

/**
 * Discover generic XML model action.
 * @deprecated Replaced by org.eclipse.modisco.xml.discoverer.IXmlDiscoveryService.discover(File, boolean, boolean, IProgressMonitor);
 */
@Deprecated
public class XMLModelDiscoverer extends AbstractXMLModelDiscoverer<IFile> {

	public static final String ID = "org.eclipse.modisco.xml.discoverer"; //$NON-NLS-1$

	@Override
	public void setIgnoreWhitespace(final boolean ignoreWhitespace) {
		/* gdupe> This method is useless (from a Java point of view) but it 
		 * avoid API break warnings */
		super.setIgnoreWhitespace(ignoreWhitespace);
	}

	/**
	 * @since 0.13
	 */
	@Override
	public boolean isIgnoreWhitespace() {
		/* gdupe> This method is useless (from a Java point of view) but it 
		 * avoid API break warnings */
		return super.isIgnoreWhitespace();
	}

	@Override
	public void setLightweightModel(final boolean lightweightModel) {
		/* gdupe> This method is useless (from a Java point of view) but it 
		 * avoid API break warnings */
		super.setLightweightModel(lightweightModel);
	}

	/**
	 * @since 0.13
	 */
	@Override
	public boolean isLightweightModel() {
		/* gdupe> This method is useless (from a Java point of view) but it 
		 * avoid API break warnings */
		return super.isLightweightModel();
	}
	
	public boolean isApplicableTo(final IFile file) {
		return Utils.isXmlFile(file);
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
		Utils.discoverResource(sourceURI, isIgnoreWhitespace(), 
				isLightweightModel());

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
		final IPath fullPath = source.getFullPath();
		final IPath pathWitoutFileExt = fullPath.removeFileExtension();
		final String pathWithoutExt = pathWitoutFileExt.toString();
		final String pathName = pathWithoutExt.concat(
				XMLDiscoveryConstants.XML_MODEL_FILE_SUFFIX);
		final URI createPlatformURI = URI.createPlatformResourceURI(
				pathName, true);
		setDefaultTargetURI(createPlatformURI);
		final String absolutePath = fullPath.toString();
		final URI sourceURI = URI.createPlatformResourceURI(absolutePath, true);
		final Resource resource = Utils.discoverResource(sourceURI, 
				isIgnoreWhitespace(), isLightweightModel());
		setTargetModel(resource);
	}


	/**
	 * Overridden to save as XMI with {@link XMIResource}, instead of as XML with
	 * {@link GenericXMLResourceImpl}.
	 */
	@Override
	protected void saveTargetModel() throws IOException {
		final Resource xmlResource = getTargetModel();
		final Resource xmiResource = new XMIResourceImpl();
		xmiResource.getContents().addAll(xmlResource.getContents());
		getResourceSet().getResources().add(xmiResource);
		setTargetModel(xmiResource);
		super.saveTargetModel();
	}
}
