/*
 * Copyright 2013 Modeliosoft
 *
 * This file is part of Modelio.
 *
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */  
                                    

package org.modelio.diagram.editor.handlers;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.SWTGraphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.editparts.LayerManager;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.modelio.diagram.elements.common.abstractdiagram.AbstractDiagramFigure;

/**
 * Builds an image from a gef diagram. The returned image must be disposed by the caller when no longer in use.
 */
@objid ("65b21824-33f7-11e2-95fe-001ec947c8cc")
public class ImageBuilder {
    @objid ("65b21826-33f7-11e2-95fe-001ec947c8cc")
    private static final int MARGIN = 10;

    /**
     * Builds an image from a gef diagram. The returned image must be disposed by the caller when no longer in use.
     * @param rootEditPart the root edit part of the diagram
     * @param format the format to export to.
     * @param margin the margin to surround the content of the diagram with.
     * @return an image of the diagram.
     */
    @objid ("65b21828-33f7-11e2-95fe-001ec947c8cc")
    public Image makeImage(RootEditPart rootEditPart, int format, final int margin) {
        // Temporarily add the background layer to the "printable layers" set so that it is present in the saved image
        final LayerManager lm = (LayerManager) rootEditPart;
        final IFigure backgroundLayer = lm.getLayer("BACKGROUND_LAYER");
        final Layer printableLayers = (Layer) lm.getLayer(LayerConstants.PRINTABLE_LAYERS);
        final ConnectionLayer connectionLayer = (ConnectionLayer) lm.getLayer(LayerConstants.CONNECTION_LAYER);
        printableLayers.add(backgroundLayer, 0);
        
        // image size is the diagram contents size expanded for the margin
        final Rectangle contentsBounds = computeContentsBounds(printableLayers, connectionLayer);
        final Image img = new Image(Display.getDefault(),
                                    contentsBounds.width + 2 * margin,
                                    contentsBounds.height + 2 * margin);
        final GC imageGC = new GC(img);
        
        // prepare a translation of the drawing
        // the role of the  translation is to: 
        // - compensate for the margin 
        // - deal with x and y of the contents bounds
        final int deltaX = margin + (-contentsBounds.x);
        final int deltaY = margin + (-contentsBounds.y);
        
        final Graphics graphics = new SWTGraphics(imageGC);
        graphics.translate(deltaX, deltaY);
        
        graphics.setClip(contentsBounds);
        
        // draw
        printableLayers.paint(graphics);
        graphics.dispose();
        imageGC.dispose();
        
        // Restore the background layer placement
        printableLayers.remove(backgroundLayer);
        final Layer scalableLayers = (Layer) lm.getLayer(LayerConstants.SCALABLE_LAYERS);
        scalableLayers.add(backgroundLayer, "BACKGROUND_LAYER", 0);
        return img; // the caller is responsible for disposing the returned image
    }

    /**
     * Recurse through layers in order to find the DiagramFigure
     * @param layer @return
     */
    @objid ("65b21831-33f7-11e2-95fe-001ec947c8cc")
    private AbstractDiagramFigure getDiagramFigure(Layer layer) {
        AbstractDiagramFigure result = null;
        
        // System.out.println("ImageBuilder.getDiagramFigure() " + layer);
        
        for (final Object o : layer.getChildren()) {
            if (o instanceof AbstractDiagramFigure) {
                return (AbstractDiagramFigure) o;
            } else if (o instanceof Layer) {
                final AbstractDiagramFigure fig = getDiagramFigure((Layer) o);
                if (fig != null) {
                    result = fig;
                }
            }
        }
        return result;
    }

    /**
     * Compute the minimum contents size of the diagram. This size is defined as the union of the smallest bounding
     * rectangle that encloses both all the nodes and all the links
     * @param layer
     * @param connectionLayer @return
     */
    @objid ("65b21837-33f7-11e2-95fe-001ec947c8cc")
    private Rectangle computeContentsBounds(Layer printableLayers, ConnectionLayer connectionLayer) {
        Rectangle results = null;
        
        // Compute for the nodes
        final AbstractDiagramFigure diagramFigure = getDiagramFigure(printableLayers);
        assert (diagramFigure != null);
        results = this.computeMinimumBounds(diagramFigure);
        
        // Compute for links
        
        results.union(this.computeMinimumBounds(connectionLayer));
        return results;
    }

    /**
     * Computes the minimum bounds of a connection layer. The returned rectangle is the smallest rectangle enclosing all
     * the links.
     * @param figure
     * @return
     */
    @objid ("65b2183e-33f7-11e2-95fe-001ec947c8cc")
    private Rectangle computeMinimumBounds(ConnectionLayer connectionLayer) {
        int xMin = Integer.MAX_VALUE;
        int xMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        
        for (final Object o : connectionLayer.getChildren()) {
            final Rectangle b = ((Figure) o).getBounds();
        
            if (b.x < xMin) {
                xMin = b.x;
            }
            if (b.x + b.width > xMax) {
                xMax = b.x + b.width;
            }
        
            if (b.y < yMin) {
                yMin = b.y;
            }
            if (b.y + b.height > yMax) {
                yMax = b.y + b.height;
            }
        
        }
        return new Rectangle(xMin, yMin, xMax - xMin, yMax - yMin);
    }

    /**
     * Computes the minimum bounds of a diagram figure. The returned rectangle is the smallest rectangle enclosing all
     * the diagram nodes (note: the computation does not take links into account which are laid in the Connection layer)
     * @param figure @return
     */
    @objid ("65b21844-33f7-11e2-95fe-001ec947c8cc")
    private Rectangle computeMinimumBounds(AbstractDiagramFigure figure) {
        int xMin = Integer.MAX_VALUE;
        int xMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        
        for (final Object fig : figure.getChildren()) {
            final Rectangle b = ((Figure) fig).getBounds();
        
            if (b.x < xMin) {
                xMin = b.x;
            }
            if (b.x + b.width > xMax) {
                xMax = b.x + b.width;
            }
        
            if (b.y < yMin) {
                yMin = b.y;
            }
            if (b.y + b.height > yMax) {
                yMax = b.y + b.height;
            }
        
        }
        return new Rectangle(xMin, yMin, xMax - xMin, yMax - yMin);
    }

    /**
     * Builds an image from a gef diagram. The returned image must be disposed by the caller when no longer in use.
     * @param rootEditPart the root edit part of the diagram
     * @param format the format to export to.
     * @return an image of the diagram, with surrounding margins of 10.
     */
    @objid ("65b2184a-33f7-11e2-95fe-001ec947c8cc")
    public Image makeImage(final RootEditPart rootEditPart, final int format) {
        return makeImage(rootEditPart, format, MARGIN);
    }

    /**
     * Builds an image from a gef viewer.
     * @param rootEditPart
     * @return an image of the diagram view, with surrounding margins of 10.
     */
    @objid ("65b21853-33f7-11e2-95fe-001ec947c8cc")
    public Image makeViewerImage(final RootEditPart rootEditPart) {
        // Temporarily add the background layer to the "printable layers" set so that it is present in the saved image
           final LayerManager lm = (LayerManager) rootEditPart;
           final IFigure backgroundLayer = lm.getLayer("BACKGROUND_LAYER");
           final Layer printableLayers = (Layer) lm.getLayer(LayerConstants.PRINTABLE_LAYERS);
           printableLayers.add(backgroundLayer, 0);
           
           // image size is the diagram contents size expanded for the margin
           final IFigure rootFigure = ((LayerManager)rootEditPart).getLayer(LayerConstants.PRINTABLE_LAYERS);
           final Rectangle rootFigureBounds = rootFigure.getBounds();
           final Image img = new Image(Display.getDefault(),
                                       rootFigureBounds.width + 2 * MARGIN,
                                       rootFigureBounds.height + 2 * MARGIN);
           final GC imageGC = new GC(img);
           
           // prepare a translation of the drawing
           // the role of the  translation is to: 
           // - compensate for the margin 
           // - deal with x and y of the contents bounds
           final int deltaX = MARGIN + (-rootFigureBounds.x);
           final int deltaY = MARGIN + (-rootFigureBounds.y);
           
           final Graphics graphics = new SWTGraphics(imageGC);
           graphics.translate(deltaX, deltaY);
           
           graphics.setClip(rootFigureBounds);
           
           // draw
           printableLayers.paint(graphics);
           graphics.dispose();
           imageGC.dispose();
           
           // Restore the background layer placement
           printableLayers.remove(backgroundLayer);
           final Layer scalableLayers = (Layer) lm.getLayer(LayerConstants.SCALABLE_LAYERS);
           scalableLayers.add(backgroundLayer, "BACKGROUND_LAYER", 0);
        return img; // the caller is responsible for disposing the returned image
    }

}
