/*******************************************************************************
 * Copyright (c) 2008 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Hugues Dubourg (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.gmt.modisco.kdm.uml2converter.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.gmt.modisco.kdm.uml2converter.KdmToUmlConverter;
import org.eclipse.gmt.modisco.kdm.uml2converter.impl.KdmtoUmlConverterImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.dialogs.SaveAsDialog;

/**
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474827
 */
@Deprecated
public class ExportTransformation implements IObjectActionDelegate {

	private IProject containingProject;
	private Shell shell;
	
	public void setActivePart(final IAction action, final IWorkbenchPart targetPart) {
		this.shell = targetPart.getSite().getShell();		
	}

	public void run(final IAction action) {
		
		SaveAsDialog dialog = new SaveAsDialog(this.shell);
		dialog.open();

		IPath path = dialog.getResult();
		
		KdmToUmlConverter converter = new KdmtoUmlConverterImpl();
		converter.exportKdmToUmlTransformation(path);
	}

	public void selectionChanged(final IAction action, final ISelection selection) {
		Object source = ((IStructuredSelection) selection).getFirstElement();
		if (source instanceof IFile) {
			this.containingProject = ((IFile) source).getProject();
		}
		if (source instanceof IFolder) {
			this.containingProject = ((IFolder) source).getProject();
		}

	}

}
