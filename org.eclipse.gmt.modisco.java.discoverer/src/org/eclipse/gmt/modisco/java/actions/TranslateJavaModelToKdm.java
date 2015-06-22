/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien GIQUEL (Mia-Software) - initial API and implementation
 *    Bjorn Tietjens
 *******************************************************************************/
package org.eclipse.gmt.modisco.java.actions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.java.Messages;
import org.eclipse.gmt.modisco.java.internal.core.AtlLaunchHelper;
import org.eclipse.gmt.modisco.java.internal.core.AtlLaunchHelper.ModelInfo;
import org.eclipse.m2m.atl.common.ATLLogger;
/**
 * @deprecated the whole plug-in is replaced by
 *             "org.eclipse.modisco.java.discoverer" (without the "gmt" part),
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public class TranslateJavaModelToKdm {

	// resources location
	private static final String KDM_MM_URI = org.eclipse.gmt.modisco.omg.kdm.action.ActionPackage.eNS_URI;
	private static final String JAVA_MM_URI = org.eclipse.gmt.modisco.java.emf.JavaPackage.eNS_URI;

	protected static final Logger LOGGER = Logger.getLogger(ATLLogger.LOGGER_ID);

	private String pathToTransformation;
	private static final String PATH_TO_TRANSFORMATION_DEFAULT = "resources/transformations/javaToKdm.asm"; //$NON-NLS-1$

	/**
	 * @param pathToTransformation
	 *            the pathToTransformation to set
	 */
	public void setPathToTransformation(final String newPathToTransformation) {
		this.pathToTransformation = newPathToTransformation;
	}

	/**
	 * @return the pathToTransformation
	 */
	public String getPathToTransformation() {
		return this.pathToTransformation;
	}

	@SuppressWarnings("null")
	public Resource getKDMModelFromJavaModelWithCustomTransformation(final URI javaSourceModelUri,
			final URI kdmTargetModelUri) {
		if (getPathToTransformation() == null || getPathToTransformation().length() == 0) {
			setPathToTransformation(TranslateJavaModelToKdm.PATH_TO_TRANSFORMATION_DEFAULT);
		}
		// relative search
		URL url = TranslateJavaModelToKdm.class.getResource(getPathToTransformation());

		if (url == null) {
			// absolute search
			try {
				url = new URL(getPathToTransformation());
			} catch (MalformedURLException e) {
				url = null;
			}

			if (url == null) {
				url = TranslateJavaModelToKdm.class
						.getResource(TranslateJavaModelToKdm.PATH_TO_TRANSFORMATION_DEFAULT);
			}
		}
		final URL transformation = url;

		return this.getKDMModelFromJavaModelWithCustomTransformation(javaSourceModelUri,
				transformation, kdmTargetModelUri);
	}

	public Resource getKDMModelFromJavaModelWithCustomTransformation(final URI javaSourceModelUri,
			final URL transformation, final URI kdmTargetModelUri) {
		URI localKdmTargetModelUri = kdmTargetModelUri;

		if (kdmTargetModelUri == null) {
			localKdmTargetModelUri = javaSourceModelUri.trimFileExtension().appendFileExtension(
					"kdm"); //$NON-NLS-1$
			// default value
		}
		final ModelInfo inputModel = new ModelInfo("IN", javaSourceModelUri, "java", //$NON-NLS-1$ //$NON-NLS-2$
				URI.createURI(TranslateJavaModelToKdm.JAVA_MM_URI));
		final ModelInfo outputModel = new ModelInfo("OUT", localKdmTargetModelUri, "kdm", //$NON-NLS-1$ //$NON-NLS-2$
				URI.createURI(TranslateJavaModelToKdm.KDM_MM_URI));
		
		AtlLaunchHelper atlHelper = new AtlLaunchHelper();
		Resource result = atlHelper.scheduleTransformation(transformation, inputModel,
				outputModel, Messages.TranslateJavaModelToKdm_ConvertJavaToKDM);
		
		return result;
	}

}
