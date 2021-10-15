/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *     Fabien Giquel (Mia-Software) - Bug 342856 - improve Discoverers implementation
 *    Fabien Giquel (Mia-software) - Bug 346228 - Compilation regression on Java Discoverer based on CDO (Indigo RC1)
 */
package org.eclipse.modisco.java.discoverer.cdo;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.net4j.CDOSessionConfiguration;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.common.cdo.server.AbstractCDOServer;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.internal.io.java.JavaReader;
import org.eclipse.modisco.java.emf.JavaFactory;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.tcp.ITCPConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.om.OMPlatform;
import org.eclipse.net4j.util.om.log.PrintLogHandler;
import org.eclipse.net4j.util.om.trace.PrintTraceHandler;

public class JavaDiscovererCDO extends DiscoverJavaModelFromJavaProject {

	private final String cacheType = JavaDiscovererCDO.LRU_CACHE;
	private int port = JavaDiscovererCDO.DEFAULT_PORT_VALUE;
	public static final int DEFAULT_LRU_CAPACITY = 1000;
	public static final int DEFAULT_PORT_VALUE = 2036;
	public static final String LRU_CACHE = "LRU_CACHE"; //$NON-NLS-1$
	public static final String DEFAULT_CACHE = "DEFAULT_CACHE"; //$NON-NLS-1$
	public static final String MEM_CACHE = "MEM_CACHE"; //$NON-NLS-1$
	public static final String TWO_LEVEL_CACHE = "TWO_LEVEL_CACHE"; //$NON-NLS-1$
	public static final String CDO_CACHE_TYPE = "CDO_CACHE_TYPE"; //$NON-NLS-1$
	public static final String CURRENT_LRU_CAPACITY = "CURRENT_LRU_CAPACITY"; //$NON-NLS-1$
	public static final String REVISED_LRU_CAPACITY = "REVISED_LRU_CAPACITY"; //$NON-NLS-1$
	public static final String CDO_VERSION = "CDO_VERSION"; //$NON-NLS-1$
	public static final String CDO_SERVER_DESCRIPTION = "CDO_SERVER_DESCRIPTION"; //$NON-NLS-1$
	public static final int LRU_CAPACITY_CURRENT = 100000;
	public static final int LRU_CAPACITY_REVISED = 100;

	private static Map<CDOView, ITCPConnector> connectors = new HashMap<CDOView, ITCPConnector>();

	@Override
	protected void endAnalyzeJavaProject(final Model model) {
		JavaDiscovererCDO.close(model.eResource(), true);
	}

	public static void close(final Resource resource, final boolean commit) {
		if (resource instanceof CDOResource) {
			CDOResource cdoRessource = (CDOResource) resource;
			CDOView cdoView = cdoRessource.cdoView();
			if (commit) {
				if (cdoView instanceof CDOTransaction) {
					CDOTransaction cdoTransaction = (CDOTransaction) cdoView;
					try {
						cdoTransaction.commit();
					} catch (CommitException e) {
						MoDiscoLogger.logError(e, Activator.getDefault());
					}
				}
			}
			CDOSession cdoSession = cdoView.getSession();
			ITCPConnector connector = JavaDiscovererCDO.connectors.get(cdoView);
			cdoView.close();
			if (cdoSession != null) {
				cdoSession.close();
			}
			if (connector != null) {
				connector.close();
			}
			JavaDiscovererCDO.connectors.remove(cdoView);
		}
	}

	@Override
	protected Resource createTargetModel() {
		String resourceName2 = "" + System.currentTimeMillis(); //$NON-NLS-1$
		IStatus status = new Status(IStatus.INFO, Activator.PLUGIN_ID,
				"Resource name=" + resourceName2); //$NON-NLS-1$
		Activator.getDefault().getLog().log(status);
		EPackage ePackage = getEFactory().getEPackage();
		if (ePackage == null) {
			throw new RuntimeException("ePackage is null. this.getEFactory()=" //$NON-NLS-1$
					+ getEFactory());
		}
		CDOResource result = JavaDiscovererCDO.getOrCreateCDOResource(resourceName2, ePackage,
				this.cacheType, this.port);
		dbInit(result);
		setTargetModel(result);
		return result;
	}

	@SuppressWarnings("unused") // see commented code for Bug 329887
	public static CDOResource getOrCreateCDOResource(final String resourceName,
			final EPackage ePackage, final String cacheType, final int port) {
		CDOResource resource = null;
		// Enable logging and tracing
		OMPlatform.INSTANCE.setDebugging(true);
		OMPlatform.INSTANCE.addLogHandler(PrintLogHandler.CONSOLE);
		OMPlatform.INSTANCE.addTraceHandler(PrintTraceHandler.CONSOLE);

		// Prepare container
		IManagedContainer container = ContainerUtil.createContainer();
		// Register Net4j factories
		Net4jUtil.prepareContainer(container);
		// Register TCP factories
		TCPUtil.prepareContainer(container);
		// Register CDO factories
		Net4jUtil.prepareContainer(container);
		container.activate();
		// Create connector
		ITCPConnector connector = TCPUtil.getConnector(container, AbstractCDOServer.HOSTNAME
				+ ":" + port); //$NON-NLS-1$
		// Create configuration

		CDOSessionConfiguration configuration = CDONet4jUtil.createSessionConfiguration();
		configuration.setConnector(connector);
		configuration.setRepositoryName(AbstractCDOServer.REPOSITORY_NAME);

		// Open session
		CDOSession session;
		try {
			session = configuration.openSession();
		} catch (org.eclipse.net4j.channel.ChannelException e) {
			if (e.getCause() instanceof org.eclipse.net4j.util.concurrent.TimeoutRuntimeException) {
				MoDiscoLogger.logError(
						"If you are using the JavaDiscovererCDO in a unit test, the CDO may be " //$NON-NLS-1$
								+ "not already started. You should increase the org.eclipse" //$NON-NLS-1$
								+ ".modisco.java.discoverer.tests.cdo.server.AbstractCDOServer." //$NON-NLS-1$
								+ "SLEEP_TIME_AFTER_LAUNCHE constant", //$NON-NLS-1$
						Activator.getDefault());
			}
			throw e;
		}
		session.getPackageRegistry().putEPackage(ePackage);

		// Open transaction
		CDOTransaction transaction = session.openTransaction();
		// Get or create resource
		JavaDiscovererCDO.connectors.put(transaction, connector);
		String resourcePath = "/" + resourceName; //$NON-NLS-1$
		IStatus status = new Status(IStatus.INFO, Activator.PLUGIN_ID, resourcePath);
		Activator.getDefault().getLog().log(status);
		resource = transaction.getOrCreateResource(resourcePath);
		return resource;
	}

	@Override
	public JavaFactory getEFactory() {
		org.eclipse.modisco.java.cdo.impl.JavaPackageImpl.init();
		return org.eclipse.modisco.java.cdo.meta.JavaFactory.eINSTANCE;
	}

	private static void dbInit(final CDOResource resource) {
		CDOView cdoView = resource.cdoView();
		if (cdoView instanceof CDOTransaction) {
			CDOTransaction cdoTransaction = (CDOTransaction) cdoView;
			try {
				cdoTransaction.commit();
			} catch (CommitException e) {
				throw new RuntimeException(e);
			}
		}
	}

	@Override
	protected JavaReader getJavaReader(final Map<String, Object> elementOptions) {
		JavaReader javaReader = new JavaReader(getEFactory(), null, null) {
			@Override
			protected void reset() {
				getGlobalBindings().resolveBindings(getResultModel());
				if (getResultModel() instanceof CDOObject) {
					CDOObject cdoObject = (CDOObject) getResultModel();
					CDOView cdoView = cdoObject.cdoView();
					if (cdoView instanceof CDOTransaction) {
						CDOTransaction cdoTransaction = (CDOTransaction) cdoView;
						try {
							cdoTransaction.commit();
						} catch (CommitException e) {
							throw new RuntimeException(e);
						}
					}
				}
				setGlobalBindings(getBindingManager());
			}
		};
		javaReader.setIncremental(true);
		return javaReader;
	}

	public void setPort(final int port) {
		this.port = port;
	}

	public int getPort() {
		return this.port;
	}

}
