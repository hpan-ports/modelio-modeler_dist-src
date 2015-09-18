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
package org.modelio.metamodel.bpmn.bpmnService;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("000de92c-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnInterface extends BpmnRootElement {
    @objid ("bb664b74-c72c-4055-a24c-082aa0414b60")
    GeneralClass getImplementationRef();

    @objid ("1c1d94fb-baec-4040-83de-74703825bc0a")
    void setImplementationRef(GeneralClass value);

    @objid ("2aa99fec-f9c7-49fd-8058-e844064c3618")
    EList<BpmnOperation> getOperation();

    @objid ("838672cb-c02e-4516-8add-3fd716df75e7")
    <T extends BpmnOperation> List<T> getOperation(java.lang.Class<T> filterClass);

    @objid ("3b646463-f3b1-41d9-9b14-92b54ff2c576")
    EList<BpmnParticipant> getParticipantRef();

    @objid ("adcdc9bc-0a06-47d4-98b8-f00426eea27a")
    <T extends BpmnParticipant> List<T> getParticipantRef(java.lang.Class<T> filterClass);

}
