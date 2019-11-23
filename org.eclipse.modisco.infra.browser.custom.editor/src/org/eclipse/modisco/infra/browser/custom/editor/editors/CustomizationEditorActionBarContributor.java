/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.editor.editors;

import java.util.EventObject;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.RedoAction;
import org.eclipse.emf.edit.ui.action.UndoAction;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.EditorActionBarContributor;

/**
 * Contributes to the workbench the undo and redo actions for the customization
 * editor.
 */
public class CustomizationEditorActionBarContributor extends EditorActionBarContributor {

	private UndoAction undoAction;
	private RedoAction redoAction;

	private final CommandStackListener commandStackListener = new CommandStackListener() {
		public void commandStackChanged(final EventObject event) {
			CustomizationEditorActionBarContributor.this.undoAction.update();
			CustomizationEditorActionBarContributor.this.redoAction.update();
		}
	};

	public CustomizationEditorActionBarContributor() {
		// nothing
	}

	@Override
	public void init(final IActionBars actionBars) {
		super.init(actionBars);
		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();

		this.undoAction = new UndoAction();
		this.undoAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_UNDO));
		actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), this.undoAction);

		this.redoAction = new RedoAction();
		this.redoAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_REDO));
		actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), this.redoAction);
	}

	@Override
	public void setActiveEditor(final IEditorPart targetEditor) {
		if (targetEditor instanceof CustomizationEditor) {
			CustomizationEditor customizationEditor = (CustomizationEditor) targetEditor;
			EditingDomain editingDomain = customizationEditor.getEditingDomain();
			this.undoAction.setEditingDomain(editingDomain);
			this.redoAction.setEditingDomain(editingDomain);

			this.undoAction.update();
			this.redoAction.update();

			CommandStack commandStack = customizationEditor.getEditingDomain().getCommandStack();
			commandStack.removeCommandStackListener(this.commandStackListener);
			commandStack.addCommandStackListener(this.commandStackListener);
		}
	}

}
