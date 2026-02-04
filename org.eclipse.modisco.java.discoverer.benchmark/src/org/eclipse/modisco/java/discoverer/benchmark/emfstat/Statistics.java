/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Romain Dervaux (Mia-Software)
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *    Stephane Rousseau (Mia-Software) - Bug 339695 - H2 support in MoDisco Java discoverer benchmarks
 *******************************************************************************/

package org.eclipse.modisco.java.discoverer.benchmark.emfstat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.java.discoverer.benchmark.Activator;

import com.ibm.icu.text.SimpleDateFormat;

public class Statistics {
	private static final int DEFAULT_SINCE_BEGIN = 1000;
	private static final int MEGA_BYTES = 1024;
	// implements JavaDiscovererListener{
	private static final long GC_SLEEP = 50;
	// private static final String MAX_FREE_MEMORY = "MAX_FREE_MEMORY";
	// private static final String MIN_FREE_MEMORY = "MIN_FREE_MEMORY";
	private static final String FREE_MEMORY = "FREE_MEMORY (Mo)"; //$NON-NLS-1$
	public static final String MAX_TOTAL_MEMORY = "MAX_TOTAL_MEMORY"; //$NON-NLS-1$
	// private static final String MIN_TOTAL_MEMORY = "MIN_TOTAL_MEMORY";
	private static final String MAX_PENDING_SIZE = "MAX_PENDING_SIZE"; //$NON-NLS-1$
	// private static final String MIN_PENDING_SIZE = "MIN_PENDING_SIZE";
	private static final String NB_COMPILATION_UNITS = "NB_COMPILATION_UNITS"; //$NON-NLS-1$
	private static final String CURRENT_PENDING_SIZE = "CURRENT_PENDING_SIZE"; //$NON-NLS-1$
	private static final String NB_LINES = "NB_LINES"; //$NON-NLS-1$
	private static final String MAX_TARGET_SIZE = "NB_LINES"; //$NON-NLS-1$
	// private static final String MIN_TARGET_SIZE = "MIN_TARGET_SIZE";
	private static final String CURRENT_TARGET_SIZE = "CURRENT_TARGET_SIZE"; //$NON-NLS-1$
	public static final String SINCEBEGIN = "SINCEBEGIN (ms)"; //$NON-NLS-1$
	private static final String DEBUG = "DEBUG"; //$NON-NLS-1$
	private static final String NB_ELEMENTS = "NB_ELEMENT"; //$NON-NLS-1$
	public static final String SAVE = "SAVE (ms)"; //$NON-NLS-1$
	private static final String TOTAL_RESOLVE = "TOTAL_RESOLVE"; //$NON-NLS-1$
	private static final String DISCOVERY = "DISCOVERY"; //$NON-NLS-1$
	private static final String FINAL_RESOLVE = "FINAL_RESOLVE"; //$NON-NLS-1$
	public static final String USED_MEMORY = "USED_MEMORY"; //$NON-NLS-1$
	public static final String DEBUG_CODE = "DEBUG_CODE"; //$NON-NLS-1$
	private static final String EXEC_DURATION = "EXEC_DURATION"; //$NON-NLS-1$
	private long nbOfReadLines = 0;
	// private CDOTransaction transaction;
	private long beginSave = 0;
	private long beginFinalResolve = 0;
	private long beginResolve;
	private final String statisticId;
	private PrintStream ps;
	private final HashMap<String, Integer> messageMap = new HashMap<String, Integer>();
	private Long end = null;
	private Long beginDiscovery = null;
	private Long begin = null;
	private File statisticsDir;
	private PrintStream txtPrintStream;
	private static Statistics singleton;
	private static HashMap<String, Statistics> instanceMap = new HashMap<String, Statistics>();
	private static HashMap<String, Object> statisticMap = new HashMap<String, Object>();
	private long beginInit = 0;
	private File txtFile;
	public static final String INIT_TIME = "INIT_TIME"; //$NON-NLS-1$
	public static final String TSV_FILE_EXT = "tsv"; //$NON-NLS-1$
	public static final String PROPERTIES_FILE_EXT = "txt"; //$NON-NLS-1$

	public Statistics(final String id) {
		this.statisticId = id;
		String javaIoTmpdirStr = System.getProperty("java.io.tmpdir"); //$NON-NLS-1$
		File javaIoTmpdir = new File(javaIoTmpdirStr);
		setStatisticsDir(new File(javaIoTmpdir, "statistics")); //$NON-NLS-1$
		getStatisticsDir().mkdirs();
		initPrinitStream();
	}

	public Statistics(final String id, final File directory) {
		this.statisticId = id;
		directory.mkdirs();
		setStatisticsDir(directory);
		initPrinitStream();
	}

	private void initPrinitStream() {
		File tsvFile = new File(getStatisticsDir(), this.statisticId
				+ "." + Statistics.TSV_FILE_EXT); //$NON-NLS-1$
		this.txtFile = new File(getStatisticsDir(), this.statisticId
				+ "." + Statistics.PROPERTIES_FILE_EXT); //$NON-NLS-1$
		Status status = new Status(IStatus.INFO, Activator.PLUGIN_ID,
				"TSV statistic file= " + tsvFile.toString()); //$NON-NLS-1$
		Activator.getDefault().getLog().log(status);
		Status status2 = new Status(IStatus.INFO, Activator.PLUGIN_ID,
				"TXT statistic file= " + this.txtFile.toString()); //$NON-NLS-1$
		Activator.getDefault().getLog().log(status2);
		try {
			this.ps = new PrintStream(tsvFile);
			this.txtPrintStream = new PrintStream(this.txtFile);
		} catch (FileNotFoundException e) {
			Status status3 = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status3);
		}
	}

	public static Statistics getStatistics(final String key) {
		if (Statistics.instanceMap.containsKey(key)) {
			return Statistics.instanceMap.get(key);
		}
		Statistics statistics = new Statistics(key);
		Statistics.instanceMap.put(key, statistics);
		return statistics;
	}

	public static Statistics getStatistics(final String key, final File directory) {
		if (Statistics.instanceMap.containsKey(key)) {
			return Statistics.instanceMap.get(key);
		}
		Statistics statistics = new Statistics(key, directory);
		Statistics.instanceMap.put(key, statistics);
		return statistics;
	}

	public void reset() {
		// statisticMap.put(MAX_FREE_MEMORY, new Long(0));
		// statisticMap.put(MIN_FREE_MEMORY, Long.MAX_VALUE);
		Statistics.statisticMap.put(Statistics.FREE_MEMORY, new Long(0));
		Statistics.statisticMap.put(Statistics.MAX_TOTAL_MEMORY, new Long(0));
		// statisticMap.put(MIN_TOTAL_MEMORY, Long.MAX_VALUE);
		// statisticMap.put(MIN_PENDING_SIZE, Long.MAX_VALUE);
		Statistics.statisticMap.put(Statistics.MAX_PENDING_SIZE, new Long(0));
		Statistics.statisticMap.put(Statistics.CURRENT_PENDING_SIZE, new Long(0));
		Statistics.statisticMap.put(Statistics.NB_COMPILATION_UNITS, new Long(0));
		Statistics.statisticMap.put(Statistics.NB_LINES, new Long(0));
		Statistics.statisticMap.put(Statistics.MAX_TARGET_SIZE, new Long(0));
		// statisticMap.put(MIN_TARGET_SIZE, Long.MAX_VALUE);
		Statistics.statisticMap.put(Statistics.CURRENT_TARGET_SIZE, new Long(0));
		Statistics.statisticMap.put(Statistics.SAVE, new Long(0));
		Statistics.statisticMap.put(Statistics.EXEC_DURATION, new Long(0));
		Statistics.statisticMap.put(Statistics.TOTAL_RESOLVE, new Long(0));
		Statistics.statisticMap.put(Statistics.USED_MEMORY, new Long(0));
		Statistics.statisticMap.put(Statistics.DEBUG_CODE, new Long(0));
		Statistics.statisticMap.put(Statistics.DISCOVERY, new Long(0));
		Statistics.statisticMap.put(Statistics.FINAL_RESOLVE, new Long(0));
		Statistics.statisticMap.put(Statistics.NB_ELEMENTS, new Long(0));
		Statistics.statisticMap.put(Statistics.DEEP_REMOVE, new Long(0));
		Statistics.statisticMap.put(Statistics.MESSAGE, ""); //$NON-NLS-1$
		this.nbOfReadLines = 0;
		this.beginSave = 0;
		this.beginFinalResolve = 0;
		this.beginResolve = 0;
		this.begin = null;
		this.end = null;
		this.beginDiscovery = null;

		// new Thread() {
		// @Override
		// public void run() {
		// try {
		//					String[] cmd = new String[] { "explorer", //$NON-NLS-1$
		// Statistics.this.getStatisticsDir().toString() };
		// Runtime.getRuntime().exec(cmd);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }
		// };

	}

	private static void recordMemory() {
		Runtime.getRuntime().gc();
		try {
			Thread.sleep(Statistics.GC_SLEEP);
		} catch (InterruptedException e) {
			MoDiscoLogger.logError(e,
					org.eclipse.modisco.java.discoverer.benchmark.Activator.getDefault());
		}
		long freememory = Runtime.getRuntime().freeMemory() / Statistics.MEGA_BYTES
				/ Statistics.MEGA_BYTES;
		Statistics.statisticMap.put(Statistics.FREE_MEMORY, freememory);
		long totalmemory = Runtime.getRuntime().totalMemory() / Statistics.MEGA_BYTES
				/ Statistics.MEGA_BYTES;
		Long maxtotalmemory = (Long) Statistics.statisticMap.get(Statistics.MAX_TOTAL_MEMORY);
		if (maxtotalmemory == null) {
			maxtotalmemory = new Long(0);
		}
		maxtotalmemory = Math.max(maxtotalmemory, totalmemory);
		Statistics.statisticMap.put(Statistics.MAX_TOTAL_MEMORY, maxtotalmemory);
		Statistics.statisticMap.put(Statistics.USED_MEMORY, totalmemory - freememory);
	}

	public static void recordPendingSize(final List<Object> list) {
		long currentPendingSize = list.size();
		long maxPendingSize = (Long) Statistics.statisticMap.get(Statistics.MAX_PENDING_SIZE);
		Statistics.statisticMap.put(Statistics.MAX_PENDING_SIZE,
				Math.max(maxPendingSize, currentPendingSize));
		Statistics.statisticMap.put(Statistics.CURRENT_PENDING_SIZE, currentPendingSize);
	}

	public static void recordTargetSize(final Map<Object, Object> map) {
		Long currentTargetSize = new Long(map.size());
		Long maxTargetSize = (Long) Statistics.statisticMap.get(Statistics.MAX_TARGET_SIZE);
		Statistics.statisticMap.put(Statistics.MAX_TARGET_SIZE,
				Math.max(maxTargetSize, currentTargetSize));
		Statistics.statisticMap.put(Statistics.CURRENT_TARGET_SIZE, currentTargetSize);
	}

	public String tabKeyReport() {
		recordMemory();
		sinceBegin();
		debug(""); //$NON-NLS-1$
		StringBuffer sbKey = new StringBuffer();
		Iterator<String> it = Statistics.statisticMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			sbKey.append(key + "\t"); //$NON-NLS-1$
		}
		String result = sbKey.toString();
		this.ps.println(result);
		return result;
	}

	public String tabValueReport(final String message) {
		debug(message);
		return tabValueReport();
	}

	public void sinceBegin() {
		Long result;
		if (this.begin != null) {
			if (this.end != null) {
				result = this.end - this.begin;
			} else {
				result = new Date().getTime() - this.begin;
			}
		} else {
			result = new Long(-Statistics.DEFAULT_SINCE_BEGIN);
		}
		Statistics.statisticMap.put(Statistics.SINCEBEGIN, result);
	}

	// public PrintStream getPS() {
	// return this.txtPrintStream;
	// }

	public void printProperty(final String key, final String value) {
		this.txtPrintStream.println(key + "=" + value); //$NON-NLS-1$
	}

	public void debug(final String message) {
		int debugCode;
		if (this.messageMap.containsKey(message)) {
			debugCode = this.messageMap.get(message);
		} else {
			int size = this.messageMap.size();
			debugCode = size;
			this.messageMap.put(message, debugCode);
		}
		Statistics.statisticMap.put(Statistics.DEBUG, message);
		Statistics.statisticMap.put(Statistics.DEBUG_CODE, debugCode);
	}

	public String tabValueReport() {
		// tabKeyReport();
		recordMemory();
		sinceBegin();
		StringBuffer sbValue = new StringBuffer();
		Iterator<String> it = Statistics.statisticMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			sbValue.append(Statistics.statisticMap.get(key) + "\t"); //$NON-NLS-1$
		}
		String result = sbValue.toString();
		this.ps.println(result);
		return result;
	}

	public void newCompilationUnit(final ITypeRoot cu) {
		incCompilationUnits();
		IPath location = cu.getResource().getLocation();
		File file = location.toFile();
		int nbLines = 0;
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader(file));
			while (bufferReader.readLine() != null) {
				nbLines++;
			}
			bufferReader.close();
		} catch (Exception e) {
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					"Failed to count the CompilationUnit number of lines: ", e); //$NON-NLS-1$
			Activator.getDefault().getLog().log(status);
		}
		this.nbOfReadLines = this.nbOfReadLines + nbLines;
		Statistics.statisticMap.put(Statistics.NB_LINES, this.nbOfReadLines);
		this.tabValueReport("New cu"); //$NON-NLS-1$
	}

	public void countElements(final Resource r) {
		this.tabValueReport("begin count elements"); //$NON-NLS-1$
		long nbElements = 0;
		TreeIterator<EObject> treeIter = r.getAllContents();
		while (treeIter.hasNext()) {
			treeIter.next();
			nbElements++;
		}
		Statistics.statisticMap.put(Statistics.NB_ELEMENTS, nbElements);
		this.tabValueReport("end count elements"); //$NON-NLS-1$
	}

	public void getMemoryInfo() {
		// Nothing
	}

	public void begin() {
		try {
			this.properties.store(this.txtPrintStream, ""); //$NON-NLS-1$
		} catch (IOException e) {
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		}
		reset();
		tabKeyReport();
		this.begin = new Date().getTime();
		this.tabValueReport("Begin job"); //$NON-NLS-1$
	}

	public void end() {
		this.end = new Date().getTime();
		this.tabValueReport("end"); //$NON-NLS-1$
		try {
			this.txtPrintStream = new PrintStream(this.txtFile);
			this.properties.store(this.txtPrintStream, ""); //$NON-NLS-1$
		} catch (IOException e) {
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		}
		this.ps.close();
		this.txtPrintStream.close();
	}

	public void beginDiscovery() {
		this.beginDiscovery = new Date().getTime();
		this.tabValueReport("Ressource created and dicovery begining"); //$NON-NLS-1$
	}

	public void endDiscovery() {
		Statistics.statisticMap.put(Statistics.DISCOVERY, new Date().getTime()
				- this.beginDiscovery);
		this.tabValueReport("Dicovery finished"); //$NON-NLS-1$
	}

	public void beginSave() {
		this.beginSave = new Date().getTime();
		this.tabValueReport("Begin save"); //$NON-NLS-1$
	}

	public void endSave() {
		long save = (Long) Statistics.statisticMap.get(Statistics.SAVE);
		Statistics.statisticMap
				.put(Statistics.SAVE, save + (new Date().getTime() - this.beginSave));
		this.tabValueReport("End save"); //$NON-NLS-1$
	}

	public void beginFinalResolve() {
		this.beginFinalResolve = new Date().getTime();
		this.tabValueReport("beginFinalResolve"); //$NON-NLS-1$
	}

	public void endFinalResolve() {
		long endFinalResolve = new Date().getTime();
		Long finalResolve = (Long) Statistics.statisticMap.get(Statistics.FINAL_RESOLVE);
		Statistics.statisticMap.put(Statistics.FINAL_RESOLVE, finalResolve
				+ (endFinalResolve - this.beginFinalResolve));
		this.tabValueReport("endFinalResolve"); //$NON-NLS-1$
	}

	public void beginResolve() {
		this.beginResolve = new Date().getTime();
	}

	public void endResolve() {
		Long endResolve = new Date().getTime();
		Long totalResolv = (Long) Statistics.statisticMap.get(Statistics.TOTAL_RESOLVE);
		Statistics.statisticMap.put(Statistics.TOTAL_RESOLVE, totalResolv
				+ (endResolve - this.beginResolve));
	}

	public static void incCompilationUnits() {
		Long nbCu = (Long) Statistics.statisticMap.get(Statistics.NB_COMPILATION_UNITS);
		nbCu++;
		Statistics.statisticMap.put(Statistics.NB_COMPILATION_UNITS, nbCu);
	}

	public static Statistics getSingleton() {
		if (Statistics.singleton == null) {
			Statistics.singleton = Statistics.getStatistics(Activator.PLUGIN_ID + "_" //$NON-NLS-1$
					+ System.currentTimeMillis());
		}
		return Statistics.singleton;
	}

	public static void resetSingleton() {
		Statistics.singleton = Statistics.getStatistics(Activator.PLUGIN_ID + "_" //$NON-NLS-1$
				+ System.currentTimeMillis());
	}

	public void newPackage(final IPackageFragment parent) {
		// Nothing
	}

	// @Override
	public void sendMessage(final Object message) {
		if (message instanceof String) {
			String stringMessage = (String) message;
			if (stringMessage.equals("Begin deep remove")) { //$NON-NLS-1$
				beginDeepRemove();
			}
		} else if (message instanceof String[]) {
			String[] message2 = (String[]) message;
			if (message2[0].equals("End deep remove")) { //$NON-NLS-1$
				endDeepRemove(message2[1]);
			}
		}

	}

	private static final String DEEP_REMOVE = "DEEP_REMOVE"; //$NON-NLS-1$
	private static final String MESSAGE = "MESSAGE"; //$NON-NLS-1$
	private long beginDeepRemove = 0;
	private final Properties properties = new Properties();

	private void beginDeepRemove() {
		this.beginDeepRemove = new Date().getTime();
	}

	private void endDeepRemove(final String objectDescription) {
		long deepRemove = (Long) Statistics.statisticMap.get(Statistics.DEEP_REMOVE);
		Statistics.statisticMap.put(Statistics.MESSAGE, objectDescription);
		Statistics.statisticMap.put(Statistics.DEEP_REMOVE, deepRemove
				+ (new Date().getTime() - this.beginDeepRemove));
		this.tabValueReport("Deep remove"); //$NON-NLS-1$

	}

	public Properties getProperties() {
		return this.properties;
	}

	public void beginInit() {
		this.beginInit = new Date().getTime();
	}

	public void endInit() {
		this.properties.put(Statistics.INIT_TIME,
				new Long(new Date().getTime() - this.beginInit).toString());

	}

	public void setStatisticsDir(final File statisticsDir) {
		this.statisticsDir = statisticsDir;
	}

	public File getStatisticsDir() {
		return this.statisticsDir;
	}

	/**
	 * Code writen from
	 * org.eclipse.ui.internal.views.log.LogView.handleExport(boolean)
	 */
	public void copyLog() {
		copyLog(this.statisticsDir);
	}

	public static void copyLog(final File statDir) {
		File platformLogFile = Platform.getLogFileLocation().toFile();
		File localLogFile = new File(statDir, "log.log"); //$NON-NLS-1$
		Reader reader = null;
		Writer writer = null;
		try {
			writer = new OutputStreamWriter(new FileOutputStream(localLogFile), "UTF-8"); //$NON-NLS-1$
			reader = new InputStreamReader(new FileInputStream(platformLogFile), "UTF-8"); //$NON-NLS-1$
			copy(reader, writer);
		} catch (Exception ex) {
			try {
				if (reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e1) { // do nothing
				MoDiscoLogger.logError(e1, Activator.getDefault());
			}
		}

	}

	/**
	 * Code copied from org.eclipse.ui.internal.views.log.LogView.copy(Reader,
	 * Writer)
	 */
	private static void copy(final Reader input, final Writer output) {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			reader = new BufferedReader(input);
			writer = new BufferedWriter(output);
			String line = reader.readLine();
			while (reader.ready() && (line != null)) {
				writer.write(line);
				writer.newLine();
				line = reader.readLine();
			}
		} catch (IOException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e1) {
				MoDiscoLogger.logError(e1, Activator.getDefault());
			}
		}
	}

	public static IProject getDefaultStatProject(final IProject sourceProject) {
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS"); //$NON-NLS-1$
		IProject localStatProject = ws.getRoot().getProject(
				"statistics_" + formatter.format(System.currentTimeMillis()) + "_" //$NON-NLS-1$ //$NON-NLS-2$
						+ sourceProject.getName());
		try {
			localStatProject.create(new NullProgressMonitor());
			localStatProject.open(new NullProgressMonitor());
		} catch (CoreException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
			localStatProject = null;
		}
		return localStatProject;
	}

}
