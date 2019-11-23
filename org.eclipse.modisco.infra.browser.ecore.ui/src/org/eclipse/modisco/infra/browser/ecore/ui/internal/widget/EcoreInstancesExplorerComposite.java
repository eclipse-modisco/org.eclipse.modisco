/**
 * Copyright (c) 2015 Soft-Maint
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 471020 - Ecore Explorer View
 */
package org.eclipse.modisco.infra.browser.ecore.ui.internal.widget;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.modisco.facet.custom.core.ICustomizationManager;
import org.eclipse.modisco.facet.custom.core.ICustomizationManagerFactory;
import org.eclipse.modisco.facet.custom.ui.ICustomizedContentProviderFactory;
import org.eclipse.modisco.facet.custom.ui.IResolvingCustomizedLabelProviderFactory;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.core.IFacetManagerFactory;
import org.eclipse.modisco.facet.efacet.core.IFacetManagerListener;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class EcoreInstancesExplorerComposite extends Composite implements
		ISelectionProvider {

	private IFacetManager currentfacetMgr = null;

	private final TreeViewer tree;

	private final IFacetManagerListener facetMgrListener = new IFacetManagerListener() {
		public void facetManagerChanged() {
			EcoreInstancesExplorerComposite.this.facetManagerChanged();
		}
	};

	public EcoreInstancesExplorerComposite(final Composite parent) {
		super(parent, SWT.NONE);

		setLayout(new GridLayout(1, true));

		final Label label = new Label(this, SWT.NONE);
		label.setText(Messages.EcoreInstancesExplorerComposite_Instances);

		this.tree = new TreeViewer(this);
		this.tree.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true));
	}

	protected void facetManagerChanged() {
		final Object[] expandedElts = this.tree.getExpandedElements();
		this.tree.refresh();
		this.tree.setExpandedElements(expandedElts);
	}

	public void changeInput(final Collection<EObject> eObjects) {
		if (this.tree == null || eObjects == null || eObjects.isEmpty()
				|| eObjects.equals(this.tree.getInput())) {
			clearInput();
		} else {
			/*
			 * Here we assume that all the Eobject are owned by the same
			 * resourceSet
			 */
			final EObject eObject = (EObject) eObjects.toArray()[0];
			final Resource eResource = eObject.eResource();
			final ResourceSet resourceSet = eResource.getResourceSet();
			final IFacetManager newFacetManager = IFacetManagerFactory.DEFAULT
					.getOrCreateDefaultFacetManager(resourceSet);
			if (newFacetManager != this.currentfacetMgr) {
				/*
				 * We clear the tree to optimize the tree computation, the
				 * setInplut is called againt at the end of the method
				 */
				clearInput();

				newFacetManager.addListener(this.facetMgrListener);
				this.currentfacetMgr = newFacetManager;
				final ICustomizationManager customizationMgr = ICustomizationManagerFactory.DEFAULT
						.createICustomizationManager(this.currentfacetMgr);
				final ILabelProvider labelProvider = IResolvingCustomizedLabelProviderFactory.DEFAULT
						.createCustomizedLabelProvider(customizationMgr);
				final IContentProvider contentProvider = ICustomizedContentProviderFactory.DEFAULT
						.createCustomizedTreeContentProvider(customizationMgr);
				this.tree.setContentProvider(contentProvider);
				this.tree.setLabelProvider(labelProvider);
			}
			this.tree.setInput(eObjects);
			this.tree.refresh();
		}
	}

	public void clearInput() {
		if (this.currentfacetMgr != null && !this.tree.getTree().isDisposed()) {
			this.currentfacetMgr.removeListener(this.facetMgrListener);
			this.tree.setInput(null);
		}
	}

	@Override
	public void dispose() {
		if (this.currentfacetMgr != null) {
			this.currentfacetMgr.removeListener(this.facetMgrListener);
		}
		super.dispose();
	}

	public void addSelectionChangedListener(
			final ISelectionChangedListener listener) {
		this.tree.addSelectionChangedListener(listener);
	}

	public ISelection getSelection() {
		return this.tree.getSelection();
	}

	public void removeSelectionChangedListener(
			final ISelectionChangedListener listener) {
		this.tree.removeSelectionChangedListener(listener);
	}

	public void setSelection(final ISelection selection) {
		this.tree.setSelection(selection);
	}

}
