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
package org.modelio.metamodel.bpmn.processCollaboration;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("0074fd92-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnLaneSet extends BpmnBaseElement {
    @objid ("e40ddf35-6104-4e73-b568-b340de813867")
    EList<BpmnLane> getLane();

    @objid ("47a53520-141c-44ae-a8af-eadc38368e73")
    <T extends BpmnLane> List<T> getLane(java.lang.Class<T> filterClass);

    @objid ("59f709d4-3dd5-4474-a0c8-73ebd7f7d20d")
    BpmnProcess getProcess();

    @objid ("be7958ba-4395-43f7-8e92-ccaba7a6e77b")
    void setProcess(BpmnProcess value);

    @objid ("65e41ca8-eba8-49e5-afd9-b5a3ef16986e")
    BpmnLane getParentLane();

    @objid ("607dcfe1-2093-4e5e-b941-84095b994413")
    void setParentLane(BpmnLane value);

    @objid ("3601d0dc-2a57-4098-a48c-84e2e716a29c")
    BpmnSubProcess getSubProcess();

    @objid ("8d96e61f-e8a3-43ba-a603-d6f5e5f561e7")
    void setSubProcess(BpmnSubProcess value);

}
