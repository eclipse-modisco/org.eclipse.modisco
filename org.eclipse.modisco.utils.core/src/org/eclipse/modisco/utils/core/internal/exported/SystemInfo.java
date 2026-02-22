/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software, and INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Guillaume Doux (INRIA) - refactoring and move to a separate plug-in
 *    Gr�goire Dup� (Mia-Software) - Bug 482715 - NumberFormatException in SystemInfo.computeInfo (180)
 *******************************************************************************/
package org.eclipse.modisco.utils.core.internal.exported;

import java.io.IOException;

/**
 * Class providing information about the system that are not provided internally by JAVA
 *
 */
@Deprecated /* @deprecated use org.eclipse.modisco.utils.core.internal.SystemInfo */
public final class SystemInfo
{
	private static SystemInfo instance2 = new SystemInfo();
	private static org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.SystemInfo instance = null;

	/**
	 * Getter for the system architecture
	 * @return the architecture (String)
	 */
	@Deprecated
	public String getArch() {
		return instance.getArch();
	}

	/**
	 * Getter providing the total amount of memory in the system
	 * @return the amount of memory (String)
	 */
	@Deprecated
	public String getMemory() {
		return instance.getMemory();
	}

	/**
	 * Getter providing the number of processors (or core) in the system
	 * @return the number of processors (String)
	 */
	@Deprecated
	public int getnProcessors() {
		return instance.getnProcessors();
	}

	/**
	 * Getter providing the operating system name
	 * @return the OS name (String)
	 */
	@Deprecated
	public String getOsName() {
		return instance.getOsName();
	}

	/**
	 * Getter providing the operating system version
	 * @return the OS version (String)
	 */
	@Deprecated
	public String getOsVersion() {
		return instance.getOsVersion();
	}

	/**
	 * Getter providing the description of the CPU
	 * @return the processor description (String)
	 */
	@Deprecated
	public String getProcDescription() {
		return instance.getProcDescription();
	}

	/**
	 * Getter providing the size of the CPU cache memory
	 * @return the size of cache (String)
	 */
	@Deprecated
	public String getProcCacheSize() {
		return instance.getProcCacheSize();
	}

	/**
	 * Getter providing the processor name
	 * @return the processor name (String)
	 */
	@Deprecated
	public String getProcName() {
		return instance.getProcName();
	}

	/**
	 * @return an instance of SystemInfo
	 * @throws IOException
	 *             in case of error retrieving system information
	 */
	@Deprecated
	public static synchronized SystemInfo getInstance() throws IOException {
		if (instance == null) {
			instance = org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.SystemInfo.getInstance();
		}
		return instance2;
	}
}
