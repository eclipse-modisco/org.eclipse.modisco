/*******************************************************************************
 * Copyright (c) 2011, 2015 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Frederic Madiot (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *    Gr�goire Dup� (Mia-Software) - Bug 480183 - The manifest.mf discoverer should manage 'Export-Package'
 *******************************************************************************/
package org.eclipse.modisco.manifest.discoverer;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.manifest.Bundle;
import org.eclipse.modisco.manifest.ExportedPackage;
import org.eclipse.modisco.manifest.ImportedPackage;
import org.eclipse.modisco.manifest.ManifestFactory;
import org.eclipse.modisco.manifest.RequiredBundle;
import org.eclipse.modisco.manifest.Version;
import org.eclipse.osgi.util.ManifestElement;
import org.osgi.framework.BundleException;

public class ManifestModelDiscoverer2 extends AbstractModelDiscoverer<IFile> {

	public boolean isApplicableTo(final IFile source) {
		return source.isAccessible() && "MANIFEST.MF".equals(source.getName()); //$NON-NLS-1$
	}

	@Override
	protected void basicDiscoverElement(final IFile file,
			final IProgressMonitor monitor) throws DiscoveryException {
		final String pathName = file.getFullPath() + ".xmi"; //$NON-NLS-1$
		final URI uri = URI.createPlatformResourceURI(pathName, true);
		setDefaultTargetURI(uri);
		final Resource resource = discoverManifestModel(file);
		setTargetModel(resource);
	}

	private static void discoverBundleSymbolicName(final Bundle bundle,
			final String symbolicNameValue) throws DiscoveryException {
		try {
			final ManifestElement[] elements = ManifestElement.parseHeader(
					"Bundle-SymbolicName", symbolicNameValue); //$NON-NLS-1$
			if (elements != null && elements.length > 0) {
				final ManifestElement manifestElement = elements[0];
				bundle.setSymbolicName(manifestElement.getValue());
				final String singletonAttr =
						manifestElement.getDirective("singleton"); //$NON-NLS-1$
				if ("true".equals(singletonAttr)) { //$NON-NLS-1$
					bundle.setSingleton(true);
				}
			}
		} catch (BundleException e) {
			throw new DiscoveryException(e);
		}
	}

	private Resource discoverManifestModel(final IFile manifestFile)
			throws DiscoveryException {
		final HashMap<String, String> manifestValues = new HashMap<String, String>();
		final Resource manifestResource = createTargetModel();
		InputStream manifestContent = null;
		try {
			manifestContent = manifestFile.getContents();
			ManifestElement.parseBundleManifest(manifestContent, manifestValues);
			final Bundle bundle = ManifestFactory.eINSTANCE.createBundle();
			manifestResource.getContents().add(bundle);
			bundle.setVersion(manifestValues.get("Bundle-Version")); //$NON-NLS-1$
			discoverBundleSymbolicName(bundle, manifestValues.get("Bundle-SymbolicName")); //$NON-NLS-1$
			bundle.setName(manifestValues.get("Bundle-Name")); //$NON-NLS-1$
			bundle.setActivator(manifestValues.get("Bundle-Activator")); //$NON-NLS-1$
			bundle.setVendor(manifestValues.get("Bundle-Vendor")); //$NON-NLS-1$
			bundle.setActivationPolicy(manifestValues.get("Bundle-ActivationPolicy")); //$NON-NLS-1$
			bundle.setRequiredExecutionEnvironment(manifestValues
					.get("Bundle-RequiredExecutionEnvironment")); //$NON-NLS-1$
			final ManifestElement[] rBundleMElts =
					parseHeader(manifestValues, "Require-Bundle"); //$NON-NLS-1$
			if (rBundleMElts != null) {
				final List<RequiredBundle> requiredBundles =
						discoverRequiredBundle(rBundleMElts);
				bundle.getRequiredBundles().addAll(requiredBundles);
			}
			discoverImportPackage(manifestValues, bundle);
			discoverExportPackage(manifestValues, bundle);
		} catch (Exception e) {
			throw new DiscoveryException(e);
		} finally {
			try {
				if (manifestContent != null) {
					manifestContent.close();
				}
			} catch (IOException e) {
				final String string = String.format(
						"Manifest input stream closing faied (%s)", //$NON-NLS-1$
						manifestFile.getLocation().toOSString()
					);
				Logger.logError(e, string, Activator.getDefault());
			}
		}
		return manifestResource;
	}

	private static void discoverExportPackage(
			final Map<String, String> manifestValues, final Bundle bundle)
					throws BundleException {
		final ManifestElement[] exportPackages =
				parseHeader(manifestValues, "Export-Package"); //$NON-NLS-1$
		if (exportPackages != null) {
			for (ManifestElement exportPackage : exportPackages) {
				final ExportedPackage exportedPackage = ManifestFactory.eINSTANCE
						.createExportedPackage();
				exportedPackage.setName(exportPackage.getValue());
				if (exportPackage.getDirective("x-internal") == null) { //$NON-NLS-1$
					final String directive = exportPackage.getDirective("x-friends"); //$NON-NLS-1$
					if (directive == null) {
						exportedPackage.setXInternal(false);
					} else {
						exportedPackage.setXInternal(true);
						final String[] xFriends = directive.split(","); //$NON-NLS-1$
						for (String xFriend : xFriends) {
							final Bundle xfBundle = ManifestFactory.eINSTANCE.createBundle();
							xfBundle.setName(xFriend);
							exportedPackage.getXFriends().add(xfBundle);
						}
					}
				} else {
					exportedPackage.setXInternal(true);
				}
				bundle.getExportPackages().add(exportedPackage);
			}
		}
	}

	private static void discoverImportPackage(
			final Map<String, String> manifestValues, final Bundle bundle)
					throws BundleException {
		final ManifestElement[] importedPackages =
				parseHeader(manifestValues, "Import-Package"); //$NON-NLS-1$
		if (importedPackages != null) {
			for (ManifestElement element : importedPackages) {
				final ImportedPackage importedPackage = ManifestFactory.eINSTANCE
						.createImportedPackage();
				importedPackage.setName(element.getValue());
				final String bundleVersion = element.getAttribute("version"); //$NON-NLS-1$
				if (bundleVersion != null) {
					importedPackage.setVersion(discoverVersion(bundleVersion));
				}
				bundle.getImportedPackages().add(importedPackage);
			}
		}
	}

	private static ManifestElement[] parseHeader(
			final Map<String, String> manifestValues, final String key)
					throws BundleException {
		return ManifestElement.parseHeader(key, manifestValues.get(key));
	}

	private static Version discoverVersion(final String bundleVersion) {
		final Version version = ManifestFactory.eINSTANCE.createVersion();
		final String firstChar = bundleVersion.substring(0, 1);
		if ("(".equals(firstChar) || "[".equals(firstChar)) { //$NON-NLS-1$ //$NON-NLS-2$
			if ("[".equals(firstChar)) { //$NON-NLS-1$
				version.setMinimumIsInclusive(true);
			} else {
				version.setMinimumIsInclusive(false);
			}
			final int indexOfSeparator = bundleVersion.indexOf(',');
			final String minimumVersion = bundleVersion.substring(
					1, indexOfSeparator);
			version.setMinimum(minimumVersion);
			final String maximumVersion = bundleVersion.substring(
					indexOfSeparator + 1, bundleVersion.length() - 1);
			version.setMaximum(maximumVersion);
			if (bundleVersion.substring(bundleVersion.length() - 1).equals("]")) { //$NON-NLS-1$
				version.setMaximumIsInclusive(true);
			} else {
				version.setMaximumIsInclusive(false);
			}
		} else {
			version.setMinimum(bundleVersion);
		}
		return version;
	}

	private static List<RequiredBundle> discoverRequiredBundle(
			final ManifestElement[] requiredBundles) {
		final List<RequiredBundle> result = new ArrayList<RequiredBundle>();
		for (ManifestElement element : requiredBundles) {
			final RequiredBundle requiredBundle =
					ManifestFactory.eINSTANCE.createRequiredBundle();
			requiredBundle.setSymbolicName(element.getValue());
			final String bundleVersion =
					element.getAttribute("bundle-version"); //$NON-NLS-1$
			if (bundleVersion != null) {
				requiredBundle.setVersion(discoverVersion(bundleVersion));
			}
			result.add(requiredBundle);
		}
		return result;
	}
}
