/*
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */

package org.eclipse.modisco.infra.prefuse.examples.treeview;

import java.awt.geom.Point2D;

import javax.swing.KeyStroke;

import prefuse.Constants;
import prefuse.Display;
import prefuse.Visualization;
import prefuse.action.ActionList;
import prefuse.action.ItemAction;
import prefuse.action.RepaintAction;
import prefuse.action.animate.ColorAnimator;
import prefuse.action.animate.LocationAnimator;
import prefuse.action.animate.QualityControlAnimator;
import prefuse.action.animate.VisibilityAnimator;
import prefuse.action.assignment.ColorAction;
import prefuse.action.assignment.FontAction;
import prefuse.action.filter.FisheyeTreeFilter;
import prefuse.action.layout.CollapsedSubtreeLayout;
import prefuse.action.layout.graph.NodeLinkTreeLayout;
import prefuse.activity.SlowInSlowOutPacer;
import prefuse.controls.FocusControl;
import prefuse.controls.PanControl;
import prefuse.controls.WheelZoomControl;
import prefuse.controls.ZoomControl;
import prefuse.controls.ZoomToFitControl;
import prefuse.data.Graph;
import prefuse.data.Tuple;
import prefuse.data.event.TupleSetListener;
import prefuse.data.search.PrefixSearchTupleSet;
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
public class TreeView extends Display {



    private LabelRenderer m_nodeRenderer;
    private EdgeRenderer m_edgeRenderer;

    private String m_label = "label"; //$NON-NLS-1$
    private String m_image = "image"; //$NON-NLS-1$
    private int m_orientation = Constants.ORIENT_LEFT_RIGHT;

    public TreeView(Graph t, String label, String image) {
        super(new Visualization());
        this.m_label = label;
        this.m_image = image;

        this.m_vis.add(TreeViewConstants.tree, t);

        this.m_nodeRenderer = new LabelRenderer(this.m_label, this.m_image);
        this.m_nodeRenderer.setRenderType(AbstractShapeRenderer.RENDER_TYPE_FILL);
        this.m_nodeRenderer.setHorizontalAlignment(Constants.LEFT);
        this.m_nodeRenderer.setImagePosition(Constants.LEFT);
        this.m_nodeRenderer.setRoundedCorner(8,8);
        this.m_edgeRenderer = new EdgeRenderer(Constants.EDGE_TYPE_CURVE);

        DefaultRendererFactory rf = new DefaultRendererFactory(this.m_nodeRenderer);
        rf.add(new InGroupPredicate(TreeViewConstants.treeEdges), this.m_edgeRenderer);
        this.m_vis.setRendererFactory(rf);

        // colors
        ItemAction nodeColor = new NodeColorAction(TreeViewConstants.treeNodes);
        ItemAction textColor = new ColorAction(TreeViewConstants.treeNodes,
                VisualItem.TEXTCOLOR, ColorLib.rgb(0,0,0));
        this.m_vis.putAction("textColor", textColor); //$NON-NLS-1$

        ItemAction edgeColor = new ColorAction(TreeViewConstants.treeEdges,
                VisualItem.STROKECOLOR, ColorLib.rgb(200,200,200));

        // quick repaint
        ActionList repaint = new ActionList();
        repaint.add(nodeColor);
        repaint.add(new RepaintAction());
        this.m_vis.putAction("repaint", repaint); //$NON-NLS-1$

        // full paint
        ActionList fullPaint = new ActionList();
        fullPaint.add(nodeColor);
        this.m_vis.putAction("fullPaint", fullPaint); //$NON-NLS-1$

        // animate paint change
        ActionList animatePaint = new ActionList(400);
        animatePaint.add(new ColorAnimator(TreeViewConstants.treeNodes));
        animatePaint.add(new RepaintAction());
        this.m_vis.putAction("animatePaint", animatePaint); //$NON-NLS-1$

        // create the tree layout action
        NodeLinkTreeLayout treeLayout = new NodeLinkTreeLayout(TreeViewConstants.tree,
                this.m_orientation, 50, 0, 8);
        treeLayout.setLayoutAnchor(new Point2D.Double(25,300));
        this.m_vis.putAction("treeLayout", treeLayout); //$NON-NLS-1$

        CollapsedSubtreeLayout subLayout =
            new CollapsedSubtreeLayout(TreeViewConstants.tree, this.m_orientation);
        this.m_vis.putAction("subLayout", subLayout); //$NON-NLS-1$

        AutoPanAction autoPan = new AutoPanAction(this);

        // create the filtering and layout
        ActionList filter = new ActionList();
        filter.add(new FisheyeTreeFilter(TreeViewConstants.tree, 2));
        filter.add(new FontAction(TreeViewConstants.treeNodes, FontLib.getFont("Tahoma", 16))); //$NON-NLS-1$
        filter.add(treeLayout);
        filter.add(subLayout);
        filter.add(textColor);
        filter.add(nodeColor);
        filter.add(edgeColor);
        this.m_vis.putAction("filter", filter); //$NON-NLS-1$

        // animated transition
        ActionList animate = new ActionList(1000);
        animate.setPacingFunction(new SlowInSlowOutPacer());
        animate.add(autoPan);
        animate.add(new QualityControlAnimator());
        animate.add(new VisibilityAnimator(TreeViewConstants.tree));
        animate.add(new LocationAnimator(TreeViewConstants.treeNodes));
        animate.add(new ColorAnimator(TreeViewConstants.treeNodes));
        animate.add(new RepaintAction());
        this.m_vis.putAction("animate", animate); //$NON-NLS-1$
        this.m_vis.alwaysRunAfter("filter", "animate"); //$NON-NLS-1$ //$NON-NLS-2$

        // create animator for orientation changes
        ActionList orient = new ActionList(2000);
        orient.setPacingFunction(new SlowInSlowOutPacer());
        orient.add(autoPan);
        orient.add(new QualityControlAnimator());
        orient.add(new LocationAnimator(TreeViewConstants.treeNodes));
        orient.add(new RepaintAction());
        this.m_vis.putAction("orient", orient); //$NON-NLS-1$

        // ------------------------------------------------

        // initialize the display
        setSize(700,600);
        setItemSorter(new TreeDepthItemSorter());
        addControlListener(new ZoomToFitControl());
        addControlListener(new ZoomControl());
        addControlListener(new WheelZoomControl());
        addControlListener(new PanControl());
        addControlListener(new FocusControl(1, "filter")); //$NON-NLS-1$

        registerKeyboardAction(
            new OrientAction(Constants.ORIENT_LEFT_RIGHT, this),
            "left-to-right", KeyStroke.getKeyStroke("ctrl 1"), WHEN_FOCUSED); //$NON-NLS-1$ //$NON-NLS-2$
        registerKeyboardAction(
            new OrientAction(Constants.ORIENT_TOP_BOTTOM, this),
            "top-to-bottom", KeyStroke.getKeyStroke("ctrl 2"), WHEN_FOCUSED); //$NON-NLS-1$ //$NON-NLS-2$
        registerKeyboardAction(
            new OrientAction(Constants.ORIENT_RIGHT_LEFT, this),
            "right-to-left", KeyStroke.getKeyStroke("ctrl 3"), WHEN_FOCUSED); //$NON-NLS-1$ //$NON-NLS-2$
        registerKeyboardAction(
            new OrientAction(Constants.ORIENT_BOTTOM_TOP, this),
            "bottom-to-top", KeyStroke.getKeyStroke("ctrl 4"), WHEN_FOCUSED); //$NON-NLS-1$ //$NON-NLS-2$

        // ------------------------------------------------

        // filter graph and perform layout
        setOrientation(this.m_orientation);
        this.m_vis.run("filter"); //$NON-NLS-1$

        TupleSet search = new PrefixSearchTupleSet();
        this.m_vis.addFocusGroup(Visualization.SEARCH_ITEMS, search);
        search.addTupleSetListener(new TupleSetListener() {
            @SuppressWarnings("synthetic-access")
			public void tupleSetChanged(TupleSet t, Tuple[] add, Tuple[] rem) {
                TreeView.this.m_vis.cancel("animatePaint"); //$NON-NLS-1$
                TreeView.this.m_vis.run("fullPaint"); //$NON-NLS-1$
                TreeView.this.m_vis.run("animatePaint"); //$NON-NLS-1$
            }
        });
    }

    // ------------------------------------------------------------------------

    public void setOrientation(int orientation) {
        NodeLinkTreeLayout rtl
            = (NodeLinkTreeLayout)this.m_vis.getAction("treeLayout"); //$NON-NLS-1$
        CollapsedSubtreeLayout stl
            = (CollapsedSubtreeLayout)this.m_vis.getAction("subLayout"); //$NON-NLS-1$
        switch ( orientation ) {
        case Constants.ORIENT_LEFT_RIGHT:
            this.m_nodeRenderer.setHorizontalAlignment(Constants.LEFT);
            this.m_edgeRenderer.setHorizontalAlignment1(Constants.RIGHT);
            this.m_edgeRenderer.setHorizontalAlignment2(Constants.LEFT);
            this.m_edgeRenderer.setVerticalAlignment1(Constants.CENTER);
            this.m_edgeRenderer.setVerticalAlignment2(Constants.CENTER);
            break;
        case Constants.ORIENT_RIGHT_LEFT:
            this.m_nodeRenderer.setHorizontalAlignment(Constants.RIGHT);
            this.m_edgeRenderer.setHorizontalAlignment1(Constants.LEFT);
            this.m_edgeRenderer.setHorizontalAlignment2(Constants.RIGHT);
            this.m_edgeRenderer.setVerticalAlignment1(Constants.CENTER);
            this.m_edgeRenderer.setVerticalAlignment2(Constants.CENTER);
            break;
        case Constants.ORIENT_TOP_BOTTOM:
            this.m_nodeRenderer.setHorizontalAlignment(Constants.CENTER);
            this.m_edgeRenderer.setHorizontalAlignment1(Constants.CENTER);
            this.m_edgeRenderer.setHorizontalAlignment2(Constants.CENTER);
            this.m_edgeRenderer.setVerticalAlignment1(Constants.BOTTOM);
            this.m_edgeRenderer.setVerticalAlignment2(Constants.TOP);
            break;
        case Constants.ORIENT_BOTTOM_TOP:
            this.m_nodeRenderer.setHorizontalAlignment(Constants.CENTER);
            this.m_edgeRenderer.setHorizontalAlignment1(Constants.CENTER);
            this.m_edgeRenderer.setHorizontalAlignment2(Constants.CENTER);
            this.m_edgeRenderer.setVerticalAlignment1(Constants.TOP);
            this.m_edgeRenderer.setVerticalAlignment2(Constants.BOTTOM);
            break;
        default:
            throw new IllegalArgumentException(
                Messages.TreeView_UnrecognizedOrientationValue+orientation);
        }
        this.m_orientation = orientation;
        rtl.setOrientation(orientation);
        stl.setOrientation(orientation);
    }

    public int getOrientation() {
        return this.m_orientation;
    }

    // ------------------------------------------------------------------------



    // ------------------------------------------------------------------------


} // end of class TreeMap
