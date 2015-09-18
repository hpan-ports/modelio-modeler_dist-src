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
package org.modelio.metamodel.uml.behavior.commonBehaviors;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptSignalAction;
import org.modelio.metamodel.uml.behavior.activityModel.SendSignalAction;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("00421152-c4bf-1fd8-97fe-001ec947cd2a")
public interface Signal extends GeneralClass {
    @objid ("73e07c64-ae69-455d-b887-ef8fc2b1e30f")
    boolean isIsEvent();

    @objid ("2a30bef3-f27c-4edf-b782-1da78803901f")
    void setIsEvent(boolean value);

    @objid ("e4634705-a4b7-40b7-a7c9-842842930e52")
    boolean isIsException();

    @objid ("e4522974-bf23-4eab-b823-ef109ab2c140")
    void setIsException(boolean value);

    @objid ("84397971-f603-4712-83a7-5f0d38ca45e2")
    EList<SendSignalAction> getSender();

    @objid ("2e46f410-91b3-4d5c-add4-f7941caa4e50")
    <T extends SendSignalAction> List<T> getSender(java.lang.Class<T> filterClass);

    @objid ("d4972c25-29f6-4dfc-a726-0c5853628d32")
    EList<Message> getUsage();

    @objid ("cd304777-5db3-4fcd-ab7e-ef00abb1c079")
    <T extends Message> List<T> getUsage(java.lang.Class<T> filterClass);

    @objid ("eb5b2889-f848-4c88-b466-a4b99007336c")
    EList<Transition> getSends();

    @objid ("082d27da-172f-4d7d-9519-57ae5815ebac")
    <T extends Transition> List<T> getSends(java.lang.Class<T> filterClass);

    @objid ("d5ed8ca4-f2b3-4bec-9fa0-f435c0f763b5")
    Parameter getPBase();

    @objid ("30961e5d-c85f-4895-8074-95feb7e18d49")
    void setPBase(Parameter value);

    @objid ("0e958d71-2711-43ae-89d3-d1800fc49c29")
    Operation getOBase();

    @objid ("2cddc0ff-dae9-46b2-aae1-976c7c2a9937")
    void setOBase(Operation value);

    @objid ("6665f016-36ff-4fd7-855c-e0e049015f12")
    EList<CommunicationMessage> getCommunicationUsage();

    @objid ("4c6bae87-c5ee-4e3b-b993-58c0752a6abf")
    <T extends CommunicationMessage> List<T> getCommunicationUsage(java.lang.Class<T> filterClass);

    @objid ("93e84b77-5ec5-42ad-9281-7058fdf4b40a")
    EList<DataFlow> getDOccurence();

    @objid ("5f43060f-48b6-4f15-bf48-e518da6537f3")
    <T extends DataFlow> List<T> getDOccurence(java.lang.Class<T> filterClass);

    @objid ("af7fc492-032d-4432-a11e-a9d39922ad33")
    EList<Event> getEOccurence();

    @objid ("c4b857b2-d9a6-4421-9ecb-044c90b19799")
    <T extends Event> List<T> getEOccurence(java.lang.Class<T> filterClass);

    @objid ("f5e646f1-4aca-462d-bb08-d5a30348b374")
    GeneralClass getBase();

    @objid ("e10e856e-745a-46fa-ba96-9992eaf437dc")
    void setBase(GeneralClass value);

    @objid ("ed4350da-dae7-48f4-84d3-f359ee0d8413")
    EList<AcceptSignalAction> getReceiver();

    @objid ("cae1f3b5-83ee-431d-bb02-09a0e6213320")
    <T extends AcceptSignalAction> List<T> getReceiver(java.lang.Class<T> filterClass);

}
