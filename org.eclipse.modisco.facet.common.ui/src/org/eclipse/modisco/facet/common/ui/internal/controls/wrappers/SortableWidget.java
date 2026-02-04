/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 334116 - common tree view with columns
 *******************************************************************************/
package org.eclipse.modisco.facet.common.ui.internal.controls.wrappers;

import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Tree;

/** Provides a unified API over both SWT {@link Tree} and {@link Table} */
public interface SortableWidget {
	void setSorter(ViewerSorter viewerSorter);

	int getSortDirection();

	void setSortDirection(int direction);

	void setSortColumn(Column column);

	void refresh();

}