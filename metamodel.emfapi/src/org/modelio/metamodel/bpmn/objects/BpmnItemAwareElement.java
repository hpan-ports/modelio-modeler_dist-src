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
package org.modelio.metamodel.bpmn.objects;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("0006fc34-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnItemAwareElement extends BpmnFlowElement {
    @objid ("0b8caea1-e613-4e5c-895c-042125be8d75")
    GeneralClass getType();

    @objid ("f0d2ece6-005d-4d34-851e-ae582fbf13a3")
    void setType(GeneralClass value);

    @objid ("1367b123-2def-475a-8033-558fc692aa93")
    EList<BpmnDataAssociation> getTargetOfDataAssociation();

    @objid ("efb7c221-d73f-4f37-8eb8-7e728ed4fc92")
    <T extends BpmnDataAssociation> List<T> getTargetOfDataAssociation(java.lang.Class<T> filterClass);

    @objid ("23e4f489-0fc4-414b-a669-67323701d3c9")
    BpmnItemDefinition getItemSubjectRef();

    @objid ("c5b76a16-a0a2-46ce-9b99-3003a61be53f")
    void setItemSubjectRef(BpmnItemDefinition value);

    @objid ("b2635ad9-9b1d-470d-bc9d-f2dc761b8947")
    State getInState();

    @objid ("cfedb569-5eba-431a-ae12-225106868452")
    void setInState(State value);

    @objid ("ddf7ca54-b47c-4d10-a426-95c89d574c42")
    AssociationEnd getRepresentedAssociationEnd();

    @objid ("a684a960-9374-4ee6-8f9d-bd18dd7f77af")
    void setRepresentedAssociationEnd(AssociationEnd value);

    @objid ("9fb824cf-d72e-4413-a123-5503c694ab78")
    BpmnDataState getDataState();

    @objid ("f03356f0-fa99-4c05-825a-d0673002b229")
    void setDataState(BpmnDataState value);

    @objid ("5330aaad-c543-4ff9-8e31-44cc43ea3a85")
    EList<BpmnDataAssociation> getSourceOfDataAssociation();

    @objid ("5cdc2d37-8cfd-454e-a8ec-d197261e3f4b")
    <T extends BpmnDataAssociation> List<T> getSourceOfDataAssociation(java.lang.Class<T> filterClass);

    @objid ("611a43c7-7af7-45a5-b4eb-807021d54a8a")
    Attribute getRepresentedAttribute();

    @objid ("24323b5e-4ae0-4c0b-a0f0-10c4eb5a899c")
    void setRepresentedAttribute(Attribute value);

    @objid ("d8a7cf6a-7f3e-4699-8557-97a26021f35d")
    Instance getRepresentedInstance();

    @objid ("a57855c4-a5c4-4916-949f-90a07c46bc9a")
    void setRepresentedInstance(Instance value);

}
