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
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Workflow;

/**
 * API to define the workflow core
 * 
 * @author Nicolas Payneau
 * @deprecated replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@Deprecated
public interface WorkflowModel extends Workflow, WorkflowModelEventsSubscribe {

	/**
	 * Allows to retrieve a component at index specified
	 * 
	 * @param index
	 *            Component index
	 * @return Return an element
	 */
	public Element getElement(int index);

	/**
	 * Allows to retrieve all components of the workflow
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
	 *            The new element
	 */
	public void setElement(int index, Element element);

	/**
	 * To up an element in the workflow
	 * 
	 * @param indexSelected
	 *            Index of item selected
	 */
	public void upElement(int indexSelected);

	/**
	 * To down an element in the workflow
	 * 
	 * @param indexSelected
	 *            Index of item selected
	 */
	public void downElement(int indexSelected);

	/**
	 * Allows to delete a component at index specified
	 * 
	 * @param index
	 *            Component index
	 */
	public void removeElement(int index);

	/**
	 * Allows to initialize or load the workflow
	 * 
	 * @param configuration
	 *            Launch configuration associated
	 */
	public void initialization(ILaunchConfiguration configuration);

	/**
	 * Allows to save the resource
	 * 
	 * @param configuration
	 *            Launch configuration associated
	 */
	public void save(ILaunchConfigurationWorkingCopy configuration);

	/**
	 * Allows to move the resource
	 * 
	 * @param path
	 *            Workflow resource path
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
	 * Allows to export the workflow
	 * 
	 * @param configuration
	 *            The launch configuration associated
	 * @param outputPath
	 *            The output path
	 */
	public void exportWorkflow(final URI outputUri);

	/**
	 * Allows to synchronize all resources contained in the workflow
	 * 
	 * @param elements
	 *            All elements contained in the MoDiscoWorkflow
	 */
	public void synchronization(List<Element> elements);

}
