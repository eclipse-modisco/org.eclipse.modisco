/**
 * *******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 */
package org.eclipse.modisco.xml.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * A EMF factory for getting Generic XML Resource. It is an alternative to
 * org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl.
 * 
 * @see GenericXMLResourceImpl
 * 
 */
public class GenericXMLResourceFactoryImpl extends ResourceFactoryImpl {

	/**
	 * Create a Generic XML Resource.
	 * 
	 * @see GenericXMLResourceImpl
	 */
	@Override
	public final Resource createResource(final URI uri) {
		return new GenericXMLResourceImpl(uri);
	}
}
