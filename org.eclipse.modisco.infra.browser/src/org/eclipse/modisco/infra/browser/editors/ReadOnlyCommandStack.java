/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.editors;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;

public class ReadOnlyCommandStack implements CommandStack {

	public void execute(final Command command) {
		// nothing
	}

	public boolean canUndo() {
		return false;
	}

	public void undo() {
		// nothing
	}

	public boolean canRedo() {
		return false;
	}

	public Command getUndoCommand() {
		return null;
	}

	public Command getRedoCommand() {
		return null;
	}

	public Command getMostRecentCommand() {
		return null;
	}

	public void redo() {
		// nothing
	}

	public void flush() {
		// nothing
	}

	public void addCommandStackListener(final CommandStackListener listener) {
		// nothing
	}

	public void removeCommandStackListener(final CommandStackListener listener) {
		// nothing
	}

}
