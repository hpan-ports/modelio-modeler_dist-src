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
import org.modelio.metamodel.bpmn.activities.BpmnLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.bpmn.events.BpmnCompensateEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;

@objid ("007d712a-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnActivity extends BpmnFlowNode {
    @objid ("794c7b7c-8db1-4c1e-ad4a-d3d5748c270c")
    boolean isIsForCompensation();

    @objid ("8448aa97-4e25-40de-9ff7-eade51c9403c")
    void setIsForCompensation(boolean value);

    @objid ("acf0da6d-ba74-482b-b167-1e60bd6d62df")
    int getStartQuantity();

    @objid ("f9d17fbb-c200-4d31-9689-58b59bbb4423")
    void setStartQuantity(int value);

    @objid ("951ab38d-2fe5-4e88-932e-ffba3b104ec0")
    int getCompletionQuantity();

    @objid ("c225d8aa-e60e-4e37-9541-8284c45875b6")
    void setCompletionQuantity(int value);

    @objid ("31bd1caf-5a99-40fa-a508-6382496e8ee0")
    EList<BpmnCompensateEventDefinition> getCompensateEventDefinitions();

    @objid ("2d49f26d-7d0c-4d11-a223-49083ba1f720")
    <T extends BpmnCompensateEventDefinition> List<T> getCompensateEventDefinitions(java.lang.Class<T> filterClass);

    @objid ("766e990d-6158-49d7-b348-7d9a51915856")
    EList<BpmnDataInput> getInputSpecification();

    @objid ("838d0165-9575-4061-969d-7dd75ef24084")
    <T extends BpmnDataInput> List<T> getInputSpecification(java.lang.Class<T> filterClass);

    @objid ("a90a44d4-3db0-4028-b94b-894d8bf632c1")
    EList<BpmnDataAssociation> getDataInputAssociation();

    @objid ("9296d519-ef4e-4837-a056-fdc067910a2d")
    <T extends BpmnDataAssociation> List<T> getDataInputAssociation(java.lang.Class<T> filterClass);

    @objid ("44aebb09-2544-4466-9c90-338ebea178e0")
    EList<BpmnDataOutput> getOutputSpecification();

    @objid ("68244410-5422-456a-b8d0-fb5ba3dc8cf7")
    <T extends BpmnDataOutput> List<T> getOutputSpecification(java.lang.Class<T> filterClass);

    @objid ("52cb8635-075c-4326-9daf-84cc1f59655a")
    BpmnLoopCharacteristics getLoopCharacteristics();

    @objid ("b14eb060-1151-4e4e-bbe9-a70bda126d75")
    void setLoopCharacteristics(BpmnLoopCharacteristics value);

    @objid ("b0db4853-9e32-4517-a375-851050b50ecf")
    EList<BpmnBoundaryEvent> getBoundaryEventRef();

    @objid ("284d3e38-77d7-4ef3-a283-db1cdc975df1")
    <T extends BpmnBoundaryEvent> List<T> getBoundaryEventRef(java.lang.Class<T> filterClass);

    @objid ("00ada9f5-281a-4754-968a-bc75a4a97621")
    EList<BpmnDataAssociation> getDataOutputAssociation();

    @objid ("be2a9688-8def-4f82-ad04-68c18d131254")
    <T extends BpmnDataAssociation> List<T> getDataOutputAssociation(java.lang.Class<T> filterClass);

    @objid ("8dc5505b-8f48-4641-8692-a77667d21f12")
    BpmnSequenceFlow getDefaultFlow();

    @objid ("29e99ce8-9500-4d39-9650-f01ccaf511fc")
    void setDefaultFlow(BpmnSequenceFlow value);

}
