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

@objid ("1c2fb5f8-95e3-4d6c-b866-9d73ea53127b")
public class EInterval extends ENamedElement implements IEElement {
    @objid ("3531c2d3-3f83-4ee1-9d42-8f22ce018aca")
    public Element createObjingElt() {
        return null;
    }

    @objid ("e811f1ea-5557-4de0-af07-d88983173b39")
    public EInterval(org.eclipse.uml2.uml.Interval element) {
        super(element);
    }

    @objid ("3ce22901-ab0f-499c-b941-d306c09c303e")
    public void attach(Element objingElt) {
    }

    @objid ("24c91f01-f54e-4cb3-bb0b-f52e5e948527")
    public void attach(List<Object> objingElts) {
    }

    @objid ("4cc6bfef-6531-41b4-ac5a-478511c80656")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
