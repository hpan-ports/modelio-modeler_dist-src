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
    @objid ("b507cd42-21ab-48cf-986f-6b810537a2e2")
    GeneralClass getImplementationRef();

    @objid ("9e0988e2-fff5-48ad-8f20-a625f57f7df2")
    void setImplementationRef(GeneralClass value);

    @objid ("bc5797b6-f14e-4a8e-9a9f-26ee193e97e3")
    EList<BpmnOperation> getOperation();

    @objid ("bec28edb-3740-4d52-8470-1772ec69178c")
    <T extends BpmnOperation> List<T> getOperation(java.lang.Class<T> filterClass);

    @objid ("326292d5-4a70-4cab-9a72-cbb50b62de56")
    EList<BpmnParticipant> getParticipantRef();

    @objid ("f1c1716a-ab29-48c3-ab62-ded129f34f9b")
    <T extends BpmnParticipant> List<T> getParticipantRef(java.lang.Class<T> filterClass);

}
