/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.gmt.modisco.infra.browser.custom.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.gmt.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomPackage;
import org.eclipse.gmt.modisco.infra.browser.custom.validation.EValidatorAdapter;
import org.eclipse.gmt.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog;
import org.eclipse.gmt.modisco.infra.common.core.internal.builder.EcoreCatalog;
import org.eclipse.gmt.modisco.infra.common.core.internal.resource.IMoDiscoResourceListener;
import org.eclipse.gmt.modisco.infra.common.core.internal.resource.MoDiscoResourceListenerGroup;
import org.eclipse.gmt.modisco.infra.common.core.internal.resource.MoDiscoResourceSet;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.gmt.modisco.infra.common.core.internal.validation.ValidationJob;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.facet.FacetSet;
import org.eclipse.gmt.modisco.infra.facet.core.FacetSetCatalog;
import org.eclipse.gmt.modisco.infra.query.core.ModelQuerySetCatalog;

/**
 * A catalog of customization files found in the Workspace and registered
 * through the extension point
 * <code>org.eclipse.gmt.modisco.infra.browser.custom.registration</code>. It is
 * updated by the {@link CustomizationsBuilder}, which is responsible for adding
 * and removing customization files in response to changes in the Workspace.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class CustomizationsCatalog extends AbstractMoDiscoCatalog {

	public static final String REGISTRATION_EXTENSION_POINT_ID = "org.eclipse.gmt.modisco.infra.browser.custom.core.registration"; //$NON-NLS-1$
	public static final String FILE_EXTENSION = "uiCustom"; //$NON-NLS-1$
	private static CustomizationsCatalog instance = null;

	public static synchronized CustomizationsCatalog getInstance() {
		if (CustomizationsCatalog.instance == null) {
			EcoreCatalog.getSingleton();
			ModelQuerySetCatalog.getSingleton();
			FacetSetCatalog.getSingleton();
			CustomizationsCatalog.instance = new CustomizationsCatalog();
			EValidator validator = EValidator.Registry.INSTANCE
					.getEValidator(UicustomPackage.eINSTANCE);
			if (validator == null) {
				// Registers the validator adapter in the EMF validator registry
				EValidator.Registry.INSTANCE
						.put(UicustomPackage.eINSTANCE, new EValidatorAdapter());
			}
		}
		return CustomizationsCatalog.instance;
	}

	public CustomizationsCatalog() {
		super();
	}

	@Override
	protected String getRootObjectName(final EObject rootObject) {
		return ((MetamodelView) rootObject).getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getRootObjectNsUri(final EObject rootObject) {
		return "modisco:/customization/" + ((MetamodelView) rootObject).getName(); //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Class<?> getRootClass() {
		return MetamodelView.class;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getRegistryExtensionPoint() {
		return CustomizationsCatalog.REGISTRATION_EXTENSION_POINT_ID;
	}

	public synchronized Collection<MetamodelView> getAllCustomizations() {
		Collection<MetamodelView> result = new ArrayList<MetamodelView>();
		for (EObject eObject : getAllRootObjects()) {
			if (eObject instanceof MetamodelView && eObject.eResource() != null) {
				MetamodelView metamodelView = (MetamodelView) eObject;
				if (metamodelView.getName() != null) {
					metamodelView.setLocation(getURI(metamodelView.getName()).toString());
					result.add(metamodelView);
				} else {
					MoDiscoLogger.logError("MetamodelView with null name", Activator.getDefault()); //$NON-NLS-1$
				}
			}
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getMoDiscoSubProtocol() {
		return "customization"; //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.gmt.modisco.infra.common.core.builder.AbstractMoDiscoCatalog#
	 * getActivator()
	 */
	@Override
	protected Plugin getActivator() {
		return Activator.getDefault();
	}

	@Override
	public String getFileExtension() {
		return CustomizationsCatalog.FILE_EXTENSION;
	}

	@Override
	protected void preRemove(final IFile declarationFile, final String pathName,
			final EObject oldRootObject) {
		// Empty
	}

	@Override
	protected synchronized void postOpenResource(final URI uri, final IFile file, final EObject root) {
		// add a listener to referenced FacetSets, so that when the FacetSet is
		// modified, the customization is revalidated
		try {
			addListenerToReferedResources((MetamodelView) root, new IMoDiscoResourceListener() {
				public void aListenedResourceHasChanged(final URI resourceUri,
						final URI dependingResourceURI) {
					if (root.eResource() != null) {
						ValidationJob.getInstance().validateAsync(root.eResource(), file, null);
					}
				}
			});
		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	private synchronized void addListenerToReferedResources(final MetamodelView metamodelView,
			final IMoDiscoResourceListener listener) throws Exception {
		final String metamodelURI = metamodelView.getMetamodelURI();
		if (metamodelURI == null || metamodelView.eResource() == null) {
			return;
		}
		final URI resourceURI = metamodelView.eResource().getURI();

		FacetSetCatalog.getSingleton();
		// Add listener from Customization to FacetSet
		AbstractMoDiscoCatalog.whenBuilt(new Runnable() {
			public void run() {
				Collection<FacetSet> allFacetSets = FacetSetCatalog.getSingleton()
						.getAllFacetSets();
				for (FacetSet facetSet : allFacetSets) {
					if (metamodelURI.equals(facetSet.getNsURI())) {
						MoDiscoResourceListenerGroup listenerGroup = MoDiscoResourceSet
								.getResourceSetSingleton().getListenerGroup(
										URI.createURI(metamodelURI));
						listenerGroup.addListener(listener, resourceURI);
					}
				}
			}
		});
	}

	/**
	 * Loads and returns a list of default customizations registered through the
	 * "registry" extension point.
	 */
	public List<MetamodelView> getRegistryDefaultCustomizations() {
		final List<MetamodelView> metamodelViews = new ArrayList<MetamodelView>();
		for (final MetamodelView metamodelView : getAllCustomizations()) {
			if (isDefaultCustomization(metamodelView.getName())) {
				metamodelViews.add(metamodelView);
			}
		}
		return metamodelViews;
	}

	private Set<String> defaultCustomizations = null;

	private synchronized boolean isDefaultCustomization(final String name) {
		if (this.defaultCustomizations == null) {
			this.defaultCustomizations = new HashSet<String>();
			try {
				final IConfigurationElement[] configurationElements = Platform
						.getExtensionRegistry().getConfigurationElementsFor(
								CustomizationsCatalog.REGISTRATION_EXTENSION_POINT_ID);

				for (final IConfigurationElement configurationElement : configurationElements) {
					final String fileAttribute = configurationElement.getAttribute("file"); //$NON-NLS-1$
					if (fileAttribute == null) {
						Activator
								.logError("Missing 'file' attribute in customization registration extension"); //$NON-NLS-1$
						continue;
					}
					String loadByDefaultAttribute = configurationElement
							.getAttribute("loadByDefault"); //$NON-NLS-1$
					if (loadByDefaultAttribute != null
							&& loadByDefaultAttribute
									.equalsIgnoreCase(String.valueOf(Boolean.TRUE))) {
						String fileName = new Path(fileAttribute).removeFileExtension()
								.lastSegment();
						this.defaultCustomizations.add(fileName);
					}
				}
			} catch (final Exception e) {
				Activator.logException(e);
			}
		}
		return this.defaultCustomizations.contains(name);
	}

	/** Loads and returns a list of customizations found in the Workspace. */
	public List<MetamodelView> getWorkspaceCustomizations() {
		final List<MetamodelView> metamodelViews = new ArrayList<MetamodelView>();
		for (final MetamodelView metamodelView : getAllCustomizations()) {
			URI uri = URI.createURI(metamodelView.getLocation());
			if (uri.isPlatformResource()) {
				metamodelViews.add(metamodelView);
			}
		}
		return metamodelViews;
	}

	/**
	 * Loads and returns a list of customizations registered through the
	 * "registry" extension point.
	 */
	public List<MetamodelView> getRegistryCustomizations() {
		final List<MetamodelView> metamodelViews = new ArrayList<MetamodelView>();
		for (final MetamodelView metamodelView : getAllCustomizations()) {
			URI uri = URI.createURI(metamodelView.getLocation());
			if (uri.isPlatformPlugin()) {
				metamodelViews.add(metamodelView);
			}
		}
		return metamodelViews;
	}

	/**
	 * This method returns the customization with the given name.
	 *
	 * @param name
	 *            the name of a resource contained in the catalog
	 * @return return a customization
	 */
	public MetamodelView getCustomization(final String name) {
		return (MetamodelView) getRootObject(name);
	}

	/**
	 * Returns the subset of the given customizations that apply to the given
	 * metamodel
	 */
	public static Collection<MetamodelView> filterForMetamodel(
			final Collection<MetamodelView> allCustomizations, final Collection<EPackage> ePackages) {
		List<MetamodelView> filteredCustomizations = new ArrayList<MetamodelView>();

		// show only Customizations corresponding to the current EPackages or
		// referenced EPackages
		final Set<EPackage> allReferencedPackages = new HashSet<EPackage>();

		for (EPackage ePackage : ePackages) {
			allReferencedPackages.add(ePackage);
			final Set<EPackage> referencedPackages = ModelUtils.computeReferencedPackages(ePackage);
			allReferencedPackages.addAll(referencedPackages);
		}

		for (MetamodelView metamodelView : allCustomizations) {
			String nsURI = metamodelView.getMetamodelURI();
			EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsURI);
			while (ePackage != null) {
				if (allReferencedPackages.contains(ePackage)) {
					filteredCustomizations.add(metamodelView);
					break;
				}
				// allow customizations on Facets
				if (ePackage instanceof FacetSet) {
					FacetSet facetSet = (FacetSet) ePackage;
					ePackage = facetSet.getExtendedPackage();
				} else {
					// allow customizations on sub-packages
					ePackage = ePackage.getESuperPackage();
				}
			}
		}
		return filteredCustomizations;
	}
}
