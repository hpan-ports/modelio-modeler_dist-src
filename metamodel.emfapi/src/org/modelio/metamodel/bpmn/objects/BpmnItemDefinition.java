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
package org.modelio.metamodel.bpmn.objects;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnItemKind;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.uml.statik.GeneralClass;

/**
 * BpmnItemDefinition v0.0.9054
 * 
 * 
 * null
 */
@objid ("0007a24c-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnItemDefinition extends BpmnRootElement {
    @objid ("48fb5908-882e-4755-901d-ca69e1a9270d")
    public static final String MNAME = "BpmnItemDefinition";

    /**
     * Getter for attribute 'BpmnItemDefinition.ItemKind'
     * 
     * Metamodel description:
     * <i>This defines the nature of the Item. Possible values are physical or 
     * information. The default value is information.</i>
     */
    @objid ("93ba5a10-6559-472b-a5c2-44ae96c65735")
    BpmnItemKind getItemKind();

    /**
     * Setter for attribute 'BpmnItemDefinition.ItemKind'
     * 
     * Metamodel description:
     * <i>This defines the nature of the Item. Possible values are physical or 
     * information. The default value is information.</i>
     */
    @objid ("3a97703c-aa72-413b-a4f7-2387b8e8872b")
    void setItemKind(BpmnItemKind value);

    /**
     * Getter for attribute 'BpmnItemDefinition.IsCollection'
     * 
     * Metamodel description:
     * <i>Setting this flag to true indicates that the actual data type is a 
     * collection.</i>
     */
    @objid ("66e23ae5-2d6d-4fc0-8fb8-43308ec18579")
    boolean isIsCollection();

    /**
     * Setter for attribute 'BpmnItemDefinition.IsCollection'
     * 
     * Metamodel description:
     * <i>Setting this flag to true indicates that the actual data type is a 
     * collection.</i>
     */
    @objid ("3fd76544-62e7-47e2-8228-848315bb3654")
    void setIsCollection(boolean value);

    /**
     * Getter for relation 'BpmnItemDefinition->StructureRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("563d9256-425d-46a6-953f-5d3fa31e5462")
    GeneralClass getStructureRef();

    /**
     * Setter for relation 'BpmnItemDefinition->StructureRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a61e98e8-a0a7-4381-9b99-17a7ee96d7fd")
    void setStructureRef(GeneralClass value);

    /**
     * Getter for relation 'BpmnItemDefinition->TypedMessage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d34d187a-1c2b-4609-bbad-03f6a05dc2dc")
    EList<BpmnMessage> getTypedMessage();

    /**
     * Filtered Getter for relation 'BpmnItemDefinition->TypedMessage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0ee4831c-0217-4513-a9ec-7caaafb98d50")
    <T extends BpmnMessage> List<T> getTypedMessage(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnItemDefinition->TypedItem'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bd59d102-ccb2-43a6-bd46-fa908b102027")
    EList<BpmnItemAwareElement> getTypedItem();

    /**
     * Filtered Getter for relation 'BpmnItemDefinition->TypedItem'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d1b1406b-7d6e-4bd4-b159-5de9cce4a5e7")
    <T extends BpmnItemAwareElement> List<T> getTypedItem(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnItemDefinition->TypedResourceParameter'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7fdc79a6-524b-4e7f-9fda-2778258db47e")
    EList<BpmnResourceParameter> getTypedResourceParameter();

    /**
     * Filtered Getter for relation 'BpmnItemDefinition->TypedResourceParameter'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e93c6d15-335e-45cc-8cf2-862ae4e80ade")
    <T extends BpmnResourceParameter> List<T> getTypedResourceParameter(java.lang.Class<T> filterClass);

}
