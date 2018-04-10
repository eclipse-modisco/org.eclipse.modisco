/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.common.core.internal.resource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.modisco.infra.common.core.internal.CommonModiscoActivator;
import org.eclipse.gmt.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog;
import org.eclipse.gmt.modisco.infra.common.core.internal.protocol.ModiscoProtocolException;
import org.eclipse.gmt.modisco.infra.common.core.internal.protocol.ModiscoURIHandler;

/**
 * @author Gregoire DUPE
 */
public final class MoDiscoResourceSet extends ResourceSetImpl {

	private static final String DEBUG_ID = "org.eclipse.gmt.modisco.infra.common.core/debug/MoDiscoResoureSet/debug"; //$NON-NLS-1$
	public static final boolean DEBUG = CommonModiscoActivator.getDefault().isDebugging()
			&& Boolean.parseBoolean(Platform.getDebugOption(MoDiscoResourceSet.DEBUG_ID));

	private static MoDiscoResourceSet resourceSet = null;
	private final Map<URI, MoDiscoResourceListenerGroup> listenerGroupMap = new HashMap<URI, MoDiscoResourceListenerGroup>();

	private MoDiscoResourceSet() {
		super();
	}

	public static synchronized MoDiscoResourceSet getResourceSetSingleton() {
		if (MoDiscoResourceSet.resourceSet == null) {
			MoDiscoResourceSet.resourceSet = new MoDiscoResourceSet();
		}
		return MoDiscoResourceSet.resourceSet;
	}

	/**
	 * Return a loaded (or reloaded) EMF resource.
	 *
	 * @param uri
	 *            the resource
	 * @param listener
	 *            a listener that will be notified of each update to the
	 *            returned resource.
	 * @return an EMF resource
	 * @throws IOException
	 */
	public synchronized Resource getResource(final URI uri, final IMoDiscoResourceListener listener)
			throws IOException {
		setPackageRegistry(EPackage.Registry.INSTANCE);
		if (MoDiscoResourceSet.DEBUG) {
			String message = this.getClass().getSimpleName() + ".getResource(URI,Listener): uri=" //$NON-NLS-1$
					+ uri.toString();
			System.out.println(message);
			// IStatus status = new Status(IStatus.INFO,
			// CommonModiscoActivator.PLUGIN_ID, message);
			// CommonModiscoActivator.getDefault().getLog().log(status);
		}
		ListIterator<Resource> resourcesIterator = getResources().listIterator();
		while (resourcesIterator.hasNext()) {
			Resource existingResource = resourcesIterator.next();
			if (existingResource == null) {
				resourcesIterator.remove();
			} else if (existingResource.getURI().equals(uri)) {
				existingResource.unload();
				break;
			}
		}
		Resource resource = super.getResource(uri, true);
		resource.load(Collections.EMPTY_MAP);
		try {
			addListenerToReferedResource(resource, listener);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return resource;
	}

	private synchronized void addListenerToReferedResource(final Resource resource,
			final IMoDiscoResourceListener listener) throws Exception {
		TreeIterator<EObject> treeIterator = resource.getAllContents();
		while (treeIterator.hasNext()) {
			try {
				EObject eObject = treeIterator.next();
				for (EStructuralFeature feature : eObject.eClass().getEAllStructuralFeatures()) {
					Object object = eObject.eGet(feature);
					if (object instanceof EObject) {
						readEObject(resource, listener, eObject, (EObject) object);
					} else if (object instanceof EList<?>) {
						EList<?> list = (EList<?>) object;
						for (Object listObject : list) {
							if (object instanceof EObject) {
								readEObject(resource, listener, eObject, (EObject) listObject);
							}
						}
					}
				}
			} catch (BrokenRefException e) {
				resource.getErrors().add(e);
			} catch (Exception e) {
				if (e instanceof ModiscoProtocolException) {
					ModiscoProtocolException mpe = (ModiscoProtocolException) e;
					resource.getErrors().add(mpe);
				} else {
					throw e;
				}

			}
		}
	}

	private synchronized void readEObject(final Resource resource, final IMoDiscoResourceListener listener,
			final EObject referringEObject, final EObject referredEObject)
			throws BrokenRefException {
		Resource referredObjectResource = referredEObject.eResource();
		if (referredObjectResource != resource) {
			MoDiscoResourceListenerGroup listenerGroup;
			if (listener != null) {
				URI referredURI;
				if (referredObjectResource != null) {
					referredURI = referredObjectResource.getURI();
				} else {
					// see bugs 311684 and 312456
					referredURI = EcoreUtil.getURI(referredEObject).trimFragment();
				}
				listenerGroup = getListenerGroup(referredURI);
				listenerGroup.addListener(listener, resource.getURI());
			}
			if (referredObjectResource == null) {
				EObject resolved = EcoreUtil.resolve(referredEObject, this);
				if (resolved.eIsProxy()) {
					throw new BrokenRefException(referringEObject, referredEObject);
				}
			}
		}
	}

	public synchronized MoDiscoResourceListenerGroup getListenerGroup(final URI watchedResourceUri) {
		MoDiscoResourceListenerGroup listenerGroup = this.listenerGroupMap.get(watchedResourceUri);
		if (listenerGroup == null) {
			listenerGroup = new MoDiscoResourceListenerGroup(watchedResourceUri);
			this.listenerGroupMap.put(watchedResourceUri, listenerGroup);
		}
		return listenerGroup;
	}

	/**
	 * This method is used to notify the resource set that one of its resources
	 * has been reloaded.
	 *
	 * This method is used by the
	 * {@link AbstractMoDiscoCatalog#addWSFile(IFile)} method.
	 *
	 * @param resource
	 *            a reloaded resource
	 */
	public void aResourceHasBeenLoaded(final Resource resource) {
		URI uri = resource.getURI();
		if (MoDiscoResourceSet.DEBUG) {
			String message = this.getClass().getSimpleName()
					+ ".aResourceHasBeenLoaded(Resource)] resource.getURI()=" //$NON-NLS-1$
					+ uri.toString();
			System.out.println(message);
			// IStatus status = new Status(IStatus.INFO,
			// CommonModiscoActivator.PLUGIN_ID, message);
			// CommonModiscoActivator.getDefault().getLog().log(status);
		}
		MoDiscoResourceListenerGroup listenerGroup = getListenerGroup(uri);
		listenerGroup.notifyChange();
	}

	public void aResourceHasBeenUnLoaded(final Resource resource) {
		URI uri = resource.getURI();
		if (MoDiscoResourceSet.DEBUG) {
			String message = this.getClass().getSimpleName()
					+ ".aResourceHasBeenUnLoaded(Resource): resource.getURI()=" //$NON-NLS-1$
					+ uri.toString();
			System.out.println(message);
			// IStatus status = new Status(IStatus.INFO,
			// CommonModiscoActivator.PLUGIN_ID, message );
			// CommonModiscoActivator.getDefault().getLog().log(status);
		}
		MoDiscoResourceListenerGroup listenerGroup = getListenerGroup(uri);
		listenerGroup.notifyChange();
	}

	@Override
	public synchronized URIConverter getURIConverter() {
		if (this.uriConverter == null) {
			this.uriConverter = MoDiscoResourceSet.createURIConverter();
		}
		return this.uriConverter;
	}

	/**
	 * Create a URI converter that includes the {@link ModiscoURIHandler}
	 *
	 * @author nbros
	 */
	public static synchronized URIConverter createURIConverter() {
		final List<URIHandler> defaultHandlers = URIHandler.DEFAULT_HANDLERS;
		final List<URIHandler> uriHandlers = new ArrayList<URIHandler>();
		// note: disabling the default URI handler caused problems resolving
		// queries in the browser
		uriHandlers.add(new ModiscoURIHandler());
		uriHandlers.addAll(defaultHandlers);
		return new ExtensibleURIConverterImpl(uriHandlers,
				ContentHandler.Registry.INSTANCE.contentHandlers());
	}

	public synchronized void removeListener(final IMoDiscoResourceListener listener, final URI dependingResource) {
		for (MoDiscoResourceListenerGroup group : this.listenerGroupMap.values()) {
			group.remove(listener, dependingResource);
		}

	}

}
