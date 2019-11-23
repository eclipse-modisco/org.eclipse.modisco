/*******************************************************************************
 * Copyright (c) 2015, 2019 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Jonathan Pepin (Soft-Maint) - Bug 463907 - Command for load and save Facet serialization
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.ui.internal.widget;

import org.eclipse.modisco.facet.efacet.ui.internal.exported.widget.IUriWidget;
import org.eclipse.modisco.facet.efacet.ui.internal.exported.widget.IUriWidgetFactory;
import org.eclipse.swt.widgets.Composite;

public class UriWidgetFactory implements IUriWidgetFactory {

	public IUriWidget createUriWidget(final Composite parent) {
		return new UriWidget(parent);
	}
}
