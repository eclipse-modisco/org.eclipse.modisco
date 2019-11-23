/**
 *  Copyright (c) 2017 Soft-Maint.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *		Jonathan Pepin (Soft-Maint) - Bug 516701 - Command factory to add content to resource
 */
package org.eclipse.emf.facet.util.emf.core.internal.command;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.facet.util.emf.core.command.ILockableUndoCommand;
import org.eclipse.emf.facet.util.emf.core.internal.Messages;

/**
 * This command has to be used to add content to a resource
 */
public class AddResourceContentCommand implements Command, ILockableUndoCommand {

	private final Collection<EObject> newContent;
	private final Resource resource;
	private boolean enableUndo = true;

	/**
	 * @param resource the resource of which we want to add the content.
	 * @param content a list of EObject to add as the content of the resource
	 */
	public AddResourceContentCommand(final Resource resource, final Collection<EObject> content) {
		this.resource = resource;
		this.newContent = content;
	}

	public boolean canExecute() {
		return true;
	}

	public void execute() {
		this.resource.getContents().addAll(this.newContent);
	}

	public boolean canUndo() {
		return this.enableUndo;
	}

	public void undo() {
		this.resource.getContents().removeAll(this.newContent);
	}

	public void redo() {
		this.resource.getContents().addAll(this.newContent);
	}

	public Collection<?> getResult() {
		final Collection<Resource> result = new ArrayList<Resource>();
		result.add(this.resource);
		return result;
	}

	public Collection<?> getAffectedObjects() {
		final Collection<Object> affectedObjects = new ArrayList<Object>();
		affectedObjects.add(this.resource);
		affectedObjects.addAll(this.newContent);
		return affectedObjects;
	}

	public String getLabel() {
		return Messages.AddResourceContentCommand_Label;
	}

	public String getDescription() {
		return Messages.AddResourceContentCommand_Description;
	}

	public void dispose() {
		// do nothing
	}

	public Command chain(final Command command) {
		final CompoundCommand result = new CompoundCommand();
		result.append(this);
		result.append(command);
		return result;
	}

	public void enableCanUndo(final boolean enable) {
		this.enableUndo = enable;
	}

}
