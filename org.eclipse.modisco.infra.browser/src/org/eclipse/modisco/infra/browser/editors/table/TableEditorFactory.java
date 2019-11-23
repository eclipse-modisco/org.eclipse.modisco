/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.editors.table;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry;
import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.browser.editors.BrowserConfiguration;
import org.eclipse.modisco.infra.query.runtime.ModelQueryResult;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class TableEditorFactory {

	private static TableEditorFactory instance;

	protected TableEditorFactory() {
		// singleton
	}

	public static TableEditorFactory getInstance() {
		if (TableEditorFactory.instance == null) {
			TableEditorFactory.instance = new TableEditorFactory();
		}
		return TableEditorFactory.instance;
	}

	/**
	 * Open a new table view editor on the given list of elements.
	 *
	 * @param browserConfiguration
	 *            the main editor configuration
	 * @param elements
	 *            the elements to show as rows in the table
	 * @param description
	 *            a descriptive String of what will be displayed in the table
	 *            view editor
	 */
	public void openOn(final BrowserConfiguration browserConfiguration,
			final List<? extends Object> elements, final String description) {
		List<TableElement> tableElements = new ArrayList<TableElement>();
		for (Object element : elements) {
			tableElements.add(new TableElement(element));
		}
		final TableEditorInput input = new TableEditorInput(browserConfiguration, tableElements,
				description);
		openOn(input);
	}

	protected void openOn(final TableEditorInput input) {
		final IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage();
		try {
			IDE.openEditor(activePage, input, getEditorID(), true);
		} catch (final PartInitException e) {
			MoDiscoBrowserPlugin.logException(e);
		}
	}

	protected String getEditorID() {
		return TableEditor.EDITOR_ID;
	}

	/**
	 * Open a new table view editor on the given query result.
	 *
	 * @param result
	 *            the results of a query to display in the table
	 */
	public void openOn(final List<ModelQueryResult> result) {
		List<TableElement> tableElements = new ArrayList<TableElement>();

		for (ModelQueryResult modelQueryResult : result) {
			Object value = modelQueryResult.getValue();
			flattenToList(value, tableElements, modelQueryResult.getSource());
		}

		// TODO: query name?
		final String description = NLS.bind(Messages.TableEditor_Description_modelQueryResults,
				Integer.valueOf(tableElements.size()));

		BrowserConfiguration browserConfiguration = new BrowserConfiguration();
		// XXX already done in constructor?
		final Registry registry = ComposedAdapterFactory.Descriptor.Registry.INSTANCE;
		ComposedAdapterFactory adapterFactoryWithRegistry = new ComposedAdapterFactory(registry);
		browserConfiguration.getAppearanceConfiguration().setAdapterFactory(
				adapterFactoryWithRegistry);

		final TableEditorInput input = new TableEditorInput(browserConfiguration, tableElements,
				description);
		openOn(input);
	}

	/**
	 * Flattens the contents of the given value (if it is {@link Iterable}) into
	 * <code>tableElements</code>, or add it directly to this list if it is not
	 * iterable.
	 */
	private static void flattenToList(final Object value, final List<TableElement> tableElements,
			final EObject context) {
		if (value instanceof Iterable<?>) {
			Iterable<?> iterable = (Iterable<?>) value;
			Iterator<?> iterator = iterable.iterator();
			while (iterator.hasNext()) {
				Object element = iterator.next();
				flattenToList(element, tableElements, context);
			}
		} else {
			tableElements.add(new TableElementWithContext(value, context));
		}
	}
}
