/**
 * Copyright (c) 2008, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributor:
 *     Hugues Dubourg
 */

package org.eclipse.modisco.infra.common.core.internal.logging;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.common.core.internal.CommonModiscoActivator;

/**
 * Log to a file
 *
 * @author hdubourg
 *
 */
public class MoDiscoLogHandler extends Handler {

	private File logFile;
	private PrintWriter pWriter;

	public MoDiscoLogHandler(final String filePath) {
		this.logFile = new File(filePath);
		if (!this.logFile.isAbsolute()) {
			this.logFile = ResourcesPlugin.getWorkspace().getRoot().getLocation().append(filePath)
					.toFile();
		}
		try {
			this.pWriter = new PrintWriter(this.logFile);
		} catch (FileNotFoundException e) {
			Logger.logError(e, CommonModiscoActivator.getDefault());
		}
	}

	/**
	 * @see java.util.logging.Handler#close()
	 * @throws SecurityException
	 */
	@Override
	public void close() {
		if (this.pWriter != null) {
			this.pWriter.close();
		}
	}

	@Override
	public void flush() {
		// do nothing: no buffer

	}

	@Override
	public void publish(final LogRecord record) {
		if (this.pWriter != null) {
			this.pWriter.println(record.getMessage());
		}
	}

}
