/**
 * *******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 */
package org.eclipse.modisco.java.composition.ui.strategies;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.java.composition.ui.Activator;
import org.eclipse.modisco.java.emf.JavaPackage;
import org.eclipse.modisco.kdm.source.extension.ui.interfaces.RevealingStrategy;
import org.eclipse.modisco.omg.kdm.source.SourceRegion;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.texteditor.AbstractTextEditor;

public class StrategyRevealingJava implements RevealingStrategy {

	private static final String METAMODEL_URI = JavaPackage.eINSTANCE
			.getNsURI();

	public void revealInTextEditor(final IFile inputFile,
			final SourceRegion sourceRegion) {

		Display.getDefault().asyncExec(new Runnable() {
			public void run() {

				IWorkbenchPage activePage = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();

				IEditorPart iEditorPart = null;
				// Look for an opened editor with the file in it
				for (IEditorReference editorReference : PlatformUI
						.getWorkbench().getActiveWorkbenchWindow()
						.getActivePage().getEditorReferences()) {

					IEditorPart editorTmp = editorReference.getEditor(false);

					if (editorTmp instanceof AbstractTextEditor) {
						AbstractTextEditor abstractTextEditor = (AbstractTextEditor) editorTmp;
						if (inputFile.getName().equalsIgnoreCase(
								abstractTextEditor.getEditorInput().getName())) {
							iEditorPart = editorTmp;
							break;
						}
					}
				}
				// If no opened editor, then open a new one
				if (iEditorPart == null) {
					try {
						iEditorPart = IDE.openEditor(activePage, inputFile,
								true);
					} catch (PartInitException e) {
						MoDiscoLogger.logError(e, Activator.getDefault());
					}
				}

				selectInTextEditor(iEditorPart, sourceRegion);

			}
		});
	}

	public boolean isApplicableTo(final Notifier target) {
		if (target instanceof EObject) {
			return ((EObject) target).eClass().getEPackage().getNsURI()
					.equalsIgnoreCase(StrategyRevealingJava.METAMODEL_URI);
		}
		return false;
	}

	public void selectInTextEditor(final IEditorPart iEditorPart,
			final SourceRegion sourceRegion) {
		if (iEditorPart != null) {
			AbstractTextEditor abstractTextEditor = (AbstractTextEditor) iEditorPart;

			abstractTextEditor.getSite().getPage()
					.activate(abstractTextEditor.getSite().getPart());

			abstractTextEditor.selectAndReveal(sourceRegion.getStartPosition()
					.intValue(), sourceRegion.getEndPosition().intValue()
					- sourceRegion.getStartPosition().intValue());
		}

	}

}
