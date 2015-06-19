/*
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */
package org.eclipse.gmt.modisco.workflow;

/**
 * @deprecated replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@Deprecated
public interface WorkflowModelEventsSubscribe {

	/**
	 * To add a listener to current model
	 * as in the pattern Observer
	 * @param listener 
	 */
	public void subscribe(WorkflowModelEvents listener);
	/**
	 * To remove a listener to current model
	 * as in the pattern Observer
	 * @param listener 
	 */
	public void unsubscribe(WorkflowModelEvents listener);
}
