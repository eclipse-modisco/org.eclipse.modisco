/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.browser.editors.BrowserConfiguration;
import org.eclipse.modisco.infra.browser.editors.EcoreBrowser;
import org.eclipse.modisco.infra.browser.editors.table.TableEditor;
import org.eclipse.modisco.infra.browser.editors.table.TableEditorFactory;
import org.eclipse.modisco.infra.browser.uicore.internal.model.LinkItem;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipse.osgi.util.NLS;

public class OpenTableEditorAction extends Action {

	private final IBrowserActionBarContributor browserActionBarContributor;

	public OpenTableEditorAction(final IBrowserActionBarContributor browserActionBarContributor) {
		super(Messages.openTableEditorOnSelection);
		this.browserActionBarContributor = browserActionBarContributor;
	}

	@Override
	public void run() {
		EcoreBrowser browser = this.browserActionBarContributor.getBrowser();
		if (browser != null) {
			final ISelection selection = this.browserActionBarContributor.getSelection();

			if (selection instanceof IStructuredSelection) {
				final IStructuredSelection structuredSelection = (IStructuredSelection) selection;

				if (structuredSelection.size() == 1
						&& structuredSelection.getFirstElement() instanceof LinkItem) {
					final LinkItem linkItemProvider = (LinkItem) structuredSelection
							.getFirstElement();

					openOn(browser.getBrowserConfiguration(), linkItemProvider);
				} else {
					openOn(browser.getBrowserConfiguration(), structuredSelection);
				}
			}
		}
	}

	private void openOn(final BrowserConfiguration browserConfiguration, final LinkItem linkItem) {
		final Collection<Object> childrenElements = linkItem.getChildrenElements();
		final List<Object> elementsList = new ArrayList<Object>(childrenElements);

		final String description = TableEditor.getEditorDescriptionFor(linkItem.getParent(),
				linkItem.getReference(), browserConfiguration);
		TableEditorFactory.getInstance().openOn(browserConfiguration, elementsList, description);
	}

	private void openOn(final BrowserConfiguration browserConfiguration,
			final IStructuredSelection structuredSelection) {

		final List<EObject> elements = new ArrayList<EObject>();
		final Iterator<?> iterator = structuredSelection.iterator();
		while (iterator.hasNext()) {
			final Object selectedElement = iterator.next();
			if (selectedElement instanceof ModelElementItem) {
				final ModelElementItem modelElementItem = (ModelElementItem) selectedElement;
				elements.add(modelElementItem.getEObject());
			} else {
				MoDiscoBrowserPlugin
						.logWarning(Messages.EcoreActionBarContributor_cannotOpenTableEditorNotModelElements);
				return;
			}
		}

		String description;
		final String metamodelName = browserConfiguration.getMetamodelName();
		if (metamodelName != null) {
			description = NLS.bind(Messages.EcoreActionBarContributor_elementsSelection,
					metamodelName);
		} else {
			description = Messages.EcoreActionBarContributor_elementsSelectionUnknowMetamodel;
		}
		TableEditorFactory.getInstance().openOn(browserConfiguration, elements, description);
	}

}
