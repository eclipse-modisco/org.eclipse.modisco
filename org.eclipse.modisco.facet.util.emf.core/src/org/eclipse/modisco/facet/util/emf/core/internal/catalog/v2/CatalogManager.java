/*******************************************************************************
 * Copyright (c) 2015, 2017 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model
 *    Thomas Cicognani (Mia-Software) - Bug 483684 - NullPointerException on CatalogManager
 *    Thomas Cicognani (Mia-Software) - Bug 482887 - CatalogManager create files with to long name
 *    Grégoire Dupé (Mia-Software) - Bug 482887 - CatalogManager create files with too long name
 *    Grégoire Dupé (Mia-Software) - Bug 516254 - CatalogManager must not return workspace entries from closed project
 *******************************************************************************/
package org.eclipse.modisco.facet.util.emf.core.internal.catalog.v2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.CatalogFactory;
import org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.InstallAndWokspaceCatalog;
import org.eclipse.modisco.facet.util.emf.core.catalog.ICatalogManager;
import org.eclipse.modisco.facet.util.emf.core.catalog.ICatalogManagerConfiguration;
import org.eclipse.modisco.facet.util.emf.core.internal.Activator;
import org.osgi.framework.Bundle;

final class CatalogManager implements ICatalogManager, Adapter {

	private static final String MODEL_DECL_EXT_PT = "org.eclipse.emf.facet.util.emf.core.modeldeclaration"; //$NON-NLS-1$
	private static final String FILE = "file"; //$NON-NLS-1$
	private final Map<Resource, Bundle> resourceToBundle = new HashMap<Resource, Bundle>();
	private final ICatalogManagerConfiguration catalogMgrconfig;
	private InstallAndWokspaceCatalog catalog;
	private final ResourceSet resourceSet;
	private final String catalogId;
	private Resource resource;

	public CatalogManager(final ICatalogManagerConfiguration catalogMgrconfig,
			final ResourceSet resourceSet, final String catalogId) {
		this.resourceSet = resourceSet;
		this.catalogMgrconfig = catalogMgrconfig;
		this.catalogId = catalogId;
		URI uri;
		if (catalogId == null) {
			final String uriStr = String.format("tmp://%s", //$NON-NLS-1$
					this.getClass().getName());
			uri = URI.createURI(uriStr);
		} else {
			final String uriStr = String.format("platform:/meta/%s/%s.xmi", //$NON-NLS-1$
					Activator.getDefault().getBundle().getSymbolicName(),
					catalogId);
			uri = URI.createURI(uriStr);
		}
		if (catalogId == null) {
			this.resource = this.resourceSet.createResource(uri);
		} else {
			try {
				this.resource = this.resourceSet.getResource(uri, true);
			} catch (org.eclipse.emf.common.util.WrappedException e) {
				if (!(e.getCause() instanceof FileNotFoundException)) {
					Logger.logError(e, Activator.getDefault());
				}
				this.resource = this.resourceSet.createResource(uri);
			}
		}
		if ((!this.resource.getContents().isEmpty())
				&& this.resource.getContents().get(0) instanceof InstallAndWokspaceCatalog) {
			this.catalog = (InstallAndWokspaceCatalog) this.resource.getContents().get(0);
			removeNotResolvedProxy(this.catalog.getWorkspaceEntries());
			removeNotResolvedProxy(this.catalog.getInstalledEntries());
		} else {
			this.catalog = CatalogFactory.eINSTANCE.createInstallAndWokspaceCatalog();
			EmfCommandUtils.executeAdd(this.resource, this.catalog);
		}
		initRegisteredEntries();
		CatalogListenerFactory.adaptResource(this.catalog, this.resource);
	}

	private void removeNotResolvedProxy(final EList<EObject> eObjects) {
		final List<EObject> toBeRemoved = new ArrayList<EObject>();
		for (EObject entry : eObjects) {
			if (entry.eIsProxy()) {
				toBeRemoved.add(entry);
			}
		}
		EmfCommandUtils.executeRemove(eObjects, toBeRemoved, this.resource);
	}

	private void initRegisteredEntries() {
		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		final IExtensionPoint modelDeclExtPoint = registry
				.getExtensionPoint(CatalogManager.MODEL_DECL_EXT_PT);
		if (modelDeclExtPoint != null) {
			for (IExtension ext : modelDeclExtPoint.getExtensions()) {
				for (IConfigurationElement configElt : ext.getConfigurationElements()) {
					final String filePath = configElt.getAttribute(CatalogManager.FILE);
					if (filePath != null) {
						final String pluginName = ext.getNamespaceIdentifier();
						final Bundle bundle = Platform.getBundle(pluginName);
						final URI uri = URI.createPlatformPluginURI(pluginName
								+ "/" + filePath, false); //$NON-NLS-1$
						try {
							final Resource resource = this.resourceSet.getResource(uri, true);
							this.resourceToBundle.put(resource, bundle);
							for (EObject root : resource.getContents()) {
								this.onInstalledModelFound(root);
							}
						} catch (Exception e) {
							Logger.logError(e, Activator.getDefault());
						}
					}
				}
			}
		}
	}

	private void onInstalledModelFound(final EObject root) {
		if (this.catalogMgrconfig.canBeManaged(root) && this.catalogMgrconfig.isValid(root)) {
			this.catalog.getInstalledEntries().add(root);
		}
	}

	public <T> List<T> getEntries(final Class<T> expectedClass) {
		final List<T> result = new ArrayList<T>();
		final List<T> filteredEntries = getInstalledEntries(expectedClass);
		result.addAll(filteredEntries);
		final List<T> wsEntriesFiltered = getWsEntries(expectedClass);
		result.addAll(wsEntriesFiltered);
		return result;
	}

	public <T> List<T> getWsEntries(final Class<T> expectedClass) {
		final List<T> result = new ArrayList<T>();
		for (EObject eObject : this.catalog.getWorkspaceEntries()) {
			if (expectedClass.isInstance(eObject)
					&& EmfUtils.isDataAccessible(eObject)) {
				@SuppressWarnings("unchecked")
				/*
				 * @SuppressWarnings("unchecked"): gdupe> Checked by the call of
				 * 'isInstance' in the 'if' statement
				 */
				final T tObject = (T) eObject;
				result.add(tObject);
			}
		}
		return result;
	}

	public <T> List<T> getInstalledEntries(final Class<T> expectedClass) {
		final List<T> result = new ArrayList<T>();
		for (EObject eObject : this.catalog.getInstalledEntries()) {
			if (expectedClass.isInstance(eObject)) {
				@SuppressWarnings("unchecked")
				/*
				 * @SuppressWarnings("unchecked"): gdupe> Checked by the call of
				 * 'isInstance' in the 'if' statement
				 */
				final T tObject = (T) eObject;
				result.add(tObject);
			}
		}
		return result;
	}

	public boolean addWsEntry(final EObject entry) {
		boolean result = false;
		if (this.catalogMgrconfig.canBeManaged(entry)
				&& this.catalogMgrconfig.isValid(entry)) {
			this.catalog.getWorkspaceEntries().add(entry);
			result = true;
		}
		return result;
	}

	public void removeWsEntry(final EObject entry) {
		this.catalog.getWorkspaceEntries().remove(entry);
	}

	public void removeAllWsEntries(final IProject project) {
		final List<EObject> toBeRemoved = new ArrayList<EObject>();
		final List<EObject> wsEntries = getWsEntries(EObject.class);
		for (EObject registered : wsEntries) {
			final Resource eResource = registered.eResource();
			if (eResource == null || registered.eIsProxy()) {
				/*
				 * Case where it is impossible to get the Resource (e.g. the
				 * linked object [registered] was deleted)
				 */
				toBeRemoved.add(registered);
			} else {
				final URI uri = eResource.getURI();
				final String uriStr = uri.toString();
				if (uriStr
						.startsWith("platform:/resource/" + project.getName())) { //$NON-NLS-1$
					toBeRemoved.add(registered);
				}
			}
		}
		this.catalog.getWorkspaceEntries().removeAll(toBeRemoved);
	}

	public String getCatalogId() {
		return this.catalogId;
	}

	public void notifyChanged(final Notification notification) {
		// Nothing to do
	}

	public Notifier getTarget() {
		return this.resourceSet;
	}

	public void setTarget(final Notifier newTarget) {
		// Nothing to do
	}

	public boolean isAdapterForType(final Object type) {
		return type == ICatalogManager.class;
	}
}
