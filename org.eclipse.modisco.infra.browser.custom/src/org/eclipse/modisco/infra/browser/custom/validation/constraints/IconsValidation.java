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
package org.eclipse.modisco.infra.browser.custom.validation.constraints;

import java.io.InputStream;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.modisco.infra.browser.custom.CustomizableFeatures;
import org.eclipse.modisco.infra.browser.custom.StaticFeatureValue;
import org.eclipse.modisco.infra.browser.custom.util.OverlayIconInfo;
import org.eclipse.modisco.infra.browser.custom.util.UicustomUtil;
import org.eclipse.modisco.infra.common.core.internal.utils.PathUtils;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class IconsValidation extends AbstractModelConstraint {

	private static final int MAIN_ICON_WIDTH = 16;
	private static final int MAIN_ICON_HEIGHT = 16;
	private static final int OVERLAY_ICON_WIDTH = 8;
	private static final int OVERLAY_ICON_HEIGHT = 8;

	@SuppressWarnings("boxing")
	@Override
	public IStatus validate(final IValidationContext context) {
		EObject eObject = context.getTarget();
		EMFEventType eType = context.getEventType();
		// for batch mode
		if (eType == EMFEventType.NULL) {
			if (eObject instanceof StaticFeatureValue) {
				StaticFeatureValue value = (StaticFeatureValue) eObject;
				CustomizableFeatures customizedFeature = UicustomUtil.getCustomizedFeature(value);
				if (customizedFeature == CustomizableFeatures.ICON
						|| customizedFeature == CustomizableFeatures.FACET_MAIN_ICON
						|| customizedFeature == CustomizableFeatures.METACLASS_ICON
						|| customizedFeature == CustomizableFeatures.INSTANCE_ICON
						|| customizedFeature == CustomizableFeatures.STICKER_ICON) {
					if (!isValidIcon(value.getValue(), IconsValidation.MAIN_ICON_WIDTH,
							IconsValidation.MAIN_ICON_HEIGHT)) {
						return context.createFailureStatus(value.getValue(),
								IconsValidation.MAIN_ICON_WIDTH, IconsValidation.MAIN_ICON_HEIGHT);
					}
				}
				if (customizedFeature == CustomizableFeatures.FACET_OVERLAY_ICON) {
					try {
						OverlayIconInfo overlayIconInfo = UicustomUtil.decodeOverlayIcon(value
								.getValue());
						if (!isValidIcon(overlayIconInfo.getPath(),
								IconsValidation.OVERLAY_ICON_WIDTH,
								IconsValidation.OVERLAY_ICON_HEIGHT)) {
							return context.createFailureStatus(overlayIconInfo.getPath(),
									IconsValidation.OVERLAY_ICON_WIDTH,
									IconsValidation.OVERLAY_ICON_HEIGHT);
						}
					} catch (Exception e) {
						// if decoding failed
						return context.createFailureStatus(value.getValue(),
								IconsValidation.OVERLAY_ICON_WIDTH,
								IconsValidation.OVERLAY_ICON_HEIGHT);
					}
				}
			}
		}
		return context.createSuccessStatus();
	}

	private boolean isValidIcon(final String path, final int expectedWidth, final int expectedHeight) {
		// try to open it to check that it exists
		InputStream inputStream = PathUtils.getResourceStream(new Path(path));
		if (inputStream != null) {
			try {
				Image image = new Image(Display.getDefault(), inputStream);
				boolean valid = (image.getBounds().width <= expectedWidth && image.getBounds().height <= expectedHeight);
				inputStream.close();
				image.dispose();
				return valid;
			} catch (Exception e) {
				// if it throws an exception, then the image is not valid
				return false;
			}
		}
		return false;
	}
}
