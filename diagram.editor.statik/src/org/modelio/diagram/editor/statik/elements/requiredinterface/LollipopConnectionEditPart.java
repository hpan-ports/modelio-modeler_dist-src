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
                                    

package org.modelio.diagram.editor.statik.elements.requiredinterface;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.SelectionEditPolicy;
import org.modelio.diagram.editor.statik.elements.providedinterface.GmProvidedInterfaceLink;
import org.modelio.diagram.elements.common.linktovoid.LinkToVoidConstants;
import org.modelio.diagram.elements.core.figures.EllipseFigure;
import org.modelio.diagram.elements.core.node.GmNodeEditPart;
import org.modelio.diagram.elements.core.policies.SmallNodeNonResizeableEditPolicy;

/**
 * Edit part for {@link GmLollipopConnection}.
 * <p>
 * Represented as a simple ellipse in the diagram.
 * 
 * @author cmarin
 */
@objid ("367a89a9-55b7-11e2-877f-002564c97630")
public class LollipopConnectionEditPart extends GmNodeEditPart {
    @objid ("367a89ad-55b7-11e2-877f-002564c97630")
    private static final int LOLLIPOP_DIAM = GmProvidedInterfaceLink.LOLLIPOP_DIAM;

    @objid ("367a89af-55b7-11e2-877f-002564c97630")
    @Override
    protected IFigure createFigure() {
        final EllipseFigure fig = new EllipseFigure();
        fig.setPreferredSize(LOLLIPOP_DIAM, LOLLIPOP_DIAM);
        fig.setSize(LOLLIPOP_DIAM, LOLLIPOP_DIAM);
        
        refreshFromStyle(fig, getModelStyle());
        return fig;
    }

    @objid ("367a89b4-55b7-11e2-877f-002564c97630")
    @Override
    protected void createEditPolicies() {
        super.createEditPolicies();
        
        installEditPolicy(LinkToVoidConstants.REQ_LINKTOVOID_END, new LollipopConnectionLinksEditPolicy());
    }

    @objid ("367a89b7-55b7-11e2-877f-002564c97630")
    @Override
    public ConnectionAnchor getTargetConnectionAnchor(final ConnectionEditPart connectionPart) {
        return new EllipseAnchor(getFigure());
    }

    @objid ("367c1019-55b7-11e2-877f-002564c97630")
    @Override
    public ConnectionAnchor getTargetConnectionAnchor(final Request request) {
        return new EllipseAnchor(getFigure());
    }

    @objid ("367c1020-55b7-11e2-877f-002564c97630")
    @Override
    protected void refreshVisuals() {
        final GmLollipopConnection gmNode = (GmLollipopConnection) this.getModel();
        this.getFigure().getParent().setConstraint(this.getFigure(), gmNode.getLayoutData());
    }

    @objid ("367c1023-55b7-11e2-877f-002564c97630")
    @Override
    public SelectionEditPolicy getPreferredDragRolePolicy(final String requestType) {
        return new SmallNodeNonResizeableEditPolicy();
    }

}
