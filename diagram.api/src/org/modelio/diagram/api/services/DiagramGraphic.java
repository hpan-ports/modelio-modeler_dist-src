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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.diagram.IDiagramGraphic;
import org.modelio.api.diagram.IDiagramLink;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("48b9efb2-eca7-4db3-a021-e488ae58e118")
public abstract class DiagramGraphic implements IDiagramGraphic {
    @objid ("446289cf-6ba7-4e09-9475-9c7aebf01987")
    protected DiagramHandle diagramHandle;

    @objid ("e352f549-5a98-4dc3-bdea-8e7e4193393d")
    public DiagramGraphic(DiagramHandle diagramHandle) {
        this.diagramHandle = diagramHandle;
    }

    @objid ("bdbf6815-7861-44f6-bb13-5367df21649f")
    @Override
    public abstract MObject getElement();

    @objid ("4a7d4393-9b1f-41b0-a6dd-2928053099c9")
    @Override
    public abstract String getProperty(String property);

    @objid ("3c0ee989-c57e-443b-8570-7daf06254ecf")
    @Override
    public abstract boolean isPrimarySelected();

    @objid ("3c73a94f-2eaa-425e-9aa4-1b8eee56ea57")
    @Override
    public abstract boolean isSelected();

    /**
     * Mask the current representation. The associated element is not removed from the model.
     */
    @objid ("b4d92383-cd57-4fff-90e4-5ee3b3960d27")
    @Override
    public abstract void mask();

    /**
     * Sets the PDE property value of this graphic for 'property'.
     */
    @objid ("eb7411dc-8ef8-4603-9f50-f6df7ec769e5")
    @Override
    public abstract void setProperty(String property, String value);

    @objid ("22d4c4f1-353e-4417-b202-61a24cf7009f")
    @Override
    public String toString() {
        return String.format("%s(%s)", this.getClass().getSimpleName(), this.getElement());
    }

    /**
     * Return the links that are starting (ie outgoing links) from this node.
     * @return A list of links in any case, possibly an empty one. Never returns null
     */
    @objid ("867974a6-f848-42a6-aa80-b56d86b69d24")
    @Override
    public abstract List<IDiagramLink> getFromLinks();

    /**
     * Return the links that are ending (ie incoming links) at this node.
     * @return A list of links in any case, possibly an empty one. Never returns null
     */
    @objid ("9889f547-a018-4aee-bde7-96eb128c8575")
    @Override
    public abstract List<IDiagramLink> getToLinks();

    @objid ("6f1b892e-00e1-4c45-a25b-7395c99ff40b")
    @Override
    public abstract String getName();

}
