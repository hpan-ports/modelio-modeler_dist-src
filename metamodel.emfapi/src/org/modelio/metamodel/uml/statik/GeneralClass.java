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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("000bbdb4-c4bf-1fd8-97fe-001ec947cd2a")
public interface GeneralClass extends Classifier {
    @objid ("790c8cd7-7f21-41b1-a1f6-71b09d8f7ca1")
    boolean isIsElementary();

    @objid ("168a2c02-d1b1-459a-920c-b0f6c738a249")
    void setIsElementary(boolean value);

    @objid ("5e699830-eeda-48a7-9ddb-9502d72d4877")
    EList<BpmnInterface> getBpmnInterfaceRefs();

    @objid ("5835bb4f-cc03-4263-8d10-6426c50d4770")
    <T extends BpmnInterface> List<T> getBpmnInterfaceRefs(java.lang.Class<T> filterClass);

    @objid ("ec7c71d3-f4c0-438d-b786-da1f7785c490")
    EList<Parameter> getOccurence();

    @objid ("a014bd88-f3a9-46e7-84b9-1be181c88960")
    <T extends Parameter> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("94e7b597-7c23-4a32-89ec-ef77fe379461")
    ExceptionHandler getExceptionInput();

    @objid ("b4f4da1a-89d0-4996-8dd3-fc7817281c0d")
    void setExceptionInput(ExceptionHandler value);

    @objid ("b421bbfd-62a5-4086-a6e7-6ca4334c4ed0")
    EList<Attribute> getObject();

    @objid ("74f5ae89-6b97-4c9a-8ada-ff3e602a8059")
    <T extends Attribute> List<T> getObject(java.lang.Class<T> filterClass);

    @objid ("4a0b2840-6953-46fb-ba84-fbd1387aa79c")
    EList<BpmnMessage> getBpmnMessageRefs();

    @objid ("e4eaea7d-e330-468d-a7df-19599879f4f2")
    <T extends BpmnMessage> List<T> getBpmnMessageRefs(java.lang.Class<T> filterClass);

    @objid ("7fd283ae-5b15-456b-bf55-edd68662cc5a")
    EList<Signal> getSRepresentation();

    @objid ("04d25ad6-6a29-4842-a781-90a54b6ac4cc")
    <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass);

    @objid ("d844376c-831b-4c3f-9ab6-3de162c480d4")
    EList<BpmnItemDefinition> getBpmnItemDefinitionRefs();

    @objid ("9a75c29a-3ff2-46ff-b9b1-304617cb52fe")
    <T extends BpmnItemDefinition> List<T> getBpmnItemDefinitionRefs(java.lang.Class<T> filterClass);

    @objid ("179b6142-fa71-4ba8-9555-a06e987d0fdc")
    EList<ObjectNode> getOccurenceObjectNode();

    @objid ("8d2d945e-73bb-4927-8b7e-43bae92a7e0b")
    <T extends ObjectNode> List<T> getOccurenceObjectNode(java.lang.Class<T> filterClass);

    @objid ("9a4bd0e7-6d67-4fd2-9c9c-bc01cb01e866")
    EList<BpmnItemAwareElement> getBpmnItemAwareRefs();

    @objid ("94d43b78-a441-4f63-89df-fdfe58ef29cf")
    <T extends BpmnItemAwareElement> List<T> getBpmnItemAwareRefs(java.lang.Class<T> filterClass);

    @objid ("b142e1cd-58f5-485e-99cc-f075c1831205")
    EList<ModuleParameter> getOccurenceConfigParam();

    @objid ("39559e74-20f2-401b-a8b5-0845170eaef8")
    <T extends ModuleParameter> List<T> getOccurenceConfigParam(java.lang.Class<T> filterClass);

}
