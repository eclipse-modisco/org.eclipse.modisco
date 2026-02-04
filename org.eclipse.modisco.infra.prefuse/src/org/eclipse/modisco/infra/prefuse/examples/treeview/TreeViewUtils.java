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

package org.eclipse.modisco.infra.prefuse.examples.treeview;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.io.InputStream;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import prefuse.Visualization;
import prefuse.controls.ControlAdapter;
import prefuse.data.Graph;
import prefuse.data.io.TreeMLReader;
import prefuse.util.FontLib;
import prefuse.util.ui.JFastLabel;
import prefuse.util.ui.JSearchPanel;
import prefuse.visual.VisualItem;


public class TreeViewUtils {

	public static JComponent demo(InputStream datafile, final String label) {
        Graph t = null;
        try {
            t = new TreeMLReader().readGraph(datafile);
        } catch ( Exception e ) {
            e.printStackTrace();
            System.exit(1);
        }

        return demo(t, label);
    }

    public static JPanel demo(Graph g, final String label) {
    	Color BACKGROUND = Color.WHITE;
        Color FOREGROUND = Color.BLACK;
        // create a new treemap
        final TreeView tview = new TreeView(g, label, null);
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


}
