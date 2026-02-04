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
package org.eclipse.modisco.infra.browser.custom.editor.editors;

import java.io.InputStream;
import java.util.HashMap;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.modisco.infra.browser.custom.CustomView;
import org.eclipse.modisco.infra.browser.custom.CustomViewFeature;
import org.eclipse.modisco.infra.browser.custom.CustomizableFeatures;
import org.eclipse.modisco.infra.browser.custom.DerivedFeatureValue;
import org.eclipse.modisco.infra.browser.custom.FeatureValue;
import org.eclipse.modisco.infra.browser.custom.FeatureValueCase;
import org.eclipse.modisco.infra.browser.custom.StaticFeatureValue;
import org.eclipse.modisco.infra.browser.custom.editor.Activator;
import org.eclipse.modisco.infra.browser.custom.editor.Messages;
import org.eclipse.modisco.infra.browser.custom.util.UicustomUtil;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ColorProvider;
import org.eclipse.modisco.infra.browser.uicore.internal.util.EMFUtil;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.modisco.infra.common.core.internal.utils.PathUtils;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TreeItem;

/**
 * A {@link TreeViewer} that displays the current customizations for a given {@link CustomView},
 * which is the input of this viewer. This {@link TreeViewer} is used as the center panel of the
 * customization editor.
 */
public class CustomizationViewer {

	private static final int VALUE_COLUMN_WIDTH = 400;
	private static final int FEATURE_COLUMN_WIDTH = 200;
	private final TreeViewer treeViewer;

	public CustomizationViewer(final Composite parent) {
		this.treeViewer = new TreeViewer(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER
				| SWT.SINGLE | SWT.FULL_SELECTION);
		this.treeViewer.getTree().setHeaderVisible(true);

		final TreeViewerColumn featureColumn = new TreeViewerColumn(this.treeViewer, SWT.LEFT);
		featureColumn.getColumn().setText(Messages.CustomizationViewer_feature);
		featureColumn.getColumn().setWidth(CustomizationViewer.FEATURE_COLUMN_WIDTH);
		final TreeViewerColumn valueColumn = new TreeViewerColumn(this.treeViewer, SWT.LEFT);
		valueColumn.getColumn().setText(Messages.CustomizationViewer_value);
		valueColumn.getColumn().setWidth(CustomizationViewer.VALUE_COLUMN_WIDTH);

		this.treeViewer.setContentProvider(new CustomizationViewerContentProvider());

		// for sorting purposes
		this.treeViewer.setLabelProvider(new FeatureLabelProvider());
		this.treeViewer.setComparator(new ViewerComparator() {
			@Override
			public int compare(final Viewer viewer, final Object e1, final Object e2) {
				// do not sort value cases
				if (e1 instanceof FeatureValueCase) {
					return 0;
				}
				return super.compare(viewer, e1, e2);
			}
		});

		featureColumn.setLabelProvider(new FeatureLabelProvider());
		valueColumn.setLabelProvider(new ValueLabelProvider());

		this.treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(final SelectionChangedEvent event) {
				// for selection text color
				CustomizationViewer.this.treeViewer.refresh();
			}
		});
	}

	public void setInput(final Object input) {
		this.treeViewer.setInput(input);
	}

	protected static class CustomizationViewerContentProvider implements ITreeContentProvider {
		public Object[] getElements(final Object inputElement) {
			if (inputElement instanceof CustomView) {
				final CustomView customView = (CustomView) inputElement;
				final EList<CustomViewFeature> customizedFeatures = customView
						.getCustomizedFeatures();
				return customizedFeatures.toArray();
			}
			return new Object[0];
		}

		public Object[] getChildren(final Object parentElement) {

			if (parentElement instanceof CustomViewFeature) {
				final CustomViewFeature customViewFeature = (CustomViewFeature) parentElement;
				final EList<FeatureValueCase> valueCases = customViewFeature.getValueCases();
				return valueCases.toArray();
			}

			return new Object[0];
		}

		public Object getParent(final Object element) {
			if (element instanceof FeatureValueCase) {
				final FeatureValueCase featureValueCase = (FeatureValueCase) element;
				return featureValueCase.getFeature();
			}
			return null;
		}

		public boolean hasChildren(final Object element) {
			if (element instanceof CustomViewFeature) {
				final CustomViewFeature customViewFeature = (CustomViewFeature) element;
				return !customViewFeature.getValueCases().isEmpty();
			}
			return false;
		}

		public void dispose() {
			// nothing
		}

		public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
			// nothing
		}
	}

	protected static class FeatureLabelProvider extends ColumnLabelProvider {

		@Override
		public String getText(final Object element) {
			if (element instanceof CustomViewFeature) {
				final CustomViewFeature customViewFeature = (CustomViewFeature) element;
				return getDisplayName(customViewFeature.getCustomizedFeature());
			}

			if (element instanceof FeatureValueCase) {
				final FeatureValueCase featureValueCase = (FeatureValueCase) element;
				final ModelQuery condition = featureValueCase.getCondition();

				if (EMFUtil.tryResolve(condition)) {
					return condition.getName();
				}
				final String text = EMFUtil.proxyURI(condition);
				// if unresolved proxy, show URI which contains query and
				// query set name
				return text;
			}

			return element.toString();
		}

		private String getDisplayName(final CustomizableFeatures customizedFeature) {
			switch (customizedFeature) {
			case VISIBLE:
				return Messages.CustomizationViewer_isVisible;
			case METACLASS_VISIBLE:
				return Messages.CustomizationViewer_metaclassVisible;
			case COLOR:
				return Messages.CustomizationViewer_textColor;
			case BACKGROUND_COLOR:
				return Messages.CustomizationViewer_backgroundColor;
			case FONT_NAME:
				return Messages.CustomizationViewer_textFontName;
			case ICON:
				return Messages.CustomizationViewer_typeIcon;
			case FACET_MAIN_ICON:
				return Messages.CustomizationViewer_instanceIcon;
			case FACET_OVERLAY_ICON:
				return Messages.CustomizationViewer_overlayIcon;
			case INSTANCE_ICON:
				return Messages.CustomizationViewer_instanceIcon;
			case METACLASS_ICON:
				return Messages.CustomizationViewer_metaclassIcon;
			case STICKER_ICON:
				return Messages.CustomizationViewer_stickerIcon;
			case LABEL:
				return Messages.CustomizationViewer_label;
			case ITALIC:
				return Messages.CustomizationViewer_isItalic;
			case BOLD:
				return Messages.CustomizationViewer_isBold;
			case UNDERLINED:
				return Messages.CustomizationViewer_isUnderlined;
			case STRUCKTHROUGH:
				return Messages.CustomizationViewer_isStruckthrough;
			case HIDE_METACLASS_NAME:
				return Messages.CustomizationViewer_hideMetaclassName;
			case COLLAPSE_LINK:
				return Messages.CustomizationViewer_collapseLink;
			default:
				MoDiscoLogger.logWarning("Missing friendly feature name", Activator.getDefault()); //$NON-NLS-1$
				return customizedFeature.getName();
			}
		}

		@Override
		public Image getImage(final Object element) {
			// condition query
			if (element instanceof FeatureValueCase) {
				final FeatureValueCase featureValueCase = (FeatureValueCase) element;
				final ModelQuery condition = featureValueCase.getCondition();
				if (EMFUtil.tryResolve(condition)) {
					return ImageProvider.getInstance().getPredicateIcon();
				}
				return ImageProvider.getInstance().getErrorIcon();
			}
			return ImageProvider.getInstance().getFeatureIcon();
		}

		@Override
		public Color getBackground(final Object element) {
			return null;
		}

		@Override
		public Color getForeground(final Object element) {
			// red if unresolved proxy
			if (element instanceof FeatureValueCase) {
				final FeatureValueCase featureValueCase = (FeatureValueCase) element;
				final ModelQuery condition = featureValueCase.getCondition();
				if (!EMFUtil.tryResolve(condition)) {
					return ColorProvider.getInstance().getUnresolvedProxyColor();
				}
			}

			// gray if not customized
			if (element instanceof CustomViewFeature) {
				final CustomViewFeature customViewFeature = (CustomViewFeature) element;
				if (customViewFeature.getDefaultValue() == null
						&& customViewFeature.getValueCases().size() == 0) {
					return ColorProvider.getInstance().getGray();
				}
			}

			// dark red if deprecated
			if (element instanceof CustomViewFeature) {
				CustomViewFeature customViewFeature = (CustomViewFeature) element;
				CustomizableFeatures customizedFeature = customViewFeature.getCustomizedFeature();
				if (customizedFeature == CustomizableFeatures.ICON) {
					return Display.getDefault().getSystemColor(SWT.COLOR_DARK_RED);
				}
			}
			return null;
		}

		@Override
		public Font getFont(final Object element) {
			return null;
		}

	}

	protected class ValueLabelProvider extends StyledCellLabelProvider {

		/** Colors in use */
		private final HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
		/** Images in use */
		private final HashMap<String, Image> images = new HashMap<String, Image>();

		public ValueLabelProvider() {
			super(StyledCellLabelProvider.COLORS_ON_SELECTION);
		}

		public String getText(final Object element) {
			final FeatureValue featureValue = UicustomUtil.getFeatureValue(element);

			if (featureValue instanceof StaticFeatureValue) {
				final StaticFeatureValue staticFeatureValue = (StaticFeatureValue) featureValue;
				return staticFeatureValue.getValue().toString();
			} else if (featureValue instanceof DerivedFeatureValue) {
				final DerivedFeatureValue derivedFeatureValue = (DerivedFeatureValue) featureValue;
				final ModelQuery valueCalculator = derivedFeatureValue.getValueCalculator();

				if (EMFUtil.tryResolve(valueCalculator)) {
					return valueCalculator.getName();
				}
				final String text = EMFUtil.proxyURI(valueCalculator);
				// if unresolved proxy, show URI which contains query and
				// query set name
				return text;
			} else {
				return Messages.CustomizationViewer_defaultValue;
			}
		}

		public Image getImage(final Object element) {
			final FeatureValue featureValue = UicustomUtil.getFeatureValue(element);
			if (featureValue instanceof DerivedFeatureValue) {
				return ImageProvider.getInstance().getOperationIcon();
			}

			if (featureValue instanceof StaticFeatureValue) {
				StaticFeatureValue staticFeatureValue = (StaticFeatureValue) featureValue;
				CustomizableFeatures customizedFeature = UicustomUtil
						.getCustomizedFeature(featureValue);
				if (customizedFeature == CustomizableFeatures.ICON
						|| customizedFeature == CustomizableFeatures.FACET_MAIN_ICON
						|| customizedFeature == CustomizableFeatures.FACET_OVERLAY_ICON
						|| customizedFeature == CustomizableFeatures.INSTANCE_ICON
						|| customizedFeature == CustomizableFeatures.METACLASS_ICON
						|| customizedFeature == CustomizableFeatures.STICKER_ICON) {
					String value = staticFeatureValue.getValue();
					int colonPos = value.indexOf(':');
					// for overlay icon
					if (colonPos != -1) {
						value = value.substring(0, colonPos);
					}
					return getImage(value);
				}
			}
			return null;
		}

		private Image getImage(final String strValue) {
			Image icon = this.images.get(strValue);
			if (icon == null) {
				try {
					final InputStream inputStream = PathUtils.getResourceStream(new Path(strValue));
					if (inputStream == null) {
						return null;
					}
					icon = new Image(Display.getCurrent(), inputStream);
					inputStream.close();
				} catch (final Exception e) {
					return ImageDescriptor.getMissingImageDescriptor().createImage();
					// return PlatformUI.getWorkbench().getSharedImages()
					// .getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
				}
				this.images.put(strValue, icon);
			}
			return icon;
		}

		@Override
		public void dispose() {
			for (final Color color : this.colors.values()) {
				color.dispose();
			}
			for (final Image image : this.images.values()) {
				image.dispose();
			}
			super.dispose();
		}

		/** Implements a color cache to minimize resource use */
		@SuppressWarnings("boxing")
		private Color getColor(final RGB rgb) {
			final int key = rgb.hashCode();
			Color color = this.colors.get(key);
			if (color == null) {
				color = new Color(Display.getCurrent(), rgb);
				this.colors.put(key, color);
			}
			return color;
		}

		@Override
		public void update(final ViewerCell cell) {
			// for a color static value => display color
			final Object element = cell.getElement();

			// gray if not customized
			boolean gray = false;
			if (element instanceof CustomViewFeature) {
				final CustomViewFeature customViewFeature = (CustomViewFeature) element;
				if (customViewFeature.getDefaultValue() == null) {
					gray = true;
				}
			}

			// red if unresolved query
			boolean unresolved = false;
			final FeatureValue featureValue = UicustomUtil.getFeatureValue(element);
			if (featureValue instanceof DerivedFeatureValue) {
				final DerivedFeatureValue derivedFeatureValue = (DerivedFeatureValue) featureValue;
				final ModelQuery valueCalculator = derivedFeatureValue.getValueCalculator();
				if (!EMFUtil.tryResolve(valueCalculator)) {
					unresolved = true;
				}
			}

			if (unresolved) {
				final String text = getText(element);
				cell.setText(text);
				cell.setStyleRanges(new StyleRange[] { new StyleRange(0, text.length(),
						ColorProvider.getInstance().getUnresolvedProxyColor(), null) });
				cell.setImage(ImageProvider.getInstance().getErrorIcon());
				super.update(cell);
			} else {
				final RGB color = getStaticFeatureValueColor(element);
				if (color != null) {
					// add a blank space painted with the color
					final String colorBlob = "      "; //$NON-NLS-1$
					final String text = colorBlob + " " + getText(element); //$NON-NLS-1$
					cell.setText(text);

					StyleRange colorStyleRange = new StyleRange(0, colorBlob.length(), null,
							getColor(color));

					final Color textColor;
					if (isSelected(cell)) {
						textColor = getSelectedTextColor();
					} else {
						textColor = Display.getDefault().getSystemColor(SWT.COLOR_LIST_FOREGROUND);
					}
					cell.setStyleRanges(new StyleRange[] {
							colorStyleRange,
							new StyleRange(colorBlob.length(), text.length() - colorBlob.length(),
									textColor, null) });

				} else {
					final String text = getText(element);
					cell.setText(text);
					if (gray) {
						cell.setStyleRanges(new StyleRange[] { new StyleRange(0, text.length(),
								ColorProvider.getInstance().getGray(), null) });
					} else {
						if (isSelected(cell)) {
							cell.setStyleRanges(new StyleRange[] { new StyleRange(0, text.length(),
									getSelectedTextColor(), null) });
						} else {
							cell.setStyleRanges(new StyleRange[0]);
						}
					}
				}

				cell.setImage(getImage(element));
				super.update(cell);
			}
		}

		private Color getSelectedTextColor() {
			final double threshold = 0.4d;
			double brightness = getBrightness(Display.getDefault()
					.getSystemColor(SWT.COLOR_LIST_SELECTION).getRGB());
			if (brightness > threshold) {
				return Display.getDefault().getSystemColor(SWT.COLOR_BLACK);
			}
			return Display.getDefault().getSystemColor(SWT.COLOR_WHITE);
		}

		/** @return the perceived brightness of the given color */
		private double getBrightness(final RGB rgb) {
			final double maxIntensity = 255.0d;
			final double redWeight = .241;
			final double greenWeight = .691;
			final double blueWeight = .068;
			return Math.sqrt(rgb.red * rgb.red * redWeight + rgb.green * rgb.green * greenWeight
					+ rgb.blue * rgb.blue * blueWeight)
					/ maxIntensity;
		}

		/**
		 * @return the color or <code>null</code> if the element does not describe a static color
		 */
		private RGB getStaticFeatureValueColor(final Object element) {
			final FeatureValue featureValue = UicustomUtil.getFeatureValue(element);

			if (featureValue instanceof StaticFeatureValue) {
				final StaticFeatureValue staticFeatureValue = (StaticFeatureValue) featureValue;
				final CustomizableFeatures customizedFeature = UicustomUtil
						.getCustomizedFeature(staticFeatureValue);
				if (customizedFeature == CustomizableFeatures.COLOR
						|| customizedFeature == CustomizableFeatures.BACKGROUND_COLOR) {
					final String value = staticFeatureValue.getValue();
					final RGB color = UicustomUtil.decodeColor(value);
					if (color != null) {
						return color;
					}
				}
			}
			return null;
		}
	}

	private boolean isSelected(final ViewerCell cell) {
		TreeItem treeItem = (TreeItem) cell.getItem();
		IStructuredSelection selection = (IStructuredSelection) this.treeViewer.getSelection();
		return selection.toList().contains(treeItem.getData());
	}

	public void refresh() {
		if (!this.treeViewer.getTree().isDisposed()) {
			try {
				this.treeViewer.getTree().setRedraw(false);
				this.treeViewer.refresh();
			} finally {
				this.treeViewer.getTree().setRedraw(true);
			}
		}
	}

	public void addSelectionChangedListener(final ISelectionChangedListener selectionChangedListener) {
		this.treeViewer.addSelectionChangedListener(selectionChangedListener);
	}

	public ISelection getSelection() {
		return this.treeViewer.getSelection();
	}

	public TreeViewer getViewer() {
		return this.treeViewer;
	}
}
