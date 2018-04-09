/*******************************************************************************
 * Copyright (c) 2012 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.ui.util;

import java.util.Comparator;
import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.infra.discovery.ui.Activator;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog;

/**
 * Dialog for selecting the discoverers
 * @author Guillaume Doux
 *
 */

public class DiscovererSelectionDialog extends FilteredItemsSelectionDialog {

	public DiscovererSelectionDialog(final Shell shell, final boolean multi) {
		super(shell, multi);
		setTitle("Select the discoverers");
		setSelectionHistory(new ResourceSelectionHistory());
	}


	/**
	 * multiple choice by default
	 * @param shell
	 */
	public DiscovererSelectionDialog(final Shell shell) {
		super(shell, true);
		setTitle("Select the discoverers");
		setSelectionHistory(new ResourceSelectionHistory());
	}

	private class ResourceSelectionHistory extends SelectionHistory {

		@Override
		protected Object restoreItemFromMemento(final IMemento memento) {
			return null;
		}
		@Override
		protected void storeItemToMemento(final Object item, final IMemento memento) {
		}
	}


	private static final String DIALOG_SETTINGS = "DiscovererSelectionDialogSettings";

	@Override
	protected Control createExtendedContentArea(final Composite parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected IDialogSettings getDialogSettings() {
		IDialogSettings settings = Activator.getDefault().getDialogSettings()
				.getSection(DIALOG_SETTINGS);
		if (settings == null) {
			settings = Activator.getDefault().getDialogSettings()
					.addNewSection(DIALOG_SETTINGS);
		}
		return settings;
	}

	@Override
	protected IStatus validateItem(final Object item) {
		if (((DiscovererDescription) item).getSourceType() == IProject.class) {
			return Status.OK_STATUS;
		} else {
			return Status.CANCEL_STATUS;
		}
	}

	@Override
	protected ItemsFilter createFilter() {
		return new ItemsFilter() {
			public boolean matchItem(final Object item) {
				return matches(((DiscovererDescription) item).getId());
			}
			public boolean isConsistentItem(final Object item) {
				return true;
			}
		};
	}

	@Override
	protected Comparator getItemsComparator() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	protected void fillContentProvider(final AbstractContentProvider contentProvider,
			final ItemsFilter itemsFilter, final IProgressMonitor progressMonitor)
					throws CoreException {
		progressMonitor.beginTask("Searching", IDiscoveryManager.INSTANCE.getDiscoverers().size());
		for (Iterator iter = IDiscoveryManager.INSTANCE.getDiscoverers().iterator(); iter.hasNext();) {
			contentProvider.add(iter.next(), itemsFilter);
			progressMonitor.worked(1);
		}
		progressMonitor.done();
	}

	@Override
	public String getElementName(final Object item) {
		return ((DiscovererDescription) item).getId();
	}

}
