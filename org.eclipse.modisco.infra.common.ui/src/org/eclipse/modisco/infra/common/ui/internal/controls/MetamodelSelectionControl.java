/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.common.ui.internal.controls;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.swt.widgets.Composite;

/**
 * A control for selecting a metamodel from a list of metamodels, that can be
 * filtered using the associated text field.
 */
public class MetamodelSelectionControl extends FilteredElementSelectionControl {

	public MetamodelSelectionControl(final Composite parent) {
		super(parent, true, false);

		final Set<String> uris = new TreeSet<String>();
		for (final Object name : ((Map<?, ?>) EPackage.Registry.INSTANCE).keySet()) {
			uris.add((name).toString());
		}
		setElements(uris.toArray());
	}
}
