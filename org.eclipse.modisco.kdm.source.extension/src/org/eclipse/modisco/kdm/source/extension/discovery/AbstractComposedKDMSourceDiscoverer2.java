/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.kdm.source.extension.discovery;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.IOWrappedException;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.kdm.source.discoverer.DiscoverSourceModelFromJavaElement;
import org.eclipse.modisco.kdm.source.discoverer.DiscoverSourceModelFromResource;
import org.eclipse.modisco.kdm.source.extension.Activator;

/**
 * This abstract discoverer can be used for writing composite discoverers where one KDM inventory
 * leaf model is involved in model composition.
 * 
 * It proposes a discovery process and some common code related to the KDM inventory model.
 * 
 * See Help Contents or http://wiki.eclipse.org/MoDisco/Components/KDMSourceExtension
 */
public abstract class AbstractComposedKDMSourceDiscoverer2<T> extends AbstractModelDiscoverer<T> {

	private static final int FLUSH_LIMIT_SHIFT = 16;
	private static final Integer FLUSH_LIMIT = Integer
			.valueOf(1 << AbstractComposedKDMSourceDiscoverer2.FLUSH_LIMIT_SHIFT);

	private Resource kdmSourceModelResource = null;

	protected void setKdmSourceModelResource(final Resource kdmSourceModelResource) {
		this.kdmSourceModelResource = kdmSourceModelResource;
	}

	protected Resource getKdmSourceModelResource() {
		return this.kdmSourceModelResource;
	}

	/**
	 * The global discovery process. Should not be overridden in most cases.
	 * 
	 * The process includes four steps : composite model initialization, KDM inventory model
	 * discovery, discovery of other leaf models, composite model completion.
	 * 
	 * Creating links between models may be done during the last step, or during the discovery of
	 * leaf models (e.g. using {@link SourceVisitListener}).
	 */
	@Override
	protected void basicDiscoverElement(final T source, final IProgressMonitor monitor)
			throws DiscoveryException {

		// Step 1
		initializeCompositeModel(source, monitor);
		if (monitor.isCanceled()) {
			return;
		}
		monitor.worked(1);
		// Step 2
		discoverOtherLeafModels(source, monitor);
		if (monitor.isCanceled()) {
			return;
		}
		monitor.worked(1);
		// Step 3
		discoverKDMSourceModel(source, monitor);
		if (monitor.isCanceled()) {
			return;
		}
		monitor.worked(1);
		// Step 4
		finishBuildingModel(source, monitor);
	}

	/**
	 * The initialization should create a {@link Resource} and root element for the composite model.
	 * It may also initialize a {@link SourceVisitListener} if some of the leaf discoverers
	 * implement {@link AbstractRegionDiscoverer}.
	 */
	protected abstract void initializeCompositeModel(final T source, final IProgressMonitor monitor);

	/**
	 * This should call leaf discoverers, retrieve the resulting resources and move them to the
	 * global resource set.
	 */
	protected abstract void discoverOtherLeafModels(final T source, final IProgressMonitor monitor);

	/** Optional operations to complete the discovery (weaving, saving, ...) */
	protected abstract void finishBuildingModel(final T source, final IProgressMonitor monitor);

	/**
	 * Standard KDM inventory model discovery process.
	 * 
	 * @throws DiscoveryException
	 */
	protected Resource discoverKDMSourceModel(final T source, final IProgressMonitor monitor)
			throws DiscoveryException {
		monitor.subTask(Messages.AbstractComposedKDMSourceDiscoverer_1);
		if (source instanceof IResource) {
			IResource resource = (IResource) source;
			DiscoverSourceModelFromResource discoverer = new DiscoverSourceModelFromResource();
			discoverer.setSerializeTarget(isSerializeKDMResource());
			discoverer.setTargetURI(getKDMResourceTargetURI());
			discoverer.discoverElement(resource, monitor);
			if (discoverer.getTargetModel().getURI() == null) {
				discoverer.getTargetModel().setURI(discoverer.getDefaultTargetURI());
			}
			getResourceSet().getResources().add(discoverer.getTargetModel());
			this.kdmSourceModelResource = discoverer.getTargetModel();
			return this.kdmSourceModelResource;
		} else if (source instanceof IJavaElement) {
			IJavaElement javaElement = (IJavaElement) source;
			DiscoverSourceModelFromJavaElement discoverer = new DiscoverSourceModelFromJavaElement();
			discoverer.setSerializeTarget(isSerializeKDMResource());
			discoverer.setTargetURI(getKDMResourceTargetURI());
			discoverer.discoverElement(javaElement, monitor);
			if (discoverer.getTargetModel().getURI() == null) {
				discoverer.getTargetModel().setURI(discoverer.getDefaultTargetURI());
			}
			getResourceSet().getResources().add(discoverer.getTargetModel());
			this.kdmSourceModelResource = discoverer.getTargetModel();
			return this.kdmSourceModelResource;
		} else {
			throw new IllegalArgumentException("source type not handled: " //$NON-NLS-1$
					+ source.getClass().getName());
		}
	}

	protected abstract boolean isSerializeKDMResource();

	protected abstract URI getKDMResourceTargetURI();

	protected static void saveResource(final Resource resource) throws IOException {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_FLUSH_THRESHOLD,
				AbstractComposedKDMSourceDiscoverer2.FLUSH_LIMIT);
		options.put(XMLResource.OPTION_USE_FILE_BUFFER, Boolean.TRUE);
		if (resource.getURI() == null) {
			MoDiscoLogger.logError("Cannot save a Resource without URI." //$NON-NLS-1$
					, Activator.getDefault());
			return;
		}
		try {
			resource.save(options);
		} catch (IOWrappedException e) {
			// TODO here is a temporary fix for Bug 323247
			if (e.getCause() != null && (e.getCause() instanceof CoreException)) {
				MoDiscoLogger.logWarning(e, "XMI serialization has failed on '" + resource.getURI() //$NON-NLS-1$
						+ "'. Trying again without File Buffer.", //$NON-NLS-1$
						Activator.getDefault());
				options.clear();
				resource.save(options);
				MoDiscoLogger.logInfo("XMI serialization is done for " + resource.getURI(), //$NON-NLS-1$
						Activator.getDefault());
			} else {
				throw e;
			}
		}
	}
}
