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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
package org.modelio.metamodel.bpmn.rootElements;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociationDirection;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("00772770-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnAssociation extends BpmnArtifact {
    @objid ("5eea8474-49f8-4a23-9568-376c88417085")
    BpmnAssociationDirection getAssociationDirection();

    @objid ("1c238ddd-29a0-4894-b496-c64a3e6eafe8")
    void setAssociationDirection(BpmnAssociationDirection value);

    @objid ("d889ab1e-0fd8-4733-a8e1-d15027d9267e")
    BpmnBaseElement getTargetRef();

    @objid ("e9fc3a16-5012-436e-ac71-f9c428b1a40f")
    void setTargetRef(BpmnBaseElement value);

    @objid ("ea2da372-dc53-4da5-889a-0f8e505ba98a")
    BpmnBaseElement getSourceRef();

    @objid ("12837e41-8c0e-41e4-b455-8f71f5c70d7f")
    void setSourceRef(BpmnBaseElement value);

}
