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
package org.modelio.metamodel.uml.informationFlow;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
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

/**
 * InformationFlow v0.0.9054
 * 
 * 
 * An InformationFlow specifies that one or more information items circulates from its sources to its targets. Information flows require some kind of �??information channel�?� for transmitting information items from the source to the destination. 
 * 
 * An information channel is represented in various ways depending on the nature of its sources and targets. It may be represented by connectors, links, associations, or even dependencies. For example, if the source and destination are parts in some composite structure such as a collaboration, then the information channel is likely to be represented by a connector between them. Or, if the source and target are objects (which are a kind of InstanceSpecification), they may be represented by a link that joins the two, and so on.
 * 
 * The sources and targets of the information flow can only be one of the following kind: Actor, Node, UseCase, Artifact, Class, Component, Port, Attribute, AssociationEnd, Interface, Package, ActivityNode, ActivityPartition and Instance.
 */
@objid ("0063764e-c4bf-1fd8-97fe-001ec947cd2a")
public interface InformationFlow extends ModelElement {
    @objid ("628f6286-2e9b-49f2-9e01-f128fffd52be")
    public static final String MNAME = "InformationFlow";

    /**
     * Getter for relation 'InformationFlow->Owner'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("ebdbb388-5466-43d9-8acc-3b2cca0d6eca")
    NameSpace getOwner();

    /**
     * Setter for relation 'InformationFlow->Owner'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("0e98f5f7-a2f3-4504-9d6b-6113885b9fe0")
    void setOwner(NameSpace value);

    /**
     * Getter for relation 'InformationFlow->InformationSource'
     * 
     * Metamodel description:
     * <i>Defines from which source the conveyed information items are initiated.</i>
     */
    @objid ("4b254187-a8f9-4e90-b836-cb53cd69eeb9")
    EList<ModelElement> getInformationSource();

    /**
     * Filtered Getter for relation 'InformationFlow->InformationSource'
     * 
     * Metamodel description:
     * <i>Defines from which source the conveyed information items are initiated.</i>
     */
    @objid ("0bf0f1f4-3393-4f63-96e0-adea74119b2b")
    <T extends ModelElement> List<T> getInformationSource(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'InformationFlow->InformationTarget'
     * 
     * Metamodel description:
     * <i>Defines to which target the conveyed information items are directed.</i>
     */
    @objid ("af9366ed-08fa-491b-a967-7124d7f9be5e")
    EList<ModelElement> getInformationTarget();

    /**
     * Filtered Getter for relation 'InformationFlow->InformationTarget'
     * 
     * Metamodel description:
     * <i>Defines to which target the conveyed information items are directed.</i>
     */
    @objid ("c9d2e9ac-de74-4cf7-aa4c-14cf19ef6fa9")
    <T extends ModelElement> List<T> getInformationTarget(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'InformationFlow->RealizingActivityEdge'
     * 
     * Metamodel description:
     * <i>Determines which ActivityEdges will realize the specified flow.</i>
     */
    @objid ("dde5cccf-5985-4e7b-8d70-09fb1d264a12")
    EList<ActivityEdge> getRealizingActivityEdge();

    /**
     * Filtered Getter for relation 'InformationFlow->RealizingActivityEdge'
     * 
     * Metamodel description:
     * <i>Determines which ActivityEdges will realize the specified flow.</i>
     */
    @objid ("cc53f760-a3d4-4037-8df5-c32cb09a4f61")
    <T extends ActivityEdge> List<T> getRealizingActivityEdge(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'InformationFlow->RealizingCommunicationMessage'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("0732de8f-a5f2-45ee-821f-61903fcb9df6")
    EList<CommunicationMessage> getRealizingCommunicationMessage();

    /**
     * Filtered Getter for relation 'InformationFlow->RealizingCommunicationMessage'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("eeca5b35-a711-44e3-af38-c15f75c9bf93")
    <T extends CommunicationMessage> List<T> getRealizingCommunicationMessage(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'InformationFlow->RealizingFeature'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("dfe82fce-e842-46d1-a8ab-860679f67f20")
    EList<StructuralFeature> getRealizingFeature();

    /**
     * Filtered Getter for relation 'InformationFlow->RealizingFeature'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6fd4c6d3-4d48-441c-98df-7dd86906e6c1")
    <T extends StructuralFeature> List<T> getRealizingFeature(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'InformationFlow->RealizingLink'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a7c30fc6-6b96-4f38-b02e-48d9d938eb79")
    EList<LinkEnd> getRealizingLink();

    /**
     * Filtered Getter for relation 'InformationFlow->RealizingLink'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("00b13282-7e15-47f6-a3d7-6eeecd61a396")
    <T extends LinkEnd> List<T> getRealizingLink(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'InformationFlow->RealizingMessage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("60550af0-1c7a-4617-91ba-72ecf7861ca4")
    EList<Message> getRealizingMessage();

    /**
     * Filtered Getter for relation 'InformationFlow->RealizingMessage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6cfd09fe-8658-4d77-9d0a-771b2588a925")
    <T extends Message> List<T> getRealizingMessage(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'InformationFlow->RealizingNaryLink'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("92e8ea4e-bc19-41c1-be71-89954f9a2326")
    EList<NaryLink> getRealizingNaryLink();

    /**
     * Filtered Getter for relation 'InformationFlow->RealizingNaryLink'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("eba6a930-4d06-41aa-9cfb-c4878dc084b9")
    <T extends NaryLink> List<T> getRealizingNaryLink(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'InformationFlow->Conveyed'
     * 
     * Metamodel description:
     * <i>Specifies the information items that may circulate on this information flow.</i>
     */
    @objid ("3d8ab7c8-f6b5-4ca3-987b-7e68637792b6")
    EList<Classifier> getConveyed();

    /**
     * Filtered Getter for relation 'InformationFlow->Conveyed'
     * 
     * Metamodel description:
     * <i>Specifies the information items that may circulate on this information flow.</i>
     */
    @objid ("ca96134b-4981-4d31-8368-25c064466640")
    <T extends Classifier> List<T> getConveyed(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'InformationFlow->Channel'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3fff4d08-4bb4-4ebc-a805-09fe855a7002")
    AssociationEnd getChannel();

    /**
     * Setter for relation 'InformationFlow->Channel'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e242f918-e11e-4e23-908b-b31d739c8fdc")
    void setChannel(AssociationEnd value);

}
