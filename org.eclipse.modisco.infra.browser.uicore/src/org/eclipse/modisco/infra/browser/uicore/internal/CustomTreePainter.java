/*******************************************************************************
 * Copyright (c) 2009, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.uicore.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.modisco.infra.browser.uicore.internal.customization.CustomizationEngine;
import org.eclipse.modisco.infra.browser.uicore.internal.customization.OverlayIconImageInfo;
import org.eclipse.modisco.infra.browser.uicore.internal.model.AttributeItem;
import org.eclipse.modisco.infra.browser.uicore.internal.model.LinkItem;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ColorProvider;
import org.eclipse.modisco.infra.browser.uicore.internal.util.EMFUtil;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

/**
 * Custom painter to add information on tree elements:
 * <ul>
 * <li>Draws a down-pointing arrow on ordered references when they are effectively displayed in
 * their original order, that is, when "sort instances" is disabled.
 * <li>Underlined and struckthrough customizations
 * <li>Displays "stickers" for Facets on the right of model elements that carry one or more facet(s)
 * for which an icon has been provided through a customization (uiCustom file)
 * </ul>
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class CustomTreePainter {

	private static final int MAX_ALPHA = 255;
	private final AppearanceConfiguration appearanceConfiguration;
	private final Tree fTree;

	private int mouseX;
	private int mouseY;
	private boolean hovering = false;

	public CustomTreePainter(final Tree tree, final AppearanceConfiguration appearanceConfiguration) {
		this.fTree = tree;
		this.appearanceConfiguration = appearanceConfiguration;
		setupTreeCustomPaint(tree);

		tree.getHorizontalBar().addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				tree.redraw();
			}
		});
		tree.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(final MouseEvent e) {
				CustomTreePainter.this.mouseX = e.x;
				CustomTreePainter.this.mouseY = e.y;
				if (CustomTreePainter.this.hovering) {
					CustomTreePainter.this.hovering = false;
					tree.redraw();
				}
			}
		});

		tree.addListener(SWT.MouseExit, new Listener() {
			public void handleEvent(final Event event) {
				if (CustomTreePainter.this.hovering) {
					CustomTreePainter.this.mouseX = 0;
					CustomTreePainter.this.mouseY = 0;
					CustomTreePainter.this.hovering = false;
					tree.redraw();
				}
			}
		});
		tree.addListener(SWT.MouseHover, new Listener() {
			public void handleEvent(final Event event) {
				CustomTreePainter.this.hovering = true;
				tree.redraw();
			}
		});
	}

	private boolean isOrderedReference(final Object object) {
		// when instances are sorted, references are not ordered anymore
		if (this.appearanceConfiguration.isSortInstances()) {
			return false;
		}

		if (object instanceof LinkItem) {
			final LinkItem linkItemProvider = (LinkItem) object;
			final EReference reference = linkItemProvider.getReference();
			return reference.isMany() && reference.isOrdered();
		}
		return false;
	}

	private boolean isOrderingEnabled() {
		return this.appearanceConfiguration.isShowOrdering();
	}

	// public static final int STICKER_ICON_SIZE = 16;
	// public static final int MARGIN = 8;
	// public static final int SPACING = 5;

	private void handleMeasureItem(final Event event) {
		// dataLoaded : see BrowserLabelProvider
		if (event.item.getData("dataLoaded") == Boolean.FALSE) { //$NON-NLS-1$
			return;
		}
		final TreeItem item = (TreeItem) event.item;
		final Object data = item.getData();

		if (isOrderingEnabled()) {
			if (isOrderedReference(data)) {
				final int leftMargin = 5;
				event.width += leftMargin + event.height / 2 + 1;
			}
		}

		if (data instanceof ModelElementItem) {
			ModelElementItem modelElementItem = (ModelElementItem) data;
			final EObject eObject = modelElementItem.getEObject();
			int maxX = this.fTree.getClientArea().width
					+ this.fTree.getHorizontalBar().getSelection();
			List<StickerToPaint> stickersToPaint = getStickersToPaintFor(eObject, event.x,
					event.width, event.y, event.height, maxX);
			if (!stickersToPaint.isEmpty()) {
				Rectangle lastStickerBounds = stickersToPaint.get(stickersToPaint.size() - 1)
						.getBounds();
				event.width = lastStickerBounds.x + lastStickerBounds.width;
			}
		}
	}

	private void handlePaintItem(final Event event) {
		// dataLoaded : see BrowserLabelProvider
		if (event.item.getData("dataLoaded") == Boolean.FALSE) { //$NON-NLS-1$
			return;
		}
		final TreeItem item = (TreeItem) event.item;
		final Object data = item.getData();
		if (isOrderingEnabled()) {
			if (isOrderedReference(data)) {
				paintOrderArrow(event);
			}
		}
		if (isModelElementWithNoResource(data)) {
			paintNoResourceDecoration(event);
		}
		if (isModelElementNotInFirstResource(data)) {
			paintNotInFirstResourceDecoration(event);
		}
		paintCustomization(data, event);
		paintStickerIcons(data, event);
	}

	private boolean isModelElementWithNoResource(final Object element) {
		if (element instanceof ModelElementItem) {
			final ModelElementItem elementItem = (ModelElementItem) element;
			final EObject eObject = elementItem.getEObject();
			return eObject.eResource() == null;
		}
		return false;
	}

	private boolean isModelElementNotInFirstResource(final Object element) {
		if (element instanceof ModelElementItem) {
			final ModelElementItem elementItem = (ModelElementItem) element;
			final EObject eObject = elementItem.getEObject();
			if (!EMFUtil.isInFirstResource(eObject)) {
				return true;
			}
		}
		return false;
	}

	private void paintNoResourceDecoration(final Event event) {
		// strikethrough the icon
		event.gc.setForeground(ColorProvider.getInstance().getNullResourceColor());
		event.gc.setLineWidth(2);
		event.gc.drawLine(event.x + 1, event.y + 2, event.x + 14, event.y + event.height - 4);
	}

	private void paintNotInFirstResourceDecoration(final Event event) {
		Image shortcutIcon = ImageProvider.getInstance().getShortcutIcon();
		event.gc.drawImage(shortcutIcon, event.x, event.y + event.height
				- shortcutIcon.getBounds().height - 1);
	}

	public static class StickerToPaint {
		private static final int INITIAL_ALPHA = 255;
		private final Rectangle bounds;
		private final Facet facet;
		private int alpha = CustomTreePainter.StickerToPaint.INITIAL_ALPHA;
		private final Rectangle itemBounds;
		private final Image image;
		private final boolean overlay;

		/**
		 * @param bounds
		 *            where to draw the sticker
		 * @param itemBounds
		 *            the bounds of the tree element for which the sticker is drawn
		 * @param facet
		 *            the corresponding Facet, if this sticker is for a Facet, or <code>null</code>
		 *            otherwise
		 * @param image
		 *            the image to paint
		 * @param overlay
		 *            whether this sticker is an overlay (over the main icon) or a sticker that
		 *            appears on the right of the tree element's text
		 */
		public StickerToPaint(final Rectangle bounds, final Rectangle itemBounds,
				final Facet facet, final Image image, final boolean overlay) {
			this.bounds = bounds;
			this.itemBounds = itemBounds;
			this.facet = facet;
			this.image = image;
			this.overlay = overlay;
		}

		public Rectangle getBounds() {
			return this.bounds;
		}

		public Rectangle getItemBounds() {
			return this.itemBounds;
		}

		/**
		 * @return the corresponding Facet, if this sticker is for a Facet, or <code>null</code>
		 *         otherwise
		 */
		public Facet getFacet() {
			return this.facet;
		}

		public Image getImage() {
			return this.image;
		}

		public boolean isOverlay() {
			return this.overlay;
		}

		public void setAlpha(final int alpha) {
			this.alpha = alpha;
		}

		public int getAlpha() {
			return this.alpha;
		}
	}

	/**
	 * @param eObject
	 *            the model element for which stickers are to be painted
	 * @param posX
	 *            the horizontal offset of the tree element relative to the tree
	 * @param width
	 *            the width of the tree element
	 * @param posY
	 *            the horizontal offset of the tree element relative to the tree
	 * @param height
	 *            the height of the tree element
	 * @param maxX
	 *            the maximum visible offset in the tree
	 * @return a list of stickers to paint
	 */
	public List<CustomTreePainter.StickerToPaint> getStickersToPaintFor(final EObject eObject,
			final int posX, final int width, final int posY, final int height, final int maxX) {
		final int rightX = posX + width;
		final int margin = 8;
		int offset = margin;
		final int spacing = 5;
		final int overlayIconWidth = 8;
		final int overlayIconHeight = 8;
		final int normalIconWidth = 16;
		final int normalIconHeight = 16;

		List<CustomTreePainter.StickerToPaint> stickersToPaint = new ArrayList<CustomTreePainter.StickerToPaint>();

		int lastX = 0;

		final CustomizationEngine customizationEngine = this.appearanceConfiguration
				.getCustomizationEngine();
		Rectangle itemBounds = new Rectangle(posX, posY, width, height);

		EClass eClass = eObject.eClass();
		Image stickerIcon = customizationEngine.getStickerIcon(eObject, eClass);
		if (stickerIcon != null) {
			int iconWidth = stickerIcon.getBounds().width;
			int iconHeight = stickerIcon.getBounds().height;
			// icons can be smaller, but not larger
			if (iconWidth > normalIconWidth) {
				iconWidth = normalIconWidth;
			}
			// icons can be smaller, but not larger
			if (iconHeight > normalIconHeight) {
				iconHeight = normalIconHeight;
			}

			int additionalOffsetX = (normalIconWidth - iconWidth) / 2;
			int additionalOffsetY = (normalIconHeight - iconHeight) / 2;

			Rectangle targetBounds = new Rectangle(rightX + offset + additionalOffsetX, posY
					+ additionalOffsetY, iconWidth, iconHeight);
			offset += normalIconWidth + spacing;
			stickersToPaint.add(new StickerToPaint(targetBounds, itemBounds, null, stickerIcon,
					false));
			lastX = targetBounds.x + targetBounds.width;
		}

		for (final Facet facet : this.appearanceConfiguration.getFacetContext().getFacets(eObject)) {
			OverlayIconImageInfo facetOverlayIcon = customizationEngine.getFacetOverlayIcon(
					eObject, facet);
			if (facetOverlayIcon != null) {
				Point overlayIconOffset = getOverlayIconOffset(facetOverlayIcon);
				Rectangle targetBounds = new Rectangle(posX + overlayIconOffset.x, posY
						+ overlayIconOffset.y, overlayIconWidth, overlayIconHeight);
				stickersToPaint.add(new StickerToPaint(targetBounds, itemBounds, facet,
						facetOverlayIcon.getImage(), true));
			}

			Image facetStickerIcon = customizationEngine.getStickerIcon(eObject, facet);
			if (facetStickerIcon == null) {
				Image mainIcon = customizationEngine.getFacetMainIcon(eObject, facet);
				if (mainIcon != null) {
					// if the facet icon is already displayed on the
					// main icon, don't display it again as a sticker
					continue;
				}
				// XXX deprecated but still supported
				facetStickerIcon = customizationEngine.getTypeIcon(eObject, facet);
				// don't show facet sticker when no icon is provided
				if (facetStickerIcon == null) {
					continue;
				}
			}

			int iconWidth = facetStickerIcon.getBounds().width;
			int iconHeight = facetStickerIcon.getBounds().height;
			// icons can be smaller, but not larger
			if (iconWidth > normalIconWidth) {
				iconWidth = normalIconWidth;
			}
			// icons can be smaller, but not larger
			if (iconHeight > normalIconHeight) {
				iconHeight = normalIconHeight;
			}

			int additionalOffsetX = (normalIconWidth - iconWidth) / 2;
			int additionalOffsetY = (normalIconHeight - iconHeight) / 2;

			Rectangle targetBounds = new Rectangle(rightX + offset + additionalOffsetX, posY
					+ additionalOffsetY, iconWidth, iconHeight);
			offset += normalIconWidth + spacing;
			stickersToPaint.add(new StickerToPaint(targetBounds, itemBounds, facet,
					facetStickerIcon, false));
			lastX = targetBounds.x + targetBounds.width;
		}

		if (lastX > maxX) {
			int shift = lastX - maxX;
			ListIterator<CustomTreePainter.StickerToPaint> stickersToPaintIterator = stickersToPaint
					.listIterator();
			while (stickersToPaintIterator.hasNext()) {
				CustomTreePainter.StickerToPaint stickerToPaint = stickersToPaintIterator.next();
				if (!stickerToPaint.isOverlay()) {
					stickerToPaint.getBounds().x -= shift;
					final int minVisibleText = 50;
					if (stickerToPaint.getBounds().x < posX + minVisibleText) {
						stickersToPaintIterator.remove();
						continue;
					}
					int overlapWithText = rightX - stickerToPaint.getBounds().x;
					if (overlapWithText > 0) {
						final int minAlpha = 128;
						final int multiplicator = 3;
						// the more it overlaps with text, the more
						// transparent it gets
						int alpha = Math.max(CustomTreePainter.MAX_ALPHA - overlapWithText
								* multiplicator, minAlpha);
						stickerToPaint.setAlpha(alpha);
					}
				}
			}
		}

		return stickersToPaint;
	}

	private Point getOverlayIconOffset(final OverlayIconImageInfo facetOverlayIcon) {
		final int step = 8;
		switch (facetOverlayIcon.getIconPosition()) {
		case TopLeft:
			return new Point(0, 0);
		case TopMiddle:
			return new Point(step, 0);
		case TopRight:
			return new Point(step * 2, 0);
		case BottomLeft:
			return new Point(0, step);
		case BottomMiddle:
			return new Point(step, step);
		case BottomRight:
			return new Point(step * 2, step);
		default:
			MoDiscoLogger.logError("Unhandled overlay icon position", Activator.getDefault()); //$NON-NLS-1$
		}
		return null;
	}

	private void paintStickerIcons(final Object data, final Event event) {
		if (data instanceof ModelElementItem) {
			ModelElementItem modelElementItem = (ModelElementItem) data;
			final EObject eObject = modelElementItem.getEObject();
			int maxX = this.fTree.getClientArea().width
					+ this.fTree.getHorizontalBar().getSelection();
			List<CustomTreePainter.StickerToPaint> stickersToPaint = getStickersToPaintFor(eObject,
					event.x, event.width, event.y, event.height, maxX);

			if (stickersToPaint.isEmpty()) {
				// enable default tooltip
				this.fTree.setToolTipText(null);
				return;
			}
			// disable default tooltip
			this.fTree.setToolTipText(""); //$NON-NLS-1$

			// hide facet stickers when hovering on the element text
			boolean showStickers = !(this.hovering && hoveringOnTextLeftOfFacets(stickersToPaint));

			for (StickerToPaint stickerToPaint : stickersToPaint) {
				Image customizedIcon = stickerToPaint.getImage();
				if (customizedIcon != null) {
					Rectangle bounds = customizedIcon.getBounds();
					Rectangle target = stickerToPaint.getBounds();

					if (!stickerToPaint.isOverlay()) {
						if (!showStickers) {
							continue;
						}
						boolean hoveringOverFacet = this.hovering
								&& stickerToPaint.getBounds().contains(this.mouseX, this.mouseY);

						int alpha = stickerToPaint.getAlpha();
						if (hoveringOverFacet) {
							alpha = CustomTreePainter.MAX_ALPHA;
						}
						event.gc.setAlpha(alpha);
					}

					event.gc.drawImage(customizedIcon, 0, 0, bounds.width, bounds.height, target.x,
							target.y, target.width, target.height);
				}
			}
		}
	}

	private boolean hoveringOnTextLeftOfFacets(
			final List<CustomTreePainter.StickerToPaint> stickersToPaint) {
		if (stickersToPaint.size() == 0) {
			return false;
		}
		if (stickersToPaint.get(0).getAlpha() == CustomTreePainter.MAX_ALPHA) {
			return false;
		}
		StickerToPaint first = stickersToPaint.get(0);
		return first.getItemBounds().contains(this.mouseX, this.mouseY)
				&& this.mouseX < first.getBounds().x;
	}

	private void paintCustomization(final Object element, final Event event) {
		final CustomizationEngine customizationEngine = this.appearanceConfiguration
				.getCustomizationEngine();
		boolean underlined = false;
		boolean struckthrough = false;

		if (element instanceof ModelElementItem) {
			final ModelElementItem elementItem = (ModelElementItem) element;
			final EObject eObject = elementItem.getEObject();
			underlined = customizationEngine.isTypeUnderlined(eObject.eClass(), eObject);
			struckthrough = customizationEngine.isTypeStruckthrough(eObject.eClass(), eObject);
		} else if (element instanceof AttributeItem) {
			final AttributeItem attributeItem = (AttributeItem) element;
			final EObject parent = attributeItem.getParent();
			underlined = customizationEngine.isAttributeUnderlined(
					attributeItem.facetOrParentClass(), attributeItem.getAttribute().getName(),
					parent);
			struckthrough = customizationEngine.isAttributeStruckthrough(
					attributeItem.facetOrParentClass(), attributeItem.getAttribute().getName(),
					parent);
		} else if (element instanceof LinkItem) {
			final LinkItem linkItem = (LinkItem) element;
			final EObject parent = linkItem.getParent();
			underlined = customizationEngine.isReferenceUnderlined(linkItem.facetOrParentClass(),
					linkItem.getReference().getName(), parent);
			struckthrough = customizationEngine.isReferenceStruckthrough(
					linkItem.facetOrParentClass(), linkItem.getReference().getName(), parent);
		}

		final int leftMargin = 23;
		final int rightMargin = 2;
		if (underlined) {
			final int y = event.y + event.height - 2;
			event.gc.drawLine(event.x + leftMargin, y, event.x + event.width - rightMargin, y);
		}

		if (struckthrough) {
			final int y = event.y + event.height / 2 + 1;
			event.gc.drawLine(event.x + leftMargin, y, event.x + event.width - rightMargin, y);
		}

	}

	private void paintOrderArrow(final Event event) {
		final int horizontalDivs = 4;
		final int leftMargin = 5;
		// to pass checkstyle...
		final int three = 3;

		int arrowSize = event.height / 2;
		// so that the pixels are always aligned on integer boundaries, to avoid
		// jaggies
		arrowSize -= arrowSize % horizontalDivs;
		int top = event.y + event.height / horizontalDivs;
		int left = event.x + event.width + leftMargin;

		final int x0 = left;
		final int x1 = left + arrowSize / horizontalDivs;
		final int x2 = left + arrowSize / 2;
		final int x3 = left + (arrowSize / horizontalDivs) * three;
		final int x4 = left + arrowSize;

		final int y0 = top;
		final int y1 = top + (arrowSize / 2);
		final int y2 = top + arrowSize;

		// draws an arrow, starting from the top left corner, clockwise
		event.gc.drawPolygon(new int[] { x1, y0, x3, y0, x3, y1, x4, y1, x2, y2, x0, y1, x1, y1 });
	}

	private void setupTreeCustomPaint(final Tree tree) {
		tree.addListener(SWT.MeasureItem, new Listener() {
			public void handleEvent(final Event event) {
				handleMeasureItem(event);
			}

		});
		tree.addListener(SWT.PaintItem, new Listener() {
			public void handleEvent(final Event event) {
				handlePaintItem(event);
			}
		});
	}

	public void dispose() {
		// nothing
	}
}
