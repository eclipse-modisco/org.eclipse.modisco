/*******************************************************************************
 * Copyright (c) 2008, 2011 Mia-Software.
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmt.modisco.infra.browser.Messages;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.INavigationLocation;
import org.eclipse.ui.NavigationLocation;

/**
 * A location in the Ecore editor, used for history navigation (back-forward
 * buttons)
 */
public class BrowserNavigationLocation extends NavigationLocation {

	/** The title of the editor */
	private final String title;
	/** The metaclass selected in the metaclass viewer */
	private EClass selectedMetaclass;
	/** The selection in the tree viewer */
	private ITreeSelection treeSelection;

	/** Create an empty navigation location */
	public BrowserNavigationLocation(final IEditorPart editorPart) {
		super(editorPart);
		this.title = editorPart.getTitle();
		this.selectedMetaclass = null;
		this.treeSelection = null;
	}

	/**
	 * Create a navigation location with the selected metaclass and selected
	 * element(s).
	 *
	 * @param editorPart
	 *            the editor
	 * @param selectedMetaclass
	 *            the metaclass selected in the metaclass viewer
	 * @param treeSelection
	 *            the selection in the tree viewer
	 */
	public BrowserNavigationLocation(final IEditorPart editorPart, final EClass selectedMetaclass,
			final ITreeSelection treeSelection) {
		super(editorPart);
		this.title = editorPart.getTitle();
		this.selectedMetaclass = selectedMetaclass;
		this.treeSelection = treeSelection;
	}

	@Override
	public String getText() {
		String name = null;
		if (this.selectedMetaclass != null) {
			name = this.selectedMetaclass.getName();
		}
		if (name == null) {
			name = ""; //$NON-NLS-1$
		}
		// cf Bug 329044 - [model browser] instance labels in "editor history"
		String strSelection;
		if (this.treeSelection != null) {
			int nSelected = this.treeSelection.size();
			if (nSelected == 0) {
				strSelection = Messages.BrowserNavigationLocation_emptySelection;
			} else if (nSelected == 1) {
				Object firstElement = this.treeSelection.getFirstElement();
				if (firstElement instanceof ModelElementItem) {
					ModelElementItem modelElementItem = (ModelElementItem) firstElement;
					strSelection = NLS.bind(Messages.BrowserNavigationLocation_singleSelection,
							modelElementItem.getName());
				} else {
					strSelection = NLS.bind(
							Messages.BrowserNavigationLocation_singleSelectionUnknownClass,
							firstElement.getClass().getSimpleName());
				}
			} else {
				strSelection = NLS.bind(Messages.BrowserNavigationLocation_multiSelection,
						nSelected);
			}
		} else {
			strSelection = ""; //$NON-NLS-1$
		}
		return this.title + " - " + name + strSelection; //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.INavigationLocation#mergeInto(org.eclipse.ui.
	 * INavigationLocation)
	 */
	public boolean mergeInto(final INavigationLocation currentLocation) {
		if (currentLocation == null) {
			return false;
		}

		if (currentLocation instanceof BrowserNavigationLocation) {
			final BrowserNavigationLocation location = (BrowserNavigationLocation) currentLocation;

			if (!this.title.equals(location.title)) {
				return false;
			}

			if (this.selectedMetaclass == location.selectedMetaclass) {
				location.treeSelection = this.treeSelection;
				return true;
			}
			// merge with empty location
			if (location.selectedMetaclass == null) {
				location.selectedMetaclass = this.selectedMetaclass;
				location.treeSelection = this.treeSelection;
				return true;
			}
		}

		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.INavigationLocation#restoreLocation()
	 */
	public void restoreLocation() {
		// empty location
		if (this.selectedMetaclass == null) {
			return;
		}

		final IEditorPart editorPart = getEditorPart();
		if (editorPart instanceof EcoreBrowser) {
			final EcoreBrowser editor = (EcoreBrowser) editorPart;
			editor.restoreLocation(this.selectedMetaclass, this.treeSelection);
		}
	}

	public void restoreState(final IMemento memento) {
		// nothing
	}

	public void saveState(final IMemento memento) {
		// nothing
	}

	public void update() {
		// nothing
	}

	@Override
	public void releaseState() {
		super.releaseState();
		// do not hang on to selection: permit GC to free model
		this.treeSelection = null;
	}
}
