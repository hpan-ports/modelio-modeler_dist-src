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
    @objid ("562053e8-f416-43da-aad3-8d7f45c2d988")
    String getArgument();

    @objid ("3eedbe5a-b78c-4b21-8801-5fe4ff1ab6da")
    void setArgument(String value);

    @objid ("ec0f2e77-e2ac-4a5d-84c7-6dd1eb8bc7d0")
    MessageKind getKindOfMessage();

    @objid ("eaa6bfca-eb70-4c86-8dbf-7282d373a550")
    void setKindOfMessage(MessageKind value);

    @objid ("19552f5a-32b7-4ed4-9c5e-f825d4e96305")
    MessageSort getSortOfMessage();

    @objid ("7216ebcc-94c8-445a-b37f-20d2e0705084")
    void setSortOfMessage(MessageSort value);

    @objid ("4c233c6a-6a0b-4a32-84bb-e693aa566774")
    Signal getSignalSignature();

    @objid ("f2ba5b75-d809-4618-bd33-7835b87caf51")
    void setSignalSignature(Signal value);

    @objid ("95320b87-4b96-495f-b42d-7dc30baf99b7")
    MessageEnd getReceiveEvent();

    @objid ("a7c0d271-c045-458a-862d-f3b112d1dcd3")
    void setReceiveEvent(MessageEnd value);

    @objid ("50780707-3039-465e-98bd-198162498194")
    MessageEnd getSendEvent();

    @objid ("1b6c1174-f920-4078-9a4e-84a2984abb55")
    void setSendEvent(MessageEnd value);

    @objid ("6d8e5074-aa8a-415b-9469-536e01b517ac")
    Operation getInvoked();

    @objid ("6fdf2b8a-eb84-49b6-aac2-56fc453cb115")
    void setInvoked(Operation value);

    @objid ("6a3f8425-8e94-4b00-9949-c6acce21f940")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("428cebc9-5882-466a-a210-7b64b6fe514d")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

}
