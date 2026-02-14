/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Romain Dervaux (Mia-Software)
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *    Fabien Giquel (Mia-Software) - Bug 342856 - improve Discoverers implementation
 *******************************************************************************/

package org.eclipse.modisco.java.discoverer.tests;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.CompilationUnit;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.NamedElement;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.tests.utils.AbstractDiscoverTest;
import org.junit.Assert;
import org.junit.Test;

public class TestSaveAll extends AbstractDiscoverTest {

	/**
	 * NamedElement ASTNode instances are compared by name.
	 * 
	 * TODO 
	 */
	private static class DeclarationComparator implements Comparator<ASTNode>
	{
		public static DeclarationComparator INSTANCE = new DeclarationComparator();

		@Override
		public int compare(ASTNode o1, ASTNode o2) {
			String c1 = o1.eClass().getName();
			String c2 = o2.eClass().getName();
			int diff = c1.compareTo(c2);
			if (diff != 0) {
				return diff;
			}
			String s1 = o1 instanceof NamedElement ? ((NamedElement)o1).getName() : "";
			String s2 = o2 instanceof NamedElement ? ((NamedElement)o2).getName() : "";
			diff = s1.compareTo(s2);
			if (diff != 0) {
				return diff;
			}
			if (o1 instanceof CompilationUnit) {
				String f1 = ((CompilationUnit)o1).getOriginalFilePath();
				String f2 = ((CompilationUnit)o2).getOriginalFilePath();
				diff = f1.compareTo(f2);
				if (diff != 0) {
					return diff;
				}
			}
			return diff;				// XXX need to compare more e.g. MethodDeclaration parameters
		}
	}

	/**
	 * ENamedElement instances are compared by name.
	 */
	private static class ENamedElementComparator implements Comparator<ENamedElement>
	{
		public static ENamedElementComparator INSTANCE = new ENamedElementComparator();

		@Override
		public int compare(ENamedElement o1, ENamedElement o2) {
			String s1 = o1.getName();
			String s2 = o2.getName();
			int diff = s1.compareTo(s2);
			if (diff != 0) {
				return diff;
			}
			return diff;
		}
	}

	/**
	 * Reference nodes are compared according to the depth first position index allocated during the declaration normalisation pass.
	 */
	private static class ReferenceComparator implements Comparator<ASTNode>
	{
		private Map<ASTNode, Integer> node2index;

		public ReferenceComparator(Map<ASTNode, Integer> node2index) {
			this.node2index = node2index;
		}

		@Override
		public int compare(ASTNode o1, ASTNode o2) {
			Integer i1 = this.node2index.get(o1);
			Integer i2 = this.node2index.get(o2);
			assert i1 != null;
			assert i2 != null;
			int x1 = i1.intValue();
			int x2 = i2.intValue();
			int diff = x2 - x1;
			if (diff != 0) {
				return diff;
			}
			return diff;				// XXX need to compare tree positions
		}
	}

	private static class TestDiscoverJavaModelFromJavaProject extends DiscoverJavaModelFromJavaProject
	{
		public TestDiscoverJavaModelFromJavaProject() {}

		@Override
		public void saveTargetModel() throws IOException {
			super.saveTargetModel();
		}

		@Override
		public void setDefaultTargetURI(URI defaultURI) {
			if (getDefaultTargetURI() == null) {
				super.setDefaultTargetURI(defaultURI);
			}
		}
	}
	
	private static final String fileName = "org.eclipse.modisco.java.discoverer.tests_test001.javaxmi";
	private static final String referenceFilePath = "org.eclipse.modisco.java.generation.tests/resources";
	private static final String referenceFileName = referenceFilePath + "/" + fileName;

	@Override
	protected String getTargetProjectName() {
		return Activator.PLUGIN_ID + "_test001"; //$NON-NLS-1$
	}

	@Override
	protected String getSourcesReferencePath() {
		return "/workspace/test001/"; //$NON-NLS-1$
	}
	
	private IFile iFile = null;
	
	@Override
	protected void loadResource(final IJavaProject javaProject) throws Exception {
		TestDiscoverJavaModelFromJavaProject discoverer = new TestDiscoverJavaModelFromJavaProject();
		IProject project = javaProject.getProject();
		String pathName = project.getName() + "/" + fileName;
		discoverer.setDefaultTargetURI(URI.createPlatformResourceURI(pathName, true));
		discoverer.setSerializeTarget(false);
		discoverer.discoverElement(javaProject, new NullProgressMonitor());
		Resource targetModel = discoverer.getTargetModel();
		normalize(targetModel);
		setResource(targetModel);
		discoverer.saveTargetModel();
		this.iFile = project.getFile(fileName);
	}


	private static void normalize(Resource resource) {
		Map<ASTNode, Integer> node2index = new HashMap<>();
		Map<EClass, List<EReference>> eClass2eReferences = new HashMap<>();
		//
		//	Descend the containment tree to put all declarations in a normalized order.
		//
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof Model) {
				Model model = (Model)eObject;
				normalizeDeclarations(model, node2index, eClass2eReferences);
			}
		}
		//
		//	Descend the containment tree again to put all referances in a normalized order.
		//
		ReferenceComparator referenceComparator = new ReferenceComparator(node2index);
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof Model) {
				normalizeReferences(eObject, referenceComparator, eClass2eReferences);
			}
		}
	}

	private static void normalizeDeclarations(EObject jNode, Map<ASTNode, Integer> node2index, Map<EClass, List<EReference>> eClass2eReferences) {
		EClass eClass = jNode.eClass();
		List<EReference> eReferences = eClass2eReferences.get(eClass);
		if (eReferences == null) {
			eReferences = new ArrayList<>();
			for (EStructuralFeature eStructuralFeature : eClass.getEAllStructuralFeatures()) {
				if (eStructuralFeature instanceof EReference) {
					EReference eReference = (EReference)eStructuralFeature;
					if (!eReference.isDerived() && !eReference.isTransient() && !eReference.isVolatile()) {
						eReferences.add(eReference);
					}
				}
			}
			Collections.sort(eReferences, ENamedElementComparator.INSTANCE);
			eClass2eReferences.put(eClass, eReferences);
		}
		for (EReference eReference : eReferences) {
			if (eReference.isContainment()) {
				if (eReference.isMany()) {
					@SuppressWarnings("unchecked")
					EList<ASTNode> eChildren = (EList<ASTNode>)jNode.eGet(eReference);
					if (!eReference.isOrdered() && (eChildren.size() >= 2)) {
						ECollections.sort(eChildren, DeclarationComparator.INSTANCE);
					}
					for (ASTNode eChild : eChildren) {
						normalizeDeclarations(eChild, node2index, eClass2eReferences);
						node2index.put(eChild, node2index.size());
					}
				}
				else {
					ASTNode eChild = (ASTNode)jNode.eGet(eReference);
					if (eChild != null) {
						normalizeDeclarations(eChild, node2index, eClass2eReferences);
						node2index.put(eChild, node2index.size());
					}
				}
			}
		}
		if (jNode instanceof CompilationUnit) {
			((CompilationUnit)jNode).setOriginalFilePath(((CompilationUnit)jNode).getName());
		}
	}

	private static void normalizeReferences(EObject jNode, ReferenceComparator referenceComparator, Map<EClass, List<EReference>> eClass2eReferences) {
		EClass eClass = jNode.eClass();
		for (EReference eReference : eClass2eReferences.get(eClass)) {
			if (eReference.isContainment()) {
				if (eReference.isMany()) {
					@SuppressWarnings("unchecked")
					EList<ASTNode> eChildren = (EList<ASTNode>)jNode.eGet(eReference);
					for (ASTNode eChild : eChildren) {
						normalizeReferences(eChild, referenceComparator, eClass2eReferences);
					}
				}
				else {
					ASTNode eChild = (ASTNode)jNode.eGet(eReference);
					if (eChild != null) {
						normalizeReferences(eChild, referenceComparator, eClass2eReferences);
					}
				}
			}
			else {
				if (eReference.isMany() && !eReference.isOrdered()) {
					@SuppressWarnings("unchecked")
					EList<ASTNode> eChildren = (EList<ASTNode>)jNode.eGet(eReference);
					if (eChildren.size() >= 2) {
						ECollections.sort(eChildren, referenceComparator);
					}
				}
			}
		}
	}

	@Test
	public void saveAll() throws IOException {
	//	Assert.assertNotNull(this.resource);
	//	Assert.assertFalse(this.resource.getContents().isEmpty());
		//
		File targetFile = new File(this.iFile.getLocation().toString());
		String targetText = readFile(targetFile);
		//
		File referenceFile = new File("../" + referenceFileName);
		String referenceText = readFile(referenceFile);
		//
		if (!referenceText.equals(targetText)) {
			Assert.assertTrue(referenceFile.getCanonicalPath() + " is stale wrt " + targetFile.toString(), false);
		// referenceFile is supposed to be manually copied from targetFile once 'better; targetFile confirmed.
		}
	}

	private static String readFile(File file) throws IOException {
		LineNumberReader lineReader = new LineNumberReader(new FileReader(file));
		StringBuilder s = new StringBuilder();
		for (String line; (line = lineReader.readLine()) != null; ) {
			s.append(line);
			s.append("\n");
		}
		lineReader.close();
		return s.toString();
	}
}
