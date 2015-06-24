/*********************************************************************************
 * Copyright (c) 2009,2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - adapted to new discovery framework
 *********************************************************************************/
package org.eclipse.gmt.modisco.xml.discoverer.actions;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.facet.util.emf.core.IBrowserRegistry;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterDirectionKind;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterImpl;
import org.eclipse.gmt.modisco.xml.discoverer.XmlActivator;
import org.eclipse.gmt.modisco.xml.internal.resource.GenericXMLHandler;
import org.eclipse.modisco.infra.discovery.ui.Activator;

/**
 * Discover generic XML model action.
 * 
 * @deprecated replaced by org.eclipse.modisco.xml.discoverer.XMLModelDiscoverer,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470885
 */
@Deprecated
public class XMLModelDiscoverer implements Discoverer {

	private static List<DiscoveryParameter> parametersKeys = null;
	private Resource resourceResult = null;
	private final org.eclipse.modisco.xml.discoverer.XMLModelDiscoverer delegateDiscoverer = new org.eclipse.modisco.xml.discoverer.XMLModelDiscoverer();

	protected org.eclipse.modisco.xml.discoverer.XMLModelDiscoverer getDelegateDiscoverer() {
		return this.delegateDiscoverer;
	}

	/**
	 * A parameter key for working without user interaction.
	 * 
	 * @deprecated not used with the new framework
	 */
	@Deprecated
	public static final DiscoveryParameter PARAMETER_SILENT_MODE = new DiscoveryParameterImpl(
			"OPTION_SILENT_MODE", DiscoveryParameterDirectionKind.in, //$NON-NLS-1$
			Boolean.class, false);

	/**
	 * A parameter key for ignoring whitespace in text portions.
	 */
	public static final DiscoveryParameter PARAMETER_IGNORE_WHITESPACES = new DiscoveryParameterImpl(
			GenericXMLHandler.OPTION_IGNORE_WHITESPACE, DiscoveryParameterDirectionKind.in,
			Boolean.class, false);

	/**
	 * A parameter key for minimizing the memory use of the obtained model. If <code>true</code> :
	 * comments are ignored, text portions with only indentation and line delimiters are ignored.
	 */
	public static final DiscoveryParameter PARAMETER_LIGHTWEIGHT_MODEL = new DiscoveryParameterImpl(
			GenericXMLHandler.OPTION_LIGHTWEIGHT_MODEL, DiscoveryParameterDirectionKind.in,
			Boolean.class, false);

	/**
	 * A parameter key for serializing the obtained model as an XMI file
	 */
	public static final DiscoveryParameter PARAMETER_SERIALIZE_XMI = new DiscoveryParameterImpl(
			"OPTION_SERIALIZE_XMI", //$NON-NLS-1$
			DiscoveryParameterDirectionKind.in, Boolean.class, false);

	/**
	 * A parameter key for indicating a target {@link Resource} instance as output.
	 */
	public static final DiscoveryParameter PARAMETER_TARGET_RESOURCE = new DiscoveryParameterImpl(
			"TARGET_RESOURCE", DiscoveryParameterDirectionKind.out, //$NON-NLS-1$
			Resource.class, false);

	public final boolean isApplicableTo(final Object source) {
		if (source instanceof IFile) {
			IFile file = (IFile) source;
			return this.delegateDiscoverer.isApplicableTo(file);
		} else if (source instanceof File) {
			return true;
		}
		return false;
	}

	/**
	 * Discovers a generic XML model and opens the MoDisco editor or default editor. This discoverer
	 * does not create additional physical artifacts.
	 * 
	 * @param source
	 *            an IFile instance pointing to XML contents
	 * @param target
	 *            should be <code>null</code> here.
	 */
	public final Resource discoverElement(final Object source, final URI target) {
		Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
		parameters.put(XMLModelDiscoverer.PARAMETER_SILENT_MODE, false);
		parameters.put(XMLModelDiscoverer.PARAMETER_IGNORE_WHITESPACES, false);
		parameters.put(XMLModelDiscoverer.PARAMETER_LIGHTWEIGHT_MODEL, false);
		parameters.put(XMLModelDiscoverer.PARAMETER_SERIALIZE_XMI, false);
		discoverElement(source, parameters);
		return (Resource) parameters.get(XMLModelDiscoverer.PARAMETER_TARGET_RESOURCE);
	}

	/**
	 * Discovers a generic XML model.
	 * 
	 * @param source
	 *            can be a workspace IFile or a {@link java.io.File} instance pointing to XML
	 *            contents
	 * @param parameters
	 *            <ul>
	 *            <li>PARAMETER_SILENT_MODE : IN parameter; if not set or set to <code>false</code>,
	 *            the discovered model will be opened in an editor.
	 *            <li>PARAMETER_IGNORE_WHITESPACES : see
	 *            {@link XMLModelDiscoverer#PARAMETER_IGNORE_WHITESPACES}
	 *            <li>PARAMETER_LIGHTWEIGHT_MODEL :see
	 *            {@link XMLModelDiscoverer#PARAMETER_LIGHTWEIGHT_MODEL}
	 *            <li>PARAMETER_SERIALIZE_XMI :see
	 *            {@link XMLModelDiscoverer#PARAMETER_SERIALIZE_XMI}
	 *            <li>PARAMETER_TARGET_RESOURCE : OUT parameter; the discovered model is stored with
	 *            this key.
	 *            </ul>
	 */
	public final void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {

		Job job = new Job("discovering XML model") { //$NON-NLS-1$
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				try {
					boolean serializeXMI = false;
					if (parameters != null
							&& parameters.get(XMLModelDiscoverer.PARAMETER_SERIALIZE_XMI) != null) {
						serializeXMI = (Boolean) parameters
								.get(XMLModelDiscoverer.PARAMETER_SERIALIZE_XMI);
					}
					boolean ignoreWhitespace = false;
					if (parameters != null
							&& parameters.get(XMLModelDiscoverer.PARAMETER_IGNORE_WHITESPACES) != null) {
						ignoreWhitespace = (Boolean) parameters
								.get(XMLModelDiscoverer.PARAMETER_IGNORE_WHITESPACES);
					}
					boolean lightweightModel = false;
					if (parameters != null
							&& parameters.get(XMLModelDiscoverer.PARAMETER_LIGHTWEIGHT_MODEL) != null) {
						lightweightModel = (Boolean) parameters
								.get(XMLModelDiscoverer.PARAMETER_LIGHTWEIGHT_MODEL);
					}
					boolean silent = false;
					if (parameters != null
							&& parameters.get(XMLModelDiscoverer.PARAMETER_SILENT_MODE) != null) {
						silent = (Boolean) parameters.get(XMLModelDiscoverer.PARAMETER_SILENT_MODE);
					}

					setResourceResult(null);
					getDelegateDiscoverer().setIgnoreWhitespace(ignoreWhitespace);
					getDelegateDiscoverer().setLightweightModel(lightweightModel);
					getDelegateDiscoverer().setSerializeTarget(serializeXMI);
					if (source instanceof IFile) {
						IFile iFile = (IFile) source;
						getDelegateDiscoverer()
								.setTargetURI(
										URI.createPlatformResourceURI(iFile.getFullPath()
												.addFileExtension("xmi").toOSString(), true)); //$NON-NLS-1$
						getDelegateDiscoverer().discoverElement(iFile, monitor);
					} else if (source instanceof File) {
						File file = (File) source;
						getDelegateDiscoverer().setTargetURI(
								URI.createFileURI(file.getAbsolutePath().concat(".xmi"))); //$NON-NLS-1$
						getDelegateDiscoverer().discoverElement(file, monitor);
					} else {
						throw new IllegalArgumentException("source is not a File or IFile"); //$NON-NLS-1$
					}
					setResourceResult(getDelegateDiscoverer().getTargetModel());
					if (!silent && getResourceResult() != null) {
						IBrowserRegistry.INSTANCE.browseResource(getResourceResult());
					}
				} catch (Exception e) {
					IStatus result = new Status(IStatus.ERROR, XmlActivator.PLUGIN_ID,
							"An error occured during model discovery from " //$NON-NLS-1$
									+ source.toString(), e);
					XmlActivator.getDefault().getLog().log(result);
				}
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		try {
			job.join();
		} catch (InterruptedException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}

		if (parameters != null) {
			parameters.put(XMLModelDiscoverer.PARAMETER_TARGET_RESOURCE, getResourceResult());
		}
	}

	public final List<DiscoveryParameter> getDiscovererParameters() {
		if (XMLModelDiscoverer.parametersKeys == null) {
			XMLModelDiscoverer.parametersKeys = new ArrayList<DiscoveryParameter>();
			XMLModelDiscoverer.parametersKeys.add(XMLModelDiscoverer.PARAMETER_SILENT_MODE);
			XMLModelDiscoverer.parametersKeys.add(XMLModelDiscoverer.PARAMETER_TARGET_RESOURCE);
			XMLModelDiscoverer.parametersKeys.add(XMLModelDiscoverer.PARAMETER_IGNORE_WHITESPACES);
			XMLModelDiscoverer.parametersKeys.add(XMLModelDiscoverer.PARAMETER_LIGHTWEIGHT_MODEL);
			XMLModelDiscoverer.parametersKeys.add(XMLModelDiscoverer.PARAMETER_SERIALIZE_XMI);
		}
		return XMLModelDiscoverer.parametersKeys;
	}

	public void setResourceResult(final Resource aResourceResult) {
		this.resourceResult = aResourceResult;
	}

	public Resource getResourceResult() {
		return this.resourceResult;
	}
}
