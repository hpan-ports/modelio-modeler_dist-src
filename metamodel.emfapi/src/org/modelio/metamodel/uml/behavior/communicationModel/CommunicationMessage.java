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
    @objid ("04f8baa8-fb32-43b6-8f73-e9b20b22f610")
    String getArgument();

    @objid ("8fca4ae4-9209-4c33-9420-535404f5ddc9")
    void setArgument(String value);

    @objid ("7ccaec6c-0ec4-470d-bd29-272ab81dde39")
    String getSequence();

    @objid ("3f1df48b-ea10-4065-b03c-4d8e825ecac6")
    void setSequence(String value);

    @objid ("138899cd-d0a8-44a8-a9dd-2bd043a2e8da")
    MessageSort getSortOfMessage();

    @objid ("891045e0-eb79-4e53-9b1e-8b7847251736")
    void setSortOfMessage(MessageSort value);

    @objid ("11bc16d5-8306-409f-aced-1ef474d3500e")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("cd3fcc44-b23d-4905-857e-3d1093002541")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

    @objid ("71572fed-b005-404e-bd2f-dd539b218fea")
    CommunicationChannel getChannel();

    @objid ("31ed436a-92a3-4442-90c8-08b95b7cd85c")
    void setChannel(CommunicationChannel value);

    @objid ("b217c719-836c-469b-9e06-556ba2749618")
    CommunicationChannel getInvertedChannel();

    @objid ("e4bc501a-dc93-4f10-abf0-40646b98260a")
    void setInvertedChannel(CommunicationChannel value);

    @objid ("35b2c489-f88f-4587-87f5-1966edd15645")
    Operation getInvoked();

    @objid ("ed0c8b4f-8199-41cf-bd75-0bf1cc7f345f")
    void setInvoked(Operation value);

    @objid ("345182df-c91a-4e90-b0cd-6e3fd986c489")
    Signal getSignalSignature();

    @objid ("8fd0d600-1911-4ec1-9c7b-8f7b1c139649")
    void setSignalSignature(Signal value);

}
