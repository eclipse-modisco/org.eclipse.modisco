/**
 * Copyright (c) 2009, 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.infra.common.cdo.server;

import java.util.Map;

import javax.sql.DataSource;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.server.CDOServerUtil;
import org.eclipse.emf.cdo.server.IRepository;
import org.eclipse.emf.cdo.server.IStore;
import org.eclipse.emf.cdo.server.db.CDODBUtil;
import org.eclipse.emf.cdo.server.db.mapping.IMappingStrategy;
import org.eclipse.emf.cdo.server.net4j.CDONet4jServerUtil;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.modisco.infra.common.cdo.internal.Activator;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.acceptor.IAcceptor;
import org.eclipse.net4j.db.DBUtil;
import org.eclipse.net4j.db.IDBAdapter;
import org.eclipse.net4j.db.IDBConnectionProvider;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.lifecycle.LifecycleUtil;
import org.eclipse.net4j.util.om.OMPlatform;
import org.eclipse.net4j.util.om.log.PrintLogHandler;
import org.eclipse.net4j.util.om.trace.PrintTraceHandler;

public abstract class AbstractCDOServer implements Server {

	protected static final int CURRENT_LRU_CAPACITY = 100000;
	protected static final int REVISED_LRU_CAPACITY = 10000;
	private static final String DB_NAME_PREFIX = "db"; //$NON-NLS-1$
	private static final int PORT = 2036;
	public static final String REPOSITORY_NAME = "repo1"; //$NON-NLS-1$
	public static final String HOSTNAME = "localhost"; //$NON-NLS-1$

	private IAcceptor acceptor;
	private IRepository repository;
	private Thread thread;

	private boolean started = false;

	public Object start(final IApplicationContext context) throws Exception {
		start(AbstractCDOServer.DB_NAME_PREFIX + System.currentTimeMillis(), AbstractCDOServer.PORT);
		while (true) {
			Thread.sleep(Long.MAX_VALUE);
		}
	}

	protected synchronized void setStarted(final boolean started) {
		this.started = started;
		notify();
	}

	public synchronized boolean isStarted() {
		return this.started;
	}

	public void start(final String dbName, final int port) throws Exception {
		this.thread = new Thread() {
			@Override
			public void run() {
				try {
					Net4jUtil.prepareContainer(IPluginContainer.INSTANCE);
					TCPUtil.prepareContainer(IPluginContainer.INSTANCE);
					CDONet4jServerUtil.prepareContainer(IPluginContainer.INSTANCE);

					OMPlatform.INSTANCE.addLogHandler(PrintLogHandler.CONSOLE);
					OMPlatform.INSTANCE.addTraceHandler(PrintTraceHandler.CONSOLE);
					OMPlatform.INSTANCE.setDebugging(true);
					DataSource dataSource = getDataSource(dbName);
					IMappingStrategy mappingStrategy = getMappingStrategy();
					IDBAdapter dbAdapter = getDBAdapter();
					IDBConnectionProvider dbConnectionProvider = DBUtil
							.createConnectionProvider(dataSource);
					IStore store = CDODBUtil.createStore(mappingStrategy, dbAdapter,
							dbConnectionProvider);

					Map<String, String> props = getProps();

					IRepository repositoryLocal = CDOServerUtil.createRepository(
							AbstractCDOServer.REPOSITORY_NAME, store, props);
					setRepository(repositoryLocal);
					// CDORevisionCache cache = getCache();
					// if (cache != null) {
					// IRevisionManager iRevisionManager =
					// AbstractCDOServer.this
					// .getRepository().getRevisionManager();
					// iRevisionManager.setCache(cache);
					// }
					CDOServerUtil.addRepository(IPluginContainer.INSTANCE, repositoryLocal);
					IAcceptor acceptorLocal = startAcceptor(port);
					setAcceptor(acceptorLocal);
					setStarted(true);
				} catch (Exception e) {
					MoDiscoLogger.logError(e, Activator.getDefault());
				}
			}

			private IAcceptor startAcceptor(final int portParameter) {
				return (IAcceptor) IPluginContainer.INSTANCE.getElement(
						"org.eclipse.net4j.acceptors", //$NON-NLS-1$
						"tcp", "0.0.0.0:" + portParameter); //$NON-NLS-1$ //$NON-NLS-2$

				// return (IAcceptor) IPluginContainer.INSTANCE.getElement(
				//						"org.eclipse.net4j.acceptors", "tcp", null); //$NON-NLS-1$ //$NON-NLS-2$
			}
		};
		this.thread.start();
	}

	public void stop() {
		Activator.getDefault().getLog()
				.log(new Status(IStatus.INFO, Activator.PLUGIN_ID, "Stopping the CDO server.")); //$NON-NLS-1$
		this.thread.interrupt();
		LifecycleUtil.deactivate(getAcceptor());
		LifecycleUtil.deactivate(getRepository());

		Activator.getDefault().getLog()
				.log(new Status(IStatus.INFO, Activator.PLUGIN_ID, "The CDO server is stopped.")); //$NON-NLS-1$
	}

	protected abstract Map<String, String> getProps();

	protected abstract IMappingStrategy getMappingStrategy();

	protected abstract DataSource getDataSource(final String dbName) throws Exception;

	protected abstract IDBAdapter getDBAdapter();

	public void setRepository(final IRepository repository) {
		this.repository = repository;
	}

	public IRepository getRepository() {
		return this.repository;
	}

	public void setAcceptor(final IAcceptor acceptor) {
		this.acceptor = acceptor;
	}

	public IAcceptor getAcceptor() {
		return this.acceptor;
	}

}
