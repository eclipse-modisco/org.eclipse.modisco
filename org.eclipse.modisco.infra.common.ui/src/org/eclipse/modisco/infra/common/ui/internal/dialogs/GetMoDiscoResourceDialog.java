/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.ui.internal.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog;
import org.eclipse.modisco.infra.common.core.internal.builder.EcoreCatalog;
import org.eclipse.modisco.infra.common.ui.internal.Messages;
import org.eclipse.modisco.infra.common.ui.internal.util.ImageProvider;
import org.eclipse.modisco.infra.common.ui.internal.util.ImageUtils;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;

public class GetMoDiscoResourceDialog extends ElementTreeSelectionDialog {

	protected static final String CATALOG_ICON_URL = "/icons/catalog.png"; //$NON-NLS-1$

	public GetMoDiscoResourceDialog(final Shell parent) {
		super(parent, createLabelProvider(), createContentProvider());
		setInput(AbstractMoDiscoCatalog.getCatalogs());
		setTitle(Messages.GetMoDiscoResourceDialog_loadMoDiscoResource);
	}

	private static ITreeContentProvider createContentProvider() {
		return new ITreeContentProvider() {
			public Object[] getChildren(final Object parentElement) {
				if (parentElement instanceof AbstractMoDiscoCatalog) {
					AbstractMoDiscoCatalog catalog = (AbstractMoDiscoCatalog) parentElement;
					return catalog.getAllRootObjects().toArray();
				}
				return new Object[] {};
			}

			public Object getParent(final Object element) {
				return null;
			}

			public boolean hasChildren(final Object element) {
				if (element instanceof List<?>) {
					List<?> objectList = (List<?>) element;
					List<AbstractMoDiscoCatalog> catalogList = new ArrayList<AbstractMoDiscoCatalog>();
					for (Object object : objectList) {
						if (object instanceof AbstractMoDiscoCatalog) {
							AbstractMoDiscoCatalog catalog = (AbstractMoDiscoCatalog) object;
							catalogList.add(catalog);
						}
					}
					return catalogList.size() > 0;
				} else if (element instanceof AbstractMoDiscoCatalog) {
					AbstractMoDiscoCatalog catalog = (AbstractMoDiscoCatalog) element;
					return catalog.getAllRootObjects().size() > 0;
				}
				return false;
			}

			public Object[] getElements(final Object inputElement) {
				if (inputElement == null) {
					return AbstractMoDiscoCatalog.getCatalogs().toArray();
				} else if (inputElement instanceof List<?>) {
					List<?> objectList = (List<?>) inputElement;
					List<AbstractMoDiscoCatalog> catalogList = new ArrayList<AbstractMoDiscoCatalog>();
					for (Object object : objectList) {
						if (object instanceof AbstractMoDiscoCatalog) {
							if (!(object instanceof EcoreCatalog)) {
								AbstractMoDiscoCatalog catalog = (AbstractMoDiscoCatalog) object;
								catalogList.add(catalog);
							}
						}
					}
					return catalogList.toArray(new AbstractMoDiscoCatalog[catalogList.size()]);
				}
				return null;
			}

			public void dispose() {
				// Nothing to do
			}

			public void inputChanged(final Viewer viewer, final Object oldInput,
					final Object newInput) {
				// Nothing to do
			}

		};
	}

	private static ILabelProvider createLabelProvider() {
		return new LabelProvider() {

			@Override
			public boolean isLabelProperty(final Object element, final String property) {
				if (element instanceof AbstractMoDiscoCatalog) {
					return true;
				} else if (element instanceof EObject) {
					return true;
				}
				return false;
			}

			@Override
			public String getText(final Object element) {
				if (element instanceof AbstractMoDiscoCatalog) {
					AbstractMoDiscoCatalog catalog = (AbstractMoDiscoCatalog) element;
					return catalog.getClass().getSimpleName();
				} else if (element instanceof EObject) {
					EObject eObject = (EObject) element;
					for (EAttribute eAttribute : eObject.eClass().getEAttributes()) {
						if (eAttribute.getName().equals("name")) { //$NON-NLS-1$
							return eObject.eGet(eAttribute).toString();
						}
					}
				}
				return ""; //$NON-NLS-1$
			}

			@Override
			public Image getImage(final Object element) {
				if (element instanceof AbstractMoDiscoCatalog) {
					return ImageProvider.getInstance().getCatalogIcon();
				}
				return ImageUtils.getImage(element);
			}
		};
	}

}
