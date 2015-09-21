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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;

/**
 * MessageEnd v0.0.9054
 * 
 * 
 * A MessageEnd is an abstract NamedElement that represents what can occur at the end of a Message.
 * Subclasses of MessageEnd define the specific semantics appropriate to the concept they represent.
 */
@objid ("0049cc1c-c4bf-1fd8-97fe-001ec947cd2a")
public interface MessageEnd extends OccurrenceSpecification {
    @objid ("8580182d-e25f-46cd-9388-0eab57e367b4")
    public static final String MNAME = "MessageEnd";

    /**
     * Getter for relation 'MessageEnd->ReceivedMessage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9ff61419-972c-4b51-9095-83e1f3705315")
    Message getReceivedMessage();

    /**
     * Setter for relation 'MessageEnd->ReceivedMessage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b2793307-75bc-4d9b-a8ce-6396a1e0b435")
    void setReceivedMessage(Message value);

    /**
     * Getter for relation 'MessageEnd->SentMessage'
     * 
     * Metamodel description:
     * <i>Message sent.</i>
     */
    @objid ("d64191e1-2c96-47c0-97cc-22af8b153518")
    Message getSentMessage();

    /**
     * Setter for relation 'MessageEnd->SentMessage'
     * 
     * Metamodel description:
     * <i>Message sent.</i>
     */
    @objid ("7cfad0a4-20cf-4a5d-bb13-e458cac75c92")
    void setSentMessage(Message value);

}
