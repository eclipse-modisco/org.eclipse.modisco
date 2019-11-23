/*******************************************************************************
 * Copyright (c) 2009 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Gregoire DUPE (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.query.ui.views;

import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.modisco.facet.common.ui.internal.views.AbstractTreeView;
import org.eclipse.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog.ModiscoCatalogChangeListener;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.util.ImageUtils;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.modisco.infra.query.editor.presentation.QueryEditor;
import org.eclipse.modisco.infra.query.ui.Activator;
import org.eclipse.modisco.infra.query.ui.Messages;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/**
 * An Eclipse view that displays a list of available MoDisco query sets.
 * Clicking on a query set opens it in the query set editor.
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class ModelQueryView extends AbstractTreeView implements ModiscoCatalogChangeListener {

	private static final String NAME_COLUMN = "ModelQueryView_NameColumn"; //$NON-NLS-1$
	private static final String DESCRIPTION_COLUMN = "ModelQueryView_DescriptionColumn"; //$NON-NLS-1$
	private static final String LOCATION_COLUMN = "ModelQueryView_LocationColumn"; //$NON-NLS-1$

	private static final int COLUMN_WIDTH = 200;

	@Override
	public void createPartControl(final Composite parent) {
		super.createPartControl(parent);
	}

	@Override
	protected void createColumns() {
		createNameColumn();
		createDescriptionColumn();
		createLocationColumn();
	}

	private void createNameColumn() {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				if (element instanceof ModelQuerySet) {
					ModelQuerySet modelQuerySet = (ModelQuerySet) element;
					return modelQuerySet.getName();
				} else if (element instanceof ModelQuery) {
					ModelQuery modelQuery = (ModelQuery) element;
					return modelQuery.getName();
				} else {
					return ""; //$NON-NLS-1$
				}

			}

			@Override
			public Image getImage(final Object element) {
				return ImageUtils.getImage(element);
			}
		};
		createColumn(Messages.ModelQueryView_name, ModelQueryView.NAME_COLUMN,
				ModelQueryView.COLUMN_WIDTH, columnLabelProvider);
	}

	private void createDescriptionColumn() {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				if (element instanceof ModelQuerySet) {
					ModelQuerySet modelQuerySet = (ModelQuerySet) element;
					return modelQuerySet.getDescription();
				}
				if (element instanceof ModelQuery) {
					ModelQuery modelQuery = (ModelQuery) element;
					return modelQuery.getDescription();
				}
				return ""; //$NON-NLS-1$
			}
		};
		createColumn(Messages.ModelQueryView_description, ModelQueryView.DESCRIPTION_COLUMN,
				ModelQueryView.COLUMN_WIDTH, columnLabelProvider);
	}

	private void createLocationColumn() {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				if (!(element instanceof ModelQuerySet)) {
					return ""; //$NON-NLS-1$
				}
				ModelQuerySet modelQuerySet = (ModelQuerySet) element;
				org.eclipse.emf.common.util.URI uri = ModelQuerySetCatalog.getSingleton().getURI(
						modelQuerySet.getName());
				if (uri == null) {
					return "null"; //$NON-NLS-1$
				}
				return uri.toString();
			}
		};
		createColumn(Messages.ModelQueryView_location, ModelQueryView.LOCATION_COLUMN,
				ModelQueryView.COLUMN_WIDTH * 2, columnLabelProvider);
	}

	@Override
	public void dispose() {
		super.dispose();
		ModelQuerySetCatalog.getSingleton().removeChangeListener(this);
	}

	/** Called when a query set changes */
	public void changed(final EObject changedQuerySet, final IFile file) {
		refresh(true);
	}

	/** Called when a query set is added */
	public void added(final EObject addedQuerySet, final IFile file) {
		refresh(true);
	}

	/** Called when a query set is removed */
	public void removed(final IFile querySetFile) {
		refresh(true);
	}

	@Override
	protected IContentProvider getContentProvider() {
		return new ITreeContentProvider() {
			public Object[] getElements(final Object inputElement) {
				if (!(inputElement instanceof Object[])) {
					throw new RuntimeException("Unexpected inputElement type: " //$NON-NLS-1$
							+ inputElement.getClass().getName());
				}
				return (Object[]) inputElement;
			}

			public void inputChanged(final Viewer viewer, final Object oldInput,
					final Object newInput) {
				// Nothing to do
			}

			public Object[] getChildren(final Object parentElement) {
				if (!(parentElement instanceof ModelQuerySet)) {
					throw new RuntimeException("Unexpected inputElement type: " //$NON-NLS-1$
							+ parentElement.getClass().getName());
				}
				ModelQuerySet modelQuerySet = (ModelQuerySet) parentElement;
				return modelQuerySet.getQueries().toArray();
			}

			public Object getParent(final Object element) {
				if (element instanceof ModelQuerySet) {
					return null;
				} else if (element instanceof ModelQuery) {
					ModelQuery modelQuery = (ModelQuery) element;
					return modelQuery.getModelQuerySet();
				} else {
					throw new RuntimeException("Unexpected inputElement type: " //$NON-NLS-1$
							+ element.getClass().getName());
				}
			}

			public boolean hasChildren(final Object element) {
				return (element instanceof ModelQuerySet && getChildren(element).length > 0);
			}

			public void dispose() {
				// Nothing to do
			}
		};
	}

	@Override
	protected void openElement(final Object element) {
		EObject modelElement = (EObject) element;
		ModelQuerySet modelQuerySet = null;
		if (modelElement instanceof ModelQuerySet) {
			modelQuerySet = (ModelQuerySet) modelElement;
		} else if (modelElement instanceof ModelQuery) {
			ModelQuery modelQuery = (ModelQuery) modelElement;
			modelQuerySet = modelQuery.getModelQuerySet();
		}
		if (modelQuerySet != null) {
			// open query set in editor
			URI uri = null;
			try {
				String uriString = ModelQuerySetCatalog.getSingleton().getURI(
						modelQuerySet.getName()).toString();
				uri = URI.create(uriString);
				IEditorPart editor = null;
				if ("file".equals(uri.getScheme())) { //$NON-NLS-1$
					editor = IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getActivePage(),
							new URI(modelQuerySet.eResource().getURI().toString()),
							Activator.QUERY_EDITOR_ID, true);
				} else {
					URIEditorInput uriEditorInput = new URIEditorInput(
							org.eclipse.emf.common.util.URI.createURI(uri.toString()));
					editor = IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getActivePage(), uriEditorInput, Activator.QUERY_EDITOR_ID, true);
				}
				if (editor instanceof QueryEditor) {
					QueryEditor queryEditor = (QueryEditor) editor;
					queryEditor.setSelectionToViewer(modelElement);
				}

			} catch (Exception e) {
				MoDiscoLogger.logError(e, "Failed to open: " + uri, Activator.getDefault()); //$NON-NLS-1$
			}
		}
	}

	@Override
	protected String getRefreshMessage() {
		return Messages.refreshingQuerySetsView;
	}

	@Override
	protected Object getInput() {
		ModelQuerySetCatalog.getSingleton().addChangeListener(this);
		return ModelQuerySetCatalog.getSingleton().getAllModelQuerySets().toArray();
	}
}
