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

@objid ("cd33ec80-9db4-447d-9a03-38f1a80bde7a")
public class EAcceptCallAction extends EAcceptEventAction implements IEElement {
    @objid ("97b771db-32a0-455f-8e26-4150ba9c5f54")
    @Override
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createAcceptCallEventAction();
    }

    @objid ("599fb3ae-685c-4ffc-9e6a-d516860a197e")
    public EAcceptCallAction(org.eclipse.uml2.uml.AcceptCallAction element) {
        super(element);
    }

    @objid ("ee380969-188c-438c-b86f-0c8a77ca67d8")
    @Override
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("37174a86-b2d2-4741-b2e6-85ac09b6864f")
    @Override
    public void attach(List<Object> objingElts) {
    }

    @objid ("a2c43990-a457-482b-84eb-2839b1c121be")
    @Override
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
