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

@objid ("1cbe71ce-ec1b-429c-945b-b34317c1175e")
public class EMergeNode extends EActivityNode implements IEElement {
    @objid ("c2663ab0-ff38-4e96-98b4-c81852db4c31")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createDecisionMergeNode();
    }

    @objid ("ef507645-752f-4566-901c-3588247b08f8")
    public EMergeNode(org.eclipse.uml2.uml.MergeNode element) {
        super(element);
    }

    @objid ("e9254476-362b-43a3-9ef9-ea6279aba81a")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("655d3061-a0b0-4218-925a-f17857a60f85")
    public void attach(List<Object> objingElts) {
    }

    @objid ("d4d8a49a-d180-4e3a-8895-b1295416a98c")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
