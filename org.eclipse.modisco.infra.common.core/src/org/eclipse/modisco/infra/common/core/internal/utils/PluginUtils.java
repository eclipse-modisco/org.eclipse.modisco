/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Manifest;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.modisco.infra.common.core.internal.CommonModiscoActivator;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.osgi.util.ManifestElement;
import org.eclipse.pde.core.plugin.IPluginAttribute;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginObject;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

public final class PluginUtils {

	private PluginUtils() {
		// utilities class
	}

	/**
	 * Returns whether the given file is registered in the plugin.xml of the
	 * given project, using the given extension point.
	 *
	 * @param extensionPoint
	 *            the extension point that is used to register elements of this
	 *            kind (elements must be declared with a "file" attribute)
	 */
	public static boolean isRegistered(final IFile elementFile, final String extensionPoint) {
		final IProject project = elementFile.getProject();
		String value = getExtensionValue(project, extensionPoint, "file"); //$NON-NLS-1$
		if (value != null && value.length() > 0) {
			IFile file = project.getFile(value);
			if (file.exists() && elementFile.equals(file)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns the value of an attribute in an extension point.
	 *
	 * @param project
	 *            the project in which to look for an extension
	 * @param extensionPoint
	 *            the extension point that is used to register elements of this
	 *            kind (elements must be declared with a "file" attribute)
	 * @param attributeName
	 *            the attribute of the extension point whose value to get
	 */
	public static String getExtensionValue(final IProject project, final String extensionPoint,
			final String attributeName) {
		IPluginModelBase pluginModel = PluginRegistry.findModel(project);
		if (pluginModel != null) {
			IPluginExtension[] extensions = pluginModel.getExtensions().getExtensions();
			for (IPluginExtension pluginExtension : extensions) {
				if (extensionPoint.equals(pluginExtension.getPoint())) {
					IPluginObject[] children = pluginExtension.getChildren();
					for (IPluginObject child : children) {
						if (child instanceof IPluginElement) {
							IPluginElement pluginElement = (IPluginElement) child;
							IPluginAttribute[] attributes = pluginElement.getAttributes();
							for (IPluginAttribute pluginAttribute : attributes) {
								if (attributeName.equalsIgnoreCase(pluginAttribute.getName())) {
									String value = pluginAttribute.getValue();
									return value;
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * Registers the given file in the plugin.xml of its containing project,
	 * using the given extension point.
	 *
	 * @param file
	 *            the file to register
	 * @param extensionPointId
	 *            the extension point that is used to register the file
	 * @param elementName
	 *            the name of the XML element in which an attribute named "file"
	 *            will be set to the path of the file
	 */
	public static void register(final IFile file, final String extensionPointId,
			final String elementName) {
		if (isRegistered(file, extensionPointId)) {
			return;
		}

		IPath filePath = file.getFullPath().removeFirstSegments(1);
		final IProject project = file.getProject();
		registerInPluginXML(project, extensionPointId, elementName, new String[] { "file" }, //$NON-NLS-1$
				new String[] { filePath.toString() });
	}

	/**
	 * Registers an extension in the plugin.xml of the given project, using the
	 * given extension point. If the plugin.xml file doesn't exist, it will be
	 * created an registered in the build.properties.
	 *
	 * The extension will look like this:
	 *
	 * <pre>
	 * &lt;extension point="extensionPointId"&gt;
	 *   &lt;elementName attribute0="value0" attribute1="value1" ... /&gt;
	 * &lt;/extension&gt;
	 * </pre>
	 *
	 * @param project
	 *            the project in which to register an extension
	 * @param extensionPointId
	 *            the extension point that is used to register the extension
	 * @param elementName
	 *            the name of the XML element used to register, in which the
	 *            given attributes are defined
	 * @param attributes
	 *            a list of attribute names
	 * @param values
	 *            a list of corresponding values (must match the attribute
	 *            names)
	 */
	public static void registerInPluginXML(final IProject project, final String extensionPointId,
			final String elementName, final String[] attributes, final String[] values) {

		if (attributes.length != values.length) {
			throw new IllegalArgumentException("mismatching arrays"); //$NON-NLS-1$
		}

		IFile pluginXML = project.getFile("plugin.xml"); //$NON-NLS-1$
		if (pluginXML.exists()) {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder;

			// <extension
			// point="extensionPointId">
			// <elementName attribute0="value0" attribute1="value1" ... />
			// </elementName>

			try {
				docBuilder = docFactory.newDocumentBuilder();
				Document doc = docBuilder.parse(pluginXML.getLocation().toOSString());
				Element root = doc.getDocumentElement();

				Text whitespace = doc.createTextNode("   "); //$NON-NLS-1$
				root.appendChild(whitespace);

				Node extensionNode = doc.createElement("extension"); //$NON-NLS-1$
				Attr pointAttr = doc.createAttribute("point"); //$NON-NLS-1$
				pointAttr.setValue(extensionPointId);
				extensionNode.getAttributes().setNamedItem(pointAttr);
				root.appendChild(extensionNode);

				Node elementNode = doc.createElement(elementName);
				for (int i = 0; i < attributes.length; i++) {
					Attr attr = doc.createAttribute(attributes[i]);
					attr.setValue(values[i]);
					elementNode.getAttributes().setNamedItem(attr);
				}
				extensionNode.appendChild(elementNode);

				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				final int indent = 3;
				transformerFactory.setAttribute("indent-number", Integer.valueOf(indent)); //$NON-NLS-1$
				Transformer transformer = transformerFactory.newTransformer();
				transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8"); //$NON-NLS-1$
				transformer.setOutputProperty(OutputKeys.INDENT, "yes"); //$NON-NLS-1$
				StreamResult result = new StreamResult(new StringWriter());
				DOMSource source = new DOMSource(doc);
				transformer.transform(source, result);
				String xmlString = result.getWriter().toString();

				byte[] byteArray = xmlString.getBytes("UTF-8"); //$NON-NLS-1$
				pluginXML.setContents(new ByteArrayInputStream(byteArray), true, true,
						new NullProgressMonitor());

			} catch (Exception e) {
				MoDiscoLogger.logError(e, CommonModiscoActivator.getDefault());
			}
		} else {
			try {
				// create plugin.xml
				StringBuilder builder = new StringBuilder();
				builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"); //$NON-NLS-1$
				builder.append("<?eclipse version=\"3.4\"?>\n"); //$NON-NLS-1$
				builder.append("<plugin>\n"); //$NON-NLS-1$
				builder.append("   <extension point=\"").append(extensionPointId).append("\">\n"); //$NON-NLS-1$ //$NON-NLS-2$
				builder.append("      <").append(elementName); //$NON-NLS-1$
				for (int i = 0; i < attributes.length; i++) {
					builder.append(" "); //$NON-NLS-1$
					builder.append(attributes[i]).append("=\"").append(values[i]).append("\""); //$NON-NLS-1$ //$NON-NLS-2$
				}
				builder.append("/>\n"); //$NON-NLS-1$
				builder.append("   </extension>\n"); //$NON-NLS-1$
				builder.append("</plugin>\n"); //$NON-NLS-1$

				byte[] byteArray;
				byteArray = builder.toString().getBytes("UTF-8"); //$NON-NLS-1$
				pluginXML.create(new ByteArrayInputStream(byteArray), true,
						new NullProgressMonitor());
				try {
					BuildPropertiesUtils.addToBuild(pluginXML);
				} catch (Exception e) {
					MoDiscoLogger.logError(e, "Error adding file " + pluginXML.getFullPath() //$NON-NLS-1$
							+ " to the build.properties", null); //$NON-NLS-1$
				}
			} catch (Exception e) {
				MoDiscoLogger.logError(e, CommonModiscoActivator.getDefault());
			}
		}

		// try {
		// IPluginModelBase pluginModel = PluginRegistry.findModel(project);
		// IExtensionsModelFactory factory = pluginModel.getFactory();
		// IPluginExtension extension = factory.createExtension();
		// extension.setPoint(extensionPointId);
		// IPluginElement element = factory.createElement(extension);
		// element.setName(elementName);
		//			element.setAttribute("file", filePath.toPortableString()); //$NON-NLS-1$
		// pluginModel.getExtensions().add(extension);
		// ((IEditableModel) pluginModel).save();
		// } catch (Exception e) {
		// MoDiscoLogger.logError(e, CommonModiscoActivator.getDefault());
		// }
	}

	/**
	 * Add a list of required bundles to a plug-in project.
	 *
	 * @param project
	 *            the plug-in project whose Manifest.MF to modify
	 * @param requiredBundles
	 *            the list of bundles to add to the requirements
	 * @throws IllegalArgumentException
	 *             if the given project is not a plug-in project with an
	 *             existing Manifest.MF
	 */
	public static void addRequiredBundles(final IProject project, final List<String> requiredBundles) {
		final List<String> missingRequiredBundles = new ArrayList<String>();
		// start with all and then remove those already present
		missingRequiredBundles.addAll(requiredBundles);

		modifyManifest(project, new ManifestModificationOperation() {
			public void modifyManifest(final Manifest manifest) {
				try {
					String requires = manifest.getMainAttributes().getValue("Require-Bundle"); //$NON-NLS-1$
					if (requires != null) {
						ManifestElement[] manifestElements = ManifestElement.parseHeader(
								"Require-Bundle", requires); //$NON-NLS-1$
						for (ManifestElement manifestElement : manifestElements) {
							// make sure it won't be duplicated
							missingRequiredBundles.remove(manifestElement.getValue());
						}
					}

					StringBuilder newRequires = new StringBuilder();
					if (requires != null) {
						newRequires.append(requires);
					}
					for (int i = 0; i < missingRequiredBundles.size(); i++) {
						String missingRequiredBundle = missingRequiredBundles.get(i);
						if (i != 0 || requires != null) {
							newRequires.append(","); //$NON-NLS-1$
						}
						newRequires.append(missingRequiredBundle);
					}

					manifest.getMainAttributes().putValue("Require-Bundle", newRequires.toString()); //$NON-NLS-1$
				} catch (Exception e) {
					MoDiscoLogger.logError(e, CommonModiscoActivator.getDefault());
				}
			}
		});
	}

	/** Makes the given plug-in project a singleton */
	public static void makeSingleton(final IProject project) {
		modifyManifest(project, new ManifestModificationOperation() {
			public void modifyManifest(final Manifest manifest) {
				String symbolicName = manifest.getMainAttributes().getValue("Bundle-SymbolicName"); //$NON-NLS-1$
				Pattern pattern = Pattern.compile(";\\s*singleton\\s*:=\\s*true"); //$NON-NLS-1$
				if (!pattern.matcher(symbolicName).find()) {
					manifest.getMainAttributes()
							.putValue("Bundle-SymbolicName", symbolicName + ";singleton:=true"); //$NON-NLS-1$//$NON-NLS-2$
				}
			}
		});
	}

	public interface ManifestModificationOperation {
		void modifyManifest(Manifest manifest);
	}

	/**
	 * Reads the MANIFEST.MF of the given project, modifies it using the
	 * provided operation, and writes it back to its file.
	 *
	 * @param project
	 *            the project whose Manifest to modify
	 * @param manifestModificationOperation
	 *            the operation to perform on the Manifest
	 */
	public static void modifyManifest(final IProject project,
			final ManifestModificationOperation manifestModificationOperation) {
		IFile manifestResource = (IFile) project.findMember(new Path("/META-INF/MANIFEST.MF")); //$NON-NLS-1$
		if (manifestResource == null) {
			throw new IllegalArgumentException(
					"Project is not a plug-in project : couldn't setup Manifest.MF because it wasn't found."); //$NON-NLS-1$
		}

		try {
			manifestResource.refreshLocal(IResource.DEPTH_ONE, new NullProgressMonitor());
			InputStream contents = manifestResource.getContents();
			Manifest manifest = new Manifest(contents);

			manifestModificationOperation.modifyManifest(manifest);

			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			manifest.write(outputStream);
			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
					outputStream.toByteArray());
			manifestResource.setContents(byteArrayInputStream, true, true,
					new NullProgressMonitor());
		} catch (Exception e) {
			MoDiscoLogger.logError(e, CommonModiscoActivator.getDefault());
		}
	}
}
