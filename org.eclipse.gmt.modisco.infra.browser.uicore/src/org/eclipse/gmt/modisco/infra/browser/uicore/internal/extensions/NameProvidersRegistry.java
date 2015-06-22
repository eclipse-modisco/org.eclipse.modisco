/*******************************************************************************
 * Copyright (c) 2008, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    
 *******************************************************************************/

package org.eclipse.gmt.modisco.infra.browser.uicore.internal.extensions;

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
import org.eclipse.gmt.modisco.infra.browser.uicore.extensions.naming.FilteredNameProvider;
import org.eclipse.gmt.modisco.infra.browser.uicore.extensions.naming.NameProvider;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.Activator;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.Messages;
import org.eclipse.gmt.modisco.infra.common.core.internal.extensions.AbstractRegistry;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;

/**
 * The singleton registry of name providers, which initializes the registry by
 * reading extensions when first accessed. It can provide names for model
 * elements, using {@link NameProvider}s provided through the naming extension
 * point.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class NameProvidersRegistry extends AbstractRegistry {

	private static final String METACLASS_ELEMENT = "metaclass"; //$NON-NLS-1$
	private static final String EXTENSION_POINT_NAMESPACE = "org.eclipse.gmt.modisco.infra.browser.uicore"; //$NON-NLS-1$
	private static final String EXTENSION_POINT_NAME = "naming"; //$NON-NLS-1$
	private static final String METAMODEL_ID_ATTRIBUTE = "id"; //$NON-NLS-1$
	private static final String METAMODEL_ELEMENT = "metamodel"; //$NON-NLS-1$
	private static final String NAME_PROVIDER_ELEMENT = "nameProvider"; //$NON-NLS-1$
	private static final String NAME_PROVIDER_CLASS = "class"; //$NON-NLS-1$
	private static final String FILTER_ELEMENT = "filter"; //$NON-NLS-1$
	private static final String METACLASS_NAME_ATTRIBUTE = "name"; //$NON-NLS-1$

	private static NameProvidersRegistry instance = null;

	/**
	 * A map of metamodels to lists of FilteredNameProvider that provide names
	 * for the metamodel's instances
	 */
	private final Map<String, List<FilteredNameProvider>> nameProviders = new HashMap<String, List<FilteredNameProvider>>();

	public static NameProvidersRegistry getInstance() {
		if (NameProvidersRegistry.instance == null) {
			NameProvidersRegistry.instance = new NameProvidersRegistry();
		}
		return NameProvidersRegistry.instance;
	}

	public NameProvidersRegistry() {
		initialize();
	}

	/**
	 * Query the name providers registry for a name for the given
	 * {@link EObject}.
	 * 
	 * @param eObject
	 *            the model instance whose name is queried
	 * 
	 * @return the name or <code>null</code> if no name was provided
	 */
	public String getName(final EObject eObject) {
		final EClass eClass = eObject.eClass();
		if (eClass == null) {
			return null;
		}

		final String metaclassQualifiedName = ModelUtils.getMetaclassQualifiedName(eClass);

		// the nsURI of the package containing the metamodel definition
		final EPackage ePackage = eClass.getEPackage();
		if (ePackage == null) {
			return null;
		}

		final String nsURI = ePackage.getNsURI();

		List<FilteredNameProvider> filteredNameProviders = this.nameProviders.get(nsURI);
		if (filteredNameProviders == null) {
			// try to retrieve a generic name provider
			filteredNameProviders = this.nameProviders.get("*"); //$NON-NLS-1$
			if (filteredNameProviders == null) {
				return null;
			}
		}

		for (final FilteredNameProvider filteredNameProvider : filteredNameProviders) {
			if (filteredNameProvider.filter(metaclassQualifiedName)) {
				final String name = filteredNameProvider.getName(eObject);
				if (name != null) {
					return name;
				}
			}
		}
		return null;
	}

	@Override
	protected String getExtensionPointName() {
		return NameProvidersRegistry.EXTENSION_POINT_NAME;
	}

	@Override
	protected String getExtensionPointNamespace() {
		return NameProvidersRegistry.EXTENSION_POINT_NAMESPACE;
	}

	@Override
	protected void handleRootElement(final IConfigurationElement configurationElement) {
		final String name = configurationElement.getName();
		if (name.equalsIgnoreCase(NameProvidersRegistry.METAMODEL_ELEMENT)) {
			readMetamodelElement(configurationElement);
		} else {
			logUnknownElement(configurationElement);
		}
	}

	/** Read a 'metamodel' element */
	private void readMetamodelElement(final IConfigurationElement configurationElement) {
		final String metamodelId = configurationElement
				.getAttribute(NameProvidersRegistry.METAMODEL_ID_ATTRIBUTE);
		if (metamodelId == null) {
			logMissingAttribute(configurationElement, NameProvidersRegistry.METAMODEL_ID_ATTRIBUTE);
			return;
		}

		final IConfigurationElement[] children = configurationElement.getChildren();
		for (final IConfigurationElement child : children) {
			final String name = child.getName();
			if (name.equalsIgnoreCase(NameProvidersRegistry.NAME_PROVIDER_ELEMENT)) {
				readNameProviderElement(child, metamodelId);
			} else {
				logUnknownElement(configurationElement);
			}
		}

	}

	/**
	 * Read a 'nameProvider' element, and adds the name providers to the
	 * registry.
	 * 
	 * @param configurationElement
	 *            the 'nameProvider' element
	 * @param metamodelId
	 *            the nsURI of the package containing the metamodel's
	 *            metaclasses
	 */
	private void readNameProviderElement(final IConfigurationElement configurationElement,
			final String metamodelId) {

		// if not null, filters on the metaclass name
		HashSet<String> filteredMetaclasses = null;

		final IConfigurationElement[] filterElements = configurationElement
				.getChildren(NameProvidersRegistry.FILTER_ELEMENT);
		if (filterElements.length > 0) {
			// optional element : 0 or 1
			final IConfigurationElement[] metaclassElements = filterElements[0]
					.getChildren(NameProvidersRegistry.METACLASS_ELEMENT);
			for (final IConfigurationElement metaclassElement : metaclassElements) {
				final String metaclassName = metaclassElement
						.getAttribute(NameProvidersRegistry.METACLASS_NAME_ATTRIBUTE);
				if (metaclassName != null) {
					if (filteredMetaclasses == null) {
						filteredMetaclasses = new HashSet<String>();
					}
					filteredMetaclasses.add(metaclassName);
				}
			}
		}

		final HashSet<String> fFilteredMetaclasses = filteredMetaclasses;

		Object nameProviderObject;
		try {
			nameProviderObject = configurationElement
					.createExecutableExtension(NameProvidersRegistry.NAME_PROVIDER_CLASS);
		} catch (final CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
			return;
		}
		if (nameProviderObject == null) {
			logMissingAttribute(configurationElement, NameProvidersRegistry.NAME_PROVIDER_CLASS);
			return;
		}

		List<FilteredNameProvider> filteredNameProviders = this.nameProviders.get(metamodelId);
		if (filteredNameProviders == null) {
			filteredNameProviders = new ArrayList<FilteredNameProvider>();
		}

		/*
		 * The user can either provide a FilteredNameProvider or a NameProvider.
		 * In either case, if a filter is set in the extension definition, then
		 * it will get applied before the user code is called.
		 */
		if (nameProviderObject instanceof FilteredNameProvider) {
			final FilteredNameProvider filteredNameProvider = (FilteredNameProvider) nameProviderObject;
			filteredNameProviders.add(new FilteredNameProvider() {

				public String getName(final EObject eObject) {
					return filteredNameProvider.getName(eObject);
				}

				public boolean filter(final String metaclass) {
					if (fFilteredMetaclasses != null && !fFilteredMetaclasses.contains(metaclass)) {
						return false;
					}
					return filteredNameProvider.filter(metaclass);
				}
			});
		} else if (nameProviderObject instanceof NameProvider) {
			final NameProvider nameProvider = (NameProvider) nameProviderObject;

			final FilteredNameProvider filteredNameProvider = new FilteredNameProvider() {

				public String getName(final EObject eObject) {
					return nameProvider.getName(eObject);
				}

				public boolean filter(final String metaclass) {
					if (fFilteredMetaclasses == null) {
						return true;
					}
					return fFilteredMetaclasses.contains(metaclass);
				}
			};
			filteredNameProviders.add(filteredNameProvider);
		} else {
			logError(configurationElement, Messages.NameProvidersRegistry_notANameProvider);
		}
		this.nameProviders.put(metamodelId, filteredNameProviders);
	}
}
