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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Parameter;

/**
 * GeneralClass v0.0.9054
 * 
 * 
 * A GeneralClass is an elaborated Classifier.  It belongs to its NameSpace.
 */
@objid ("000bbdb4-c4bf-1fd8-97fe-001ec947cd2a")
public interface GeneralClass extends Classifier {
    @objid ("e117e334-e947-4991-8595-3bacf7a52f20")
    public static final String MNAME = "GeneralClass";

    /**
     * Getter for attribute 'GeneralClass.IsElementary'
     * 
     * Metamodel description:
     * <i>Determines whether a Class is elementary/primitive or not. A Class is primitive if its value cannot be broken down and its instances are not handled by the application. For example, integer and boolean are elementary Classes, whereas Human or Device are generally not.</i>
     */
    @objid ("d8e3e457-b83f-44eb-bcdb-0efe0a6cfe7b")
    boolean isIsElementary();

    /**
     * Setter for attribute 'GeneralClass.IsElementary'
     * 
     * Metamodel description:
     * <i>Determines whether a Class is elementary/primitive or not. A Class is primitive if its value cannot be broken down and its instances are not handled by the application. For example, integer and boolean are elementary Classes, whereas Human or Device are generally not.</i>
     */
    @objid ("b26c1ce7-5e5c-4bd3-b6e7-a54d18ee63bb")
    void setIsElementary(boolean value);

    /**
     * Getter for relation 'GeneralClass->BpmnInterfaceRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("520fec70-c888-4de2-8ca5-de190be1dc46")
    EList<BpmnInterface> getBpmnInterfaceRefs();

    /**
     * Filtered Getter for relation 'GeneralClass->BpmnInterfaceRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3cde7896-1951-40ff-84db-f8a4aef4fedb")
    <T extends BpmnInterface> List<T> getBpmnInterfaceRefs(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'GeneralClass->Occurence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("928526e9-0dd9-4268-8ca6-1164c1deacaa")
    EList<Parameter> getOccurence();

    /**
     * Filtered Getter for relation 'GeneralClass->Occurence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("82659af8-d1c3-4f1f-9c64-4ab60cef46b2")
    <T extends Parameter> List<T> getOccurence(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'GeneralClass->ExceptionInput'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6b0f595f-6952-4f22-a77e-9c64e185de43")
    ExceptionHandler getExceptionInput();

    /**
     * Setter for relation 'GeneralClass->ExceptionInput'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("badabf33-4d08-4124-aee6-e71660e4d073")
    void setExceptionInput(ExceptionHandler value);

    /**
     * Getter for relation 'GeneralClass->Object'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("94a334f1-1ff2-40df-8cab-215bb9737503")
    EList<Attribute> getObject();

    /**
     * Filtered Getter for relation 'GeneralClass->Object'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0e1ad77a-26b0-47bc-b979-3df731a3923a")
    <T extends Attribute> List<T> getObject(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'GeneralClass->BpmnMessageRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c4d2fb3a-488a-4e25-b160-22f484662712")
    EList<BpmnMessage> getBpmnMessageRefs();

    /**
     * Filtered Getter for relation 'GeneralClass->BpmnMessageRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c56f2cff-2b86-416a-a9de-1ffd8e1622b3")
    <T extends BpmnMessage> List<T> getBpmnMessageRefs(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'GeneralClass->SRepresentation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("86566b42-beff-4bdb-9cb5-58658715cdb5")
    EList<Signal> getSRepresentation();

    /**
     * Filtered Getter for relation 'GeneralClass->SRepresentation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4bc4e8d6-a8c8-4eb7-8beb-6151415cef6f")
    <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'GeneralClass->BpmnItemDefinitionRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8daaf7dd-272c-48b9-945c-a364539a63aa")
    EList<BpmnItemDefinition> getBpmnItemDefinitionRefs();

    /**
     * Filtered Getter for relation 'GeneralClass->BpmnItemDefinitionRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("67ca213a-1617-42d3-a865-61a6b3ef94c1")
    <T extends BpmnItemDefinition> List<T> getBpmnItemDefinitionRefs(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'GeneralClass->OccurenceObjectNode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("68162490-eec9-4ad7-b12e-112d84da59e9")
    EList<ObjectNode> getOccurenceObjectNode();

    /**
     * Filtered Getter for relation 'GeneralClass->OccurenceObjectNode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4d088164-bcb7-4315-a683-546e816b5853")
    <T extends ObjectNode> List<T> getOccurenceObjectNode(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'GeneralClass->BpmnItemAwareRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e0e39514-7f49-4ce3-b2c7-2efea2472f84")
    EList<BpmnItemAwareElement> getBpmnItemAwareRefs();

    /**
     * Filtered Getter for relation 'GeneralClass->BpmnItemAwareRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0db13b41-dcc8-4e40-a7f5-f76e9b1152fa")
    <T extends BpmnItemAwareElement> List<T> getBpmnItemAwareRefs(java.lang.Class<T> filterClass);

}
