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
                                    

package org.modelio.diagram.editor.statik.elements.packaze;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.IFigure;
import org.modelio.diagram.editor.statik.elements.namespacinglink.GmCompositionLink;
import org.modelio.diagram.editor.statik.elements.namespacinglink.redraw.RedrawCompositionLinkEditPolicy;
import org.modelio.diagram.elements.common.image.ImageFigure;
import org.modelio.diagram.elements.common.image.NonSelectableImageEditPart;
import org.modelio.diagram.elements.core.node.GmCompositeNode;
import org.modelio.diagram.elements.core.node.GmNodeModel;
import org.modelio.diagram.styles.core.IStyle;
import org.modelio.diagram.styles.core.StyleKey.RepresentationMode;

/**
 * Overloading of the {@link NonSelectableImageEditPart} to handle body children transfer as satellites when switching
 * to simple mode.
 * 
 * @author fpoyer
 */
@objid ("3629aa68-55b7-11e2-877f-002564c97630")
public class PackageImageEditPart extends NonSelectableImageEditPart {
    @objid ("3629aa6c-55b7-11e2-877f-002564c97630")
    @Override
    protected void refreshFromStyle(final IFigure aFigure, final IStyle style) {
        if (aFigure.getClass() == ImageFigure.class) {
            if (switchRepresentationMode()) {
                GmPackagePrimaryNode model = (GmPackagePrimaryNode) getModel();
                if (model.getRepresentationMode() == RepresentationMode.SIMPLE) {
                    // reparent all content of body to port container as satellites and add composition link
                    for (GmNodeModel child : model.getBody().getChildren()) {
                        child.setRoleInComposition(GmPackage.BODY_CONTENT_AS_SATELLITE);
                        model.getBody().removeChild(child);
                        model.getParentNode().addChild(child);
                        GmCompositionLink link = new GmCompositionLink(model.getDiagram(),
                                                                       model.getRepresentedRef());
                        model.addStartingLink(link);
                        child.addEndingLink(link);
                    }
                }
                GmPackage gmPackage = (GmPackage) model.getParentNode();
                GmCompositeNode ancestor = gmPackage.getParentNode();
                int index = ancestor.getChildIndex(gmPackage);
                // This will "delete" the current edit part.
                ancestor.removeChild(gmPackage);
        
                // This will invoke the ModelioEditPartFactory that will
                // create another edit part.
                ancestor.addChild(gmPackage, index);
                return;
            }
        }
        
        super.refreshFromStyle(aFigure, style);
    }

    @objid ("3629aa75-55b7-11e2-877f-002564c97630")
    @Override
    protected void createEditPolicies() {
        super.createEditPolicies();
        // Add specific policy to handle requests to redraw composition links.
        installEditPolicy("RedrawCompositionLinkEditPolicy", new RedrawCompositionLinkEditPolicy());
    }

}
