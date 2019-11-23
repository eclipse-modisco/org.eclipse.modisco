/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 *******************************************************************************/
package org.eclipse.modisco.workflow.core;

import java.util.List;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.emf.common.util.URI;
import org.eclipse.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.modisco.workflow.modiscoworkflow.Workflow;

/**
 * API to define the workflow core
 *
 * @author Nicolas Payneau
 */
public interface WorkflowModel extends Workflow, WorkflowModelNotifier {

	/**
	 * Retrieve a component at the index specified
	 *
	 * @param index
	 *            Component index
	 * @return an element
	 */
	public Element getElement(int index);

	/**
	 * Retrieve all components of the workflow
	 *
	 * @return an element list
	 */
	public List<Element> getAllElements();

	/**
	 * Add a component in the workflow
	 *
	 * @param element
	 *            Element which represents a launch configuration
	 */
	public void addElement(Element element);

	/**
	 * Change a component in the workflow
	 *
	 * @param index
	 *            Component index
	 * @param element
	 *            the new element
	 */
	public void setElement(int index, Element element);

	/**
	 * To move an element up in the workflow
	 *
	 * @param index
	 *            index of the element to move up
	 */
	public void moveElementUp(int index);

	/**
	 * To move an element down in the workflow
	 *
	 * @param index
	 *            index of the element to move down
	 */
	public void moveElementDown(int index);

	/**
	 * Delete a component at the index specified
	 *
	 * @param index
	 *            Component index
	 */
	public void removeElement(int index);

	/**
	 * Initialize or load the workflow
	 *
	 * @param configuration
	 *            Launch configuration associated
	 */
	public void initialize(ILaunchConfiguration configuration);

	/**
	 * Save the resource
	 *
	 * @param configuration
	 *            Launch configuration associated
	 */
	public void save(ILaunchConfigurationWorkingCopy configuration);

	/**
	 * Move the resource to a new path.
	 *
	 * @param path
	 *            the new Workflow resource path
	 */
	public void moveResource(String path);

	/**
	 * Allows to remove the resource
	 *
	 * @param path
	 *            Workflow resource path
	 */
	void removeResource(String resourcePath);

	/**
	 * Export the workflow
	 *
	 * @param outputUri
	 *            The output location
	 */
	public void exportWorkflow(final URI outputUri);

	/**
	 * Synchronize resources contained in the workflow
	 *
	 * @param elements
	 *            elements to synchronize, contained in the MoDiscoWorkflow
	 */
	public void synchronize(List<Element> elements);

}
