/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.tests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gmt.modisco.infra.discoverymanager.ui.launch.utils.BooleanCellEditor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

/**
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=343840
 */
@Deprecated
public class BooleanCellEditorTestDialog extends Dialog {

	protected BooleanCellEditorTestDialog(final Shell parentShell) {
		super(parentShell);
	}

	protected class Data {
		private final String name;
		private Boolean value;

		public Data(final String name, final Boolean value) {
			this.name = name;
			this.value = value;
		}
	}

	protected final List<Data> fInput = new ArrayList<Data>();

	@Override
	protected Control createDialogArea(final Composite parent) {

		this.fInput.add(new Data("abc", Boolean.TRUE));
		this.fInput.add(new Data("def", Boolean.FALSE));

		final TreeViewer treeViewer = new TreeViewer(parent, SWT.FULL_SELECTION);
		TreeViewerColumn nameColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		nameColumn.getColumn().setWidth(100);
		TreeViewerColumn valueColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		valueColumn.setEditingSupport(new EditingSupport(treeViewer) {

			@Override
			protected void setValue(final Object element, final Object value) {
				Data data = (Data) element;
				data.value = (Boolean) value;
				treeViewer.refresh();
			}

			@Override
			protected Object getValue(final Object element) {
				Data data = (Data) element;
				return data.value;
			}

			@Override
			protected CellEditor getCellEditor(final Object element) {
				BooleanCellEditor booleanCellEditor = new BooleanCellEditor();
				booleanCellEditor.create(treeViewer.getTree());
				return booleanCellEditor;
			}

			@Override
			protected boolean canEdit(final Object element) {
				return true;
			}
		});
		valueColumn.getColumn().setWidth(100);

		treeViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		treeViewer.setLabelProvider(new ITableLabelProvider() {
			public void removeListener(final ILabelProviderListener listener) {
				//
			}

			public boolean isLabelProperty(final Object element, final String property) {
				return false;
			}

			public void dispose() {
				//
			}

			public void addListener(final ILabelProviderListener listener) {
				//
			}

			public String getColumnText(final Object element, final int columnIndex) {
				Data data = (Data) element;
				if (columnIndex == 0) {
					return data.name;
				} else if (columnIndex == 1) {
					return data.value.toString();
				}
				throw new IllegalArgumentException();
			}

			public Image getColumnImage(final Object element, final int columnIndex) {
				return null;
			}
		});
		treeViewer.setContentProvider(new ITreeContentProvider() {

			public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
				//
			}

			public void dispose() {
				//
			}

			public boolean hasChildren(final Object element) {
				return false;
			}

			public Object getParent(final Object element) {
				return null;
			}

			public Object[] getElements(final Object inputElement) {
				if (inputElement instanceof List<?>) {
					@SuppressWarnings("unchecked")
					List<Data> input = (List<Data>) inputElement;
					return input.toArray();
				}
				return new Object[0];

			}

			public Object[] getChildren(final Object parentElement) {
				return null;
			}
		});
		treeViewer.setInput(this.fInput);
		return treeViewer.getControl();
	}
}
