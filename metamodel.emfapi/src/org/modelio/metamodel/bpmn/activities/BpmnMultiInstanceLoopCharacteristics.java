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
    @objid ("7de93c74-630f-453e-8d70-035fc722067d")
    boolean isIsSequencial();

    @objid ("e9bb2aa9-6793-4064-aa73-e60a1a778d6f")
    void setIsSequencial(boolean value);

    @objid ("a0a68fe7-19f9-4326-b74f-8c7f48fdb004")
    MultiInstanceBehavior getBehavior();

    @objid ("996f4658-b7a1-4b5a-af8d-7b4e45f746db")
    void setBehavior(MultiInstanceBehavior value);

    @objid ("27aaf3e2-0914-4e32-8c7f-08f31a3c2e84")
    String getLoopCardinality();

    @objid ("bc79df8c-4da5-4474-9aef-49d495635d81")
    void setLoopCardinality(String value);

    @objid ("0984ff11-d575-47ce-9575-753c990c1f21")
    String getCompletionCondition();

    @objid ("bb81c848-1e5a-4c04-b363-3836354a34af")
    void setCompletionCondition(String value);

    @objid ("a17d9d5e-46af-4ba8-b89a-521c79c96646")
    BpmnDataInput getLoopDataInput();

    @objid ("3384b279-9bda-48d8-a8f3-f14eb9757659")
    void setLoopDataInput(BpmnDataInput value);

    @objid ("7ddc230f-573c-480b-8ef4-c064271605d7")
    BpmnDataOutput getLoopDataOutputRef();

    @objid ("752405ce-5130-45c1-9848-e9eee829fce3")
    void setLoopDataOutputRef(BpmnDataOutput value);

    @objid ("bc16a020-7aff-47d8-9274-627ccc2c19a6")
    BpmnEventDefinition getCompletionEventRef();

    @objid ("671a038c-c36a-4f61-a69d-dd68849aea11")
    void setCompletionEventRef(BpmnEventDefinition value);

    @objid ("41bdfbe7-4547-41f3-a0de-a07b9f0aba2b")
    EList<BpmnComplexBehaviorDefinition> getComplexBehaviorDefinition();

    @objid ("92bb5753-a396-435a-a8d4-2cf29dc1a961")
    <T extends BpmnComplexBehaviorDefinition> List<T> getComplexBehaviorDefinition(java.lang.Class<T> filterClass);

}
