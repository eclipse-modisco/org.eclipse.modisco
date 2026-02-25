/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Fabien Giquel (Mia-Software)
 *    Nicolas Bros (Mia-Software)
 *    Gregoire DUPE (Mia-Software) - Bug 367497 - [Unit Test Failure] org.eclipse.modisco.infra.browser.custom.examples.java.jdk.tests.Tests.bug308991
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.utils;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.modisco.infra.common.core.MoDiscoProject;

/**
 * @author Gregoire DUPE (Mia-Software), Fabien Giquel (Mia-Software)
 *
 */
@Deprecated /* @deprecated use org.eclipse.modisco.common.core.files.ProjectUtils */
public final class ProjectUtils extends org.eclipse.modisco.common.core.files.ProjectUtils {

	private ProjectUtils() {
		throw new IllegalStateException();
	}

	@Deprecated /* @deprecated use MoDiscoProject.isMoDiscoProject */
	public static boolean isMoDiscoProject(final IProject project) {
		return MoDiscoProject.isMoDiscoProject(project);
	}

	@Deprecated /* @deprecated use MoDiscoProject.isInMoDiscoProject */
	public static boolean isInMoDiscoProject(final IPath path) {
		return MoDiscoProject.isInMoDiscoProject(path);
	}
}
