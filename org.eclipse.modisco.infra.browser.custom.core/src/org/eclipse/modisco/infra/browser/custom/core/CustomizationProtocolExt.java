/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.core;

import org.eclipse.emf.common.util.URI;
import org.eclipse.modisco.infra.common.core.internal.protocol.IModiscoProtocolExtension;

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
