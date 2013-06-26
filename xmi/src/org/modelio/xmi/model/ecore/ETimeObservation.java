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

@objid ("931e9ff4-8af0-448a-b758-45b51d9d21bf")
public class ETimeObservation extends ENamedElement implements IEElement {
    @objid ("6c5f7f9e-af09-4835-af5c-b10ea7425df1")
    public Element createObjingElt() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("977a76fa-8b18-4055-ad4d-b5c61fe802c5")
    public ETimeObservation(org.eclipse.uml2.uml.TimeObservation element) {
        super(element);
    }

    @objid ("34b5a137-82be-4832-854d-74cac8a1b859")
    public void attach(Element objingElt) {
        // TODO Auto-generated method stub
    }

    @objid ("7c9fd511-fcab-4195-97f3-ea587ec0df6b")
    public void attach(List<Object> objingElts) {
    }

    @objid ("ae80a3a1-5801-4682-9df5-416c544295ab")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
