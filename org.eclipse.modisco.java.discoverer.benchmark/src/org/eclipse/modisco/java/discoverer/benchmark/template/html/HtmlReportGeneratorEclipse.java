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
import java.util.ArrayList;
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
import org.eclipse.modisco.infra.discovery.benchmark.MultiProjectBenchmark;
import org.eclipse.modisco.java.discoverer.benchmark.Activator;
import org.eclipse.modisco.java.discoverer.benchmark.ripoffs.AbstractResourceSelectionDialog;
import org.eclipse.modisco.java.discoverer.benchmark.ripoffs.FolderSelectionDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;


//End of user code

/**
 * Eclipse launcher for
 * org::eclipse::modisco::java::discoverer::benchmark::template::html::htmlReport.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 * 
 */
public class HtmlReportGeneratorEclipse extends HtmlReportGenerator {

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
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Select the destination folder",
					"");
			final int dialogResult = dialog.open();
			if ((dialogResult == IDialogConstants.OK_ID) && dialog.getFileName() != null
					&& !dialog.getFileName().isEmpty()) {
				final Path location = new Path(dialog.getFileName());
				IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
				if (location.segmentCount() == 1) {
					target = workspaceRoot.getProject(location.segment(0)).getLocation().toFile().getAbsolutePath();
				} else {
					target = workspaceRoot.getFolder(location).getLocation().toFile().getAbsolutePath();
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
	 * 
	 */
	private final List<EObject> values;

	/**
	 * Constructor.
	 * 
	 * @param selected the selected {@link IFile}
	 * 
	 */
	public HtmlReportGeneratorEclipse(IFile selected) {
		super(Collections.singletonList(URI.createFileURI(selected.getLocation().toString()).toString()),
				getTarget(selected));
		this.values = null;
	}

	/**
	 * Constructor.
	 * 
	 * @param selected the selected {@link IFile}
	 * @param target   the target folder of the generation
	 * 
	 */
	public HtmlReportGeneratorEclipse(IFile selected, String target) {
		super(Collections.singletonList(URI.createFileURI(selected.getLocation().toString()).toString()), target);
		this.values = null;
	}

	/**
	 * Constructor.
	 * 
	 * @param selected
	 *            the selected {@link }
	 * 
	 */
	public HtmlReportGeneratorEclipse(Benchmark selected) {
		super(Collections.emptyList(), getTarget(selected));
		this.values = Collections.singletonList(selected);
	}

	/**
	 * Constructor.
	 * 
	 * @param selected
	 *            the selected {@link }
	 * @param target
	 *            the target folder of the generation
	 * 
	 */
	public HtmlReportGeneratorEclipse(Benchmark selected, String target) {
		super(Collections.emptyList(), target);
		this.values = Collections.singletonList(selected);
	}

	@Override
	protected void standaloneInitialization(ResourceSet resourceSetForModels) {
		// nothing to do here
	}

	/**
	 * Gets the target folder for the selected {@link } or selected {@link IFile}.
	 * 
	 * @param selected the model {@link } or selected {@link IFile}
	 * @return the target folder for the selected {@link } or selected {@link IFile}
	 * 
	 */
	private static String getTarget(Object selected) {
		final SelectTargetRunnable runnable = new SelectTargetRunnable();
		Display.getDefault().syncExec(runnable);

		return runnable.getTarget();
	}

	/**
	 * 
	 */
	@Override
	public void generate(Monitor monitor) {
		if (target != null) {
			List<MultiProjectBenchmark> list = new ArrayList<>();
			for (Object value : values) {
				if (value instanceof MultiProjectBenchmark) {
					list.add((MultiProjectBenchmark)value);
				}
			}
			reportGenerator.generate(list, monitor);
		}
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected void printDiagnostics(Object generationResult) {
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected void printDiagnostic(Diagnostic diagnostic) {
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected void printSummary(Object result) {
	}
}
