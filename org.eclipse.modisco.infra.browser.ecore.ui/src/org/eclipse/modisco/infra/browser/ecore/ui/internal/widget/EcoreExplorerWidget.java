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
import org.eclipse.jface.action.MenuManager;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.exported.IEcoreExplorerWidget;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.view.Utils;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.widget.EcoreExplorerWidgetComposite.IEClassSelectionListener;
import org.eclipse.modisco.util.emf.core.allinstances.AllInstancesUtils;
import org.eclipse.swt.widgets.Composite;

public class EcoreExplorerWidget implements IEcoreExplorerWidget {

	private final EcoreExplorerWidgetComposite composite;
	private final Set<Resource> currentResources = new HashSet<Resource>();
	private final Set<EPackage> displayedEPkgs = new HashSet<EPackage>();

	EcoreExplorerWidget(final Composite parent) {
		this(parent, new MenuManager(EcoreExplorerWidget.class.getName(),
				EcoreExplorerWidget.class.getName()));
	}

	EcoreExplorerWidget(final Composite parent, final MenuManager menuManager) {
		this.composite = new EcoreExplorerWidgetComposite(parent, menuManager);
		this.composite.addEClassSelectionListener(new IEClassSelectionListener() {
			public void onEClassSelected(final Set<EClass> eClasses) {
				EcoreExplorerWidget.this.displayInstancesOf(eClasses);
			}
		});
	}

	protected void displayInstancesOf(final Set<EClass> eClasses) {
		final Set<EObject> allInstances = new HashSet<EObject>();
		for (EClass eClass : eClasses) {
			final Set<EObject> eClassInstances = getInstancesOf(eClass);
			allInstances.addAll(eClassInstances);
		}
		this.composite.displayInstances(allInstances);
	}

	public Set<EObject> getInstancesOf(final EClass eClass) {
		final Set<EObject> allInstances = new HashSet<EObject>();
		for (Resource resource : this.currentResources) {
			final List<EObject> instances = AllInstancesUtils
					.allInstances(eClass, resource, false);
			allInstances.addAll(instances);
		}
		return allInstances;
	}

	public Object getAdapter(@SuppressWarnings("rawtypes") final Class adapter) {
		// @SuppressWarnings("rawtypes") Raw Type because of the implementation
		Object result = null;
		if (adapter.isInstance(this)) {
			result = this;
		} else if (adapter.isInstance(this.composite)) {
			result = this.composite;
		}
		return result;
	}

	public void changeInput(final Collection<EObject> eObjects) {
		for (EPackage ePackage : this.displayedEPkgs) {
			removeAllAdapter(ePackage);
		}
		final Set<EPackage> pkgsToDisplay = new HashSet<EPackage>();
		for (EObject eObject : eObjects) {
			final Resource eResource = eObject.eResource();
			this.currentResources.add(eResource);
			final EPackage ePackage = Utils.getEPackage(eObject);
			pkgsToDisplay.add(ePackage);
		}
		for (EPackage ePackage : pkgsToDisplay) {
			removeAllAdapter(ePackage);
			/*
			 * TCI> NOPMD: We have to create a new adapter for each package 
			 */
			ePackage.eAdapters().add(new EcoreExplorerAdapter(this)); // NOPMD
		}
		this.displayedEPkgs.clear();
		this.displayedEPkgs.addAll(pkgsToDisplay);
		this.composite.changeInput(pkgsToDisplay);
	}

	private static void removeAllAdapter(final EPackage ePackage) {
		final List<EcoreExplorerAdapter> adaptersToRemove = InternalUtils
				.getEcoreExplorerAdapters(ePackage);
		ePackage.eAdapters().removeAll(adaptersToRemove);
	}

}
