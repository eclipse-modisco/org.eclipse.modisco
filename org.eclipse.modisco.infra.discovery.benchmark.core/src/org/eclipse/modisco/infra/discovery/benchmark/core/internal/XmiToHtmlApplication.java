/*******************************************************************************
 * Copyright (c) 2015 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 482672 - Benchmark command line interface
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal;

import java.io.File;
import java.util.Collections;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Options;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.impl.ReportUtils;

public class XmiToHtmlApplication implements IApplication {

	public Object start(final IApplicationContext context) throws Exception {
		final String[] args = ((String[]) context.getArguments().get(
				IApplicationContext.APPLICATION_ARGS));
		// create Options object
		final Options options = new Options();
		// add t option
		options.addOption("x", true, Messages.XmiToHtmlApplication_XMI_file_path); //$NON-NLS-1$
		options.getOption("x").setRequired(true); //$NON-NLS-1$
		options.addOption("t", true, Messages.XmiToHtmlApplication_Target_Folder_Path); //$NON-NLS-1$
		options.getOption("t").setRequired(true); //$NON-NLS-1$
		options.addOption("m", false, Messages.XmiToHtmlApplication_MeasureMemoryUse); //$NON-NLS-1$
		final CommandLineParser parser = new GnuParser();
		final CommandLine cmd = parser.parse(options, args);

		final File benchmarkFile = new File(cmd.getOptionValue('x'));
		final File targetFolder = new File(cmd.getOptionValue('t'));
		List<? extends Object> arguments = Collections.emptyList();
		boolean measureMemoryUse = cmd.hasOption('m');
		ReportUtils.generateReport(benchmarkFile, targetFolder, arguments,
				measureMemoryUse);
		return null;
	}

	public void stop() {
		//Nothing to do
	}

}
