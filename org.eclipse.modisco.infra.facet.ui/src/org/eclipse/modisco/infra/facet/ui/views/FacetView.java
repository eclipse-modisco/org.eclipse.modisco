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

package org.eclipse.modisco.infra.facet.ui.views;

import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.modisco.facet.common.ui.internal.views.AbstractTreeView;
import org.eclipse.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog.ModiscoCatalogChangeListener;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.util.ImageUtils;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.FacetPackage;
import org.eclipse.modisco.infra.facet.FacetSet;
import org.eclipse.modisco.infra.facet.core.FacetSetCatalog;
import org.eclipse.modisco.infra.facet.editor.presentation.FacetEditor;
import org.eclipse.modisco.infra.facet.ui.Activator;
import org.eclipse.modisco.infra.facet.ui.Messages;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/**
 * An Eclipse view that displays a list of available MoDisco facet sets.
 * Clicking on a facet set opens it in the facet set editor.
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public class FacetView extends AbstractTreeView implements ModiscoCatalogChangeListener {

	private static final String NAME_COLUMN = "FacetView_NameColumn"; //$NON-NLS-1$
	private static final String LOCATION_COLUMN = "FacetView_LocationColumn"; //$NON-NLS-1$
	private static final String DEFAULT_COLUMN = "FacetView_DefaultColumn"; //$NON-NLS-1$
	private static final String EXTENDS_COLUMN = "FacetView_ExtendsColumn"; //$NON-NLS-1$

	private static final int COLUMN_WIDTH = 200;

	@Override
	public void createPartControl(final Composite parent) {
		super.createPartControl(parent);
	}

	@Override
	protected void createColumns() {
		createNameColumn();
		createExtendsColumn();
		createLocationColumn();
		createDefaultColumn();
	}

	private void createLocationColumn() {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				if (!(element instanceof FacetSet)) {
					return ""; //$NON-NLS-1$
				}
				FacetSet facetSet = (FacetSet) element;
				org.eclipse.emf.common.util.URI uri = FacetSetCatalog.getSingleton().getURI(
						facetSet.getName());
				if (uri == null) {
					return "null"; //$NON-NLS-1$
				}
				return uri.toString();
			}
		};
		createColumn(Messages.FacetView_location, FacetView.LOCATION_COLUMN,
				FacetView.COLUMN_WIDTH * 2, columnLabelProvider);
	}

	private void createNameColumn() {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				if (element instanceof FacetSet) {
					FacetSet facetSet = (FacetSet) element;
					return facetSet.getName();
				} else if (element instanceof Facet) {
					Facet facet = (Facet) element;
					return facet.getName();
				} else if (element instanceof EStructuralFeature) {
					EStructuralFeature feature = (EStructuralFeature) element;
					return feature.getName();
				} else {
					return ""; //$NON-NLS-1$
				}

			}

			@Override
			public Image getImage(final Object element) {
				return ImageUtils.getImage(element);
			}
		};
		createColumn(Messages.FacetView_name, FacetView.NAME_COLUMN, FacetView.COLUMN_WIDTH,
				columnLabelProvider);
	}

	private void createDefaultColumn() {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				if (element instanceof FacetSet) {
					FacetSet facetSet = (FacetSet) element;
					EAnnotation annotation = facetSet.getEAnnotation("default"); //$NON-NLS-1$
					if (annotation != null) {
						if (annotation.getReferences().size() == 1
								&& annotation.getReferences().get(0) instanceof EPackage) {
							EPackage ePackage = (EPackage) annotation.getReferences().get(0);
							return ePackage.getName() + " " + ePackage.getNsURI(); //$NON-NLS-1$
						}

					}
				}
				return ""; //$NON-NLS-1$
			}
		};
		createColumn(Messages.FacetView_1, FacetView.DEFAULT_COLUMN, FacetView.COLUMN_WIDTH,
				columnLabelProvider);
	}

	private void createExtendsColumn() {
		ColumnLabelProvider columnLabelProvider = new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				if (element instanceof FacetSet) {
					FacetSet facetSet = (FacetSet) element;
					return facetSet.getExtendedPackage().getName() + " " //$NON-NLS-1$
							+ facetSet.getExtendedPackage().getNsURI();
				}
				return ""; //$NON-NLS-1$
			}

		};
		createColumn(Messages.FacetView_3, FacetView.EXTENDS_COLUMN, FacetView.COLUMN_WIDTH,
				columnLabelProvider);
	}

	@Override
	public void dispose() {
		super.dispose();
		FacetSetCatalog.getSingleton().removeChangeListener(this);
	}

	/** Called when a facet set changes */
	public void changed(final EObject changedFacetSet, final IFile file) {
		refresh(true);
	}

	/** Called when a facet set is added */
	public void added(final EObject addedFacetSet, final IFile file) {
		refresh(true);
	}

	/** Called when a facet set is removed */
	public void removed(final IFile facetSetFile) {
		refresh(true);
	}

	@Override
	protected IContentProvider getContentProvider() {
		return new FacetSetContentProvider(FacetPackage.eINSTANCE.getFacetStructuralFeature());
	}

	@Override
	protected void openElement(final Object element) {
		final EObject modelElement = (EObject) element;
		EPackage facetSet = null;
		if (modelElement instanceof FacetSet) {
			facetSet = (FacetSet) modelElement;
		} else if (modelElement instanceof Facet) {
			Facet facet = (Facet) modelElement;
			facetSet = facet.getEPackage();
		}
		if (facetSet != null) {
			// open facet set in editor
			URI uri = null;
			try {
				String uriString = FacetSetCatalog.getSingleton().getURI(facetSet.getName())
						.toString();
				uri = URI.create(uriString);
				IEditorPart editor = null;
				if ("file".equals(uri.getScheme())) { //$NON-NLS-1$
					editor = IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getActivePage(), new URI(facetSet.eResource().getURI().toString()),
							Activator.FACET_EDITOR_ID, true);
				} else {
					URIEditorInput uriEditorInput = new URIEditorInput(
							org.eclipse.emf.common.util.URI.createURI(uri.toString()));
					editor = IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getActivePage(), uriEditorInput, Activator.FACET_EDITOR_ID, true);
				}
				if (editor instanceof FacetEditor) {
					FacetEditor facetEditor = (FacetEditor) editor;
					facetEditor.setSelectionToViewer(modelElement);
				}

			} catch (Exception e) {
				MoDiscoLogger.logError(e, "Failed to open: " + uri, Activator.getDefault()); //$NON-NLS-1$
			}
		}
	}

	@Override
	protected String getRefreshMessage() {
		return Messages.FacetView_JobName_refreshingFacetSetsView;
	}

	@Override
	protected Object getInput() {
		// add the listener here (called in a Job) to avoid blocking the UI,
		// because accessing the catalog takes a while
		FacetSetCatalog.getSingleton().addChangeListener(this);
		return FacetSetCatalog.getSingleton().getAllFacetSets().toArray();
	}
}
