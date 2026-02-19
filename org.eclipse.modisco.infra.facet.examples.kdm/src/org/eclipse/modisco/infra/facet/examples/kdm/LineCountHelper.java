/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.facet.examples.kdm;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;

/**
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public final class LineCountHelper {
	private static final int BUFFER_SIZE = 1024;
	private static LineCountHelper instance;
	private final Map<File, Count> cache = new HashMap<File, Count>();

	private LineCountHelper() {
		// singleton
	}

	private final class Count {
		private final int nChars;
		private final int nLines;
		private final int nNonEmptyLines;
		private final long lastModified;

		private Count(final int nChars, final int nLines, final int nNonEmptyLines,
				final long lastModified) {
			this.nChars = nChars;
			this.nLines = nLines;
			this.nNonEmptyLines = nNonEmptyLines;
			this.lastModified = lastModified;
		}

	}

	public static LineCountHelper getInstance() {
		if (LineCountHelper.instance == null) {
			LineCountHelper.instance = new LineCountHelper();
		}
		return LineCountHelper.instance;
	}

	public int numberOfCharacters(final File file) {
		Count count = lineCount(file);
		if (count != null) {
			return count.nChars;
		}
		return -1;
	}

	public int numberOfLines(final File file) {
		Count count = lineCount(file);
		if (count != null) {
			return count.nLines;
		}
		return -1;
	}

	public int numberOfNonEmptyLines(final File file) {
		Count count = lineCount(file);
		if (count != null) {
			return count.nNonEmptyLines;
		}
		return -1;
	}

	private Count lineCount(final File file) {
		try {
			Count count = this.cache.get(file);
			if (count != null && count.lastModified == file.lastModified()) {
				return count;
			}
			if (file.exists()) {
				// long before = System.currentTimeMillis();
				InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
				// more efficient than reading char by char
				byte[] buffer = new byte[LineCountHelper.BUFFER_SIZE];
				int nChars = 0;
				int nLines = 0;
				int nNotEmptyLines = 0;
				int readChars = 0;
				boolean empty = true;
				while ((readChars = inputStream.read(buffer)) != -1) {
					for (int i = 0; i < readChars; i++) {
						nChars++;
						if (buffer[i] == '\n') {
							if (!empty) {
								nNotEmptyLines++;
							}
							nLines++;
							empty = true;
						} else if (!Character.isWhitespace(buffer[i])) {
							empty = false;
						}
					}
				}
				// last line
				if (nChars > 0) {
					nLines++;
					if (!empty) {
						nNotEmptyLines++;
					}
				}
				inputStream.close();
				// MoDiscoLogger.logInfo("NonEmptyLines : " + context.getName()
				// + " " + (System.currentTimeMillis() - before) + "ms",
				// Activator.getDefault());
				count = new Count(nChars, nLines, nNotEmptyLines, file.lastModified());
				this.cache.put(file, count);
				return count;
			}
		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		return null;
	}
}
