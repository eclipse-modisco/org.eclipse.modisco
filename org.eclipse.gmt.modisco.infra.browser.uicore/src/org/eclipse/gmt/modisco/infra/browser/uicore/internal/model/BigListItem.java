/*******************************************************************************
 * Copyright (c) 2008, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.gmt.modisco.infra.browser.uicore.internal.model;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.Activator;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.AppearanceConfiguration;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.Messages;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.util.Util;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * An item which is displayed as a range when splitting big element lists into smaller ones.
 * <p>
 * This is done so as to avoid locking the GUI for too long when the tree is built
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class BigListItem implements ITreeElement {

	/**
	 * The number of elements inside each range (which is also the number of elements over which the
	 * elements start getting split into ranges)
	 */
	public static final int SPLIT_THRESHOLD = 1000;

	/**
	 * The number of elements above which a progress dialog is shown when sorting elements
	 */
	private static final int SHOW_PROGRESS_DIALOG_THRESHOLD = 5000;

	/**
	 * The list of elements displayed by this BigListItem
	 */
	private final List<Object> elements;
	/**
	 * The tree parent of the element the BigListItem provides content for
	 */
	private final ITreeElement treeParent;
	/** The model element parent of all the elements to display */
	private final EObject modelParent;

	private final int startIndex;
	private final int endIndex;

	/**
	 * Create a BigListItem
	 *
	 * @param sublist
	 *            the list of elements displayed by this BigListItem
	 * @param treeParent
	 *            the parent of the BigListItem in the tree
	 * @param modelParent
	 *            the parent of all the elements
	 */
	public BigListItem(final List<Object> sublist, final int startIndex, final int endIndex,
			final ITreeElement treeParent, final EObject modelParent) {
		this.elements = sublist;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
		this.treeParent = treeParent;
		this.modelParent = modelParent;
		// this.browserConfiguration = browserConfiguration;
	}

	public List<Object> getChildren() {
		return Collections.unmodifiableList(this.elements);
	}

	public Object getParent() {
		return this.treeParent;
	}

	public EObject getModelParent() {
		return this.modelParent;
	}

	public Image getImage() {
		return ImageProvider.getInstance().getRangeIcon();
	}

	/**
	 * Return the text used to describe the range to the user. The lower and upper bounds are padded
	 * with zeroes so that they get sorted correctly (when the user enables sorting)
	 */
	public String getText() {
		// "[" + startIndex + ".." + (endIndex - 1) + "]";
		final int nElements = this.elements.size();
		final int maxDigits = (int) Math.ceil(Math.log10(nElements));

		final StringBuilder buffer = new StringBuilder();
		buffer.append("["); //$NON-NLS-1$

		final String strStartIndex = "" + this.startIndex; //$NON-NLS-1$
		final String strEndIndex = "" + (this.endIndex - 1); //$NON-NLS-1$

		zeroes(maxDigits - strStartIndex.length(), buffer);
		buffer.append(strStartIndex);
		buffer.append(".."); //$NON-NLS-1$
		zeroes(maxDigits - strEndIndex.length(), buffer);
		buffer.append(strEndIndex);

		buffer.append("]"); //$NON-NLS-1$

		return buffer.toString();
	}

	/** Append <code>count</code> number of zeroes to <code>buffer</code> */
	private static void zeroes(final int count, final StringBuilder buffer) {
		for (int i = 0; i < count; i++) {
			buffer.append('0');
		}
	}

	/**
	 * If the number of elements is not too big (lower than {@link BigListItem#SPLIT_THRESHOLD 1000}
	 * ), then return the model elements. If it is big, then split all the elements into groups of
	 * {@link BigListItem#SPLIT_THRESHOLD 1000} elements, each group being represented by a
	 * {@link BigListItem}.
	 * <p>
	 * Also, associate the parent of each element
	 *
	 * @param treeParent
	 *            the parent of the elements in the tree
	 * @param modelParent
	 *            the model element that is the logical parent of the given elements
	 * @param elements
	 *            the list of all the elements that must be split
	 * @param browserConfiguration
	 *            the configuration of the browser displaying the elements
	 * @param ordered
	 *            whether to set order on elements
	 * @return the new list of children: either the same elements list as was given, or a list of
	 *         {@link BigListItem}s, partitioning the original elements into ranges.
	 */
	public static List<?> splitElements(final ITreeElement treeParent, final EObject modelParent,
			final List<? extends Object> elements,
			final AppearanceConfiguration appearanceConfiguration, final boolean ordered) {

		final List<Object> items = new ArrayList<Object>();

		if (elements.size() <= BigListItem.SPLIT_THRESHOLD) {
			int order = 0;
			for (final Object element : elements) {
				if (element instanceof EObject) {
					EObject eObject = (EObject) element;
					final ModelElementItem modelElementItem = appearanceConfiguration
							.getItemsFactory().createModelElementItem(eObject, treeParent,
									appearanceConfiguration);
					if (ordered) {
						modelElementItem.setOrder(order++);
					}
					items.add(modelElementItem);
				} else {
					items.add(element);
				}
			}
			if (appearanceConfiguration.isSortInstances()) {
				sortElements(items);
			}
			return items;
		}

		int order = 0;
		for (final Object element : elements) {
			if (element instanceof EObject) {
				EObject eObject = (EObject) element;
				// do not set the parent yet
				ModelElementItem modelElementItem = appearanceConfiguration.getItemsFactory()
						.createModelElementItem(eObject, null, appearanceConfiguration);
				if (ordered) {
					modelElementItem.setOrder(order++);
				}
				items.add(modelElementItem);
			} else {
				items.add(element);
			}
		}

		/*
		 * sort the elements before they are split (this is necessary because otherwise the elements
		 * would get sorted inside each range, but not between ranges)
		 */
		if (appearanceConfiguration.isSortInstances()) {
			sortElements(items);
		}

		final ArrayList<BigListItem> subLists = new ArrayList<BigListItem>();
		for (int start = 0; start < elements.size(); start += BigListItem.SPLIT_THRESHOLD) {
			// start is inclusive, end is exclusive
			int end = start + BigListItem.SPLIT_THRESHOLD;
			if (end > elements.size()) {
				end = elements.size();
			}
			final List<Object> sublist = items.subList(start, end);

			final BigListItem bigListItem = new BigListItem(sublist, start, end, treeParent,
					modelParent);

			for (Object element : sublist) {
				if (element instanceof ModelElementItem) {
					ModelElementItem modelElementItem = (ModelElementItem) element;
					modelElementItem.setTreeParent(bigListItem);
				}
			}
			subLists.add(bigListItem);
		}
		return subLists;
	}

	/**
	 * Sort the given list of {@link EObject}s alphabetically, by their displayed text. Displays a
	 * progress box, which permits cancellation to the user.
	 */
	static void sortElements(final List<Object> items) {

		final IRunnableWithProgress sortOperation = new IRunnableWithProgress() {
			public void run(final IProgressMonitor monitor) {
				final boolean runningInUIThread = (Display.getDefault().getThread() == Thread
						.currentThread());
				monitor.beginTask(Messages.BigListItem_sortingInstances, IProgressMonitor.UNKNOWN);
				Collections.sort(items, new Comparator<Object>() {
					private int count = 0;
					private static final int CANCELED_POLLING_INTERVAL = 1000;

					public int compare(final Object o1, final Object o2) {
						// don't slow down the comparison by too frequent
						// monitor calls
						if (this.count++ % CANCELED_POLLING_INTERVAL == 0) {
							if (monitor.isCanceled()) {
								throw new OperationCanceledException();
							}

							// process events waiting on display queue
							// to let user click cancel button
							if (runningInUIThread) {
								Display.getDefault().readAndDispatch();
							}
						}

						if (!(o1 instanceof ModelElementItem)) {
							return -1;
						}
						if (!(o2 instanceof ModelElementItem)) {
							return 1;
						}

						final ModelElementItem e1 = (ModelElementItem) o1;
						final ModelElementItem e2 = (ModelElementItem) o2;

						final int metaclassComparison = e1.getEObject().eClass().getName()
								.compareToIgnoreCase(e2.getEObject().eClass().getName());
						if (metaclassComparison != 0) {
							return metaclassComparison;
						}

						final String label1 = e1.getName();
						final String label2 = e2.getName();

						return label1.compareToIgnoreCase(label2);
					}
				});
			}
		};

		final IWorkbench workbench = PlatformUI.getWorkbench();
		final IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
		final Shell shell;
		if (window != null) {
			shell = window.getShell();
		} else {
			shell = null;
		}

		try {
			/*
			 * It is important to not use the UI thread here unless necessary, because this would
			 * cause a deadlock with the BrowserContentProvider, which would wait for a while before
			 * continuing asynchronously. This causes a "loading..." message, and a one-second wait.
			 * This is acceptable for big collections, for which we want to display progress,
			 * though.
			 */
			if (items.size() < BigListItem.SHOW_PROGRESS_DIALOG_THRESHOLD) {
				sortOperation.run(new NullProgressMonitor());
			} else {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						try {
							final ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(
									shell);
							progressMonitorDialog.setOpenOnRun(items.size() > BigListItem.SHOW_PROGRESS_DIALOG_THRESHOLD);
							progressMonitorDialog.run(false, true, sortOperation);
						} catch (final InvocationTargetException e) {
							if (!(e.getCause() instanceof OperationCanceledException)) {
								MoDiscoLogger.logError(e, Activator.getDefault());
							}
						} catch (final InterruptedException e) {
							MoDiscoLogger.logError(e, Activator.getDefault());
						}
					}
				});
			}
		} catch (final OperationCanceledException e) {
			// sorting canceled by user
			MoDiscoLogger.logInfo(Messages.BigListItem_sortingCanceled, Activator.getDefault());
		} catch (InvocationTargetException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		} catch (InterruptedException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	public Font getFont() {
		return null;
	}

	public Color getForeground() {
		return null;
	}

	public Color getBackground() {
		return null;
	}

	public ITreeElement getTreeParent() {
		return this.treeParent;
	}

	public boolean hasChildren() {
		return this.elements.size() > 0;
	}

	/**
	 * equals and hashCode are used to restore the selection in the JFace viewer
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof BigListItem) {
			final BigListItem other = (BigListItem) obj;
			return Util.safeEquals(this.modelParent, other.modelParent)
					&& this.startIndex == other.startIndex;
		}
		return false;
	}

	/**
	 * equals and hashCode are used to restore the selection in the JFace viewer
	 */
	@Override
	public int hashCode() {
		final int hashPrime1 = 47;
		final int hashPrime2 = 13;
		final int hashPrime3 = 7;

		final int ownHashCode = this.startIndex * hashPrime3 + hashPrime2;
		if (this.modelParent != null) {
			return this.modelParent.hashCode() * hashPrime1 + ownHashCode;
		}
		return ownHashCode;
	}

	@Override
	public String toString() {
		return BigListItem.class.getSimpleName() + "(" + getText() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}
}
