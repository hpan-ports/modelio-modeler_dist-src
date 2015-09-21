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
package org.modelio.metamodel.uml.behavior.interactionModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageKind;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageSort;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;

/**
 * Message v0.0.9054
 * 
 * 
 * Messages are used in object diagrams, collaboration diagrams and sequence diagrams. 
 * 
 * If the Message has no InvokedOperation, then its description is in its name. 
 * 
 * In Modelio, a Message belongs to the sending MessageEnd.
 * 
 * The message sequencing information is handled in sequence diagrams by both its MessageEnds, with  an internal feature that is not directly accessible.
 * The Joni Java API will provide methods to access the ordering of MessagesEnd as for InteractionFragments.
 */
@objid ("00493ff4-c4bf-1fd8-97fe-001ec947cd2a")
public interface Message extends ModelElement {
    @objid ("1b9bed25-bfe1-4970-bd62-730309d27e02")
    public static final String MNAME = "Message";

    /**
     * Getter for attribute 'Message.Argument'
     * 
     * Metamodel description:
     * <i>Arguments passed with the message.</i>
     */
    @objid ("627c4607-3533-4e91-961e-065c8ca10191")
    String getArgument();

    /**
     * Setter for attribute 'Message.Argument'
     * 
     * Metamodel description:
     * <i>Arguments passed with the message.</i>
     */
    @objid ("570678e3-c996-4188-9798-d8bcc110cfe9")
    void setArgument(String value);

    /**
     * Getter for attribute 'Message.KindOfMessage'
     * 
     * Metamodel description:
     * <i>The derived kind of the Message (complete, lost, found, or unknown). The default value is unknown.</i>
     */
    @objid ("163ae108-513c-465d-9ac1-85ff055755ea")
    MessageKind getKindOfMessage();

    /**
     * Setter for attribute 'Message.KindOfMessage'
     * 
     * Metamodel description:
     * <i>The derived kind of the Message (complete, lost, found, or unknown). The default value is unknown.</i>
     */
    @objid ("fb74e93d-fadd-49ff-a45b-3d98b52fca1e")
    void setKindOfMessage(MessageKind value);

    /**
     * Getter for attribute 'Message.SortOfMessage'
     * 
     * Metamodel description:
     * <i>The sort of communication reflected by the Message. The default value is synchCall.</i>
     */
    @objid ("6f4bc32b-ea00-43da-a85b-829a7bec24cf")
    MessageSort getSortOfMessage();

    /**
     * Setter for attribute 'Message.SortOfMessage'
     * 
     * Metamodel description:
     * <i>The sort of communication reflected by the Message. The default value is synchCall.</i>
     */
    @objid ("729ce9e7-56dd-405e-8d24-2cfd322898b7")
    void setSortOfMessage(MessageSort value);

    /**
     * Getter for relation 'Message->SignalSignature'
     * 
     * Metamodel description:
     * <i>Signal that is sent by the message.</i>
     */
    @objid ("8ab34c9d-ac8b-4805-bfb5-71de91a25f4b")
    Signal getSignalSignature();

    /**
     * Setter for relation 'Message->SignalSignature'
     * 
     * Metamodel description:
     * <i>Signal that is sent by the message.</i>
     */
    @objid ("bfec1796-34bf-48f3-9ade-cf58b27a3efd")
    void setSignalSignature(Signal value);

    /**
     * Getter for relation 'Message->ReceiveEvent'
     * 
     * Metamodel description:
     * <i>References the reception of the message.</i>
     */
    @objid ("6e61bb44-dc45-43d2-af83-3a4f2eef3e80")
    MessageEnd getReceiveEvent();

    /**
     * Setter for relation 'Message->ReceiveEvent'
     * 
     * Metamodel description:
     * <i>References the reception of the message.</i>
     */
    @objid ("d0f1ea17-c941-4de2-9f32-77baa1206ca1")
    void setReceiveEvent(MessageEnd value);

    /**
     * Getter for relation 'Message->SendEvent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("17cdb459-0cc7-4608-8179-ecea168d8a7f")
    MessageEnd getSendEvent();

    /**
     * Setter for relation 'Message->SendEvent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("05506fa1-b139-4f7d-9bfa-263902af6786")
    void setSendEvent(MessageEnd value);

    /**
     * Getter for relation 'Message->Invoked'
     * 
     * Metamodel description:
     * <i>The Operation that is invoked by the Message.</i>
     */
    @objid ("29ea05cc-e7cc-431b-a053-22233d22c51c")
    Operation getInvoked();

    /**
     * Setter for relation 'Message->Invoked'
     * 
     * Metamodel description:
     * <i>The Operation that is invoked by the Message.</i>
     */
    @objid ("8a49256a-6fce-4275-ad47-f769ebc9e867")
    void setInvoked(Operation value);

    /**
     * Getter for relation 'Message->RealizedInformationFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a5d7e68f-c9b3-48ad-ab87-00cbcf0f1982")
    EList<InformationFlow> getRealizedInformationFlow();

    /**
     * Filtered Getter for relation 'Message->RealizedInformationFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("03c7af33-9a9a-4c85-b9d6-52dcbfd328e7")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

}
