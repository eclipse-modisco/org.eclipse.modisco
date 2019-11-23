/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 378965 - Tests disabled due to EMF Compare API change
 *******************************************************************************/
package org.eclipse.modisco.common.tests;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.common.core.internal.utils.ModelUtils;

public class TestModelUtils {
	/**
	 * Compare two ecore files as models.
	 *
	 * @param leftUri
	 *            the left file uri
	 * @param rightUri
	 *            the right file uri
	 * @param ignoreIds
	 *            if <code>true</code>, ignore xmi ids
	 * @param delete
	 *            if <code>true</code>, delete the right file after comparison
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static boolean compareModels(final File leftUri, final File rightUri,
			final boolean ignoreIds, final boolean delete) throws IOException, InterruptedException {
		boolean result = true;
		Resource leftModel = ModelUtils.loadModel(leftUri);
		Resource rightModel = ModelUtils.loadModel(rightUri);

		result = compareModels(leftModel, rightModel, ignoreIds);

		if (delete) {
			leftUri.delete();
		}
		return result;
	}

	/**
	 * Compare two ecore files as models.
	 *
	 * @param leftUri
	 *            the left file uri
	 * @param rightUri
	 *            the right file uri
	 * @param ignoreIds
	 *            if <code>true</code>, ignore xmi ids
	 * @param delete
	 *            if <code>true</code>, delete the right file after comparison
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static boolean compareModels(final Resource leftModel, final Resource rightModel,
			final boolean ignoreIds) throws IOException, InterruptedException {
		throw new UnsupportedOperationException("Must be rewritten with EMF Compare 2.0");
//
//		boolean result = true;
//
//		Map<String, Object> options = new HashMap<String, Object>();
//		if (ignoreIds) {
//			options.put("match.ignore.xmi.id", Boolean.TRUE); //$NON-NLS-1$
//		}
//		final MatchModel inputMatch = MatchService.doResourceMatch(leftModel, rightModel, options);
//		final DiffModel inputDiff = DiffService.doDiff(inputMatch);
//
//		if (((DiffGroup) inputDiff.getOwnedElements().get(0)).getSubchanges() != 0) {
//			result = false;
//			ComparisonResourceSnapshot snapshot = DiffFactory.eINSTANCE
//					.createComparisonResourceSnapshot();
//			snapshot.setDiff(inputDiff);
//			snapshot.setMatch(inputMatch);
//			saveModel(snapshot, leftModel.getURI().appendFileExtension("emfdiff")); //$NON-NLS-1$
//			//throw new RuntimeException("There are differences between models " + leftUri + " and " + rightUri); //$NON-NLS-1$ //$NON-NLS-2$
//		}
//		return result;
	}

//	/**
//	 * Saves a model as a file to the given uri.
//	 *
//	 * @param root
//	 *            Root of the objects to be serialized in a file.
//	 * @param path
//	 *            File where the objects have to be saved.
//	 * @throws IOException
//	 *             Thrown if an I/O operation has failed or been interrupted
//	 *             during the saving process.
//	 */
//	private static void saveModel(final EObject root, final URI modelURI) throws IOException {
//		ResourceSet resourceSet = new ResourceSetImpl();
//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
//				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
//		final Resource newModelResource = resourceSet.createResource(modelURI);
//		newModelResource.getContents().add(root);
//		newModelResource.save(null);
//	}

}
