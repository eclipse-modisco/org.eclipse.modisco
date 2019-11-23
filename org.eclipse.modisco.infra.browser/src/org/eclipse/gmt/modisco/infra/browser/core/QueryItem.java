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

package org.eclipse.gmt.modisco.infra.browser.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.infra.browser.editors.BrowserConfiguration;
import org.eclipse.gmt.modisco.infra.browser.queries.SelectedQuery;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.model.ITreeElement;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.util.Util;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

/**
 * A tree element representing a query that can be executed on the parent model
 * element.
 */
public class QueryItem implements ITreeElement {

	/**
	 * The model element that appears as the parent of the query item in the
	 * tree
	 */
	private final EObject parent;
	/** The parent tree item */
	private final ITreeElement treeParent;
	/**
	 * The model query that can be executed, and whose results appear as
	 * children of the {@link QueryItem}
	 */
	private final SelectedQuery query;
	/** The configuration of the browser in which the model is displayed */
	private final BrowserConfiguration browserConfiguration;

	private List<?> cachedChildren = null;
	private int cachedChildrenModCount = -1;

	/**
	 * Instantiate a new {@link QueryItem}.
	 *
	 * @param parent
	 *            the model element that appears as the parent of the query item
	 *            in the tree
	 * @param treeParent
	 *            the parent tree item
	 * @param query
	 *            the model query that can be executed, and whose results appear
	 *            as children of the {@link QueryItem}
	 * @param browserConfiguration
	 *            the configuration of the browser in which the model is
	 *            displayed
	 */
	public QueryItem(final EObject parent, final ITreeElement treeParent,
			final SelectedQuery query, final BrowserConfiguration browserConfiguration) {
		this.parent = parent;
		this.treeParent = treeParent;
		this.query = query;
		this.browserConfiguration = browserConfiguration;
	}

	public String getText() {
		if (!this.query.isExecuted()) {
			return this.query.getModelQuery().getName() + " (?)"; //$NON-NLS-1$
		}

		Object queryResult = this.query.getResult();
		if (queryResult instanceof Collection<?>) {
			@SuppressWarnings("unchecked")
			Collection<Object> elements = (Collection<Object>) queryResult;
			return this.query.getModelQuery().getName() + " (" + elements.size() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
		}
		// a single element is displayed directly on the query item
		final String text;
		if (queryResult instanceof EObject) {
			EObject eObject = (EObject) queryResult;
			text = ModelElementItem.getDisplayName(eObject, this.browserConfiguration.getAppearanceConfiguration());
		} else if (queryResult == null) {
			text = "null"; //$NON-NLS-1$
		} else {
			text = queryResult.toString();
		}
		return this.query.getModelQuery().getName() + " = " + text; //$NON-NLS-1$
	}

	public Image getImage() {
		return ImageProvider.getInstance().getQueryIcon();
	}

	public Object getParent() {
		return this.parent;
	}

	public ITreeElement getTreeParent() {
		return this.treeParent;
	}

	public List<?> getChildren() {
		// if (!this.query.isExecuted()) {
		// return Collections.emptyList();
		// }

		if (this.cachedChildrenModCount != this.browserConfiguration.getAppearanceConfiguration().getModCount()) {
			Object queryResult = this.query.getResult();

			if (queryResult == null) {
				this.cachedChildren = Collections.emptyList();
			} else if (queryResult instanceof EObject) {
				EObject element = (EObject) queryResult;
				this.cachedChildren = Collections.singletonList(new ModelElementItemEx(element, this,
						this.browserConfiguration));
			} else if (queryResult instanceof Collection<?>) {
				Collection<?> elements = (Collection<?>) queryResult;
				// TODO: partition big collections?
				List<Object> children = new ArrayList<Object>();
				for (Object element : elements) {
					if (element instanceof EObject) {
						EObject eObject = (EObject) element;
						children.add(new ModelElementItemEx(eObject, this, this.browserConfiguration));
					} else {
						children.add(element);
					}
				}
				this.cachedChildren = Collections.unmodifiableList(children);
			} else {
				this.cachedChildren = Collections.singletonList(queryResult);
			}
			this.cachedChildrenModCount = this.browserConfiguration.getAppearanceConfiguration().getModCount();
		}
		return this.cachedChildren;
	}

	public boolean hasChildren() {
		if (!this.query.isExecuted()) {
			// the children will be computed when the node is expanded
			return true;
		}

		return getChildren().size() > 0;
	}

	public Font getFont() {
		return null;
	}

	public Color getForeground() {
		return null;
	}

	public Color getBackground() {
		return null;
	}

	public SelectedQuery getQuery() {
		return this.query;
	}

	/**
	 * equals and hashCode are used to restore the selection in the JFace viewer
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof QueryItem) {
			final QueryItem other = (QueryItem) obj;
			return Util.safeEquals(this.query, other.query) && this.parent.equals(other.parent);
		}
		return false;
	}

	/**
	 * equals and hashCode are used to restore the selection in the JFace viewer
	 */
	@Override
	public int hashCode() {
		final int hashPrime1 = 47;
		final int hashPrime2 = 13;

		final int parentHashCode = this.parent.hashCode() + hashPrime2;
		if (this.query != null) {
			return this.query.hashCode() * hashPrime1 + parentHashCode;
		}
		return parentHashCode;
	}
}