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

@objid ("c20ebe8f-d648-4cf9-ab26-d7bf108521e4")
public class EExecutionOccurrenceSpecification extends EOccurrenceSpecification implements IEElement {
    @objid ("07b8387d-555f-45ec-9338-4c594ba82da9")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createExecutionOccurenceSpecification();
    }

    @objid ("c305b130-b001-473d-97f6-844ffc7af0b0")
    public EExecutionOccurrenceSpecification(org.eclipse.uml2.uml.ExecutionOccurrenceSpecification element) {
        super(element);
    }

    @objid ("5b5e0ce5-2635-4891-b7f6-67b7072906c3")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("35895bba-cfc0-4013-96eb-06a2b0977ecd")
    public void attach(List<Object> objingElts) {
    }

    @objid ("f18f7d8c-829d-4cd4-9fb6-41699be81da2")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
