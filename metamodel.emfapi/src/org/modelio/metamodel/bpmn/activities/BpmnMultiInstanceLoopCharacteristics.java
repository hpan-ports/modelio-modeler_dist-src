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
package org.modelio.metamodel.bpmn.activities;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnComplexBehaviorDefinition;
import org.modelio.metamodel.bpmn.activities.MultiInstanceBehavior;
import org.modelio.metamodel.bpmn.events.BpmnEventDefinition;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;

@objid ("0080f732-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnMultiInstanceLoopCharacteristics extends BpmnLoopCharacteristics {
    @objid ("1aa30465-932f-4a5f-92df-bd9f7ca24654")
    boolean isIsSequencial();

    @objid ("b97d7e54-51df-47b0-9d2f-cb9d9483bdec")
    void setIsSequencial(boolean value);

    @objid ("f7ea6994-5599-43b8-b546-45630127604f")
    MultiInstanceBehavior getBehavior();

    @objid ("116dba1f-bfe7-46c4-9881-0a34a3236d36")
    void setBehavior(MultiInstanceBehavior value);

    @objid ("e13b2f6d-ae45-4864-b191-ca1450a5b036")
    String getLoopCardinality();

    @objid ("aae774ab-dede-4e98-abf9-681412d008b5")
    void setLoopCardinality(String value);

    @objid ("77c551f2-8e42-481f-81de-ec228c1ed5da")
    String getCompletionCondition();

    @objid ("708973e5-ebd6-4d80-8afa-93f4ecbbb868")
    void setCompletionCondition(String value);

    @objid ("d8edcdac-f5af-4857-863d-cce643ad1647")
    BpmnDataInput getLoopDataInput();

    @objid ("a06fef86-bdf3-4ff8-be8c-32c518354371")
    void setLoopDataInput(BpmnDataInput value);

    @objid ("c5019ac9-2150-4892-920e-68291d78ebd8")
    BpmnDataOutput getLoopDataOutputRef();

    @objid ("a7129df0-f80c-427e-b57c-219ce074c8aa")
    void setLoopDataOutputRef(BpmnDataOutput value);

    @objid ("bae5a818-fdbb-4000-af6b-306f4448bf1a")
    BpmnEventDefinition getCompletionEventRef();

    @objid ("a5d82a16-fd32-46a4-8892-b51fb82950db")
    void setCompletionEventRef(BpmnEventDefinition value);

    @objid ("070d0a94-e7d5-49b7-ac59-08907bdf48c5")
    EList<BpmnComplexBehaviorDefinition> getComplexBehaviorDefinition();

    @objid ("07a2429d-5c72-4248-8e5a-c83b91f39a34")
    <T extends BpmnComplexBehaviorDefinition> List<T> getComplexBehaviorDefinition(java.lang.Class<T> filterClass);

}
