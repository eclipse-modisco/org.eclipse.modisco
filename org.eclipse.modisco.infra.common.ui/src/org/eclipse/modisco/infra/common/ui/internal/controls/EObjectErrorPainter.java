/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Gregore Dupe (Mia-Software) - Bug 376699 - Eclipse 4.2 crash when creating a new facet model
 *******************************************************************************/
package org.eclipse.modisco.infra.common.ui.internal.controls;

import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.MoDiscoCommonUIPlugin;
import org.eclipse.modisco.infra.common.ui.internal.util.ImageProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class EObjectErrorPainter {

	private static final String DATA_KEY_ERROR_MARKER = "errorMarker"; //$NON-NLS-1$
	private final IEditorInput editorInput;
	private final EditingDomain editingDomain;

	public EObjectErrorPainter(final IEditorInput editorInput, final EditingDomain editingDomain) {
		this.editorInput = editorInput;
		this.editingDomain = editingDomain;
	}

	public IMarker getError(final EObject eObject) {
		try {
			if (this.editorInput instanceof IFileEditorInput) {
				IFileEditorInput fileEditorInput = (IFileEditorInput) this.editorInput;
				IFile file = fileEditorInput.getFile();
				if (!file.exists()) {
					return null;
				}
				IMarker[] markers = file.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_ONE);
				for (IMarker marker : markers) {
					if (marker.getType().equals(EValidator.MARKER)
							|| marker.getType().equals(AbstractMoDiscoCatalog.BROKEN_REF_MARKER)) {
						String uriAttribute = marker.getAttribute(EValidator.URI_ATTRIBUTE, null);
						if (uriAttribute != null) {
							URI uri = URI.createURI(uriAttribute);
							String encoded = uri.toString().replaceAll(" ", "%20"); //$NON-NLS-1$ //$NON-NLS-2$
							if (!encoded.equals(uri.toString())) {
								uri = URI.createURI(encoded);
							}
							EObject objectWithURI = this.editingDomain.getResourceSet().getEObject(
									uri, true);
							if (eObject == objectWithURI) {
								return marker;
							}
						}
					}
				}
			}
		} catch (Exception e) {
			MoDiscoLogger.logError(e, MoDiscoCommonUIPlugin.getDefault());
		}
		return null;
	}

	public void installOn(final Tree tree) {
		tree.addListener(SWT.PaintItem, new Listener() {
			public void handleEvent(final Event event) {
				handlePaintError(event);
			}
		});
		tree.setToolTipText(""); //$NON-NLS-1$
		addTooltip(tree);
	}

	protected void handlePaintError(final Event event) {
		final TreeItem item = (TreeItem) event.item;
		final Object data = item.getData();

		if (data instanceof Resource) {
			Resource resource = (Resource) data;
			EList<EObject> contents = resource.getContents();
			for (EObject eObject : contents) {
				EObjectMarker marker = firstMarker(eObject);
				if (marker != null) {
					paintError(event);
				}
			}
		} else if (data instanceof EObject) {
			EObject eObject = (EObject) data;
			EObjectMarker marker = firstMarker(eObject);
			if (marker != null) {
				if (marker.eObject == eObject) {
					item.setData(EObjectErrorPainter.DATA_KEY_ERROR_MARKER, marker.marker);
				}
				paintError(event);
			} else {
				item.setData(EObjectErrorPainter.DATA_KEY_ERROR_MARKER, null);
			}
		}
	}

	private void paintError(final Event event) {
		Image image = ImageProvider.getInstance().getErrorIcon();
		event.gc.drawImage(image, event.x - 2, event.y + event.height - image.getBounds().height);
	}

	private static final class EObjectMarker {
		private EObjectMarker() {
			// to make checkstyle happy
		}

		private EObject eObject;
		private IMarker marker;
	}

	/**
	 * Find the first error marker on the EObject, or on its children, or
	 * grand-children, etc.
	 */
	private EObjectMarker firstMarker(final EObject eObject) {
		LinkedList<EObject> elements = new LinkedList<EObject>();
		elements.add(eObject);
		while (!elements.isEmpty()) {
			EObject e = elements.removeFirst();
			IMarker marker = getError(e);
			if (marker != null) {
				EObjectMarker eObjectMarker = new EObjectMarker();
				eObjectMarker.eObject = e;
				eObjectMarker.marker = marker;
				return eObjectMarker;
			}
			elements.addAll(e.eContents());
		}
		return null;
	}

	private void addTooltip(final Tree tree) {
		Tooltip tooltip = new Tooltip() {
			@Override
			protected void onHover(final TreeItem item) {
				Display display = Display.getCurrent();
				Object data = item.getData(EObjectErrorPainter.DATA_KEY_ERROR_MARKER);
				if (data instanceof IMarker) {
					IMarker marker = (IMarker) data;
					String text = null;
					try {
						text = (String) marker.getAttribute(IMarker.MESSAGE);
					} catch (CoreException e) {
						MoDiscoLogger.logError(e, MoDiscoCommonUIPlugin.getDefault());
					}
					if (text != null) {
						createTooltip(display, text, item);
					}

				}
			}
		};
		tooltip.installOn(tree);
	}
}