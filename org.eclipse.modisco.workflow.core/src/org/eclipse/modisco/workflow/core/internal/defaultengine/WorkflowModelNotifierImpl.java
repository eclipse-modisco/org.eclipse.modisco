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
package org.eclipse.modisco.workflow.core.internal.defaultengine;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.modisco.workflow.core.WorkflowModelListener;
import org.eclipse.modisco.workflow.core.WorkflowModelNotifier;
import org.eclipse.modisco.workflow.modiscoworkflow.Element;

public class WorkflowModelNotifierImpl implements WorkflowModelListener, WorkflowModelNotifier {

	private final List<WorkflowModelListener> listeners = new ArrayList<WorkflowModelListener>();

	public void addListener(final WorkflowModelListener listener) {
		if (listener != null && !this.listeners.contains(listener)) {
			this.listeners.add(listener);
		}
	}

	public void removeListener(final WorkflowModelListener listener) {
		this.listeners.remove(listener);
	}

	public void elementAdded(final Element element) {
		for (WorkflowModelListener listener : this.listeners) {
			listener.elementAdded(element);
		}
	}

	public void elementInserted(final int index, final Element element) {
		for (WorkflowModelListener listener : this.listeners) {
			listener.elementInserted(index, element);
		}
	}

	public void elementRemoved(final int index) {
		for (WorkflowModelListener listener : this.listeners) {
			listener.elementRemoved(index);
		}
	}
}
