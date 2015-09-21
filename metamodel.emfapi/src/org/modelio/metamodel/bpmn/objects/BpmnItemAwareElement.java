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
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;

/**
 * BpmnItemAwareElement v0.0.9054
 * 
 * 
 * Several elements in BPMN are subject to store or convey items during process execution. These elements are referenced generally as ?item-aware elements.? This is similar to the variable construct common to many languages. As with variables, these elements have a ItemDefinition.
 * The data structure these elements hold is specified using an associated ItemDefinition. An item-aware element may be underspecified, meaning that the structure attribute of its ItemDefinition is optional if the modeler does not wish to define the structure of the associated data.
 * 
 * Ownership
 * An ItemAwareElement belongs to a Flow Element COntainer or a SubProcess.
 */
@objid ("0006fc34-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnItemAwareElement extends BpmnFlowElement {
    @objid ("5074bc98-1450-4c82-b9c2-e6df32c44312")
    public static final String MNAME = "BpmnItemAwareElement";

    /**
     * Getter for relation 'BpmnItemAwareElement->Type'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("80306fd3-8323-4848-84c9-8b7d4880c4f0")
    GeneralClass getType();

    /**
     * Setter for relation 'BpmnItemAwareElement->Type'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7b81d6b9-3524-4f80-8b7e-696168c0bc2c")
    void setType(GeneralClass value);

    /**
     * Getter for relation 'BpmnItemAwareElement->TargetOfDataAssociation'
     * 
     * Metamodel description:
     * <i>Data associations that computes the value of this element.</i>
     */
    @objid ("11d2d7f3-a7dc-4a11-b00c-68dc300ba8fa")
    EList<BpmnDataAssociation> getTargetOfDataAssociation();

    /**
     * Filtered Getter for relation 'BpmnItemAwareElement->TargetOfDataAssociation'
     * 
     * Metamodel description:
     * <i>Data associations that computes the value of this element.</i>
     */
    @objid ("1345886c-3c06-4ac0-9d4d-8f941f2ce766")
    <T extends BpmnDataAssociation> List<T> getTargetOfDataAssociation(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnItemAwareElement->ItemSubjectRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7eac40e4-9cf9-48f0-830d-fd07c364864d")
    BpmnItemDefinition getItemSubjectRef();

    /**
     * Setter for relation 'BpmnItemAwareElement->ItemSubjectRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4338a8f7-724d-40b9-a6b8-f21e239fac66")
    void setItemSubjectRef(BpmnItemDefinition value);

    /**
     * Getter for relation 'BpmnItemAwareElement->InState'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8cd08b30-74a9-4968-8e22-6843ed429353")
    State getInState();

    /**
     * Setter for relation 'BpmnItemAwareElement->InState'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("35e4960a-4545-40d8-96c1-600f497f431f")
    void setInState(State value);

    /**
     * Getter for relation 'BpmnItemAwareElement->RepresentedAssociationEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("df280b7c-93bd-4608-8bdc-233855b6f117")
    AssociationEnd getRepresentedAssociationEnd();

    /**
     * Setter for relation 'BpmnItemAwareElement->RepresentedAssociationEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("54ec5342-8a84-4c7f-b57d-de8f12c56c8d")
    void setRepresentedAssociationEnd(AssociationEnd value);

    /**
     * Getter for relation 'BpmnItemAwareElement->DataState'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("532c00a6-b5bb-4e1d-92fd-320e038ab3b2")
    BpmnDataState getDataState();

    /**
     * Setter for relation 'BpmnItemAwareElement->DataState'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("25f947b2-1e67-4e93-b54e-4c5bdcca899e")
    void setDataState(BpmnDataState value);

    /**
     * Getter for relation 'BpmnItemAwareElement->SourceOfDataAssociation'
     * 
     * Metamodel description:
     * <i>Data associations that use this element to compute a value.</i>
     */
    @objid ("30eed4e3-3917-4be5-8f17-5f6859fd4f17")
    EList<BpmnDataAssociation> getSourceOfDataAssociation();

    /**
     * Filtered Getter for relation 'BpmnItemAwareElement->SourceOfDataAssociation'
     * 
     * Metamodel description:
     * <i>Data associations that use this element to compute a value.</i>
     */
    @objid ("82fa46cb-d3b8-4631-9a8e-34547190e79f")
    <T extends BpmnDataAssociation> List<T> getSourceOfDataAssociation(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnItemAwareElement->RepresentedAttribute'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a514268a-4f1e-4d9a-8ae8-7629bf4bdd52")
    Attribute getRepresentedAttribute();

    /**
     * Setter for relation 'BpmnItemAwareElement->RepresentedAttribute'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4d8c62ef-22fd-42a2-993d-38d23e4fbaad")
    void setRepresentedAttribute(Attribute value);

    /**
     * Getter for relation 'BpmnItemAwareElement->RepresentedInstance'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("28714a05-9b65-47d1-b1e9-2983cf9a2df8")
    Instance getRepresentedInstance();

    /**
     * Setter for relation 'BpmnItemAwareElement->RepresentedInstance'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("27286f78-bc9f-428a-9f38-1cc8228a137a")
    void setRepresentedInstance(Instance value);

}
