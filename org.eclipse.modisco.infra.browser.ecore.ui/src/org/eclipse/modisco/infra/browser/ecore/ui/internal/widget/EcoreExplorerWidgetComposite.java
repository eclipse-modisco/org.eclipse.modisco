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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.facet.custom.core.ICustomizationManager;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.view.Utils;
import org.eclipse.modisco.util.emf.core.allinstances.AllInstancesUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public class EcoreExplorerWidgetComposite extends Composite implements
		ISelectionProvider {

	private final SashForm sashForm;
	private final EcoreMetaExplorerComposite metaComposite;
	private final EcoreInstancesExplorerComposite instComposite;
	private final Set<Resource> currentResources = new HashSet<Resource>();

	public EcoreExplorerWidgetComposite(final Composite parent,
			final MenuManager menuManager) {
		super(parent, SWT.NONE);

		setLayout(new FillLayout());

		this.sashForm = new SashForm(this, SWT.VERTICAL);

		this.metaComposite = new EcoreMetaExplorerComposite(this.sashForm,
				menuManager);
		this.instComposite = new EcoreInstancesExplorerComposite(this.sashForm);

		this.metaComposite
				.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(
							final SelectionChangedEvent event) {
						final ISelection metaSelection = getSelection();
						updateAllInstances(metaSelection);
					}
				});

		addListener(SWT.Resize, new Listener() {
			public void handleEvent(final Event event) {
				updateSashOrientation();
			}
		});
	}

	protected final void updateAllInstances(final ISelection metaSelection) {
		final Set<EObject> allInstances = new HashSet<EObject>();
		if (metaSelection instanceof IStructuredSelection) {
			final IStructuredSelection structSelection = (IStructuredSelection) metaSelection;
			for (Object selectedObj : structSelection.toArray()) {
				final EObject eObject = Utils.getResolvedEObject(selectedObj);
				if (eObject instanceof EClass) {
					final EClass eClass = (EClass) eObject;
					for (Resource resource : this.currentResources) {
						final List<EObject> instances = AllInstancesUtils
								.allInstances(eClass, resource, false);
						allInstances.addAll(instances);
					}
				}
			}
		}
		this.instComposite.changeInput(allInstances);
	}

	protected void updateSashOrientation() {
		final Point compositeSize = getSize();
		if (compositeSize.x > compositeSize.y) {
			this.sashForm.setOrientation(SWT.HORIZONTAL);
		} else {
			this.sashForm.setOrientation(SWT.VERTICAL);
		}
	}

	public void changeInput(final Collection<EObject> eObjects) {
		final Set<EPackage> ePackages = new HashSet<EPackage>();
		for (EObject eObject : eObjects) {
			final Resource eResource = eObject.eResource();
			this.currentResources.add(eResource);
			final EPackage ePackage = Utils.getEPackage(eObject);
			ePackages.add(ePackage);
		}
		this.instComposite.clearInput();
		this.metaComposite.changeInput(ePackages);
	}

	public ICustomizationManager getCustomizationManager() {
		return this.metaComposite.getCustomizationManager();
	}

	public IFacetManager getFacetManager() {
		return this.metaComposite.getFacetManager();
	}

	public void addSelectionChangedListener(
			final ISelectionChangedListener listener) {
		this.metaComposite.addSelectionChangedListener(listener);
	}

	public ISelection getSelection() {
		return this.metaComposite.getSelection();
	}

	public void removeSelectionChangedListener(
			final ISelectionChangedListener listener) {
		this.metaComposite.removeSelectionChangedListener(listener);
	}

	public void setSelection(final ISelection selection) {
		this.metaComposite.setSelection(selection);
	}

}
