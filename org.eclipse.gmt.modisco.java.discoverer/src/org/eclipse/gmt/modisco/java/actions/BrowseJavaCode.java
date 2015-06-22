/*
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */

package org.eclipse.gmt.modisco.java.actions;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.AbstractDiscovererImpl;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.JavaActivator;
import org.eclipse.gmt.modisco.java.Messages;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.eclipse.gmt.modisco.java.internal.core.JavaJdtBridge;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/**
 * @author Gabriel Barbier
 * @deprecated the whole plug-in is replaced by
 *             "org.eclipse.modisco.java.discoverer" (without the "gmt" part),
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public class BrowseJavaCode extends AbstractDiscovererImpl {

	/*
	 * Main idea is to be able to browse corresponding java code from an element
	 * of java model. First: retrieve corresponding java project in workspace
	 * Second: get the jdt model Third: find corresponding jdt element in jdt
	 * model Forth: open editor on selected element
	 */
	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		ASTNode node = (ASTNode) source;
		browseJavaCode(node);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer#isApplicableTo
	 * (java.lang.Object)
	 */
	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		/*
		 * A filter of instances from Java model Here is the four types that
		 * don't inherit from ASTNode 1. Model 2. Manifest 3. ManifestAttribute
		 * 4. ManifestEntry
		 */
		if (source instanceof ASTNode) {
			result = true;
			/*
			 * elements that cannot being linked to a java file:
			 * 
			 * Package = ? what if it exists a <Package name>.java which would
			 * be here only for javadoc
			 */
		}
		return result;
	}

	public void browseJavaCode(final ASTNode node) {
		CompilationUnit compilationUnit = node.getOriginalCompilationUnit();
		if (node instanceof CompilationUnit) {
			compilationUnit = (CompilationUnit) node;
		}

		if (compilationUnit != null) {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IPath filePath = new Path(compilationUnit.getOriginalFilePath());
			final IFile ifile = root.getFileForLocation(filePath);
			/*
			 * in case of fields or methods, or statements, we have to find
			 * corresponding jdt element (IJavaElement)
			 */
			final IJavaElement jdtElement = findCorrespondingJdtElement(
					node, compilationUnit);
			if ((ifile != null) && ifile.exists()) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						try {
							// programmatically opens the jdt element using the
							// default editor if one is present
							if (jdtElement != null) {
								JavaUI.openInEditor(jdtElement);
							} else {
								IWorkbenchPage page = PlatformUI.getWorkbench()
										.getActiveWorkbenchWindow()
										.getActivePage();
								IDE.openEditor(page, ifile);
							}

						} catch (PartInitException e) {
							MoDiscoLogger.logError(e, JavaActivator
									.getDefault());
						} catch (JavaModelException e) {
							MoDiscoLogger.logError(e, JavaActivator
									.getDefault());
						}
					}
				});
			} else {
				MoDiscoLogger.logInfo(Messages.BrowseJavaCode_noFileFound
						+ filePath, JavaActivator.getDefault());
			}
		} else {
			MoDiscoLogger.logInfo(
					Messages.BrowseJavaCode_notHandledJavaElement,
					JavaActivator.getDefault());
		}
	}

	/**
	 * @param node
	 * @return
	 */
	private IJavaElement findCorrespondingJdtElement(final ASTNode node,
			final CompilationUnit compilationUnit) {
		IJavaElement result = null;

		EObject eobject = compilationUnit.eContainer();
		if (eobject instanceof Model) {
			Model model = (Model) eobject;
			/*
			 * first. Get the java project
			 */
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			String projectName = model.getName();
			IProject project = root.getProject(projectName);
			if (project != null) {
				// retrieval of Java project
				IJavaProject tempProject = null;
				if (project instanceof IJavaProject) {
					tempProject = (IJavaProject) project;
				} else {
					try {
						if (project.hasNature(JavaCore.NATURE_ID)) {
							tempProject = JavaCore.create(project);
						}
					} catch (CoreException e) {
						MoDiscoLogger.logError(e, JavaActivator.getDefault());
					}
				}
				final IJavaProject javaProject = tempProject;
				if (node instanceof AbstractMethodDeclaration) {
					AbstractMethodDeclaration operation = (AbstractMethodDeclaration) node;
					JavaJdtBridge bridge = new JavaJdtBridge();
					result = bridge.getJdtOperation(javaProject, operation);
				} else if (node instanceof VariableDeclaration) {
					VariableDeclaration field = (VariableDeclaration) node;
					JavaJdtBridge bridge = new JavaJdtBridge();
					result = bridge.getJdtField(javaProject, field);
				} else if (node instanceof FieldDeclaration) {
					FieldDeclaration fieldDeclaration = (FieldDeclaration) node;
					// retireve the first fragment definition
					VariableDeclaration field = fieldDeclaration.getFragments()
							.get(0);
					JavaJdtBridge bridge = new JavaJdtBridge();
					result = bridge.getJdtField(javaProject, field);
				}
			} else {
				MoDiscoLogger.logInfo(Messages.BrowseJavaCode_projectNotFound
						+ projectName, JavaActivator.getDefault());
			}
		}

		return result;
	}
}
