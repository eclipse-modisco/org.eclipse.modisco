/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.editors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.modisco.infra.browser.Messages;
import org.eclipse.gmt.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.gmt.modisco.infra.browser.uicore.UnwrappingSelectionProvider;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.model.AttributeItem;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.model.ITreeElement;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.model.LinkItem;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.common.ui.internal.editorInputs.ResourceEditorInput;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

public final class BrowserUtils {

	private BrowserUtils() {
		// make this class non-instantiable
	}

	/** Create a URI converter that avoids opening HTTP connections. */
	public static URIConverter createURIConverter() {
		final List<URIHandler> defaultHandlers = URIHandler.DEFAULT_HANDLERS;
		final List<URIHandler> uriHandlers = new ArrayList<URIHandler>();
		for (URIHandler uriHandler : defaultHandlers) {
			if (uriHandler.getClass() != URIHandlerImpl.class) {
				uriHandlers.add(uriHandler);
			}
		}
		uriHandlers.add(new URIHandlerImpl() {
			@Override
			public Map<String, ?> getAttributes(final URI uri, final Map<?, ?> options) {
				// overloaded to avoid opening an HTTP connection
				return new HashMap<String, Object>();
			}
		});
		return new ExtensibleURIConverterImpl(uriHandlers,
				ContentHandler.Registry.INSTANCE.contentHandlers());
	}

	public static int askUserForDepthToLoadReferencedResources(final int initialValue,
			final Shell shell) {
		final IInputValidator validator = new IInputValidator() {
			public String isValid(final String inputText) {
				if ("*".equals(inputText)) { //$NON-NLS-1$
					return null;
				}
				try {
					Integer.parseInt(inputText);
				} catch (NumberFormatException e) {
					return NLS.bind(Messages.EcoreBrowser_notAPositiveInteger, inputText);
				}
				return null;
			}
		};
		final String initialValueStr;
		if (initialValue == -1) {
			initialValueStr = "*"; //$NON-NLS-1$
		} else {
			initialValueStr = Integer.toString(initialValue);
		}

		final int[] result = new int[1];
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				final InputDialog inputDialog = new InputDialog(shell,
						Messages.EcoreBrowser_selectDepthReferencedResources,
						Messages.EcoreBrowser_modelContainsProxies
								+ Messages.EcoreBrowser_chooseLoadProxiesDepth, initialValueStr,
						validator);

				if (inputDialog.open() == Window.OK) {
					String value = inputDialog.getValue();
					if (value == null) {
						result[0] = 0;
					} else if ("*".equals(value)) { //$NON-NLS-1$
						result[0] = -1;
					} else {
						try {
							result[0] = Integer.parseInt(value);
						} catch (NumberFormatException e) {
							MoDiscoBrowserPlugin.logException(e);
							result[0] = 0;
						}
					}
				}
			}
		});

		return result[0];
	}

	/** Copy the text of the selected element to clipboard */
	public static void handleCopyToClipboard(final ISelection selection) {
		if (selection instanceof ITreeSelection) {
			final ITreeSelection treeSelection = (ITreeSelection) selection;
			StringBuilder builder = new StringBuilder();
			Iterator<?> iterator = treeSelection.iterator();
			while (iterator.hasNext()) {
				if (builder.length() > 0) {
					builder.append("\n"); //$NON-NLS-1$
				}
				Object selectedElement = iterator.next();
				if (selectedElement instanceof ModelElementItem) {
					ModelElementItem modelElementItem = (ModelElementItem) selectedElement;
					builder.append(modelElementItem.getName());
				} else if (selectedElement instanceof AttributeItem) {
					AttributeItem attributeItem = (AttributeItem) selectedElement;
					String valueText = attributeItem.getValueText();
					builder.append(valueText);
				} else if (selectedElement instanceof LinkItem) {
					LinkItem linkItem = (LinkItem) selectedElement;
					builder.append(linkItem.getReference().getName());
				} else if (selectedElement instanceof ITreeElement) {
					ITreeElement treeElement = (ITreeElement) selectedElement;
					builder.append(treeElement.getText());
				} else {
					builder.append(selectedElement.toString());
				}
			}
			Clipboard clipboard = new Clipboard(Display.getDefault());
			clipboard.setContents(new Object[] { builder.toString() },
					new Transfer[] { TextTransfer.getInstance() });
			clipboard.dispose();
		}
	}

	/**
	 * Replace proxy objects by their underlying Ecore objects in the given
	 * selection
	 *
	 * @return the unwrapped version of the selection
	 */
	public static ISelection unwrapSelection(final ISelection selection) {
		return UnwrappingSelectionProvider.unwrapSelection(selection);
	}

	/**
	 * Open the given EObject in the MoDisco model browser.
	 *
	 * @param eObject
	 *            the EObject to show in a model browser
	 * @param useExistingEditor
	 *            open in an existing editor if possible
	 */
	public static void openEObjectInBrowser(final EObject eObject, final boolean useExistingEditor) {
		if (useExistingEditor) {
			// try to re-open the element in the same browser it came from
			Resource resource = eObject.eResource();
			if (resource != null) {
				ResourceSet resourceSet = resource.getResourceSet();
				IWorkbenchWindow[] workbenchWindows = PlatformUI.getWorkbench()
						.getWorkbenchWindows();
				for (IWorkbenchWindow workbenchWindow : workbenchWindows) {
					IWorkbenchPage[] pages = workbenchWindow.getPages();
					for (IWorkbenchPage workbenchPage : pages) {
						IEditorReference[] editorReferences = workbenchPage.getEditorReferences();
						for (IEditorReference editorReference : editorReferences) {
							IEditorPart anEditor = editorReference.getEditor(false);
							if (anEditor instanceof EcoreBrowser) {
								EcoreBrowser browser = (EcoreBrowser) anEditor;
								if (browser.getResourceSet() == resourceSet) {
									browser.browseTo(eObject);
									browser.getSite().getPage().activate(browser);
									return;
								}
							}
						}
					}
				}
			}
		}

		// if that failed (the editor is now closed maybe), then open a new
		// model browser and select the element
		final IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage();
		try {
			final URI elementURI = EcoreUtil.getURI(eObject);
			URI resourceURI = elementURI.trimFragment();
			final IEditorInput editorInput;
			if (resourceURI.isPlatformResource()) {
				String platformString = resourceURI.toPlatformString(true);
				IResource res = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
				if (res instanceof IFile) {
					IFile file = (IFile) res;
					editorInput = new FileEditorInput(file);
				} else {
					MoDiscoBrowserPlugin.logError("Cannot open model: " + resourceURI); //$NON-NLS-1$
					return;
				}
			} else if (EPackage.Registry.INSTANCE.containsKey(resourceURI.toString())) {
				editorInput = new URIEditorInput(resourceURI);
			} else if (eObject.eResource() != null) {
				if (eObject.eResource().getResourceSet() == null) {
					ResourceSet resourceSet = new ResourceSetImpl();
					resourceSet.getResources().add(eObject.eResource());
				}
				editorInput = new ResourceEditorInput(eObject.eResource());
			} else {
				// open a model browser on a new resource containing the
				// element
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource tempResource = resourceSet.createResource(URI
						.createURI("http://eclipse.org/MoDisco/browser/temp")); //$NON-NLS-1$
				tempResource.getContents().add(eObject);
				editorInput = new ResourceEditorInput(tempResource);
			}

			IEditorPart newEditor = IDE.openEditor(activePage, editorInput, EcoreBrowser.EDITOR_ID,
					true);
			if (newEditor instanceof EcoreBrowser) {
				final EcoreBrowser browser = (EcoreBrowser) newEditor;
				final String uriFragment = eObject.eResource().getURIFragment(eObject);
				browser.doWhenLoaded(new Runnable() {
					public void run() {
						boolean result = browser.browseToByURI(uriFragment);
						if (!result) {
							MoDiscoLogger.logError("could not find EObject with uriFragment \"" //$NON-NLS-1$
									+ uriFragment + "\" in the model", //$NON-NLS-1$
									MoDiscoBrowserPlugin.getPlugin());
						}
					}
				});
			}
		} catch (final PartInitException e) {
			MoDiscoBrowserPlugin.logException(e);
		}
	}

}
