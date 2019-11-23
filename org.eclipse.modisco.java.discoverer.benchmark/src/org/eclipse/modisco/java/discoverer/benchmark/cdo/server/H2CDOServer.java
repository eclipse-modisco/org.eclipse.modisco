/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *     Stephane Rousseau (Mia-Software) - Bug 339695 - H2 support in MoDisco Java discoverer benchmarks
 *     Nicolas Bros (Mia-Software) - Bug 342272 - [Junit] timeout in Java benchmark : CDO server doesn't start
 */
package org.eclipse.modisco.java.discoverer.benchmark.cdo.server;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.server.IRepository;
import org.eclipse.emf.cdo.server.db.CDODBUtil;
import org.eclipse.emf.cdo.server.db.mapping.IMappingStrategy;
import org.eclipse.modisco.infra.common.cdo.server.AbstractCDOServer;
import org.eclipse.net4j.db.IDBAdapter;
import org.eclipse.net4j.db.h2.H2Adapter;

public class H2CDOServer extends AbstractCDOServer {

	@Override
	protected DataSource getDataSource(final String dbName) throws Exception {
		org.h2.jdbcx.JdbcDataSource dataSource = new org.h2.jdbcx.JdbcDataSource();
		try {
			IProject project = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(dbName);
			project.create(new NullProgressMonitor());
			if (!project.exists()) {
				throw new CoreException(new Status(IStatus.ERROR,
						"org.eclipse.gmt.modisco.infra.common.cdo.h2", "Failed to create the DB project")); //$NON-NLS-1$  //$NON-NLS-2$
			}

			dataSource.setURL("jdbc:h2:file:" + project.getLocation().toString() + "/h2DB"); //$NON-NLS-1$ //$NON-NLS-2$

		} catch (Exception e) {
			throw new Exception("Failed to use the workspace.", e); //$NON-NLS-1$
		}
		return dataSource;
	}


	@Override
	protected Map<String, String> getProps() {
		Map<String, String> props = new HashMap<String, String>();
		props.put(IRepository.Props.OVERRIDE_UUID, "gastro"); //$NON-NLS-1$
		props.put(IRepository.Props.SUPPORTING_AUDITS, Boolean.TRUE.toString());
		// props.put(IRepository.Props.VERIFYING_REVISIONS, Boolean.FALSE
		// .toString());
		// TODO Bug 329887
		// props.put(IRepository.Props.CURRENT_LRU_CAPACITY, Integer
		// .toString(CURRENT_LRU_CAPACITY));
		// props.put(IRepository.Props.REVISED_LRU_CAPACITY, Integer
		// .toString(REVISED_LRU_CAPACITY));
		return props;
	}

	@Override
	protected IMappingStrategy getMappingStrategy() {
		IMappingStrategy mappingStrategy = CDODBUtil.createHorizontalMappingStrategy(true);
		Map<String, String> properties = new HashMap<String, String>();
		properties.put(IMappingStrategy.PROP_QUALIFIED_NAMES, "true"); //$NON-NLS-1$
		mappingStrategy.setProperties(properties);
		return mappingStrategy;
	}

	public String getDescription() {
		return "H2, SUPPORTING_AUDITS"; //$NON-NLS-1$
	}

	@Override
	protected IDBAdapter getDBAdapter() {
		return new H2Adapter();
	}

}
