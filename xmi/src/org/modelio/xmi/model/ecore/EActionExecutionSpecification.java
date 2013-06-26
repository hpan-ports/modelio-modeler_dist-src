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

/**
 * This class handles the import of Ecore  org.eclipse.uml2.uml.ActionExecutionSpecification
 * @author ebrosse
 */
@objid ("c5ee6b00-c5a9-4c6e-bacc-7218603df436")
public class EActionExecutionSpecification extends EExecutionSpecification implements IEElement {
    @objid ("4a6f2e83-185a-4433-aeb7-f2e95d6af83e")
    @Override
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createExecutionSpecification();
    }

    @objid ("80fb7328-bf73-4c1e-8037-2f3ea3d7d6a3")
    public EActionExecutionSpecification(org.eclipse.uml2.uml.ActionExecutionSpecification element) {
        super(element);
    }

    @objid ("17b003ad-57ec-43ae-bc1c-a04d07b8ec64")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("c05c2ba7-92e3-408e-91a5-a9b027cfcf65")
    public void attach(List<Object> objingElts) {
    }

    @objid ("ea366240-3637-41cf-9330-2768e7e12406")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
