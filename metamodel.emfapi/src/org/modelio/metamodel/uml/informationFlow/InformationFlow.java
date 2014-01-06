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
    @objid ("df590b07-1b20-4416-9f42-37280c5d1b35")
    NameSpace getOwner();

    @objid ("fe98ab4e-1583-4c6b-863b-2461ef2d581b")
    void setOwner(NameSpace value);

    @objid ("7ec8d5d9-0530-4f2a-9313-47be838f77c4")
    EList<ModelElement> getInformationSource();

    @objid ("00b7d104-2e94-444f-bbaa-85b7e03cda81")
    <T extends ModelElement> List<T> getInformationSource(java.lang.Class<T> filterClass);

    @objid ("31246edd-2b97-4468-9113-501946073372")
    EList<ModelElement> getInformationTarget();

    @objid ("fafc24f4-eadb-4eed-b3aa-ec5efe427de8")
    <T extends ModelElement> List<T> getInformationTarget(java.lang.Class<T> filterClass);

    @objid ("87897fc3-212a-477e-851c-d9a5b45b2dda")
    EList<ActivityEdge> getRealizingActivityEdge();

    @objid ("93cfb796-30fe-4f3e-af75-c1f962a6f5b9")
    <T extends ActivityEdge> List<T> getRealizingActivityEdge(java.lang.Class<T> filterClass);

    @objid ("ac1e37e3-c054-4358-9b7e-ce8ab4aaaa47")
    EList<CommunicationMessage> getRealizingCommunicationMessage();

    @objid ("49f9da7d-8a8a-4488-a40a-d76841a87984")
    <T extends CommunicationMessage> List<T> getRealizingCommunicationMessage(java.lang.Class<T> filterClass);

    @objid ("7c88aed1-87ac-494d-aaf9-e85b07a73cab")
    EList<StructuralFeature> getRealizingFeature();

    @objid ("9319c829-ad5b-465f-9aba-e1412859b383")
    <T extends StructuralFeature> List<T> getRealizingFeature(java.lang.Class<T> filterClass);

    @objid ("eea2ce48-71d4-40e4-aac8-ba2a551bbb34")
    EList<LinkEnd> getRealizingLink();

    @objid ("c69b381c-f81a-4f59-acfa-c2f9bda76881")
    <T extends LinkEnd> List<T> getRealizingLink(java.lang.Class<T> filterClass);

    @objid ("34b19548-a369-4ddc-b3c3-2e8ebd58d1a9")
    EList<Message> getRealizingMessage();

    @objid ("200b5671-7e9e-4f10-898b-4b6567c2ef2b")
    <T extends Message> List<T> getRealizingMessage(java.lang.Class<T> filterClass);

    @objid ("96d1180a-d540-41d1-9557-27dd384fad6e")
    EList<NaryLink> getRealizingNaryLink();

    @objid ("c95201b8-f709-46cb-9de5-88b9eec5d2ba")
    <T extends NaryLink> List<T> getRealizingNaryLink(java.lang.Class<T> filterClass);

    @objid ("b3bfdac6-66e7-458f-bf92-a47fa3940b3d")
    EList<Classifier> getConveyed();

    @objid ("d1a88ffc-d49a-44b1-95ee-007fc4b10129")
    <T extends Classifier> List<T> getConveyed(java.lang.Class<T> filterClass);

    @objid ("49fc2783-ad9d-4824-8caf-3d76ec26711f")
    AssociationEnd getChannel();

    @objid ("dc11b583-4c88-4dae-9a5a-6020f8becb7b")
    void setChannel(AssociationEnd value);

}
