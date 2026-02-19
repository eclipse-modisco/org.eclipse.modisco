/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.query.ui.dialogs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IOpenListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.OpenEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.common.ui.internal.util.ImageProvider;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.modisco.infra.query.ui.Activator;
import org.eclipse.modisco.infra.query.ui.Messages;
import org.eclipse.modisco.infra.query.ui.controls.QueryFilteredTree;
import org.eclipse.modisco.infra.query.ui.wizards.CreateQueryWizard;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;

/**
 * A dialog to select a {@link ModelQuery}
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class QuerySelectionDialog extends Dialog {

	private static final int INITIAL_WIDTH = 400;
	private static final int INITIAL_HEIGHT = 400;
	private Collection<ModelQuerySet> fQuerySets;
	private final List<ViewerFilter> viewerFilters;
	private QueryFilteredTree filteredTree;
	private final boolean multiSelection;
	private List<ModelQuery> selectedQueries;

	/**
	 * @param parentShell
	 *            the parent shell
	 * @param querySets
	 *            the query sets from which queries will be selectable. If
	 *            <code>null</code>, all query sets will be displayed.
	 * @param viewerFilters
	 *            optional filters for selectable queries (can be
	 *            <code>null</code> if no filtering is required)
	 */
	public QuerySelectionDialog(final Shell parentShell, final boolean multiSelection,
			final Collection<ModelQuerySet> querySets, final List<ViewerFilter> viewerFilters) {
		super(parentShell);
		this.multiSelection = multiSelection;
		if (querySets == null) {
			this.fQuerySets = ModelQuerySetCatalog.getSingleton().getAllModelQuerySets();
		} else {
			this.fQuerySets = querySets;
		}
		this.viewerFilters = viewerFilters;
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		// composite.setLayout(new GridLayout());
		this.filteredTree = new QueryFilteredTree(composite, this.fQuerySets, this.viewerFilters,
				this.multiSelection);

		createContextMenu(this.filteredTree.getViewer());

		// double-click or enter to choose the selected query
		this.filteredTree.getViewer().addOpenListener(new IOpenListener() {
			public void open(final OpenEvent event) {
				QuerySelectionDialog.this.okPressed();
			}
		});
		return composite;
	}

	private class OpenCreateQueryWizardAction extends Action {
		private final ModelQuerySet modelQuerySet;

		public OpenCreateQueryWizardAction(final ModelQuerySet modelQuerySet) {
			this.modelQuerySet = modelQuerySet;
			setText(Messages.QuerySelectionDialog_createQuery);
		}

		@SuppressWarnings("synthetic-access")
		@Override
		public void run() {
			final CreateQueryWizard createQueryWizard = new CreateQueryWizard(this.modelQuerySet,
					null, null, null);
			WizardDialog wizardDialog = new WizardDialog(null, createQueryWizard);
			if (wizardDialog.open() == Window.OK) {
				Job refreshJob = new Job(Messages.QuerySelectionDialog_refreshQuerySetsJob) {
					@Override
					protected IStatus run(final IProgressMonitor monitor) {
						try {
							// rebuild the query catalog
							ResourcesPlugin.getWorkspace().build(
									IncrementalProjectBuilder.FULL_BUILD, monitor);
						} catch (CoreException e) {
							Logger.logError(e, Activator.getDefault());
						}
						// the query sets have been re-created => find by name
						Collection<ModelQuerySet> oldQuerySets = new ArrayList<ModelQuerySet>(
								QuerySelectionDialog.this.fQuerySets);
						final Collection<ModelQuerySet> newQuerySets = new ArrayList<ModelQuerySet>();
						for (ModelQuerySet oldQuerySet : oldQuerySets) {
							ModelQuerySet querySet = ModelQuerySetCatalog.getSingleton()
									.getModelQuerySet(oldQuerySet.getName());
							if (querySet != null) {
								newQuerySets.add(querySet);
							}
						}
						QuerySelectionDialog.this.fQuerySets = newQuerySets;
						Display.getDefault().asyncExec(new Runnable() {
							public void run() {
								QuerySelectionDialog.this.filteredTree.setInput(newQuerySets);
								// select the created query
								ModelQuery createdModelQuery = createQueryWizard
										.getCreatedModelQuery();
								ModelQuerySet querySet = ModelQuerySetCatalog.getSingleton()
										.getModelQuerySet(
												createdModelQuery.getModelQuerySet().getName());
								ModelQuery query = querySet.getQuery(createdModelQuery.getName());
								QuerySelectionDialog.this.filteredTree.getViewer().setSelection(
										new StructuredSelection(query), true);
							}
						});
						return Status.OK_STATUS;
					}
				};
				refreshJob.setPriority(Job.DECORATE);
				refreshJob.schedule();
			}
		}
	}

	private void createContextMenu(final TreeViewer viewer) {
		final MenuManager contextMenu = new MenuManager("#PopUp"); //$NON-NLS-1$
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(final IMenuManager manager) {
				ISelection selection = viewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection structuredSelection = (IStructuredSelection) selection;
					if (structuredSelection.size() == 1) {
						Object firstElement = structuredSelection.getFirstElement();
						if (firstElement instanceof ModelQuerySet) {
							final ModelQuerySet modelQuerySet = (ModelQuerySet) firstElement;
							manager.add(new OpenCreateQueryWizardAction(modelQuerySet));
							return;
						}
					}
				}
				manager.add(new OpenCreateQueryWizardAction(null));
			}
		});
		final Menu menu = contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
	}

	@Override
	protected void configureShell(final Shell shell) {
		super.configureShell(shell);
		shell.setText(Messages.QuerySelectionDialog_selectQuery);
		shell.setImage(ImageProvider.getInstance().getModiscoLogo());
		IDialogSettings dialogBoundsSettings = getDialogBoundsSettings();
		// initialize size if not yet saved (see Dialog#DIALOG_WIDTH)
		if (dialogBoundsSettings.get("DIALOG_WIDTH") == null) { //$NON-NLS-1$
			Rectangle parent = getParentShell().getBounds();
			// Rectangle desktop = Display.getCurrent().getClientArea();
			// center
			shell.setBounds(parent.x + parent.width / 2 - QuerySelectionDialog.INITIAL_WIDTH / 2,
					parent.y + parent.height / 2 - QuerySelectionDialog.INITIAL_HEIGHT / 2,
					QuerySelectionDialog.INITIAL_WIDTH, QuerySelectionDialog.INITIAL_HEIGHT);
		}
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected IDialogSettings getDialogBoundsSettings() {
		final String sectionName = this.getClass().getName() + ".settings"; //$NON-NLS-1$
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
		IDialogSettings section = settings.getSection(sectionName);
		if (section == null) {
			section = settings.addNewSection(sectionName);
		}
		return section;
	}

	@Override
	protected void okPressed() {
		this.selectedQueries = new ArrayList<ModelQuery>();
		ISelection selection = this.filteredTree.getViewer().getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Iterator<?> iterator = structuredSelection.iterator();
			while (iterator.hasNext()) {
				Object selectedElement = iterator.next();
				if (selectedElement instanceof ModelQuery) {
					this.selectedQueries.add((ModelQuery) selectedElement);
				}
			}
		}
		super.okPressed();
	}

	public List<ModelQuery> getSelectedQueries() {
		return Collections.unmodifiableList(this.selectedQueries);
	}
}
