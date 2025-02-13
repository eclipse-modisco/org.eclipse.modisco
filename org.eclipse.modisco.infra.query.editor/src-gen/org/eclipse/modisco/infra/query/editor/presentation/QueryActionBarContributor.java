/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - meta-model design
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas BROS (Mia-Software) - "Show In"
 *
 *
 * $Id$
 */
package org.eclipse.modisco.infra.query.editor.presentation;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.ControlAction;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CreateSiblingAction;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.action.ValidateAction;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.modisco.infra.query.editor.Messages;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.ContributionItemFactory;

/**
 * This is the action bar contributor for the Query model editor.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class QueryActionBarContributor
	extends EditingDomainActionBarContributor
	implements ISelectionChangedListener {
	/**
	 * This keeps track of the active editor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IEditorPart activeEditorPart;

	/**
	 * This keeps track of the current selection provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISelectionProvider selectionProvider;

	/**
	 * This action opens the Properties view.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IAction showPropertiesViewAction =
		new Action(QueryEditorPlugin.INSTANCE.getString("_UI_ShowPropertiesView_menu_item")) { //$NON-NLS-1$
			@Override
			public void run() {
				try {
					getPage().showView("org.eclipse.ui.views.PropertySheet"); //$NON-NLS-1$
				}
				catch (PartInitException exception) {
					QueryEditorPlugin.INSTANCE.log(exception);
				}
			}
		};

	/**
	 * This action refreshes the viewer of the current editor if the editor
	 * implements {@link org.eclipse.emf.common.ui.viewer.IViewerProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IAction refreshViewerAction =
		new Action(QueryEditorPlugin.INSTANCE.getString("_UI_RefreshViewer_menu_item")) { //$NON-NLS-1$
			@Override
			public boolean isEnabled() {
				return QueryActionBarContributor.this.activeEditorPart instanceof IViewerProvider;
			}

			@Override
			public void run() {
				if (QueryActionBarContributor.this.activeEditorPart instanceof IViewerProvider) {
					Viewer viewer = ((IViewerProvider)QueryActionBarContributor.this.activeEditorPart).getViewer();
					if (viewer != null) {
						viewer.refresh();
					}
				}
			}
		};

	/**
	 * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateChildAction} corresponding to each descriptor
	 * generated for the current selection by the item provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> createChildActions;

	/**
	 * This is the menu manager into which menu contribution items should be added for CreateChild actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMenuManager createChildMenuManager;

	/**
	 * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} corresponding to each descriptor
	 * generated for the current selection by the item provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> createSiblingActions;

	/**
	 * This is the menu manager into which menu contribution items should be added for CreateSibling actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMenuManager createSiblingMenuManager;

	private final LoadMetaModelResourceAction loadMetaModelAction;

	/**
	 * This creates an instance of the contributor. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public QueryActionBarContributor() {
		super(ADDITIONS_LAST_STYLE);
		// this.loadResourceAction = new LoadResourceAction();
		this.loadMetaModelAction = new LoadMetaModelResourceAction(); 
		this.validateAction = new ValidateAction();
		this.controlAction = new ControlAction();
	}

	/**
	 * This adds Separators for editor additions to the tool bar.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void contributeToToolBar(final IToolBarManager toolBarManager) {
		toolBarManager.add(new Separator("query-settings")); //$NON-NLS-1$
		toolBarManager.add(new Separator("query-additions")); //$NON-NLS-1$
	}

	/**
	 * This adds to the menu bar a menu and some separators for editor additions,
	 * as well as the sub-menus for object creation items.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void contributeToMenu(final IMenuManager menuManager) {
		super.contributeToMenu(menuManager);

		IMenuManager submenuManager = new MenuManager(QueryEditorPlugin.INSTANCE.getString("_UI_QueryEditor_menu"), "org.eclipse.modisco.infra.queryMenuID"); //$NON-NLS-1$ //$NON-NLS-2$
		menuManager.insertAfter("additions", submenuManager); //$NON-NLS-1$
		submenuManager.add(new Separator("settings")); //$NON-NLS-1$
		submenuManager.add(new Separator("actions")); //$NON-NLS-1$
		submenuManager.add(new Separator("additions")); //$NON-NLS-1$
		submenuManager.add(new Separator("additions-end")); //$NON-NLS-1$

		// Prepare for CreateChild item addition or removal.
		//
		this.createChildMenuManager = new MenuManager(QueryEditorPlugin.INSTANCE.getString("_UI_CreateChild_menu_item")); //$NON-NLS-1$
		submenuManager.insertBefore("additions", this.createChildMenuManager); //$NON-NLS-1$

		// Prepare for CreateSibling item addition or removal.
		//
		this.createSiblingMenuManager = new MenuManager(QueryEditorPlugin.INSTANCE.getString("_UI_CreateSibling_menu_item")); //$NON-NLS-1$
		submenuManager.insertBefore("additions", this.createSiblingMenuManager); //$NON-NLS-1$

		// Force an update because Eclipse hides empty menus now.
		//
		submenuManager.addMenuListener
			(new IMenuListener() {
				 public void menuAboutToShow(final IMenuManager menuManager) {
					 menuManager.updateAll(true);
				 }
			 });

		addGlobalActions(submenuManager);
	}

	/**
	 * When the active editor changes, this remembers the change and registers with it as a selection provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActiveEditor(final IEditorPart part) {
		super.setActiveEditor(part);
		this.activeEditorPart = part;

		// Switch to the new selection provider.
		//
		if (this.selectionProvider != null) {
			this.selectionProvider.removeSelectionChangedListener(this);
		}
		if (part == null) {
			this.selectionProvider = null;
		}
		else {
			this.selectionProvider = part.getSite().getSelectionProvider();
			this.selectionProvider.addSelectionChangedListener(this);

			// Fake a selection changed event to update the menus.
			//
			if (this.selectionProvider.getSelection() != null) {
				selectionChanged(new SelectionChangedEvent(this.selectionProvider, this.selectionProvider.getSelection()));
			}
		}
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionChangedListener},
	 * handling {@link org.eclipse.jface.viewers.SelectionChangedEvent}s by querying for the children and siblings
	 * that can be added to the selected object and updating the menus accordingly.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void selectionChanged(final SelectionChangedEvent event) {
		// Remove any menu items for old selection.
		//
		if (this.createChildMenuManager != null) {
			depopulateManager(this.createChildMenuManager, this.createChildActions);
		}
		if (this.createSiblingMenuManager != null) {
			depopulateManager(this.createSiblingMenuManager, this.createSiblingActions);
		}

		// Query the new selection for appropriate new child/sibling descriptors
		//
		Collection<?> newChildDescriptors = null;
		Collection<?> newSiblingDescriptors = null;

		ISelection selection = event.getSelection();
		if (selection instanceof IStructuredSelection && ((IStructuredSelection)selection).size() == 1) {
			Object object = ((IStructuredSelection)selection).getFirstElement();

			EditingDomain domain = ((IEditingDomainProvider)this.activeEditorPart).getEditingDomain();

			newChildDescriptors = domain.getNewChildDescriptors(object, null);
			newSiblingDescriptors = domain.getNewChildDescriptors(null, object);
		}

		// Generate actions for selection; populate and redraw the menus.
		//
		this.createChildActions = generateCreateChildActions(newChildDescriptors, selection);
		this.createSiblingActions = generateCreateSiblingActions(newSiblingDescriptors, selection);

		if (this.createChildMenuManager != null) {
			populateManager(this.createChildMenuManager, this.createChildActions, null);
			this.createChildMenuManager.update(true);
		}
		if (this.createSiblingMenuManager != null) {
			populateManager(this.createSiblingMenuManager, this.createSiblingActions, null);
			this.createSiblingMenuManager.update(true);
		}
	}

	/**
	 * This generates a {@link org.eclipse.emf.edit.ui.action.CreateChildAction} for each object in <code>descriptors</code>,
	 * and returns the collection of these actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> generateCreateChildActions(final Collection<?> descriptors, final ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				actions.add(new CreateChildAction(this.activeEditorPart, selection, descriptor));
			}
		}
		return actions;
	}

	/**
	 * This generates a {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} for each object in <code>descriptors</code>,
	 * and returns the collection of these actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> generateCreateSiblingActions(final Collection<?> descriptors, final ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				actions.add(new CreateSiblingAction(this.activeEditorPart, selection, descriptor));
			}
		}
		return actions;
	}

	/**
	 * This populates the specified <code>manager</code> with {@link org.eclipse.jface.action.ActionContributionItem}s
	 * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection,
	 * by inserting them before the specified contribution item <code>contributionID</code>.
	 * If <code>contributionID</code> is <code>null</code>, they are simply added.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void populateManager(final IContributionManager manager, final Collection<? extends IAction> actions, final String contributionID) {
		if (actions != null) {
			for (IAction action : actions) {
				if (contributionID != null) {
					manager.insertBefore(contributionID, action);
				}
				else {
					manager.add(action);
				}
			}
		}
	}
		
	/**
	 * This removes from the specified <code>manager</code> all {@link org.eclipse.jface.action.ActionContributionItem}s
	 * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void depopulateManager(final IContributionManager manager, final Collection<? extends IAction> actions) {
		if (actions != null) {
			IContributionItem[] items = manager.getItems();
			for (int i = 0; i < items.length; i++) {
				// Look into SubContributionItems
				//
				IContributionItem contributionItem = items[i];
				while (contributionItem instanceof SubContributionItem) {
					contributionItem = ((SubContributionItem)contributionItem).getInnerItem();
				}

				// Delete the ActionContributionItems with matching action.
				//
				if (contributionItem instanceof ActionContributionItem) {
					IAction action = ((ActionContributionItem)contributionItem).getAction();
					if (actions.contains(action)) {
						manager.remove(contributionItem);
					}
				}
			}
		}
	}

	/**
	 * This populates the pop-up menu before it appears.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void menuAboutToShow(final IMenuManager menuManager) {
		super.menuAboutToShow(menuManager);
		MenuManager submenuManager = null;

		submenuManager = new MenuManager(QueryEditorPlugin.INSTANCE.getString("_UI_CreateChild_menu_item")); //$NON-NLS-1$
		populateManager(submenuManager, this.createChildActions, null);
		menuManager.insertBefore("edit", submenuManager); //$NON-NLS-1$

		submenuManager = new MenuManager(QueryEditorPlugin.INSTANCE.getString("_UI_CreateSibling_menu_item")); //$NON-NLS-1$
		populateManager(submenuManager, this.createSiblingActions, null);
		menuManager.insertBefore("edit", submenuManager); //$NON-NLS-1$
	}

	/**
	 * This inserts global actions before the "additions-end" separator. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	protected void addGlobalActions(final IMenuManager menuManager) {
		if (activeEditorPart != null) {
			IMenuManager showInMenu = new MenuManager(Messages.QueryActionBarContributor_ShowIn);
			showInMenu.add(ContributionItemFactory.VIEWS_SHOW_IN
					.create(activeEditorPart.getSite().getWorkbenchWindow()));
			menuManager.insertAfter("edit", new Separator()); //$NON-NLS-1$
			menuManager.insertAfter("edit", showInMenu); //$NON-NLS-1$
		}
		
		menuManager.insertAfter("additions-end", new Separator("ui-actions")); //$NON-NLS-1$ //$NON-NLS-2$
		menuManager.insertAfter("ui-actions", this.showPropertiesViewAction); //$NON-NLS-1$

		this.refreshViewerAction.setEnabled(this.refreshViewerAction.isEnabled());		
		menuManager.insertAfter("ui-actions", this.refreshViewerAction); //$NON-NLS-1$

		if (this.loadMetaModelAction != null) {
			menuManager.insertBefore("additions-end", //$NON-NLS-1$
					new ActionContributionItem(this.loadMetaModelAction));
			menuManager.insertBefore("additions-end", new Separator()); //$NON-NLS-1$
		}
		
		super.addGlobalActions(menuManager);
	}

	/**
	 * This ensures that a delete action will clean up all references to deleted objects.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean removeAllReferencesOnDelete() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor#activate
	 * ()
	 */
	@Override
	public void activate() {
		super.activate();
		if (this.loadMetaModelAction != null) {
			this.loadMetaModelAction.setActiveWorkbenchPart(this.activeEditor);
		}
		update();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor#deactivate
	 * ()
	 */
	@Override
	public void deactivate() {
		super.deactivate();
		if (this.loadMetaModelAction != null) {
			this.loadMetaModelAction.setActiveWorkbenchPart(null);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor#update()
	 */
	@Override
	public void update() {
		super.update();
		if (this.loadMetaModelAction != null) {
			this.loadMetaModelAction.update();
		}
	}

}