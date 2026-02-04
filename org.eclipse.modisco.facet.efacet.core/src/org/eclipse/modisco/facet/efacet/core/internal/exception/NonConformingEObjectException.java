/*******************************************************************************
 * Copyright (c) 2012, 2019 Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 361612 - New core for new version of the Facet metamodel
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.core.internal.exception;

/**
 * This exception is raised when an object cannot be extended by a facet because it is filtered by the conformance query 
 * of this facet.
 * @since 0.2
 */
public class NonConformingEObjectException extends Exception {
	
	private static final long serialVersionUID = -7778081627619345385L;
}
