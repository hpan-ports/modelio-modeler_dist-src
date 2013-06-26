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
                                    

package org.modelio.diagram.elements.core.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.elements.core.link.GmLink;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This interface means that the diagram graphic is a Connection.
 */
@objid ("80801c75-1dec-11e2-8cad-001ec947c8cc")
public interface IGmLink extends IGmLinkable {
    /**
     * @return The link source
     */
    @objid ("80801c77-1dec-11e2-8cad-001ec947c8cc")
    IGmLinkable getFrom();

    /**
     * Update the link origin.
     * <p>
     * This method is intended to be called only by {@link IGmLinkable#addEndingLink(GmLink)}. It does not fire change
     * event.
     * @param from The new link origin
     */
    @objid ("80801c7a-1dec-11e2-8cad-001ec947c8cc")
    void setFrom(IGmLinkable from);

    @objid ("80801c7d-1dec-11e2-8cad-001ec947c8cc")
    MObject getFromElement();

    /**
     * @return the link destination
     */
    @objid ("80801c7f-1dec-11e2-8cad-001ec947c8cc")
    IGmLinkable getTo();

    /**
     * Update the link destination.
     * <p>
     * This method is intended to be called only by {@link IGmLinkable#addEndingLink(GmLink)}. It does not fire change
     * event.
     * @param to The new destination
     */
    @objid ("80801c82-1dec-11e2-8cad-001ec947c8cc")
    void setTo(IGmLinkable to);

    @objid ("80801c85-1dec-11e2-8cad-001ec947c8cc")
    MObject getToElement();

    @objid ("80801c87-1dec-11e2-8cad-001ec947c8cc")
    IGmPath getPath();

    @objid ("80801c89-1dec-11e2-8cad-001ec947c8cc")
    void firePathChanged(final IGmPath path);

}
