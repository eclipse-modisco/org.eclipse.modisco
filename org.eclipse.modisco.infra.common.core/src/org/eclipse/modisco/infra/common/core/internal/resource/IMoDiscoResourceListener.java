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
package org.eclipse.modisco.infra.common.core.internal.resource;

import org.eclipse.emf.common.util.URI;

/**
 * @author Gregoire DUPE
 */
public interface IMoDiscoResourceListener {

	/**
	 * This method is called to receive notifications about
	 * {@link MoDiscoResourceSet} changes.
	 */
	public void aListenedResourceHasChanged(URI resourceUri, URI dependingResourceURI);

}
