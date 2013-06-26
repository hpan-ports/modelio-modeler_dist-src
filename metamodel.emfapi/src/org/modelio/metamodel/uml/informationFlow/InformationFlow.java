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
    @objid ("13a0ef24-6923-4057-a3f6-e716ff6c026b")
    NameSpace getOwner();

    @objid ("d680e87c-3a82-4a2c-b6da-eff9fc519359")
    void setOwner(NameSpace value);

    @objid ("6c65cb49-02f5-4de6-b7e7-265901892981")
    EList<ModelElement> getInformationSource();

    @objid ("e0dfdd0c-2ceb-4289-ac07-d0fbe17745e3")
    <T extends ModelElement> List<T> getInformationSource(java.lang.Class<T> filterClass);

    @objid ("cab60aca-d255-4a9c-80b4-6e3bad6a40b0")
    EList<ModelElement> getInformationTarget();

    @objid ("192dc6b9-7763-45f9-8c7b-187c2d689410")
    <T extends ModelElement> List<T> getInformationTarget(java.lang.Class<T> filterClass);

    @objid ("c87eb6c3-2690-46ca-839a-7012b0a3e6e1")
    EList<ActivityEdge> getRealizingActivityEdge();

    @objid ("66c1a693-983a-4e74-b2e1-2d82b65065d8")
    <T extends ActivityEdge> List<T> getRealizingActivityEdge(java.lang.Class<T> filterClass);

    @objid ("a7f407ae-add7-439a-bea3-d9ad72a9e068")
    EList<CommunicationMessage> getRealizingCommunicationMessage();

    @objid ("25f76e64-9d41-45ce-9b2f-ba67dd661574")
    <T extends CommunicationMessage> List<T> getRealizingCommunicationMessage(java.lang.Class<T> filterClass);

    @objid ("c036e957-27ea-4a84-b679-555502bebdb6")
    EList<StructuralFeature> getRealizingFeature();

    @objid ("2dea5f4c-4a93-4b4b-9e4d-da2066ad42c0")
    <T extends StructuralFeature> List<T> getRealizingFeature(java.lang.Class<T> filterClass);

    @objid ("6a628309-3c03-4be0-b243-8f05c72ccd1d")
    EList<LinkEnd> getRealizingLink();

    @objid ("cb2fd6ef-9e11-4f7a-bd53-c4399b13755e")
    <T extends LinkEnd> List<T> getRealizingLink(java.lang.Class<T> filterClass);

    @objid ("91a36339-efd6-4fd2-bc9f-30cc993f47ca")
    EList<Message> getRealizingMessage();

    @objid ("e3dbbbaf-7a5b-4e9e-995c-44adb2558b12")
    <T extends Message> List<T> getRealizingMessage(java.lang.Class<T> filterClass);

    @objid ("950e3142-1532-4ef9-b34a-92533b6e7cbe")
    EList<NaryLink> getRealizingNaryLink();

    @objid ("fe2b60da-b6ca-4e4f-a18b-b84f2f60653b")
    <T extends NaryLink> List<T> getRealizingNaryLink(java.lang.Class<T> filterClass);

    @objid ("51a148fd-396e-4dc5-98de-8382a903e5cb")
    EList<Classifier> getConveyed();

    @objid ("c39909bd-e760-4c1a-90f7-9fae3e604c40")
    <T extends Classifier> List<T> getConveyed(java.lang.Class<T> filterClass);

    @objid ("7d5fc037-4c87-43fe-9500-eba1a869086e")
    AssociationEnd getChannel();

    @objid ("071c51dd-5253-49f8-9363-368dc8507e79")
    void setChannel(AssociationEnd value);

}
