/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.facet.ui.views;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.FacetPackage;
import org.eclipse.modisco.infra.facet.FacetSet;

/**
 * @author gdupe
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public class FacetSetContentProvider implements ITreeContentProvider {

	private EClass depth;

	/**
	 * @param depth
	 *            stop displaying children in the tree for instances of this
	 *            {@link EClass} and below
	 */
	public FacetSetContentProvider(final EClass depth) {
		if (depth == null) {
			this.depth = FacetPackage.eINSTANCE.getFacetSet();
		} else {
			this.depth = depth;
		}
	}

	public Object[] getElements(final Object inputElement) {
		if (!(inputElement instanceof Object[])) {
			RuntimeException e;
			if (inputElement != null) {
				e = new RuntimeException("Unexpected inputElement type: " //$NON-NLS-1$
						+ inputElement.getClass().getName());
			} else {
				e = new RuntimeException("inputElement must not be null."); //$NON-NLS-1$
			}
			throw e;
		}
		return (Object[]) inputElement;
	}

	public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
		// Nothing to do
	}

	public Object[] getChildren(final Object parentElement) {
		if (this.depth.isInstance(parentElement)) {
			return new Object[] {};
		} else if (parentElement instanceof FacetSet) {
			FacetSet facetSet = (FacetSet) parentElement;
			return facetSet.getFacets().toArray();
		} else if (parentElement instanceof Facet) {
			Facet facet = (Facet) parentElement;
			return facet.getEStructuralFeatures().toArray();
		} else {
			throw new RuntimeException("Unexpected inputElement type: " //$NON-NLS-1$
					+ parentElement.getClass().getName());
		}
	}

	public Object getParent(final Object element) {
		if (element instanceof EObject) {
			EObject eObject = (EObject) element;
			return eObject.eContainer();
		}
		throw new RuntimeException("Unexpected inputElement type: " //$NON-NLS-1$
				+ element.getClass().getName());
	}

	public boolean hasChildren(final Object element) {
		return getChildren(element).length > 0;
	}

	public void dispose() {
		// Nothing to do
	}
}
