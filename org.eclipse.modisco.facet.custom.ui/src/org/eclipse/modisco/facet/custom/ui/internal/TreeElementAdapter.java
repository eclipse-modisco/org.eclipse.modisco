/*******************************************************************************
 * Copyright (c) 2012, 2016 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 386387 - [CustomizedTreeContentProvider] The TreeElements are not preserved between two calls to getElements()
 *    Gregoire Dupe (Mia-Software) - Bug 441570 - Children custom property
 *    Grégoire Dupé (Mia-Software) - Bug 506334 - Need to know which TreeElement has been updated
 *    Grégoire Dupé (Mia-Software) - Bug 506930 - Proxy resolution break the CustomizedTreeContentProvider
 *******************************************************************************/
package org.eclipse.modisco.facet.custom.ui.internal;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EAttributeTreeElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EReferenceTreeElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement;
import org.eclipse.modisco.facet.custom.ui.ICustomizedContentProviderFactory.IContentListener;
import org.eclipse.modisco.facet.custom.ui.internal.exception.CustomizedContentProviderRuntimeException;
import org.eclipse.modisco.facet.util.core.DebugUtils;
import org.eclipse.osgi.util.NLS;

public class TreeElementAdapter implements Adapter {

	private static final boolean DEBUG = DebugUtils.getDebugStatus(Activator
			.getDefault());

	private final EObjectTreeElement treeElement;
	private final IContentListener contentListener;
	private Notifier target;

	public TreeElementAdapter(final EObjectTreeElement treeElement,
			final IContentListener contentListener) {
		this.treeElement = treeElement;
		this.contentListener = contentListener;
	}

	public void notifyChanged(final Notification notification) {
		DebugUtils.debug(DEBUG,
				"Modified element=" + this.treeElement.getEObject()); //$NON-NLS-1$
		DebugUtils.debug(DEBUG,
				"Notification feature=" + notification.getFeature()); //$NON-NLS-1$
		for (TreeElement subElement : this.treeElement.getChildren()) {
			final EStructuralFeature feature = getSF(subElement);
			if (feature.equals(notification.getFeature())) {
				if (notification.getEventType() == Notification.RESOLVE) {
					final EObjectTreeElement toBeChanged = findWrapperOf(
							subElement.getChildren(),
							notification.getOldValue());
					if (toBeChanged != null) {
						toBeChanged.setEObject(
								(EObject) notification.getNewValue());
					}
				} else {
					subElement.getChildren().clear();
				}
				DebugUtils.debug(
						DEBUG,
						NLS.bind(
								"Cleanning= {0}::{1}", //$NON-NLS-1$
								feature.getContainerClass().getName(),
								feature.getName()));
				this.contentListener.onUpdate(this.treeElement);
			}
		}
	}

	private static EObjectTreeElement findWrapperOf(final EList<TreeElement> children,
			final Object oldValue) {
		EObjectTreeElement result = null;
		for (TreeElement child : children) {
			if (child instanceof EObjectTreeElement) {
				EObjectTreeElement eObjChild = (EObjectTreeElement) child;
				if (eObjChild.getEObject() == oldValue) {
					result = eObjChild;
					break;
				}
			}
		}
		return result;
	}

	private static EStructuralFeature getSF(final TreeElement structFeatuteTE) {
		EStructuralFeature result;
		if (structFeatuteTE instanceof EAttributeTreeElement) {
			final EAttributeTreeElement eAttributeTE = (EAttributeTreeElement) structFeatuteTE;
			result = eAttributeTE.getEAttribute();
		} else if (structFeatuteTE instanceof EReferenceTreeElement) {
			final EReferenceTreeElement eReferenceTE = (EReferenceTreeElement) structFeatuteTE;
			result = eReferenceTE.getEReference();
		} else {
			throw new CustomizedContentProviderRuntimeException(
					"Illegal agrument: " + structFeatuteTE); //$NON-NLS-1$
		}
		return result;
	}

	public Notifier getTarget() {
		return this.target;
	}

	public void setTarget(final Notifier newTarget) {
		if (newTarget != null) {
			this.target = newTarget;
		}
	}

	public boolean isAdapterForType(final Object type) {
		return false;
	}
	
	public EObjectTreeElement getTreeElement() {
		return this.treeElement;
	}

}
