/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.protocol;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.modisco.infra.common.core.internal.resource.MoDiscoResourceSet;

/**
 * The modisco protocol is used to refer to MoDisco models (uiCustom, query,
 * etc.).
 * <p>
 * modisco://&lt;sub-protocol&gt;/&lt;model_name&gt;
 * <p>
 * The modisco URI is composed of &lt;model_name&gt; and &lt;sub-protocol&gt;:
 * <ul>
 * <li>&lt;model_name&gt; is the name of the referred model.
 * <li>&lt;sub-protocol&gt; represents the kind of model that the URI refers to.
 * The values of &lt;sub-protocol&gt; are defined through the
 * <tt>org.eclipse.modisco.common.core.protocolext</tt> extension point.
 * </ul>
 *
 * @author Gregoire DUPE (Mia-Software)
 */
public class ModiscoResourceFactoryImpl extends XMIResourceFactoryImpl {

	/**
	 * Constructor for ModiscoResourceFactoryImpl.
	 */
	public ModiscoResourceFactoryImpl() {
		super();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see XMIResourceFactoryImpl#createResource(URI)
	 */
	@Override
	public Resource createResource(final URI uri) {
		Resource xmiResource = new XMIResourceImpl(uri) {
			/*
			 * (non-Javadoc)
			 *
			 * @see
			 * org.eclipse.emf.ecore.resource.impl.ResourceImpl#getURIConverter
			 * ()
			 */
			@Override
			protected URIConverter getURIConverter() {
				return MoDiscoResourceSet.createURIConverter();
			}
		};
		return xmiResource;
	}
}
