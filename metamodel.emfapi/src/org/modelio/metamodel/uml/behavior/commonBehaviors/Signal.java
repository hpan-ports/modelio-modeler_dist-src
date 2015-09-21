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
package org.modelio.metamodel.uml.behavior.commonBehaviors;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
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

/**
 * Signal v0.0.9054
 * 
 * 
 * Signals are processed by StateMachines, which represent how SignalEvents are taken into account. 
 * 
 * Modelio provides the DataFlow extension to UML.  Using this extension, a Signal can be declared as representing a ModelElement (GeneralClass, Operation, or Parameter). 
 * 
 * A DataFlow associated to the Signal will then be able to express this data, represented by the Signal, and may circulate between different NameSpaces.  
 * 
 * In Modelio, a Signal belongs to a NameSpace, notably its Package.
 */
@objid ("00421152-c4bf-1fd8-97fe-001ec947cd2a")
public interface Signal extends GeneralClass {
    @objid ("070650c5-bc1f-484b-8f28-a0eb8744c4d9")
    public static final String MNAME = "Signal";

    /**
     * Getter for attribute 'Signal.IsEvent'
     * 
     * Metamodel description:
     * <i>Establishes if it is an event in the sense of event based systems : CORBA, Java, XWindow's, SGBDR.</i>
     */
    @objid ("cded861a-cd7c-4a15-bb4c-b3560a4d6bd9")
    boolean isIsEvent();

    /**
     * Setter for attribute 'Signal.IsEvent'
     * 
     * Metamodel description:
     * <i>Establishes if it is an event in the sense of event based systems : CORBA, Java, XWindow's, SGBDR.</i>
     */
    @objid ("853b34d7-3eed-4df3-80e8-d8ea5a5415ae")
    void setIsEvent(boolean value);

    /**
     * Getter for attribute 'Signal.IsException'
     * 
     * Metamodel description:
     * <i>Defines if it is an exception, as they exist in Java, C++, and so on.</i>
     */
    @objid ("d11a1fb6-b0c7-4d8a-804f-eb1b4d35f4f0")
    boolean isIsException();

    /**
     * Setter for attribute 'Signal.IsException'
     * 
     * Metamodel description:
     * <i>Defines if it is an exception, as they exist in Java, C++, and so on.</i>
     */
    @objid ("1f7ab3c6-b303-42f2-9761-ac589ca2a4fa")
    void setIsException(boolean value);

    /**
     * Getter for relation 'Signal->Sender'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("31154307-2c08-49d7-af67-1885b3bfcddb")
    EList<SendSignalAction> getSender();

    /**
     * Filtered Getter for relation 'Signal->Sender'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("aa335b10-20d7-4087-a269-ded12ca03af8")
    <T extends SendSignalAction> List<T> getSender(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Signal->Usage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("77ac2b6f-f12f-45fe-a8b1-461ad0ac94c3")
    EList<Message> getUsage();

    /**
     * Filtered Getter for relation 'Signal->Usage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("46dcb0d2-18c0-4605-999d-005fdf5f6f98")
    <T extends Message> List<T> getUsage(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Signal->Sends'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3e4e3d7c-624b-4f2a-9ffc-db6bbe62d23a")
    EList<Transition> getSends();

    /**
     * Filtered Getter for relation 'Signal->Sends'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("39721fea-9c44-4236-a91d-d71936b1cce6")
    <T extends Transition> List<T> getSends(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Signal->PBase'
     * 
     * Metamodel description:
     * <i>Parameter that the Signal may represent.</i>
     */
    @objid ("98d49623-22db-4a09-80b0-93f0c3ed2e03")
    Parameter getPBase();

    /**
     * Setter for relation 'Signal->PBase'
     * 
     * Metamodel description:
     * <i>Parameter that the Signal may represent.</i>
     */
    @objid ("e457b92b-4395-4042-ba2d-2e65bd2531ee")
    void setPBase(Parameter value);

    /**
     * Getter for relation 'Signal->OBase'
     * 
     * Metamodel description:
     * <i>The Operation that the Signal may represent.</i>
     */
    @objid ("7ed309f4-6fe8-470e-8886-bbd918cfad1a")
    Operation getOBase();

    /**
     * Setter for relation 'Signal->OBase'
     * 
     * Metamodel description:
     * <i>The Operation that the Signal may represent.</i>
     */
    @objid ("1e3a9db4-1c62-45fe-a402-ffc8e2564125")
    void setOBase(Operation value);

    /**
     * Getter for relation 'Signal->CommunicationUsage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("61ab238c-25fd-4db3-955a-f8f9f05ef4e8")
    EList<CommunicationMessage> getCommunicationUsage();

    /**
     * Filtered Getter for relation 'Signal->CommunicationUsage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f6e92dfa-341a-49ee-9a12-8cbb97afeee5")
    <T extends CommunicationMessage> List<T> getCommunicationUsage(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Signal->DOccurence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("251014ef-dfd4-48d1-b379-047c13361f5d")
    EList<DataFlow> getDOccurence();

    /**
     * Filtered Getter for relation 'Signal->DOccurence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c2ea734b-8e2d-48c9-8660-eb65ff595781")
    <T extends DataFlow> List<T> getDOccurence(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Signal->EOccurence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cb34e92b-c38b-4fc8-842a-d9da1129e1e1")
    EList<Event> getEOccurence();

    /**
     * Filtered Getter for relation 'Signal->EOccurence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("43f91308-5579-4702-9bc8-755a78b1bc45")
    <T extends Event> List<T> getEOccurence(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Signal->Base'
     * 
     * Metamodel description:
     * <i>Class that the Signal may represent.</i>
     */
    @objid ("c48536c2-ed7e-4fb1-82fb-c52f731dcc5f")
    GeneralClass getBase();

    /**
     * Setter for relation 'Signal->Base'
     * 
     * Metamodel description:
     * <i>Class that the Signal may represent.</i>
     */
    @objid ("036bdef5-bd57-43d2-8b6e-62d4c06fadc8")
    void setBase(GeneralClass value);

    /**
     * Getter for relation 'Signal->Receiver'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2e7b0855-c19b-4158-a79a-b05df015998a")
    EList<AcceptSignalAction> getReceiver();

    /**
     * Filtered Getter for relation 'Signal->Receiver'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0b704917-6896-40b8-b8a1-dfbdf808f9ab")
    <T extends AcceptSignalAction> List<T> getReceiver(java.lang.Class<T> filterClass);

}
