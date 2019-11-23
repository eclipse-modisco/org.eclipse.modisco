/*******************************************************************************
 * Copyright (c) 2012, 2016 CEA LIST, and Mia-Software.
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
package org.eclipse.modisco.facet.util.ui.internal.dialog;

import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IDialogCallback;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IQuestionDialog;
import org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IQuestionDialogFactory;
import org.eclipse.modisco.facet.util.ui.internal.sync.generated.SynchronizedQuestionDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class QuestionDialogFactory implements IQuestionDialogFactory {

	public IQuestionDialog createQuestionDialog(final Shell parent, final String title, final String message) {
		final QuestionDialog questionDialog = new QuestionDialog(parent, title, message, null);
		return new SynchronizedQuestionDialog(questionDialog, Display.getDefault());
	}

	public IQuestionDialog createQuestionDialog(final Shell parent,
			final String title, final String message,
			final IDialogCallback<Boolean> callback) {
		final QuestionDialog questionDialog = new QuestionDialog(parent, title, message, callback);
		return new SynchronizedQuestionDialog(questionDialog, Display.getDefault());
	}

}

