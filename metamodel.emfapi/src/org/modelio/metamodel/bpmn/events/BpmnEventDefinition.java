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
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.bpmn.events;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnEvent;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("008d3f9c-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnEventDefinition extends BpmnBaseElement {
    @objid ("331a8d77-8c51-4108-995c-0210c728e8be")
    BpmnEvent getDefined();

    @objid ("3c6ea648-cac7-4e7a-b459-0fa413fb07b3")
    void setDefined(BpmnEvent value);

    @objid ("4259c9e4-4374-4d0b-9cb4-9f70ec2f7602")
    EList<BpmnMultiInstanceLoopCharacteristics> getLoopRef();

    @objid ("ba475fde-1de9-47b4-b091-29a0b967f0af")
    <T extends BpmnMultiInstanceLoopCharacteristics> List<T> getLoopRef(java.lang.Class<T> filterClass);

}
