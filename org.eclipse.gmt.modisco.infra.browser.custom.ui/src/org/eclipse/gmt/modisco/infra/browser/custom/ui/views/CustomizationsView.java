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

package org.eclipse.gmt.modisco.infra.browser.custom.ui.views;

import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.facet.common.ui.internal.views.AbstractTreeView;
import org.eclipse.gmt.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.gmt.modisco.infra.browser.custom.core.CustomizationsCatalog;
import org.eclipse.gmt.modisco.infra.browser.custom.ui.Activator;
import org.eclipse.gmt.modisco.infra.browser.custom.ui.Messages;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.util.ColorProvider;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.gmt.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog.ModiscoCatalogChangeListener;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

/**
 * An Eclipse view that displays a list of available MoDisco Browser
 * Customizations. Clicking on a customization opens it in the customization
 * editor.
 */
public class CustomizationsView extends AbstractTreeView implements
		ModiscoCatalogChangeListener {

	private static final String NAME_COLUMN = "CustomizationsView_NameColumn"; //$NON-NLS-1$
	private static final String METAMODEL_COLUMN = "CustomizationsView_MetamodelColumn"; //$NON-NLS-1$
	private static final String QUERY_SETS_COLUMN = "CustomizationsView_QuerySetsColumn"; //$NON-NLS-1$

	private static final int QUERY_SETS_COLUMN_WIDTH = 400;
	private static final int METAMODEL_COLUMN_WIDTH = 300;
	private static final int NAME_COLUMN_WIDTH = 200;

	@Override
	public void createPartControl(final Composite parent) {
		super.createPartControl(parent);
	}

	@Override
	public void dispose() {
		super.dispose();
		CustomizationsCatalog.getInstance().removeChangeListener(this);
	}

	/** Called when a customization changes */
	public void changed(final EObject changedCustomization, final IFile file) {
		refresh(true);
	}

	/** Called when a customization is added */
	public void added(final EObject addedCustomization, final IFile file) {
		refresh(true);
	}

	/** Called when a customization is removed */
	public void removed(final IFile customizationFile) {
		refresh(true);
	}

	@Override
	protected void createColumns() {
		createNameColumn();
		createMetamodelColumn();
		createQuerySetsColumn();

	}

	private void createNameColumn() {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				final MetamodelView metamodelView = (MetamodelView) element;
				return metamodelView.getName();
			}

			@Override
			public Color getForeground(final Object element) {
				final MetamodelView metamodelView = (MetamodelView) element;
				if (metamodelView.getLocation().startsWith("platform:/plugin/")) { //$NON-NLS-1$
					return ColorProvider.getInstance()
							.getExternalResourceColor();
				}
				return super.getForeground(element);
			}

			@Override
			public Image getImage(final Object element) {
				return ImageProvider.getInstance().getUiCustomIcon();
			}
		};
		createColumn(Messages.CustomizationsView_nameColumn,
				CustomizationsView.NAME_COLUMN,
				CustomizationsView.NAME_COLUMN_WIDTH, columnLabelProvider);
	}

	private void createMetamodelColumn() {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				final MetamodelView metamodelView = (MetamodelView) element;
				return metamodelView.getMetamodelURI();
			}
		};
		createColumn(Messages.CustomizationsView_metamodelColumn,
				CustomizationsView.METAMODEL_COLUMN,
				CustomizationsView.METAMODEL_COLUMN_WIDTH, columnLabelProvider);
	}

	private void createQuerySetsColumn() {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				final MetamodelView metamodelView = (MetamodelView) element;
				if (metamodelView.isAllQuerySetsAvailable()) {
					return Messages.CustomizationsView_allQuerySets;
				}
				final EList<String> availableQuerySets = metamodelView
						.getAvailableQuerySets();
				final StringBuilder builder = new StringBuilder();
				for (int i = 0; i < availableQuerySets.size(); i++) {
					builder.append(availableQuerySets.get(i));
					if (i != availableQuerySets.size() - 1) {
						builder.append(", "); //$NON-NLS-1$
					}
				}
				return builder.toString();
			}
		};
		createColumn(Messages.CustomizationsView_querySetsColumn,
				CustomizationsView.QUERY_SETS_COLUMN,
				CustomizationsView.QUERY_SETS_COLUMN_WIDTH, columnLabelProvider);
	}

	@Override
	protected IContentProvider getContentProvider() {
		return new ITreeContentProvider() {
			public Object[] getElements(final Object inputElement) {
				@SuppressWarnings("unchecked")
				final Collection<MetamodelView> metamodelViews = (Collection<MetamodelView>) inputElement;
				return metamodelViews.toArray();
			}

			public void inputChanged(final Viewer viewer,
					final Object oldInput, final Object newInput) {
				// nothing
			}

			public void dispose() {
				// nothing
			}

			public boolean hasChildren(final Object element) {
				return false;
			}

			public Object getParent(final Object element) {
				return null;
			}

			public Object[] getChildren(final Object parentElement) {
				return null;
			}
		};
	}

	@Override
	protected void openElement(final Object element) {
		final MetamodelView metamodelView = (MetamodelView) element;
		// open customization in editor
		try {
			org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
					.createURI(metamodelView.getLocation());
			if (uri.isPlatformResource()) {
				IFile file = ResourcesPlugin.getWorkspace().getRoot()
						.getFile(new Path(uri.toPlatformString(true)));
				FileEditorInput fileEditorInput = new FileEditorInput(file);
				IDE.openEditor(PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage(),
						fileEditorInput, Activator.CUSTOMIZATION_EDITOR_ID,
						true);
			} else {
				final URIEditorInput uriEditorInput = new URIEditorInput(
						org.eclipse.emf.common.util.URI.createURI(uri
								.toString()));
				IDE.openEditor(PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage(),
						uriEditorInput, Activator.CUSTOMIZATION_EDITOR_ID, true);
			}

		} catch (final Exception e) {
			Activator.logException(e);
		}
	}

	@Override
	protected String getRefreshMessage() {
		return Messages.CustomizationsView_jobName_RefreshCustomizationsView;
	}

	@Override
	protected Object getInput() {
		CustomizationsCatalog.getInstance().addChangeListener(this);
		return CustomizationsCatalog.getInstance().getAllCustomizations();
	}
}
