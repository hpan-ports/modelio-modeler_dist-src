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
                                    

package org.modelio.diagram.api.dg.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.modelio.api.diagram.IDiagramLink;
import org.modelio.api.diagram.IDiagramNode;
import org.modelio.api.diagram.dg.IDiagramDG;
import org.modelio.diagram.api.dg.DGFactory;
import org.modelio.diagram.api.services.DiagramHandle;
import org.modelio.diagram.api.services.DiagramNode;
import org.modelio.diagram.elements.core.model.GmModel;
import org.modelio.diagram.elements.core.model.IGmLink;
import org.modelio.diagram.elements.core.node.GmCompositeNode;
import org.modelio.diagram.elements.core.node.GmNodeModel;

/**
 * This class is the top level DiagramNode of a diagram. It represents the diagram itself.
 */
@objid ("808dcc97-0d69-4b50-ac39-bb4b6966e2af")
public abstract class DiagramDG extends DiagramNode implements IDiagramDG {
    /**
     * @param diagramHandle The diagram manipulation class.
     * @param node The gm node represented by this class.
     */
    @objid ("6c1cee84-f492-41ad-acac-2d898e724a37")
    public DiagramDG(DiagramHandle diagramHandle, GmNodeModel node) {
        super(diagramHandle, node);
    }

    @objid ("039c838c-959e-4e22-9e4d-8de0748e1f00")
    @Override
    public DiagramNode getParent() {
        return null;
    }

    @objid ("e896c5a0-85e3-482c-8aeb-8af0e0667a5e")
    @Override
    public List<IDiagramNode> getNodes() {
        return DGFactory.getInstance().getDiagramNodes(this.diagramHandle, ((GmCompositeNode) this.gmNode).getChildren());
    }

    @objid ("25e13791-2d8c-496f-8874-df1adbd2d6ee")
    @Override
    public final Rectangle getBounds() {
        GraphicalEditPart p = this.diagramHandle.getEditPart(this.gmNode);
        return computeMinimumBounds(p.getFigure());
    }

    @objid ("1028d2a7-3328-45d7-9e98-39b8353776e3")
    @Override
    public final void setBounds(Rectangle bounds) {
        // nothing to do
    }

    @objid ("4af5aaed-8dcd-4b3c-9b16-e1235e034a5a")
    @Override
    public List<IDiagramLink> getFromLinks() {
        return Collections.emptyList();
    }

    @objid ("159a8361-dace-446a-9bd6-8dc71d4b53db")
    @Override
    public List<IDiagramLink> getToLinks() {
        return Collections.emptyList();
    }

    /**
     * @return the list of all the links present in the diagram
     */
    @objid ("d15b1396-c5cf-4b1a-9d7e-b1c866f51081")
    @Override
    public List<IDiagramLink> getLinks() {
        List<IDiagramLink> links = new ArrayList<>();
        
        for (GmModel gm : this.gmNode.getDiagram().getAllModels()) {
            if (gm instanceof IGmLink) {
                IDiagramLink diagramLink = DGFactory.getInstance().getDiagramLink(this.diagramHandle, (IGmLink) gm);
                if (diagramLink != null) {
                    links.add(diagramLink);
                }
            }
        }
        return links;
    }

    /**
     * Computes the minimum bounds of a diagram figure. The returned rectangle is the smallest rectangle enclosing all
     * the diagram nodes (note: the computation does not take links into account which are laid in the Connection layer)
     * @param iFigure @return
     */
    @objid ("bab00664-04aa-45ad-8ffe-f0aaf7d43910")
    private Rectangle computeMinimumBounds(final IFigure iFigure) {
        int xMin = Integer.MAX_VALUE;
        int xMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        
        for (Object fig : iFigure.getChildren()) {
            Rectangle b = ((Figure) fig).getBounds();
        
            if (b.x < xMin)
                xMin = b.x;
            if (b.x + b.width > xMax)
                xMax = b.x + b.width;
        
            if (b.y < yMin)
                yMin = b.y;
            if (b.y + b.height > yMax)
                yMax = b.y + b.height;
        
        }
        return new Rectangle(xMin, yMin, xMax - xMin, yMax - yMin);
    }

    @objid ("6a9fa5e2-9741-46bb-81a1-600d1da1863d")
    @Override
    public final boolean setLocation(final int x, final int y) {
        return false;
    }

    @objid ("cab9db01-147c-4a1c-b318-38ad4d5008e4")
    @Override
    public final boolean setSize(final int x, final int y) {
        return false;
    }

}
