/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 */

package org.eclipse.gmt.modisco.usecases.modelfilter.converter;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.UriUtils;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.usecases.modelfilter.Messages;
import org.eclipse.gmt.modisco.usecases.modelfilter.ModelFilterActivator;
import org.eclipse.m2m.atl.common.ATLLaunchConstants;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public class BidirectionalUmlConverter {

	// resources location
	private final String umlMMUri = "http://www.eclipse.org/uml2/2.1.0/UML"; //$NON-NLS-1$
	private final URL transformation = this.getClass().getResource("transformations/UML2Copy.asm"); //$NON-NLS-1$
	private final URL superimposedTransformation = this.getClass().getResource(
			"transformations/BidirectionalAssociation.asm"); //$NON-NLS-1$

	/**
	 * @param outputURI
	 * @throws ATLCoreException
	 */
	public void manageBidirectionalAssociations(final URI umlSourceUri) throws ATLCoreException {

		Map<String, String> modelHandlers = new HashMap<String, String>();
		String umlMetaModelName = "uml"; //$NON-NLS-1$
		modelHandlers.put(umlMetaModelName, "UML2"); //$NON-NLS-1$

		Map<String, Object> launcherOptions = new HashMap<String, Object>();
		launcherOptions.put(ATLLaunchConstants.OPTION_MODEL_HANDLER, modelHandlers);

		String launcherName = ATLLaunchConstants.REGULAR_VM_NAME;
		final ILauncher launcher = CoreService.getLauncher(launcherName);
		launcher.initialize(launcherOptions);

		ModelFactory factory = CoreService.getModelFactory(launcher.getDefaultModelFactoryName());

		IInjector injector = CoreService.getInjector(factory.getDefaultInjectorName());
		IExtractor extractor = CoreService.getExtractor(factory.getDefaultExtractorName());

		// loading of meta model UML
		Map<String, Object> referenceModelOptions = new HashMap<String, Object>();
		referenceModelOptions.put("modelHandlerName", modelHandlers.get(umlMetaModelName)); //$NON-NLS-1$
		referenceModelOptions.put("modelName", umlMetaModelName); //$NON-NLS-1$
		referenceModelOptions.put("path", this.umlMMUri); //$NON-NLS-1$
		IReferenceModel umlMM = factory.newReferenceModel(referenceModelOptions);
		injector.inject(umlMM, this.umlMMUri);

		// loading of model UML as input
		Map<String, Object> modelOptions = new HashMap<String, Object>();
		String inModelName = "umlInput"; //$NON-NLS-1$
		modelOptions.put("modelName", inModelName); //$NON-NLS-1$
		modelOptions.put("path", UriUtils.toString(umlSourceUri)); //$NON-NLS-1$
		modelOptions.put("newModel", new Boolean(false)); //$NON-NLS-1$
		IModel input = factory.newModel(umlMM, modelOptions);
		injector.inject(input, UriUtils.toString(umlSourceUri));
		launcher.addInModel(input, inModelName, umlMetaModelName);

		// loading of model UML as output
		modelOptions = new HashMap<String, Object>();
		inModelName = "OUT"; //$NON-NLS-1$
		modelOptions.put("modelName", inModelName); //$NON-NLS-1$
		modelOptions.put("path", UriUtils.toString(umlSourceUri)); //$NON-NLS-1$
		modelOptions.put("newModel", new Boolean(true)); //$NON-NLS-1$
		IModel outputInstance = factory.newModel(umlMM, modelOptions);
		launcher.addOutModel(outputInstance, inModelName, umlMetaModelName);

		/*
		 * encapsulate the transformation in a new Thread to get an empty execution stack.
		 */
		final Map<String, Object> options = new HashMap<String, Object>();
		options.put("continueAfterError", "true"); //$NON-NLS-1$ //$NON-NLS-2$
		options.put("printExecutionTime", "true"); //$NON-NLS-1$ //$NON-NLS-2$

		Job transformationThread = new Job(
				Messages.BidirectionalUmlConverter_ComputeBidirectionalLinks) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				IStatus result = Status.OK_STATUS;
				try {
					launcher.launch(ILauncher.RUN_MODE, monitor, options,
							transformation.openStream(), superimposedTransformation.openStream());
				} catch (IOException e) {
					result = Status.CANCEL_STATUS;
					MoDiscoLogger.logError(e, ModelFilterActivator.getDefault());
				}

				return result;
			}
		};
		transformationThread.schedule();
		try {
			transformationThread.join();
		} catch (InterruptedException e) {
			MoDiscoLogger.logError(e, ModelFilterActivator.getDefault());
		}

		extractor.extract(outputInstance, UriUtils.toString(umlSourceUri));
	}
}
