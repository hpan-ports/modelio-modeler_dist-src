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

@objid ("3e5cf4ba-428f-44a8-923c-55412074cef0")
public class EActivityFinalNode extends EActivityNode implements IEElement {
    @objid ("3ca55cbc-e6c3-4857-8525-54679ad1d5af")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createActivityFinalNode();
    }

    @objid ("c269cad2-6fa7-4a06-82ac-1ebe53b9ac7e")
    public EActivityFinalNode(org.eclipse.uml2.uml.ActivityFinalNode element) {
        super(element);
    }

    @objid ("c1a1acb8-5044-408a-a0da-41438a3046ca")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("9a458d5b-a0dd-44eb-99f6-4446572abec4")
    public void attach(List<Object> objingElts) {
    }

    @objid ("8b5456ee-c58c-4022-9eed-0b4a05c97f5c")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
