/*******************************************************************************
 * Copyright (c) 2008, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Nicolas Payneau (Mia-Software) - Enable editability
 *
 *******************************************************************************/

package org.eclipse.gmt.modisco.infra.browser.editors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CreateSiblingAction;
import org.eclipse.emf.edit.ui.action.CutAction;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.action.ValidateAction;
import org.eclipse.gmt.modisco.infra.browser.Messages;
import org.eclipse.gmt.modisco.infra.browser.actions.BrowseAction;
import org.eclipse.gmt.modisco.infra.browser.actions.DecreaseFontSizeAction;
import org.eclipse.gmt.modisco.infra.browser.actions.ExecuteSelectedQueryAction;
import org.eclipse.gmt.modisco.infra.browser.actions.IBrowserActionBarContributor;
import org.eclipse.gmt.modisco.infra.browser.actions.IncreaseFontSizeAction;
import org.eclipse.gmt.modisco.infra.browser.actions.LoadCustomizationsAction;
import org.eclipse.gmt.modisco.infra.browser.actions.LoadFacetsAction;
import org.eclipse.gmt.modisco.infra.browser.actions.OpenTableEditorAction;
import org.eclipse.gmt.modisco.infra.browser.actions.RefreshViewerAction;
import org.eclipse.gmt.modisco.infra.browser.actions.RemoveQueryAction;
import org.eclipse.gmt.modisco.infra.browser.actions.RestoreFontSizeAction;
import org.eclipse.gmt.modisco.infra.browser.actions.SelectQueryAction;
import org.eclipse.gmt.modisco.infra.browser.actions.ShowBothPanelsAction;
import org.eclipse.gmt.modisco.infra.browser.actions.ShowOnlyInstancesPanelAction;
import org.eclipse.gmt.modisco.infra.browser.actions.ShowOnlyTypesPanelAction;
import org.eclipse.gmt.modisco.infra.browser.actions.ShowPropertiesViewAction;
import org.eclipse.gmt.modisco.infra.browser.core.QueryItem;
import org.eclipse.gmt.modisco.infra.browser.editors.table.TableEditor;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.model.ITreeElement;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.model.LinkItem;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchActionConstants;

/** Action bar contributor for the MoDisco Ecore model browser. */
public class BrowserActionBarContributor extends EditingDomainActionBarContributor implements
		IBrowserSelectionChangedListener, IBrowserActionBarContributor {

	private static final String EDIT_MENU_ID = "org.eclipse.gmt.modisco.infra.browser.editMenu"; //$NON-NLS-1$

	/** This keeps track of the active editor. */
	private IEditorPart fActiveEditor;

	/** This keeps track of the current selection provider. */
	private ISelectionProvider selectionProvider;

	/** This action opens the "Properties" view. */
	private final IAction showPropertiesViewAction = new ShowPropertiesViewAction();

	public EcoreBrowser getBrowser() {
		return (EcoreBrowser) this.fActiveEditor;
	}

	/** This action opens a table editor on the current selection. */
	private final IAction openTableEditorAction = new OpenTableEditorAction(this);

	/**
	 * This action refreshes the viewer of the current editor if the editor
	 * implements {@link org.eclipse.emf.common.ui.viewer.IViewerProvider}.
	 */
	private final IAction refreshViewerAction = new RefreshViewerAction(this);

	/**
	 * This action makes it possible to select a query to be shown on each
	 * occurrence of the selected model element
	 */
	private final IAction selectQueryAction = new SelectQueryAction(this);

	/** Executes the selected query(-ies) */
	private final IAction executeSelectedQueryAction = new ExecuteSelectedQueryAction(this);

	/** Removes the selected query(-ies) */
	private final IAction removeQueryAction = new RemoveQueryAction(this);

	/**
	 * The current selection, updated when an event is received from the
	 * selection provider
	 */
	private ISelection fSelection;

	public ISelection getSelection() {
		return this.fSelection;
	}

	/**
	 * An action to show the selected element in the list of instances of its
	 * metaclass
	 */
	private final Action browseAction = new BrowseAction(this);

	/** An action to increase font size */
	private final Action increaseFontSizeAction = new IncreaseFontSizeAction(this);

	/** An action to decrease font size */
	private final Action decreaseFontSizeAction = new DecreaseFontSizeAction(this);

	/** An action to restore font size */
	private final Action restoreFontSizeAction = new RestoreFontSizeAction(this);

	private final Action loadCustomizationsAction = new LoadCustomizationsAction(this);

	private final Action loadFacetsAction = new LoadFacetsAction(this);

	private final Action showOnlyInstancesPanelAction = new ShowOnlyInstancesPanelAction(this);
	private final Action showOnlyTypesPanelAction = new ShowOnlyTypesPanelAction(this);
	private final Action showBothPanelsAction = new ShowBothPanelsAction(this);

	/**
	 * This will contain one
	 * {@link org.eclipse.emf.edit.ui.action.CreateChildAction} corresponding to
	 * each descriptor generated for the current selection by the item provider.
	 */
	private Collection<IAction> createChildActions;

	/**
	 * This is the menu manager into which menu contribution items should be
	 * added for CreateChild actions.
	 */
	private IMenuManager createChildMenuManager;

	private IMenuManager editorMenuManager;

	// private final IAction loadMetamodelAction = new Action(
	// Messages.BrowserActionBarContributor_loadMetamodel) {
	// @Override
	// public void run() {
	// UriSelectionDialog uriSelectionDialog = new UriSelectionDialog(
	// BrowserActionBarContributor.this.fActiveEditor.getSite().getShell());
	// uriSelectionDialog.setTitle(Messages.BrowserActionBarContributor_chooseMetamodel);
	// if (uriSelectionDialog.open() == Window.OK) {
	// String uri = uriSelectionDialog.getUriSelected();
	// EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(uri);
	// EList<Resource> resources = getBrowser().getResourceSet().getResources();
	// if (ePackage.eResource() != null &&
	// !resources.contains(ePackage.eResource())) {
	// resources.add(ePackage.eResource());
	// }
	// }
	// }
	// };

	// /**
	// * This will contain one
	// * {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction}
	// corresponding
	// * to each descriptor generated for the current selection by the item
	// * provider.
	// */
	// private Collection<IAction> createSiblingActions;
	//
	// /**
	// * This is the menu manager into which menu contribution items should be
	// * added for CreateSibling actions.
	// */
	// private IMenuManager createSiblingMenuManager;

	public BrowserActionBarContributor() {
		super(EditingDomainActionBarContributor.ADDITIONS_LAST_STYLE);
		this.validateAction = new ValidateAction() {
			@Override
			public boolean updateSelection(final IStructuredSelection selection) {
				return super.updateSelection((IStructuredSelection) BrowserUtils
						.unwrapSelection(selection));
			}
		};

	}

	/** This adds {@link Action}s to the tool bar. */
	@Override
	public void contributeToToolBar(final IToolBarManager toolBarManager) {
		toolBarManager.add(this.increaseFontSizeAction);
		toolBarManager.add(this.decreaseFontSizeAction);
		toolBarManager.add(this.restoreFontSizeAction);
		toolBarManager.add(this.loadCustomizationsAction);
		toolBarManager.add(this.loadFacetsAction);
	}

	/**
	 * When the active editor changes, this remembers the change and registers
	 * with it as a selection provider.
	 */
	@Override
	public void setActiveEditor(final IEditorPart part) {
		super.setActiveEditor(part);
		this.fActiveEditor = part;

		// Switch to the new selection provider.
		if (this.selectionProvider != null) {
			this.selectionProvider.removeSelectionChangedListener(this);
		}

		if (part == null) {
			this.selectionProvider = null;
		} else {
			if (part instanceof EcoreBrowser) {
				final EcoreBrowser browser = (EcoreBrowser) part;
				this.selectionProvider = browser.getSite().getSelectionProvider();
				this.selectionProvider.addSelectionChangedListener(this);

				// Fake a selection changed event to update the menus.
				if (browser.getEditorSelection() != null) {
					selectionChanged(new SelectionChangedEvent(this.selectionProvider,
							browser.getEditorSelection()));
				}
			}
		}
	}

	/**
	 * This implements
	 * {@link org.eclipse.jface.viewers.ISelectionChangedListener}, memorizing
	 * {@link org.eclipse.jface.viewers.SelectionChangedEvent}s to be able to
	 * build the menu when they are about to be shown (see
	 * {@link BrowserActionBarContributor#menuAboutToShow(IMenuManager)}).
	 */
	public void selectionChanged(final SelectionChangedEvent event) {
		this.fSelection = event.getSelection();
	}

	/** Update actions state depending on the selection in the editor */
	private void updateActions(final ISelection selection) {
		this.browseAction.setEnabled(enableBrowse(selection));
		this.openTableEditorAction.setEnabled(TableEditor.canBeOpenedOnSelection(selection));

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			this.validateAction.updateSelection(structuredSelection);
		} else {
			this.validateAction.updateSelection(StructuredSelection.EMPTY);
		}
	}

	/**
	 * Whether to enable the browse action. The browse action is enabled only if
	 * the selected element corresponds to an EObject.
	 */
	private boolean enableBrowse(final ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() != 1) {
				return false;
			}
			final Object element = structuredSelection.getFirstElement();
			if (element instanceof ModelElementItem) {
				EObject eObject = ((ModelElementItem) element).getEObject();
				Resource eResource = eObject.eResource();
				if (eResource != null) {
					ResourceSet resourceSet = eResource.getResourceSet();
					if (resourceSet == getBrowser().getResourceSet()) {
						return true;
					}
				}
				return false;
			}
		}
		return false;
	}

	/** This populates the pop-up menu before it appears. */
	@Override
	public void menuAboutToShow(final IMenuManager menuManager) {
		if (!getBrowser().isReadOnly()) {
			final MenuManager submenuManager = new MenuManager(Messages.UI_CreateChild_menu_item);
			submenuManager.setRemoveAllWhenShown(true);
			submenuManager.addMenuListener(new IMenuListener() {
				public void menuAboutToShow(final IMenuManager manager) {
					updateMenu();
					populateManager(submenuManager,
							BrowserActionBarContributor.this.createChildActions, null);
				}
			});
			menuManager.add(submenuManager);

			// submenuManager = new
			// MenuManager(Messages.UI_CreateSibling_menu_item);
			// populateManager(submenuManager, this.createSiblingActions, null);
			//		menuManager.insertBefore("edit", submenuManager); //$NON-NLS-1$
		}

		menuManager.add(this.browseAction);
		menuManager.add(this.openTableEditorAction);

		int nSelectedModelElementItems = selectionCount(ModelElementItem.class);
		if (nSelectedModelElementItems > 0) {
			menuManager.add(this.selectQueryAction);
			if (nSelectedModelElementItems > 1) {
				this.selectQueryAction.setText(Messages.SelectQueryAction_addQueryOnElements);
			} else {
				this.selectQueryAction.setText(Messages.SelectQueryAction_addQueryOnElement);
			}
		}

		int nSelectedQueries = selectionCount(QueryItem.class);
		if (nSelectedQueries > 0) {
			menuManager.add(this.executeSelectedQueryAction);
			menuManager.add(this.removeQueryAction);
			if (nSelectedQueries > 1) {
				this.executeSelectedQueryAction.setText(Messages.ExecuteQueryAction_executeQueries);
				this.removeQueryAction.setText(Messages.RemoveQueryAction_removeQueries);
			} else {
				this.executeSelectedQueryAction
						.setText(Messages.ExecuteQueryAction_executeSelectedQuery);
				this.removeQueryAction.setText(Messages.RemoveQueryAction_removeQuery);
			}
		}

		if (!getBrowser().isReadOnly()) {
			super.menuAboutToShow(menuManager);
		}

		updateActions(getSelection());

		menuManager.add(new Separator());
		menuManager.add(this.showPropertiesViewAction);
		menuManager.add(this.refreshViewerAction);
		menuManager.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	/**
	 * De-populate and re-populate the menu based on the current selection.
	 * Query for the children and siblings that can be added to the selected
	 * object and update the menus accordingly.
	 */
	private void updateMenu() {
		// Remove any menu items for old selection
		if (this.createChildMenuManager != null) {
			depopulateManager(this.createChildMenuManager, this.createChildActions);
		}
		// if (this.createSiblingMenuManager != null) {
		// depopulateManager(this.createSiblingMenuManager,
		// this.createSiblingActions);
		// }

		Collection<?> newChildDescriptors = null;
		// Collection<?> newSiblingDescriptors = null;
		ISelection selectionOnBrowser = null;

		if (this.fSelection instanceof IStructuredSelection
				&& ((IStructuredSelection) this.fSelection).size() == 1) {
			if (this.fActiveEditor instanceof EcoreBrowser) {
				selectionOnBrowser = ((EcoreBrowser) this.fActiveEditor).getSelection();
				Object selectedObject = ((IStructuredSelection) this.fSelection).getFirstElement();

				EditingDomain domain = getBrowser().getEditingDomain();
				newChildDescriptors = domain.getNewChildDescriptors(selectedObject, null);
				// newSiblingDescriptors = domain.getNewChildDescriptors(null,
				// selectedObject);

				if (selectedObject instanceof LinkItem) {
					LinkItem linkItem = (LinkItem) selectedObject;
					selectionOnBrowser = new StructuredSelection(
							((ModelElementItem) linkItem.getTreeParent()).getEObject());
				}
			}
		}

		// Generate actions for selection; populate and redraw the menus
		this.createChildActions = generateCreateChildActions(newChildDescriptors,
				selectionOnBrowser);
		// this.createSiblingActions =
		// generateCreateSiblingActions(newSiblingDescriptors,
		// selectionOnBrowser);

		if (this.createChildMenuManager != null) {
			populateManager(this.createChildMenuManager, this.createChildActions, null);
			this.createChildMenuManager.update(true);
		}
		// if (this.createSiblingMenuManager != null) {
		// populateManager(this.createSiblingMenuManager,
		// this.createSiblingActions, null);
		// this.createSiblingMenuManager.update(true);
		// }
	}

	private int selectionCount(final Class<?> clazz) {
		ISelection selection = getSelection();
		int count = 0;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Iterator<?> iterator = structuredSelection.iterator();
			while (iterator.hasNext()) {
				Object element = iterator.next();
				if (clazz.isAssignableFrom(element.getClass())) {
					count++;
				}
			}
		}
		return count;
	}

	@Override
	public IEditorPart getActiveEditor() {
		return this.fActiveEditor;
	}

	@Override
	public void contributeToMenu(final IMenuManager menuManager) {
		super.contributeToMenu(menuManager);

		this.editorMenuManager = new MenuManager(Messages.UI_modiscoEditor_menu,
				BrowserActionBarContributor.EDIT_MENU_ID);

		menuManager.insertAfter("additions", this.editorMenuManager); //$NON-NLS-1$

		this.editorMenuManager.add(this.increaseFontSizeAction);
		this.editorMenuManager.add(this.decreaseFontSizeAction);
		this.editorMenuManager.add(this.restoreFontSizeAction);
		this.editorMenuManager.add(this.loadCustomizationsAction);
		this.editorMenuManager.add(this.loadFacetsAction);
		this.editorMenuManager.add(new Separator());
		this.editorMenuManager.add(this.showOnlyInstancesPanelAction);
		this.editorMenuManager.add(this.showOnlyTypesPanelAction);
		this.editorMenuManager.add(this.showBothPanelsAction);
		this.editorMenuManager.add(new Separator());
		this.editorMenuManager.add(this.showPropertiesViewAction);
		this.editorMenuManager.add(this.refreshViewerAction);

		this.editorMenuManager.add(new Separator("settings")); //$NON-NLS-1$
		this.editorMenuManager.add(new Separator("actions")); //$NON-NLS-1$
		this.editorMenuManager.add(new Separator("additions")); //$NON-NLS-1$
		this.editorMenuManager.add(new Separator("additions-end")); //$NON-NLS-1$

		// Prepare for CreateChild item addition or removal.
		this.createChildMenuManager = new MenuManager(Messages.UI_CreateChild_menu_item);
		this.createChildMenuManager.setRemoveAllWhenShown(true);
		this.createChildMenuManager.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(final IMenuManager manager) {
				// so that the "New Child" item is updated in the main menu
				updateMenu();
			}
		});

		this.editorMenuManager.insertBefore("additions", this.createChildMenuManager); //$NON-NLS-1$

		// Prepare for CreateSibling item addition or removal.
		// this.createSiblingMenuManager = new
		// MenuManager(Messages.UI_CreateSibling_menu_item);
		//		submenuManager.insertBefore("additions", this.createSiblingMenuManager); //$NON-NLS-1$

		// Force an update because Eclipse hides empty menus now.
		this.editorMenuManager.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(final IMenuManager menuManag) {
				menuManag.updateAll(true);
			}
		});

		addGlobalActions(this.editorMenuManager);
	}

	/**
	 * This generates a {@link org.eclipse.emf.edit.ui.action.CreateChildAction}
	 * for each object in <code>descriptors</code>, and returns the collection
	 * of these actions.
	 */
	protected Collection<IAction> generateCreateChildActions(final Collection<?> descriptors,
			final ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				actions.add(new CreateChildAction(this.fActiveEditor, selection, descriptor));
			}
		}
		return actions;
	}

	/**
	 * This generates a
	 * {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} for each
	 * object in <code>descriptors</code>, and returns the collection of these
	 * actions.
	 */
	protected Collection<IAction> generateCreateSiblingActions(final Collection<?> descriptors,
			final ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				actions.add(new CreateSiblingAction(this.fActiveEditor, selection, descriptor));
			}
		}
		return actions;
	}

	/**
	 * This populates the specified <code>manager</code> with
	 * {@link org.eclipse.jface.action.ActionContributionItem}s based on the
	 * {@link org.eclipse.jface.action.IAction}s contained in the
	 * <code>actions</code> collection, by inserting them before the specified
	 * contribution item <code>contributionID</code>. If
	 * <code>contributionID</code> is <code>null</code>, they are simply added.
	 */
	protected void populateManager(final IContributionManager manager,
			final Collection<? extends IAction> actions, final String contributionID) {
		if (actions != null) {
			for (IAction action : actions) {
				if (contributionID != null) {
					manager.insertBefore(contributionID, action);
				} else {
					manager.add(action);
				}
			}
		}
		// manager.add(this.loadMetamodelAction);
	}

	/**
	 * This removes from the specified <code>manager</code> all
	 * {@link org.eclipse.jface.action.ActionContributionItem}s based on the
	 * {@link org.eclipse.jface.action.IAction}s contained in the
	 * <code>actions</code> collection.
	 */
	protected void depopulateManager(final IContributionManager manager,
			final Collection<? extends IAction> actions) {
		if (actions != null) {
			IContributionItem[] items = manager.getItems();
			for (IContributionItem contributionItem : items) {
				// Look into SubContributionItems
				while (contributionItem instanceof SubContributionItem) {
					contributionItem = ((SubContributionItem) contributionItem).getInnerItem();
				}

				// Delete the ActionContributionItems with matching action.
				if (contributionItem instanceof ActionContributionItem) {
					IAction action = ((ActionContributionItem) contributionItem).getAction();
					if (actions.contains(action)) {
						manager.remove(contributionItem);
					}
				}
			}
		}
	}

	@Override
	protected boolean removeAllReferencesOnDelete() {
		return true;
	}

	/**
	 * Overridden to deny deleting elements from the EPackage registry
	 * (metamodels), and ask the user whether to delete an element from the
	 * whole model or only remove it from under a reference
	 */
	@Override
	protected DeleteAction createDeleteAction() {
		return new DeleteAction(removeAllReferencesOnDelete()) {
			@Override
			public Command createCommand(final Collection<?> selection) {
				if (allowEditing(selection)) {
					ISelection originalSelection = null;
					EcoreBrowser browser = getBrowser();
					if (browser != null) {
						originalSelection = browser.getEditorSelection();
					}
					LinkItem parentLinkItem = null;
					if (originalSelection instanceof IStructuredSelection) {
						IStructuredSelection structuredSelection = (IStructuredSelection) originalSelection;
						Iterator<?> iterator = structuredSelection.iterator();
						while (iterator.hasNext()) {
							Object selected = iterator.next();
							if (selected instanceof ModelElementItem) {
								ModelElementItem modelElementItem = (ModelElementItem) selected;
								ITreeElement treeParent = modelElementItem.getTreeParent();
								if (treeParent instanceof LinkItem) {
									LinkItem linkItem = (LinkItem) treeParent;
									if (parentLinkItem == null) {
										parentLinkItem = linkItem;
									} else if (parentLinkItem != linkItem) {
										parentLinkItem = null;
										break;
									}
								} else {
									parentLinkItem = null;
									break;
								}
							} else {
								parentLinkItem = null;
								break;
							}
						}
					}

					if (parentLinkItem != null) {
						EReference reference = parentLinkItem.getReference();
						if (!reference.isContainer() && !reference.isContainment()
								&& !reference.isDerived()) {
							return removeOrDeleteCommand(this.domain, selection,
									parentLinkItem.getParent(), reference);
						}
					}

					return super.createCommand(selection);
				}
				// editing not allowed
				return UnexecutableCommand.INSTANCE;
			}
		};
	}

	protected Command removeOrDeleteCommand(final EditingDomain domain,
			final Collection<?> selection, final EObject owner, final EReference reference) {
		final Command deleteCommand = DeleteCommand.create(domain, selection);
		final Command removeCommand;
		if (reference.isMany()) {
			removeCommand = RemoveCommand.create(domain, owner, reference, selection);
		} else {
			removeCommand = SetCommand.create(domain, owner, reference, null);
		}
		AbstractCommand askUserCommand = new AbstractCommand() {
			private static final int DELETE_FROM_MODEL = 0;
			private static final int REMOVE_FROM_LINK = 1;
			private static final int NO_OPERATION = 2;
			private int operation = -1;

			private void performCommand() {
				if (this.operation == DELETE_FROM_MODEL) {
					if (deleteCommand.canExecute()) {
						deleteCommand.execute();
					}
				} else if (this.operation == REMOVE_FROM_LINK) {
					if (removeCommand.canExecute()) {
						removeCommand.execute();
					}
				}
			}

			public void redo() {
				if (this.operation == DELETE_FROM_MODEL) {
					deleteCommand.redo();
				} else if (this.operation == REMOVE_FROM_LINK) {
					removeCommand.redo();
				}
			}

			@Override
			public boolean canExecute() {
				return deleteCommand.canExecute() || removeCommand.canExecute();
			}

			public void execute() {
				if (this.operation == -1) {
					if (deleteCommand.canExecute() && removeCommand.canExecute()) {
						MessageDialog dialog = new MessageDialog(null,
								Messages.BrowserActionBarContributor_deleteOrRemove, null,
								Messages.BrowserActionBarContributor_deleteOrRemove2,
								MessageDialog.QUESTION, new String[] {
										Messages.BrowserActionBarContributor_delete,
										Messages.BrowserActionBarContributor_remove }, 1) {
							{
								// style hint for MacOSX
								setShellStyle(getShellStyle() | SWT.SHEET);
							}
						};
						this.operation = dialog.open();
					} else if (deleteCommand.canExecute()) {
						if (MessageDialog.openQuestion(null,
								Messages.BrowserActionBarContributor_deleteElement,
								Messages.BrowserActionBarContributor_deleteButNotUnlink)) {
							this.operation = DELETE_FROM_MODEL;
						} else {
							this.operation = NO_OPERATION;
						}
					} else if (removeCommand.canExecute()) {
						if (MessageDialog.openQuestion(null,
								Messages.BrowserActionBarContributor_removeElement,
								Messages.BrowserActionBarContributor_removeButNotDelete)) {
							this.operation = REMOVE_FROM_LINK;
						} else {
							this.operation = NO_OPERATION;
						}
					}
				}
				performCommand();
			}

			@Override
			public boolean canUndo() {
				if (this.operation == DELETE_FROM_MODEL) {
					return deleteCommand.canUndo();
				} else if (this.operation == REMOVE_FROM_LINK) {
					return removeCommand.canUndo();
				}
				return true;
			}

			@Override
			public void undo() {
				if (this.operation == DELETE_FROM_MODEL) {
					deleteCommand.undo();
				} else if (this.operation == REMOVE_FROM_LINK) {
					removeCommand.undo();
				}
			}
		};
		return askUserCommand;
	}

	/**
	 * Overridden to deny deleting elements from the EPackage registry
	 * (metamodels)
	 */
	@Override
	protected CutAction createCutAction() {
		return new CutAction() {
			@Override
			public Command createCommand(final Collection<?> selection) {
				if (allowEditing(selection)) {
					return super.createCommand(selection);
				}
				return UnexecutableCommand.INSTANCE;
			}
		};
	}

	/**
	 * Returns false to avoid changing elements from the EPackage registry (i.e.
	 * metamodels)
	 *
	 * @see Bug 319015 - [Model Browser] Null Pointer after deleting a field in
	 *      a model
	 * @see Bug 319016 - [Model Browser] ClassCastException while saving a model
	 */
	private static boolean allowEditing(final Collection<?> selection) {
		for (Object selected : selection) {
			if (selected instanceof EObject) {
				EObject eObject = (EObject) selected;
				Resource eResource = eObject.eResource();
				if (eResource != null) {
					URI uri = eResource.getURI();
					if (uri != null
							&& EPackage.Registry.INSTANCE.getEPackage(uri.toString()) != null) {
						return false;
					}
				}
			}
		}
		return true;
	}

}
