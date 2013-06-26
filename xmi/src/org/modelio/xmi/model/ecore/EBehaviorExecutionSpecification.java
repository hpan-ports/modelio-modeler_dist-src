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

@objid ("7a54a601-cdb4-45aa-8df4-38f518524197")
public class EBehaviorExecutionSpecification extends EExecutionSpecification implements IEElement {
    @objid ("b6df0cb3-444a-4069-89b2-403118838061")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createExecutionSpecification();
    }

    @objid ("2dda147b-34f4-44e3-a400-8cba95d473ef")
    public EBehaviorExecutionSpecification(org.eclipse.uml2.uml.BehaviorExecutionSpecification element) {
        super(element);
    }

    @objid ("debe2c85-859f-4ab9-b6c2-6d4b27fd88c8")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("443e4bb6-9ddb-450d-8686-9785b7323809")
    public void attach(List<Object> objingElts) {
    }

    @objid ("67ecfe71-d3cd-4fd5-b808-6b9fc7ea7044")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
