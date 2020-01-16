/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
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

import java.io.IOException;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;

import junit.framework.TestCase;

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
	 *
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
	} */

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
	public static boolean compareModels(final Resource expectedResource, final Resource actualResource) throws IOException, InterruptedException {
		XMLResource xmlExpectedResource = (XMLResource)expectedResource;
		for (TreeIterator<EObject> tit = xmlExpectedResource.getAllContents(); tit.hasNext(); ) {
			EObject eObject = tit.next();
			xmlExpectedResource.setID(eObject, null);
			/* if (eObject instanceof PackageableElement) {
				PackageableElement packageableElement = (PackageableElement)eObject;
				VisibilityKind visibility = packageableElement.getVisibility();
				packageableElement.setVisibility(visibility);
			} */
		}
		XMLResource xmlActualResource = (XMLResource)actualResource;
		for (TreeIterator<EObject> tit = xmlActualResource.getAllContents(); tit.hasNext(); ) {
			EObject eObject = tit.next();
			xmlActualResource.setID(eObject, null);
			/* if (eObject instanceof PackageableElement) {
				PackageableElement packageableElement = (PackageableElement)eObject;
				VisibilityKind visibility = packageableElement.getVisibility();
				packageableElement.setVisibility(visibility);
			} */
		};
		String expected = EmfFormatter.listToStr(expectedResource.getContents());//.replaceAll("attr VisibilityKind visibility 'public'", "");
		String actual = EmfFormatter.listToStr(actualResource.getContents())/*.replaceAll(" : ", ": ")*/;
		TestCase.assertEquals(expected, actual);
		return true;
	}
}
