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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;

@objid ("0049cc1c-c4bf-1fd8-97fe-001ec947cd2a")
public interface MessageEnd extends OccurrenceSpecification {
    @objid ("805e58c0-d875-4023-b58e-23e33111a961")
    Message getReceivedMessage();

    @objid ("71c550be-af46-4456-b9e3-74e548dfb6ff")
    void setReceivedMessage(Message value);

    @objid ("9d457afb-2490-4868-b409-75556fe89f49")
    Message getSentMessage();

    @objid ("adb539ff-09dd-4901-9be1-43883af2204c")
    void setSentMessage(Message value);

}
