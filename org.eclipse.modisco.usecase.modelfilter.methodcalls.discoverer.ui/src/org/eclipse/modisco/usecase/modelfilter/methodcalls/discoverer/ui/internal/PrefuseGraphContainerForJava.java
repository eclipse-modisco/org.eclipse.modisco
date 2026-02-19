/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/

package org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer.ui.internal;

import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.prefuse.PrefuseGraphContainer;
import org.eclipse.modisco.java.AbstractMethodDeclaration;

import prefuse.controls.ControlAdapter;
import prefuse.data.Graph;
import prefuse.data.Tuple;
import prefuse.visual.VisualItem;

public final class PrefuseGraphContainerForJava extends PrefuseGraphContainer {

	private static PrefuseGraphContainerForJava instance = new PrefuseGraphContainerForJava();

	private PrefuseGraphContainerForJava() {

	}

	public static PrefuseGraphContainerForJava getInstance() {
		return PrefuseGraphContainerForJava.instance;
	}

	public static final String JAVA_OPERATION = "javaOperation"; //$NON-NLS-1$
	public static final String JDT_PROJECT = "jdtProject"; //$NON-NLS-1$

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.modisco.infra.prefuse.PrefuseGraphContainer#initializeTreeViewContainer(prefuse
	 * .data.Graph, java.lang.String)
	 */
	@Override
	public JPanel initializeTreeViewContainer(final Graph graph, final String label,
			final String image) {
		ControlAdapter controlAdapter = new ControlAdapter() {
			/*
			 * (non-Javadoc)
			 *
			 * @see prefuse.controls.ControlAdapter#itemClicked(prefuse.visual.VisualItem,
			 * java.awt.event.MouseEvent)
			 */
			@Override
			public void itemClicked(final VisualItem item, final MouseEvent e) {
				/*
				 * Left button and double click
				 */
				if ((e.getButton() == MouseEvent.BUTTON1) && (e.getClickCount() > 1)) {
					/*
					 * We get the source object (Node) with method "item.getSourceTuple()"
					 *
					 * From the tuple, we could get the source java operation (underground
					 * attribute)
					 */
					Tuple tuple = item.getSourceTuple();
					if (tuple.canGet(PrefuseGraphContainerForJava.JAVA_OPERATION,
							AbstractMethodDeclaration.class)) {
						AbstractMethodDeclaration operation = (AbstractMethodDeclaration) tuple
								.get(PrefuseGraphContainerForJava.JAVA_OPERATION);
						/*
						 * we don't have to browse the code it is a proxy element ...
						 */
						if (!operation.isProxy()) {
							/*
							 * go back to the corresponding java code !!!
							 */
							//BrowseJavaCode browserUtil = new BrowseJavaCode();
							//browserUtil.browseJavaCode(operation);
							Logger.logWarning("not implemented", Activator.getDefault()); //$NON-NLS-1$
						}
					}
				}
			}
		};
		JPanel result = initializeTreeViewContainer(graph, label, image, controlAdapter);
		return result;
	}

}
