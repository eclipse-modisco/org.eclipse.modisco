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

package org.eclipse.modisco.infra.prefuse.examples.radialgraphview;

import prefuse.Constants;
import prefuse.Display;
import prefuse.Visualization;
import prefuse.action.ActionList;
import prefuse.action.ItemAction;
import prefuse.action.RepaintAction;
import prefuse.action.animate.ColorAnimator;
import prefuse.action.animate.PolarLocationAnimator;
import prefuse.action.animate.QualityControlAnimator;
import prefuse.action.animate.VisibilityAnimator;
import prefuse.action.assignment.ColorAction;
import prefuse.action.assignment.FontAction;
import prefuse.action.layout.CollapsedSubtreeLayout;
import prefuse.action.layout.graph.RadialTreeLayout;
import prefuse.activity.SlowInSlowOutPacer;
import prefuse.controls.DragControl;
import prefuse.controls.FocusControl;
import prefuse.controls.HoverActionControl;
import prefuse.controls.PanControl;
import prefuse.controls.ZoomControl;
import prefuse.controls.ZoomToFitControl;
import prefuse.data.Graph;
import prefuse.data.Node;
import prefuse.data.Tuple;
import prefuse.data.event.TupleSetListener;
import prefuse.data.search.PrefixSearchTupleSet;
import prefuse.data.search.SearchTupleSet;
import prefuse.data.tuple.DefaultTupleSet;
import prefuse.data.tuple.TupleSet;
import prefuse.render.AbstractShapeRenderer;
import prefuse.render.DefaultRendererFactory;
import prefuse.render.EdgeRenderer;
import prefuse.render.LabelRenderer;
import prefuse.util.ColorLib;
import prefuse.util.FontLib;
import prefuse.visual.VisualItem;
import prefuse.visual.expression.InGroupPredicate;
import prefuse.visual.sort.TreeDepthItemSorter;


/**
 * Demonstration of a node-link tree viewer
 *
 * @version 1.0
 */
@SuppressWarnings("serial")
public class RadialGraphView extends Display {

    private LabelRenderer m_nodeRenderer;
    private EdgeRenderer m_edgeRenderer;

    private String m_label = "label"; //$NON-NLS-1$

    public RadialGraphView(Graph g, String label) {
        super(new Visualization());
        this.m_label = label;

        // -- set up visualization --
        this.m_vis.add(RadialGraphViewConstants.tree, g);
        this.m_vis.setInteractive(RadialGraphViewConstants.treeEdges, null, false);

        // -- set up renderers --
        this.m_nodeRenderer = new LabelRenderer(this.m_label);
        this.m_nodeRenderer.setRenderType(AbstractShapeRenderer.RENDER_TYPE_FILL);
        this.m_nodeRenderer.setHorizontalAlignment(Constants.CENTER);
        this.m_nodeRenderer.setRoundedCorner(8,8);
        this.m_edgeRenderer = new EdgeRenderer();

        DefaultRendererFactory rf = new DefaultRendererFactory(this.m_nodeRenderer);
        rf.add(new InGroupPredicate(RadialGraphViewConstants.treeEdges), this.m_edgeRenderer);
        this.m_vis.setRendererFactory(rf);

        // -- set up processing actions --

        // colors
        ItemAction nodeColor = new NodeColorAction(RadialGraphViewConstants.treeNodes);
        ItemAction textColor = new TextColorAction(RadialGraphViewConstants.treeNodes);
        this.m_vis.putAction("textColor", textColor); //$NON-NLS-1$

        ItemAction edgeColor = new ColorAction(RadialGraphViewConstants.treeEdges,
                VisualItem.STROKECOLOR, ColorLib.rgb(200,200,200));

        FontAction fonts = new FontAction(RadialGraphViewConstants.treeNodes,
                FontLib.getFont("Tahoma", 10)); //$NON-NLS-1$
        fonts.add("ingroup('_focus_')", FontLib.getFont("Tahoma", 11)); //$NON-NLS-1$ //$NON-NLS-2$

        // recolor
        ActionList recolor = new ActionList();
        recolor.add(nodeColor);
        recolor.add(textColor);
        this.m_vis.putAction("recolor", recolor); //$NON-NLS-1$

        // repaint
        ActionList repaint = new ActionList();
        repaint.add(recolor);
        repaint.add(new RepaintAction());
        this.m_vis.putAction("repaint", repaint); //$NON-NLS-1$

        // animate paint change
        ActionList animatePaint = new ActionList(400);
        animatePaint.add(new ColorAnimator(RadialGraphViewConstants.treeNodes));
        animatePaint.add(new RepaintAction());
        this.m_vis.putAction("animatePaint", animatePaint); //$NON-NLS-1$

        // create the tree layout action
        RadialTreeLayout treeLayout = new RadialTreeLayout(RadialGraphViewConstants.tree);
        //treeLayout.setAngularBounds(-Math.PI/2, Math.PI);
        this.m_vis.putAction("treeLayout", treeLayout); //$NON-NLS-1$

        CollapsedSubtreeLayout subLayout = new CollapsedSubtreeLayout(RadialGraphViewConstants.tree);
        this.m_vis.putAction("subLayout", subLayout); //$NON-NLS-1$

        // create the filtering and layout
        ActionList filter = new ActionList();
        filter.add(new TreeRootAction(RadialGraphViewConstants.tree));
        filter.add(fonts);
        filter.add(treeLayout);
        filter.add(subLayout);
        filter.add(textColor);
        filter.add(nodeColor);
        filter.add(edgeColor);
        this.m_vis.putAction("filter", filter); //$NON-NLS-1$

        // animated transition
        ActionList animate = new ActionList(1250);
        animate.setPacingFunction(new SlowInSlowOutPacer());
        animate.add(new QualityControlAnimator());
        animate.add(new VisibilityAnimator(RadialGraphViewConstants.tree));
        animate.add(new PolarLocationAnimator(RadialGraphViewConstants.treeNodes, RadialGraphViewConstants.linear));
        animate.add(new ColorAnimator(RadialGraphViewConstants.treeNodes));
        animate.add(new RepaintAction());
        this.m_vis.putAction("animate", animate); //$NON-NLS-1$
        this.m_vis.alwaysRunAfter("filter", "animate"); //$NON-NLS-1$ //$NON-NLS-2$

        // ------------------------------------------------

        // initialize the display
        setSize(700,600);
        setItemSorter(new TreeDepthItemSorter());
        addControlListener(new DragControl());
        addControlListener(new ZoomToFitControl());
        addControlListener(new ZoomControl());
        addControlListener(new PanControl());
        addControlListener(new FocusControl(1, "filter")); //$NON-NLS-1$
        addControlListener(new HoverActionControl("repaint")); //$NON-NLS-1$

        // ------------------------------------------------

        // filter graph and perform layout
        this.m_vis.run("filter"); //$NON-NLS-1$

        // maintain a set of items that should be interpolated linearly
        // this isn't absolutely necessary, but makes the animations nicer
        // the PolarLocationAnimator should read this set and act accordingly
        this.m_vis.addFocusGroup(RadialGraphViewConstants.linear, new DefaultTupleSet());
        this.m_vis.getGroup(Visualization.FOCUS_ITEMS).addTupleSetListener(
            new TupleSetListener() {
                @SuppressWarnings("synthetic-access")
				public void tupleSetChanged(TupleSet t, Tuple[] add, Tuple[] rem) {
                    TupleSet linearInterp = RadialGraphView.this.m_vis.getGroup(RadialGraphViewConstants.linear);
                    if ( add.length < 1 ) return; linearInterp.clear();
                    for ( Node n = (Node)add[0]; n!=null; n=n.getParent() )
                        linearInterp.addTuple(n);
                }
            }
        );

        SearchTupleSet search = new PrefixSearchTupleSet();
        this.m_vis.addFocusGroup(Visualization.SEARCH_ITEMS, search);
        search.addTupleSetListener(new TupleSetListener() {
            @SuppressWarnings("synthetic-access")
			public void tupleSetChanged(TupleSet t, Tuple[] add, Tuple[] rem) {
                RadialGraphView.this.m_vis.cancel("animatePaint"); //$NON-NLS-1$
                RadialGraphView.this.m_vis.run("recolor"); //$NON-NLS-1$
                RadialGraphView.this.m_vis.run("animatePaint"); //$NON-NLS-1$
            }
        });
    }

} // end of class RadialGraphView
