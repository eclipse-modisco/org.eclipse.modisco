/**
 * Copyright (c) 2015 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Thomas Cicognani (Mia-Software) - Bug 470962 - Add shortcuts to activate customs
 */
package org.eclipse.modisco.infra.browser.ecore.ui.internal.widget;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.modisco.facet.custom.ui.ICustomizationManagerProvider2.ICustomShortcut;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.modisco.facet.efacet.ui.IFacetManagerProvider2.IFacetSetShortcut;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.Activator;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.Messages;
import org.osgi.framework.Bundle;

public final class EcoreExplorerShortcutUtils {

	private EcoreExplorerShortcutUtils() {
		// DO NOTHING
	}

	public static List<ICustomShortcut> getCustomShortcuts(
			final ResourceSet resourceSet) {
		final List<ICustomShortcut> shortcuts = new ArrayList<ICustomShortcut>();
		final Bundle bundle = Activator.getDefault().getBundle();
		final String bundleName = bundle.getSymbolicName();

		final String uriStr = String
				.format("platform:/plugin/%s/custom/nbInstancesEClassByResource.custom", //$NON-NLS-1$
						bundleName);
		shortcuts
				.add(createCustomShortcut(
						resourceSet,
						uriStr,
						Messages.EcoreExplorerShortcutUtils_NbInstancesEClassByResource));

		final String uriStr2 = String
				.format("platform:/plugin/%s/custom/nbInstancesEClassByResourceSet.custom", //$NON-NLS-1$
						bundleName);
		shortcuts
				.add(createCustomShortcut(
						resourceSet,
						uriStr2,
						Messages.EcoreExplorerShortcutUtils_NbInstancesEClassByResourceSet));

		shortcuts
				.add(createCustomShortcut(
						resourceSet,
						"platform:/plugin/org.eclipse.modisco.infra.browser.ecore.core/custom/ePackageContainsEClass.custom", //$NON-NLS-1$
						Messages.EcoreExplorerShortcutUtils_EClassFromEPackage));

		shortcuts
				.add(createCustomShortcut(
						resourceSet,
						"platform:/plugin/org.eclipse.modisco.infra.browser.ecore.core/custom/hierarchicalEClass.custom", //$NON-NLS-1$
						Messages.EcoreExplorerShortcutUtils_EClassHierarchy));

		return shortcuts;
	}

	public static List<IFacetSetShortcut> getFacetSetShortcuts(
			final ResourceSet resourceSet) {
		final List<IFacetSetShortcut> shortcuts = new ArrayList<IFacetSetShortcut>();

		shortcuts
				.add(createFacetSetShortcut(
						resourceSet,
						"platform:/plugin/org.eclipse.modisco.infra.browser.ecore.core/facet/hierarchicalEClass.efacet", //$NON-NLS-1$
						Messages.EcoreExplorerShortcutUtils_EClassSubclasses));

		return shortcuts;
	}

	private static ICustomShortcut createCustomShortcut(
			final ResourceSet resourceSet, final String uriStr,
			final String label) {
		return createCustomShortcut(resourceSet, uriStr, label, null);
	}

	private static ICustomShortcut createCustomShortcut(
			final ResourceSet resourceSet, final String uriStr,
			final String label, final ImageDescriptor icon) {
		final Customization custom = (Customization) getObjectFromURI(uriStr,
				resourceSet);
		return new ICustomShortcut() {
			public String getLabel() {
				return label;
			}

			public Customization getCustom() {
				return custom;
			}

			public ImageDescriptor getIcon() {
				return icon;
			}
		};
	}

	private static IFacetSetShortcut createFacetSetShortcut(
			final ResourceSet resourceSet, final String uriStr,
			final String label) {
		return createFacetSetShortcut(resourceSet, uriStr, label, null);
	}

	private static IFacetSetShortcut createFacetSetShortcut(
			final ResourceSet resourceSet, final String uriStr,
			final String label, final ImageDescriptor icon) {
		final FacetSet facetSet = (FacetSet) getObjectFromURI(uriStr,
				resourceSet);
		return new IFacetSetShortcut() {
			public String getLabel() {
				return label;
			}

			public FacetSet getFacetSet() {
				return facetSet;
			}

			public ImageDescriptor getIcon() {
				return icon;
			}
		};
	}

	private static EObject getObjectFromURI(final String uriStr,
			final ResourceSet resourceSet) {
		final URI uri = URI.createURI(uriStr);
		final Resource resource = resourceSet.getResource(uri, true);
		final EList<EObject> contents = resource.getContents();
		return contents.get(0);
	}
}
