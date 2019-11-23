/*******************************************************************************
 * Copyright (c) 2009, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.uicore.internal.extensions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.modisco.infra.browser.uicore.extensions.icons.FilteredIconProvider;
import org.eclipse.modisco.infra.browser.uicore.extensions.icons.IconProvider;
import org.eclipse.modisco.infra.browser.uicore.internal.Activator;
import org.eclipse.modisco.infra.browser.uicore.internal.Messages;
import org.eclipse.modisco.infra.common.core.internal.extensions.AbstractRegistry;
import org.eclipse.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.swt.graphics.Image;

/**
 * The singleton registry of name providers, which initializes the registry by
 * reading extensions when first accessed. It can provide names for model
 * elements, using {@link IconProvider}s provided through the naming extension
 * point.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class IconProvidersRegistry extends AbstractRegistry {

	private static final String METACLASS_ELEMENT = "metaclass"; //$NON-NLS-1$
	private static final String EXTENSION_POINT_NAMESPACE = "org.eclipse.modisco.infra.browser.uicore"; //$NON-NLS-1$
	private static final String EXTENSION_POINT_NAME = "icons"; //$NON-NLS-1$
	private static final String METAMODEL_ID_ATTRIBUTE = "id"; //$NON-NLS-1$
	private static final String METAMODEL_ELEMENT = "metamodel"; //$NON-NLS-1$
	private static final String ICON_PROVIDER_ELEMENT = "iconProvider"; //$NON-NLS-1$
	private static final String ICON_PROVIDER_CLASS = "class"; //$NON-NLS-1$
	private static final String FILTER_ELEMENT = "filter"; //$NON-NLS-1$
	private static final String METACLASS_NAME_ATTRIBUTE = "name"; //$NON-NLS-1$

	private static IconProvidersRegistry instance = null;

	/**
	 * A map of metamodels to lists of FilteredIconProvider that provide icons
	 * for the metamodel's instances
	 */
	private final Map<String, List<FilteredIconProvider>> iconProviders = new HashMap<String, List<FilteredIconProvider>>();

	public static IconProvidersRegistry getInstance() {
		if (IconProvidersRegistry.instance == null) {
			IconProvidersRegistry.instance = new IconProvidersRegistry();
		}
		return IconProvidersRegistry.instance;
	}

	public IconProvidersRegistry() {
		initialize();
	}

	@Override
	protected String getExtensionPointName() {
		return IconProvidersRegistry.EXTENSION_POINT_NAME;
	}

	@Override
	protected String getExtensionPointNamespace() {
		return IconProvidersRegistry.EXTENSION_POINT_NAMESPACE;
	}

	/**
	 * Query the icon providers registry for an icon for the given
	 * {@link EObject}.
	 *
	 * @param eObject
	 *            the model instance whose icon is queried
	 *
	 * @return the icon or <code>null</code> if no icon was provided
	 */
	public Image getIcon(final EObject eObject) {
		final EClass eClass = eObject.eClass();
		if (eClass == null) {
			return null;
		}

		final String metaclassQualifiedName = ModelUtils.getMetaclassQualifiedName(eClass);

		// find the nsURI of the package containing the metamodel definition
		final EPackage ePackage = eClass.getEPackage();
		if (ePackage == null) {
			return null;
		}
		final String nsURI = ePackage.getNsURI();

		List<FilteredIconProvider> filteredIconProviders = this.iconProviders.get(nsURI);
		if (filteredIconProviders == null) {
			// try to retrieve a generic icon provider
			filteredIconProviders = this.iconProviders.get("*"); //$NON-NLS-1$
			if (filteredIconProviders == null) {
				return null;
			}
		}
		for (final FilteredIconProvider filteredIconProvider : filteredIconProviders) {
			if (filteredIconProvider.filter(metaclassQualifiedName)) {
				final Image icon = filteredIconProvider.getIcon(eObject);
				if (icon != null) {
					return icon;
				}
			}
		}
		return null;
	}

	@Override
	protected void handleRootElement(final IConfigurationElement configurationElement) {
		final String name = configurationElement.getName();
		if (name.equalsIgnoreCase(IconProvidersRegistry.METAMODEL_ELEMENT)) {
			readMetamodelElement(configurationElement);
		} else {
			logUnknownElement(configurationElement);
		}
	}

	/** Read a 'metamodel' element */
	private void readMetamodelElement(final IConfigurationElement configurationElement) {
		final String metamodelId = configurationElement
				.getAttribute(IconProvidersRegistry.METAMODEL_ID_ATTRIBUTE);
		if (metamodelId == null) {
			logMissingAttribute(configurationElement, IconProvidersRegistry.METAMODEL_ID_ATTRIBUTE);
			return;
		}

		final IConfigurationElement[] children = configurationElement.getChildren();
		for (final IConfigurationElement child : children) {
			final String name = child.getName();
			if (name.equalsIgnoreCase(IconProvidersRegistry.ICON_PROVIDER_ELEMENT)) {
				readIconProviderElement(child, metamodelId);
			} else {
				logUnknownElement(configurationElement);
			}
		}

	}

	/**
	 * Read an 'iconProvider' element, and adds the icon providers to the
	 * registry.
	 *
	 * @param configurationElement
	 *            the 'iconProvider' element
	 * @param metamodelId
	 *            the nsURI of the package containing the metamodel's
	 *            metaclasses
	 */
	private void readIconProviderElement(final IConfigurationElement configurationElement,
			final String metamodelId) {

		// if not null, filters on the metaclass name
		HashSet<String> filteredMetaclasses = null;

		final IConfigurationElement[] filterElements = configurationElement
				.getChildren(IconProvidersRegistry.FILTER_ELEMENT);
		if (filterElements.length > 0) {
			// optional element : 0 or 1
			final IConfigurationElement[] metaclassElements = filterElements[0]
					.getChildren(IconProvidersRegistry.METACLASS_ELEMENT);
			for (final IConfigurationElement metaclassElement : metaclassElements) {
				final String metaclassName = metaclassElement
						.getAttribute(IconProvidersRegistry.METACLASS_NAME_ATTRIBUTE);
				if (metaclassName != null) {
					if (filteredMetaclasses == null) {
						filteredMetaclasses = new HashSet<String>();
					}
					filteredMetaclasses.add(metaclassName);
				}
			}
		}

		final HashSet<String> fFilteredMetaclasses = filteredMetaclasses;

		Object iconProviderObject;
		try {
			iconProviderObject = configurationElement
					.createExecutableExtension(IconProvidersRegistry.ICON_PROVIDER_CLASS);
		} catch (final CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
			return;
		}
		if (iconProviderObject == null) {
			logMissingAttribute(configurationElement, IconProvidersRegistry.ICON_PROVIDER_CLASS);
			return;
		}

		List<FilteredIconProvider> filteredIconProviders = this.iconProviders.get(metamodelId);
		if (filteredIconProviders == null) {
			filteredIconProviders = new ArrayList<FilteredIconProvider>();
		}

		/*
		 * The user can either provide a FilteredIconProvider or an
		 * IconProvider. In either case, if a filter is set in the extension
		 * definition, then it will get applied before the user code is called.
		 */
		if (iconProviderObject instanceof FilteredIconProvider) {
			final FilteredIconProvider filteredIconProvider = (FilteredIconProvider) iconProviderObject;
			filteredIconProviders.add(new FilteredIconProvider() {

				public Image getIcon(final EObject object) {
					return filteredIconProvider.getIcon(object);
				}

				public boolean filter(final String metaclass) {
					if (fFilteredMetaclasses != null && !fFilteredMetaclasses.contains(metaclass)) {
						return false;
					}
					return filteredIconProvider.filter(metaclass);
				}
			});
		} else if (iconProviderObject instanceof IconProvider) {
			final IconProvider iconProvider = (IconProvider) iconProviderObject;

			final FilteredIconProvider filteredNameProvider = new FilteredIconProvider() {

				public Image getIcon(final EObject object) {
					return iconProvider.getIcon(object);
				}

				public boolean filter(final String metaclass) {
					if (fFilteredMetaclasses == null) {
						return true;
					}
					return fFilteredMetaclasses.contains(metaclass);
				}
			};
			filteredIconProviders.add(filteredNameProvider);
		} else {
			logError(configurationElement, Messages.IconProvidersRegistry_notAnIconProvider);
		}
		this.iconProviders.put(metamodelId, filteredIconProviders);
	}
}
