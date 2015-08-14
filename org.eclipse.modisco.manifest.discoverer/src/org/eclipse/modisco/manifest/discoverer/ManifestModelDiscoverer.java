/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Frederic Madiot (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.manifest.discoverer;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterDirectionKind;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterImpl;
import org.eclipse.modisco.manifest.Bundle;
import org.eclipse.modisco.manifest.ImportedPackage;
import org.eclipse.modisco.manifest.ManifestFactory;
import org.eclipse.modisco.manifest.RequiredBundle;
import org.eclipse.modisco.manifest.Version;
import org.eclipse.osgi.util.ManifestElement;
import org.osgi.framework.BundleException;

/**
 * @deprecated use {@link ManifestModelDiscoverer2}, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=474898
 */
@Deprecated
public class ManifestModelDiscoverer implements Discoverer {

	private static final List<DiscoveryParameter> PARAMETERS_KEYS = new ArrayList<DiscoveryParameter>();

	/**
	 * A parameter key for indicating an output target Resource instance.
	 */
	public static final DiscoveryParameter PARAMETER_TARGET_RESOURCE = new DiscoveryParameterImpl(
			"TARGET_RESOURCE", DiscoveryParameterDirectionKind.out, //$NON-NLS-1$
			Resource.class, false);

	static {
		ManifestModelDiscoverer.PARAMETERS_KEYS
				.add(ManifestModelDiscoverer.PARAMETER_TARGET_RESOURCE);
	}

	public final boolean isApplicableTo(final Object source) {
		if (source instanceof IFile) {
			IFile file = (IFile) source;
			return file.exists() && "MANIFEST.MF".equals(file.getName()); //$NON-NLS-1$
		}
		return false;
	}

	public List<DiscoveryParameter> getDiscovererParameters() {
		return ManifestModelDiscoverer.PARAMETERS_KEYS;
	}

	public final void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		Resource result = discoverManifestModel((IFile) source);
		parameters.put(ManifestModelDiscoverer.PARAMETER_TARGET_RESOURCE, result);
	}

	private static void discoverBundleSymbolicName(final Bundle bundle, final String symbolicNameValue) {
		try {
			ManifestElement[] elements = ManifestElement.parseHeader(
					"Bundle-SymbolicName", symbolicNameValue); //$NON-NLS-1$

			if (elements != null && elements.length > 0) {
				ManifestElement manifestElement = elements[0];
				bundle.setSymbolicName(manifestElement.getValue());
				String singletonAttr = manifestElement.getDirective("singleton"); //$NON-NLS-1$
				if ("true".equals(singletonAttr)) { //$NON-NLS-1$
					bundle.setSingleton(true);
				}
			}

		} catch (BundleException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	private static Resource discoverManifestModel(final IFile manifestFile) {
		HashMap<String, String> manifestValues = new HashMap<String, String>();
		InputStream manifestContent;
		try {
			manifestContent = manifestFile.getContents();
			ManifestElement.parseBundleManifest(manifestContent, manifestValues);
		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}

		Resource manifestModelResource = new XMIResourceImpl();
		URI uri = URI.createURI("platform:/resource" + manifestFile.getFullPath() + ".xmi"); //$NON-NLS-1$ //$NON-NLS-2$
		manifestModelResource.setURI(uri);

		Bundle bundle = ManifestFactory.eINSTANCE.createBundle();
		manifestModelResource.getContents().add(bundle);

		bundle.setVersion(manifestValues.get("Bundle-Version")); //$NON-NLS-1$
		discoverBundleSymbolicName(bundle, manifestValues.get("Bundle-SymbolicName")); //$NON-NLS-1$
		bundle.setName(manifestValues.get("Bundle-Name")); //$NON-NLS-1$
		bundle.setActivator(manifestValues.get("Bundle-Activator")); //$NON-NLS-1$
		bundle.setVendor(manifestValues.get("Bundle-Vendor")); //$NON-NLS-1$
		bundle.setActivationPolicy(manifestValues.get("Bundle-ActivationPolicy")); //$NON-NLS-1$
		bundle.setRequiredExecutionEnvironment(manifestValues
				.get("Bundle-RequiredExecutionEnvironment")); //$NON-NLS-1$

		try {
			ManifestElement[] requiredBundles = ManifestElement.parseHeader(
					"Require-Bundle", manifestValues.get("Require-Bundle")); //$NON-NLS-1$ //$NON-NLS-2$
			if (requiredBundles != null) {
				bundle.getRequiredBundles().addAll(discoverRequiredBundle(requiredBundles));
			}

			ManifestElement[] importedPackages = ManifestElement.parseHeader(
					"Import-Package", manifestValues.get("Import-Package")); //$NON-NLS-1$ //$NON-NLS-2$
			if (importedPackages != null) {
				for (ManifestElement element : importedPackages) {
					ImportedPackage importedPackage = ManifestFactory.eINSTANCE
							.createImportedPackage();
					importedPackage.setName(element.getValue());
					String bundleVersion = element.getAttribute("version"); //$NON-NLS-1$
					if (bundleVersion != null) {
						importedPackage.setVersion(discoverVersion(bundleVersion));
					}
					bundle.getImportedPackages().add(importedPackage);
				}
			}
		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}

		return manifestModelResource;
	}

	private static Version discoverVersion(final String bundleVersion) {
		Version version = ManifestFactory.eINSTANCE.createVersion();
		String firstChar = bundleVersion.substring(0, 1);
		if (firstChar.equals("(") || firstChar.equals("[")) { //$NON-NLS-1$ //$NON-NLS-2$
			if (firstChar.equals("[")) { //$NON-NLS-1$
				version.setMinimumIsInclusive(true);
			} else {
				version.setMinimumIsInclusive(false);
			}
			int indexOfVersionSeparator = bundleVersion.indexOf(',');
			String minimumVersion = bundleVersion.substring(1, indexOfVersionSeparator);
			version.setMinimum(minimumVersion);
			String maximumVersion = bundleVersion.substring(indexOfVersionSeparator + 1,
					bundleVersion.length() - 1);
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

	private static List<RequiredBundle> discoverRequiredBundle(final ManifestElement[] requiredBundles) {
		List<RequiredBundle> result = new ArrayList<RequiredBundle>();
		for (ManifestElement element : requiredBundles) {
			RequiredBundle requiredBundle = ManifestFactory.eINSTANCE.createRequiredBundle();
			requiredBundle.setSymbolicName(element.getValue());
			String bundleVersion = element.getAttribute("bundle-version"); //$NON-NLS-1$
			if (bundleVersion != null) {
				requiredBundle.setVersion(discoverVersion(bundleVersion));
			}
			result.add(requiredBundle);
		}
		return result;
	}

	@Deprecated
	public Resource discoverElement(final Object source, final URI target) {
		return null;
	}

}
