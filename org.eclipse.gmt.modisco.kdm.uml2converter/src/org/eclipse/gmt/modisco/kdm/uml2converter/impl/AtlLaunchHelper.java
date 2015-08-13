/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 */
package org.eclipse.gmt.modisco.kdm.uml2converter.impl;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.UriUtils;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.kdm.uml2converter.KdmToUml2Activator;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModel;
import org.eclipse.m2m.atl.drivers.emf4atl.EMFModelLoader;
import org.eclipse.m2m.atl.engine.vm.AtlLauncher;
import org.eclipse.m2m.atl.engine.vm.AtlModelHandler;

/**
 * @author gbarbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=474827
 */
@Deprecated
public class AtlLaunchHelper {

	public static class ModelInfo {
		private final String modelName;
		private final URI modelUri;
		private final String metamodelName;
		private final URI metamodelUri;

		public ModelInfo(final String name, final URI uri, final String metamodelName,
				final URI metamodelUri) {
			this.modelName = name;
			this.modelUri = uri;
			this.metamodelName = metamodelName;
			this.metamodelUri = metamodelUri;
		}

		public String getModelName() {
			return this.modelName;
		}

		public URI getModelUri() {
			return this.modelUri;
		}

		public String getMetamodelName() {
			return this.metamodelName;
		}

		public URI getMetamodelUri() {
			return this.metamodelUri;
		}
	}

	private EMFModelLoader modelHandler;

	private void createResources() {
		this.modelHandler = (EMFModelLoader) AtlModelHandler.getDefault(AtlModelHandler.AMH_EMF)
				.createModelLoader();
	}

	private void dispose(Map<String, ASMEMFModel> models) {
		for (ASMEMFModel model : models.values()) {
			// ((ASMEMFModel) model).dispose();
			this.modelHandler.unload(model);
		}
	}

	/**
	 * @param models
	 * @param inputModels
	 * @param outputModels
	 */
	private void initMetamodels(Map<String, ASMEMFModel> models, List<ModelInfo> inputModels,
			List<ModelInfo> outputModels) throws IOException {

		for (ModelInfo imi : inputModels) {
			if (models.containsKey(imi.getMetamodelName()) == false) {
				ASMEMFModel metamodel = this.modelHandler.loadModel(imi.getMetamodelName(),
						this.modelHandler.getMOF(), imi.getMetamodelUri());
				models.put(imi.getMetamodelName(), metamodel);
			}
		}
		for (ModelInfo omi : outputModels) {
			if (models.containsKey(omi.getMetamodelName()) == false) {
				ASMEMFModel metamodel = this.modelHandler.loadModel(omi.getMetamodelName(),
						this.modelHandler.getMOF(), omi.getMetamodelUri());
				models.put(omi.getMetamodelName(), metamodel);
			}
		}
	}

	/**
	 * @param models
	 * @param inputModels
	 * @param outputModels
	 * @throws IOException
	 */
	private void initModels(Map<String, ASMEMFModel> models, List<ModelInfo> inputModels,
			List<ModelInfo> outputModels) throws IOException {
		for (ModelInfo imi : inputModels) {
			ASMEMFModel inputModel = this.modelHandler.loadModel(imi.getModelName(),
					models.get(imi.getMetamodelName()), imi.getModelUri());
			models.put(imi.getModelName(), inputModel);
		}
		for (ModelInfo omi : outputModels) {
			ASMEMFModel outputModel = (ASMEMFModel) this.modelHandler.newModel(omi.getModelName(),
					UriUtils.toString(omi.getModelUri()), models.get(omi.getMetamodelName()));
			models.put(omi.getModelName(), outputModel);
		}
	}

	private void saveModels(final Map<String, ASMEMFModel> models,
			final List<ModelInfo> outputModels, final List<Resource> result) throws IOException {
		for (ModelInfo omi : outputModels) {
			ASMEMFModel outputModel = models.get(omi.getModelName());
			this.modelHandler.save(outputModel, UriUtils.toString(omi.getModelUri()));
			result.add(outputModel.getExtent());
		}
	}

	public List<Resource> scheduleTransformation(final URL transformation,
			final List<ModelInfo> inputModels, final List<ModelInfo> outputModels,
			final String jobTitle) {
		String jobLabel = jobTitle;
		if (jobLabel == null) {
			jobLabel = "ATL transformation"; //$NON-NLS-1$
		}
		final List<Resource> result = new ArrayList<Resource>();
		try {
			final Map<String, ASMEMFModel> models = new HashMap<String, ASMEMFModel>();
			this.createResources();
			this.initMetamodels(models, inputModels, outputModels);

			// get/create models
			this.initModels(models, inputModels, outputModels);

			// launch
			final Map<String, Object> options = new HashMap<String, Object>();
			options.put("continueAfterError", "true"); //$NON-NLS-1$ //$NON-NLS-2$
			options.put("printExecutionTime", "true"); //$NON-NLS-1$ //$NON-NLS-2$

			Job transformationThread = new Job(jobTitle) {
				@Override
				protected IStatus run(final IProgressMonitor monitor) {
					IStatus jobResult = Status.OK_STATUS;
					try {
						AtlLauncher.getDefault().launch(transformation, Collections.EMPTY_MAP,
								models, Collections.EMPTY_MAP, Collections.EMPTY_LIST, options);
					} catch (Exception e) {
						jobResult = Status.CANCEL_STATUS;
						MoDiscoLogger.logError(e, KdmToUml2Activator.getDefault());
					}

					return jobResult;
				}
			};
			transformationThread.schedule();
			try {
				transformationThread.join();
			} catch (InterruptedException e) {
				MoDiscoLogger.logError(e, KdmToUml2Activator.getDefault());
			}
			// save and store output models
			this.saveModels(models, outputModels, result);

			this.dispose(models);
		} catch (IOException e) {
			MoDiscoLogger.logError(e, KdmToUml2Activator.getDefault());
		}
		return result;
	}

	public Resource scheduleTransformation(final URL transformation, final ModelInfo inputModel,
			final ModelInfo outputModel, final String jobTitle) {
		Resource result = null;
		final List<ModelInfo> inputModels = new ArrayList<ModelInfo>();
		inputModels.add(inputModel);
		final List<ModelInfo> outputModels = new ArrayList<ModelInfo>();
		outputModels.add(outputModel);
		List<Resource> results = this.scheduleTransformation(transformation, inputModels,
				outputModels, jobTitle);
		if (results.size() > 0) {
			result = results.get(0);
		}
		return result;
	}
}
