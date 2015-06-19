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

import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element;

/**
 * @deprecated replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@Deprecated
public interface WorkflowModelEvents {

	/**
	 * Add a component in the Workwlow
	 * 
	 * @param element
	 *            Element which represents the component
	 */
	public void notifyElementAdded(Element element);

	/**
	 * Change a component of Workflow Essentially, to up or down an element in the workflow
	 * 
	 * @param index
	 *            Component index
	 * @param element
	 *            The new element
	 */
	public void notifyElementInserted(int index, Element element);

	/**
	 * To delete a component at index specified
	 * 
	 * @param index
	 *            Component index
	 */
	public void notifyElementRemoved(int index);

}
