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
    @objid ("707cc3ba-dcbf-4272-87a9-db688dbeb8ee")
    boolean isIsSequencial();

    @objid ("eed2b93a-3f57-4c7c-ace9-84279fe02301")
    void setIsSequencial(boolean value);

    @objid ("44aa697a-8e72-4e28-88e7-f126da7479fc")
    MultiInstanceBehavior getBehavior();

    @objid ("1d931e22-b56f-4785-af0f-d6c7949fea22")
    void setBehavior(MultiInstanceBehavior value);

    @objid ("88897841-0d10-4459-adb3-728836626fe0")
    String getLoopCardinality();

    @objid ("02615b8f-22c5-41f5-9369-b96737056a92")
    void setLoopCardinality(String value);

    @objid ("5c6cdaae-05d7-421c-920e-4fb28d53a7f6")
    String getCompletionCondition();

    @objid ("faa5a14f-25ea-483f-91f0-8fb0bfee6ee4")
    void setCompletionCondition(String value);

    @objid ("8166a73e-076a-4a96-b0aa-5ff3072689a9")
    BpmnDataInput getLoopDataInput();

    @objid ("82d43456-1254-4a64-b363-7b1f02155166")
    void setLoopDataInput(BpmnDataInput value);

    @objid ("7bd11711-b33b-4748-82fd-c06631cd1b67")
    BpmnDataOutput getLoopDataOutputRef();

    @objid ("2e2b1b10-0674-442e-aabf-749e24d854ab")
    void setLoopDataOutputRef(BpmnDataOutput value);

    @objid ("2cebf3fa-aefd-4796-baef-805ad1c12da6")
    BpmnEventDefinition getCompletionEventRef();

    @objid ("eea5b718-2a78-417e-80f3-4ebb716e0c52")
    void setCompletionEventRef(BpmnEventDefinition value);

    @objid ("7b58ecba-87b6-4ef4-8c7f-aeabf0d86136")
    EList<BpmnComplexBehaviorDefinition> getComplexBehaviorDefinition();

    @objid ("818c3d1e-bfdd-4c9e-9d4d-780c41a45fef")
    <T extends BpmnComplexBehaviorDefinition> List<T> getComplexBehaviorDefinition(java.lang.Class<T> filterClass);

}
