/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.tests.project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.modisco.facet.util.tests.swtbot.internal.exported.SWTBotUtils;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.osgi.framework.Bundle;

public class WorkspaceSetup {
	public static void importTestProject(final SWTWorkbenchBot bot) throws IOException {
		if (Display.getDefault().getThread() == Thread.currentThread()) {
			throw new RuntimeException(
					"Test must not be run in UI thread (see JUnit configuration)");
		}

		List<SWTBotView> views = bot.views();
		for (SWTBotView view : views) {
			if ("Welcome".equals(view.getTitle())) {
				view.close();
			}
		}

		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("testProject");
		if (project.exists()) {
			return;
		}

		Bundle bundle = Platform.getBundle("org.eclipse.modisco.infra.browser.tests");
		URL entry = bundle.getEntry("/resources/testProject.zip");
		URL testProjectURL = FileLocator.resolve(entry);

		InputStream inputStream = testProjectURL.openStream();
		File tempZipFile = File.createTempFile("org.eclipse.modisco.infra.browser.tests", ".zip");
		tempZipFile.deleteOnExit();
		OutputStream outputStream=new FileOutputStream(tempZipFile);
		final int bufferSize = 65536;
		byte buffer[] = new byte[bufferSize];
		int nBytesRead;
		while ((nBytesRead = inputStream.read(buffer)) > 0) {
			outputStream.write(buffer, 0, nBytesRead);
		}
		outputStream.close();
		inputStream.close();

		System.out.println("WorkspaceSetup:tempZipFile = " + tempZipFile.getPath());

		bot.menu("File").menu("Import...").click();
		bot.tree().expandNode("General").select("Existing Projects into Workspace");

		bot.button("Next >").click();

		bot.radio("Select archive file:").click();
		SWTBotUtils.captureScreenShot("1");
		bot.text(1).setText(tempZipFile.getPath());
		SWTBotUtils.captureScreenShot("2");
		bot.button("Refresh").click();
		SWTBotUtils.captureScreenShot("3");
		bot.button("Finish").click();

		// wait for the project to be imported
		do {
			bot.sleep(1000);
		} while (!project.exists() || !project.isOpen());
	}
}
