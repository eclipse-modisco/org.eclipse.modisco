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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CopyCommand;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ITreeElement;
import org.eclipse.modisco.infra.browser.uicore.internal.model.LinkItem;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ModelElementItem;

/** Handles drag&drop on a {@link ModelElementItem} */
public class DragAndDropOnModelElementCommand extends DragAndDropCommand {

	private final ModelElementItemEx modelElementItem;

	public DragAndDropOnModelElementCommand(final EditingDomain editingDomain,
			final ModelElementItemEx modelElementItem, final float location, final int operations,
			final int operation, final Collection<?> collection) {
		super(editingDomain, modelElementItem, location, operations, operation, collection);
		this.modelElementItem = modelElementItem;
	}

	public ModelElementItem getModelElementItem() {
		return this.modelElementItem;
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
	protected boolean prepareDropMoveInsert(final Object parent, final Collection<?> children,
			final int index) {
		LinkItem parentLinkItem;
		if (parent instanceof LinkItem) {
			parentLinkItem = (LinkItem) parent;
		} else {
			return false;
		}

		Collection<Object> emfChildren = new ArrayList<Object>();
		for (Object o : children) {
			if (o instanceof ModelElementItem) {
				ModelElementItem item = (ModelElementItem) o;
				emfChildren.add(item.getEObject());
			} else {
				emfChildren.add(o);
			}
		}

		// We don't want to move insert an object before or after
		// itself
		if (this.collection.contains(this.modelElementItem.getEObject())) {
			this.dragCommand = IdentityCommand.INSTANCE;
			this.dropCommand = UnexecutableCommand.INSTANCE;
		} else if (emfChildren.containsAll(this.collection)) {
			// ↑ if the dragged objects share a parent
			this.dragCommand = IdentityCommand.INSTANCE;

			// Create move commands for all the objects in the
			// collection.
			CompoundCommand compoundCommand = new CompoundCommand();
			List<Object> before = new ArrayList<Object>();
			List<Object> after = new ArrayList<Object>();

			int i = 0;
			for (Object object : emfChildren) {
				if (this.collection.contains(object)) {
					if (i < index) {
						before.add(object);
					} else if (i > index) {
						after.add(object);
					}
				}
				i++;
			}

			for (Object object : before) {
				compoundCommand.append(MoveCommand.create(this.domain, parentLinkItem.getParent(),
						parentLinkItem.getReference(), object, index - 1));
			}

			for (ListIterator<Object> objects = after.listIterator(after.size()); objects
					.hasPrevious();) {
				Object object = objects.previous();
				compoundCommand.append(MoveCommand.create(this.domain, parentLinkItem.getParent(),
						parentLinkItem.getReference(), object, index));
			}

			if (compoundCommand.getCommandList().isEmpty()) {
				this.dropCommand = IdentityCommand.INSTANCE;
			} else {
				this.dropCommand = compoundCommand;
			}
		} else {
			if (isCrossDomain()) {
				EObject eObject = this.modelElementItem.getEObject();
				Resource resource = eObject.eResource();
				if (resource != null && resource.getResourceSet() != null) {
					this.collection = DragAndDropUtils.translateCrossDomainObjects(this.collection,
							resource.getResourceSet());
				}
			}
			// Just remove the objects and add them.
			this.dropCommand = AddCommand.create(this.domain, parentLinkItem.getParent(),
					parentLinkItem.getReference(), this.collection, index);
			if (analyzeForNonContainment(this.dropCommand)) {
				// this.dropCommand.dispose();
				// this.dropCommand = UnexecutableCommand.INSTANCE;
				this.dragCommand = IdentityCommand.INSTANCE;
			} else {
				this.dragCommand = RemoveCommand.create(this.domain, this.collection);
			}
		}

		boolean result = this.dragCommand.canExecute() && this.dropCommand.canExecute();
		return result;
	}

	@Override
	protected boolean prepareDropCopyInsert(final Object parent, final Collection<?> children,
			final int index) {
		LinkItem parentLinkItem;
		if (parent instanceof LinkItem) {
			parentLinkItem = (LinkItem) parent;
		} else {
			return false;
		}

		boolean result;
		// We don't want to copy insert an object before or after
		// itself
		if (this.collection.contains(this.modelElementItem.getEObject())) {
			this.dragCommand = IdentityCommand.INSTANCE;
			this.dropCommand = UnexecutableCommand.INSTANCE;
			result = false;
		} else {
			// Copy the collection
			this.dragCommand = CopyCommand.create(this.domain, this.collection);

			if (this.optimize) {
				result = optimizedCanExecute();
				if (result) {
					this.optimizedDropCommandOwner = this.modelElementItem.getEObject();
				}
			} else {
				if (this.dragCommand.canExecute() && this.dragCommand.canUndo()) {
					this.dragCommand.execute();
					this.isDragCommandExecuted = true;

					// And add the copy.
					this.dropCommand = AddCommand.create(this.domain, parentLinkItem.getParent(),
							parentLinkItem.getReference(), this.dragCommand.getResult(), index);
					if (analyzeForNonContainment(this.dropCommand)) {
						this.dropCommand.dispose();
						this.dropCommand = UnexecutableCommand.INSTANCE;

						this.dragCommand.undo();
						this.dragCommand.dispose();
						this.isDragCommandExecuted = false;
						this.dragCommand = IdentityCommand.INSTANCE;
					}
					result = this.dropCommand.canExecute();
				} else {
					this.dropCommand = UnexecutableCommand.INSTANCE;
					result = false;
				}
			}
		}
		return result;
	}

	@Override
	protected boolean prepareDropLinkInsert(final Object parent, final Collection<?> children,
			final int index) {
		this.dragCommand = IdentityCommand.INSTANCE;
		this.dropCommand = UnexecutableCommand.INSTANCE;
		return false;
	}

	@Override
	protected boolean prepareDropMoveOn() {
		if (isCrossDomain()) {
			this.dragCommand = IdentityCommand.INSTANCE;
			this.dropCommand = UnexecutableCommand.INSTANCE;
		} else {
			this.dropCommand = AddCommand.create(this.domain, this.modelElementItem.getEObject(),
					null, this.collection);
			if (analyzeForNonContainment(this.dropCommand)) {
				this.dropCommand.dispose();
				this.dropCommand = UnexecutableCommand.INSTANCE;
				this.dragCommand = IdentityCommand.INSTANCE;
			} else {
				this.dragCommand = RemoveCommand.create(this.domain, this.collection);
			}
		}

		boolean result = this.dragCommand.canExecute() && this.dropCommand.canExecute();
		return result;
	}

	@Override
	protected boolean prepareDropCopyOn() {
		boolean result;

		this.dragCommand = CopyCommand.create(this.domain, this.collection);

		if (this.dragCommand.canExecute() && this.dragCommand.canUndo()) {
			this.dragCommand.execute();
			this.isDragCommandExecuted = true;
			this.dropCommand = AddCommand.create(this.domain, this.modelElementItem.getEObject(),
					null, this.dragCommand.getResult());
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

		result = this.dragCommand.canExecute() && this.dropCommand.canExecute();

		return result;
	}

	@Override
	protected boolean prepareDropLinkOn() {
		this.dragCommand = IdentityCommand.INSTANCE;
		this.dropCommand = UnexecutableCommand.INSTANCE;
		return false;
	}
}
