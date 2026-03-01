/*******************************************************************************
 * Copyright (c) 2015, 2026 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *		Fabien Giquel (Mia-Software) - Bug 351590 - [Java] ClassCastException while discovering Apache math commons
 *******************************************************************************/

package org.eclipse.modisco.java.discoverer.tests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.IOWrappedException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.JavaModel;
import org.eclipse.jdt.internal.core.JavaProject;
import org.eclipse.modisco.common.core.files.ProjectUtils;
import org.eclipse.modisco.common.tests.TestFileUtils;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromClassFile;
import org.junit.Test;

public class Issue1082moreJava
{
	private Resource resource;
	private Model model;

	protected String getTargetProjectName() {
		return Activator.PLUGIN_ID + "_issue1082"; //$NON-NLS-1$
	}

	protected String getSourcesReferencePath() {
		return "/workspace/issue1082/"; //$NON-NLS-1$
	}

	@Test
	public void testMoreJava() throws Exception {
		String targetProject = getTargetProjectName();
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(targetProject);
		NullProgressMonitor nullMonitor = new NullProgressMonitor();
		NullProgressMonitor monitor = nullMonitor;
		if (project.exists()) {
			project.delete(true, true, monitor);
		}
		project.create(monitor);
		project.open(monitor);
		TestFileUtils.deepCopy(Activator.getDefault().getBundle(), getSourcesReferencePath(), project, "/"); //$NON-NLS-1$
		IJavaProject javaProject = JavaCore.create(project);
		ProjectUtils.refresh(project);
		if (javaProject == null) {
			return;
		}
		
		IClasspathEntry[] classpathEntries = javaProject.getResolvedClasspath(false);			// XXX true

		List<IClassFile> classFiles = new ArrayList<>();
		gatherClassFiles(classFiles, (JavaProject)javaProject, classpathEntries);
	
//		DiscoverJavaModelFromClassFile discoverer = new DiscoverJavaModelFromClassFile();
//		discoverer.setDiscoverExpressions(true);
//		discoverer.setSerializeTarget(false);
		ResourceSet resourceSet = new ResourceSetImpl();
		List<DiscoverJavaModelFromClassFile> discoverers = new ArrayList<>();
		for (IClassFile classFile : classFiles) {
			DiscoverJavaModelFromClassFile discoverer = new DiscoverJavaModelFromClassFile();
			discoverers.add(discoverer);
			discoverer.setResourceSet(resourceSet);
			discoverer.setDiscoverExpressions(true);
			discoverer.setSerializeTarget(false);
			discoverer.discoverElement(classFile, nullMonitor);
		}
	//	Resource resource = discoverer.getTargetModel();
	//	System.out.println(iClassFile + " => " + resource.toString());
		
		
		//	discoverClasspathEntries((JavaProject)javaProject, classpathEntries, resourceSet);
		for (DiscoverJavaModelFromClassFile discoverer : discoverers) {
			discoverer.setSerializeTarget(false);
			try {
				discoverer.saveTargetModel();
			}
			catch (IOWrappedException e) {
				System.out.println(discoverer.getTargetModel().getURI() + " save failed : " + e.getMessage());
			}
		}
		
	//	JDTVisitor.reportMappings();
	}

	protected void gatherClassFiles(List<IClassFile> classFiles, JavaProject javaProject, IClasspathEntry[] classpathEntries) throws JavaModelException {
		for (IClasspathEntry classpathEntry : classpathEntries) {
			IClasspathAttribute[] extraAttributes = classpathEntry.getExtraAttributes();
			IPackageFragmentRoot packageFragmentRoot = null;
			Object target = JavaModel.getTarget(classpathEntry, false/*don't check existence*/);
			IPath path = classpathEntry.getPath();
			if (target instanceof IResource) {
				packageFragmentRoot = javaProject.getPackageFragmentRoot((IResource)target, path, extraAttributes);
			} else {
			//	IPath canonicalizedPath = JavaProject.createPackageFragementKey(new Path(classpathEntry.getPath().toOSString()));
				packageFragmentRoot = javaProject.getPackageFragmentRoot0(path, extraAttributes);
			}
			IJavaElement[] children = packageFragmentRoot.getChildren();
			gatherClassFiles(classFiles, children);
		}
	}

	protected void gatherClassFiles(List<IClassFile> classFiles, IJavaElement[] children) throws JavaModelException {
		for (IJavaElement iJavaElement : children) {
			if (iJavaElement instanceof IPackageFragment) {
				IPackageFragment iJavaElement2 = (IPackageFragment) iJavaElement;
			//	System.out.println(iJavaElement2.toString());
			//	result = traverse(iJavaElement2, stopOnFirstResult, state);
			//	if (stopOnFirstResult && result!=null)
			//		return result;
				gatherClassFiles(classFiles, iJavaElement2.getChildren());
			}
			else if (iJavaElement instanceof IClassFile){
		//		System.out.println(iJavaElement.getClass().getName() + " : " + iJavaElement.toString());
				if ("SashFactory.class".equals(iJavaElement.getElementName())) {
					classFiles.add((IClassFile)iJavaElement);
				}
			}
			else {
				System.out.println(iJavaElement.getClass().getName() + " : " + iJavaElement.toString());
			}
		}
	}

/*	private void discoverClassFile(IClassFile iClassFile, ResourceSet resourceSet) throws DiscoveryException {
	//	CompilationUnit ast = SharedASTProviderCore.getAST(iClassFile, SharedASTProviderCore.WAIT_YES, null);
	//	CompilationUnit ast = CoreASTProvider.getAST(iClassFile, null);
		DiscoverJavaModelFromClassFile discoverer = new DiscoverJavaModelFromClassFile();
		discoverers.add(discoverer);
		discoverer.setResourceSet(resourceSet);
		discoverer.setDiscoverExpressions(true);
		discoverer.setSerializeTarget(false);
		discoverer.discoverElement(iClassFile, new NullProgressMonitor());
		Resource resource = discoverer.getTargetModel();
	//	System.out.println(iClassFile + " => " + resource.toString());
	} */
}
