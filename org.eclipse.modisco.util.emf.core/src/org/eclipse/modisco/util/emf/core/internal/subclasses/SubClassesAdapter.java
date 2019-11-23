/**
 * Copyright (c) 2015, 2019 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 471597 - [New Browser] Add a customization to display subclasses from an EClass
 */
package org.eclipse.modisco.util.emf.core.internal.subclasses;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;

public class SubClassesAdapter implements Adapter {

	private final Set<EClass> subClasses = new HashSet<EClass>();

	public void notifyChanged(final Notification notification) {
		// Nothing to do
	}

	public Notifier getTarget() {
		return null;
	}

	public void setTarget(final Notifier newTarget) {
		// Nothing to do
	}

	public boolean isAdapterForType(final Object type) {
		return false;
	}

	public Set<EClass> getSubclasses() {
		return this.subClasses;
	}

	public void add(final EClass superClass) {
		this.subClasses.add(superClass);
	}

}
