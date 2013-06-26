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
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("b6fe7822-f736-4668-a531-b4ca858fcaf7")
public class EComponent extends EClass implements IEElement {
    @objid ("4fa3a4b7-ac77-4f70-a77e-8fdd371d6b7b")
    public Element createObjingElt() {
        return Modelio.getInstance()
                .getModelingSession().getModel().createComponent();
    }

    @objid ("506d62da-4394-42fd-a3da-324f79f6c15e")
    public EComponent(org.eclipse.uml2.uml.Component element) {
        super(element);
    }

    @objid ("acd82c76-8012-4e34-922e-932ffdad2790")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("d8dbe085-8df7-430b-8430-2b8460186198")
    public void attach(List<Object> objingElts) {
    }

    @objid ("4fd9f10d-1fa2-4fc8-91ba-af32474ee31a")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
