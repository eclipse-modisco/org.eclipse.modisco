/**
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 */
package org.eclipse.modisco.workflow.core.internal.defaultengine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.workflow.core.Constants;
import org.eclipse.modisco.workflow.core.WorkflowModel;
import org.eclipse.modisco.workflow.core.WorkflowModelListener;
import org.eclipse.modisco.workflow.core.internal.Activator;
import org.eclipse.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowFactory;
import org.eclipse.modisco.workflow.modiscoworkflow.impl.WorkflowImpl;

public class WorkflowModelImpl extends WorkflowImpl implements WorkflowModel {

	private final WorkflowModelNotifierImpl notifier = new WorkflowModelNotifierImpl();

	public void addListener(final WorkflowModelListener listener) {
		this.notifier.addListener(listener);
	}

	public void removeListener(final WorkflowModelListener listener) {
		this.notifier.removeListener(listener);
	}

	public Element getElement(final int elementIndex) {
		return getElements().get(elementIndex);
	}

	public List<Element> getAllElements() {
		return getElements();
	}

	public void addElement(final Element element) {
		getElements().add(element);
		this.notifier.elementAdded(element);
	}

	public void setElement(final int index, final Element element) {
		getElements().set(index, element);
		this.notifier.elementInserted(index, element);
	}

	public void moveElementUp(final int elementIndex) {
		getElements().move(elementIndex - 1, elementIndex);
		this.notifier.elementInserted(elementIndex, getElement(elementIndex));
		this.notifier.elementInserted(elementIndex - 1, getElement(elementIndex - 1));
	}

	public void moveElementDown(final int elementIndex) {
		getElements().move(elementIndex + 1, elementIndex);
		this.notifier.elementInserted(elementIndex, getElement(elementIndex));
		this.notifier.elementInserted(elementIndex + 1, getElement(elementIndex + 1));
	}

	public void removeElement(final int elementIndex) {
		getElements().remove(elementIndex);
		this.notifier.elementRemoved(elementIndex);
	}

	/** WorkflowModelImpl#save(ILaunchConfigurationWorkingCopy) */
	public void initialize(final ILaunchConfiguration configuration) {
		try {
			setName(configuration.getName());

			// list of work elements
			getElements().clear();
			@SuppressWarnings("unchecked") // use of unparameterized eclipse api
			List<String> strings = configuration.getAttribute(
					Constants.SERIALIZED_WORKFLOW, new ArrayList<String>());
			getElements().addAll(
					stringListToElementList(strings));
			for (Element element : getElements()) {
				this.notifier.elementAdded(element);
			}
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	/**
	 * Deserialize a list of strings (name, index, type) to a list of elements
	 *
	 * @param stringList
	 *            String list source
	 * @return created element list
	 *
	 * @see WorkflowModelImpl#save(ILaunchConfigurationWorkingCopy)
	 */
	private static final List<Element> stringListToElementList(final List<String> stringList) {
		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < stringList.size(); i += Constants.SERIALIZED_WORKFLOW_ELEMENTS_IN_TUPLES) {
			Element element = null;
			// if it's a Composite
			if (stringList.get(i + 2).equals(Constants.LAUNCH_CONFIGURATION_TYPE)) {
				element = ModiscoworkflowFactory.eINSTANCE.createWorkflow();
			} else {
				element = ModiscoworkflowFactory.eINSTANCE.createWork();
			}
			element.setName(stringList.get(i));
			element.setIndex(Integer.parseInt(stringList.get(i + 1)));
			element.setType(stringList.get(i + 2));
			elements.add(element);
		}
		return elements;
	}

	/**
	 * Serialize the workflow elements into an attribute of the given launch
	 * configuration.
	 * <p>
	 * The strings are saved as a tuple (name, index, type) repeated for each
	 * element.
	 */
	public void save(final ILaunchConfigurationWorkingCopy configuration) {
		// adjust the name (in the model)
		setName(configuration.getName());
		// update the list of works (from the model)
		List<String> listString = new ArrayList<String>();
		for (Element element : getElements()) {
			listString.add(element.getName());
			listString.add(Integer.toString(element.getIndex()));
			listString.add(element.getType());
		}
		configuration.setAttribute(Constants.SERIALIZED_WORKFLOW, listString);
	}

	public void moveResource(final String path) {
		//
	}

	public void removeResource(final String resourcePath) {
		//
	}

	public void exportWorkflow(final URI outputUri) {
		Resource resource = null;
		ResourceSet resSet = new ResourceSetImpl();
		resource = resSet.createResource(outputUri);
		resource.getContents().add(this);
		try {
			resource.save(null);
		} catch (IOException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}

	}

	public void synchronize(final List<Element> elementsToSynchronize) {
		// nothing to do
	}
}
