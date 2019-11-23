/**
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 */
package org.eclipse.modisco.workflow.core.internal.engine;

import org.eclipse.modisco.workflow.core.WorkflowExecution;

public interface EngineFactory {

	/**
	 * The singleton instance of the factory.
	 *
	 */
	public static final EngineFactory INSTANCE = new EngineFactoryImpl();

	public WorkflowExecution getEngine(final String engineId);
}
