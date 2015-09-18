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
    @objid ("6ad3022f-26fe-48bc-8b99-77ecafde6783")
    boolean isIsConstant();

    @objid ("9fecc8fd-0595-4de6-b064-dda40da85054")
    void setIsConstant(boolean value);

    @objid ("e9fc928f-6801-4776-99a6-42f3ede8f1b4")
    String getMultiplicityMin();

    @objid ("16ee5613-1382-40b1-a95e-0990fb4c886d")
    void setMultiplicityMin(String value);

    @objid ("57837fe6-5c91-4fa1-bb7d-31192dda8e1b")
    String getMultiplicityMax();

    @objid ("78501c63-67d6-49de-91b3-1712d6488c60")
    void setMultiplicityMax(String value);

    @objid ("8e30755e-c168-4f05-af26-78a7cf3ad809")
    String getValue();

    @objid ("4e1ef86e-2506-4c4c-ab39-8cfc5b06394d")
    void setValue(String value);

    @objid ("420e7a63-06d7-4a68-90de-12e93b8fb904")
    EList<CommunicationNode> getRepresentedCommunicationNode();

    @objid ("710743c5-534c-48ea-a267-1169481ece38")
    <T extends CommunicationNode> List<T> getRepresentedCommunicationNode(java.lang.Class<T> filterClass);

    @objid ("372b730e-97fe-4afe-bee7-e64a8415bf24")
    EList<BpmnItemAwareElement> getRepresentingItem();

    @objid ("c318b7f4-faa5-4c03-80c3-a4ad4287dfd1")
    <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass);

    @objid ("cdc82f5d-ece3-4fde-8be7-e39ed4e066ce")
    EList<LinkEnd> getOwnedEnd();

    @objid ("4aae413f-3469-446e-b5c8-c2bb75d53fe3")
    <T extends LinkEnd> List<T> getOwnedEnd(java.lang.Class<T> filterClass);

    @objid ("bc3a0310-6783-4950-8c61-f99a3b8e6666")
    NameSpace getBase();

    @objid ("c8d4d103-4289-4794-af88-bbcea5eddf88")
    void setBase(NameSpace value);

    @objid ("c4d9a8db-c0fb-424e-9640-f4270092eb4f")
    EList<ObjectNode> getRepresentingObjectNode();

    @objid ("0245dd31-ce68-4513-b152-59191a9f4a91")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    @objid ("616fb36c-5f46-4b7f-aabc-5b843995672f")
    NameSpace getOwner();

    @objid ("97f25ac8-c057-4033-9037-97c981d5b048")
    void setOwner(NameSpace value);

    @objid ("b4ff098e-ad70-4dac-9a54-315935049e87")
    EList<NaryLinkEnd> getOwnedNaryEnd();

    @objid ("fb9aaa0a-687f-4d65-8cb6-2c15b390e0f5")
    <T extends NaryLinkEnd> List<T> getOwnedNaryEnd(java.lang.Class<T> filterClass);

    @objid ("3211f2e9-ed40-4f5b-b476-6c4c2cb9904c")
    EList<Lifeline> getRepresentedLifeLine();

    @objid ("50f1d625-d9cb-434e-a7bc-bdb384f2aa98")
    <T extends Lifeline> List<T> getRepresentedLifeLine(java.lang.Class<T> filterClass);

    @objid ("b26c3af7-19d6-4735-9b7b-40eeb422314f")
    EList<AttributeLink> getSlot();

    @objid ("25ec6173-a0b5-431a-97c6-cf081e39393c")
    <T extends AttributeLink> List<T> getSlot(java.lang.Class<T> filterClass);

    @objid ("214299a0-5a3f-4af1-9890-91c92eb9ffb5")
    EList<BindableInstance> getPart();

    @objid ("9dd6f109-bf00-4e4d-9d32-216bef28c342")
    <T extends BindableInstance> List<T> getPart(java.lang.Class<T> filterClass);

    @objid ("bffdba71-b2b8-42e4-b304-be8c49ee1a5e")
    EList<LinkEnd> getTargetingEnd();

    @objid ("37a8c9e6-177f-4d1f-8f37-a706e2191357")
    <T extends LinkEnd> List<T> getTargetingEnd(java.lang.Class<T> filterClass);

}
