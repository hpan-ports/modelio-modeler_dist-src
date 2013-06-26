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
                                    

package org.modelio.xmi.model.ecore;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("81b99576-20c6-4fa2-b220-d8b7d1846663")
public class ELinkEndDestructionData extends EElement implements IEElement {
    @objid ("b4fdf022-fd40-42b0-ad03-d15607b2a014")
    public Element createObjingElt() {
        return null;
    }

    @objid ("396d5c9d-a567-4e36-bc02-9e0af81ba084")
    public ELinkEndDestructionData(org.eclipse.uml2.uml.LinkEndDestructionData element) {
        super(element);
    }

    @objid ("5e527dd3-ab82-47ea-95ff-378ab2b67de2")
    public void attach(Element objingElt) {
    }

    @objid ("204c3573-38d8-4ed5-940c-6ebe3d780122")
    public void attach(List<Object> objingElts) {
    }

    @objid ("1c2517e7-b2e6-4fea-ae21-0b1af07733a3")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
