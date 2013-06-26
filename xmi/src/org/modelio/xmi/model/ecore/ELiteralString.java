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

@objid ("dc0f6b4b-ffc2-482a-a354-dff2b0a2dbf0")
public class ELiteralString extends ENamedElement implements IEElement {
    @objid ("23634682-cf32-467e-8f26-5bfa96f2401e")
    public Element createObjingElt() {
        return null;
    }

    @objid ("1495dbe6-f7a7-4c16-aa74-becb950a3a61")
    public ELiteralString(org.eclipse.uml2.uml.LiteralString element) {
        super(element);
    }

    @objid ("7091eb05-a05a-438d-9e2a-869275491839")
    public void attach(Element objingElt) {
    }

    @objid ("a1998293-9801-4fde-8c46-1603ccdd53d4")
    public void attach(List<Object> objingElts) {
    }

    @objid ("8c0aa3f3-0fad-462d-87a5-1ae547988ac6")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
