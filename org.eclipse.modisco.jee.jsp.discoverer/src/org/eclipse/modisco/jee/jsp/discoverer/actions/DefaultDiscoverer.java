/*********************************************************************************
 * Copyright (c) 2009,2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - adapted to new discovery framework (Bug 335003)
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *********************************************************************************/
package org.eclipse.modisco.jee.jsp.discoverer.actions;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterDirectionKind;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterImpl;

/**
 * @deprecated use matching org.eclipse.modisco.jee.jsp.discoverer classes, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=474894
 */
@Deprecated
public abstract class DefaultDiscoverer implements Discoverer {

	private Resource resourceResult = null;

	public Resource getResourceResult() {
		return this.resourceResult;
	}

	public void setResourceResult(final Resource resourceResult) {
		this.resourceResult = resourceResult;
	}

	/**
	 * A parameter key to indicate to work without user interaction.
	 */
	public static final DiscoveryParameter PARAMETER_SILENT_MODE = new DiscoveryParameterImpl(
			"OPTION_SILENT_MODE", DiscoveryParameterDirectionKind.in, //$NON-NLS-1$
			Boolean.class, false);

	/**
	 * A parameter key to indicate to serialize as an xmi file the obtained model.
	 */
	public static final DiscoveryParameter PARAMETER_SERIALIZE_XMI = new DiscoveryParameterImpl(
			"OPTION_SERIALIZE_XMI", //$NON-NLS-1$
			DiscoveryParameterDirectionKind.in, Boolean.class, false);

	/**
	 * A parameter key for indicating an output target Resource instance.
	 */
	public static final DiscoveryParameter PARAMETER_TARGET_RESOURCE = new DiscoveryParameterImpl(
			"TARGET_RESOURCE", DiscoveryParameterDirectionKind.out, //$NON-NLS-1$
			Resource.class, false);
}
