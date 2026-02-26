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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
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
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
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
		NullProgressMonitor monitor = new NullProgressMonitor();
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
		discoverClasspathEntries((JavaProject)javaProject, classpathEntries);
	}

	protected void discoverClasspathEntries(JavaProject javaProject, IClasspathEntry[] classpathEntries) throws JavaModelException, DiscoveryException {
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
			discoverJavaElements(children);
		}
	}

	protected void discoverJavaElements(IJavaElement[] children) throws JavaModelException, DiscoveryException {
		for (IJavaElement iJavaElement : children) {
			if (iJavaElement instanceof IPackageFragment) {
				IPackageFragment iJavaElement2 = (IPackageFragment) iJavaElement;
				System.out.println(iJavaElement2.toString());
			//	result = traverse(iJavaElement2, stopOnFirstResult, state);
			//	if (stopOnFirstResult && result!=null)
			//		return result;
				discoverJavaElements(iJavaElement2.getChildren());
			}
			else if (iJavaElement instanceof IClassFile){
				System.out.println(iJavaElement.getClass().getName() + " : " + iJavaElement.toString());
				discoverClassFile((IClassFile)iJavaElement);
			}
			else {
				System.out.println(iJavaElement.getClass().getName() + " : " + iJavaElement.toString());
			}
		}
	}

	private void discoverClassFile(IClassFile iClassFile) throws DiscoveryException {
		DiscoverJavaModelFromClassFile discover = new DiscoverJavaModelFromClassFile();
		discover.discoverElement(iClassFile, new NullProgressMonitor());
		Resource resource = discover.getTargetModel();
		System.out.println(iClassFile + " => " + resource.toString());
	}
}
