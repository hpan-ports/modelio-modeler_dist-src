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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("00421152-c4bf-1fd8-97fe-001ec947cd2a")
public interface Signal extends GeneralClass {
    @objid ("52fd72ec-5d01-4617-8d4f-869d7ae5241c")
    boolean isIsEvent();

    @objid ("7e145e9a-d728-4f3e-bc91-e0897149ddf3")
    void setIsEvent(boolean value);

    @objid ("a0355f1f-6f13-4a90-83f3-d029c5f250f2")
    boolean isIsException();

    @objid ("bfe479fd-77d3-47e0-ad83-5c50723dcc90")
    void setIsException(boolean value);

    @objid ("f142a026-8b9a-42b6-a5f8-2c31a3ec001b")
    EList<SendSignalAction> getSender();

    @objid ("f408cf9e-cae8-4098-b952-4bd20af062bd")
    <T extends SendSignalAction> List<T> getSender(java.lang.Class<T> filterClass);

    @objid ("f55546db-20e7-4c45-a49e-1638cd92b73e")
    EList<Message> getUsage();

    @objid ("979fbc48-26ef-48aa-9647-82384c8da2bd")
    <T extends Message> List<T> getUsage(java.lang.Class<T> filterClass);

    @objid ("336bd8ef-0dc4-4307-8673-5b7ddf4f1ac8")
    EList<Transition> getSends();

    @objid ("d942ae55-bf7a-425f-b110-9b00c14f74fd")
    <T extends Transition> List<T> getSends(java.lang.Class<T> filterClass);

    @objid ("8e28b54b-9efe-44e5-a141-d60584a42e7a")
    Parameter getPBase();

    @objid ("c338e046-5b7a-4bed-88ac-23d0d6a434a3")
    void setPBase(Parameter value);

    @objid ("866ef384-2d2b-41ef-8933-821f88603569")
    ModelElement getBrowseBase();

    @objid ("7fb6589c-9b6a-4316-8cbf-ddb7cf8b7672")
    void setBrowseBase(ModelElement value);

    @objid ("2b4dd073-6a34-4047-b423-8e2b9d91c140")
    Operation getOBase();

    @objid ("8bca25e8-b804-4743-be18-a15d79e61f5a")
    void setOBase(Operation value);

    @objid ("adee1c1b-4292-4b36-a932-bafe05d1f22d")
    EList<CommunicationMessage> getCommunicationUsage();

    @objid ("b69e6df6-f078-4263-af52-81a482351890")
    <T extends CommunicationMessage> List<T> getCommunicationUsage(java.lang.Class<T> filterClass);

    @objid ("d15f3bca-d64f-4683-b696-9535c2cc2e72")
    EList<DataFlow> getDOccurence();

    @objid ("211123c4-d9f6-4f06-9b22-f2c0121aec0d")
    <T extends DataFlow> List<T> getDOccurence(java.lang.Class<T> filterClass);

    @objid ("018d5675-8e90-4180-a0d5-32f81c24fe80")
    EList<Event> getEOccurence();

    @objid ("95431326-1bd6-43ea-9027-853e7b82dea6")
    <T extends Event> List<T> getEOccurence(java.lang.Class<T> filterClass);

    @objid ("2e1a42be-6b5d-488f-aa25-9b36abe46c97")
    GeneralClass getBase();

    @objid ("062ea21c-abf8-4184-81b4-f99de413151a")
    void setBase(GeneralClass value);

    @objid ("f2300d20-c121-42dc-b88e-7153b55f3a1d")
    EList<AcceptSignalAction> getReceiver();

    @objid ("ee3521c1-4a51-44d3-a171-01ba04a89df0")
    <T extends AcceptSignalAction> List<T> getReceiver(java.lang.Class<T> filterClass);

}
