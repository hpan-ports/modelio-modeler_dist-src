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
    @objid ("88446e08-f1e1-47a8-8277-8c11433838c3")
    boolean isIsConstant();

    @objid ("5b0e2f03-ab1f-41fa-b023-6a59ee2e5a63")
    void setIsConstant(boolean value);

    @objid ("d15cd599-c865-477b-bed8-070eee033a11")
    String getMultiplicityMin();

    @objid ("aadfa6c1-5589-4e2a-bb88-5f3efcba90dc")
    void setMultiplicityMin(String value);

    @objid ("27ba86bc-adec-4102-9bf9-7a391eb79c61")
    String getMultiplicityMax();

    @objid ("0b5f6414-3c49-4431-918a-252fc1a2f3ce")
    void setMultiplicityMax(String value);

    @objid ("d77f0f00-5753-4117-8595-70bd33b05ffa")
    String getValue();

    @objid ("e8c6c67b-afff-4e7d-834d-ede4bffa0cee")
    void setValue(String value);

    @objid ("d30c75a2-c0d0-482b-85a9-42d205caea1a")
    EList<CommunicationNode> getRepresentedCommunicationNode();

    @objid ("8a622883-34cf-4674-8e9f-965ec9eb3369")
    <T extends CommunicationNode> List<T> getRepresentedCommunicationNode(java.lang.Class<T> filterClass);

    @objid ("70e134f7-7691-464f-9fac-c5c303147750")
    EList<BpmnItemAwareElement> getRepresentingItem();

    @objid ("d37d7c08-8b64-4aa2-8140-0bb98319ac04")
    <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass);

    @objid ("0fa05d52-990c-4aa9-bf33-ad893f80aa28")
    EList<LinkEnd> getOwnedEnd();

    @objid ("95dca6e3-b465-4579-a1e9-a1eb70ee5c55")
    <T extends LinkEnd> List<T> getOwnedEnd(java.lang.Class<T> filterClass);

    @objid ("f5d273a2-610c-4845-ba56-1ea02e11432f")
    NameSpace getBase();

    @objid ("74e01df9-82ac-446d-a34e-a749b5acace7")
    void setBase(NameSpace value);

    @objid ("35d28ba3-0526-4a7c-8509-e834a03c65be")
    EList<ObjectNode> getRepresentingObjectNode();

    @objid ("ced7ed9d-838b-4f0e-b595-4ba4a3f76527")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    @objid ("5537c74d-2a1a-42a2-a190-29037a757f53")
    NameSpace getOwner();

    @objid ("aa606080-7504-4401-baf7-ea352e9d1b60")
    void setOwner(NameSpace value);

    @objid ("0831901d-7e09-41a1-9d32-8a47e03c8287")
    EList<NaryLinkEnd> getOwnedNaryEnd();

    @objid ("8326374a-f78a-40ae-8844-ec1f07839ff7")
    <T extends NaryLinkEnd> List<T> getOwnedNaryEnd(java.lang.Class<T> filterClass);

    @objid ("3a90e153-bf95-4850-b5fc-438e2e50937f")
    EList<Lifeline> getRepresentedLifeLine();

    @objid ("334e602a-73b9-4975-b120-6a45daf3c02b")
    <T extends Lifeline> List<T> getRepresentedLifeLine(java.lang.Class<T> filterClass);

    @objid ("aa24383e-32e3-4acc-a5ad-08b2ce2bfc79")
    EList<AttributeLink> getSlot();

    @objid ("72e56f00-62a1-4c47-8444-39184019f910")
    <T extends AttributeLink> List<T> getSlot(java.lang.Class<T> filterClass);

    @objid ("dd7c56b6-4060-499e-a5d4-eb8d16cf172e")
    EList<BindableInstance> getPart();

    @objid ("4630dd21-b80c-4333-94bb-d57fcbccb863")
    <T extends BindableInstance> List<T> getPart(java.lang.Class<T> filterClass);

    @objid ("11bbe80e-35d8-480c-96c6-096dfa786df9")
    EList<LinkEnd> getTargetingEnd();

    @objid ("78408346-b7ea-48f6-bea3-20f1236d104e")
    <T extends LinkEnd> List<T> getTargetingEnd(java.lang.Class<T> filterClass);

}
