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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.exported.IEcoreExplorerWidget;

public final class InternalUtils {

	private InternalUtils() {
		// DO NOTHING
	}

	public static List<EcoreExplorerAdapter> getEcoreExplorerAdapters(
			final EPackage ePackage) {
		final List<EcoreExplorerAdapter> adaptersToRemove = new ArrayList<EcoreExplorerAdapter>();
		for (Adapter adapter : ePackage.eAdapters()) {
			if (adapter instanceof EcoreExplorerAdapter) {
				final EcoreExplorerAdapter ecoreExplAdapt = (EcoreExplorerAdapter) adapter;
				adaptersToRemove.add(ecoreExplAdapt);
			}
		}
		return adaptersToRemove;
	}

	public static Set<EObject> getAllInstancesFor(final EClass eClass) {
		final Set<EObject> result = new HashSet<EObject>();
		final EPackage ePackage = eClass.getEPackage();
		final List<EcoreExplorerAdapter> adapters = getEcoreExplorerAdapters(ePackage);
		for (EcoreExplorerAdapter adapter : adapters) {
			final IEcoreExplorerWidget widget = adapter.getWidget();
			final Set<EObject> eObjects = widget.getInstancesOf(eClass);
			result.addAll(eObjects);
		}
		return result;
	}

}
