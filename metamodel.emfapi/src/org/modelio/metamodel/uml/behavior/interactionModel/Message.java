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
    @objid ("08a6b557-62f0-4d0a-97cc-33d998c6570e")
    String getArgument();

    @objid ("2094ce76-d65d-4793-aafb-de69572551ec")
    void setArgument(String value);

    @objid ("da639035-6775-4048-9da2-baecdf28d212")
    MessageKind getKindOfMessage();

    @objid ("ef2ac758-e81a-4cee-a98c-eede80579c88")
    void setKindOfMessage(MessageKind value);

    @objid ("dc4abf5b-5476-411d-b77f-72f510cf1a59")
    MessageSort getSortOfMessage();

    @objid ("7051860b-8c9b-47e3-a6a3-c638e095598d")
    void setSortOfMessage(MessageSort value);

    @objid ("b63e4bc7-a095-4c05-b587-3155bc671a7e")
    Signal getSignalSignature();

    @objid ("9cba191f-0461-4fff-8036-807af65c7d02")
    void setSignalSignature(Signal value);

    @objid ("73bf0058-5227-48ce-b586-0039d9cefeb3")
    MessageEnd getReceiveEvent();

    @objid ("084d37ae-9d25-47ff-9c0b-bfd6c0bdb975")
    void setReceiveEvent(MessageEnd value);

    @objid ("bbfc0dd7-9a9a-44ac-8b1e-e225fb907093")
    MessageEnd getSendEvent();

    @objid ("6c34d074-860b-453b-8383-a374c7d55cd2")
    void setSendEvent(MessageEnd value);

    @objid ("ad491d9e-da93-4157-9266-b81cd4f3abe4")
    Operation getInvoked();

    @objid ("1a13faeb-bab3-4005-a1ec-dad4255d54ad")
    void setInvoked(Operation value);

    @objid ("5988d505-8991-43ab-9d09-059853925ff7")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("c502794c-aa76-485a-a3c0-041b812effad")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

}
