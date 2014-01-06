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
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;

@objid ("000d46d4-c4bf-1fd8-97fe-001ec947cd2a")
public interface Instance extends ModelElement {
    @objid ("b2f6f8b3-47bf-448b-a566-f6fdb6eafc88")
    boolean isIsConstant();

    @objid ("100aca8c-4079-49ea-8f0a-17437ebdccbb")
    void setIsConstant(boolean value);

    @objid ("ebb45117-0f17-423f-b119-472aacfcd2af")
    String getMultiplicityMin();

    @objid ("bc0a85aa-1ac9-4ca4-9fcf-08f5a36ad29a")
    void setMultiplicityMin(String value);

    @objid ("ded2ac46-be40-45f7-b3bc-fa3367bfea17")
    String getMultiplicityMax();

    @objid ("3e627e43-e0ef-4a10-bfe3-b2ebda170033")
    void setMultiplicityMax(String value);

    @objid ("566f9549-f17e-48bf-b981-ac0965a9b977")
    String getValue();

    @objid ("3df50aee-afca-4b0e-b5bd-4346479860e5")
    void setValue(String value);

    @objid ("688526bb-d71b-4289-9353-a4c1520d9509")
    EList<CommunicationNode> getRepresentedCommunicationNode();

    @objid ("def712df-8320-44c1-b754-0e6c3f2227fb")
    <T extends CommunicationNode> List<T> getRepresentedCommunicationNode(java.lang.Class<T> filterClass);

    @objid ("adb61b9a-c9a7-428f-84d0-5d0ad0f0957b")
    EList<BpmnItemAwareElement> getRepresentingItem();

    @objid ("9c1b3f13-5c6b-400c-8f7c-9382f0c6f2a3")
    <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass);

    @objid ("bffce6aa-f9ac-4527-b9a3-6c5193861b21")
    EList<LinkEnd> getOwnedEnd();

    @objid ("744ec779-a522-4141-90cb-919fb1089230")
    <T extends LinkEnd> List<T> getOwnedEnd(java.lang.Class<T> filterClass);

    @objid ("d610e95b-f9a5-42b2-832a-76b9e4eeeba3")
    NameSpace getBase();

    @objid ("00717f56-907a-4b9e-8683-1fe7da7429e8")
    void setBase(NameSpace value);

    @objid ("5be0b95f-00c0-42cd-bc48-ccbff9815ff1")
    EList<ObjectNode> getRepresentingObjectNode();

    @objid ("637d9fb1-faa5-4b1b-87dc-4cb6fc0dc1c3")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    @objid ("2ec781a2-928a-4f77-8bbb-7f8ddfcb4532")
    NameSpace getOwner();

    @objid ("fa75e38f-5ed8-4da5-a795-4fa201525264")
    void setOwner(NameSpace value);

    @objid ("74b99b17-6069-4ae4-b945-e81b4f3614bd")
    EList<NaryLinkEnd> getOwnedNaryEnd();

    @objid ("56d2b1a5-37c2-406c-a8df-96b2ec6d5549")
    <T extends NaryLinkEnd> List<T> getOwnedNaryEnd(java.lang.Class<T> filterClass);

    @objid ("0735e740-9d10-4f2d-9f98-ec0d1b17a826")
    EList<Lifeline> getRepresentedLifeLine();

    @objid ("44830cc7-19a6-47eb-a82a-502d2403b971")
    <T extends Lifeline> List<T> getRepresentedLifeLine(java.lang.Class<T> filterClass);

    @objid ("c0e50ff3-93d0-4043-8d13-f46faff4d94f")
    EList<AttributeLink> getSlot();

    @objid ("f38336e8-1a75-43bf-b443-2e181f62a29a")
    <T extends AttributeLink> List<T> getSlot(java.lang.Class<T> filterClass);

    @objid ("5fc0e27a-16b4-41ae-aa89-5a259ee2e09b")
    EList<BindableInstance> getPart();

    @objid ("202609c1-f80a-403c-bbfd-61dd8aa3493d")
    <T extends BindableInstance> List<T> getPart(java.lang.Class<T> filterClass);

    @objid ("b8d4ca47-5b4d-4260-b9a4-e607d07dd94e")
    EList<LinkEnd> getTargetingEnd();

    @objid ("9a502c6d-26ad-4ea8-9d31-51028d36eef3")
    <T extends LinkEnd> List<T> getTargetingEnd(java.lang.Class<T> filterClass);

}
