/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 341463 - [Model browser] stays on "loading..." indefinitely
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.editors;

import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ITreeElement;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.progress.IWorkbenchSiteProgressService;

public class BrowserLabelProvider extends LabelProvider implements IColorProvider, IFontProvider {

	private final EcoreBrowser browser;

	private final TextComputation textComputation;
	private final ImageComputation imageComputation;
	private final ForegroundColorComputation foregroundColorComputation;
	private final BackgroundColorComputation backgroundColorComputation;
	private final FontComputation fontComputation;

	public BrowserLabelProvider(final EcoreBrowser browser) {
		this.browser = browser;
		this.textComputation = new TextComputation();
		this.imageComputation = new ImageComputation();
		this.foregroundColorComputation = new ForegroundColorComputation();
		this.backgroundColorComputation = new BackgroundColorComputation();
		this.fontComputation = new FontComputation();
	}

	public IWorkbenchSiteProgressService getProgressService() {
		return this.browser.getProgressService();
	}

	protected void refreshBrowser() {
		this.browser.refreshDelayed(false);
	}

	protected class TextComputation extends NonBlockingElementComputation<String> {
		public TextComputation() {
			super(getProgressService());
		}

		@Override
		protected String basicCompute(final Object element) {
			// to leave room for icon overlays
			final String prefix;
			if (element instanceof ModelElementItem) {
				prefix = " "; //$NON-NLS-1$
			} else {
				prefix = ""; //$NON-NLS-1$
			}

			if (element instanceof ITreeElement) {
				final ITreeElement treeElement = (ITreeElement) element;
				return prefix + treeElement.getText();
			}

			if (element == EcoreBrowser.LOADING_MESSAGE) {
				return EcoreBrowser.LOADING_MESSAGE;
			}

			// for multiplicity-many attributes
			return prefix + element.toString();
		}

		@Override
		protected String getTemporaryDefaultValue() {
			return EcoreBrowser.LOADING_MESSAGE;
		}

		@Override
		protected void computationFinished() {
			refreshBrowser();
		}
	}

	protected class ImageComputation extends NonBlockingElementComputation<Image> {
		public ImageComputation() {
			super(getProgressService());
		}

		@Override
		protected Image basicCompute(final Object element) {
			if (element instanceof ITreeElement) {
				final ITreeElement treeElement = (ITreeElement) element;
				return treeElement.getImage();
			}
			return null;
		}

		@Override
		protected Image getTemporaryDefaultValue() {
			return null;
		}

		@Override
		protected void computationFinished() {
			refreshBrowser();
		}
	}

	protected class ForegroundColorComputation extends NonBlockingElementComputation<Color> {
		public ForegroundColorComputation() {
			super(getProgressService());
		}

		@Override
		protected Color basicCompute(final Object element) {
			if (element instanceof ITreeElement) {
				final ITreeElement treeElement = (ITreeElement) element;
				return treeElement.getForeground();
			}
			return null;
		}

		@Override
		protected Color getTemporaryDefaultValue() {
			return null;
		}

		@Override
		protected void computationFinished() {
			refreshBrowser();
		}
	}

	protected class BackgroundColorComputation extends NonBlockingElementComputation<Color> {
		public BackgroundColorComputation() {
			super(getProgressService());
		}

		@Override
		protected Color basicCompute(final Object element) {
			if (element instanceof ITreeElement) {
				final ITreeElement treeElement = (ITreeElement) element;
				return treeElement.getBackground();
			}
			return null;
		}

		@Override
		protected Color getTemporaryDefaultValue() {
			return null;
		}

		@Override
		protected void computationFinished() {
			refreshBrowser();
		}
	}

	protected class FontComputation extends NonBlockingElementComputation<Font> {
		public FontComputation() {
			super(getProgressService());
		}

		@Override
		protected Font basicCompute(final Object element) {
			if (element instanceof ITreeElement) {
				final ITreeElement treeElement = (ITreeElement) element;
				return treeElement.getFont();
			}
			return null;
		}

		@Override
		protected Font getTemporaryDefaultValue() {
			return null;
		}

		@Override
		protected void computationFinished() {
			refreshBrowser();
		}
	}

	@Override
	public String getText(final Object element) {
		return this.textComputation.computeValue(element);
	}

	@Override
	public Image getImage(final Object element) {
		return this.imageComputation.computeValue(element);
	}

	public Color getForeground(final Object element) {
		return this.foregroundColorComputation.computeValue(element);
	}

	public Color getBackground(final Object element) {
		return this.backgroundColorComputation.computeValue(element);
	}

	public Font getFont(final Object element) {
		return this.fontComputation.computeValue(element);
	}
}
