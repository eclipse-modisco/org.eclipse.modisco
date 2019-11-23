/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 341463 - [Model browser] stays on "loading..." indefinitely
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.editors;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.modisco.infra.browser.core.MetaclassList;
import org.eclipse.modisco.infra.browser.core.SearchResults;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ITreeElement;
import org.eclipse.ui.progress.IWorkbenchSiteProgressService;

public class BrowserContentProvider implements ITreeContentProvider {

	private final EcoreBrowser browser;
	private final ElementsComputation elementsComputation;
	private final ChildrenComputation childrenComputation;
	private final HasChildrenComputation hasChildrenComputation;

	public BrowserContentProvider(final EcoreBrowser browser) {
		this.browser = browser;
		this.childrenComputation = new ChildrenComputation();
		this.hasChildrenComputation = new HasChildrenComputation();
		this.elementsComputation = new ElementsComputation();
	}

	public IWorkbenchSiteProgressService getProgressService() {
		return this.browser.getProgressService();
	}

	protected void refreshBrowser() {
		this.browser.refreshDelayed(false);
	}

	protected class ElementsComputation extends NonBlockingElementComputation<Object[]> {
		public ElementsComputation() {
			super(getProgressService());
		}

		@Override
		protected Object[] basicCompute(final Object inputElement) {
			if (inputElement instanceof MetaclassList) {
				final MetaclassList metaclassList = (MetaclassList) inputElement;
				return metaclassList.getElements().toArray();
			} else if (inputElement instanceof SearchResults) {
				final SearchResults searchResults = (SearchResults) inputElement;
				return searchResults.getElements().toArray();
			} else if (inputElement == EcoreBrowser.LOADING_MESSAGE) {
				return new Object[] { EcoreBrowser.LOADING_MESSAGE };
			}
			return null;
		}

		@Override
		protected Object[] getTemporaryDefaultValue() {
			return new Object[] { EcoreBrowser.LOADING_MESSAGE };
		}

		@Override
		protected void computationFinished() {
			refreshBrowser();
		}
	}

	protected class ChildrenComputation extends NonBlockingElementComputation<Object[]> {
		public ChildrenComputation() {
			super(getProgressService());
		}

		@Override
		protected Object[] basicCompute(final Object element) {
			if (element instanceof ITreeElement) {
				ITreeElement treeElement = (ITreeElement) element;
				return treeElement.getChildren().toArray();
			}
			return new Object[0];
		}

		@Override
		protected Object[] getTemporaryDefaultValue() {
			return new Object[] { EcoreBrowser.LOADING_MESSAGE };
		}

		@Override
		protected void computationFinished() {
			refreshBrowser();
		}
	}

	protected class HasChildrenComputation extends NonBlockingElementComputation<Boolean> {
		public HasChildrenComputation() {
			super(getProgressService());
		}

		@Override
		protected Boolean basicCompute(final Object element) {
			if (element instanceof ITreeElement) {
				ITreeElement treeElement = (ITreeElement) element;
				return treeElement.hasChildren();
			}
			return Boolean.FALSE;
		}

		@Override
		protected Boolean getTemporaryDefaultValue() {
			return Boolean.FALSE;
		}

		@Override
		protected void computationFinished() {
			refreshBrowser();
		}
	}

	public Object[] getElements(final Object inputElement) {
		return this.elementsComputation.computeValue(inputElement);
	}

	public Object[] getChildren(final Object parentElement) {
		return this.childrenComputation.computeValue(parentElement);
	}

	public Object getParent(final Object element) {
		if (element instanceof ITreeElement) {
			final ITreeElement treeElement = (ITreeElement) element;
			return treeElement.getTreeParent();
		}
		return null;
	}

	public boolean hasChildren(final Object element) {
		return this.hasChildrenComputation.computeValue(element);
	}

	public void dispose() {
		// nothing
	}

	public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
		// nothing
	}

	public boolean isComputing() {
		return this.childrenComputation.isComputing() || this.hasChildrenComputation.isComputing();
	}
}
