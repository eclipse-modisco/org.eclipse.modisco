/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Frederic Madiot (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.properties.discoverer;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterDirectionKind;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterImpl;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeFactory;
import org.eclipse.gmt.modisco.omg.kdm.code.CompilationUnit;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Attribute;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KdmFactory;

/**
 * @deprecated use {@link PropertiesModelDiscoverer2}, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=474900
 */
@Deprecated
public class PropertiesModelDiscoverer implements Discoverer {

	private static final List<DiscoveryParameter> PARAMETERS_KEYS = new ArrayList<DiscoveryParameter>();

	/**
	 * A parameter key for indicating an output target Resource instance.
	 */
	public static final DiscoveryParameter PARAMETER_TARGET_RESOURCE = new DiscoveryParameterImpl(
			"TARGET_RESOURCE", DiscoveryParameterDirectionKind.out, //$NON-NLS-1$
			Resource.class, false);

	static {
		PropertiesModelDiscoverer.PARAMETERS_KEYS
				.add(PropertiesModelDiscoverer.PARAMETER_TARGET_RESOURCE);
	}

	public final boolean isApplicableTo(final Object source) {
		if (source instanceof IFile) {
			IFile file = (IFile) source;
			return file.exists() && "properties".equals(file.getFileExtension()); //$NON-NLS-1$
		}
		return false;
	}

	public List<DiscoveryParameter> getDiscovererParameters() {
		return PropertiesModelDiscoverer.PARAMETERS_KEYS;
	}

	public final void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {

		Resource result = discoverBuildPropertiesContent((IFile) source);
		parameters.put(PropertiesModelDiscoverer.PARAMETER_TARGET_RESOURCE, result);
	}

	private static Resource discoverBuildPropertiesContent(final IFile buildPropertiesFile) {
		Resource pluginPropertiesModelResource = new XMIResourceImpl();
		URI uri = URI.createURI("platform:/resource" + buildPropertiesFile.getFullPath() + ".xmi"); //$NON-NLS-1$ //$NON-NLS-2$
		pluginPropertiesModelResource.setURI(uri);

		CompilationUnit kdmCompilationUnit = CodeFactory.eINSTANCE.createCompilationUnit();
		kdmCompilationUnit.setName(buildPropertiesFile.getName());
		pluginPropertiesModelResource.getContents().add(kdmCompilationUnit);

		try {
			Properties properties = new Properties();
			properties.load(buildPropertiesFile.getContents());
			Enumeration<Object> keys = properties.keys();
			while (keys.hasMoreElements()) {
				String key = keys.nextElement().toString();
				String value = properties.get(key).toString();
				Attribute kdmAttribute = KdmFactory.eINSTANCE.createAttribute();
				kdmAttribute.setTag(key);
				kdmAttribute.setValue(value);
				kdmCompilationUnit.getAttribute().add(kdmAttribute);
			}
		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		return pluginPropertiesModelResource;
	}

	@Deprecated
	public Resource discoverElement(final Object source, final URI target) {
		return null;
	}

}
