/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core.internal.annotations;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.internal.Activator;

import com.sun.mirror.declaration.AnnotationMirror;
import com.sun.mirror.declaration.MemberDeclaration;
import com.sun.mirror.util.SourcePosition;

public final class MarkerUtils {
	private static final int FILE_BUFFER_SIZE = 100;

	private MarkerUtils() {
	}

	public static void deleteMarkers(final MemberDeclaration member, final String markerId) {
		if (member.getPosition() == null || member.getPosition().file() == null) {
			return;
		}
		File javaFile = member.getPosition().file();
		IPath javaPath = new Path(javaFile.getAbsolutePath());
		IResource javaResource = ResourcesPlugin.getWorkspace().getRoot()
				.getFileForLocation(javaPath);

		try {
			javaResource.deleteMarkers(markerId, true, IResource.DEPTH_ONE);
		} catch (CoreException e) {
			MoDiscoLogger.logWarning(e, Activator.getDefault());
		}
	}

	public static void createMarker(final MemberDeclaration member, final String message,
			final String markerId) {
		if (member.getPosition() == null || member.getPosition().file() == null) {
			return;
		}

		File javaFile = member.getPosition().file();
		IPath javaPath = new Path(javaFile.getAbsolutePath());
		IResource javaResource = ResourcesPlugin.getWorkspace().getRoot()
				.getFileForLocation(javaPath);

		// retrieve parameter annotation position
		SourcePosition annotationPosition = null;
		for (AnnotationMirror annotationMirror : member.getAnnotationMirrors()) {
			if (annotationMirror.getAnnotationType().getDeclaration().getQualifiedName()
					.equals(Parameter.class.getName())) {
				annotationPosition = annotationMirror.getPosition();
			}
		}

		// annotations positions are not retrieved on members from super
		// classes/interfaces (normal APT limitation)
		if (annotationPosition == null) {
			annotationPosition = member.getPosition();
		}

		try {
			IMarker marker = javaResource.createMarker(markerId);
			marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
			computeMarkerPosition(marker, annotationPosition);
			marker.setAttribute(IMarker.MESSAGE, message);

		} catch (CoreException e) {
			MoDiscoLogger.logWarning(e, Activator.getDefault());
		} catch (IOException e) {
			MoDiscoLogger.logWarning(e, Activator.getDefault());
		}
	}

	public static void createMarkers(final Collection<MemberDeclaration> members,
			final String message, final String markerId) {
		for (MemberDeclaration aMember : members) {
			createMarker(aMember, message, markerId);
		}
	}

	private static void computeMarkerPosition(final IMarker aMarker, final SourcePosition position)
			throws CoreException, IOException {
		int lineNumber = position.line();
		String fileContent = getContent((IFile) aMarker.getResource()).toString();
		List<Integer> linePositions = indexingLinePositions(fileContent);
		aMarker.setAttribute(IMarker.CHAR_START, linePositions.get(lineNumber - 1));
		aMarker.setAttribute(IMarker.CHAR_END, linePositions.get(lineNumber));
	}

	@SuppressWarnings("boxing")
	private static List<Integer> indexingLinePositions(final String aFileContent) {
		List<Integer> result = new ArrayList<Integer>();
		result.add(0); // first line start

		int index = aFileContent.indexOf('\n');
		while (index > -1) {
			result.add(index + 1);
			index = aFileContent.indexOf('\n', index + 1);
		}
		return result;
	}

	private static StringBuffer getContent(final IFile file) throws CoreException, IOException {
		InputStream inputStream = file.getContents();
		StringBuffer buffer = new StringBuffer();
		Reader reader = null;
		try {
			reader = new InputStreamReader(inputStream);
			char[] chars = new char[MarkerUtils.FILE_BUFFER_SIZE];
			int read;
			while ((read = reader.read(chars)) != -1) {
				if (read == MarkerUtils.FILE_BUFFER_SIZE) {
					buffer.append(chars);
				} else {
					buffer.append(chars, 0, read);
				}
			}
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
		return buffer;
	}
}