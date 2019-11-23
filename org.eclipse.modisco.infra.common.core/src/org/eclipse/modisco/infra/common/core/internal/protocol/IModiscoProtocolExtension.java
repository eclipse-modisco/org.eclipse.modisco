/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.protocol;

import org.eclipse.emf.common.util.URI;

/**
 * An implementation of the interface must be provided through the
 * org.eclipse.modisco.common.core.protocolext extension point to register a
 * MoDisco sub-protocol.
 *
 * @author Gregoire DUPE (Mia-Software)
 */
public interface IModiscoProtocolExtension {

	/**
	 * This method returns the uri of the model containing the searched element.
	 *
	 * @param name
	 *            the searched element name
	 */
	public URI getURI(String name);

	/**
	 * This method returns the sub-protocol name. For example, if this method
	 * returns _query_ then when a URI begins with modisco:/query/ the URI
	 * resolution will be delegated to this class.
	 *
	 * @return the sub-protocol name
	 */
	public String getSchemeSpecificPart();

}
