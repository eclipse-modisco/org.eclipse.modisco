/*******************************************************************************
 * Copyright (c) 2012 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.ui.util;

import org.eclipse.emf.facet.widgets.celleditors.ICompositeEditorFactory;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IDiscovererList;
import org.eclipse.swt.widgets.Composite;

/**
 * Composite editor factory for the list of discoverers
 * @author Guillaume Doux
 *
 */
public class DiscovererListCompositeFactory implements ICompositeEditorFactory<IDiscovererList> {

	public Class<IDiscovererList> getHandledType() {
		return IDiscovererList.class;
	}

	public DiscovererListComposite createCompositeEditor(
			final Composite parent, final int style) {
		return new DiscovererListComposite(parent, style);
	}

}
