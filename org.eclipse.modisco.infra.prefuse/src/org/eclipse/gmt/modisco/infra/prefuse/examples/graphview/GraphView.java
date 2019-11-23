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

import java.awt.Color;

import prefuse.Display;
import prefuse.Visualization;
import prefuse.action.ActionList;
import prefuse.action.RepaintAction;
import prefuse.action.assignment.ColorAction;
import prefuse.action.layout.graph.RadialTreeLayout;
import prefuse.activity.Activity;
import prefuse.controls.DragControl;
import prefuse.controls.FocusControl;
import prefuse.controls.NeighborHighlightControl;
import prefuse.controls.PanControl;
import prefuse.controls.WheelZoomControl;
import prefuse.controls.ZoomControl;
import prefuse.controls.ZoomToFitControl;
import prefuse.data.Graph;
import prefuse.data.Tuple;
import prefuse.data.event.TupleSetListener;
import prefuse.data.tuple.TupleSet;
import prefuse.render.DefaultRendererFactory;
import prefuse.render.LabelRenderer;
import prefuse.util.ColorLib;
import prefuse.visual.VisualGraph;
import prefuse.visual.VisualItem;


@SuppressWarnings("serial")
public class GraphView extends Display {

    public GraphView(Graph g, String label) {
    	super(new Visualization());

        // --------------------------------------------------------------------
        // set up the renderers

        LabelRenderer tr = new LabelRenderer();
        tr.setRoundedCorner(8, 8);
        this.m_vis.setRendererFactory(new DefaultRendererFactory(tr));

        // --------------------------------------------------------------------
        // register the data with a visualization

        // adds graph to visualization and sets renderer label field
        setGraph(g, label);

        // fix selected focus nodes
        TupleSet focusGroup = this.m_vis.getGroup(Visualization.FOCUS_ITEMS);
        focusGroup.addTupleSetListener(new TupleSetListener() {
            public void tupleSetChanged(TupleSet ts, Tuple[] add, Tuple[] rem)
            {
            	try {
                for ( int i=0; i<rem.length; ++i )
                    ((VisualItem)rem[i]).setFixed(false);
                for ( int i=0; i<add.length; ++i ) {
                    ((VisualItem)add[i]).setFixed(false);
                    ((VisualItem)add[i]).setFixed(true);
                }
                if ( ts.getTupleCount() == 0 ) {
                    ts.addTuple(rem[0]);
                    ((VisualItem)rem[0]).setFixed(false);
                }
            	} catch (IllegalArgumentException iae) {
            		/*
            		 *  this exception has been thrown when we clear the collection
            		 *  of graph's data. We should find a synchronisation to avoid
            		 *  such exception ...
            		 */
            		assert(true);
            	}
                GraphView.this.m_vis.run("draw"); //$NON-NLS-1$
            }
        });



        // --------------------------------------------------------------------
        // create actions to process the visual data

//        int hops = 30;
//        final GraphDistanceFilter filter = new GraphDistanceFilter(GraphViewConstants.graph, hops);

        ColorAction fill = new ColorAction(GraphViewConstants.nodes,
                VisualItem.FILLCOLOR, ColorLib.rgb(200,200,255));
        fill.add(VisualItem.FIXED, ColorLib.rgb(255,100,100));
        fill.add(VisualItem.HIGHLIGHT, ColorLib.rgb(255,200,125));

        ActionList draw = new ActionList();
//        draw.add(filter);
        draw.add(fill);
        draw.add(new ColorAction(GraphViewConstants.nodes, VisualItem.STROKECOLOR, 0));
        draw.add(new ColorAction(GraphViewConstants.nodes, VisualItem.TEXTCOLOR, ColorLib.rgb(0,0,0)));
        draw.add(new ColorAction(GraphViewConstants.edges, VisualItem.FILLCOLOR, ColorLib.gray(200)));
        draw.add(new ColorAction(GraphViewConstants.edges, VisualItem.STROKECOLOR, ColorLib.gray(200)));

        // create the tree layout action
        RadialTreeLayout treeLayout = new RadialTreeLayout(GraphViewConstants.graph);
        //treeLayout.setAngularBounds(-Math.PI/2, Math.PI);
        this.m_vis.putAction("treeLayout", treeLayout); //$NON-NLS-1$

        ActionList animate = new ActionList(Activity.INFINITY);
        //animate.add(new ForceDirectedLayout(GraphViewConstants.graph));
        animate.add(treeLayout);
        animate.add(fill);
        animate.add(new RepaintAction());

        // finally, we register our ActionList with the Visualization.
        // we can later execute our Actions by invoking a method on our
        // Visualization, using the name we've chosen below.
        this.m_vis.putAction(GraphViewConstants.draw, draw);
        this.m_vis.putAction("layout", animate); //$NON-NLS-1$

        this.m_vis.runAfter("draw", "layout"); //$NON-NLS-1$ //$NON-NLS-2$


        // --------------------------------------------------------------------
        // set up a display to show the visualization

        this.setSize(700,700);
        this.pan(350, 350);
        this.setForeground(Color.GRAY);
        this.setBackground(Color.WHITE);

        // main display controls
        this.addControlListener(new FocusControl(1));
        this.addControlListener(new DragControl());
        this.addControlListener(new PanControl());
        this.addControlListener(new ZoomControl());
        this.addControlListener(new WheelZoomControl());
        this.addControlListener(new ZoomToFitControl());
        this.addControlListener(new NeighborHighlightControl());

        this.setForeground(Color.GRAY);
        this.setBackground(Color.WHITE);

        // --------------------------------------------------------------------
        // launch the visualization

        // create a panel for editing force values
//        ForceSimulator fsim = ((ForceDirectedLayout)animate.get(0)).getForceSimulator();
//        JForcePanel fpanel = new JForcePanel(fsim);
//
//        final JValueSlider slider = new JValueSlider("Distance", 0, hops, hops);
//        slider.addChangeListener(new ChangeListener() {
//            public void stateChanged(ChangeEvent e) {
//                filter.setDistance(slider.getValue().intValue());
//                GraphView.this.m_vis.run("draw");
//            }
//        });
//        slider.setBackground(Color.WHITE);
//        slider.setPreferredSize(new Dimension(300,30));
//        slider.setMaximumSize(new Dimension(300,30));
//
//        Box cf = new Box(BoxLayout.Y_AXIS);
//        cf.add(slider);
//        cf.setBorder(BorderFactory.createTitledBorder("Connectivity Filter"));
//        fpanel.add(cf);
//
//        fpanel.add(Box.createVerticalGlue());
//
//        // create a new JSplitPane to present the interface
//        JSplitPane split = new JSplitPane();
//        split.setLeftComponent(display);
//        split.setRightComponent(fpanel);
//        split.setOneTouchExpandable(true);
//        split.setContinuousLayout(false);
//        split.setDividerLocation(700);

        // now we run our action list
        this.m_vis.run("draw"); //$NON-NLS-1$

//        this.add(split);
    }

    public void setGraph(Graph g, String label) {
        // update labeling
        DefaultRendererFactory drf = (DefaultRendererFactory)
                                                this.m_vis.getRendererFactory();
        ((LabelRenderer)drf.getDefaultRenderer()).setTextField(label);

        // update graph
        this.m_vis.removeGroup(GraphViewConstants.graph);
        VisualGraph vg = this.m_vis.addGraph(GraphViewConstants.graph, g);
        this.m_vis.setValue(GraphViewConstants.edges, null, VisualItem.INTERACTIVE, Boolean.FALSE);
        VisualItem f = (VisualItem)vg.getNode(0);
        this.m_vis.getGroup(Visualization.FOCUS_ITEMS).setTuple(f);
        f.setFixed(false);
    }

} // end of class GraphView
