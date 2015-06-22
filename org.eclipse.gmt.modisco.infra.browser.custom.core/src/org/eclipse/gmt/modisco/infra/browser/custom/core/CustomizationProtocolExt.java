/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.custom.core;

import org.eclipse.emf.common.util.URI;
import org.eclipse.gmt.modisco.infra.common.core.internal.protocol.IModiscoProtocolExtension;

/**
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class CustomizationProtocolExt implements IModiscoProtocolExtension {

	public String getSchemeSpecificPart() {
		return "customization"; //$NON-NLS-1$;
	}

	public URI getURI(final String name) {
		return CustomizationsCatalog.getInstance().getURI(name);
	}
}
