/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *    Nicolas Bros (Mia-Software) - Bug 340149 - [Discovery] duplicate AtlLaunchHelper
 *    Nicolas Bros (Mia-Software) - Bug 340160 - [Discovery] non-wanted serialization of intermediate Java model in "Java to KDM"
 *    Nicolas Bros (Mia-Software) - Bug 341378 - AtlLaunchHelper : transformed models disappear randomly
 *******************************************************************************/
package org.eclipse.modisco.util.atl.core.internal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModel;
import org.eclipse.m2m.atl.drivers.emf4atl.EMFModelLoader;
import org.eclipse.m2m.atl.engine.vm.AtlLauncher;
import org.eclipse.m2m.atl.engine.vm.AtlModelHandler;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;

/**
 * @author gbarbier
 *
 */
public class AtlLaunchHelper {

	public static class ModelInfo {
		private final String modelName;
		private final URI modelURI;
		private final Resource resource;
		private final String metamodelName;
		private final URI metamodelUri;

		/**
		 * @param name
		 *            informative name of the model (such as "kdmInput" or
		 *            "umlOutput")
		 * @param modelURI
		 *            the {@link URI} of the model (if <code>resource</code> is
		 *            not <code>null</code>, then this must be the URI of this
		 *            {@link Resource})
		 * @param resource
		 *            an already read resource, or <code>null</code> to
		 *            deserialize the resource from the <code>modelURI</code>
		 * @param metamodelName
		 *            the informative name of the metamodel corresponding to
		 *            this model ("uml", "kdm", etc.)
		 * @param metamodelUri
		 *            the URI of the metamodel
		 */
		public ModelInfo(final String name, final URI modelURI,
				final Resource resource, final String metamodelName,
				final URI metamodelUri) {
			this.modelName = name;
			this.modelURI = modelURI;
			this.resource = resource;
			this.metamodelName = metamodelName;
			this.metamodelUri = metamodelUri;
		}

		public String getModelName() {
			return this.modelName;
		}

		public URI getModelURI() {
			return this.modelURI;
		}

		public Resource getResource() {
			return this.resource;
		}

		public String getMetamodelName() {
			return this.metamodelName;
		}

		public URI getMetamodelUri() {
			return this.metamodelUri;
		}
	}

	private EMFModelLoader modelLoader;

	private void createResources() {
		this.modelLoader = (EMFModelLoader) AtlModelHandler.getDefault(
				AtlModelHandler.AMH_EMF).createModelLoader();
	}

	/**
	 * @param models
	 * @param inputModels
	 * @param outputModels
	 */
	private void initMetamodels(final Map<String, ASMModel> models,
			final List<AtlLaunchHelper.ModelInfo> inputModels,
			final List<AtlLaunchHelper.ModelInfo> outputModels)
			throws IOException {

		for (ModelInfo modelInfo : inputModels) {
			if (!models.containsKey(modelInfo.getMetamodelName())) {
				ASMEMFModel metamodel = this.modelLoader.loadModel(
						modelInfo.getMetamodelName(),
						this.modelLoader.getMOF(), modelInfo.getMetamodelUri());
				models.put(modelInfo.getMetamodelName(), metamodel);
			}
		}
		for (ModelInfo modelInfo : outputModels) {
			if (!models.containsKey(modelInfo.getMetamodelName())) {
				ASMEMFModel metamodel = this.modelLoader.loadModel(
						modelInfo.getMetamodelName(),
						this.modelLoader.getMOF(), modelInfo.getMetamodelUri());
				models.put(modelInfo.getMetamodelName(), metamodel);
			}
		}
	}

	private void initModels(final Map<String, ASMModel> models,
			final List<AtlLaunchHelper.ModelInfo> inputModels,
			final List<AtlLaunchHelper.ModelInfo> outputModels)
			throws IOException {

		for (ModelInfo modelInfo : inputModels) {
			Resource resource = modelInfo.getResource();
			final ASMModel inputModel;
			if (resource != null) {
				// serialize in memory (because ATL doesn't take a Resource
				// directly)
				ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
				resource.save(byteArrayOutputStream, null);
				ByteArrayInputStream inputStream = new ByteArrayInputStream(
						byteArrayOutputStream.toByteArray());
				inputModel = this.modelLoader.loadModel(
						modelInfo.getModelName(),
						models.get(modelInfo.getMetamodelName()), inputStream);
			} else {
				inputModel = this.modelLoader.loadModel(
						modelInfo.getModelName(),
						models.get(modelInfo.getMetamodelName()),
						modelInfo.getModelURI());
			}
			models.put(modelInfo.getModelName(), inputModel);
		}
		for (ModelInfo modelInfo : outputModels) {
			ASMEMFModel outputModel = (ASMEMFModel) this.modelLoader.newModel(
					modelInfo.getModelName(),
					URI.decode(modelInfo.getModelURI().toString()),
					models.get(modelInfo.getMetamodelName()));
			models.put(modelInfo.getModelName(), outputModel);
		}
	}

	public List<Resource> runTransformation(final URL transformation,
			final List<AtlLaunchHelper.ModelInfo> inputModels,
			final List<AtlLaunchHelper.ModelInfo> outputModels)
			throws IOException {
		return runTransformation(transformation, inputModels, outputModels,
				new ArrayList<URL>());
	}

	public List<Resource> runTransformation(final URL transformation,
			final List<AtlLaunchHelper.ModelInfo> inputModels,
			final List<AtlLaunchHelper.ModelInfo> outputModels,
			final List<URL> superimposedTransformations) throws IOException {
		final List<Resource> result = new ArrayList<Resource>();
		final Map<String, ASMModel> models = new HashMap<String, ASMModel>();
		createResources();
		initMetamodels(models, inputModels, outputModels);

		// get/create models
		initModels(models, inputModels, outputModels);

		// launch
		final Map<String, Object> options = new HashMap<String, Object>();
		options.put("continueAfterError", "true"); //$NON-NLS-1$ //$NON-NLS-2$
		options.put("printExecutionTime", "true"); //$NON-NLS-1$ //$NON-NLS-2$

		AtlLauncher.getDefault().launch(transformation, Collections.EMPTY_MAP,
				models, Collections.EMPTY_MAP, superimposedTransformations,
				options);

		// store output models in the result array
		for (ModelInfo omi : outputModels) {
			ASMModel outputModel = models.get(omi.getModelName());
			if (outputModel instanceof ASMEMFModel) {
				ASMEMFModel asmEmfModel = (ASMEMFModel) outputModel;
				Resource resource = asmEmfModel.getExtent();
				result.add(moveToNewXMIResource(resource));
			} else {
				throw new RuntimeException("Model type not handled: " //$NON-NLS-1$
						+ outputModel.getClass().getName());
			}
		}
		return result;
	}

	public Resource runTransformation(final URL transformation,
			final ModelInfo inputModel, final ModelInfo outputModel)
			throws IOException {
		final List<AtlLaunchHelper.ModelInfo> inputModels = new ArrayList<AtlLaunchHelper.ModelInfo>();
		inputModels.add(inputModel);
		final List<AtlLaunchHelper.ModelInfo> outputModels = new ArrayList<AtlLaunchHelper.ModelInfo>();
		outputModels.add(outputModel);
		List<Resource> results = runTransformation(transformation, inputModels,
				outputModels);
		if (results.size() > 0) {
			Resource resultResource = results.get(0);
			// move the contents of the ATL resource to a XMIResourceImpl
			Resource newXMIResource = moveToNewXMIResource(resultResource);
			newXMIResource.setURI(outputModel.getModelURI());
			return newXMIResource;
		}
		return null;
	}

	// see Bug 341378 - AtlLaunchHelper : transformed models disappear randomly
	private static Resource moveToNewXMIResource(final Resource resource) {
		XMIResourceImpl xmiResourceImpl = new XMIResourceImpl();
		ListIterator<EObject> listIterator = resource.getContents().listIterator();
		while (listIterator.hasNext()) {
			EObject eObject = listIterator.next();
			listIterator.remove();
			xmiResourceImpl.getContents().add(eObject);
		}
		return xmiResourceImpl;
	}
}
