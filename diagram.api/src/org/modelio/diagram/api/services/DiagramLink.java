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
import java.util.Collection;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.modelio.api.diagram.IDiagramGraphic;
import org.modelio.api.diagram.IDiagramLink;
import org.modelio.api.diagram.ILinkPath;
import org.modelio.api.diagram.InvalidDestinationPointException;
import org.modelio.api.diagram.InvalidPointsPathException;
import org.modelio.api.diagram.InvalidSourcePointException;
import org.modelio.api.diagram.style.IStyleHandle;
import org.modelio.diagram.api.dg.DGFactory;
import org.modelio.diagram.api.dg.LinkPath;
import org.modelio.diagram.api.style.StyleHandle;
import org.modelio.diagram.elements.common.portcontainer.GmPortContainer;
import org.modelio.diagram.elements.core.link.GmPath;
import org.modelio.diagram.elements.core.link.IAnchorModelProvider;
import org.modelio.diagram.elements.core.link.path.ConnectionHelperFactory;
import org.modelio.diagram.elements.core.link.path.GmPathDataExtractor;
import org.modelio.diagram.elements.core.link.path.IConnectionHelper;
import org.modelio.diagram.elements.core.link.path.RawPathData;
import org.modelio.diagram.elements.core.model.IGmLink;
import org.modelio.diagram.elements.core.model.IGmLinkable;
import org.modelio.diagram.elements.core.node.GmNodeModel;
import org.modelio.diagram.styles.core.MetaKey;
import org.modelio.diagram.styles.core.NamedStyle;
import org.modelio.diagram.styles.core.StyleKey.ConnectionRouterId;
import org.modelio.diagram.styles.core.StyleKey.LinePattern;
import org.modelio.diagram.styles.core.StyleKey;
import org.modelio.diagram.styles.plugin.DiagramStyles;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This class represents a DiagramGraphic of the 'link' kind.
 */
@objid ("df567469-24b7-4970-aff4-e17a2d721dc8")
public abstract class DiagramLink extends DiagramGraphic implements IDiagramLink {
    @objid ("b2af7b8d-b460-428e-afba-351dc7e0adc3")
    private final IGmLink gmLink;

    /**
     * Return the path of the current link.
     * @return The LinkPath that represent the path of the current link.
     */
    @objid ("9785775e-bbb9-49dd-aed7-10f79dc31b43")
    @Override
    public ILinkPath getPath() {
        final LinkPath linkPath = new LinkPath();
        final List<Point> points = new ArrayList<>();
        
        final ConnectionEditPart editPart = getConnectionEditPart();
        final Connection cnx = (Connection) editPart.getFigure();
        
        final ConnectionAnchor sourceAnchor = cnx.getSourceAnchor();
        
        final ConnectionAnchor targetAnchor = cnx.getTargetAnchor();
        
        final Object pathData = this.gmLink.getPath().getPathData();
        final IConnectionHelper helper = ConnectionHelperFactory.createFromSerializedData(this.gmLink.getPath()
                                                                                          .getRouterKind(),
                                                                                          pathData,
                                                                                          cnx);
        points.addAll(helper.getBendPoints());
        
        // Source point
        if (points.isEmpty()) {
            Point.SINGLETON.setLocation(sourceAnchor.getLocation(targetAnchor.getReferencePoint()));
        } else {
            Point.SINGLETON.setLocation(points.get(0));
            cnx.translateToAbsolute(Point.SINGLETON);
            Point.SINGLETON.setLocation(sourceAnchor.getLocation(Point.SINGLETON));
        }
        cnx.translateToRelative(Point.SINGLETON);
        points.add(0, Point.SINGLETON.getCopy());
        
        // Target point
        Point.SINGLETON.setLocation(points.get(points.size() - 1));
        cnx.translateToAbsolute(Point.SINGLETON);
        Point.SINGLETON.setLocation(targetAnchor.getLocation(Point.SINGLETON));
        cnx.translateToRelative(Point.SINGLETON);
        points.add(Point.SINGLETON.getCopy());
        
        linkPath.setPoints(points);
        return linkPath;
    }

    /**
     * Route the path of a link.
     * 
     * This method computes a path so that the link goes through the whole list of points.  the router referenced by
     * the current Link is an orthogonal router the path will have orthogonal angles.  the router referenced by the
     * current Link is a direct router this method is equivalent to the setPath method.
     * @param points A collection of points that must be on the link path.
     */
    @objid ("9cacef99-8b4e-413e-8a65-fe4f1187e4f1")
    @Override
    public void setPath(Collection<Point> points) {
        final LinkPath path = new LinkPath();
        path.setPoints(points);
        try {
            setPath(path);
        } catch (final InvalidPointsPathException e) {
            throw new IllegalArgumentException(e.getLocalizedMessage(), e);
        } catch (final InvalidSourcePointException e) {
            throw new IllegalArgumentException(e.getLocalizedMessage(), e);
        } catch (final InvalidDestinationPointException e) {
            throw new IllegalArgumentException(e.getLocalizedMessage(), e);
        }
    }

    /**
     * Set the path of a link.
     * 
     * This method tries to set the current link path.
     * @throws org.modelio.api.diagram.InvalidSourcePointException If the source point is invalid.
     * @throws org.modelio.api.diagram.InvalidPointsPathException If the given path is invalid with the router type associated with the current link.
     * @throws org.modelio.api.diagram.InvalidDestinationPointException If the destination point is invalid.
     */
    @objid ("6864eae1-fc4b-47fc-8bae-8160626147f1")
    @Override
    public void setPath(ILinkPath linkPath) throws InvalidSourcePointException, InvalidPointsPathException, InvalidDestinationPointException {
        final List<Point> points = new ArrayList<>(linkPath.getPoints());
        if (points.size() < 2) {
            throw new InvalidPointsPathException("You must have at least a source and a destination point");
        }
        
        final ConnectionEditPart editPart = getConnectionEditPart();
        final Connection cnx = (Connection) editPart.getFigure();
        
        final RawPathData rawPath = new RawPathData();
        rawPath.setRoutingMode(this.gmLink.getPath().getRouterKind());
        
        // Remove the first point and move the source anchor
        setSourceLocation(points.get(0));
        rawPath.setSrcPoint(points.get(0));
        points.remove(0);
        
        // Remove the last point and move the target anchor
        setTargetLocation(points.get(points.size() - 1));
        rawPath.setLastPoint(points.get(points.size() - 1));
        points.remove(points.size() - 1);
        
        for (Point relativePoint : points) {
            Point.SINGLETON.setLocation(relativePoint);
            cnx.translateToAbsolute(Point.SINGLETON);
            rawPath.getPath().add(Point.SINGLETON.getCopy());
        }
        //rawPath.getPath().addAll(points);
        
        final IConnectionHelper helper = ConnectionHelperFactory.createFromRawData(rawPath, cnx);
        
        // Change the path
        final GmPath newPath = new GmPath(this.gmLink.getPath());
        if (editPart.getSource() instanceof IAnchorModelProvider) {
            newPath.setSourceAnchor(((IAnchorModelProvider) editPart.getSource()).createAnchorModel(cnx.getSourceAnchor()));
        }
        if (editPart.getTarget() instanceof IAnchorModelProvider) {
            newPath.setTargetAnchor(((IAnchorModelProvider) editPart.getTarget()).createAnchorModel(cnx.getTargetAnchor()));
        }
        newPath.setPathData(GmPathDataExtractor.extractDataModel(helper));
        
        this.gmLink.setLayoutData(newPath);
        
        editPart.getFigure().getUpdateManager().performValidation();
    }

    /**
     * Modify the router referenced by the link.
     */
    @objid ("be79948f-7717-430f-b0ce-849cd441a43c")
    @Override
    public void setRouterKind(LinkRouterKind routerKind) {
        ConnectionRouterId routerId;
        
        // Convert LinkRouterKind to ConnectionRouterId
        switch (routerKind) {
            case BENDPOINT:
                routerId = ConnectionRouterId.BENDPOINT;
                break;
            case DIRECT:
                routerId = ConnectionRouterId.DIRECT;
                break;
            case ORTHOGONAL:
                routerId = ConnectionRouterId.ORTHOGONAL;
                break;
        
            default:
                routerId = ConnectionRouterId.DIRECT;
        }
        
        // Set the router property
        final StyleKey styleKey = this.gmLink.getStyleKey(MetaKey.CONNECTIONROUTER);
        if (styleKey != null) {
        
            this.gmLink.getStyle().setProperty(styleKey, routerId);
        }
    }

    /**
     * Creates a diagram link.
     * @param diagramHandle The diagram manipulation class.
     * @param gmLink The gm link represented by this class.
     */
    @objid ("8f8c8cd7-50d2-4d76-aab8-ecb706ec5465")
    public DiagramLink(DiagramHandle diagramHandle, IGmLink gmLink) {
        super(diagramHandle);
        this.gmLink = gmLink;
    }

    /**
     * @return the source DiagramGraphic of the current Link.
     */
    @objid ("08af9ed9-21aa-47ca-9075-d3ec79d3d097")
    @Override
    public IDiagramGraphic getFrom() {
        final IGmLinkable from = this.gmLink.getFrom();
        IDiagramGraphic ret = DGFactory.getInstance().getDiagramGraphic(this.diagramHandle, from);
        
        if (ret == null &&
                from instanceof GmNodeModel &&
                ((GmNodeModel) from).getParent() instanceof GmPortContainer) {
            ret = DGFactory.getInstance().getDiagramGraphic(this.diagramHandle,
                                                            ((GmNodeModel) from).getParent());
        }
        return ret;
    }

    /**
     * @return the destination DiagramNode of the current Link.
     */
    @objid ("c84c3c0e-4d5d-4705-bca1-01b2463952cd")
    @Override
    public IDiagramGraphic getTo() {
        final IGmLinkable to = this.gmLink.getTo();
        IDiagramGraphic ret = DGFactory.getInstance().getDiagramGraphic(this.diagramHandle, to);
        
        if (ret == null &&
                to instanceof GmNodeModel &&
                ((GmNodeModel) to).getParent() instanceof GmPortContainer) {
            ret = DGFactory.getInstance().getDiagramGraphic(this.diagramHandle,
                                                            ((GmNodeModel) to).getParent());
        }
        return ret;
    }

    @objid ("84da6f23-19cb-4ea3-8684-d99086ef2ab4")
    @Override
    public MObject getElement() {
        return this.gmLink.getRelatedElement();
    }

    @objid ("3fc6650f-0ffa-47d9-86ce-f4abf7baf23a")
    @Override
    public void mask() {
        final ConnectionEditPart editPart = getConnectionEditPart();
        
        final GroupRequest deleteReq = new GroupRequest(RequestConstants.REQ_DELETE);
        deleteReq.setEditParts(editPart);
        
        execRequest(editPart, deleteReq);
    }

    @objid ("3f0122b1-fdd7-4dbc-8026-34fb6a5be824")
    @Override
    public boolean isPrimarySelected() {
        final GraphicalEditPart editPart = this.diagramHandle.getEditPart(this.gmLink);
        return (editPart.getSelected() == EditPart.SELECTED_PRIMARY);
    }

    @objid ("6d5bb49d-69d0-4634-a500-96747a7b2d04")
    @Override
    public boolean isSelected() {
        final GraphicalEditPart editPart = this.diagramHandle.getEditPart(this.gmLink);
        return (editPart.getSelected() != EditPart.SELECTED_NONE);
    }

    @objid ("7c9dfb37-51fc-4319-b1c4-ea66d27fe531")
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.gmLink == null) ? 0 : this.gmLink.hashCode());
        return result;
    }

    @objid ("b7ba14f2-6014-4057-8d93-17ad5e110a43")
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof DiagramLink)) {
            return false;
        }
        final DiagramLink other = (DiagramLink) obj;
        if (this.gmLink == null) {
            if (other.gmLink != null) {
                return false;
            }
        } else if (!this.gmLink.equals(other.gmLink)) {
            return false;
        }
        return true;
    }

    @objid ("a50fcfcc-ab4b-44df-9ce9-9e3fdb37940c")
    private void setTargetLocation(final Point targetPoint) {
        final ConnectionEditPart connEditPart = getConnectionEditPart();
        
        final Point absTargetPoint = targetPoint.getCopy();
        connEditPart.getFigure().translateToAbsolute(absTargetPoint);
        
        final ReconnectRequest req = new ReconnectRequest(RequestConstants.REQ_RECONNECT_TARGET);
        req.setConnectionEditPart(connEditPart);
        req.setTargetEditPart(connEditPart.getTarget());
        req.setLocation(absTargetPoint);
        
        execRequest(connEditPart.getTarget(), req);
    }

    @objid ("ed0c4873-cfce-4568-92bb-65637a6da1f5")
    private void setSourceLocation(final Point sourcePoint) {
        final ConnectionEditPart connEditPart = getConnectionEditPart();
        
        final Point absTargetPoint = sourcePoint.getCopy();
        connEditPart.getFigure().translateToAbsolute(absTargetPoint);
        
        final ReconnectRequest req = new ReconnectRequest(RequestConstants.REQ_RECONNECT_SOURCE);
        req.setConnectionEditPart(connEditPart);
        req.setTargetEditPart(connEditPart.getSource());
        req.setLocation(absTargetPoint);
        
        execRequest(connEditPart.getSource(), req);
    }

    /**
     * Get router referenced by the link.
     */
    @objid ("bc17b00f-bc1c-407a-a538-e4b8bfd7446d")
    @Override
    public LinkRouterKind getRouterKind() {
        switch (this.gmLink.getPath().getRouterKind()) {
            case BENDPOINT:
                return LinkRouterKind.BENDPOINT;
            case DIRECT:
                return LinkRouterKind.DIRECT;
        
            case ORTHOGONAL:
                return LinkRouterKind.ORTHOGONAL;
            default:
                return LinkRouterKind.DIRECT;
        }
    }

    @objid ("358e4e23-8b6e-425c-aefd-71b4bd39e3c7")
    @Override
    public String getProperty(final String property) {
        final StyleKey key = resolveStyleKey(property);
        
        if (key != null) {
            return StyleKeyTypeConverter.convertToString(key, this.gmLink.getStyle().getProperty(key));
        }
        return null;
    }

    @objid ("ada7fed3-3220-4eb3-9c4d-db007d105c46")
    @Override
    public String getFont() {
        final StyleKey styleKey = this.gmLink.getStyleKey(MetaKey.FONT);
        if (styleKey == null) {
            return null;
        }
        final Font currentFont = this.gmLink.getStyle().getProperty(styleKey);
        return StyleKeyTypeConverter.convertToString(styleKey, currentFont);
    }

    @objid ("d37eb513-7ce9-4b44-85bb-a4ce8d0820ed")
    @Override
    public String getLineColor() {
        final StyleKey styleKey = this.gmLink.getStyleKey(MetaKey.LINECOLOR);
        if (styleKey == null) {
            return null;
        }
        final Color color = this.gmLink.getStyle().getProperty(styleKey);
        return StyleKeyTypeConverter.convertToString(styleKey, color);
    }

    @objid ("30086d89-c02c-4267-bc8c-27121b4ec843")
    @Override
    public int getLinePattern() {
        final StyleKey styleKey = this.gmLink.getStyleKey(MetaKey.LINEPATTERN);
        if (styleKey == null) {
            return 0;
        }
        final LinePattern pattern = this.gmLink.getStyle().getProperty(styleKey);
        
        switch (pattern) {
            case LINE_SOLID:
                return 0;
            case LINE_DASH:
                return 1;
            case LINE_DOT:
                return 2;
            case LINE_DASHDOT:
                return 3;
            case LINE_DASHDOTDOT:
                return 4;
            default:
                return 0;
        }
    }

    @objid ("1dffc789-3a78-4e85-bc39-81128772a736")
    @Override
    public int getLineRadius() {
        final StyleKey styleKey = this.gmLink.getStyleKey(MetaKey.LINERADIUS);
        if (styleKey == null) {
            return 0;
        }
        return this.gmLink.getStyle().getProperty(styleKey);
    }

    @objid ("85b208a7-4bb3-47de-86d0-b629fc273ecb")
    @Override
    public int getLineWidth() {
        final StyleKey styleKey = this.gmLink.getStyleKey(MetaKey.LINEWIDTH);
        if (styleKey == null) {
            return 0;
        }
        return this.gmLink.getStyle().getProperty(styleKey);
    }

    @objid ("66cdb72f-c571-4387-8acb-71148e219cdf")
    @Override
    public String getTextColor() {
        final StyleKey styleKey = this.gmLink.getStyleKey(MetaKey.TEXTCOLOR);
        if (styleKey == null) {
            return null;
        }
        final Color color = this.gmLink.getStyle().getProperty(styleKey);
        return StyleKeyTypeConverter.convertToString(styleKey, color);
    }

    @objid ("fda1ef33-030e-4f7b-94fb-72dc3c946361")
    @Override
    public boolean isDrawLineBridges() {
        final StyleKey styleKey = this.gmLink.getStyleKey(MetaKey.DRAWLINEBRIDGES);
        if (styleKey == null) {
            return true;
        }
        return this.gmLink.getStyle().getProperty(styleKey);
    }

    @objid ("e3b8a34f-e511-4fd4-bdb1-26b06fcf8ea2")
    @Override
    public void setDrawLineBridges(final boolean value) {
        final StyleKey styleKey = this.gmLink.getStyleKey(MetaKey.DRAWLINEBRIDGES);
        if (styleKey == null) {
            return;
        }
        this.gmLink.getStyle().setProperty(styleKey, value);
    }

    @objid ("b6130dbd-4813-4fb8-89a0-18a23339caaa")
    @Override
    public void setFont(final String value) {
        final StyleKey styleKey = this.gmLink.getStyleKey(MetaKey.FONT);
        if (styleKey == null) {
            return;
        }
        this.gmLink.getStyle()
        .setProperty(styleKey, StyleKeyTypeConverter.convertFromString(styleKey, value));
    }

    @objid ("52aa9d77-1738-4681-b628-92ed91b77813")
    @Override
    public void setLineColor(final String value) {
        final StyleKey styleKey = this.gmLink.getStyleKey(MetaKey.LINECOLOR);
        if (styleKey == null) {
            return;
        }
        
        this.gmLink.getStyle()
        .setProperty(styleKey, StyleKeyTypeConverter.convertFromString(styleKey, value));
    }

    @objid ("fedbd916-359d-4e19-b9fc-6b7c451253d7")
    @Override
    public void setLinePattern(final int value) {
        final StyleKey styleKey = this.gmLink.getStyleKey(MetaKey.LINEPATTERN);
        if (styleKey == null) {
            return;
        }
        LinePattern pattern;
        
        switch (value) {
            case 0:
                pattern = LinePattern.LINE_SOLID;
                break;
            case 1:
                pattern = LinePattern.LINE_DASH;
                break;
            case 2:
                pattern = LinePattern.LINE_DOT;
                break;
            case 3:
                pattern = LinePattern.LINE_DASHDOT;
                break;
            case 4:
                pattern = LinePattern.LINE_DASHDOTDOT;
                break;
            default:
                pattern = LinePattern.LINE_SOLID;
        }
        
        this.gmLink.getStyle().setProperty(styleKey, pattern);
    }

    @objid ("4b64bea3-2ea4-4396-9354-d96b494edee6")
    @Override
    public void setLineRadius(final int value) {
        final StyleKey styleKey = this.gmLink.getStyleKey(MetaKey.LINERADIUS);
        if (styleKey == null) {
            return;
        }
        
        this.gmLink.getStyle().setProperty(styleKey, value);
    }

    @objid ("5ed399c4-73c7-4211-9161-ff5e3e45088e")
    @Override
    public void setLineWidth(final int value) {
        final StyleKey styleKey = this.gmLink.getStyleKey(MetaKey.LINEWIDTH);
        if (styleKey == null) {
            return;
        }
        
        this.gmLink.getStyle().setProperty(styleKey, value);
    }

    @objid ("225a47e3-e1b6-4939-bc7f-572e0cee9afe")
    @Override
    public void setTextColor(final String value) {
        final StyleKey styleKey = this.gmLink.getStyleKey(MetaKey.TEXTCOLOR);
        if (styleKey == null) {
            return;
        }
        
        this.gmLink.getStyle()
        .setProperty(styleKey, StyleKeyTypeConverter.convertFromString(styleKey, value));
    }

    @objid ("2131c537-778a-4c77-850e-ad8f3dad95e5")
    @Override
    public IStyleHandle getStyle() {
        final NamedStyle style = ((NamedStyle) this.gmLink.getStyle().getCascadedStyle());
        final StyleHandle newStyle = new StyleHandle(style);
        return newStyle;
    }

    @objid ("46da77bd-11f2-4a95-ab1d-559a3273f2c8")
    @Override
    public void setStyle(final IStyleHandle style) {
        final NamedStyle namedStyle = DiagramStyles.getStyleManager().getStyle(style.getName());
        this.gmLink.getStyle().setCascadedStyle(namedStyle);
    }

    @objid ("af18ab5d-0eec-4813-aa02-cba60b2ee925")
    @Override
    public List<String> getLocalPropertyNames() {
        final List<String> ret = new ArrayList<>();
        for (final StyleKey key : this.gmLink.getStyle().getLocalKeys()) {
            ret.add(key.getId());
        }
        return ret;
    }

    /**
     * Get a StyleKey from its name, or its MetaKey name.
     */
    @objid ("fdd59fd6-788f-4f04-8848-cc2225554fea")
    private StyleKey resolveStyleKey(final String name) {
        // Look for a property using this StyleKey
        StyleKey foundKey = StyleKey.getInstance(name);
        if (foundKey == null) {
            // No StyleKey found, look for a MetaKey and then a StyleKey
            final MetaKey meta = MetaKey.getInstance(name);
            if (meta != null) {
                foundKey = this.gmLink.getStyleKey(meta);
            }
        }
        return foundKey;
    }

    @objid ("cc5ea5c4-2327-4d9c-9df2-641efbc9832a")
    @Override
    public void setProperty(final String property, final String stringValue) {
        final StyleKey key = resolveStyleKey(property);
        
        if (key != null) {
            this.gmLink.getStyle()
            .setProperty(key, StyleKeyTypeConverter.convertFromString(key, stringValue));
        }
    }

    /**
     * Return the links that are starting (ie outgoing links) from this node.
     * @return A list of links in any case, possibly an empty one. Never returns null
     */
    @objid ("31b051d0-60de-4e90-96c5-2cd43816b021")
    @Override
    public List<IDiagramLink> getFromLinks() {
        final List<IDiagramLink> links = new ArrayList<>();
        for (final IGmLink link : this.gmLink.getStartingLinks()) {
            IDiagramLink diagramLink = DGFactory.getInstance().getDiagramLink(this.diagramHandle, link);
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
    @objid ("71d2d2f0-0043-4476-8455-261ebf6fc10e")
    @Override
    public List<IDiagramLink> getToLinks() {
        final List<IDiagramLink> links = new ArrayList<>();
        for (final IGmLink link : this.gmLink.getEndingLinks()) {
            IDiagramLink diagramLink = DGFactory.getInstance().getDiagramLink(this.diagramHandle, link);
            if (diagramLink != null) {
                links.add(diagramLink);
            }
        }
        return links;
    }

    /**
     * Get the edited connection edit part.
     * @return the edit connection edit part.
     */
    @objid ("4025290c-7417-4a7b-8304-92796fae8a6d")
    private ConnectionEditPart getConnectionEditPart() {
        return (ConnectionEditPart) this.diagramHandle.getEditPart(this.gmLink);
    }

    /**
     * Get and execute if possible the command produced by the given request on the given edit part.
     * @param cmd
     * a request to execute.
     * @param editPart an edit part.
     */
    @objid ("32adb6a3-12e0-46cd-b040-6d8f51417ed0")
    private void execRequest(final EditPart editPart, final Request req) {
        final Command cmd = editPart.getCommand(req);
        if (cmd != null && cmd.canExecute()) {
            editPart.getViewer().getEditDomain().getCommandStack().execute(cmd);
            if (editPart instanceof GraphicalEditPart) {
                ((GraphicalEditPart)editPart).getFigure().getUpdateManager().performValidation();
            }
        }
    }

    /**
     * Return the name of this link.
     * @return the link name
     */
    @objid ("5a77b0d0-5e96-43e2-879c-0fe4701f7a4c")
    @Override
    public String getName() {
        return this.gmLink.getRelatedElement() != null ? this.gmLink.getRelatedElement().getName()
                : this.gmLink.getGhostLabel();
    }

    @objid ("d3daa1d0-6001-494b-9051-fda81cd11daa")
    @Override
    public void resetLocalProperties() {
        this.gmLink.getStyle().reset();
    }

    @objid ("d5629b96-824f-4f90-a13b-eb185b12fa3d")
    @Override
    public void normalizeLocalProperties() {
        this.gmLink.getStyle().normalize();
    }

}
