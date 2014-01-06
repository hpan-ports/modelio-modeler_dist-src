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
    @objid ("df536398-820c-46f5-8f06-1baea10ffa35")
    boolean isIsElementary();

    @objid ("512d105a-7e05-4d11-9961-3aadd35d4bfd")
    void setIsElementary(boolean value);

    @objid ("69c26814-e59f-44b8-861e-8a2658edaf5a")
    EList<BpmnInterface> getBpmnInterfaceRefs();

    @objid ("3618ad0f-ac8e-4dbd-aeb3-f0bf069a4e3d")
    <T extends BpmnInterface> List<T> getBpmnInterfaceRefs(java.lang.Class<T> filterClass);

    @objid ("59736621-b22b-4f01-ae9d-7c3bd1f4daf4")
    EList<Parameter> getOccurence();

    @objid ("af830714-9800-4703-8022-14e21562d649")
    <T extends Parameter> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("ded4fddc-cb6a-4973-8adf-bb7fabef6c9a")
    ExceptionHandler getExceptionInput();

    @objid ("9827bad4-3299-422b-aa98-925a16b38f32")
    void setExceptionInput(ExceptionHandler value);

    @objid ("ffecfa6a-308d-4ba7-a621-18028de64189")
    EList<Attribute> getObject();

    @objid ("d54c9264-d8c4-44bf-b946-77432d734100")
    <T extends Attribute> List<T> getObject(java.lang.Class<T> filterClass);

    @objid ("2c27b0de-52d3-4416-a3b9-7fef57737e97")
    EList<BpmnMessage> getBpmnMessageRefs();

    @objid ("9bdd9bf1-8c89-4545-bb32-effa396d61c5")
    <T extends BpmnMessage> List<T> getBpmnMessageRefs(java.lang.Class<T> filterClass);

    @objid ("65dea302-d9c9-457d-9cea-95f8c90271fc")
    EList<Signal> getSRepresentation();

    @objid ("9db88a87-a7e4-4b4b-9c8a-7a49d3cdbde6")
    <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass);

    @objid ("8ed3e7e1-61a7-4848-90e2-76edc0918cb9")
    EList<BpmnItemDefinition> getBpmnItemDefinitionRefs();

    @objid ("9747b94c-a50a-4805-9df5-3360d35f8898")
    <T extends BpmnItemDefinition> List<T> getBpmnItemDefinitionRefs(java.lang.Class<T> filterClass);

    @objid ("bc1b4a60-3f2d-4e2a-bbac-fc371d6c00ce")
    EList<ObjectNode> getOccurenceObjectNode();

    @objid ("dcd86504-9d61-4da0-856c-499d7442242b")
    <T extends ObjectNode> List<T> getOccurenceObjectNode(java.lang.Class<T> filterClass);

    @objid ("9efe30b0-1537-4e65-bfc6-800fa0cdad9d")
    EList<BpmnItemAwareElement> getBpmnItemAwareRefs();

    @objid ("41a36d25-85a2-42c8-9310-a299f7c3f498")
    <T extends BpmnItemAwareElement> List<T> getBpmnItemAwareRefs(java.lang.Class<T> filterClass);

    @objid ("e40221db-60c4-4106-8091-5b2a8b699f57")
    EList<ModuleParameter> getOccurenceConfigParam();

    @objid ("1023fc0b-4262-4836-b6cc-0b81f07639de")
    <T extends ModuleParameter> List<T> getOccurenceConfigParam(java.lang.Class<T> filterClass);

}
