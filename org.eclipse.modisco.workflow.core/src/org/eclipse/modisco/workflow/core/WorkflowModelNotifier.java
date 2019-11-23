/**
 * Copyright (c) 2010, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 */
package org.eclipse.modisco.workflow.core;

public interface WorkflowModelNotifier {

	/**
	 * To add a listener to current model as in the pattern Observer
	 *
	 * @param listener
	 */
	public void addListener(WorkflowModelListener listener);

	/**
	 * To remove a listener to current model as in the pattern Observer
	 *
	 * @param listener
	 */
	public void removeListener(WorkflowModelListener listener);
}
