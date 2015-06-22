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
package org.eclipse.gmt.modisco.workflow.mwe.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gmt.modisco.workflow.WorkflowModelEvents;
import org.eclipse.gmt.modisco.workflow.WorkflowModelEventsSubscribe;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element;

/**
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class WorkflowModelNotifier implements WorkflowModelEvents, WorkflowModelEventsSubscribe {

	private final List<WorkflowModelEvents> listeners = new ArrayList<WorkflowModelEvents>();
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.workflow.WorkflowModelEventsSubscribe#subscribe(org.eclipse.debug.ui.workflow.WorkflowModelEvents)
	 */
	public void subscribe(final WorkflowModelEvents listener) {
		if (listener != null) {
			this.listeners.add(listener);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.workflow.WorkflowModelEventsSubscribe#unsubscribe(org.eclipse.debug.ui.workflow.WorkflowModelEvents)
	 */
	public void unsubscribe(final WorkflowModelEvents listener) {
		if (listener != null) {
			this.listeners.remove(listener);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.workflow.WorkflowModelEvents#notifyElementAdded(org.eclipse.debug.ui.workflow.model.workflow.Element)
	 */
	public void notifyElementAdded(final Element element) {
		for (WorkflowModelEvents listener : this.listeners) {
			listener.notifyElementAdded(element);
		}
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.workflow.WorkflowModelEvents#notifyElementInserted(int, org.eclipse.debug.ui.workflow.model.workflow.Element)
	 */
	public void notifyElementInserted(final int index, final Element element) {
		for (WorkflowModelEvents listener : this.listeners) {
			listener.notifyElementInserted(index, element);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.workflow.WorkflowModelEvents#notifyElementRemoved(int)
	 */
	public void notifyElementRemoved(final int index) {
		for (WorkflowModelEvents listener : this.listeners) {
			listener.notifyElementRemoved(index);
		}
	}

}
