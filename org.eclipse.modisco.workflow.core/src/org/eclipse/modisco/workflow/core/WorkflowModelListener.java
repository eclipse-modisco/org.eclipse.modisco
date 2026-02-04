/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
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

import org.eclipse.modisco.workflow.modiscoworkflow.Element;

public interface WorkflowModelListener {

	/**
	 * Added a component to the Workflow
	 *
	 * @param element
	 *            Element which represents the component
	 */
	public void elementAdded(Element element);

	/**
	 * A component was inserted in the Workflow. Called when moving an element
	 * up or down in the workflow
	 *
	 * @param index
	 *            Component index
	 * @param element
	 *            The new element
	 */
	public void elementInserted(int index, Element element);

	/**
	 * Deleted a component at the specified index
	 *
	 * @param index
	 *            Component index
	 */
	public void elementRemoved(int index);

}
