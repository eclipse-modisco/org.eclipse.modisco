/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.uicore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.modisco.infra.browser.uicore.internal.model.AttributeItem;
import org.eclipse.modisco.infra.browser.uicore.internal.model.BigListItem;
import org.eclipse.modisco.infra.browser.uicore.internal.model.LinkItem;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ModelElementItem;

/**
 * Unwraps the a selection's elements, twice:
 * <ul>
 * <li>First, unwrap the wrapper elements (such as {@link ModelElementItem})
 * <li>Then, unwrap the Ecore wrappers (see
 * {@link org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider}, from which this class is
 * derived).
 * </ul>
 *
 * <p>
 * You can use this {@link ISelectionProvider selection provider} to register a context menu on a
 * viewer created using the {@link CustomizableModelContentProvider}, so that the menu actions will
 * get the Ecore versions of the elements as the selection:
 *
 * <pre>
 * getSite().registerContextMenu(MENU_ID, contextMenu, new UnwrappingSelectionProvider(treeViewer));
 * </pre>
 *
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class UnwrappingSelectionProvider extends
		org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider {

	public UnwrappingSelectionProvider(final ISelectionProvider selectionProvider) {
		super(selectionProvider);
	}

	@Override
	public void setSelection(final ISelection selection) {
		// unwrap EcoreBrowser wrappers
		final ISelection selection2 = unwrapSelection(selection);
		super.setSelection(selection2);
	}

	/**
	 * Replace proxy objects by their underlying Ecore objects in the given selection
	 *
	 * @return the unwrapped version of the selection
	 */
	public static ISelection unwrapSelection(final ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			final List<Object> elements = new ArrayList<Object>();
			final Iterator<?> iterator = structuredSelection.iterator();
			while (iterator.hasNext()) {
				final Object element = iterator.next();
				if (element instanceof BigListItem) {
					BigListItem bigListItem = (BigListItem) element;
					List<Object> children = bigListItem.getChildren();
					List<Object> unwrappedList = new ArrayList<Object>();
					for (Object object : children) {
						unwrappedList.add(unwrapElement(object));
					}
					// a BigListItem is represented by a List
					elements.add(unwrappedList);
				} else {
					elements.add(unwrapElement(element));
				}
			}
			return new StructuredSelection(elements);
		}
		return selection;
	}

	public static Object unwrapElement(final Object element) {
		if (element instanceof ModelElementItem) {
			final ModelElementItem modelElementItem = (ModelElementItem) element;
			return modelElementItem.getEObject();
		} else if (element instanceof LinkItem) {
			final LinkItem linkItem = (LinkItem) element;
			return linkItem.getReference();
		} else if (element instanceof AttributeItem) {
			final AttributeItem attributeItem = (AttributeItem) element;
			return attributeItem.getAttribute();
		} else {
			return element;
		}
	}
}
