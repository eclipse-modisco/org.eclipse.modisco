/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.modisco.infra.discovery.catalog.DirectionKind;
import org.eclipse.modisco.infra.discovery.core.AbstractDiscoverer;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;

/**
 * Represents the parameters that will be added to the discoverer (through
 * inheritance) if the discoverer extends {@link AbstractModelDiscoverer}
 * (instead of just {@link AbstractDiscoverer}).
 */
public class AbstractModelDiscovererParameters {

	private static AbstractModelDiscovererParameters instance;
	private final List<DiscoveryParameterLine> parameters = new ArrayList<DiscoveryParameterLine>();

	public AbstractModelDiscovererParameters() {

		DiscoveryParameterLine targetModel = new DiscoveryParameterLine();
		targetModel.setName("targetModel"); //$NON-NLS-1$
		targetModel.setType("org.eclipse.emf.ecore.resource.Resource"); //$NON-NLS-1$
		targetModel
				.setDescription("A model container, usually an output of the discovery but which might be provided also as input."); //$NON-NLS-1$
		targetModel.setDirection(DirectionKind.INOUT);
		targetModel.setRequired(false);
		this.parameters.add(targetModel);

		DiscoveryParameterLine serializeTarget = new DiscoveryParameterLine();
		serializeTarget.setName("serializeTarget"); //$NON-NLS-1$
		serializeTarget.setType("boolean"); //$NON-NLS-1$
		serializeTarget
				.setDescription("A boolean indicating if some target model serialization is wished. Save behavior depends on Discoverer implementation. The standard behavior is to use XMI serialization."); //$NON-NLS-1$
		serializeTarget.setDirection(DirectionKind.IN);
		serializeTarget.setRequired(false);
		this.parameters.add(serializeTarget);

		DiscoveryParameterLine targetURI = new DiscoveryParameterLine();
		targetURI.setName("targetURI"); //$NON-NLS-1$
		targetURI.setType("org.eclipse.emf.common.util.URI"); //$NON-NLS-1$
		targetURI
				.setDescription("A location for optional model serialization. Save behavior depends on Discoverer implementation."); //$NON-NLS-1$
		targetURI.setDirection(DirectionKind.IN);
		targetURI.setRequired(false);
		this.parameters.add(targetURI);
	}

	public static AbstractModelDiscovererParameters getInstance() {
		if (AbstractModelDiscovererParameters.instance == null) {
			AbstractModelDiscovererParameters.instance = new AbstractModelDiscovererParameters();
		}
		return AbstractModelDiscovererParameters.instance;
	}

	public List<DiscoveryParameterLine> getParameters() {
		return this.parameters;
	}

	public static boolean isInheritedParameter(final Object param) {
		return getInstance().getParameters().contains(param);
	}
}
