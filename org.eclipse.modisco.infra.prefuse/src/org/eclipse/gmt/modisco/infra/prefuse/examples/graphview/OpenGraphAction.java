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

package org.eclipse.gmt.modisco.infra.prefuse.examples.graphview;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import prefuse.data.Graph;
import prefuse.data.Table;
import prefuse.util.io.IOLib;

/**
 * @author Gabriel Barbier
 *
 */
@SuppressWarnings("serial")
public class OpenGraphAction extends AbstractAction {
    private GraphView m_view;

    public OpenGraphAction(GraphView view) {
        this.m_view = view;
        this.putValue(Action.NAME, Messages.OpenGraphAction_OpenFile);
        this.putValue(Action.ACCELERATOR_KEY,
                      KeyStroke.getKeyStroke("ctrl O")); //$NON-NLS-1$
    }
    public void actionPerformed(ActionEvent e) {
        Graph g = IOLib.getGraphFile(this.m_view);
        if ( g == null ) return;
        String label = getLabel(this.m_view, g);
        if ( label != null ) {
            this.m_view.setGraph(g, label);
        }
    }
    public static String getLabel(final Component cParam, final Graph g) {
    	Component c = cParam;
        // get the column names
        Table t = g.getNodeTable();
        int  cc = t.getColumnCount();
        String[] names = new String[cc];
        for ( int i=0; i<cc; ++i )
            names[i] = t.getColumnName(i);

        // where to store the result
        final String[] label = new String[1];

        // -- build the dialog -----
        // we need to get the enclosing frame first
        while ( c != null && !(c instanceof JFrame) ) {
            c = c.getParent();
        }
        final JDialog dialog = new JDialog(
                (JFrame)c, Messages.OpenGraphAction_ChooseLabelField, true);

        // create the ok/cancel buttons
        final JButton ok = new JButton(Messages.OpenGraphAction_OK);
        ok.setEnabled(false);
        ok.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               dialog.setVisible(false);
           }
        });
        JButton cancel = new JButton(Messages.OpenGraphAction_Cancel);
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label[0] = null;
                dialog.setVisible(false);
            }
        });

        // build the selection list
        final JList list = new JList(names);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.getSelectionModel().addListSelectionListener(
        new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                int sel = list.getSelectedIndex();
                if ( sel >= 0 ) {
                    ok.setEnabled(true);
                    label[0] = (String)list.getModel().getElementAt(sel);
                } else {
                    ok.setEnabled(false);
                    label[0] = null;
                }
            }
        });
        JScrollPane scrollList = new JScrollPane(list);

        JLabel title = new JLabel(Messages.OpenGraphAction_ChooseFieldToUseForNodeLabels);

        // layout the buttons
        Box bbox = new Box(BoxLayout.X_AXIS);
        bbox.add(Box.createHorizontalStrut(5));
        bbox.add(Box.createHorizontalGlue());
        bbox.add(ok);
        bbox.add(Box.createHorizontalStrut(5));
        bbox.add(cancel);
        bbox.add(Box.createHorizontalStrut(5));

        // put everything into a panel
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(title, BorderLayout.NORTH);
        panel.add(scrollList, BorderLayout.CENTER);
        panel.add(bbox, BorderLayout.SOUTH);
        panel.setBorder(BorderFactory.createEmptyBorder(5,2,2,2));

        // show the dialog
        dialog.setContentPane(panel);
        dialog.pack();
        dialog.setLocationRelativeTo(c);
        dialog.setVisible(true);
        dialog.dispose();

        // return the label field selection
        return label[0];
    }
}
