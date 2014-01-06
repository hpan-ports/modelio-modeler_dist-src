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
    @objid ("b91f2e8b-fc2c-4080-98de-9449db0901c3")
    String getArgument();

    @objid ("1497596c-8a15-487e-8a67-283dca7cd827")
    void setArgument(String value);

    @objid ("580168f2-02c5-4ce8-b13f-0af4d90a0dd5")
    String getSequence();

    @objid ("949251c1-ba95-4a57-9fbd-12cfbf56429a")
    void setSequence(String value);

    @objid ("91764407-a8e6-4b61-a9bb-fb97911fee80")
    MessageSort getSortOfMessage();

    @objid ("f34511ad-e006-40a0-a880-f8c057d43e0c")
    void setSortOfMessage(MessageSort value);

    @objid ("5b01ee30-d0f1-4277-bf6b-2fd2e0a923f1")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("b3528ba8-75b7-44af-a752-72480f389c89")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

    @objid ("5389863a-828f-43ed-8575-39e9e8fc7bb1")
    CommunicationChannel getChannel();

    @objid ("233b01b6-99cd-47ab-82c4-b0462ba36299")
    void setChannel(CommunicationChannel value);

    @objid ("2c783b70-65b8-4666-b45c-24166a5e1b31")
    CommunicationChannel getInvertedChannel();

    @objid ("7bfc8646-e721-4c1d-8feb-229b115f579b")
    void setInvertedChannel(CommunicationChannel value);

    @objid ("4bb7a290-a51b-4248-b30a-fdcb6768e8d3")
    Operation getInvoked();

    @objid ("8cb4b42a-080b-409c-8698-6c9ee88adaeb")
    void setInvoked(Operation value);

    @objid ("43115541-1b00-4ef3-9737-19cb1e13972a")
    Signal getSignalSignature();

    @objid ("bf69b563-2cd4-4c14-9ea9-e4c2e6a05446")
    void setSignalSignature(Signal value);

}
