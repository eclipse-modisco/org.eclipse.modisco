/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.editors;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.browser.uicore.internal.CustomTreePainter;
import org.eclipse.modisco.infra.browser.uicore.internal.CustomTreePainter.StickerToPaint;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

/**
 * Add a tooltip to the tree, that appears when the mouse hovers over a facet
 * "sticker", to display the name of this facet. Cannot use standard tree
 * tooltips here, because these can only be defined for an entire tree, and not
 * for single items.
 * <p>
 * caveat: since these tooltips are hand-built, they don't look native on
 * Windows Vista or 7
 */
public final class FacetTooltip {

	// TODO: extend
	// org.eclipse.modisco.infra.common.ui.internal.controls.Tooltip

	private static final String TREEITEM_DATA_KEY = "_TREEITEM"; //$NON-NLS-1$

	public static FacetTooltip create(final Tree tree, final CustomTreePainter customTreePainter) {
		return new FacetTooltip(tree, customTreePainter);
	}

	private FacetTooltip(final Tree tree, final CustomTreePainter customTreePainter) {
		tree.setToolTipText(""); //$NON-NLS-1$
		addTooltip(tree, customTreePainter);
	}

	private Shell fTip = null;
	private Label fLabel = null;

	private void addTooltip(final Tree tree, final CustomTreePainter customTreePainter) {

		final Listener treeListener = new Listener() {

			public void handleEvent(final Event event) {
				switch (event.type) {
				case SWT.Dispose:
				case SWT.KeyDown:
				case SWT.MouseMove:
					if (FacetTooltip.this.fTip == null) {
						break;
					}
					FacetTooltip.this.fTip.dispose();
					FacetTooltip.this.fTip = null;
					FacetTooltip.this.fLabel = null;
					break;
				case SWT.MouseHover:
					Display display = Display.getCurrent();

					TreeItem item = null;
					item = tree.getItem(new Point(event.x, event.y));

					if (item != null) {
						Object data = item.getData();
						if (data instanceof ModelElementItem) {
							ModelElementItem modelElementItem = (ModelElementItem) data;
							EObject eObject = modelElementItem.getEObject();
							Rectangle bounds = item.getBounds();
							int maxX = tree.getClientArea().width
									+ tree.getHorizontalBar().getSelection();
							List<StickerToPaint> stickersToPaint = customTreePainter
									.getStickersToPaintFor(eObject, bounds.x, bounds.width, bounds.y,
											bounds.height, maxX);
							Facet facet = findFacetAt(event.x, event.y, stickersToPaint);

							if (facet != null) {
								createTooltip(display, facet.getName());
								FacetTooltip.this.fLabel.setData(FacetTooltip.TREEITEM_DATA_KEY,
										item);
							}
						}

					}
					break;
				default:
					MoDiscoBrowserPlugin.logError("Unhandled event"); //$NON-NLS-1$
				}
			}
		};
		tree.addListener(SWT.Dispose, treeListener);
		tree.addListener(SWT.KeyDown, treeListener);
		tree.addListener(SWT.MouseMove, treeListener);
		tree.addListener(SWT.MouseHover, treeListener);
	}

	private void addMouseExitListener(final Label label) {
		Listener labelListener = new Listener() {
			public void handleEvent(final Event event) {
				Shell shell = label.getShell();
				shell.dispose();
			}
		};
		label.addListener(SWT.MouseExit, labelListener);
	}

	private Facet findFacetAt(final int x, final int y, final List<StickerToPaint> stickersToPaint) {
		for (StickerToPaint stickerToPaint : stickersToPaint) {
			Rectangle bounds = stickerToPaint.getBounds();
			if (x >= bounds.x && x < bounds.x + bounds.width && y >= bounds.y
					&& y < bounds.y + bounds.height) {
				Facet facet = stickerToPaint.getFacet();
				if (facet != null) {
					return facet;
				}
			}
		}
		return null;
	}

	private void createTooltip(final Display display, final String text) {
		if (this.fTip != null && !this.fTip.isDisposed()) {
			this.fTip.dispose();
		}
		this.fTip = new Shell(display.getActiveShell(), SWT.ON_TOP | SWT.NO_FOCUS | SWT.TOOL);
		this.fTip.setBackground(display.getSystemColor(SWT.COLOR_INFO_BACKGROUND));
		FillLayout layout = new FillLayout();
		layout.marginWidth = 2;
		this.fTip.setLayout(layout);
		this.fLabel = new Label(this.fTip, SWT.NONE);
		this.fLabel.setForeground(display.getSystemColor(SWT.COLOR_INFO_FOREGROUND));
		this.fLabel.setBackground(display.getSystemColor(SWT.COLOR_INFO_BACKGROUND));

		this.fLabel.setText(text);
		addMouseExitListener(this.fLabel);

		Point size = this.fTip.computeSize(SWT.DEFAULT, SWT.DEFAULT);

		Point pt = display.getCursorLocation();
		final int verticalCursorOffset = 10;
		pt.y -= size.y + verticalCursorOffset;

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
}
