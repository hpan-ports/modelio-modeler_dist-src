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
package org.modelio.metamodel.uml.behavior.communicationModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageSort;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("005b08f6-c4bf-1fd8-97fe-001ec947cd2a")
public interface CommunicationMessage extends ModelElement {
    @objid ("4ee8c735-4c7c-4696-9b8b-5e606d5f4bd1")
    String getArgument();

    @objid ("7fcfd156-9a90-4a31-b575-ca6b60895ccb")
    void setArgument(String value);

    @objid ("973fd913-ea54-4419-be78-f6e0dd16978b")
    String getSequence();

    @objid ("1bac7e18-e18a-4531-8564-24b7234b4440")
    void setSequence(String value);

    @objid ("c8bb866c-eb67-4d4e-b37c-32a26eb9c5d3")
    MessageSort getSortOfMessage();

    @objid ("7fd252ed-3891-49d1-8255-31a257c10ca8")
    void setSortOfMessage(MessageSort value);

    @objid ("866cb2ea-4dd7-495a-922f-083cdaa1542f")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("10e81ef0-bf3a-47aa-878d-d7466b4347f6")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

    @objid ("9300fc94-9924-456a-a7db-9842257884c7")
    CommunicationChannel getChannel();

    @objid ("69044d57-a888-4c95-9895-4b08bba8acb3")
    void setChannel(CommunicationChannel value);

    @objid ("e81b00e6-ab3b-4b41-92f6-5daf48f3c127")
    CommunicationChannel getInvertedChannel();

    @objid ("a7edf913-36ff-4056-8f8d-a2f383874eb1")
    void setInvertedChannel(CommunicationChannel value);

    @objid ("99bf8cce-b8d0-488c-8234-055d482900a9")
    Operation getInvoked();

    @objid ("3335a57b-2981-4d96-ba92-dde7fc7daf71")
    void setInvoked(Operation value);

    @objid ("caf3d384-2dba-4512-8b29-0aee1cbf04d4")
    Signal getSignalSignature();

    @objid ("96ea61de-1aff-45ee-9333-b6db07b058db")
    void setSignalSignature(Signal value);

}
