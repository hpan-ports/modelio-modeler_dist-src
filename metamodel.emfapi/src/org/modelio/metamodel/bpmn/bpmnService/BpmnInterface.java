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
/*   Metamodel version: 9019              */
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
    @objid ("e637e365-0612-423f-a2bb-1de527f0c9a9")
    GeneralClass getImplementationRef();

    @objid ("b1504001-e7db-4dd4-b4d3-1251ec062b75")
    void setImplementationRef(GeneralClass value);

    @objid ("5de7e3f2-816b-4dc0-ba25-e679ce7bbc14")
    EList<BpmnOperation> getOperation();

    @objid ("10bc14c1-f26b-4438-aebe-3645161d24c7")
    <T extends BpmnOperation> List<T> getOperation(java.lang.Class<T> filterClass);

    @objid ("5dccf113-32c4-4a0d-b9da-01399ac95fea")
    EList<BpmnParticipant> getParticipantRef();

    @objid ("c604f508-d41e-4c20-9400-b78390b13c18")
    <T extends BpmnParticipant> List<T> getParticipantRef(java.lang.Class<T> filterClass);

}
