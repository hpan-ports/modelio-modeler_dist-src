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
                                    

package org.modelio.diagram.api.services;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.handles.HandleBounds;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.modelio.api.diagram.IDiagramGraphic;
import org.modelio.api.diagram.IDiagramLink;
import org.modelio.api.diagram.IDiagramNode;
import org.modelio.api.diagram.style.IStyleHandle;
import org.modelio.diagram.api.dg.DGFactory;
import org.modelio.diagram.api.style.StyleHandle;
import org.modelio.diagram.editor.ScalableFreeformRootEditPart2;
import org.modelio.diagram.elements.core.model.GmModel;
import org.modelio.diagram.elements.core.model.IGmLink;
import org.modelio.diagram.elements.core.node.GmNodeModel;
import org.modelio.diagram.styles.core.MetaKey;
import org.modelio.diagram.styles.core.NamedStyle;
import org.modelio.diagram.styles.core.StyleKey.FillMode;
import org.modelio.diagram.styles.core.StyleKey.RepresentationMode;
import org.modelio.diagram.styles.core.StyleKey;
import org.modelio.diagram.styles.plugin.DiagramStyles;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This class represents a DiagramGraphic of the 'node' kind.
 */
@objid ("3d9759b1-b676-4e1e-8066-194c595dd2ba")
public abstract class DiagramNode extends DiagramGraphic implements IDiagramNode {
    @objid ("d7cd13d8-faea-4e5e-a14a-553d86a50eb7")
    protected GmNodeModel gmNode;

    /**
     * Creates a diagram node.
     * @param diagramHandle The diagram manipulation class.
     * @param gmNode The gm node represented by this class.
     */
    @objid ("0bb46c19-8466-4020-80ff-cec60109d0cc")
    public DiagramNode(DiagramHandle diagramHandle, GmNodeModel gmNode) {
        super(diagramHandle);
        this.gmNode = gmNode;
    }

    /**
     * Resize this diagram node to fit its content.
     */
    @objid ("9effce7c-6540-4cbd-b41f-961920c9ff52")
    @Override
    public void fitToContent() {
        final Dimension oldSize = getBounds().getSize();
        
        Dimension newSize = getMinimumSize();
        
        if (!oldSize.equals(newSize)) {
            setSize(newSize.width, newSize.height);
        }
    }

    /**
     * @return the parent node.
     */
    @objid ("54307cb4-b2db-45be-bb80-ff7c000e666f")
    @Override
    public IDiagramGraphic getParent() {
        GmModel gmParent = this.gmNode.getParent();
        IDiagramGraphic parent = null;
        
        while (gmParent != null) {
            parent = DGFactory.getInstance().getDiagramGraphic(this.diagramHandle, gmParent);
            if (parent != null) {
                return parent;
            }
            gmParent = gmParent.getParent();
        }
        return null;
    }

    /**
     * Return the list of children nodes of this node.
     * @return A list of nodes in any case, possibly an empty one. Never returns null
     */
    @objid ("fb5a6042-61b0-450e-807c-3c504b6ce9bc")
    @Override
    public abstract List<IDiagramNode> getNodes();

    /**
     * Return the links that are starting (ie outgoing links) from this node.
     * @return A list of links in any case, possibly an empty one. Never returns null
     */
    @objid ("c1bcd859-bb76-4e23-aaff-3a45911c3bd0")
    @Override
    public List<IDiagramLink> getFromLinks() {
        final List<IDiagramLink> links = new ArrayList<>();
        for (final IGmLink gmLink : this.gmNode.getStartingLinks()) {
            IDiagramLink diagramLink = DGFactory.getInstance().getDiagramLink(this.diagramHandle, gmLink);
            if (diagramLink != null) {
                links.add(diagramLink);
            }
        }
        return links;
    }

    /**
     * Return the links that are ending (ie incoming links) at this node.
     * @return A list of links in any case, possibly an empty one. Never returns null
     */
    @objid ("94b4c755-4b5a-4c22-89e6-9e9902878ba8")
    @Override
    public List<IDiagramLink> getToLinks() {
        final List<IDiagramLink> links = new ArrayList<>();
        for (final IGmLink gmLink : this.gmNode.getEndingLinks()) {
            IDiagramLink diagramLink = DGFactory.getInstance().getDiagramLink(this.diagramHandle, gmLink);
            if (diagramLink != null) {
                links.add(diagramLink);
            }
        }
        return links;
    }

    /**
     * Return the node location and size as a Rectangle.
     * @return the node bounds.
     */
    @objid ("0a7667b6-fb58-4450-ba8b-4da397f58f4c")
    @Override
    public Rectangle getBounds() {
        final GraphicalEditPart p = this.diagramHandle.getEditPart(this.gmNode);
        if (p == null) {
            return null;
        }
        if (p.getFigure() instanceof HandleBounds) {
            return ((HandleBounds) p.getFigure()).getHandleBounds().getCopy();
        } else {
            return p.getFigure().getBounds().getCopy();
        }
    }

    @objid ("3a546530-9f29-4f72-bfc8-4d3c495506ca")
    @Override
    public String toString() {
        Rectangle bounds = getBounds();
        if (bounds == null) {
            bounds = new Rectangle(0, 0, -1, -1);
        }
        return String.format("%s '%s' [%d,%d, %d,%d]",
                             this.getClass().getSimpleName(),
                             getName(),
                             bounds.x,
                             bounds.y,
                             bounds.width,
                             bounds.height);
    }

    /**
     * Return the name of this node. In most cases the name is the displayed label but this can however vary for
     * different nodes. No uniqueness of names across a diagram should be assumed.
     * @return the node name
     */
    @objid ("db4ec55a-b6a2-4bec-a0e5-43dc7c46500c")
    @Override
    public String getName() {
        return this.gmNode.getRelatedElement() != null ? this.gmNode.getRelatedElement().getName()
                : this.gmNode.getGhostLabel();
    }

    /**
     * This method changes both the location and the size of a node by changing its current bounds.<br>
     * Note however that the requested change might no be performed when some layout constraints are maintained by the
     * parent of the node (ie the requested changes are refused or adapted by the parent of the node).
     * @param newBounds the new node bounds
     */
    @objid ("4ab3eb1b-1aba-4e7a-8bb9-8fe6565f462a")
    @Override
    public void setBounds(Rectangle newBounds) {
        if (newBounds.height == -1 || newBounds.width == -1) {
            return;
        }
        
        setLocation(newBounds.x, newBounds.y);
        setSize(newBounds.width, newBounds.height);
    }

    @objid ("a3d4abae-52f1-4175-9a98-e0ebd2956e93")
    @Override
    public MObject getElement() {
        return this.gmNode.getRelatedElement();
    }

    @objid ("723741ab-451d-4d32-a4fe-6af2c1eeaef9")
    @Override
    public void mask() {
        final GraphicalEditPart editPart = this.diagramHandle.getEditPart(this.gmNode);
        
        final GroupRequest deleteReq = new GroupRequest(RequestConstants.REQ_DELETE);
        deleteReq.setEditParts(editPart);
        
        final Command cmd = editPart.getCommand(deleteReq);
        if (cmd != null && cmd.canExecute()) {
            editPart.getViewer().getEditDomain().getCommandStack().execute(cmd);
        }
    }

    /**
     * Change the location of the node, setting its new position to (x,y). Note however that the requested change might
     * no be performed when some layout constraints are maintained by the parent of the node (ie the requested change is
     * refused or adapted by the parent of the node).
     * @param x the new X position
     * @param y the new Y position
     * @return true if the change could be requested (different from 'performed' see note above)
     */
    @objid ("38ff3d0d-9625-40f4-a66b-bfadc3c6102b")
    @Override
    public boolean setLocation(int x, int y) {
        final GraphicalEditPart p = this.diagramHandle.getEditPart(this.gmNode);
        if (p == null) {
            return false;
        }
        final Rectangle currentBounds = getBounds();
        
        // Adapt the given coordinates if necessary
        final Point newLocation = new Point(x, y);
        ((ScalableFreeformRootEditPart2) p.getViewer().getRootEditPart()).getFigure()
                                                                         .translateToParent(newLocation);
        
        final ChangeBoundsRequest req = new ChangeBoundsRequest();
        req.setType(RequestConstants.REQ_MOVE);
        req.setEditParts(p);
        req.setMoveDelta(new Point(newLocation.x - currentBounds.x, newLocation.y - currentBounds.y));
        final Command com = p.getCommand(req);
        if (com != null && com.canExecute()) {
            p.getViewer().getEditDomain().getCommandStack().execute(com);
            p.getFigure().getUpdateManager().performValidation();
            return true;
        } else {
            return false;
        }
    }

    /**
     * Change the size of the node to (width,height).<br>
     * Note however that the requested change might no be performed when some layout constraints are maintained by the
     * parent of the node (ie the requested change is refused or adapted by the parent of the node).
     * @param width the new width
     * @param height the new height
     * @return true if the change could be requested (different from 'performed' see note above)
     */
    @objid ("fdfc37ad-6d5b-49c2-b142-13e231c00b2a")
    @Override
    public boolean setSize(int width, int height) {
        final GraphicalEditPart p = this.diagramHandle.getEditPart(this.gmNode);
        if (p == null) {
            return false;
        }
        final Rectangle currentBounds = getBounds();
        
        final ChangeBoundsRequest req = new ChangeBoundsRequest();
        req.setType(RequestConstants.REQ_RESIZE);
        req.setEditParts(p);
        req.setSizeDelta(new Dimension(width - currentBounds.width, height - currentBounds.height));
        final Command com = p.getCommand(req);
        if (com != null && com.canExecute()) {
            p.getViewer().getEditDomain().getCommandStack().execute(com);
            p.getFigure().getUpdateManager().performValidation();
            return true;
        } else {
            return false;
        }
    }

    @objid ("a75e268b-6e5a-4bb6-9ce1-81cdcc834739")
    @Override
    public boolean isSelected() {
        final GraphicalEditPart editPart = this.diagramHandle.getEditPart(this.gmNode);
        return (editPart.getSelected() != EditPart.SELECTED_NONE);
    }

    @objid ("f88d5f63-38a7-498b-b331-0470f61c3047")
    @Override
    public boolean isPrimarySelected() {
        final GraphicalEditPart editPart = this.diagramHandle.getEditPart(this.gmNode);
        return (editPart.getSelected() == EditPart.SELECTED_PRIMARY);
    }

    @objid ("cd51bb0c-3dee-4bf1-8568-515c123da777")
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.gmNode == null) ? 0 : this.gmNode.hashCode());
        return result;
    }

    @objid ("50b3bc4e-4c25-4be1-adbf-86f8529ef6f5")
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof DiagramNode)) {
            return false;
        }
        final DiagramNode other = (DiagramNode) obj;
        if (this.gmNode == null) {
            if (other.gmNode != null) {
                return false;
            }
        } else if (!this.gmNode.equals(other.gmNode)) {
            return false;
        }
        return true;
    }

    @objid ("6b33b4e0-7728-43cd-b987-26435fca62a3")
    @Override
    public String getProperty(final String property) {
        final StyleKey key = resolveStyleKey(property);
        
        if (key != null) {
            return StyleKeyTypeConverter.convertToString(key, this.gmNode.getStyle().getProperty(key));
        }
        return null;
    }

    @objid ("705d6535-3bce-421b-8ec2-ebae5aaa8a75")
    @Override
    public String getFont() {
        final StyleKey styleKey = this.gmNode.getStyleKey(MetaKey.FONT);
        if (styleKey == null) {
            return null;
        }
        final Font currentFont = this.gmNode.getStyle().getProperty(styleKey);
        return StyleKeyTypeConverter.convertToString(styleKey, currentFont);
    }

    @objid ("6e70d7e0-d228-45f1-9a63-44f5857f8502")
    @Override
    public String getLineColor() {
        final StyleKey styleKey = this.gmNode.getStyleKey(MetaKey.LINECOLOR);
        if (styleKey == null) {
            return null;
        }
        final Color color = this.gmNode.getStyle().getProperty(styleKey);
        return StyleKeyTypeConverter.convertToString(styleKey, color);
    }

    @objid ("1ff2ec2b-00aa-4203-983f-974a934ee710")
    @Override
    public int getLineWidth() {
        final StyleKey styleKey = this.gmNode.getStyleKey(MetaKey.LINEWIDTH);
        if (styleKey == null) {
            return 0;
        }
        return this.gmNode.getStyle().getProperty(styleKey);
    }

    @objid ("b3231dc6-1607-4102-bae8-319821005558")
    @Override
    public String getTextColor() {
        final StyleKey styleKey = this.gmNode.getStyleKey(MetaKey.TEXTCOLOR);
        if (styleKey == null) {
            return null;
        }
        final Color color = this.gmNode.getStyle().getProperty(styleKey);
        return StyleKeyTypeConverter.convertToString(styleKey, color);
    }

    @objid ("2671ffac-ce09-43c6-b3fa-1da014ff6262")
    @Override
    public void setFont(final String value) {
        final StyleKey styleKey = this.gmNode.getStyleKey(MetaKey.FONT);
        if (styleKey == null) {
            return;
        }
        this.gmNode.getStyle()
                   .setProperty(styleKey, StyleKeyTypeConverter.convertFromString(styleKey, value));
    }

    @objid ("5fac6c5d-0f6a-4185-ad95-25e788509305")
    @Override
    public void setLineColor(final String value) {
        final StyleKey styleKey = this.gmNode.getStyleKey(MetaKey.LINECOLOR);
        if (styleKey == null) {
            return;
        }
        this.gmNode.getStyle()
                   .setProperty(styleKey, StyleKeyTypeConverter.convertFromString(styleKey, value));
    }

    @objid ("7b63c305-3423-480a-84df-b906e4ea3f62")
    @Override
    public void setLineWidth(final int value) {
        final StyleKey styleKey = this.gmNode.getStyleKey(MetaKey.LINEWIDTH);
        if (styleKey == null) {
            return;
        }
        
        this.gmNode.getStyle().setProperty(styleKey, value);
    }

    @objid ("0796bbe5-5ad9-422c-bbf1-bd761d9c076e")
    @Override
    public void setTextColor(final String value) {
        final StyleKey styleKey = this.gmNode.getStyleKey(MetaKey.TEXTCOLOR);
        if (styleKey == null) {
            return;
        }
        this.gmNode.getStyle()
                   .setProperty(styleKey, StyleKeyTypeConverter.convertFromString(styleKey, value));
    }

    @objid ("68b9e07c-4db9-4431-9c49-2318184b4fec")
    @Override
    public String getFillColor() {
        final StyleKey styleKey = this.gmNode.getStyleKey(MetaKey.FILLCOLOR);
        if (styleKey == null) {
            return null;
        }
        final Color color = this.gmNode.getStyle().getProperty(styleKey);
        return StyleKeyTypeConverter.convertToString(styleKey, color);
    }

    @objid ("41d294f3-4ee5-4a44-ba73-c3f40f283de1")
    @Override
    public int getFillMode() {
        final StyleKey styleKey = this.gmNode.getStyleKey(MetaKey.FILLMODE);
        if (styleKey == null) {
            return 0;
        }
        final FillMode pattern = this.gmNode.getStyle().getProperty(styleKey);
        
        switch (pattern) {
            case TRANSPARENT:
                return 0;
            case SOLID:
                return 1;
            case GRADIENT:
                return 2;
            default:
                return 2;
        }
    }

    @objid ("110eb53c-199d-42fe-bfe9-81fee3b94e35")
    @Override
    public int getRepresentationMode() {
        final StyleKey styleKey = this.gmNode.getStyleKey(MetaKey.REPMODE);
        if (styleKey == null) {
            return 0;
        }
        final RepresentationMode pattern = this.gmNode.getStyle().getProperty(styleKey);
        
        switch (pattern) {
            case SIMPLE:
                return 0;
            case STRUCTURED:
                return 1;
            case IMAGE:
                return 2;
            default:
                return 1;
        }
    }

    @objid ("6be57a3e-5b72-4d89-a1e4-f4fb801e5ff4")
    @Override
    public void setFillColor(final String value) {
        final StyleKey styleKey = this.gmNode.getStyleKey(MetaKey.FILLCOLOR);
        if (styleKey == null) {
            return;
        }
        
        this.gmNode.getStyle()
                   .setProperty(styleKey, StyleKeyTypeConverter.convertFromString(styleKey, value));
    }

    @objid ("742f3784-1fa4-45bf-9eaa-e8b5b3c90071")
    @Override
    public void setFillMode(final int value) {
        final StyleKey styleKey = this.gmNode.getStyleKey(MetaKey.FILLMODE);
        if (styleKey == null) {
            return;
        }
        
        FillMode pattern;
        
        switch (value) {
            case 0:
                pattern = FillMode.TRANSPARENT;
                break;
            case 1:
                pattern = FillMode.SOLID;
                break;
            case 2:
                pattern = FillMode.GRADIENT;
                break;
            default:
                pattern = FillMode.GRADIENT;
        }
        
        this.gmNode.getStyle().setProperty(styleKey, pattern);
    }

    @objid ("71a368b8-ffe0-40fa-8495-34a55d8226ed")
    @Override
    public void setRepresentationMode(final int value) {
        final StyleKey styleKey = this.gmNode.getStyleKey(MetaKey.REPMODE);
        if (styleKey == null) {
            return;
        }
        RepresentationMode pattern;
        
        switch (value) {
            case 0:
                pattern = RepresentationMode.SIMPLE;
                break;
            case 1:
                pattern = RepresentationMode.STRUCTURED;
                break;
            case 2:
                pattern = RepresentationMode.IMAGE;
                break;
            default:
                pattern = RepresentationMode.STRUCTURED;
        }
        
        this.gmNode.getStyle().setProperty(styleKey, pattern);
    }

    @objid ("2e2d1a58-54f7-42b5-8136-c3134b4dee48")
    @Override
    public IStyleHandle getStyle() {
        final NamedStyle style = ((NamedStyle) this.gmNode.getStyle().getCascadedStyle());
        final StyleHandle newStyle = new StyleHandle(style);
        return newStyle;
    }

    @objid ("1ac41701-cb47-4335-bb0a-811779b69e17")
    @Override
    public void setStyle(final IStyleHandle style) {
        final NamedStyle namedStyle = DiagramStyles.getStyleManager().getStyle(style.getName());
        this.gmNode.getStyle().setCascadedStyle(namedStyle);
    }

    @objid ("982caea5-364d-4d4a-a6c4-a9cfc5985ca1")
    @Override
    public List<String> getLocalPropertyNames() {
        final List<String> ret = new ArrayList<>();
        for (final StyleKey key : this.gmNode.getStyle().getLocalKeys()) {
            ret.add(key.getId());
        }
        return ret;
    }

    /**
     * Get a StyleKey from its name, or its MetaKey name.
     */
    @objid ("6ec13287-6a3d-4c1a-b86d-0e783d0cf18a")
    private StyleKey resolveStyleKey(final String name) {
        // Look for a property using this StyleKey
        StyleKey foundKey = StyleKey.getInstance(name);
        if (foundKey == null) {
            // No StyleKey found, look for a MetaKey and then a StyleKey
            final MetaKey meta = MetaKey.getInstance(name);
            if (meta != null) {
                foundKey = this.gmNode.getStyleKey(meta);
            }
        }
        return foundKey;
    }

    @objid ("e1a6a98f-7250-43fb-9f4b-c276febd986b")
    @Override
    public void setProperty(final String property, final String stringValue) {
        final StyleKey key = resolveStyleKey(property);
        
        if (key != null) {
            this.gmNode.getStyle()
                       .setProperty(key, StyleKeyTypeConverter.convertFromString(key, stringValue));
        }
    }

    @objid ("e77a46aa-6312-4fad-a596-23eeeecb23c1")
    @Override
    public void resetLocalProperties() {
        this.gmNode.getStyle().reset();
    }

    @objid ("3eb19e20-f8ee-4948-adc6-084ae2053af2")
    @Override
    public void normalizeLocalProperties() {
        this.gmNode.getStyle().normalize();
    }

    @objid ("0edfbfc2-4052-419b-8099-d283a1874d6a")
    protected Dimension getMinimumSize() {
        final GraphicalEditPart editPart = this.diagramHandle.getEditPart(this.gmNode);
        return editPart.getFigure().getMinimumSize();
    }

}
