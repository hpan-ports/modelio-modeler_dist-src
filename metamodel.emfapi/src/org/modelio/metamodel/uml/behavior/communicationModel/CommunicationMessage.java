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
package org.modelio.metamodel.uml.behavior.communicationModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageSort;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;

/**
 * CommunicationMessage v0.0.9054
 * 
 * 
 * CommunicationMessages are used in communication diagrams. 
 * 
 * If the CommunicationMessage has no InvokedOperation, then its description is in its name. 
 * 
 * In Modelio, a Message belongs to the Communication it follows.
 * 
 * The message sequencing information is handled in communication diagrams by the 'Sequencing' attribute.
 */
@objid ("005b08f6-c4bf-1fd8-97fe-001ec947cd2a")
public interface CommunicationMessage extends ModelElement {
    @objid ("5fe147f7-a166-4d78-bea7-b58162da4292")
    public static final String MNAME = "CommunicationMessage";

    /**
     * Getter for attribute 'CommunicationMessage.Argument'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("95d1eea6-df97-4249-b3bc-8b45db3247e3")
    String getArgument();

    /**
     * Setter for attribute 'CommunicationMessage.Argument'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("395a3b5e-46c4-4fe0-9b3d-0115c5657a9b")
    void setArgument(String value);

    /**
     * Getter for attribute 'CommunicationMessage.Sequence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("abc8c793-772d-4ba0-a8f9-6eab408b9af5")
    String getSequence();

    /**
     * Setter for attribute 'CommunicationMessage.Sequence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8c5a65b8-814b-4372-9978-eff68a00d0fc")
    void setSequence(String value);

    /**
     * Getter for attribute 'CommunicationMessage.SortOfMessage'
     * 
     * Metamodel description:
     * <i>The sort of communication reflected by the CommunicationMessage. Default value is synchCall.</i>
     */
    @objid ("1947d53d-ab7f-4bce-8b0d-a6bd08f5d02c")
    MessageSort getSortOfMessage();

    /**
     * Setter for attribute 'CommunicationMessage.SortOfMessage'
     * 
     * Metamodel description:
     * <i>The sort of communication reflected by the CommunicationMessage. Default value is synchCall.</i>
     */
    @objid ("b935ae98-d3d7-4072-9011-a43ecf61efcc")
    void setSortOfMessage(MessageSort value);

    /**
     * Getter for relation 'CommunicationMessage->RealizedInformationFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e0e68e35-378c-444f-bedf-da6247dbc12e")
    EList<InformationFlow> getRealizedInformationFlow();

    /**
     * Filtered Getter for relation 'CommunicationMessage->RealizedInformationFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("56d25548-2cb0-4d63-9068-784f57d3f1f2")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'CommunicationMessage->Channel'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6ba8d8d8-4052-4ccb-ab58-24e681bde16a")
    CommunicationChannel getChannel();

    /**
     * Setter for relation 'CommunicationMessage->Channel'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fc432b47-139b-4943-a4ea-a08d658621ec")
    void setChannel(CommunicationChannel value);

    /**
     * Getter for relation 'CommunicationMessage->InvertedChannel'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("594dbe86-0fa3-4ca2-9415-3969b95360b7")
    CommunicationChannel getInvertedChannel();

    /**
     * Setter for relation 'CommunicationMessage->InvertedChannel'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e49dbf6e-af39-4af4-b06b-a4bd85c1582e")
    void setInvertedChannel(CommunicationChannel value);

    /**
     * Getter for relation 'CommunicationMessage->Invoked'
     * 
     * Metamodel description:
     * <i>The Operation is invoked by the Message.</i>
     */
    @objid ("064da4ca-1b55-4a09-b458-0d035fe732a8")
    Operation getInvoked();

    /**
     * Setter for relation 'CommunicationMessage->Invoked'
     * 
     * Metamodel description:
     * <i>The Operation is invoked by the Message.</i>
     */
    @objid ("0adceec1-8b35-4b9a-b13a-4a6256f0342c")
    void setInvoked(Operation value);

    /**
     * Getter for relation 'CommunicationMessage->SignalSignature'
     * 
     * Metamodel description:
     * <i>Signal that is sent by the message.</i>
     */
    @objid ("5c43a461-0187-4c7f-80b6-8979d953cf39")
    Signal getSignalSignature();

    /**
     * Setter for relation 'CommunicationMessage->SignalSignature'
     * 
     * Metamodel description:
     * <i>Signal that is sent by the message.</i>
     */
    @objid ("ab2b5e80-757d-4f0a-bd49-163fea6bcece")
    void setSignalSignature(Signal value);

}
