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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;

@objid ("0049cc1c-c4bf-1fd8-97fe-001ec947cd2a")
public interface MessageEnd extends OccurrenceSpecification {
    @objid ("e6c2264e-c736-4249-b379-d6f47c933c4c")
    Message getReceivedMessage();

    @objid ("c3007283-47fc-432b-bf8f-29650c5c25a1")
    void setReceivedMessage(Message value);

    @objid ("ccce6ba3-6b42-4225-a7c8-0856786b0397")
    Message getSentMessage();

    @objid ("c19c812d-252d-4ac3-ae44-64b0c8eb4fb8")
    void setSentMessage(Message value);

}
