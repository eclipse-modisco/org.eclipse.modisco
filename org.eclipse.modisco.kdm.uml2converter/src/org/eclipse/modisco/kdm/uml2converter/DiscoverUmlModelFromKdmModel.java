/*******************************************************************************
 * Copyright (c) 2011, 2020 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/

package org.eclipse.modisco.kdm.uml2converter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.kdm.source.discoverer.IKDMDiscoveryConstants;
import org.eclipse.modisco.kdm.uml2converter.internal.KdmToUml2Activator;
import org.eclipse.modisco.kdm.uml2converter.internal.KdmToUmlConverter;
import org.eclipse.modisco.omg.kdm.IKDMConstants;

/**
 * @author Gabriel Barbier
 *
 * @deprecated See Bug 559506- the KDMtoUML transformation has not been revised for UML2 5.0.0.
 */
@Deprecated
public class DiscoverUmlModelFromKdmModel extends AbstractModelDiscoverer<IFile> {

	private static final String TARGET_EXTENSION = "uml"; //$NON-NLS-1$

	private IFile customTransformation = null;

	@Parameter(name = "CUSTOM_TRANSFORMATION", description = "A .asm file (compiled by ATL) containing a custom transformation to use instead of the default KDM to UML transformation.")
	public void setCustomTransformation(final IFile file) {
		this.customTransformation = file;
	}

	protected IFile getCustomTransformation() {
		return this.customTransformation;
	}

	public boolean isApplicableTo(final IFile file) {
		if (!file.exists()) {
			return false;
		}
		try {
			IContentDescription contentDescription = file.getContentDescription();
			return IKDMConstants.CONTENT_TYPE.equals(contentDescription.getContentType().getId());
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, KdmToUml2Activator.getDefault());
		}

		return file.toString().endsWith(IKDMDiscoveryConstants.KDM_MODEL_FILE_SUFFIX);
	}

	@Override
	protected void basicDiscoverElement(final IFile source, final IProgressMonitor monitor)
			throws DiscoveryException {
		Resource result = null;

		String name = source.getName();
		if (name.endsWith(IKDMDiscoveryConstants.KDM_MODEL_FILE_SUFFIX)) {
			name = name.substring(0,
					name.length() - IKDMDiscoveryConstants.KDM_MODEL_FILE_SUFFIX.length());
		}

		IPath targetPath = source.getProject().getFullPath().append(name).addFileExtension("uml"); //$NON-NLS-1$
		setDefaultTargetURI(URI.createPlatformResourceURI(targetPath.toString(), true));

		try {
			final KdmToUmlConverter transfo = new KdmToUmlConverter();
			Resource kdmModel = new XMIResourceImpl();
			kdmModel.setURI(URI.createPlatformResourceURI(source.getFullPath().toString(), true));
			kdmModel.load(null);
			Resource[] resources = null;
			if (getCustomTransformation() != null) {
				resources = transfo.getUML2ModelFromKDMModelWithCustomTransformation(kdmModel,
						false, getCustomTransformation().getLocationURI().toURL());
			} else {
				resources = transfo.getUML2ModelFromKDMModel(kdmModel, false);
			}
			result = resources[0];
			setTargetModel(result);
		} catch (Exception e) {
			MoDiscoLogger.logError(e, KdmToUml2Activator.getDefault());
		}
	}
}
