/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Grégoire Dupé (Mia-Software) - Bug 491546 - [Discovery] Poor saving failure message
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.IOWrappedException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.infra.discovery.core.internal.Activator;

/**
 * A base implementation for a category of discoverers which handle some
 * resulting model. It proposes to centralize some usual parameters :
 *
 * <ul>
 * <li>
 * A model container ({@link org.eclipse.emf.ecore.resource.Resource}), usually
 * an output of the discovery but which might be provided also as input.
 * <li>
 * A boolean indicating if some serialization is wished.
 * <li>
 * A location for optional serialization (
 * {@link org.eclipse.emf.common.util.URI})
 * </ul>
 *
 * @param <T>
 *            the type of source of the discovery
 */
public abstract class AbstractModelDiscoverer<T> extends AbstractDiscoverer<T> {

	private static final int FLUSH_LIMIT_SHIFT = 16;
	private static final Integer FLUSH_LIMIT = Integer
			.valueOf(1 << AbstractModelDiscoverer.FLUSH_LIMIT_SHIFT);

	private URI fDefaultTargetURI = null;

	private Resource fTargetModel;

	@Parameter(name = "TARGET_MODEL", requiresInputValue = false, description = "A model container; usually an output of the discovery but may also be provided as input.")
	public Resource getTargetModel() {
		return this.fTargetModel;
	}

	@Parameter(name = "TARGET_MODEL")
	public void setTargetModel(final Resource targetModel) {
		this.fTargetModel = targetModel;
	}

	private boolean fSerializeTarget;

	protected boolean isTargetSerializationChosen() {
		return this.fSerializeTarget;
	}

	@Parameter(name = "SERIALIZE_TARGET", requiresInputValue = false, description = "Whether to serialize the target model. The save behavior depends on the Discoverer implementation. The standard behavior is to use XMI serialization.")
	public void setSerializeTarget(final boolean serializeTarget) {
		this.fSerializeTarget = serializeTarget;
	}

	private URI fTargetURI;

	public URI getTargetURI() {
		return this.fTargetURI;
	}

	@Parameter(name = "TARGET_URI", requiresInputValue = false, description = "A target location for optional model serialization. Save behavior depends on the Discoverer implementation.")
	public void setTargetURI(final URI targetURI) {
		this.fTargetURI = targetURI;
	}

	private ResourceSet fResourceSet = null;

	protected ResourceSet getResourceSet() {
		if (this.fResourceSet == null) {
			this.fResourceSet = new ResourceSetImpl();
		}
		return this.fResourceSet;
	}

	protected void setResourceSet(final ResourceSet resourceSet) {
		this.fResourceSet = resourceSet;
	}

	/**
	 * Creates and returns the target model of the discovery. If the target
	 * model has already been created or it was provided through the
	 * TARGET_MODEL discoverer parameter, then it is returned instead of
	 * creating a new one.
	 * <p>
	 * The discoverer developer should explicitly call it when implementing
	 * their discoverer.
	 *
	 * @return the target model
	 */
	protected Resource createTargetModel() {
		Resource targetModel = getTargetModel();
		if (targetModel != null) {
			return targetModel;
		}
		targetModel = new XMIResourceImpl();
		getResourceSet().getResources().add(targetModel);
		setTargetModel(targetModel);
		return targetModel;
	}

	/**
	 * Utility service proposing usual target model serialization. The
	 * discoverer developer may explicitly call it when implementing their
	 * discoverer.
	 * <p>
	 * It may be overridden to specify a different way of serializing the
	 * Resource.
	 *
	 * @throws IOException
	 *             exception on serialization
	 */
	protected void saveTargetModel() throws IOException {
		if (getTargetModel() != null) {
			Map<String, Object> options = new HashMap<String, Object>();
			options.put(XMLResource.OPTION_FLUSH_THRESHOLD, AbstractModelDiscoverer.FLUSH_LIMIT);
			options.put(XMLResource.OPTION_USE_FILE_BUFFER, Boolean.TRUE);
			final URI targetURI = getTargetURI();
			URI defaultURI = getDefaultTargetURI();
			final Resource targetModel = getTargetModel();
			if (targetURI != null && targetURI.toString().trim().length() > 0) {
				targetModel.setURI(targetURI);
			} else if (defaultURI != null) {
				getTargetModel().setURI(defaultURI);
			} else if (targetModel.getURI() == null) {
				MoDiscoLogger.logError("Cannot save a Resource without URI. " //$NON-NLS-1$
						+ "You must pass a valid URI using " //$NON-NLS-1$
						+ "AbstractModelDiscoverer#setTargetURI", Activator.getDefault()); //$NON-NLS-1$
				return;
			}
			try {
				targetModel.save(options);
			} catch (IOWrappedException e) {
				// TODO here is a temporary fix for Bug 323247
				if (e.getCause() != null && (e.getCause() instanceof CoreException)) {
					MoDiscoLogger.logWarning(e,
							"XMI serialization has failed on '" + targetModel.getURI() //$NON-NLS-1$
									+ "'. Trying again without File Buffer.", //$NON-NLS-1$
							Activator.getDefault());
					options.clear();
					targetModel.save(options);
					MoDiscoLogger.logInfo("XMI serialization is done for " + targetModel.getURI(), //$NON-NLS-1$
							Activator.getDefault());
				} else {
					throw e;
				}
			}
		}
	}

	/**
	 * Discovers the model and saves the result model if
	 * {@link AbstractModelDiscoverer#isTargetSerializationChosen()
	 * serialization is required}.
	 */
	@Override
	public final void discoverElement(final T source, final IProgressMonitor monitor)
			throws DiscoveryException {
		super.discoverElement(source, monitor);
		if (monitor.isCanceled()) {
			return;
		}
		monitor.subTask(Messages.AbstractModelDiscoverer_savingModel);
		if (isTargetSerializationChosen()) {
			try {
				saveTargetModel();
			} catch (Exception e) {
				final String message = String.format(
						"The saving step of '%s' failed (targetURI='%s')", //$NON-NLS-1$
						this.getClass().getName(),
						this.getTargetURI());
				MoDiscoLogger.logError(e, message, Activator.getDefault());
			}
		}
	}

	/**
	 * Set the URI that must be used if the targetURI is <code>null</code> or
	 * empty.
	 */
	protected void setDefaultTargetURI(final URI defaultURI) {
		this.fDefaultTargetURI = defaultURI;
	}

	/**
	 * The URI that will be used if the targetURI is <code>null</code> or empty.
	 */
	public URI getDefaultTargetURI() {
		return this.fDefaultTargetURI;
	}
}
