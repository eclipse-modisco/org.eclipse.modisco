/*******************************************************************************
 * Copyright (c) 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 482672 - Benchmark command line interface
 *    Grégoire Dupé (Mia-Software) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal;

import java.io.File;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Options;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.facet.util.core.DebugUtils;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IDiscovererList;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IDiscovererListFactory;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IProjectSet;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IProjectSetFactory;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.impl.DiscovererBenchmarkDiscoverer;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkFactory;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery;

public class Application implements IApplication {

	public Object start(final IApplicationContext context) throws Exception {
		final String[] args = ((String[]) context.getArguments().get(
				IApplicationContext.APPLICATION_ARGS));
		// create Options object
		final Options options = new Options();
		// add t option
		options.addOption("r", true, Messages.Application_Html_report_dir); //$NON-NLS-1$
		options.addOption("d", true, Messages.Application_Comma_sep_discoverer_list); //$NON-NLS-1$
		options.getOption("d").setRequired(true); //$NON-NLS-1$
		options.addOption("i", true, Messages.Application_no_of_iteration); //$NON-NLS-1$
		options.addOption("p", true, Messages.Application_Comma_sep_project_list); //$NON-NLS-1$
		options.addOption("o", true, Messages.Application_XMI_Output); //$NON-NLS-1$
		options.getOption("o").setRequired(true); //$NON-NLS-1$
		options.addOption("e", true, Messages.Application_Comma_sep_existing_prj_path); //$NON-NLS-1$
		options.addOption("m", false, Messages.Application_RecordMemoryUse); //$NON-NLS-1$
		options.addOption("n", true, Messages.Application_MemoryPollingInterval); //$NON-NLS-1$
		options.addOption("s", true, "Sample size discoverer"); //$NON-NLS-1$
		options.getOption("s").setRequired(true); //$NON-NLS-1$
		final CommandLineParser parser = new GnuParser();
		final CommandLine cmd = parser.parse(options, args);
		if (cmd.hasOption('e')) {
			importExistingPrj(cmd.getOptionValue('e').split(",")); //$NON-NLS-1$
		}
		final DiscovererBenchmarkDiscoverer discoverer =
				new DiscovererBenchmarkDiscoverer();
		discoverer.setGenerateHtmlReport(cmd.hasOption('r'));
		final IDiscovererList discos = IDiscovererListFactory.INSTANCE.createDiscovererList();
		for (final String discoId : cmd.getOptionValue('d').split(",")) { //$NON-NLS-1$
			final Discovery discovery = BenchmarkFactory.eINSTANCE.createDiscovery();
			discovery.setDiscovererId(discoId);
			discos.add(discovery);
		}
		discoverer.setDiscoverers(discos);
		if (cmd.hasOption('i')) {
			discoverer.setIterations(Integer.parseInt(cmd.getOptionValue('i')));
		} else {
			discoverer.setIterations(1);
		}
		discoverer.setMeasureMemoryUse(cmd.hasOption('m'));
		if (cmd.hasOption('n')) {
			discoverer.setMemoryPollingInterval(Integer.parseInt(cmd.getOptionValue('n')));
		}
		final IProjectSet projectSet = IProjectSetFactory.INSTANCE.createProjectSet();
		if (cmd.hasOption('p')) {
			final IWorkspaceRoot wsRoot = ResourcesPlugin.getWorkspace().getRoot();
			for (final String projectName : cmd.getOptionValue('p').split(",")) { //$NON-NLS-1$
				final IProject iProject = wsRoot.getProject(projectName);
				projectSet.add(iProject);
			}
		} else {
			final IWorkspaceRoot wsRoot = ResourcesPlugin.getWorkspace().getRoot();
			for (final IProject iProject : wsRoot.getProjects()) {
				projectSet.add(iProject);
			}
		}
		final String filePath = cmd.getOptionValue('o');
		discoverer.setTargetURI(URI.createFileURI(filePath));
		discoverer.setSerializeTarget(true);
		discoverer.setSizeDiscovererId(cmd.getOptionValue('s'));
		if (cmd.hasOption('r')) {
			final String htmlPath = cmd.getOptionValue('r');
			discoverer.setHtmlReportLocation(URI.createFileURI(htmlPath));
			discoverer.setGenerateHtmlReport(true);
		} else {
			discoverer.setGenerateHtmlReport(false);
		}
		discoverer.discoverBenchmark(projectSet, new NullProgressMonitor());
		DebugUtils.debug(discoverer.getTargetURI().toString());
		return null;
	}

	private static void importExistingPrj(final String[] projectParents) {
		for (final String projectParent : projectParents) {
			importExistingPrj(projectParent);
		}
	}

	private static void importExistingPrj(final String projectParent) {
		final File prjParentFile = new File(projectParent);
		for (final File child : prjParentFile.listFiles()) {
			if (child.isDirectory()) {
				final File dotPrj = new File(child, ".project"); //$NON-NLS-1$
				if  (dotPrj.exists()) {
					importExistingPrj(dotPrj);
				}
			}
		}
	}

	private static void importExistingPrj(final File dotPrj) {
		try {
			final IWorkspace workspace = ResourcesPlugin.getWorkspace();
			final Path projectDescriptionFile = new Path(
					dotPrj.getAbsolutePath());
			final IProjectDescription prjDesc = workspace
					.loadProjectDescription(projectDescriptionFile);
			final IWorkspaceRoot wsRoot = workspace.getRoot();
			final IProject project = wsRoot.getProject(prjDesc.getName());
			if (!project.exists()) {
				final String message = String.format("Creating the project '%s'",  //$NON-NLS-1$
						prjDesc.getName());
				DebugUtils.debug(message);
				project.create(prjDesc, new NullProgressMonitor());
			}
			if (!project.isOpen()) {
				final String message = String.format("Opening the project '%s'",  //$NON-NLS-1$
						prjDesc.getName());
				DebugUtils.debug(message);
				project.open(new NullProgressMonitor());
			}
			final String message = String.format("Refreshing the project '%s'",  //$NON-NLS-1$
					prjDesc.getName());
			DebugUtils.debug(message);
			project.refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());
		} catch (final CoreException e) {
			final String message = String.format(
					"Failed to load '%s'", dotPrj.getAbsolutePath()); //$NON-NLS-1$
			Logger.logError(message, Activator.getDefault());
		}
	}

	public void stop() {
		//Nothing to do
	}

}
