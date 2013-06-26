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

@objid ("6e5fd281-204a-4475-9476-c9320265aefa")
public class EAction extends EElement implements IEElement {
    @objid ("dab47eb5-92b6-4e2b-925c-f73a2c53e172")
    public Element createObjingElt() {
        return null;
    }

    @objid ("83de5502-019d-4709-9d3f-e376000e5eca")
    public EAction(org.eclipse.uml2.uml.Action element) {
        super(element);
    }

    @objid ("a339f273-441e-46d9-8ed4-6dc82e595daa")
    public void attach(Element objingElt) {
    }

    @objid ("0b4207c1-d515-4607-aa26-4e7392fc7050")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

    @objid ("8b0f4e76-cd14-4b25-ae04-327d3bae03f2")
    public void attach(List<Object> objingElts) {
    }

}
