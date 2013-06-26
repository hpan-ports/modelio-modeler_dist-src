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
import org.eclipse.uml2.uml.FinalState;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("82c24d09-b323-4b81-8433-813fc98ca4f9")
public class EFinalState extends EState implements IEElement {
    @objid ("d53fb081-20cf-47d4-a015-2694ed9f7c33")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel().createFinalState();
    }

    @objid ("121c0159-8306-417b-b46e-29157958e015")
    public EFinalState(FinalState element) {
        super(element);
    }

    @objid ("27894233-cd4c-4c07-827d-972620659f79")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("0c5fe0a3-069f-4bc9-9468-f7ee4b6240f5")
    public void attach(List<Object> objingElts) {
    }

    @objid ("fc177805-59f3-4734-aa0f-c2d9a07c6737")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
