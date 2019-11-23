/*******************************************************************************
 * Copyright (c) 2008, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Nicolas Payneau (Mia-Software) - Enable editability
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.editors;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.common.core.internal.utils.UriUtils;

/**
 * Listens to workspace changes to detect changed resources and update the
 * browser accordingly
 */
public class WorkspaceChangeListener implements IResourceChangeListener {

	private final EcoreBrowser fBrowser;

	public WorkspaceChangeListener(final EcoreBrowser browser) {
		this.fBrowser = browser;
	}

	public void resourceChanged(final IResourceChangeEvent event) {
		final IResourceDelta eventDelta = event.getDelta();
		try {
			class ResourceDeltaVisitor implements IResourceDeltaVisitor {
				private final ResourceSet resourceSet = WorkspaceChangeListener.this.fBrowser
						.getEditingDomain().getResourceSet();
				private final Collection<Resource> changedResourcesDelta = new ArrayList<Resource>();
				private final Collection<Resource> removedResourcesDelta = new ArrayList<Resource>();

				public boolean visit(final IResourceDelta deltaResource) {
					if (deltaResource.getResource().getType() == IResource.FILE) {
						if (deltaResource.getKind() == IResourceDelta.REMOVED
								|| deltaResource.getKind() == IResourceDelta.CHANGED
								&& deltaResource.getFlags() != IResourceDelta.MARKERS) {
							final String resourcePath = deltaResource.getFullPath().toString();
							final Resource resource = this.resourceSet.getResource(UriUtils
									.createUri(resourcePath), false);
							if (resource != null) {
								if (deltaResource.getKind() == IResourceDelta.REMOVED) {
									this.removedResourcesDelta.add(resource);
								} else if (!WorkspaceChangeListener.this.fBrowser
										.getSavedResources().remove(resource)) {
									this.changedResourcesDelta.add(resource);
								}
							}
						}
					}

					return true;
				}

				public Collection<Resource> getChangedResources() {
					return this.changedResourcesDelta;
				}

				public Collection<Resource> getRemovedResources() {
					return this.removedResourcesDelta;
				}
			}

			final ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();
			eventDelta.accept(visitor);

			if (!visitor.getRemovedResources().isEmpty()) {
				WorkspaceChangeListener.this.fBrowser.getSite().getShell().getDisplay().asyncExec(
						new Runnable() {
							public void run() {
								WorkspaceChangeListener.this.fBrowser.getRemovedResources().addAll(
										visitor.getRemovedResources());
								if (!WorkspaceChangeListener.this.fBrowser.isDirty()) {
									WorkspaceChangeListener.this.fBrowser.getSite().getPage()
											.closeEditor(WorkspaceChangeListener.this.fBrowser,
													false);
								}
							}
						});
			}

			if (!visitor.getChangedResources().isEmpty()) {
				WorkspaceChangeListener.this.fBrowser.getSite().getShell().getDisplay().asyncExec(
						new Runnable() {
							public void run() {
								WorkspaceChangeListener.this.fBrowser.getChangedResources().addAll(
										visitor.getChangedResources());
								if (WorkspaceChangeListener.this.fBrowser.getSite().getPage()
										.getActiveEditor() == WorkspaceChangeListener.this.fBrowser) {
									WorkspaceChangeListener.this.fBrowser.handleActivate();
								}
							}
						});
			}
		} catch (CoreException exception) {
			MoDiscoBrowserPlugin.logException(exception);
		}
	}

}
