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
    @objid ("1661b0b3-7b26-4733-8619-4f90b7b5abf9")
    boolean isIsEvent();

    @objid ("587c503b-9e24-4a34-898d-b90ac172743a")
    void setIsEvent(boolean value);

    @objid ("9161303a-db3f-434c-8eca-b9be3ea6430b")
    boolean isIsException();

    @objid ("54158978-fc76-44d5-aa6a-ec6f12facd41")
    void setIsException(boolean value);

    @objid ("8e82e5f8-6609-4649-afe9-1038a24a07c3")
    EList<SendSignalAction> getSender();

    @objid ("1bcbb676-7ede-4929-8e1b-763057af1612")
    <T extends SendSignalAction> List<T> getSender(java.lang.Class<T> filterClass);

    @objid ("afe5ad62-fe40-4841-b83f-5fcf26d5ca55")
    EList<Message> getUsage();

    @objid ("adf46592-309f-48f9-8572-e8cfe750e1e5")
    <T extends Message> List<T> getUsage(java.lang.Class<T> filterClass);

    @objid ("2b802ca7-e1fc-4b30-a13e-5812c4748384")
    EList<Transition> getSends();

    @objid ("1c36ed82-f4a5-4615-ac8f-c1199b555401")
    <T extends Transition> List<T> getSends(java.lang.Class<T> filterClass);

    @objid ("0baffca6-c79d-4288-b276-763871d093a3")
    Parameter getPBase();

    @objid ("63ae2338-6937-41d5-abce-d243f1fe2b35")
    void setPBase(Parameter value);

    @objid ("b829dfc4-cae8-438e-8f32-3cc97718adfb")
    Operation getOBase();

    @objid ("5c3eac39-f7a2-49bb-8b69-eb02f66eef57")
    void setOBase(Operation value);

    @objid ("e06b1f48-7660-47b7-9a1f-7068c1a3d695")
    EList<CommunicationMessage> getCommunicationUsage();

    @objid ("11492a8a-15b7-47ac-a042-735ac21569c8")
    <T extends CommunicationMessage> List<T> getCommunicationUsage(java.lang.Class<T> filterClass);

    @objid ("74f362f1-037a-4dae-b923-3284113fb8c8")
    EList<DataFlow> getDOccurence();

    @objid ("c08afedd-1807-4702-9ac7-64fd696d2591")
    <T extends DataFlow> List<T> getDOccurence(java.lang.Class<T> filterClass);

    @objid ("4651dc36-e809-4e41-8384-b01e00466f0e")
    EList<Event> getEOccurence();

    @objid ("ba60a3bb-a3a3-4e42-8331-c71bfc8fdc6e")
    <T extends Event> List<T> getEOccurence(java.lang.Class<T> filterClass);

    @objid ("c5a1644f-dbb4-4182-b164-8a805059f50e")
    GeneralClass getBase();

    @objid ("381ceb98-ed5d-4c4b-8177-10b02c1abcad")
    void setBase(GeneralClass value);

    @objid ("de560237-de26-4eb3-9468-08a9eb68fef0")
    EList<AcceptSignalAction> getReceiver();

    @objid ("589b5764-8778-4ab6-bb55-5ed939dd87f4")
    <T extends AcceptSignalAction> List<T> getReceiver(java.lang.Class<T> filterClass);

}
