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
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.NaryLink;

@objid ("5451d474-f72f-46a9-b8b5-35997413d584")
public interface CommunicationChannel extends ModelElement {
    @objid ("00ab8fba-90f3-454c-b0b9-9a4d369d6003")
    EList<CommunicationMessage> getStartToEndMessage();

    @objid ("4a5bc9a4-184e-4b25-8862-323eb99c6b7c")
    <T extends CommunicationMessage> List<T> getStartToEndMessage(java.lang.Class<T> filterClass);

    @objid ("9ecf0151-7311-47e5-a7fc-a142d28ded35")
    Link getChannel();

    @objid ("5a871567-66d3-4f8c-ae5b-597ab8e8c34b")
    void setChannel(Link value);

    @objid ("76d50006-6436-4ed8-abc8-c60736192d0e")
    CommunicationNode getStart();

    @objid ("320a488a-6dae-47b0-acbd-6ddaa3676aff")
    void setStart(CommunicationNode value);

    @objid ("4ef7b594-acc5-4d3c-8e8a-59bb927917ff")
    NaryLink getNaryChannel();

    @objid ("c26f18da-6362-40d9-ac50-855f6acff5e6")
    void setNaryChannel(NaryLink value);

    @objid ("2103ab2b-fa8b-4544-af23-f89a86be8d8d")
    EList<CommunicationMessage> getEndToStartMessage();

    @objid ("cafc86cb-df9f-4c97-8c30-cfbb5d7a2b6b")
    <T extends CommunicationMessage> List<T> getEndToStartMessage(java.lang.Class<T> filterClass);

    @objid ("b8613be4-a3bf-4700-a278-8a5e97faed32")
    CommunicationNode getEnd();

    @objid ("06c6a394-4335-47df-ad24-97fd7f1770f0")
    void setEnd(CommunicationNode value);

}
