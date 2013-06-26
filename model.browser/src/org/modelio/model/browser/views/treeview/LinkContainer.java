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
                                    

package org.modelio.model.browser.views.treeview;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("d86d566a-c06d-11e1-abda-001ec947c8cc")
public class LinkContainer {
    @objid ("d86d566b-c06d-11e1-abda-001ec947c8cc")
    private MObject element;

    @objid ("68b8428a-2f04-11e2-9ab7-002564c97630")
    private int nbLinks;

    @objid ("d86d566e-c06d-11e1-abda-001ec947c8cc")
    public LinkContainer(MObject element, int nbLinks) {
        this.element = element;
        this.nbLinks = nbLinks;
    }

    @objid ("d86d5673-c06d-11e1-abda-001ec947c8cc")
    public MObject getElement() {
        return this.element;
    }

    @objid ("68b8428d-2f04-11e2-9ab7-002564c97630")
    public int getNbLinks() {
        return this.nbLinks;
    }

}
