/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Frederic Madiot (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.properties.discoverer;

import java.util.Enumeration;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.omg.kdm.code.CodeFactory;
import org.eclipse.modisco.omg.kdm.code.CompilationUnit;
import org.eclipse.modisco.omg.kdm.kdm.Attribute;
import org.eclipse.modisco.omg.kdm.kdm.KdmFactory;

public class PropertiesModelDiscoverer2 extends AbstractModelDiscoverer<IFile> {

	public boolean isApplicableTo(final IFile file) {
		return file.exists() && "properties".equals(file.getFileExtension()); //$NON-NLS-1$
	}

	@Override
	protected void basicDiscoverElement(final IFile file, final IProgressMonitor monitor)
			throws DiscoveryException {
		setDefaultTargetURI(URI.createPlatformResourceURI(file.getFullPath() + ".xmi", true)); //$NON-NLS-1$
		Resource resource = discoverBuildPropertiesContent(file);
		setTargetModel(resource);
	}

	private Resource discoverBuildPropertiesContent(final IFile buildPropertiesFile) throws DiscoveryException {
		Resource pluginPropertiesModelResource = createTargetModel();

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
			throw new DiscoveryException("Error discovering build.properties", e); //$NON-NLS-1$
		}
		return pluginPropertiesModelResource;
	}
}
