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

package org.eclipse.gmt.modisco.infra.browser.editors;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.infra.browser.Messages;
import org.eclipse.gmt.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.gmt.modisco.infra.browser.core.InstancesForMetaclass;
import org.eclipse.gmt.modisco.infra.browser.editors.table.TableEditor;
import org.eclipse.gmt.modisco.infra.browser.editors.table.TableEditorInput;
import org.eclipse.gmt.modisco.infra.browser.editors.table.TableElement;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class MetaclassViewerMenuManager extends MenuManager implements IMenuListener {

	private final BrowserConfiguration browserConfiguration;
	private final MetaclassViewer metaclassViewer;

	public MetaclassViewerMenuManager(final MetaclassViewer metaclassViewer,
			final BrowserConfiguration browserConfiguration) {
		super("#PopUp"); //$NON-NLS-1$
		this.metaclassViewer = metaclassViewer;
		this.browserConfiguration = browserConfiguration;
		addMenuActions();
		addMenuListener(this);
	}

	private void addMenuActions() {
		add(this.openTableEditorAction);
		add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	/** This action opens a table editor on the selected metaclass */
	private final IAction openTableEditorAction = new Action(Messages.openTableEditorOnSelection) {
		@Override
		public void run() {
			final EClass[] selectedMetaclasses = MetaclassViewerMenuManager.this.metaclassViewer
					.getSelectedMetaclasses();
			final ArrayList<TableElement> elements = new ArrayList<TableElement>();

			for (final EClass selectedMetaclass : selectedMetaclasses) {
				final InstancesForMetaclass instancesForMetaclass = MetaclassViewerMenuManager.this.browserConfiguration
						.getInstancesForMetaclasses().getInstancesForMetaclass(selectedMetaclass);
				if (instancesForMetaclass != null) {
					ArrayList<EObject> instances = instancesForMetaclass.getElements();
					for (EObject eObject : instances) {
						elements.add(new TableElement(eObject));
					}
					if (MetaclassViewerMenuManager.this.browserConfiguration
							.getAppearanceConfiguration().isDisplayInstancesOfSubclasses()) {
						ArrayList<EObject> derivedElements = instancesForMetaclass
								.getDerivedElements();
						for (EObject eObject : derivedElements) {
							elements.add(new TableElement(eObject));
						}
					}
				}
			}

			final String[] selectedMetaclassesNames = MetaclassViewerMenuManager.this.metaclassViewer
					.getSelectedMetaclassesQualifiedNames();
			final TableEditorInput tableEditorInput = new TableEditorInput(
					MetaclassViewerMenuManager.this.browserConfiguration, elements,
					getDescriptionFor(selectedMetaclassesNames));

			final IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
					.getActivePage();
			try {
				IDE.openEditor(activePage, tableEditorInput, TableEditor.EDITOR_ID, true);
			} catch (final PartInitException e) {
				MoDiscoBrowserPlugin.logException(e);
			}
		}

		private String getDescriptionFor(final String[] selectedMetaclasses) {
			if (selectedMetaclasses.length < 1) {
				throw new IllegalArgumentException();
			}

			final StringBuilder description = new StringBuilder();
			description.append(Messages.MetaclassViewerMenuManager_instancesOf);
			description.append(selectedMetaclasses[0]);
			for (int i = 1; i < selectedMetaclasses.length; i++) {
				description.append(", " + selectedMetaclasses[i]); //$NON-NLS-1$
			}
			return description.toString();
		}
	};

	public void menuAboutToShow(final IMenuManager manager) {
		final EObject[] selectedMetaclasses = this.metaclassViewer.getSelectedMetaclasses();
		this.openTableEditorAction.setEnabled(selectedMetaclasses.length > 0);
	}

}
