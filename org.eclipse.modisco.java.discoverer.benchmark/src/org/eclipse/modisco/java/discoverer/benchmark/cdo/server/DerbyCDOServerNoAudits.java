/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 */
package org.eclipse.modisco.java.discoverer.benchmark.cdo.server;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.cdo.server.IRepository;
import org.eclipse.emf.cdo.server.db.CDODBUtil;
import org.eclipse.emf.cdo.server.db.mapping.IMappingStrategy;
import org.eclipse.modisco.infra.common.cdo.derby.DerbyCDOServer;

public class DerbyCDOServerNoAudits extends DerbyCDOServer {

	@Override
	protected Map<String, String> getProps() {
		Map<String, String> props = super.getProps();
		props.put(IRepository.Props.SUPPORTING_AUDITS, Boolean.FALSE.toString());
		return props;
	}

	@Override
	protected IMappingStrategy getMappingStrategy() {
		IMappingStrategy mappingStrategy = CDODBUtil.createHorizontalMappingStrategy(false);

		Map<String, String> properties = new HashMap<String, String>();
		properties.put(IMappingStrategy.PROP_QUALIFIED_NAMES, "true"); //$NON-NLS-1$
		mappingStrategy.setProperties(properties);

		return mappingStrategy;
	}

	@Override
	public String getDescription() {
		return "Derby, NOT_SUPPORTING_AUDITS"; //$NON-NLS-1$
	}
}
