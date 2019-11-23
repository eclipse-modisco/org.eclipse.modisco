/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.actions;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.browser.dialogs.EnableDerivedLinksPromptDialog;
import org.eclipse.modisco.infra.browser.editors.EcoreBrowser;
import org.eclipse.modisco.infra.browser.preferences.PreferenceConstants;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.util.ImageUtils;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.FacetPackage;
import org.eclipse.modisco.infra.facet.FacetSet;
import org.eclipse.modisco.infra.facet.core.FacetSetCatalog;
import org.eclipse.modisco.infra.facet.ui.views.FacetSetContentProvider;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.CheckedTreeSelectionDialog;

public class LoadFacetsAction extends Action {

	private final IBrowserActionBarContributor browserActionBarContributor;

	public LoadFacetsAction(final IBrowserActionBarContributor browserActionBarContributor) {
		super(Messages.BrowserActionBarContributor_loadFacets, IAction.AS_PUSH_BUTTON);
		this.browserActionBarContributor = browserActionBarContributor;
		setToolTipText(Messages.BrowserActionBarContributor_loadFacets);
		setImageDescriptor(ImageProvider.getInstance().getFacetIconDescriptor());
	}

	private static class LoadFacetsDialog extends CheckedTreeSelectionDialog {
		private static final String LOAD_FACETS_DIALOG = "LoadFacetsDialog"; //$NON-NLS-1$
		private static final String EXPANDED_ELEMENTS = "expandedElements"; //$NON-NLS-1$

		// private Label messageArea;
		// private Composite selectionButtons;

		public LoadFacetsDialog(final Shell parent, final ILabelProvider labelProvider,
				final ITreeContentProvider contentProvider, final Collection<EPackage> ePackages) {
			super(parent, labelProvider, contentProvider);
			// show only Facets corresponding to the current EPackages or
			// referenced EPackages
			final Set<EPackage> allReferencedPackages = new HashSet<EPackage>();

			for (EPackage ePackage : ePackages) {
				allReferencedPackages.add(ePackage);
				final Set<EPackage> referencedPackages = ModelUtils
						.computeReferencedPackages(ePackage);
				allReferencedPackages.addAll(referencedPackages);
			}

			addFilter(new ViewerFilter() {
				@Override
				public boolean select(final Viewer viewer, final Object parentElement,
						final Object element) {
					if (element instanceof FacetSet) {
						FacetSet facetSet = (FacetSet) element;
						if (facetSet.getExtendedPackage() == null) {
							return true;
						}
						EPackage extendedPackage = facetSet.getExtendedPackage();
						return allReferencedPackages.contains(extendedPackage);
					}
					return true;
				}
			});
		}

		@Override
		public int open() {
			restoreExpandedElements();
			return super.open();
		}

		@Override
		public boolean close() {
			saveExpandedElements();
			return super.close();
		}

		public void saveExpandedElements() {
			try {
				String filename = getSettingsFilename();
				DialogSettings settings = new DialogSettings(
						LoadFacetsAction.LoadFacetsDialog.LOAD_FACETS_DIALOG);

				List<String> expandedFacetSets = new ArrayList<String>();

				Object[] expandedElements = getTreeViewer().getExpandedElements();
				for (Object expandedElement : expandedElements) {
					if (expandedElement instanceof FacetSet) {
						FacetSet facetSet = (FacetSet) expandedElement;
						expandedFacetSets.add(facetSet.getName());
					}
				}
				String[] array = expandedFacetSets.toArray(new String[expandedFacetSets.size()]);
				settings.put(LoadFacetsAction.LoadFacetsDialog.EXPANDED_ELEMENTS, array);
				settings.save(filename);
			} catch (Exception e) {
				MoDiscoBrowserPlugin.logException(e);
			}
		}

		private String getSettingsFilename() {
			IPath stateLocation = MoDiscoBrowserPlugin.getPlugin().getStateLocation();
			String filename = stateLocation.append(
					LoadFacetsAction.LoadFacetsDialog.LOAD_FACETS_DIALOG).toOSString();
			return filename;
		}

		public void restoreExpandedElements() {
			try {
				String filename = getSettingsFilename();
				DialogSettings settings = new DialogSettings(
						LoadFacetsAction.LoadFacetsDialog.LOAD_FACETS_DIALOG);
				if (new File(filename).isFile()) {
					settings.load(filename);
					String[] array = settings
							.getArray(LoadFacetsAction.LoadFacetsDialog.EXPANDED_ELEMENTS);

					final Collection<FacetSet> facetSets = FacetSetCatalog.getSingleton()
							.getAllFacetSets();
					final List<FacetSet> expandedFacetSets = new ArrayList<FacetSet>();
					for (String expandedFacetSetName : array) {
						for (FacetSet facetSet : facetSets) {
							if (facetSet.getName() != null
									&& facetSet.getName().equals(expandedFacetSetName)) {
								expandedFacetSets.add(facetSet);
							}
						}
					}
					setExpandedElements(expandedFacetSets.toArray());
				}
			} catch (Exception e) {
				MoDiscoBrowserPlugin.logException(e);
			}
		}

		// @Override
		// public void setInput(final Object input) {
		// super.setInput(input);
		// getTreeViewer().setInput(input);
		// if (input != null) {
		//				//this.messageArea.setText(""); //$NON-NLS-1$
		// this.messageArea.setEnabled(true);
		// this.selectionButtons.setEnabled(true);
		// getTreeViewer().getTree().setEnabled(true);
		// }
		// }
		//
		// public void refresh() {
		// getTreeViewer().refresh();
		// }
		//
		// @Override
		// protected Label createMessageArea(final Composite composite) {
		// this.messageArea = super.createMessageArea(composite);
		// return this.messageArea;
		// }
		//
		// @Override
		// protected Composite createSelectionButtons(final Composite composite)
		// {
		// this.selectionButtons = super.createSelectionButtons(composite);
		// return this.selectionButtons;
		// }
	}

	@Override
	public void run() {
		final EcoreBrowser browser = this.browserActionBarContributor.getBrowser();
		if (browser != null) {
			BusyIndicator.showWhile(null, new Runnable() {
				public void run() {
					FacetSetCatalog.getSingleton().waitUntilBuilt();
				}
			});
			openDialog(browser);
			// FacetSetCatalog.getSingleton().whenBuilt(new Runnable() {
			// public void run() {
			// Display.getDefault().syncExec(new Runnable() {
			// public void run() {
			// openDialog(browser);
			// }
			// });
			// }
			// });
		}
	}

	protected void openDialog(final EcoreBrowser browser) {
		final ITreeContentProvider treeContentProvider = new FacetSetContentProvider(
				FacetPackage.eINSTANCE.getFacet());

		final LoadFacetsDialog dialog = new LoadFacetsDialog(null, this.labelProvider,
				treeContentProvider, browser.getReferencedEPackages());
		dialog.setContainerMode(true);
		dialog.setHelpAvailable(false);
		dialog.setTitle(Messages.BrowserActionBarContributor_dialogTitle_LoadFacets);
		dialog.setMessage(Messages.BrowserActionBarContributor_chooseFacetToLoad);

		final Collection<FacetSet> facetSets = FacetSetCatalog.getSingleton().getAllFacetSets();
		dialog.setInput(facetSets.toArray());
		dialog.setInitialElementSelections(new ArrayList<Facet>(browser.getBrowserConfiguration()
				.getAppearanceConfiguration().getLoadedFacets()));

		if (dialog.open() == Window.OK) {
			final Object[] result = dialog.getResult();
			browser.getBrowserConfiguration().getAppearanceConfiguration().clearFacets();
			final HashSet<Facet> facetsToLoad = new HashSet<Facet>();
			boolean promptShowDerivedLinks = false;
			for (final Object resultElement : result) {
				if (resultElement instanceof Facet) {
					final Facet facet = (Facet) resultElement;
					facetsToLoad.add(facet);
					if (!facet.getEReferences().isEmpty() || !facet.getEAttributes().isEmpty()) {
						promptShowDerivedLinks = true;
					}
				} else if (!(resultElement instanceof FacetSet)) {
					throw new RuntimeException("Unexpected element type"); //$NON-NLS-1$
				}
			}

			if (promptShowDerivedLinks
					&& !this.browserActionBarContributor.getBrowser().isShowDerivedLinks()) {
				maybeShowDerivedLinks();
			}

			loadFacets(facetsToLoad, browser);
		}
	}

	public static void loadFacets(final Collection<Facet> facetsToLoad, final EcoreBrowser browser) {
		final Object loadFacetsFamily = new Object();
		for (final Facet facetToLoad : facetsToLoad) {
			Job loadFacetsJob = new Job(Messages.LoadFacetsAction_LoadingFacet + facetToLoad.getName()) {
				@Override
				protected IStatus run(final IProgressMonitor monitor) {
					browser.getBrowserConfiguration().getAppearanceConfiguration()
							.loadFacet(facetToLoad);
					return Status.OK_STATUS;
				}

				@Override
				public boolean belongsTo(final Object family) {
					if (family == loadFacetsFamily) {
						return true;
					}
					return super.belongsTo(family);
				}
			};
			loadFacetsJob.setPriority(Job.LONG);
			loadFacetsJob.schedule();
		}

		Job job = new Job(Messages.LoadFacetsAction_LoadingFacets) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				try {
					Job.getJobManager().join(loadFacetsFamily, monitor);
				} catch (Exception e) {
					MoDiscoLogger.logError(e, MoDiscoBrowserPlugin.getPlugin());
					return Status.CANCEL_STATUS;
				}
				if (facetsToLoad.size() > 0) {
					// since customizations can apply to facets, reload
					// customizations
					browser.getBrowserConfiguration().getAppearanceConfiguration()
							.getCustomizationEngine().loadCustomizations();
				}
				// browser.reloadModel();
				// for modified facets
				browser.getBrowserConfiguration().getInstancesForMetaclasses()
						.buildDerivationTree();
				browser.getBrowserConfiguration().getAppearanceConfiguration().touch();
				browser.refreshDelayed(true);
				return Status.OK_STATUS;
			}
		};
		job.setPriority(Job.LONG);
		job.schedule();
	}

	private void maybeShowDerivedLinks() {
		IPreferenceStore preferenceStore = MoDiscoBrowserPlugin.getPlugin().getPreferenceStore();
		String pref = preferenceStore
				.getString(PreferenceConstants.P_BROWSER_ENABLE_DERIVED_LINKS_SETTING);
		boolean showDerivedLinks = false;
		if (PreferenceConstants.P_BROWSER_ENABLE_DERIVED_LINKS_ASK.equals(pref)) {
			showDerivedLinks = EnableDerivedLinksPromptDialog.open(null);
		} else if (PreferenceConstants.P_BROWSER_ENABLE_DERIVED_LINKS_ALWAYS.equals(pref)) {
			showDerivedLinks = true;
		} else if (PreferenceConstants.P_BROWSER_ENABLE_DERIVED_LINKS_NEVER.equals(pref)) {
			showDerivedLinks = false;
		}

		if (showDerivedLinks) {
			this.browserActionBarContributor.getBrowser().setShowDerivedLinks(true);
			this.browserActionBarContributor.getBrowser().refreshToolbar();
		}

	}

	private final LabelProvider labelProvider = new LabelProvider() {
		@Override
		public String getText(final Object element) {
			String label;
			if (element instanceof FacetSet) {
				final FacetSet facetSet = (FacetSet) element;
				label = facetSet.getName();
			} else if (element instanceof Facet) {
				final Facet facet = (Facet) element;
				label = facet.getName();
			} else if (element == null) {
				label = "null"; //$NON-NLS-1$
			} else {
				label = element.getClass().getName();
			}
			return label;
		}

		@Override
		public Image getImage(final Object element) {
			return ImageUtils.getImage(element);
		}
	};
}
