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

@objid ("ff623aa1-4338-4135-b75f-59183c6b8b45")
public class EReceiveSignalEvent extends ENamedElement implements IEElement {
    @objid ("ec94bff2-7728-44a8-8ab9-709b377a0129")
    public Element createObjingElt() {
        return null;
    }

    @objid ("3bb42071-e0d0-4248-a4a8-40babccdb0f2")
    public EReceiveSignalEvent(org.eclipse.uml2.uml.ReceiveSignalEvent element) {
        super(element);
    }

    @objid ("be721447-10cb-4789-bad2-0a6d210591b2")
    public void attach(Element objingElt) {
    }

    @objid ("ca57ff08-8943-46eb-b2ca-2abdc4094730")
    public void attach(List<Object> objingElts) {
    }

    @objid ("c8646df2-9f10-40fa-bb2e-e6ed72b25ecf")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
