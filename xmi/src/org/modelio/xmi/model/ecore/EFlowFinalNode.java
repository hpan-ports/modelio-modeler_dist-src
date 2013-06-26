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

@objid ("87770010-e3ef-450b-8f15-b2c258e34fa1")
public class EFlowFinalNode extends EActivityNode implements IEElement {
    @objid ("b7815eea-d024-4c86-9c76-f154b55235a9")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createFlowFinalNode();
    }

    @objid ("2ef93a87-a0f9-4940-b0ad-cbb05dc330e2")
    public EFlowFinalNode(org.eclipse.uml2.uml.FlowFinalNode element) {
        super(element);
    }

    @objid ("f99e96e4-8275-4432-b62c-4f61b4efd9bf")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("c81254e0-4d27-4341-af78-06f4508ffc33")
    public void attach(List<Object> objingElts) {
    }

    @objid ("6b2b54f5-81a9-4b45-95b7-bf09626e15ec")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
