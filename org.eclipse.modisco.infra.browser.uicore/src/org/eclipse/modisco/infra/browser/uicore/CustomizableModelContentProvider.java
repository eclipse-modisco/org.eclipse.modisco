/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.uicore;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.modisco.infra.browser.uicore.internal.AppearanceConfiguration;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ITreeElement;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ModelElementItem;

/**
 * A tree content provider used to display a model customized with a MoDico customization.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class CustomizableModelContentProvider implements ITreeContentProvider {

	private final AppearanceConfiguration appearanceConfiguration;

	public CustomizableModelContentProvider(final CustomizationManager customizationManager) {
		this.appearanceConfiguration = customizationManager.getAppearanceConfiguration();
	}

	public Object[] getElements(final Object inputElement) {
		Object[] rootElements = getRootElements(inputElement);
		if (rootElements == null) {
			return null;
		}
		List<Object> result = new ArrayList<Object>();
		for (Object element : rootElements) {
			if (element instanceof EObject) {
				EObject eObject = (EObject) element;
				result.add(new ModelElementItem(eObject, null, this.appearanceConfiguration));
			} else {
				result.add(element);
			}
		}
		return result.toArray();
	}

	public Object[] getRootElements(final Object inputElement) {
		if (inputElement instanceof IFile) {
			IFile file = (IFile) inputElement;
			ResourceSet resourceSet = new ResourceSetImpl();
			URI uri = URI.createFileURI(file.getLocation().toString());
			Resource resource = resourceSet.getResource(uri, true);
			if (resource != null) {
				synchronized (resource) {
					EList<EObject> contents = resource.getContents();
					return contents.toArray();
				}
			}
		}
		return null;
	}

	public void dispose() {
		// nothing
	}

	public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
		// nothing
	}

	public Object[] getChildren(final Object parentElement) {
		if (parentElement instanceof ITreeElement) {
			final ITreeElement treeElement = (ITreeElement) parentElement;
			return treeElement.getChildren().toArray();
		}
		return null;
	}

	public Object getParent(final Object element) {
		if (element instanceof ITreeElement) {
			final ITreeElement treeElement = (ITreeElement) element;
			return treeElement.getTreeParent();
		}
		return null;
	}

	public boolean hasChildren(final Object element) {
		if (element instanceof ITreeElement) {
			final ITreeElement treeElement = (ITreeElement) element;
			return treeElement.hasChildren();
		}
		return false;
	}

}
