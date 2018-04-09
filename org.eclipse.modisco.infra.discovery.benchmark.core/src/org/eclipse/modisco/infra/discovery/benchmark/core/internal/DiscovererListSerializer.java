/*******************************************************************************
 * Copyright (c) 2011 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.facet.util.emf.core.serialization.ISerializer;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IDiscovererList;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IDiscovererListFactory;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery;

/**
 * IDiscovererList serialization feature
 * @author Guillaume Doux
 *
 */
public class DiscovererListSerializer implements ISerializer<IDiscovererList> {

	private ResourceSet rSet;
	private Resource inMemoryRes;



	public DiscovererListSerializer() {
		this.rSet = new ResourceSetImpl();
		this.rSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put("xmi", new XMIResourceFactoryImpl());
		this.inMemoryRes = this.rSet.createResource(URI.createURI("inMemory"));
	}

	public Class<IDiscovererList> getType() {
		return IDiscovererList.class;
	}

	public String serialize(final IDiscovererList value) {
		this.inMemoryRes.getContents().clear();
		this.inMemoryRes.getContents().addAll(value);
		OutputStream os = new ByteArrayOutputStream();
		try {
			this.inMemoryRes.save(os, Collections.EMPTY_MAP);
			return os.toString();
		} catch (IOException e) {
			MoDiscoLogger.logError(e, "Discoverer and LaunchConfiguration serialization problem", Activator.getDefault());
		}
		return "";
	}

	public IDiscovererList deserialize(final String serializedValue) {
		IDiscovererList discovererList = IDiscovererListFactory.INSTANCE.createDiscovererList();
//		inMemoryRes.getContents().clear();
		InputStream is = new ByteArrayInputStream(serializedValue.getBytes());
		try {
			this.inMemoryRes.load(is, Collections.EMPTY_MAP);
			discovererList.addAll((Collection<? extends Discovery>) this.inMemoryRes.getContents());
		} catch (IOException e) {
			MoDiscoLogger.logError(e, "Discoverer and LaunchConfiguration deserialization problem", Activator.getDefault());
		}
		return discovererList;
	}

}