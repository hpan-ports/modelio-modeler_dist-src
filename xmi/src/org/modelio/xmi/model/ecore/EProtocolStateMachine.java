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

@objid ("603c2e8c-f558-4f9c-862e-18692a0e8974")
public class EProtocolStateMachine extends EStateMachine implements IEElement {
    @objid ("1b7f9824-82eb-45b7-8605-e13f7d265a3e")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createStateMachine();
    }

    @objid ("ff0831a5-b408-4788-a1ed-4b5d65c55898")
    public EProtocolStateMachine(org.eclipse.uml2.uml.ProtocolStateMachine element) {
        super(element);
    }

    @objid ("ff7e8516-4ea5-4eb7-96a9-b6416714f09f")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("bfe8964e-5049-4cd9-9b39-16f40444e38e")
    public void attach(List<Object> objingElts) {
    }

    @objid ("105ccbf8-e0bf-48d3-a433-8709bcbf9153")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
