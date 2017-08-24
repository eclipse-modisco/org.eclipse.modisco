/**
 * Copyright (c) 2016 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 506318 - [New Browser] Drag and drop support
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.editor;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.custom.ui.CustomizedContentProviderUtils;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.widgets.TreeItem;

public class TreeEditorDropListener implements DropTargetListener {

	private final EditingDomain editingDomain;

	public TreeEditorDropListener(final EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}

	public void dragEnter(final DropTargetEvent event) {
		// TODO Auto-generated method stub
	}

	public void dragLeave(final DropTargetEvent event) {
		// TODO Auto-generated method stub

	}

	public void dragOperationChanged(final DropTargetEvent event) {
		// TODO Auto-generated method stub

	}

	public void dragOver(final DropTargetEvent event) {
		// TODO Auto-generated method stub
	}

	public void drop(final DropTargetEvent event) {
		Object value = null;
		if (event.data instanceof IStructuredSelection) {
			final IStructuredSelection structSelection = (IStructuredSelection) event.data;
			if (structSelection.size() == 1) {
				value = structSelection.getFirstElement();
			} else {
				value = structSelection.toList();
			}
		}
		final TreeItem item = (TreeItem) event.item;
		final Object data = item.getData();
		final EStructuralFeature structFeature =
				CustomizedContentProviderUtils.getEStructuralFeature(data);
		if (structFeature != null) {
			final EObject eObject = CustomizedContentProviderUtils.getParentEObject(data);
			eObjDrop(eObject, structFeature, value);
		}
	}

	private void eObjDrop(final EObject eObject,
			final EStructuralFeature feature, final Object value) {
		final Resource eResource = eObject.eResource();
		final ResourceSet resourceSet = eResource.getResourceSet();
		Command command;
		if (feature.isMany()) {
			if (value instanceof Collection<?>) {
				final Collection<EObject> collection = EmfUtils
						.getCollectionFrom(resourceSet, (Collection<?>) value);
				command = AddCommand.create(this.editingDomain, eObject,
						feature, collection);
			} else if (value instanceof EObject) {
				final EObject eObjectVal = EmfUtils.getEObjectFrom(resourceSet,
						(EObject) value);
				command = AddCommand.create(this.editingDomain, eObject,
						feature, eObjectVal);
			} else if (value == null) {
				throw new IllegalStateException(
						"Unexpected value : null found while expecting an EObject or a collection of EObjects." //$NON-NLS-1$
					);
			} else {
				final String message = String.format(
					"Unexpected value type: '%s' found while expecting an EObject or a collection of EObjects.", //$NON-NLS-1$
					value.getClass());
				throw new IllegalStateException(message);
			}
		} else {
			final EObject eObjectVal = EmfUtils.getEObjectFrom(resourceSet,
					(EObject) value);
			command = SetCommand.create(this.editingDomain, eObject, feature,
					eObjectVal);
		}
		this.editingDomain.getCommandStack().execute(command);
	}

	public void dropAccept(final DropTargetEvent event) {
		// TODO Auto-generated method stub
	}

}