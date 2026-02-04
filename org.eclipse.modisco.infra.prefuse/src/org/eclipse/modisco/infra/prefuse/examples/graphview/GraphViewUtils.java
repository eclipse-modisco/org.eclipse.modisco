/*
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */

package org.eclipse.modisco.infra.prefuse.examples.graphview;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import prefuse.data.Graph;
import prefuse.util.GraphLib;

/**
 * @author Gabriel Barbier
 *
 */
@SuppressWarnings("serial")
public class GraphViewUtils {

	public static JFrame demo(Graph g, String label) {
		final GraphView view = new GraphView(g, label);

		// set up menu
		JMenu dataMenu = new JMenu(Messages.GraphViewUtils_Data);
		dataMenu.add(new OpenGraphAction(view));
		dataMenu.add(new GraphMenuAction(Messages.GraphViewUtils_Grid, "ctrl 1", view) { //$NON-NLS-1$
			protected Graph getGraph() {
				return GraphLib.getGrid(15, 15);
			}
		});
		dataMenu.add(new GraphMenuAction(Messages.GraphViewUtils_Clique, "ctrl 2", view) { //$NON-NLS-1$
			protected Graph getGraph() {
				return GraphLib.getClique(10);
			}
		});
		dataMenu.add(new GraphMenuAction(Messages.GraphViewUtils_Honeycomb, "ctrl 3", view) { //$NON-NLS-1$
			protected Graph getGraph() {
				return GraphLib.getHoneycomb(5);
			}
		});
		dataMenu.add(new GraphMenuAction(Messages.GraphViewUtils_BalancedTree, "ctrl 4", view) {//$NON-NLS-1$
			protected Graph getGraph() {
				return GraphLib.getBalancedTree(3, 5);
			}
		});
		dataMenu.add(new GraphMenuAction(Messages.GraphViewUtils_DiamondTree, "ctrl 5", view) { //$NON-NLS-1$
			protected Graph getGraph() {
				return GraphLib.getDiamondTree(3, 3, 3);
			}
		});
		JMenuBar menubar = new JMenuBar();
		menubar.add(dataMenu);

		// launch window
		JFrame frame = new JFrame(Messages.GraphViewUtils_JFrameTitle);
		frame.setJMenuBar(menubar);
		frame.setContentPane(view);
		frame.pack();
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent e) {
				view.getVisualization().run("layout"); //$NON-NLS-1$
			}

			public void windowDeactivated(WindowEvent e) {
				view.getVisualization().cancel("layout"); //$NON-NLS-1$
			}
		});

		return frame;
	}
}
