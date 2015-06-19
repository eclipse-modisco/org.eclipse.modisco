/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.workflow;

import java.util.List;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameter;

/**
 * API to define the driver core
 * 
 * @author Nicolas Payneau
 * @deprecated no Driver needed anymore, replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@Deprecated
public interface Driver {

	/**
	 * Allows to retrieve the type of launcher. The type is defines in the file "example.launch"
	 * like that : <launchConfiguration type="type of launcher">
	 * 
	 * @return the type of launcher
	 */
	public String getTypeLaunchConfig();

	/**
	 * Allows to retrieve all descriptions of parameters
	 * 
	 * @param configuration
	 *            Configuration of MoDiscoWork selected
	 * @return All parameters of driver
	 */
	public List<WorkParameter> getParameters(ILaunchConfiguration configuration);
}
