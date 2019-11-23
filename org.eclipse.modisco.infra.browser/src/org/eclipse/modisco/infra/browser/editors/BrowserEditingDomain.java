/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Gregoire Dupe (Mia-Software) - Bug 404263 - EditingDomainProvider does not work when using IResourceEditorInput
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.editors;

import java.util.EventObject;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ModelElementItem;

/**
 * This editing domain associates each command with the editor selection at the
 * time it was issued. This is useful because the command only deals with
 * EObjects, whereas the editor selection contains {@link ModelElementItem}s,
 * which we need when we want to select the elements affected by a command.
 */
public class BrowserEditingDomain extends AdapterFactoryEditingDomain implements
		CommandStackListener {

	private final EcoreBrowser ecoreBrowser;

	private final Map<Command, Object> commandSelections = new HashMap<Command, Object>();

	public BrowserEditingDomain(final ComposedAdapterFactory adapterFactoryWithRegistry,
			final CommandStack commandStack, final HashMap<Resource, Boolean> hashMap,
			final EcoreBrowser ecoreBrowser) {
		super(adapterFactoryWithRegistry, commandStack, hashMap);
		commandStack.addCommandStackListener(this);
		this.ecoreBrowser = ecoreBrowser;
	}

	public BrowserEditingDomain(final ComposedAdapterFactory adapterFactoryWithRegistry,
			final CommandStack commandStack, final ResourceSet resourceSet,
			final EcoreBrowser ecoreBrowser) {
		super(adapterFactoryWithRegistry, commandStack, resourceSet);
		commandStack.addCommandStackListener(this);
		this.ecoreBrowser = ecoreBrowser;
	}

	@Override
	public Command createCommand(final Class<? extends Command> commandClass,
			final CommandParameter commandParameter) {
		Command command = super.createCommand(commandClass, commandParameter);
		ISelection editorSelection = this.ecoreBrowser.getEditorSelection();
		if (editorSelection instanceof ITreeSelection) {
			ITreeSelection treeSelection = (ITreeSelection) editorSelection;
			this.commandSelections.put(command, treeSelection.getFirstElement());
		}
		return command;
	}

	public Object getEditorSelectionForCommand(final Command command) {
		return this.commandSelections.get(command);
	}

	public void commandStackChanged(final EventObject event) {
		// when the command stack is flushed, clear the selections map
		CommandStack theCommandStack = getCommandStack();
		if (theCommandStack.getMostRecentCommand() == null) {
			this.commandSelections.clear();
		}
	}
}
