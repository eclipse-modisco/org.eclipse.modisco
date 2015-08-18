/** 
 * Copyright (c) 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thomas Cicognani (Mia-Software) - Bug 470962 - Add shortcuts to activate customs
 *    Grégoire Dupé (Mia-Software) - Bug 470962 - Add shortcuts to activate customs
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.editor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.emf.facet.custom.ui.ICustomizationManagerProvider2.ICustomShortcut;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.emf.facet.efacet.ui.IFacetManagerProvider2.IFacetSetShortcut;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.modisco.infra.browser.editor.ui.internal.Activator;
import org.eclipse.modisco.infra.browser.editor.ui.internal.Messages;

public final class TreeEditorShortcutUtils {

	private TreeEditorShortcutUtils() {
		// DO NOTHING
	}

	public static List<ICustomShortcut> getCustomShortcuts(
			final ResourceSet resourceSet) {
		final List<ICustomShortcut> shortcuts = new ArrayList<ICustomShortcut>();
		addShortcut(resourceSet, shortcuts,
				"platform:/plugin/org.eclipse.emf.facet.ecore.ui/custom/hideDerivedReferences.custom", //$NON-NLS-1$
				Messages.TreeEditorShortcutUtils_CustomHideDerivedReferences);
		addShortcut(resourceSet, shortcuts,
				"platform:/plugin/org.eclipse.emf.facet.ecore.ui/custom/hideEmptyReferences.custom", //$NON-NLS-1$
				Messages.TreeEditorShortcutUtils_CustomHideEmptyReferences);
		addShortcut(resourceSet, shortcuts,
				"platform:/plugin/org.eclipse.emf.facet.ecore.ui/custom/linksCount.custom", //$NON-NLS-1$
				Messages.TreeEditorShortcutUtils_CustomShowLinksCount);
		return shortcuts;
	}

	private static void addShortcut(final ResourceSet resourceSet, 
			final List<ICustomShortcut> shortcuts, final String uri,
			final String menuItemLabel) {
		try {
			shortcuts.add(createCustomShortcut(resourceSet, uri, menuItemLabel));
		} catch (Exception e) {
			Logger.logError(e, Activator.getDefault());
		}
	}

	public static List<IFacetSetShortcut> getFacetSetShortcuts(
			final ResourceSet resourceSet) {
		return Collections.emptyList();
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
