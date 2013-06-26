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

@objid ("9ba59624-4253-4659-98ad-7a217841543e")
public class EContinuation extends ENamedElement implements IEElement {
    @objid ("b0705213-d227-4d27-ab70-0f393f449cfe")
    public Element createObjingElt() {
        return null;
    }

    @objid ("1900504b-0f4d-45bb-8eb9-0b06eded2721")
    public EContinuation(org.eclipse.uml2.uml.Continuation element) {
        super(element);
    }

    @objid ("565fe8c2-c2a6-474d-9cd4-24074e526b54")
    public void attach(Element objingElt) {
    }

    @objid ("3cf6d032-6af0-4b99-9210-9abd6af38e21")
    public void attach(List<Object> objingElts) {
    }

    @objid ("8feca65d-e9da-47d8-940d-895554711e83")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
