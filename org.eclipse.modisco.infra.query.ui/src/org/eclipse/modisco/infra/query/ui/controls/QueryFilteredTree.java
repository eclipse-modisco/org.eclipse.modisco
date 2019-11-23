/*******************************************************************************
 * Copyright (c) 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.query.ui.controls;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.modisco.infra.common.ui.internal.util.ImageUtils;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;

/**
 * A control that displays a tree of queries in their query sets, with a filter
 * text field.
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class QueryFilteredTree extends FilteredTree {

	/**
	 * Create a tree with a filter text field to select queries.
	 *
	 * @param parentComposite
	 *            the parent composite
	 * @param availableQuerySets
	 *            the query sets from which queries are selected.
	 *            <code>null</code> means all.
	 * @param viewerFilters
	 *            filters on the displayed queries. Can be <code>null</code>.
	 * @return a filtered tree control
	 */
	public QueryFilteredTree(final Composite parentComposite,
			final Collection<ModelQuerySet> availableQuerySets,
			final List<ViewerFilter> viewerFilters, final boolean multiSelection) {
		super(parentComposite, selectionStyle(multiSelection) | SWT.H_SCROLL | SWT.V_SCROLL
				| SWT.BORDER, createPatternFilter(), true);

		getViewer().setContentProvider(createContentProvider());
		getViewer().setLabelProvider(createLabelProvider());

		setFilters(viewerFilters);

		setInput(availableQuerySets);
	}

	public void setFilters(final List<ViewerFilter> viewerFilters) {
		if (viewerFilters != null) {
			ViewerFilter emptyQuerySetsFilter = new ViewerFilter() {
				@Override
				public boolean select(final Viewer viewer, final Object parentElement,
						final Object element) {
					if (element instanceof ModelQuerySet) {
						ModelQuerySet modelQuerySet = (ModelQuerySet) element;
						EList<ModelQuery> queries = modelQuerySet.getQueries();
						for (ViewerFilter viewerFilter : viewerFilters) {
							if (viewerFilter.filter(viewer, modelQuerySet, queries.toArray()).length == 0) {
								return false;
							}
						}
					}
					return true;
				}
			};

			List<ViewerFilter> allViewerFilters = new ArrayList<ViewerFilter>();
			allViewerFilters.addAll(viewerFilters);
			allViewerFilters.add(emptyQuerySetsFilter);
			allViewerFilters.add(getPatternFilter());
			getViewer().setFilters(
					allViewerFilters.toArray(new ViewerFilter[allViewerFilters.size()]));
		} else {
			// restore the default filter
			getViewer().setFilters(new ViewerFilter[] { getPatternFilter() });
		}

	}

	/**
	 * @param availableQuerySets
	 *            the query sets to set as input. <code>null</code> means all.
	 */
	public void setInput(final Collection<ModelQuerySet> availableQuerySets) {
		final Collection<ModelQuerySet> querySets;
		if (availableQuerySets == null) {
			querySets = ModelQuerySetCatalog.getSingleton().getAllModelQuerySets();
		} else {
			querySets = availableQuerySets;
		}
		getViewer().setInput(querySets);
	}

	private IBaseLabelProvider createLabelProvider() {
		return new LabelProvider() {
			@Override
			public String getText(final Object element) {
				if (element instanceof ModelQuerySet) {
					final ModelQuerySet querySet = (ModelQuerySet) element;
					return querySet.getName();
				} else if (element instanceof ModelQuery) {
					final ModelQuery query = (ModelQuery) element;
					return query.getName();
				}
				return super.getText(element);
			}

			@Override
			public Image getImage(final Object element) {
				return ImageUtils.getImage(element);
			}
		};
	}

	private IContentProvider createContentProvider() {
		return new ITreeContentProvider() {

			public Object[] getElements(final Object inputElement) {
				@SuppressWarnings("unchecked")
				final java.util.List<ModelQuerySet> querySets = (java.util.List<ModelQuerySet>) inputElement;
				return querySets.toArray();
			}

			public Object[] getChildren(final Object parentElement) {
				if (parentElement instanceof ModelQuerySet) {
					final ModelQuerySet querySet = (ModelQuerySet) parentElement;
					return querySet.getQueries().toArray();
				}
				return null;
			}

			public Object getParent(final Object element) {
				if (element instanceof ModelQuery) {
					final ModelQuery query = (ModelQuery) element;
					return query.getModelQuerySet();
				}
				return null;
			}

			public boolean hasChildren(final Object element) {
				if (element instanceof ModelQuerySet) {
					final ModelQuerySet querySet = (ModelQuerySet) element;
					return !querySet.getQueries().isEmpty();
				}
				return false;
			}

			public void inputChanged(final Viewer viewer, final Object oldInput,
					final Object newInput) {
				// nothing
			}

			public void dispose() {
				// nothing
			}
		};
	}

	private static int selectionStyle(final boolean multiSelection) {
		final int selectionStyle;
		if (multiSelection) {
			selectionStyle = SWT.MULTI;
		} else {
			selectionStyle = SWT.SINGLE;
		}
		return selectionStyle;
	}

	private static PatternFilter createPatternFilter() {
		return new PatternFilter() {
			@Override
			protected boolean isLeafMatch(final Viewer viewer, final Object element) {
				String labelText = ((ILabelProvider) ((StructuredViewer) viewer).getLabelProvider())
						.getText(element);

				if (labelText == null) {
					return false;
				}
				return wordMatches(labelText) || parentMatches(viewer, element);
			}

			private boolean parentMatches(final Viewer viewer, final Object element) {
				ITreeContentProvider contentProvider = (ITreeContentProvider) ((StructuredViewer) viewer)
						.getContentProvider();
				Object parent = contentProvider.getParent(element);
				if (parent == null) {
					return false;
				}
				return isLeafMatch(viewer, parent);
			}
		};
	}
}
