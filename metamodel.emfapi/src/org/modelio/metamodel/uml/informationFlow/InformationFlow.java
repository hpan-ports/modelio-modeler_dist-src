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
package org.modelio.metamodel.uml.informationFlow;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.StructuralFeature;

@objid ("0063764e-c4bf-1fd8-97fe-001ec947cd2a")
public interface InformationFlow extends ModelElement {
    @objid ("7a63a147-360a-4ad5-aa92-b9122c6f51bd")
    NameSpace getOwner();

    @objid ("5f6e11af-5aa4-4791-8c30-6abb8cee858b")
    void setOwner(NameSpace value);

    @objid ("24d271cc-6f05-4274-a4b1-80553a133f4b")
    EList<ModelElement> getInformationSource();

    @objid ("3593fc85-df13-4ac0-bc6d-f41e959c09e2")
    <T extends ModelElement> List<T> getInformationSource(java.lang.Class<T> filterClass);

    @objid ("1ef79540-15e2-427b-8927-f4bb20519d82")
    EList<ModelElement> getInformationTarget();

    @objid ("b70c7bc3-5cf2-48eb-bde6-bf3f94e43d20")
    <T extends ModelElement> List<T> getInformationTarget(java.lang.Class<T> filterClass);

    @objid ("c66b7bea-9e6e-44ba-bf29-9d435ff044ee")
    EList<ActivityEdge> getRealizingActivityEdge();

    @objid ("95935ae0-d683-43e8-bd4d-d5cdd8b20ccb")
    <T extends ActivityEdge> List<T> getRealizingActivityEdge(java.lang.Class<T> filterClass);

    @objid ("b3e96f19-6418-44a2-b813-c24430d545b0")
    EList<CommunicationMessage> getRealizingCommunicationMessage();

    @objid ("3496aae6-4bfa-448d-ad1b-18617ff79b18")
    <T extends CommunicationMessage> List<T> getRealizingCommunicationMessage(java.lang.Class<T> filterClass);

    @objid ("4548d88a-3004-4292-a191-2be31febf517")
    EList<StructuralFeature> getRealizingFeature();

    @objid ("51f556eb-0dbe-48a7-b539-086de8ce1040")
    <T extends StructuralFeature> List<T> getRealizingFeature(java.lang.Class<T> filterClass);

    @objid ("1dffce51-9811-4dcb-b77b-ff349875b7f8")
    EList<LinkEnd> getRealizingLink();

    @objid ("ff6d3bfb-1dc8-476b-ba12-7330e54878c2")
    <T extends LinkEnd> List<T> getRealizingLink(java.lang.Class<T> filterClass);

    @objid ("b0bb0416-c0b7-4962-a1ee-fc9375d5422d")
    EList<Message> getRealizingMessage();

    @objid ("8c789627-bcf6-4420-8dd8-9d7ff5446f0f")
    <T extends Message> List<T> getRealizingMessage(java.lang.Class<T> filterClass);

    @objid ("4ab708c6-9243-4e01-8488-ec6d2d93f782")
    EList<NaryLink> getRealizingNaryLink();

    @objid ("2e040aaf-280e-48ee-a069-3066a3a184b7")
    <T extends NaryLink> List<T> getRealizingNaryLink(java.lang.Class<T> filterClass);

    @objid ("5fd7bdcf-fdac-4752-9d9d-7cf6be8eabb8")
    EList<Classifier> getConveyed();

    @objid ("1a3172ce-0e58-41af-9f24-b5b923f42e1d")
    <T extends Classifier> List<T> getConveyed(java.lang.Class<T> filterClass);

    @objid ("a1e05093-f230-4b68-a62d-ac8faddf80a9")
    AssociationEnd getChannel();

    @objid ("975be3f2-6ac5-4cdd-984f-3940b71836f5")
    void setChannel(AssociationEnd value);

}
