//Start of user code copyright
/*******************************************************************************
 * Copyright (c) 2026 OBEOSOFT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Yvan Lussaud (OBEOSOFT) - initial API and implementation
 *******************************************************************************/
//End of user code

package org.eclipse.modisco.java.discoverer.benchmark.template.html;

//Start of user code imports
import java.io.File;
import java.io.PrintStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.modisco.infra.discovery.benchmark.Benchmark;
import org.eclipse.modisco.java.discoverer.benchmark.Activator;
import org.eclipse.modisco.java.discoverer.benchmark.ripoffs.AbstractResourceSelectionDialog;
import org.eclipse.modisco.java.discoverer.benchmark.ripoffs.FolderSelectionDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;

//End of user code

/**
 * Eclipse launcher for
 * org::eclipse::modisco::java::discoverer::benchmark::template::html::htmlReport2.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 * @generated
 */
public class HtmlReport2GeneratorEclipse extends HtmlReport2Generator {

	/**
	 * Opens the dialog to select the target folder.
	 */
	private static final class SelectTargetRunnable implements Runnable {

		/**
		 * The target folder.
		 */
		private String target;

		@Override
		public void run() {
			final AbstractResourceSelectionDialog dialog = new FolderSelectionDialog(
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
					"Select the destination folder", "");
			final int dialogResult = dialog.open();
			if ((dialogResult == IDialogConstants.OK_ID) && dialog.getFileName() != null
					&& !dialog.getFileName().isEmpty()) {
				final Path location = new Path(dialog.getFileName());
				IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
				if (location.segmentCount() == 1) {
					target = workspaceRoot.getProject(location.segment(0)).getLocation().toFile()
							.getAbsolutePath();
				} else {
					target = workspaceRoot.getFolder(location).getLocation().toFile()
							.getAbsolutePath();
				}
			} else {
				target = null;
			}
		}

		/**
		 * Gets the target folder.
		 * 
		 * @return the target folder
		 */
		public String getTarget() {
			return target;
		}

	}

	/**
	 * The selected value.
	 * 
	 * @generated
	 */
	private final List<EObject> values;

	/**
	 * Constructor.
	 * 
	 * @param selected
	 *            the selected {@link IFile}
	 * @generated
	 */
	public HtmlReport2GeneratorEclipse(IFile selected, String targetFileName) {
		super(Collections
				.singletonList(URI.createFileURI(selected.getLocation().toString()).toString()),
				getTarget(selected), targetFileName);
		this.values = null;
	}

	/**
	 * Constructor.
	 * 
	 * @param selected
	 *            the selected {@link IFile}
	 * @param target
	 *            the target folder of the generation
	 * @generated NOT
	 */
	public HtmlReport2GeneratorEclipse(IFile selected, String target, String targetFileName) {
		super(Collections.singletonList(
				URI.createFileURI(selected.getLocation().toString()).toString()), target, targetFileName);
		this.values = null;
	}

	/**
	 * Constructor.
	 * 
	 * @param selected
	 *            the selected {@link }
	 * @generated NOT
	 */
	public HtmlReport2GeneratorEclipse(Benchmark selected, String targetFileName) {
		super(Collections.emptyList(), getTarget(selected), targetFileName);
		this.values = Collections.singletonList(selected);
	}

	/**
	 * Constructor.
	 * 
	 * @param selected
	 *            the selected {@link }
	 * @param target
	 *            the target folder of the generation
	 * @generated NOT
	 */
	public HtmlReport2GeneratorEclipse(Benchmark selected, String target, String targetFileName) {
		super(Collections.emptyList(), target, targetFileName);
		this.values = Collections.singletonList(selected);
	}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected List<EObject> getValues(Object queryEnvironment,
			Map<EClass, List<EObject>> valuesCache, Object type,
			ResourceSet resourceSetForModels, List<Resource> modelResources, Monitor monitor) {
		final List<EObject> res;

		if (values != null) {
			res = values;
		} else {
			res = super.getValues(queryEnvironment, valuesCache, type, resourceSetForModels,
					modelResources, monitor);
		}

		return res;
	}

	/**
	 * @generated
	 */
	@Override
	protected void standaloneInitialization(ResourceSet resourceSetForModels) {
		// nothing to do here
	}

	/**
	 * Gets the target folder for the selected {@link } or selected
	 * {@link IFile}.
	 * 
	 * @param selected
	 *            the model {@link } or selected {@link IFile}
	 * @return the target folder for the selected {@link } or selected
	 *         {@link IFile}
	 */
	private static String getTarget(Object selected) {
		final SelectTargetRunnable runnable = new SelectTargetRunnable();
		Display.getDefault().syncExec(runnable);

		return runnable.getTarget();
	}

	@Override
	public void generate(Monitor monitor) {
		if (target != null) {
			reportGenerator.generate(values);
		}
	}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected void printDiagnostic(Diagnostic diagnostic) {}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected void printSummary(Object result) {}
}
