/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.core;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CopyCommand;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ITreeElement;
import org.eclipse.modisco.infra.browser.uicore.internal.model.LinkItem;

/** Handles drag&drop on a {@link LinkItem} */
public class DragAndDropOnLinkCommand extends DragAndDropCommand {

	private final LinkItemEx linkItem;

	public DragAndDropOnLinkCommand(final EditingDomain editingDomain, final LinkItemEx linkItem,
			final float location, final int operations, final int operation,
			final Collection<?> collection) {
		super(editingDomain, linkItem, location, operations, operation, collection);
		this.linkItem = linkItem;
	}

	public LinkItem getLinkItem() {
		return this.linkItem;
	}

	public Command getDropCommand() {
		return this.dropCommand;
	}

	@Override
	protected Object getParent(final Object object) {
		if (object instanceof ITreeElement) {
			ITreeElement treeElement = (ITreeElement) object;
			return treeElement.getTreeParent();
		}
		return Collections.emptyList();
	}

	@Override
	protected Collection<?> getChildren(final Object object) {
		if (object instanceof ITreeElement) {
			ITreeElement treeElement = (ITreeElement) object;
			return treeElement.getChildren();
		}
		return Collections.emptyList();
	}

	@Override
	protected boolean prepareDropInsert() {
		return false;
	}

	@Override
	protected boolean prepareDropMoveOn() {
		if (isCrossDomain()) {
			EObject eObject = this.linkItem.getParent();
			Resource resource = eObject.eResource();
			if (resource != null && resource.getResourceSet() != null) {
				this.collection = DragAndDropUtils.translateCrossDomainObjects(this.collection,
						resource.getResourceSet());
			}
		}
		if (isCrossDomain() || !checkReferenceType(this.linkItem.getReference(), this.collection)) {
			this.dragCommand = IdentityCommand.INSTANCE;
			this.dropCommand = UnexecutableCommand.INSTANCE;
		} else {
			if (this.linkItem.getReference().isContainment()) {
				this.dropCommand = AddCommand.create(this.domain, this.linkItem.getParent(), null,
						this.collection);
				this.dragCommand = RemoveCommand.create(this.domain, this.collection);
			} else if (this.linkItem.getReference().isContainer()) {
				this.dropCommand = UnexecutableCommand.INSTANCE;
				this.dragCommand = IdentityCommand.INSTANCE;
			} else {
				if (this.linkItem.getReference().isMany()) {
					this.dropCommand = AddCommand.create(this.domain, this.linkItem.getParent(),
							this.linkItem.getReference(), this.collection);
				} else {
					if (this.collection.size() == 1) {
						this.dropCommand = SetCommand.create(this.domain,
								this.linkItem.getParent(), this.linkItem.getReference(),
								this.collection.iterator().next());
					} else {
						this.dropCommand = UnexecutableCommand.INSTANCE;
					}
				}
				this.dragCommand = IdentityCommand.INSTANCE;
			}
		}

		boolean result = this.dragCommand.canExecute() && this.dropCommand.canExecute();
		return result;
	}

	/**
	 * Check that each element in the collection can be assigned using the given
	 * reference
	 */
	private boolean checkReferenceType(final EReference reference, final Collection<?> elements) {
		EClass eReferenceType = reference.getEReferenceType();
		for (Object o : elements) {
			if (!eReferenceType.isInstance(o)) {
				return false;
			}
		}
		return true;
	}

	@Override
	protected boolean prepareDropCopyOn() {
		if (!checkReferenceType(this.linkItem.getReference(), this.collection)) {
			this.dragCommand = IdentityCommand.INSTANCE;
			this.dropCommand = UnexecutableCommand.INSTANCE;
			return false;
		}

		this.dragCommand = CopyCommand.create(this.domain, this.collection);

		if (this.dragCommand.canExecute() && this.dragCommand.canUndo()) {
			this.dragCommand.execute();
			this.isDragCommandExecuted = true;
			this.dropCommand = AddCommand.create(this.domain, this.linkItem.getParent(), null,
					this.dragCommand.getResult());
			if (analyzeForNonContainment(this.dropCommand)) {
				this.dropCommand.dispose();
				this.dropCommand = UnexecutableCommand.INSTANCE;

				this.dragCommand.undo();
				this.dragCommand.dispose();
				this.isDragCommandExecuted = false;
				this.dragCommand = IdentityCommand.INSTANCE;
			}
		} else {
			this.dropCommand = UnexecutableCommand.INSTANCE;
		}

		boolean result = this.dragCommand.canExecute() && this.dropCommand.canExecute();
		return result;
	}

	@Override
	protected boolean prepareDropLinkOn() {
		this.dragCommand = IdentityCommand.INSTANCE;
		this.dropCommand = UnexecutableCommand.INSTANCE;
		return false;
	}

}
