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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.browser.editors.EcoreBrowser;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.AbstractDiscovererImpl;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.JavaActivator;
import org.eclipse.gmt.modisco.java.internal.core.JavaJdtBridge;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.ui.IEditorPart;
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
public class BrowseJavaModel extends AbstractDiscovererImpl {

	/*
	 * Main idea is to be able to browse corresponding java model from an
	 * element of java code (jdt element). First: retrieve corresponding java
	 * model in workspace Second: find corresponding java element in java model
	 * Third: open editor on selected element
	 */
	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		// retrieval of Java project and open the java model in editor
		IJavaProject javaProject = null;
		if (source instanceof IJavaProject) {
			javaProject = (IJavaProject) source;
		} else if (source instanceof IProject) {
			IProject project = (IProject) source;
			try {
				if (project.hasNature(JavaCore.NATURE_ID)) {
					javaProject = JavaCore.create(project);
				}
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, JavaActivator.getDefault());
			}
		} else if (source instanceof IPackageFragmentRoot) {
			IPackageFragmentRoot root = (IPackageFragmentRoot) source;
			javaProject = root.getJavaProject();
		} else if (source instanceof IJavaElement) {
			IJavaElement root = (IJavaElement) source;
			javaProject = root.getJavaProject();
		}

		/*
		 * As the editor should be opened in Display thread, we will consider
		 * that navigation (if needed) should have to be done in Display thread
		 * also.
		 */
		prepareJavaModel(javaProject, source);

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
		 * A filter of instances from Jdt
		 * 
		 * We would like to reach main containment objects: CompilationUnit,
		 * SourceType, SourceField, SourceMethod, PackageFragment,
		 * PackageFragmentRoot
		 * 
		 * We have two parent as candidates: IJavaElement and
		 * ISourceManipulation However, ISourceManipulation doesn't have
		 * PackageFragmentRoot as child. So final choice will be IJavaElement.
		 */
		if (source instanceof IJavaElement) {
			result = true;
			/*
			 * elements that cannot being linked to a java file:
			 * 
			 * Package = ? what if it exists a <Package name>.java which would
			 * be here only for javadoc
			 */
		} else if (source instanceof IJavaProject) {
			result = ((IJavaProject) source).getProject().isAccessible();
		} else if (source instanceof IProject) {
			IProject project = (IProject) source;
			try {
				if ((project.isAccessible()) && (project.hasNature(JavaCore.NATURE_ID))) {
					result = true;
				}
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, JavaActivator.getDefault());
			}
		}
		return result;
	}

	/**
	 * @param node
	 * @return
	 */
	ASTNode findCorrespondingJavaElement(final IJavaElement jdtElement, final Resource javaModel) {
		ASTNode result = null;
		/*
		 * - for IPackageFragment, we need to retrieve corresponding
		 * PackageDeclaration - for ICompilationUnit and IType, we need to
		 * retrieve corresponding TypeDeclaration. - for IMethod, we need to
		 * retrieve corresponding AbstractMethodDeclaration - for IField, we
		 * need to retrieve corresponding VariableDeclaration
		 */
		JavaJdtBridge bridge = new JavaJdtBridge();
		if (jdtElement instanceof IPackageFragment) {
			IPackageFragment jdtFragment = (IPackageFragment) jdtElement;
			result = bridge.getJavaPackage(javaModel, jdtFragment);
		} else if (jdtElement instanceof ICompilationUnit) {
			ICompilationUnit jdtUnit = (ICompilationUnit) jdtElement;
			IType jdtType = jdtUnit.findPrimaryType();
			result = bridge.getJavaType(javaModel, jdtType);
		} else if (jdtElement instanceof IType) {
			IType jdtType = (IType) jdtElement;
			result = bridge.getJavaType(javaModel, jdtType);
		} else if (jdtElement instanceof IMethod) {
			IMethod jdtMethod = (IMethod) jdtElement;
			result = bridge.getJavaOperation(javaModel, jdtMethod);
		} else if (jdtElement instanceof IField) {
			IField jdtField = (IField) jdtElement;
			result = bridge.getJavaField(javaModel, jdtField);
		}
		return result;
	}

	/*
	 * We always have to open the model editor with java model, if it doesn't
	 * exist, we have to create it before. After this first step, we will
	 * separate the process in two cases, elements which need a navigation into
	 * java model to find a correspondence, and elements which don't.
	 * 
	 * Elements without navigation: IPackageFragmentRoot, project ?
	 */
	private void prepareJavaModel(final IJavaProject project, final Object source) {
		/*
		 * from the project, we will test existence of java model. If it exists
		 * we will load it into an editor. Otherwise, we have to build it
		 * firstly using classic discoverer.
		 */
		final IPath path = project.getProject().getLocation().addTrailingSeparator().append(
				project.getElementName()).addFileExtension("javaxmi"); //$NON-NLS-1$
		final IFile ifile = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(path);

		boolean openable = ifile.exists();
		if (!openable) {
			DiscoverJavaModelFromJavaProject discoverer = new DiscoverJavaModelFromJavaProject();
			Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();

			discoverer.discoverElement(project, parameters);
			if (discoverer.getResourceResult() != null) {
				openable = true;
			}
		} // else, nothing to do

		if (openable) {
			openJavaModelEditor(ifile, source);
		}
	}
	
	private final void openJavaModelEditor(final IFile ifile, final Object source) {
		// open the editor, or get reference of already opened editor
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				try {
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getActivePage();
					IEditorPart editor = IDE.openEditor(page, ifile, EcoreBrowser.EDITOR_ID);
					if ((source instanceof IJavaElement)
							&& (!(source instanceof IPackageFragmentRoot))) {
						EcoreBrowser browser = (EcoreBrowser) editor;
						URI javaModelUri = URI.createPlatformResourceURI(ifile.getFullPath()
								.toString(), true);
						Resource resource = browser.getResourceSet().getResource(javaModelUri,
								false);
						if (resource != null) {
							ASTNode astNode = findCorrespondingJavaElement((IJavaElement) source,
									resource);
							if (astNode != null) {
								browser.browseTo(astNode);
							}
						} else {
							MoDiscoLogger.logInfo(
									javaModelUri + " not found !", JavaActivator.getDefault()); //$NON-NLS-1$
						}
					}

				} catch (PartInitException e) {
					MoDiscoLogger.logInfo(e, JavaActivator.getDefault());
				}
			}
		});
	}
}
