/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/

package org.eclipse.gmt.modisco.infra.discoverymanager;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * In the context of model-driven reverse-engineering, a discoverer is a
 * component that injects information into a model to represent physical
 * elements (a source file is considered as a physical element).
 * 
 * @deprecated use org.eclipse.modisco.infra.discovery.core framework, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=343840
 */
@Deprecated
public interface Discoverer {

	/**
	 * To determine if the source object can be handled by the discoverer. Each
	 * discoverer has to implement this method with its own criteria to filter
	 * the selected object. If the source object is managed by this discoverer,
	 * the discoverer menu will be available in the pop-up menu when users click
	 * with the contextual button (right-click), and in the discoverer launch
	 * configuration types.
	 * 
	 * @param source
	 *            the selected object.
	 * @return <code>true</code> if the selected object is managed by this
	 *         discoverer, <code>false</code> otherwise.
	 */
	public boolean isApplicableTo(final Object source);

	/**
	 * Execute the discovery task from the selected object. This is a method
	 * adapted to a common use of discoverers.
	 * 
	 * @param source
	 *            the selected object.
	 * @param target
	 *            the target URI (can be <code>null</code>)
	 * @return the EMF resource of the target model discovered from source.
	 */
	@Deprecated
	public Resource discoverElement(final Object source, final URI target);

	/**
	 * Generic method to discover a source element. It allows more different use
	 * cases. Because there are no constraints as to the expected result, we
	 * have a way to drive elements discovery with a wide configuration panel.
	 * This method has to be used in coordination with the
	 * {@link #getDiscovererParameters} method to know which parameters are
	 * available.
	 * 
	 * For programmatic usages of generic discoverers, we recommend to provide
	 * accessors for each discovery parameters that are available. (see the
	 * class AbstractDiscoveryImpl as an example)
	 * 
	 * If you have specific needs (programmatic usage, exception management,
	 * etc.), we recommend to use a delegation pattern with a specific interface
	 * dedicated to your needs (and so a specific implementation), and the
	 * generic part will delegate to this. With this approach, you will have two
	 * way to handle your discovery process, the generic one as usual and a
	 * specific one, which may stay internal to avoid confusions.
	 * 
	 * @param source
	 *            the selected object.
	 * @param parameters
	 *            list of parameter pairs (key, value)
	 */
	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters);

	/**
	 * Get a complete list of all parameters available in this discoverer.
	 * Further information should be provided to indicate features of each
	 * parameter; for example, direction kind (in, out, in-out), whether the
	 * parameter is optional or not ...
	 * 
	 * @return the set of parameter names provided by this discoverer.
	 */
	public List<DiscoveryParameter> getDiscovererParameters();

}
