/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.infra.common.cdo.derby;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.derby.jdbc.EmbeddedDataSource;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.server.IRepository;
import org.eclipse.emf.cdo.server.db.CDODBUtil;
import org.eclipse.emf.cdo.server.db.mapping.IMappingStrategy;
import org.eclipse.modisco.infra.common.cdo.derby.internal.Activator;
import org.eclipse.modisco.infra.common.cdo.server.AbstractCDOServer;
import org.eclipse.net4j.db.IDBAdapter;
import org.eclipse.net4j.db.derby.EmbeddedDerbyAdapter;

public class DerbyCDOServer extends AbstractCDOServer {

	@Override
	protected DataSource getDataSource(final String dbName) throws Exception {
		EmbeddedDataSource dataSource = new EmbeddedDataSource();
		try {
			IProject project = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(dbName);
			project.create(new NullProgressMonitor());
			if (!project.exists()) {
				throw new CoreException(new Status(IStatus.ERROR,
						Activator.PLUGIN_ID, "Failed to create the DB project")); //$NON-NLS-1$
			}
			dataSource.setDatabaseName(project.getLocation().toString()
					+ "/derbyDB"); //$NON-NLS-1$
		} catch (Exception e) {
			// MoDiscoLogger
			// .logWarning(
			//							"Failed to use the workspace, tmpdir will be used", Activator //$NON-NLS-1$
			// .getDefault());
			//			String javaIoTmpdirStr = System.getProperty("java.io.tmpdir"); //$NON-NLS-1$
			// dataSource.setDatabaseName(javaIoTmpdirStr + dbName);
			throw new Exception("Failed to use the workspace.", e); //$NON-NLS-1$
		}
		dataSource.setCreateDatabase("create"); //$NON-NLS-1$
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
		IMappingStrategy mappingStrategy = CDODBUtil
				.createHorizontalMappingStrategy(true);
		Map<String, String> properties = new HashMap<String, String>();
		properties.put(IMappingStrategy.PROP_QUALIFIED_NAMES, "true"); //$NON-NLS-1$
		mappingStrategy.setProperties(properties);
		return mappingStrategy;
	}

	public String getDescription() {
		return "Derby, SUPPORTING_AUDITS"; //$NON-NLS-1$
	}

	@Override
	protected IDBAdapter getDBAdapter() {
		return new EmbeddedDerbyAdapter();
	}

}
