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
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.NaryLink;

/**
 * CommunicationChannel v0.0.9054
 * 
 * 
 * A CommunicationChannel is a link between two CommunicationNodes.
 * 
 * A CommunicationChannel can represent a Link. It owns messages that follow the channel from its start to the end, and inverted messages that go from the end to the start.
 */
@objid ("5451d474-f72f-46a9-b8b5-35997413d584")
public interface CommunicationChannel extends ModelElement {
    @objid ("e2567a99-672b-412d-8317-60a7949912d8")
    public static final String MNAME = "CommunicationChannel";

    /**
     * Getter for relation 'CommunicationChannel->StartToEndMessage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("16f860e1-5dde-4dbc-802c-09c96b719b15")
    EList<CommunicationMessage> getStartToEndMessage();

    /**
     * Filtered Getter for relation 'CommunicationChannel->StartToEndMessage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("97442ba3-1400-400e-8e4f-5c24f1056ae0")
    <T extends CommunicationMessage> List<T> getStartToEndMessage(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'CommunicationChannel->Channel'
     * 
     * Metamodel description:
     * <i>References the Link the communication channel represents.</i>
     */
    @objid ("358d1192-496f-4002-ba91-ad64f128452b")
    Link getChannel();

    /**
     * Setter for relation 'CommunicationChannel->Channel'
     * 
     * Metamodel description:
     * <i>References the Link the communication channel represents.</i>
     */
    @objid ("1651e423-e7a8-4a2e-bf2d-85596e648cfd")
    void setChannel(Link value);

    /**
     * Getter for relation 'CommunicationChannel->Start'
     * 
     * Metamodel description:
     * <i>Node starting the channel.</i>
     */
    @objid ("8c348df4-52d0-45e6-9a61-5facc32a3358")
    CommunicationNode getStart();

    /**
     * Setter for relation 'CommunicationChannel->Start'
     * 
     * Metamodel description:
     * <i>Node starting the channel.</i>
     */
    @objid ("43602fff-b00a-4b46-bec6-97f2b513d7c9")
    void setStart(CommunicationNode value);

    /**
     * Getter for relation 'CommunicationChannel->NaryChannel'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4a07f221-3ad3-4387-8f63-681ebb6e405d")
    NaryLink getNaryChannel();

    /**
     * Setter for relation 'CommunicationChannel->NaryChannel'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8b9554bd-c5f8-46b6-867c-9ca0389e506b")
    void setNaryChannel(NaryLink value);

    /**
     * Getter for relation 'CommunicationChannel->EndToStartMessage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("634cdf63-c25d-491a-887d-16e020ccd229")
    EList<CommunicationMessage> getEndToStartMessage();

    /**
     * Filtered Getter for relation 'CommunicationChannel->EndToStartMessage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fbf3386e-3448-47b7-8edd-75d1d74fbde1")
    <T extends CommunicationMessage> List<T> getEndToStartMessage(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'CommunicationChannel->End'
     * 
     * Metamodel description:
     * <i>Node at the end of the channel.</i>
     */
    @objid ("64ccff12-b9e8-4fec-ac41-23aa0cb03533")
    CommunicationNode getEnd();

    /**
     * Setter for relation 'CommunicationChannel->End'
     * 
     * Metamodel description:
     * <i>Node at the end of the channel.</i>
     */
    @objid ("02e28cd7-682c-49d9-be6e-9a473b9efcd6")
    void setEnd(CommunicationNode value);

}
