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
    @objid ("3655359c-bb0c-4244-8262-18eff649565d")
    EList<CommunicationMessage> getStartToEndMessage();

    @objid ("33e3fbec-e68b-4850-9ac7-81608f6a4015")
    <T extends CommunicationMessage> List<T> getStartToEndMessage(java.lang.Class<T> filterClass);

    @objid ("d21d62c1-1f94-4a35-8221-5099aa9388ca")
    Link getChannel();

    @objid ("2ce4ff5b-5699-4e86-8118-05b1d8ee6b8f")
    void setChannel(Link value);

    @objid ("f7dfcd9b-97df-4bd4-9a8f-b0f4a9eb40b8")
    CommunicationNode getStart();

    @objid ("9b9177b8-438e-403d-8564-68885dcce379")
    void setStart(CommunicationNode value);

    @objid ("5b43d6e5-6a30-4cd8-86d1-16744a897270")
    NaryLink getNaryChannel();

    @objid ("89e2d4bc-72cf-4730-a654-4a8ccb92a1d9")
    void setNaryChannel(NaryLink value);

    @objid ("e7c048fc-cb16-4425-b6ef-13744d18034e")
    EList<CommunicationMessage> getEndToStartMessage();

    @objid ("d00913c7-3198-431a-99ba-87a03e161176")
    <T extends CommunicationMessage> List<T> getEndToStartMessage(java.lang.Class<T> filterClass);

    @objid ("33e411e9-0e79-4e10-823b-9b4ffc355811")
    CommunicationNode getEnd();

    @objid ("3b42f23a-2053-4c76-b2d9-ce691f1b0aa7")
    void setEnd(CommunicationNode value);

}
