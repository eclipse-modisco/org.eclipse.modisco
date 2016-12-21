/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.common.core.internal.adapters.instances;

import org.eclipse.emf.common.notify.Notification;

public interface ModelChangeListener {
	void modelChanged(Notification msg);
}