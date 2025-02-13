/*******************************************************************************
 * Copyright (c) 2012, 2019 CEA LIST, and Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - Bug 366367 - To be able to change the "CanBePresentedInTheTable" query
 *     Gregoire Dupe (Mia-Software) - Bug 374903 - [Table] ITableWidget.setLoadedFacetSets
 *     Thomas Cicognani (Mia-Software) - Bug 500437 - IQuestionDialogFactory not synchronized
 *******************************************************************************/
package org.eclipse.modisco.facet.util.ui.internal.exported.dialog;

import org.eclipse.modisco.facet.util.ui.internal.dialog.QuestionDialogFactory;
import org.eclipse.modisco.facet.util.ui.internal.sync.generated.SynchronizedQuestionDialogFactory;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/** A factory to instantiate {@link IQuestionDialog} */
public interface IQuestionDialogFactory {
	IQuestionDialogFactory INSTANCE = new SynchronizedQuestionDialogFactory(new QuestionDialogFactory(),
			Display.getDefault());

	/**
	 * Instantiates a question dialog (without opening it)
	 * 
	 * @param parent
	 *            the parent shell for the new dialog
	 * @param title
	 *            the text that appears in the title of the dialog
	 * @param message
	 *            the text that appears in the message area of the dialog
	 * @return the dialog, ready to be {@link IQuestionDialog#open() opened}
	 */
	@Deprecated
	IQuestionDialog createQuestionDialog(Shell parent, String title, String message);
	
	/**
	 * Instantiates a question dialog (without opening it)
	 * 
	 * @param parent
	 *            the parent shell for the new dialog
	 * @param title
	 *            the text that appears in the title of the dialog
	 * @param message
	 *            the text that appears in the message area of the dialog
	 * @return the dialog, ready to be {@link IQuestionDialog#open() opened}
	 * @since 0.2
	 */
	IQuestionDialog createQuestionDialog(Shell parent, String title,
			String message, IDialogCallback<Boolean> callback);
}
