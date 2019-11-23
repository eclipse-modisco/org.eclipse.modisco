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
package org.eclipse.modisco.infra.discovery.ui.internal.wizards;

import java.util.ArrayList;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.modisco.infra.common.ui.internal.util.JavaUtils;
import org.eclipse.modisco.infra.discovery.ui.Messages;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/** A cell editor for choosing a Java type. */
public class TypeCellEditor extends DialogCellEditor {

	public interface IJavaProjectProvider {
		IJavaProject getJavaProject();
	}

	private final IJavaProjectProvider javaProjectProvider;

	public TypeCellEditor(final Composite parent, final IJavaProjectProvider javaProjectProvider) {
		super(parent);
		this.javaProjectProvider = javaProjectProvider;
	}

	@Override
	protected Object openDialogBox(final Control cellEditorWindow) {

		IJavaProject project = this.javaProjectProvider.getJavaProject();

		ArrayList<String> bundlesInSearchPath = new ArrayList<String>();
		bundlesInSearchPath.add("org.eclipse.emf.ecore"); //$NON-NLS-1$
		IType type = JavaUtils.openTypeSelectionDialog(project, bundlesInSearchPath,
				cellEditorWindow.getShell(), null, IJavaElementSearchConstants.CONSIDER_ALL_TYPES,
				Messages.TypeCellEditor_chooseParamType,
				Messages.TypeCellEditor_chooseParamTypeLong);
		if (type != null) {
			return type.getFullyQualifiedName('.');
		}
		return null;
	}
}
