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

@objid ("a57c11d0-beb0-4fbb-b514-ceda005594c9")
public class ETimeInterval extends ENamedElement implements IEElement {
    @objid ("c1d584c0-3885-4143-a81b-cfc3940a0eb1")
    public Element createObjingElt() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("4564463c-8ea9-4075-b755-0702b736f640")
    public ETimeInterval(org.eclipse.uml2.uml.TimeInterval element) {
        super(element);
    }

    @objid ("4f815668-7d1f-41f0-85df-b154081a23f4")
    public void attach(Element objingElt) {
        // TODO Auto-generated method stub
    }

    @objid ("c43d59d5-4a30-48ff-99c6-1c0df3fe4658")
    public void attach(List<Object> objingElts) {
    }

    @objid ("04c752f9-7c93-4bb1-9428-ef61f5be2bc0")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
