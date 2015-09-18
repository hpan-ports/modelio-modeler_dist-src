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
package org.modelio.metamodel.bpmn.objects;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnItemKind;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("0007a24c-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnItemDefinition extends BpmnRootElement {
    @objid ("4ab97c59-e48a-439a-b3e2-7cfdf8b672ec")
    BpmnItemKind getItemKind();

    @objid ("31e4e747-208e-41cf-88f7-01b6690c2fc9")
    void setItemKind(BpmnItemKind value);

    @objid ("4974e761-d9c3-4c2c-97ce-355f18ea7f68")
    boolean isIsCollection();

    @objid ("4d2ee667-6e43-4a6c-9532-55d479d4d3f1")
    void setIsCollection(boolean value);

    @objid ("3e5c9265-fb12-4862-8bd3-434171333cb7")
    GeneralClass getStructureRef();

    @objid ("29bf46d3-3a7e-4503-a0bd-005cc627a74c")
    void setStructureRef(GeneralClass value);

    @objid ("646f3404-5eb1-4d93-b32d-582979490ce4")
    EList<BpmnMessage> getTypedMessage();

    @objid ("73d27c66-7df2-432a-961d-a1ecc28339eb")
    <T extends BpmnMessage> List<T> getTypedMessage(java.lang.Class<T> filterClass);

    @objid ("9dbf464b-1d1d-4c10-9cb7-69ac19935ae8")
    EList<BpmnItemAwareElement> getTypedItem();

    @objid ("afbfbbcb-a74d-4d01-a3bb-3794764ba694")
    <T extends BpmnItemAwareElement> List<T> getTypedItem(java.lang.Class<T> filterClass);

    @objid ("489887b1-09ce-4b5b-826f-d8d0493f3466")
    EList<BpmnResourceParameter> getTypedResourceParameter();

    @objid ("24608941-a411-45c8-905a-48ca904f7009")
    <T extends BpmnResourceParameter> List<T> getTypedResourceParameter(java.lang.Class<T> filterClass);

}
