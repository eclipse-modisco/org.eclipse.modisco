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
package org.eclipse.gmt.modisco.infra.query.ui.views.queryExecution.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.common.ui.internal.controls.Tooltip;
import org.eclipse.gmt.modisco.infra.query.ModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.IModelQueryTooltip;
import org.eclipse.gmt.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.gmt.modisco.infra.query.ui.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TreeItem;

/**
 * Add a tooltip to the tree, that appears when the mouse hovers over a
 * {@link ModelQuery}, to display information about that query (name, return
 * type, description, ...)
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class QueryTooltip extends Tooltip {

	public QueryTooltip() {
		initModelQueryTooltips();
	}

	private StyledText fStyledText;
	private List<IModelQueryTooltip> queryTooltips;

	@Override
	protected void createTooltipContent(final Shell shell, final String text,
			final Display display, final TreeItem item) {
		shell.setBackground(display.getSystemColor(SWT.COLOR_INFO_BACKGROUND));
		FillLayout layout = new FillLayout();
		layout.marginWidth = 2;
		shell.setLayout(layout);
		this.fStyledText = new StyledText(shell, SWT.NONE);
		this.fStyledText.setForeground(display.getSystemColor(SWT.COLOR_INFO_FOREGROUND));
		this.fStyledText.setBackground(display.getSystemColor(SWT.COLOR_INFO_BACKGROUND));

		setTextFor(item, this.fStyledText);
		addMouseExitListener(this.fStyledText);
	}

	protected void setTextFor(final TreeItem item, final StyledText styledText) {
		Object data = item.getData();
		if (!(data instanceof EObject)) {
			data = Platform.getAdapterManager().getAdapter(data, EObject.class);
		}
		if (data instanceof ModelQuery) {
			ModelQuery modelQuery = (ModelQuery) data;
			setTextFor(modelQuery, styledText);
		}
	}

	protected void setTextFor(final ModelQuery modelQuery, final StyledText styledText) {

		// use tooltip provided through the extension point
		for (IModelQueryTooltip tooltipImpl : this.queryTooltips) {
			if (tooltipImpl.getHandledQueryType().equals(modelQuery.eClass())) {
				tooltipImpl.setTextFor(modelQuery, styledText);
				return;
			}
		}

		String tooltipText = ""; //$NON-NLS-1$
		StringBuilder builder = new StringBuilder();

		if (modelQuery.getScope() != null && modelQuery.getScope().size() > 0) {
			if (modelQuery.getScope().size() > 1) {
				builder.append("("); //$NON-NLS-1$
			}
			for (int i = 0; i < modelQuery.getScope().size(); i++) {
				builder.append(modelQuery.getScope().get(i).getName());
				if (i != modelQuery.getScope().size() - 1) {
					builder.append(", "); //$NON-NLS-1$
				}
			}
			if (modelQuery.getScope().size() > 1) {
				builder.append(")"); //$NON-NLS-1$
			}
			builder.append("::"); //$NON-NLS-1$
		}
		builder.append(modelQuery.getName()).append("()"); //$NON-NLS-1$
		if (modelQuery.getReturnType() != null) {
			builder.append(" : ").append(modelQuery.getReturnType().getName()); //$NON-NLS-1$
			if (modelQuery.getUpperBound() != 1) {
				builder.append("[*]"); //$NON-NLS-1$
			}
		}

		int boldEndOffset = builder.length();

		if (modelQuery.getDescription() != null && modelQuery.getDescription().trim().length() > 0) {
			builder.append("\n"); //$NON-NLS-1$
			builder.append(modelQuery.getDescription());
		}
		tooltipText = builder.toString();

		styledText.setText(tooltipText);
		styledText.setStyleRange(new StyleRange(0, boldEndOffset, null, null, SWT.BOLD));
	}

	private void initModelQueryTooltips() {
		this.queryTooltips = new ArrayList<IModelQueryTooltip>();
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(ModelQuerySetCatalog.FACTORY_EXTENSION_POINT_ID);

		for (IConfigurationElement config : configurationElements) {
			if (!"tooltip".equals(config.getName())) { //$NON-NLS-1$
				continue;
			}
			Object instance;
			try {
				instance = config.createExecutableExtension("class"); //$NON-NLS-1$
				if (instance instanceof IModelQueryTooltip) {
					IModelQueryTooltip modelQueryTooltip = (IModelQueryTooltip) instance;
					this.queryTooltips.add(modelQueryTooltip);
				}
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		}
	}
}
