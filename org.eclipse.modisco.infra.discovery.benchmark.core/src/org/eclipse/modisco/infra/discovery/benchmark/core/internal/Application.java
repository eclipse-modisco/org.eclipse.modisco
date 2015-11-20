package org.eclipse.modisco.infra.discovery.benchmark.core.internal;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Options;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
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
		options.addOption("r", false, "Generate HTML report"); //$NON-NLS-1$
		options.addOption("d", true, "Comma separated discoverer list"); //$NON-NLS-1$
		options.getOption("d").setRequired(true); //$NON-NLS-1$
		options.addOption("i", true, "Number of iteration"); //$NON-NLS-1$
		options.addOption("p", true, "Comma separated project list"); //$NON-NLS-1$
		options.addOption("o", true, "XMI outpout"); //$NON-NLS-1$
		options.getOption("o").setRequired(true); //$NON-NLS-1$
		final CommandLineParser parser = new GnuParser();
		final CommandLine cmd = parser.parse(options, args);
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
		discoverer.discoverBenchmark(projectSet, new NullProgressMonitor());
		System.out.println(discoverer.getTargetURI().toString());
		return null;
	}

	public void stop() {
		// TODO Auto-generated method stub

	}

}
