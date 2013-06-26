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
    @objid ("4564f209-0022-4bd1-bb8c-42d8040cd140")
    boolean isIsElementary();

    @objid ("0ef65b9f-ed7b-4d25-a169-9b5e42483739")
    void setIsElementary(boolean value);

    @objid ("a09da7ce-463b-48ec-9f90-86e09129e4a8")
    EList<BpmnInterface> getBpmnInterfaceRefs();

    @objid ("261f1b33-c5d2-496f-ae1e-897433dcd2a7")
    <T extends BpmnInterface> List<T> getBpmnInterfaceRefs(java.lang.Class<T> filterClass);

    @objid ("231eeb27-9072-4f91-a919-9b4a143a071b")
    EList<Parameter> getOccurence();

    @objid ("bda7c9b3-4491-460c-a851-ead9a13e1ff3")
    <T extends Parameter> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("91c0d91d-e4e8-4549-b333-2e2ea46ff51c")
    ExceptionHandler getExceptionInput();

    @objid ("7a862fcb-2cc5-45a8-96fc-5d599054d0a6")
    void setExceptionInput(ExceptionHandler value);

    @objid ("93328eb5-c575-4fa1-ae62-59db0683b308")
    EList<Attribute> getObject();

    @objid ("8b199025-b531-4165-8946-ea60f859eb14")
    <T extends Attribute> List<T> getObject(java.lang.Class<T> filterClass);

    @objid ("5913b27c-3143-4f07-b72c-60a20f19e75b")
    EList<BpmnMessage> getBpmnMessageRefs();

    @objid ("1faeed11-ac0a-4085-beb0-2fd4a8b630c9")
    <T extends BpmnMessage> List<T> getBpmnMessageRefs(java.lang.Class<T> filterClass);

    @objid ("eac27a34-bc35-454f-997b-1ab96c6f818b")
    EList<Signal> getSRepresentation();

    @objid ("1985fe37-2d0f-4bc7-83fb-4ffa33d2dfc9")
    <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass);

    @objid ("1134edbe-8998-4908-8bea-a536b9dac490")
    EList<BpmnItemDefinition> getBpmnItemDefinitionRefs();

    @objid ("509adb73-9ab5-45b5-8d89-85c9d8f6d4e1")
    <T extends BpmnItemDefinition> List<T> getBpmnItemDefinitionRefs(java.lang.Class<T> filterClass);

    @objid ("52c6a0da-2d08-4ab4-b3b8-235be5f1a478")
    EList<ObjectNode> getOccurenceObjectNode();

    @objid ("23fdaa16-3e66-44af-aab0-547c4775e618")
    <T extends ObjectNode> List<T> getOccurenceObjectNode(java.lang.Class<T> filterClass);

    @objid ("89f86476-e204-4534-961a-6cfc379f83e9")
    EList<BpmnItemAwareElement> getBpmnItemAwareRefs();

    @objid ("e58986d7-7a84-45c5-b734-67c545f55dba")
    <T extends BpmnItemAwareElement> List<T> getBpmnItemAwareRefs(java.lang.Class<T> filterClass);

    @objid ("055b4b0f-835e-466e-8c46-4413e22623cf")
    EList<ModuleParameter> getOccurenceConfigParam();

    @objid ("cbf35aba-e754-47b0-bddd-eccfeb7a2250")
    <T extends ModuleParameter> List<T> getOccurenceConfigParam(java.lang.Class<T> filterClass);

}
