/*
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */

package org.eclipse.modisco.infra.prefuse;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.eclipse.modisco.infra.prefuse.examples.graphview.GraphMenuAction;
import org.eclipse.modisco.infra.prefuse.examples.graphview.GraphView;
import org.eclipse.modisco.infra.prefuse.examples.graphview.OpenGraphAction;
import org.eclipse.modisco.infra.prefuse.examples.radialgraphview.RadialGraphView;
import org.eclipse.modisco.infra.prefuse.examples.radialgraphview.RadialGraphViewConstants;
import org.eclipse.modisco.infra.prefuse.examples.treeview.TreeView;
import org.eclipse.modisco.infra.prefuse.examples.treeview.TreeViewConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;

import prefuse.Visualization;
import prefuse.controls.Control;
import prefuse.controls.ControlAdapter;
import prefuse.data.Graph;
import prefuse.data.Table;
import prefuse.data.query.SearchQueryBinding;
import prefuse.data.search.SearchTupleSet;
import prefuse.util.FontLib;
import prefuse.util.GraphLib;
import prefuse.util.ui.JFastLabel;
import prefuse.util.ui.JSearchPanel;
import prefuse.util.ui.UILib;
import prefuse.visual.VisualItem;


public class PrefuseGraphContainer {

	private static PrefuseGraphContainer instance = new PrefuseGraphContainer();
	protected PrefuseGraphContainer() {

	}

	public static PrefuseGraphContainer getInstance() {
		return PrefuseGraphContainer.instance;
	}

	/**
	 * From a prefuse graph, it initializes a TreeView container,
	 * composed of a tree (deduced from graph informations, so the
	 * graph shall not contain cyclic links, in this case you should
	 * use the initializeRadialGraphViewContainer method instead), a search
	 * area and custom navigation (left click on an element will center
	 * the view on it, right click will zoom out to fit the graph into
	 * the window, left press and move will move the graph, etc.).
	 *
	 * To encapsulate the swing component into an SWT component,
	 * use provided method createPartControl(Composite parent, JPanel treeview)
	 *
	 * @param graph informations to build the tree
	 * @param label the name of the attribute which will be used to render text of nodes
	 * @return a swing panel which encapsulate tree view
	 */
	public JPanel initializeTreeViewContainer(Graph graph, final String label, final String image) {
		JPanel result = this.initializeTreeViewContainer(graph, label, image, null);
		return result;
	}
	/**
	 * From a prefuse graph, it initializes a TreeView container,
	 * composed of a tree (deduced from graph informations, so the
	 * graph shall not contain cyclic links, in this case you should
	 * use the initializeRadialGraphViewContainer method instead), a search
	 * area and custom navigation (left click on an element will center
	 * the view on it, right click will zoom out to fit the graph into
	 * the window, left press and move will move the graph, etc.).
	 *
	 * To encapsulate the swing component into an SWT component,
	 * use provided method createPartControl(Composite parent, JPanel treeview)
	 *
	 * @param graph informations to build the tree
	 * @param label the name of the attribute which will be used to render text of nodes
	 * @param image the name of the attribute which will be used to render image of nodes
	 * @param controlAdapter to add a specific listener on tree view
	 * @return a swing panel which encapsulate tree view
	 */
	public JPanel initializeTreeViewContainer(Graph graph, final String label, final String image, final Control controlAdapter) {
    	Color BACKGROUND = Color.WHITE;
        Color FOREGROUND = Color.BLACK;
        // create a new treemap
        final TreeView tview = new TreeView(graph, label, image);
        tview.setBackground(BACKGROUND);
        tview.setForeground(FOREGROUND);

        // create a search panel for the tree map
        JSearchPanel search = new JSearchPanel(tview.getVisualization(),
        		TreeViewConstants.treeNodes, Visualization.SEARCH_ITEMS, label, true, true);
        search.setShowResultCount(true);
        search.setBorder(BorderFactory.createEmptyBorder(5,5,4,0));
        search.setFont(FontLib.getFont("Tahoma", Font.PLAIN, 11)); //$NON-NLS-1$
        search.setBackground(BACKGROUND);
        search.setForeground(FOREGROUND);

        final JFastLabel title = new JFastLabel("                 "); //$NON-NLS-1$
        title.setPreferredSize(new Dimension(350, 20));
        title.setVerticalAlignment(SwingConstants.BOTTOM);
        title.setBorder(BorderFactory.createEmptyBorder(3,0,0,0));
        title.setFont(FontLib.getFont("Tahoma", Font.PLAIN, 16)); //$NON-NLS-1$
        title.setBackground(BACKGROUND);
        title.setForeground(FOREGROUND);

        tview.addControlListener(new ControlAdapter() {
            public void itemEntered(VisualItem item, MouseEvent e) {
                if ( item.canGetString(label) )
                    title.setText(item.getString(label));
            }
            public void itemExited(VisualItem item, MouseEvent e) {
                title.setText(null);
            }
        });
        if (controlAdapter != null) {
        	tview.addControlListener(controlAdapter);
        }
        Box box = new Box(BoxLayout.X_AXIS);
        box.add(Box.createHorizontalStrut(10));
        box.add(title);
        box.add(Box.createHorizontalGlue());
        box.add(search);
        box.add(Box.createHorizontalStrut(3));
        box.setBackground(BACKGROUND);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(BACKGROUND);
        panel.setForeground(FOREGROUND);
        panel.add(tview, BorderLayout.CENTER);
        panel.add(box, BorderLayout.SOUTH);
        return panel;
    }

	/**
	 * From a prefuse graph, it initializes a RadialGraphView container,
	 * composed of a radial graph (deduced from graph informations), a search
	 * area and custom navigation (left click on an element will center
	 * the view on it, right click will zoom out to fit the graph into
	 * the window, left press and move will move the graph, etc.).
	 *
	 * To encapsulate the swing component into an SWT component,
	 * use provided method createPartControl(Composite parent, JPanel treeview)
	 *
	 * @param graph informations to build the radial graph
	 * @param label the name of the attribute which will be used to render text of nodes
	 * @return a swing panel which encapsulate radial graph view
	 */
	public JPanel initializeRadialGraphViewContainer(Graph graph, final String label) {
	    JPanel result = this.initializeRadialGraphViewContainer(graph, label, null);
	    return result;
	}

	/**
	 * From a prefuse graph, it initializes a RadialGraphView container,
	 * composed of a radial graph (deduced from graph informations), a search
	 * area and custom navigation (left click on an element will center
	 * the view on it, right click will zoom out to fit the graph into
	 * the window, left press and move will move the graph, etc.).
	 *
	 * To encapsulate the swing component into an SWT component,
	 * use provided method createPartControl(Composite parent, JPanel treeview)
	 *
	 * @param graph informations to build the radial graph
	 * @param label the name of the attribute which will be used to render text of nodes
	 * @param controlAdapter to add a specific listener on radial graph view
	 * @return a swing panel which encapsulate radial graph view
	 */
	public JPanel initializeRadialGraphViewContainer(Graph graph, final String label, Control controlAdapter) {
        // create a new radial tree view
        final RadialGraphView gview = new RadialGraphView(graph, label);
        Visualization vis = gview.getVisualization();

        // create a search panel for the tree map
        SearchQueryBinding sq = new SearchQueryBinding(
             (Table)vis.getGroup(RadialGraphViewConstants.treeNodes), label,
             (SearchTupleSet)vis.getGroup(Visualization.SEARCH_ITEMS));
        JSearchPanel search = sq.createSearchPanel();
        search.setShowResultCount(true);
        search.setBorder(BorderFactory.createEmptyBorder(5,5,4,0));
        search.setFont(FontLib.getFont("Tahoma", Font.PLAIN, 11)); //$NON-NLS-1$

        final JFastLabel title = new JFastLabel("                 "); //$NON-NLS-1$
        title.setPreferredSize(new Dimension(350, 20));
        title.setVerticalAlignment(SwingConstants.BOTTOM);
        title.setBorder(BorderFactory.createEmptyBorder(3,0,0,0));
        title.setFont(FontLib.getFont("Tahoma", Font.PLAIN, 16)); //$NON-NLS-1$

        gview.addControlListener(new ControlAdapter() {
            public void itemEntered(VisualItem item, MouseEvent e) {
                if ( item.canGetString(label) )
                    title.setText(item.getString(label));
            }
            public void itemExited(VisualItem item, MouseEvent e) {
                title.setText(null);
            }
        });
        if (controlAdapter != null) {
        	gview.addControlListener(controlAdapter);
        }

        Box box = new Box(BoxLayout.X_AXIS);
        box.add(Box.createHorizontalStrut(10));
        box.add(title);
        box.add(Box.createHorizontalGlue());
        box.add(search);
        box.add(Box.createHorizontalStrut(3));

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(gview, BorderLayout.CENTER);
        panel.add(box, BorderLayout.SOUTH);

        Color BACKGROUND = Color.WHITE;
        Color FOREGROUND = Color.DARK_GRAY;
        UILib.setColor(panel, BACKGROUND, FOREGROUND);

        return panel;
    }

	/**
	 * From a prefuse graph, it initializes a GraphView container,
	 * composed of a radial graph (deduced from graph informations), a search
	 * area and custom navigation (left click on an element will center
	 * the view on it, right click will zoom out to fit the graph into
	 * the window, left press and move will move the graph, etc.).
	 *
	 * To encapsulate the swing component into an SWT component,
	 * use provided method createPartControl(Composite parent, JPanel treeview)
	 *
	 * @param graph informations to build the radial graph
	 * @param label the name of the attribute which will be used to render text of nodes
	 * @return a swing panel which encapsulate radial graph view
	 */
	public JPanel initializeGraphViewContainer(Graph graph, final String label) {
	    JPanel result = this.initializeGraphViewContainer(graph, label, null);
	    return result;
	}

	/**
	 * From a prefuse graph, it initializes a GraphView container,
	 * composed of a radial graph (deduced from graph informations), a search
	 * area and custom navigation (left click on an element will center
	 * the view on it, right click will zoom out to fit the graph into
	 * the window, left press and move will move the graph, etc.).
	 *
	 * To encapsulate the swing component into an SWT component,
	 * use provided method createPartControl(Composite parent, JPanel treeview)
	 *
	 * @param graph informations to build the radial graph
	 * @param label the name of the attribute which will be used to render text of nodes
	 * @param controlAdapter to add a specific listener on radial graph view
	 * @return a swing panel which encapsulate radial graph view
	 */
	@SuppressWarnings("serial")
	public JPanel initializeGraphViewContainer(Graph graph, final String label, Control controlAdapter) {
		final GraphView view = new GraphView(graph, label);
		if (controlAdapter != null) {
			view.addControlListener(controlAdapter);
        }
		// set up menu
		JMenu dataMenu = new JMenu(Messages.PrefuseGraphContainer_Data);
		dataMenu.add(new OpenGraphAction(view));
		dataMenu.add(new GraphMenuAction(Messages.PrefuseGraphContainer_Grid, "ctrl 1", view) { //$NON-NLS-1$
			protected Graph getGraph() {
				return GraphLib.getGrid(15, 15);
			}
		});
		dataMenu.add(new GraphMenuAction(Messages.PrefuseGraphContainer_Clique, "ctrl 2", view) { //$NON-NLS-1$
			protected Graph getGraph() {
				return GraphLib.getClique(10);
			}
		});
		dataMenu.add(new GraphMenuAction(Messages.PrefuseGraphContainer_Honeycomb, "ctrl 3", view) { //$NON-NLS-1$
			protected Graph getGraph() {
				return GraphLib.getHoneycomb(5);
			}
		});
		dataMenu.add(new GraphMenuAction(Messages.PrefuseGraphContainer_BalancedTree, "ctrl 4", view) { //$NON-NLS-1$
			protected Graph getGraph() {
				return GraphLib.getBalancedTree(3, 5);
			}
		});
		dataMenu.add(new GraphMenuAction(Messages.PrefuseGraphContainer_DiamondTree, "ctrl 5", view) { //$NON-NLS-1$
			protected Graph getGraph() {
				return GraphLib.getDiamondTree(3, 3, 3);
			}
		});
		JMenuBar menubar = new JMenuBar();
		menubar.add(dataMenu);

		JPanel panel = new JPanel(new BorderLayout());
//        panel.setBackground(BACKGROUND);
//        panel.setForeground(FOREGROUND);
        panel.add(view, BorderLayout.CENTER);
		return panel;
    }

	/**
	 * To embed a Swing component into an SWT component.
	 * @param parent
	 * @param treeview
	 */
	public void createPartControl(Composite parent, JPanel treeview) {
		Composite composite = new Composite(parent, SWT.EMBEDDED | SWT.NO_BACKGROUND);
	    Frame frame = SWT_AWT.new_Frame(composite);

        frame.add(treeview);
	}
}
