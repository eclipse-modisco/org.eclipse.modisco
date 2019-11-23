/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.editor.editors;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.modisco.infra.browser.custom.editor.Activator;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;

/** Listens to workspace changes to detect changed resources and update the editor accordingly. */
public class WorkspaceChangeListener implements IResourceChangeListener {

	private final CustomizationEditor customizationEditor;

	public WorkspaceChangeListener(final CustomizationEditor customizationEditor) {
		this.customizationEditor = customizationEditor;
	}

	/** Whether the resource was last saved by the customization editor */
	private boolean editorSaved = false;

	public void setEditorSaved(final boolean editorSaved) {
		this.editorSaved = editorSaved;
	}

	public void resourceChanged(final IResourceChangeEvent event) {
		final IResourceDelta eventDelta = event.getDelta();
		try {
			class ResourceDeltaVisitor implements IResourceDeltaVisitor {
				private boolean changed = false;
				private boolean removed = false;

				public boolean isChanged() {
					return this.changed;
				}

				public boolean isRemoved() {
					return this.removed;
				}

				public boolean visit(final IResourceDelta deltaResource) {
					if (deltaResource.getResource().getType() == IResource.FILE) {
						if (deltaResource.getKind() == IResourceDelta.REMOVED
								|| deltaResource.getKind() == IResourceDelta.CHANGED
								&& deltaResource.getFlags() != IResourceDelta.MARKERS) {
							MetamodelView metamodelView = WorkspaceChangeListener.this.customizationEditor
									.getMetamodelView();
							if (metamodelView != null) {
								Resource eResource = metamodelView.eResource();
								if (eResource != null) {
									IPath filePath = null;
									if (eResource.getURI().isPlatformResource()) {
										filePath = new Path(eResource.getURI().path())
												.removeFirstSegments(1).makeAbsolute();
									} else if (eResource.getURI().isFile()) {
										IPath workspaceLocation = ResourcesPlugin.getWorkspace()
												.getRoot().getLocation();

										IPath path = new Path(eResource.getURI().toFileString());
										int nSegments = path
												.matchingFirstSegments(workspaceLocation);
										if (nSegments == workspaceLocation.segmentCount()) {
											filePath = path.removeFirstSegments(nSegments)
													.setDevice(null).makeAbsolute();
										} else {
											MoDiscoLogger.logError(
													"Not a workspace file", Activator.getDefault()); //$NON-NLS-1$
										}
									} else {
										MoDiscoLogger
												.logError(
														"Unhandled resource URI kind", Activator.getDefault()); //$NON-NLS-1$
									}

									if (filePath != null
											&& filePath.equals(deltaResource.getFullPath())) {
										if (deltaResource.getKind() == IResourceDelta.REMOVED) {
											this.removed = true;
										} else {
											if (WorkspaceChangeListener.this.editorSaved) {
												WorkspaceChangeListener.this.editorSaved = false;
											} else {
												this.changed = true;
											}
										}
									}
								}
							}
						}
					}

					return true;
				}
			}

			final ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();
			eventDelta.accept(visitor);

			if (visitor.isRemoved()) {
				handleRemoved();
			} else if (visitor.isChanged()) {
				handleChanged();
			}

		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	public void handleChanged() {
		final CustomizationEditor editor = WorkspaceChangeListener.this.customizationEditor;
		editor.getSite().getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				editor.setResourceChanged(true);
				if (editor.getSite().getPage().getActiveEditor() == editor) {
					editor.handleActivate();
				}
			}
		});
	}

	public void handleRemoved() {
		final CustomizationEditor editor = WorkspaceChangeListener.this.customizationEditor;
		editor.getSite().getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				editor.setResourceDeleted(true);
				if (!editor.isDirty()) {
					editor.getSite().getPage().closeEditor(editor, false);
				}
			}
		});
	}

}
