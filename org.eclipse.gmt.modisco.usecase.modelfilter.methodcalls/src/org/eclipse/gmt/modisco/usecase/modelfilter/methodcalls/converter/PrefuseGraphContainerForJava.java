/**
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/

package org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.converter;

import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import org.eclipse.gmt.modisco.infra.prefuse.PrefuseGraphContainer;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.actions.BrowseJavaCode;

import prefuse.controls.ControlAdapter;
import prefuse.data.Graph;
import prefuse.data.Tuple;
import prefuse.visual.VisualItem;

/**
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public class PrefuseGraphContainerForJava extends PrefuseGraphContainer {

	private static PrefuseGraphContainerForJava instance = new PrefuseGraphContainerForJava();

	private PrefuseGraphContainerForJava() {

	}

	public static PrefuseGraphContainerForJava getInstance() {
		return PrefuseGraphContainerForJava.instance;
	}

	public final static String javaOperation = "javaOperation"; //$NON-NLS-1$
	public final static String jdtProject = "jdtProject"; //$NON-NLS-1$

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.infra.prefuse.PrefuseGraphContainer#initializeTreeViewContainer(prefuse
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
			public void itemClicked(VisualItem item, MouseEvent e) {
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
					if (tuple.canGet(PrefuseGraphContainerForJava.javaOperation,
							AbstractMethodDeclaration.class)) {
						AbstractMethodDeclaration operation = (AbstractMethodDeclaration) tuple
								.get(PrefuseGraphContainerForJava.javaOperation);
						/*
						 * we don't have to browse the code it is a proxy element ...
						 */
						if (operation.isProxy() == false) {
							/*
							 * go back to the corresponding java code !!!
							 */
							BrowseJavaCode browserUtil = new BrowseJavaCode();
							browserUtil.browseJavaCode(operation);
						}
					}
				}
			}
		};
		JPanel result = this.initializeTreeViewContainer(graph, label, image, controlAdapter);
		return result;
	}

}
