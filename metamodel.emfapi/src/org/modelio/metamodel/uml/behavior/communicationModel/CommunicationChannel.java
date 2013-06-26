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
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.NaryLink;

@objid ("5451d474-f72f-46a9-b8b5-35997413d584")
public interface CommunicationChannel extends ModelElement {
    @objid ("ba8ed6b7-7dc4-4caf-b0b9-259097d9b338")
    EList<CommunicationMessage> getStartToEndMessage();

    @objid ("72a34a2b-8985-44ef-840b-3f9558ef4eb4")
    <T extends CommunicationMessage> List<T> getStartToEndMessage(java.lang.Class<T> filterClass);

    @objid ("0bd111b3-b7cd-4a35-95ef-6288d5680949")
    Link getChannel();

    @objid ("b6e33911-0422-4619-b784-d3508ea83158")
    void setChannel(Link value);

    @objid ("0afba48c-f676-45ac-9128-32070e231957")
    CommunicationNode getStart();

    @objid ("ae5a0ad5-039b-48f7-8fb1-9a7f02856161")
    void setStart(CommunicationNode value);

    @objid ("85628e19-79ba-4986-8823-fc843ece400f")
    NaryLink getNaryChannel();

    @objid ("64b5a62e-6a89-4e14-acab-e26fea2fb1c6")
    void setNaryChannel(NaryLink value);

    @objid ("599c11c2-4754-48b4-ab58-d290926ae7ee")
    EList<CommunicationMessage> getEndToStartMessage();

    @objid ("d9ed2988-04c5-4d24-827a-ed862146bbe1")
    <T extends CommunicationMessage> List<T> getEndToStartMessage(java.lang.Class<T> filterClass);

    @objid ("7875576e-ef4c-4687-8b8b-1bcec764fef6")
    CommunicationNode getEnd();

    @objid ("f202b366-46b5-4488-9ae3-bfa1898512b2")
    void setEnd(CommunicationNode value);

}
