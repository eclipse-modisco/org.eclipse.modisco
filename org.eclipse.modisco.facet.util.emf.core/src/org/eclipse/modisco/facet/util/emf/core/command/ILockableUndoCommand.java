/**
 *  Copyright (c) 2011 CEA LIST.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *      Gregoire Dupe (Mia-Software) - Bug 345730 - Deleting an element in the model breaks the table
 */
package org.eclipse.modisco.facet.util.emf.core.command;

/**
 * This interface is used to force an EMF command to not be "undo-able"
 * @since 0.1.1
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 */
public interface ILockableUndoCommand {

	/**
	 * @param enableUndo false to lock the command in an not "undo-able" mode
	 */
	public void enableCanUndo(boolean enableUndo);
}
