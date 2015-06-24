/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.uicore.examples.cnf;

import org.eclipse.core.resources.IFile;
import org.eclipse.gmt.modisco.infra.browser.uicore.CustomizableModelContentProvider;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.resources.ProjectExplorer;

/**
 * @deprecated Will be replaced by EMF Facet,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class MoDiscoContentProvider extends CustomizableModelContentProvider {

	public MoDiscoContentProvider() {
		super(Activator.getDefault().getCustomizationManager());
	}

	@Override
	public Object[] getChildren(final Object parentElement) {
		if (parentElement instanceof IFile) {
			// hook the custom painter at the moment the extension is
			// effectively used
			hookCustomPainter();
			return getElements(parentElement);
		}
		return super.getChildren(parentElement);
	}

	@Override
	public boolean hasChildren(final Object element) {
		if (element instanceof IFile) {
			return true;
		}
		return super.hasChildren(element);
	}

	private static final String CUSTOM_PAINTER_INSTALLED = "modiscoCustomPainterInstalled"; //$NON-NLS-1$

	/**
	 * Hook the custom painter to the Project Explorer's tree widget, if it is
	 * not already installed. This painter is necessary to display some
	 * customizations, like struckthrough and underlined, Facet overlay icons,
	 * and a down-pointing arrow on ordered references.
	 */
	private void hookCustomPainter() {
		try {
			IViewPart viewPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
					.getActivePage().findView(ProjectExplorer.VIEW_ID);
			if (viewPart instanceof ProjectExplorer) {
				ProjectExplorer projectExplorer = (ProjectExplorer) viewPart;
				Tree tree = projectExplorer.getCommonViewer().getTree();
				if (tree.getData(MoDiscoContentProvider.CUSTOM_PAINTER_INSTALLED) == null) {
					Activator.getDefault().getCustomizationManager().installCustomPainter(tree);
					tree.setData(MoDiscoContentProvider.CUSTOM_PAINTER_INSTALLED, Boolean.TRUE);
				}
			}
		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}
}
