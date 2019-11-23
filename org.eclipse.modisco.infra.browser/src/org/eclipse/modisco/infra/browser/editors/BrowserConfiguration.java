/*******************************************************************************
 * Copyright (c) 2008, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.editors;

import java.util.Collections;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.infra.browser.core.InstancesForMetaclasses;
import org.eclipse.modisco.infra.browser.core.ItemsFactoryEx;
import org.eclipse.modisco.infra.browser.queries.SelectedQueriesManager;
import org.eclipse.modisco.infra.browser.uicore.ChangeListener;
import org.eclipse.modisco.infra.browser.uicore.internal.AppearanceConfiguration;
import org.eclipse.swt.widgets.Display;

/** The configuration of a model editor, with access to the underlying data */
public class BrowserConfiguration {

	public static final int NOT_YET_ASKED = -2;

	private ResourceSet resourceSet;
	/** All the model elements by metaclass */
	private InstancesForMetaclasses instancesForMetaclasses;
	private EcoreBrowser editor;

	private SelectedQueriesManager selectedQueriesManager;

	/**
	 * The depth of referenced resources the user wants to load (
	 * <code>-1</code> means infinite, and <code>-2</code> means not yet asked)
	 */
	private int referencedResourcesLoadingDepth = BrowserConfiguration.NOT_YET_ASKED;

	private final AppearanceConfiguration appearanceConfiguration;

	public BrowserConfiguration(final EcoreBrowser editor) {
		this();
		this.editor = editor;
	}

	public BrowserConfiguration() {
		ItemsFactoryEx itemsFactory = new ItemsFactoryEx(this);
		this.appearanceConfiguration = new AppearanceConfiguration(itemsFactory);
	}

	public EcoreBrowser getEditor() {
		return this.editor;
	}

	public AppearanceConfiguration getAppearanceConfiguration() {
		return this.appearanceConfiguration;
	}

	public void setResourceSet(final ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}

	public ResourceSet getResourceSet() {
		return this.resourceSet;
	}

	public void setInstancesForMetaclasses(final InstancesForMetaclasses instancesForMetaclasses) {
		this.instancesForMetaclasses = instancesForMetaclasses;
	}

	public InstancesForMetaclasses getInstancesForMetaclasses() {
		return this.instancesForMetaclasses;
	}

	/** Clear the editor field */
	public void dispose() {
		this.editor = null;
	}

	/** @return the metamodel name or <code>null</code> if not found */
	public String getMetamodelName() {
		final String nsURI = getMetamodelURI();
		if (nsURI != null) {
			final String[] parts = nsURI.split("/"); //$NON-NLS-1$
			if (parts.length > 0) {
				return parts[parts.length - 1];
			}
		}
		return null;
	}

	/**
	 * @return the NsURI of the metamodel corresponding to an element in the
	 *         first resource or <code>null</code> if not found
	 */
	public String getMetamodelURI() {
		final EList<Resource> resources = this.resourceSet.getResources();
		if (resources.size() > 0) {
			final Resource firstResource = resources.get(0);
			final EList<EObject> contents = firstResource.getContents();
			if (contents.size() > 0) {
				final EObject firstElement = contents.get(0);
				final EClass eClass = firstElement.eClass();
				if (eClass != null) {
					final EPackage ePackage = eClass.getEPackage();
					if (ePackage != null) {
						return ePackage.getNsURI();
					}
				}
			}
		}

		return null;
	}

	private Set<Resource> browsedResources;

	public void setSelectedQueriesManager(final SelectedQueriesManager selectedQueriesManager) {
		this.selectedQueriesManager = selectedQueriesManager;
		getAppearanceConfiguration().touch();
		this.selectedQueriesManager.addChangeListener(new ChangeListener() {
			public void changed() {
				getAppearanceConfiguration().touch();
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						BrowserConfiguration.this.editor.refreshDelayed(false);
					}
				});

			}
		});
	}

	public SelectedQueriesManager getSelectedQueriesManager() {
		return this.selectedQueriesManager;
	}

	/**
	 * Set the list of resources browsed in the editor, so that the list of
	 * metaclasses can be computed once and for all.
	 */
	public void setBrowsedResources(final Set<Resource> browsedResources) {
		this.browsedResources = browsedResources;
		getAppearanceConfiguration().touch();
	}

	public Set<Resource> getBrowsedResources() {
		if (this.browsedResources != null) {
			return Collections.unmodifiableSet(this.browsedResources);
		}
		return null;
	}

	public void addBrowsedResource(final Resource resource) {
		this.browsedResources.add(resource);
		getAppearanceConfiguration().touch();
	}

	public void removeBrowsedResource(final Resource resource) {
		this.browsedResources.remove(resource);
		getAppearanceConfiguration().touch();
	}

	public void setReferencedResourcesLoadingDepth(final int referencedResourcesLoadingDepth) {
		this.referencedResourcesLoadingDepth = referencedResourcesLoadingDepth;
		getAppearanceConfiguration().touch();
	}

	/**
	 * The depth of referenced resources the user wants to load (
	 * <code>-1</code> means infinite, and <code>-2</code> means not yet asked)
	 */
	public int getReferencedResourcesLoadingDepth() {
		return this.referencedResourcesLoadingDepth;
	}

}
