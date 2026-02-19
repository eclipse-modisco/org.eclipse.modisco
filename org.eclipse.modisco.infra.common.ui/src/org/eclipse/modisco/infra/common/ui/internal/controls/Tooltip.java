/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.common.ui.internal.controls;

import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.common.ui.internal.MoDiscoCommonUIPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

/**
 * A tooltip that can be installed on a {@link Tree}, to show different
 * information depending on the hovered {@link TreeItem}.
 * <p>
 * <b>note: </b>Standard SWT tree tooltips cannot be used for this, because
 * these can only be defined for an entire tree, and not for single tree items.
 */
public abstract class Tooltip {

	public void installOn(final Tree tree) {
		tree.setToolTipText(""); //$NON-NLS-1$
		addTooltip(tree);
	}

	private Shell fTip = null;
	private Label fLabel = null;

	private void addTooltip(final Tree tree) {
		final Listener treeListener = new Listener() {

			public void handleEvent(final Event event) {
				switch (event.type) {
				case SWT.Dispose:
				case SWT.KeyDown:
				case SWT.MouseMove:
					if (Tooltip.this.fTip == null) {
						break;
					}
					Tooltip.this.fTip.dispose();
					Tooltip.this.fTip = null;
					Tooltip.this.fLabel = null;
					break;
				case SWT.MouseHover:
					TreeItem item = null;
					item = tree.getItem(new Point(event.x, event.y));

					if (item != null) {
						onHover(item);
					}
					break;
				default:
					Logger.logWarning("Unhandled event", MoDiscoCommonUIPlugin.getDefault()); //$NON-NLS-1$
				}
			}
		};
		tree.addListener(SWT.Dispose, treeListener);
		tree.addListener(SWT.KeyDown, treeListener);
		tree.addListener(SWT.MouseMove, treeListener);
		tree.addListener(SWT.MouseHover, treeListener);
	}

	/**
	 * Overload this method to specify the tooltip's text (unless you choose to
	 * overload {@link Tooltip#createTooltipContent(Shell, String, Display)
	 * createTooltipContent} instead)
	 */
	protected String getText(final TreeItem item) {
		return item.getText();
	}

	/**
	 * Overload this method to decide when to create the tooltip (by calling
	 * {@link Tooltip#createTooltip(Display, String) createTooltip}).
	 */
	protected void onHover(final TreeItem item) {
		String text = getText(item);
		if (text != null && text.length() > 0) {
			Display display = Display.getCurrent();
			createTooltip(display, text, item);
		}
	}

	protected void createTooltip(final Display display, final String text, final TreeItem item) {
		if (this.fTip != null && !this.fTip.isDisposed()) {
			this.fTip.dispose();
		}
		this.fTip = new Shell(display.getActiveShell(), SWT.ON_TOP | SWT.NO_FOCUS | SWT.TOOL);
		createTooltipContent(this.fTip, text, display, item);

		Point size = this.fTip.computeSize(SWT.DEFAULT, SWT.DEFAULT);

		Point pt = display.getCursorLocation();
		positionTooltip(item, pt, size);

		// move the tooltip into the visible area of the screen
		Rectangle clientArea = Display.getCurrent().getClientArea();
		if (pt.x + size.x > clientArea.width) {
			pt.x = clientArea.width - size.x;
		}
		if (pt.y + size.y > clientArea.height) {
			pt.y = clientArea.height - size.y;
		}

		this.fTip.setBounds(pt.x, pt.y, size.x, size.y);
		this.fTip.setVisible(true);
	}

	/**
	 * @param shell
	 * @param text
	 * @param display
	 * @param item
	 */
	protected void createTooltipContent(final Shell shell, final String text,
			final Display display, final TreeItem item) {
		shell.setBackground(display.getSystemColor(SWT.COLOR_INFO_BACKGROUND));
		FillLayout layout = new FillLayout();
		layout.marginWidth = 2;
		shell.setLayout(layout);
		this.fLabel = new Label(shell, SWT.NONE);
		this.fLabel.setForeground(display.getSystemColor(SWT.COLOR_INFO_FOREGROUND));
		this.fLabel.setBackground(display.getSystemColor(SWT.COLOR_INFO_BACKGROUND));

		this.fLabel.setText(text);
		addMouseExitListener(this.fLabel);
	}

	/**
	 * Overload this method to position the tooltip where you want. By default
	 * it is below the cursor.
	 *
	 * @param item
	 *            the item that was hovered to show the tooltip
	 * @param pt
	 *            the default position
	 * @param tooltipSize
	 *            the default size
	 */
	protected void positionTooltip(final TreeItem item, final Point pt, final Point tooltipSize) {
		final int verticalCursorOffset = 30;
		pt.y += verticalCursorOffset;
	}

	protected void addMouseExitListener(final Control control) {
		Listener listener = new Listener() {
			public void handleEvent(final Event event) {
				Shell shell = control.getShell();
				shell.dispose();
			}
		};
		control.addListener(SWT.MouseExit, listener);
	}

}
