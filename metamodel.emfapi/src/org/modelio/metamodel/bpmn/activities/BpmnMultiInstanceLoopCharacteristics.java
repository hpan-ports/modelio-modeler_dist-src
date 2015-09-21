/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.bpmn.activities;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnComplexBehaviorDefinition;
import org.modelio.metamodel.bpmn.activities.MultiInstanceBehavior;
import org.modelio.metamodel.bpmn.events.BpmnEventDefinition;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;

/**
 * BpmnMultiInstanceLoopCharacteristics v0.0.9054
 * 
 * 
 * null
 */
@objid ("0080f732-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnMultiInstanceLoopCharacteristics extends BpmnLoopCharacteristics {
    @objid ("ba608159-5835-45f0-a791-0d789670ab0e")
    public static final String MNAME = "BpmnMultiInstanceLoopCharacteristics";

    /**
     * Getter for attribute 'BpmnMultiInstanceLoopCharacteristics.IsSequencial'
     * 
     * Metamodel description:
     * <i>This attribute is a flag that controls whether the Activity instances will execute sequentially or in parallel.
     * 
     * If the multi-instance instances are set to be performed in parallel rather than sequential (the isSequential attribute set to false), then the lines of the marker will vertical.
     * 
     * If the multi-instance instances are set to be performed in sequence rather than parallel (the isSequential attribute set to true), then the marker will be horizontal</i>
     */
    @objid ("ac219d20-6b7f-4f3d-b8db-c1a6979733ac")
    boolean isIsSequencial();

    /**
     * Setter for attribute 'BpmnMultiInstanceLoopCharacteristics.IsSequencial'
     * 
     * Metamodel description:
     * <i>This attribute is a flag that controls whether the Activity instances will execute sequentially or in parallel.
     * 
     * If the multi-instance instances are set to be performed in parallel rather than sequential (the isSequential attribute set to false), then the lines of the marker will vertical.
     * 
     * If the multi-instance instances are set to be performed in sequence rather than parallel (the isSequential attribute set to true), then the marker will be horizontal</i>
     */
    @objid ("31e8e547-e07e-4041-a364-e2e0b2a1d293")
    void setIsSequencial(boolean value);

    /**
     * Getter for attribute 'BpmnMultiInstanceLoopCharacteristics.Behavior'
     * 
     * Metamodel description:
     * <i>The attribute behavior acts as a shortcut for specifying when events SHALL be thrown from an Activity instance that is about to complete. It can assume values of None, One, All, and Complex, resulting in the following behavior:
     * ? None: the EventDefinition which is associated through the noneEvent association will be thrown for each instance completing;
     * ? One: the EventDefinition referenced through the oneEvent association will be thrown upon the first instance completing;
     * ? All: no Event is ever thrown; a token is produced after completion of all instances
     * ? Complex: the complexBehaviorDefinitions are consulted to determine if and which Events to throw.
     * 
     * For the behaviors of none and one, a default SignalEventDefinition will be thrown which automatically carries the current runtime attributes of the MI Activity.
     * 
     * Any thrown Events can be caught by boundary Events on the MultiInstance Activity.</i>
     */
    @objid ("0ec3f5d1-e566-4102-aaa8-3072b655d0f0")
    MultiInstanceBehavior getBehavior();

    /**
     * Setter for attribute 'BpmnMultiInstanceLoopCharacteristics.Behavior'
     * 
     * Metamodel description:
     * <i>The attribute behavior acts as a shortcut for specifying when events SHALL be thrown from an Activity instance that is about to complete. It can assume values of None, One, All, and Complex, resulting in the following behavior:
     * ? None: the EventDefinition which is associated through the noneEvent association will be thrown for each instance completing;
     * ? One: the EventDefinition referenced through the oneEvent association will be thrown upon the first instance completing;
     * ? All: no Event is ever thrown; a token is produced after completion of all instances
     * ? Complex: the complexBehaviorDefinitions are consulted to determine if and which Events to throw.
     * 
     * For the behaviors of none and one, a default SignalEventDefinition will be thrown which automatically carries the current runtime attributes of the MI Activity.
     * 
     * Any thrown Events can be caught by boundary Events on the MultiInstance Activity.</i>
     */
    @objid ("88133ec2-8d7d-4b43-adfb-4a93218c7414")
    void setBehavior(MultiInstanceBehavior value);

    /**
     * Getter for attribute 'BpmnMultiInstanceLoopCharacteristics.LoopCardinality'
     * 
     * Metamodel description:
     * <i>A numeric Expression that controls the number of Activity instances that will be created. This Expression MUST evaluate to an integer.
     * This MAY be underspecified, meaning that the modeler MAY simply document the condition. In such a case the loop cannot be formally executed.
     * 
     * In order to initialize a valid multi-instance, either the loopCardinality Expression or the loopDataInput MUST be specified.</i>
     */
    @objid ("5152a429-24c1-4855-bb67-bafad78f606e")
    String getLoopCardinality();

    /**
     * Setter for attribute 'BpmnMultiInstanceLoopCharacteristics.LoopCardinality'
     * 
     * Metamodel description:
     * <i>A numeric Expression that controls the number of Activity instances that will be created. This Expression MUST evaluate to an integer.
     * This MAY be underspecified, meaning that the modeler MAY simply document the condition. In such a case the loop cannot be formally executed.
     * 
     * In order to initialize a valid multi-instance, either the loopCardinality Expression or the loopDataInput MUST be specified.</i>
     */
    @objid ("9c55e2c2-9826-49e5-9169-44b8331fde4d")
    void setLoopCardinality(String value);

    /**
     * Getter for attribute 'BpmnMultiInstanceLoopCharacteristics.CompletionCondition'
     * 
     * Metamodel description:
     * <i>This attribute defines a boolean Expression that when evaluated to true, cancels the remaining Activity instances and produces a token.</i>
     */
    @objid ("606ce14a-ba10-4c32-bc40-2ec2a078652b")
    String getCompletionCondition();

    /**
     * Setter for attribute 'BpmnMultiInstanceLoopCharacteristics.CompletionCondition'
     * 
     * Metamodel description:
     * <i>This attribute defines a boolean Expression that when evaluated to true, cancels the remaining Activity instances and produces a token.</i>
     */
    @objid ("8edeb0ee-2860-47f9-a1b0-914678a9786b")
    void setCompletionCondition(String value);

    /**
     * Getter for relation 'BpmnMultiInstanceLoopCharacteristics->LoopDataInput'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2e1c8402-d6c3-4fe4-863a-de11984a97c1")
    BpmnDataInput getLoopDataInput();

    /**
     * Setter for relation 'BpmnMultiInstanceLoopCharacteristics->LoopDataInput'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("dc359f86-d247-45dc-aae3-b44a5c7dff7c")
    void setLoopDataInput(BpmnDataInput value);

    /**
     * Getter for relation 'BpmnMultiInstanceLoopCharacteristics->LoopDataOutputRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2755e0ff-8bc6-4458-9ec7-ef97bb4c6a83")
    BpmnDataOutput getLoopDataOutputRef();

    /**
     * Setter for relation 'BpmnMultiInstanceLoopCharacteristics->LoopDataOutputRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a842fa47-b990-4651-845e-5f49faba2e92")
    void setLoopDataOutputRef(BpmnDataOutput value);

    /**
     * Getter for relation 'BpmnMultiInstanceLoopCharacteristics->CompletionEventRef'
     * 
     * Metamodel description:
     * <i>The EventDefinition which is thrown when:
     * -  behavior is set to one and the first internal Activity instance has completed,
     * - or the behavior is set to none and an internal Activity instance has completed.</i>
     */
    @objid ("a70b34af-0c91-47d8-9c77-f5026a9d781a")
    BpmnEventDefinition getCompletionEventRef();

    /**
     * Setter for relation 'BpmnMultiInstanceLoopCharacteristics->CompletionEventRef'
     * 
     * Metamodel description:
     * <i>The EventDefinition which is thrown when:
     * -  behavior is set to one and the first internal Activity instance has completed,
     * - or the behavior is set to none and an internal Activity instance has completed.</i>
     */
    @objid ("e4836b40-06d1-4d38-be0a-192d6f00c42b")
    void setCompletionEventRef(BpmnEventDefinition value);

    /**
     * Getter for relation 'BpmnMultiInstanceLoopCharacteristics->ComplexBehaviorDefinition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7636d64a-ac16-444d-9566-4929e9bf129a")
    EList<BpmnComplexBehaviorDefinition> getComplexBehaviorDefinition();

    /**
     * Filtered Getter for relation 'BpmnMultiInstanceLoopCharacteristics->ComplexBehaviorDefinition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("684420c5-dadc-4cf1-9235-6a13999e6e68")
    <T extends BpmnComplexBehaviorDefinition> List<T> getComplexBehaviorDefinition(java.lang.Class<T> filterClass);

}
