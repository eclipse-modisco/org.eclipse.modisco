/**
 * <copyright>
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 
 *     Nicolas Guyomar (Mia-Software) - initial API and implementation
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.modisco.jee.webapp.webapp24.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLResource.URIHandler;

/**
 * <!-- begin-user-doc --> The <b>Resource Factory</b> associated with the
 * package. <!-- end-user-doc -->
 * 
 * @see org.eclipse.modisco.jee.webapp.webapp24.util.Webapp24ResourceImpl
 * @generated
 */
public class Webapp24ResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public Webapp24ResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Resource createResource(final URI uri) {
		XMLResource result = new Webapp24ResourceImpl(uri);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

		// This option prevent XMLReader raise exception on unknown feature
		result.getDefaultLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

		result.getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE,
				Boolean.TRUE);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE,
				Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
		// see /model/readme.txt about uris management
		URIHandler localUriHandler = new MoDiscoURIHandler();
		result.getDefaultLoadOptions().put(XMLResource.OPTION_URI_HANDLER, localUriHandler);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_URI_HANDLER, localUriHandler);

		return result;
	}

	// see /model/readme.txt about uris management
	class MoDiscoURIHandler implements URIHandler {

		private final URI jeeStandardURI = URI
				.createURI("http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd");

		private final URI modiscoSubstituteURI = URI
				.createURI("http://www.eclipse.org/MoDisco/Javaee/web-app_2_4.xsd");

		public void setBaseURI(final URI uri) {
			// Nothing
		}

		public URI resolve(final URI uri) {
			if (uri.equals(this.jeeStandardURI)) {
				return this.modiscoSubstituteURI;
			}
			return uri;
		}

		public URI deresolve(final URI uri) {
			if (uri.equals(this.modiscoSubstituteURI)) {
				return this.jeeStandardURI;
			}
			return uri;
		}

	}
} // Webapp24ResourceFactoryImpl
