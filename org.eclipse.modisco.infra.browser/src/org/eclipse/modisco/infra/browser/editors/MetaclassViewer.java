/*******************************************************************************
 * Copyright (c) 2008, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.editors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.EMFEditPlugin;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.browser.core.InstancesForMetaclass;
import org.eclipse.modisco.infra.browser.core.InstancesForMetaclasses;
import org.eclipse.modisco.infra.browser.uicore.internal.AppearanceConfiguration.MetaclassesSortMode;
import org.eclipse.modisco.infra.browser.uicore.internal.customization.CustomizationEngine;
import org.eclipse.modisco.infra.browser.uicore.internal.extensions.IconProvidersRegistry;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * The viewer for displaying the list of metaclasses that appears in the model
 * editor. The input of this viewer is an instance of the
 * {@link InstancesForMetaclasses} class and the elements are instances of
 * {@link InstancesForMetaclass}.
 */
public class MetaclassViewer implements ISelectionProvider {

	public static final String MENU_ID = EcoreBrowser.EDITOR_ID + ".MetaclassViewer.menu"; //$NON-NLS-1$

	private final TreeViewer treeViewer;

	/** The configuration of the model editor */
	private final BrowserConfiguration browserConfiguration;

	private static final RGB RGB_GRAY = new RGB(128, 128, 128);
	private static final RGB RGB_GREEN = new RGB(0, 128, 0);

	private final IWorkbenchPartSite site;

	/**
	 * @param parent
	 *            the composite in which this viewer must be created
	 * @param browserConfiguration
	 *            the configuration of the model browser, which is passed on to
	 *            the {@link MetaclassViewer}s.
	 * @param formToolkit
	 * @param site
	 */
	public MetaclassViewer(final Composite parent, final BrowserConfiguration browserConfiguration,
			final FormToolkit formToolkit, final IWorkbenchPartSite site) {
		this.browserConfiguration = browserConfiguration;
		this.site = site;

		final Tree tree = formToolkit.createTree(parent, SWT.MULTI | SWT.BORDER);
		this.treeViewer = new TreeViewer(tree);

		initViewer();

		createContextMenu(tree);
	}

	public void setInput(final Object input) {
		this.treeViewer.setInput(input);
	}

	/** Create a context menu on the tree of metaclasses */
	protected void createContextMenu(final Control control) {
		final MetaclassViewerMenuManager menuManager = new MetaclassViewerMenuManager(this,
				this.browserConfiguration);
		final Menu menu = menuManager.createContextMenu(control);
		control.setMenu(menu);
		this.site.registerContextMenu(MetaclassViewer.MENU_ID, menuManager,
				new MetaclassUnwrappingSelectionProvider(this));
	}

	/** Select the class corresponding to the root element (the 'model' element) */
	public void selectRootElement() {
		this.treeViewer.setSelection(null);
		final EList<Resource> resources = this.browserConfiguration.getResourceSet().getResources();
		if (resources.size() > 0) {
			Resource resource = resources.get(0);
			synchronized (resource) {
				final EList<EObject> contents = resource.getContents();
				if (contents.size() > 0) {
					final EObject object = contents.get(0);
					selectMetaclass(object.eClass());
				}
			}
		}
	}

	/** Select the given metaclass */
	public void selectMetaclass(final EClass eClass) {
		Object input = this.treeViewer.getInput();
		if (input instanceof InstancesForMetaclasses) {
			InstancesForMetaclasses instancesForMetaclasses = (InstancesForMetaclasses) input;
			final InstancesForMetaclass instancesForMetaclass = instancesForMetaclasses
					.getInstancesForMetaclass(eClass);
			if (instancesForMetaclass != null) {
				// to force the services pane to clear its selection
				// this.treeViewer.getTree().setFocus();
				// this.browserConfiguration.getEditor().setFocus();
				this.treeViewer.setSelection(new StructuredSelection(instancesForMetaclass), true);
			}
		}
	}

	/**
	 * Return a list of qualified names of selected metaclasses, or an empty
	 * list if none
	 */
	public String[] getSelectedMetaclassesQualifiedNames() {
		final ArrayList<String> selectedMetaclasses = new ArrayList<String>();
		final ISelection selection = this.treeViewer.getSelection();
		if (selection instanceof IStructuredSelection) {
			final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			final Iterator<?> iterator = structuredSelection.iterator();
			while (iterator.hasNext()) {
				final Object selectedElement = iterator.next();
				if (selectedElement instanceof InstancesForMetaclass) {
					final InstancesForMetaclass instancesForMetaclass = (InstancesForMetaclass) selectedElement;
					selectedMetaclasses.add(instancesForMetaclass.getClassQualifiedName());
				}
			}
		}
		return selectedMetaclasses.toArray(new String[selectedMetaclasses.size()]);
	}

	/** Return a list of selected metaclasses, or an empty list if none */
	public EClass[] getSelectedMetaclasses() {
		final ArrayList<EClass> selectedMetaclasses = new ArrayList<EClass>();
		final ISelection selection = this.treeViewer.getSelection();
		if (selection instanceof IStructuredSelection) {
			final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			final Iterator<?> iterator = structuredSelection.iterator();
			while (iterator.hasNext()) {
				final Object selectedElement = iterator.next();
				if (selectedElement instanceof InstancesForMetaclass) {
					final InstancesForMetaclass instancesForMetaclass = (InstancesForMetaclass) selectedElement;
					selectedMetaclasses.add(instancesForMetaclass.getEClass());
				}
			}
		}
		return selectedMetaclasses.toArray(new EClass[selectedMetaclasses.size()]);
	}

	/**
	 * Return the qualified name of the first selected metaclass, or null if
	 * none
	 */
	public String getFirstSelectedMetaclassQualifiedName() {
		final String[] selectedMetaclassesQualifiedNames = getSelectedMetaclassesQualifiedNames();

		String firstSelectedMetaclass = null;
		if (selectedMetaclassesQualifiedNames.length > 0) {
			firstSelectedMetaclass = selectedMetaclassesQualifiedNames[0];
		}
		return firstSelectedMetaclass;
	}

	/**
	 * Return the first selected metaclass, or null if none
	 */
	public EClass getFirstSelectedMetaclass() {
		final EClass[] selectedMetaclasses = getSelectedMetaclasses();

		EClass firstSelectedMetaclass = null;
		if (selectedMetaclasses.length > 0) {
			firstSelectedMetaclass = selectedMetaclasses[0];
		}
		return firstSelectedMetaclass;
	}

	protected class EmptyMetaclassesFilter extends ViewerFilter {
		@Override
		public boolean select(final Viewer viewer, final Object parentElement, final Object element) {
			if (!MetaclassViewer.this.browserConfiguration.getAppearanceConfiguration()
					.isShowEmptyMetaclasses()) {
				if (element instanceof InstancesForMetaclass) {
					final InstancesForMetaclass instancesForMetaclass = (InstancesForMetaclass) element;
					final int count = getInstanceCountFor(instancesForMetaclass);
					if (count == 0) {
						if (MetaclassViewer.this.browserConfiguration.getAppearanceConfiguration()
								.isShowDerivationTree()) {
							// don't hide a node on a branch leading to a
							// non-empty class
							return isOneSubclassNonEmpty(instancesForMetaclass);
						}

						return false;
					}
				} else if (element instanceof PackageGroup) {
					// don't show empty packages
					return !isEmpty((PackageGroup) element);
				}
			}
			return true;
		}

		/** @return whether the given package is empty */
		private boolean isEmpty(final PackageGroup packageGroup) {
			for (final Object element : packageGroup) {
				if (element instanceof PackageGroup) {
					final PackageGroup p = (PackageGroup) element;
					if (!isEmpty(p)) {
						return false;
					}
				} else if (element instanceof InstancesForMetaclass) {
					final InstancesForMetaclass instancesForMetaclass = (InstancesForMetaclass) element;
					if (getInstanceCountFor(instancesForMetaclass) != 0) {
						return false;
					}
				}
			}

			return true;
		}

		private boolean isOneSubclassNonEmpty(final InstancesForMetaclass instancesForMetaclass) {
			final InstancesForMetaclass[] subclasses = instancesForMetaclass.getSubclasses();
			for (final InstancesForMetaclass subclass : subclasses) {
				if (getInstanceCountFor(subclass) > 0 || isOneSubclassNonEmpty(subclass)) {
					return true;
				}
			}
			return false;
		}

		private int getInstanceCountFor(final InstancesForMetaclass instancesForMetaclass) {
			int count = 0;
			if (MetaclassViewer.this.browserConfiguration.getAppearanceConfiguration()
					.isDisplayInstancesOfSubclasses()) {
				count = instancesForMetaclass.totalSize();
			} else {
				count = instancesForMetaclass.size();
			}
			return count;
		}
	}

	/** Filter to hide metaclasses that are customized as not visible */
	protected static class HiddenMetaclassesFilter extends ViewerFilter {

		private final CustomizationEngine customizationEngine;

		public HiddenMetaclassesFilter(final CustomizationEngine customizationEngine) {
			this.customizationEngine = customizationEngine;
		}

		@Override
		public boolean select(final Viewer viewer, final Object parentElement, final Object element) {
			if (element instanceof InstancesForMetaclass) {
				final InstancesForMetaclass instancesForMetaclass = (InstancesForMetaclass) element;
				EClass eClass = instancesForMetaclass.getEClass();
				return this.customizationEngine.isMetaclassVisible(eClass);
			}
			return true;
		}
	}

	protected class MetaclassLabelProvider extends LabelProvider implements IColorProvider,
			IFontProvider {

		private final Color colorGrayedOut;
		private final Color colorFacets;

		public MetaclassLabelProvider() {
			this.colorGrayedOut = new Color(Display.getDefault(), MetaclassViewer.RGB_GRAY);
			this.colorFacets = new Color(Display.getDefault(), MetaclassViewer.RGB_GREEN);
		}

		@Override
		public String getText(final Object element) {
			if (element == EcoreBrowser.LOADING_MESSAGE) {
				return EcoreBrowser.LOADING_MESSAGE;
			}
			if (element instanceof InstancesForMetaclass) {
				final InstancesForMetaclass instancesForMetaclass = (InstancesForMetaclass) element;

				int count = 0;
				if (MetaclassViewer.this.browserConfiguration.getAppearanceConfiguration()
						.isDisplayInstancesOfSubclasses()) {
					count = instancesForMetaclass.totalSize();
				} else {
					count = instancesForMetaclass.size();
				}
				String name;

				if (MetaclassViewer.this.browserConfiguration.getAppearanceConfiguration()
						.isShowMetaclassesFullQualifiedNames()) {
					name = instancesForMetaclass.getClassQualifiedName();
				} else {
					// only show the short name of the class (instead of the
					// full qualified name)
					name = instancesForMetaclass.getEClass().getName();
				}

				return name + " (" + count + ")"; //$NON-NLS-1$ //$NON-NLS-2$
			}

			if (element instanceof PackageGroup) {
				final PackageGroup packageGroup = (PackageGroup) element;
				return packageGroup.getName();
			}

			return element.toString();
		}

		@Override
		public Image getImage(final Object element) {
			try {
				if (element instanceof InstancesForMetaclass) {
					final InstancesForMetaclass instancesForMetaclass = (InstancesForMetaclass) element;
					final EClass eClass = instancesForMetaclass.getEClass();

					final CustomizationEngine customizationEngine = MetaclassViewer.this.browserConfiguration
							.getAppearanceConfiguration().getCustomizationEngine();
					// customized icon for metaclass
					Image metaclassIcon = customizationEngine.getMetaclassIcon(null, eClass);
					if (metaclassIcon != null) {
						return metaclassIcon;
					}

					// customized icon (the same image as for instances of this
					// metaclass)
					// XXX deprecated but still supported
					final Image customizedIcon = customizationEngine.getTypeIcon(null, eClass);
					if (customizedIcon != null) {
						return customizedIcon;
					}

					if (!eClass.isAbstract()) {
						// instantiate an element in order to be able to use the
						// image provider
						final EObject dummyInstance = eClass.getEPackage().getEFactoryInstance()
								.create(eClass);

						// icon provided by an extension
						final IconProvidersRegistry iconProvidersRegistry = IconProvidersRegistry
								.getInstance();
						final Image icon = iconProvidersRegistry.getIcon(dummyInstance);
						if (icon != null) {
							return icon;
						}

						// icon provided by an adapter from the registry
						final IItemLabelProvider itemLabelProvider = (IItemLabelProvider) MetaclassViewer.this.browserConfiguration
								.getAppearanceConfiguration().getAdapterFactory()
								.adapt(dummyInstance, IItemLabelProvider.class);

						if (itemLabelProvider != null) {
							return ExtendedImageRegistry.getInstance().getImage(
									itemLabelProvider.getImage(dummyInstance));
						}
					}

					// default icon for facets : generic facet icon
					if (eClass instanceof Facet) {
						return ImageProvider.getInstance().getFacetIcon();
					}

					// default EMF generated icon
					final String className = eClass.getName();
					final URI imageURI = URI.createURI(EMFEditPlugin.INSTANCE.getImage(
							"full/obj16/Item").toString() //$NON-NLS-1$
							+ "#" + className); //$NON-NLS-1$
					return ExtendedImageRegistry.getInstance().getImage(imageURI);
				}

				if (element instanceof PackageGroup) {
					return ImageProvider.getInstance().getPackageIcon();
				}

			} catch (Exception e) {
				MoDiscoBrowserPlugin.logException("Error retrieving image", e); //$NON-NLS-1$
			}
			return null;
		}

		public Color getBackground(final Object element) {
			return null;
		}

		public Color getForeground(final Object element) {
			if (element instanceof InstancesForMetaclass) {
				final InstancesForMetaclass instancesForMetaclass = (InstancesForMetaclass) element;
				int count = 0;
				if (MetaclassViewer.this.browserConfiguration.getAppearanceConfiguration()
						.isDisplayInstancesOfSubclasses()) {
					count = instancesForMetaclass.totalSize();
				} else {
					count = instancesForMetaclass.size();
				}
				if (count == 0) {
					return this.colorGrayedOut;
				}
				if (instancesForMetaclass.getEClass() instanceof Facet) {
					return this.colorFacets;
				}
			}

			// default color
			return null;
		}

		public Font getFont(final Object element) {
			if (element instanceof InstancesForMetaclass) {
				final InstancesForMetaclass instancesForMetaclass = (InstancesForMetaclass) element;
				if (instancesForMetaclass.getEClass().isAbstract()) {
					return MetaclassViewer.this.browserConfiguration.getAppearanceConfiguration()
							.getCustomItalicFont();
				}
			}

			// default font (possibly customized)
			return MetaclassViewer.this.browserConfiguration.getAppearanceConfiguration()
					.getCustomFont();
		}

		@Override
		public void dispose() {
			this.colorGrayedOut.dispose();
			this.colorFacets.dispose();
			super.dispose();
		}

	}

	/**
	 * A list corresponding to a group of metaclasses belonging to the same
	 * package, or sub-packages.
	 */
	@SuppressWarnings("serial")
	protected static class PackageGroup extends ArrayList<Object> {
		/** The name of the package */
		private final String name;
		private final Object parent;

		public PackageGroup(final Object parent, final String name) {
			this.parent = parent;
			this.name = name;
		}

		public Object getParent() {
			return this.parent;
		}

		public String getName() {
			if (this.name == null) {
				return ""; //$NON-NLS-1$
			}
			return this.name;
		}
	}

	protected class MetaclassContentProvider implements ITreeContentProvider {
		public Object[] getElements(final Object inputElement) {
			if (inputElement == EcoreBrowser.LOADING_MESSAGE) {
				return new Object[] { EcoreBrowser.LOADING_MESSAGE };
			}

			final InstancesForMetaclasses instancesForMetaclasses = (InstancesForMetaclasses) inputElement;
			InstancesForMetaclass[] instancesByMetaclass = instancesForMetaclasses
					.getInstancesForMetaclasses();

			if (MetaclassViewer.this.browserConfiguration.getAppearanceConfiguration()
					.isShowDerivationTree()) {
				instancesByMetaclass = instancesForMetaclasses.getRootMetaclasses();
			}

			if (MetaclassViewer.this.browserConfiguration.getAppearanceConfiguration()
					.isGroupByPackage()
					&& !MetaclassViewer.this.browserConfiguration.getAppearanceConfiguration()
							.isShowDerivationTree()) {
				return groupByPackage(instancesByMetaclass);
			}
			return instancesByMetaclass;
		}

		public void dispose() {
			// nothing
		}

		public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
			// nothing
		}

		public Object[] getChildren(final Object parentElement) {
			if (parentElement instanceof PackageGroup) {
				final PackageGroup packageGroup = (PackageGroup) parentElement;
				return packageGroup.toArray(new Object[packageGroup.size()]);
			}

			if (MetaclassViewer.this.browserConfiguration.getAppearanceConfiguration()
					.isShowDerivationTree()) {
				if (parentElement instanceof InstancesForMetaclass) {
					final InstancesForMetaclass instancesForMetaclass = (InstancesForMetaclass) parentElement;
					return instancesForMetaclass.getSubclasses();
				}
			}

			return new Object[0];
		}

		public Object getParent(final Object element) {
			if (element instanceof PackageGroup) {
				final PackageGroup packageGroup = (PackageGroup) element;
				return packageGroup.getParent();
			}

			if (element instanceof InstancesForMetaclass) {

				final InstancesForMetaclass instancesForMetaclass = (InstancesForMetaclass) element;
				if (MetaclassViewer.this.browserConfiguration.getAppearanceConfiguration()
						.isShowDerivationTree()) {
					final EList<EClass> superTypes = instancesForMetaclass.getEClass()
							.getESuperTypes();
					if (superTypes.size() > 0) {
						// return the first parent found
						final InstancesForMetaclass superclass = MetaclassViewer.this.browserConfiguration
								.getInstancesForMetaclasses().getInstancesForMetaclass(
										superTypes.get(0));
						return superclass;
					}
				} else if (MetaclassViewer.this.browserConfiguration.getAppearanceConfiguration()
						.isGroupByPackage()) {
					return instancesForMetaclass.getParent();
				}
			}

			return null;
		}

		public boolean hasChildren(final Object element) {
			if (element instanceof PackageGroup) {
				final PackageGroup packageGroup = (PackageGroup) element;
				return packageGroup.size() > 0;
			}

			if (MetaclassViewer.this.browserConfiguration.getAppearanceConfiguration()
					.isShowDerivationTree()) {
				if (element instanceof InstancesForMetaclass) {
					final InstancesForMetaclass instancesForMetaclass = (InstancesForMetaclass) element;
					return instancesForMetaclass.getSubclasses().length > 0;
				}
			}

			return false;
		}
	}

	/** Initialize the viewer with a content and label provider */
	private void initViewer() {

		this.treeViewer.setContentProvider(new MetaclassContentProvider());
		this.treeViewer.setLabelProvider(new MetaclassLabelProvider());

		// A filter for empty metaclasses (which don't have any instance in the
		// model)
		this.treeViewer.addFilter(new EmptyMetaclassesFilter());
		// A filter for metaclasses hidden through a customization
		this.treeViewer.addFilter(new HiddenMetaclassesFilter(this.browserConfiguration
				.getAppearanceConfiguration().getCustomizationEngine()));

		setSortMode(this.browserConfiguration.getAppearanceConfiguration().getMetaclassesSortMode());
	}

	/**
	 * Group the given metaclasses by packages.
	 *
	 * @return a list of packages containing metaclasses or other packages
	 *         recursively
	 */
	public Object[] groupByPackage(final InstancesForMetaclass[] instancesByMetaclass) {

		final ArrayList<Object> toplevelItems = new ArrayList<Object>();

		for (final InstancesForMetaclass instancesForMetaclass : instancesByMetaclass) {
			final EClass eClass = instancesForMetaclass.getEClass();
			// path segments in reverse order
			final ArrayList<String> pathSegments = new ArrayList<String>();
			pathSegments.add(eClass.getName());

			EPackage ePackage = eClass.getEPackage();
			while (ePackage != null) {
				pathSegments.add(ePackage.getName());
				ePackage = ePackage.getESuperPackage();
			}

			// copy path segments in reverse in a string table
			final String[] path = new String[pathSegments.size()];
			int i = pathSegments.size() - 1;
			for (final String segment : pathSegments) {
				path[i--] = segment;
			}

			addToPackage(instancesForMetaclass, path, 0, toplevelItems, null);
		}

		return toplevelItems.toArray(new Object[toplevelItems.size()]);
	}

	/**
	 * A recursive function that creates a hierarchy of packages containing
	 * metaclasses
	 *
	 * @param instancesForMetaclass
	 *            the metaclass to add to a package
	 * @param path
	 *            a list of package segments
	 * @param index
	 *            the index of the first package segment to consider
	 * @param items
	 *            the items corresponding to the level from which the path is
	 *            defined (index)
	 * @param parent
	 *            the parent of the object in the tree
	 */
	private void addToPackage(final InstancesForMetaclass instancesForMetaclass,
			final String[] path, final int index, final ArrayList<Object> items, final Object parent) {

		if (path.length - index == 1) {
			instancesForMetaclass.setParent(parent);
			items.add(instancesForMetaclass);
		} else if (path.length - index > 1) {
			// see if the package already exists
			for (final Object item : items) {
				if (item instanceof PackageGroup) {
					final PackageGroup packageGroup = (PackageGroup) item;
					try {
						if (packageGroup.getName().equals(path[index])) {
							// add the element to an existing package
							addToPackage(instancesForMetaclass, path, index + 1, packageGroup,
									packageGroup);
							return;
						}
					} catch (Exception e) {
						MoDiscoLogger.logError(e,
								"Failed to deal with: " + packageGroup.toString(), //$NON-NLS-1$
								MoDiscoBrowserPlugin.getPlugin());
					}
				}
			}

			// create a new package for the element
			final PackageGroup packageGroup = new PackageGroup(parent, path[index]);
			items.add(packageGroup);
			addToPackage(instancesForMetaclass, path, index + 1, packageGroup, packageGroup);
		}
	}

	public void refresh() {
		if (!this.treeViewer.getTree().isDisposed()) {
			try {
				this.treeViewer.getTree().setRedraw(false);
				this.treeViewer.refresh();
			} finally {
				this.treeViewer.getTree().setRedraw(true);
			}
		}
	}

	public void reload() {
		final InstancesForMetaclasses instancesForMetaclasses = this.browserConfiguration
				.getInstancesForMetaclasses();
		this.treeViewer.setInput(instancesForMetaclasses);
		refresh();
	}

	public void addSelectionChangedListener(final ISelectionChangedListener listener) {
		this.treeViewer.addSelectionChangedListener(listener);
	}

	public void removeSelectionChangedListener(final ISelectionChangedListener listener) {
		this.treeViewer.removeSelectionChangedListener(listener);
	}

	public void clearSelection() {
		this.treeViewer.setSelection(null);
	}

	public ISelection getSelection() {
		return unwrapSelection(this.treeViewer.getSelection());
	}

	/**
	 * Replace proxy {@link InstancesForMetaclass} objects by their underlying
	 * Ecore {@link EClass} in the given selection
	 *
	 * @return the unwrapped version of the selection
	 */
	public static ISelection unwrapSelection(final ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			final List<Object> elements = new ArrayList<Object>();
			final Iterator<?> iterator = structuredSelection.iterator();
			while (iterator.hasNext()) {
				final Object element = iterator.next();
				if (element instanceof InstancesForMetaclass) {
					final InstancesForMetaclass instancesForMetaclass = (InstancesForMetaclass) element;
					elements.add(instancesForMetaclass.getEClass());
				} else {
					elements.add(element);
				}
			}
			return new StructuredSelection(elements);
		}
		return selection;
	}

	public void setSortMode(final MetaclassesSortMode mode) {
		this.browserConfiguration.getAppearanceConfiguration().setMetaclassesSortMode(mode);

		if (mode == MetaclassesSortMode.ByName) {
			this.treeViewer.setComparator(new ViewerComparator() {
				@Override
				public int compare(final Viewer viewer, final Object e1, final Object e2) {
					String first = getDisplayedName(e1);
					String second = getDisplayedName(e2);
					if (first == null) {
						// Bug 324417 - [ModelBrowser] error when showing
						// metaclasses with null name
						first = "null"; //$NON-NLS-1$
					}
					return first.compareToIgnoreCase(second);
				}
			});
		} else if (mode == MetaclassesSortMode.ByCount) {
			this.treeViewer.setComparator(new ViewerComparator() {
				@Override
				public int compare(final Viewer viewer, final Object e1, final Object e2) {
					final int first = getCount(e1);
					final int second = getCount(e2);
					return first - second;
				}
			});
		}
	}

	public void setShowMetaclassesFullQualifiedNames(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration()
				.setShowMetaclassesFullQualifiedNames(value);
		this.treeViewer.refresh();
	}

	public void setShowEmptyMetaclasses(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setShowEmptyMetaclasses(value);
		refresh();
	}

	public void setGroupByPackage(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setGroupByPackage(value);
		refresh();
	}

	public void setDisplayInstancesOfSubclasses(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setDisplayInstancesOfSubclasses(
				value);
		refresh();
		// force the model tree to refresh
		if (!this.treeViewer.getSelection().isEmpty()) {
			this.treeViewer.setSelection(this.treeViewer.getSelection());
		}
	}

	public void setShowDerivationTree(final boolean value) {
		this.browserConfiguration.getAppearanceConfiguration().setShowDerivationTree(value);
		refresh();
	}

	/**
	 * @return the name that is displayed for the following element in the
	 *         viewer
	 */
	private String getDisplayedName(final Object object) {
		String name = ""; //$NON-NLS-1$
		if (object instanceof InstancesForMetaclass) {
			final InstancesForMetaclass instancesForMetaclass = (InstancesForMetaclass) object;
			if (this.browserConfiguration.getAppearanceConfiguration()
					.isShowMetaclassesFullQualifiedNames()) {
				name = instancesForMetaclass.getClassQualifiedName();
			} else {
				name = instancesForMetaclass.getEClass().getName();
			}
		}
		return name;
	}

	/**
	 * @return the instance count for the given element (metaclass) in the
	 *         viewer
	 */
	private int getCount(final Object object) {
		int count = 0;
		if (object instanceof InstancesForMetaclass) {
			final InstancesForMetaclass instancesForMetaclass = (InstancesForMetaclass) object;
			if (this.browserConfiguration.getAppearanceConfiguration()
					.isDisplayInstancesOfSubclasses()) {
				count = instancesForMetaclass.totalSize();
			} else {
				count = instancesForMetaclass.size();
			}
		}
		return count;
	}

	public void setFont(final Font font) {
		this.treeViewer.getTree().setFont(font);
	}

	public Viewer getViewer() {
		return this.treeViewer;
	}

	public void setSelection(final ISelection selection) {
		this.treeViewer.setSelection(selection);
	}
}