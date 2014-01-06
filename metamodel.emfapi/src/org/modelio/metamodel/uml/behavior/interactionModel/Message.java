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
package org.modelio.metamodel.uml.behavior.interactionModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageKind;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageSort;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("00493ff4-c4bf-1fd8-97fe-001ec947cd2a")
public interface Message extends ModelElement {
    @objid ("761798b9-d7f6-4596-89c2-bb0c67e8d76d")
    String getArgument();

    @objid ("52e573e0-0829-4c4f-b6da-adc36eae5941")
    void setArgument(String value);

    @objid ("db52540e-4131-4e4b-9300-7b9c3fff2b66")
    MessageKind getKindOfMessage();

    @objid ("b3ad5712-daf2-45a3-9706-0416191c0ba8")
    void setKindOfMessage(MessageKind value);

    @objid ("7dfcf13a-f13e-418a-9a34-0a772d698e00")
    MessageSort getSortOfMessage();

    @objid ("87bd5bd5-36c0-458b-96c1-ceb5d1024dd1")
    void setSortOfMessage(MessageSort value);

    @objid ("9b7161b8-913a-4382-a217-f7657ebc2c5e")
    Signal getSignalSignature();

    @objid ("3907c990-4758-41b7-8f17-597b2fc7d969")
    void setSignalSignature(Signal value);

    @objid ("1201f869-c364-40ea-9f36-2be37bf11563")
    MessageEnd getReceiveEvent();

    @objid ("8d29692f-eabd-41a7-8153-f9f74553a23a")
    void setReceiveEvent(MessageEnd value);

    @objid ("0fb8579b-19d4-43b0-bded-9825007507a9")
    MessageEnd getSendEvent();

    @objid ("e54617e3-3864-4bef-a086-341ac0f485b0")
    void setSendEvent(MessageEnd value);

    @objid ("9682f5c0-2594-4b23-92dd-63876f9df879")
    Operation getInvoked();

    @objid ("2e843d99-e21c-4788-8de7-cdd13e04e6ef")
    void setInvoked(Operation value);

    @objid ("9b047b4e-8885-414d-976a-183441151722")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("9757ec6b-8911-4a6e-9c2a-bf6ca1d31f5a")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

}
