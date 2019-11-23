/*******************************************************************************
 * Copyright (c) 2012, 2016 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 379683 - customizable Tree content provider
 *    Nicolas Bros (Mia-Software) - Bug 380407 - Missing since tag on CustomizedContentProviderUtils
 *    Grégoire Dupé (Mia-Software) - Bug 506334 - Need to know which TreeElement has been updated
 *******************************************************************************/
package org.eclipse.modisco.facet.custom.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EAttributeTreeElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EReferenceTreeElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement;

/**
 * A companion utility class for {@link ICustomizedTreeContentProvider}
 * 
 * @since 0.2
 */
public final class CustomizedContentProviderUtils {
	private CustomizedContentProviderUtils() {
		// utility class
	}

	/**
	 * Replace proxy objects by their underlying model elements in the given selection
	 * 
	 * @return the unwrapped version of the selection
	 */
	public static ISelection resolveSelection(final ISelection selection) {
		Assert.isNotNull(selection);
		ISelection result;
		if (selection instanceof IStructuredSelection) {
			final IStructuredSelection strSelection = (IStructuredSelection) selection;
			final List<Object> resolvedElements = new ArrayList<Object>();
			final Iterator<?> iterator = strSelection.iterator();
			while (iterator.hasNext()) {
				final Object element = iterator.next();
				resolvedElements.add(resolve(element));
			}
			result = new StructuredSelection(resolvedElements);
		} else {
			throw new IllegalArgumentException("Unhandled selection type: " + selection.getClass().getName()); //$NON-NLS-1$
		}
		return result;
	}

	/**
	 * Resolve the given UI element into the underlying model element.
	 * 
	 * @param element
	 *            a UI element, that may be a proxy for a model element
	 * @return the corresponding model element, or the given element if it is not a proxy
	 */
	public static Object resolve(final Object element) {
		Object resolved = element;
		if (element instanceof EObjectTreeElement) {
			resolved = ((EObjectTreeElement) element).getEObject();
		} else if (element instanceof EAttributeTreeElement) {
			resolved = ((EAttributeTreeElement) element).getEAttribute();
		} else if (element instanceof EReferenceTreeElement) {
			resolved = ((EReferenceTreeElement) element).getEReference();
		}
		return resolved;
	}

	/**
	 * @since 1.2
	 */
	public static EStructuralFeature getEStructuralFeature(final Object treeElt) {
		EStructuralFeature result = null;
		if (treeElt instanceof EReferenceTreeElement) {
			final EReferenceTreeElement refTreeElt = (EReferenceTreeElement) treeElt;
			result = refTreeElt.getEReference();
		}
		return result;
	}

	/**
	 * @since 1.2
	 */
	public static EObject getParentEObject(final Object object) {
		Object supposedTreeElt = null;
		if (!(object instanceof EObjectTreeElement)
				&& (object instanceof TreeElement)) {
			final TreeElement treeElt = (TreeElement) object;
			supposedTreeElt = treeElt.getParent();
		} else {
			supposedTreeElt = object;
		}
		return getEObject(supposedTreeElt);
	}

	/**
	 * @since 1.2
	 */
	public static EObject getEObject(final Object object) {
		EObject result = null;
		if (object instanceof EObjectTreeElement) {
			final EObjectTreeElement eObjTreeElt = (EObjectTreeElement) object;
			result = eObjTreeElt.getEObject();
		}
		return result;
	}
}
