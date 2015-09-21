/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.uml.behavior.usecaseModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.GeneralClass;

/**
 * Actor v0.0.9054
 * 
 * 
 * An Actor is an idealization of an external person, process or thing interacting with a system, subsystem or class. An Actor characterizes the interactions that outside users may have with the system. An Actor may be a human, an external software component or a device that cooperates with the system.  
 * 
 * Actors can have Communication links with UseCases. They can also communicate with other Actors (Modelio extension to UML).  
 * 
 * Actors can appear in sequence diagrams (see Example2) or collaboration diagrams, where accurate communication with the system's objects is shown. 
 * 
 * An Actor is a specific kind of Classifier. An Actor can have Generalization links with other Actors, can have Attributes and even Operations. 
 * 
 * In Modelio, an Actor physically belongs to a NameSpace that must be a Package.
 */
@objid ("0058115a-c4bf-1fd8-97fe-001ec947cd2a")
public interface Actor extends GeneralClass {
    @objid ("d9365062-d5be-407d-adbc-9645236c01e0")
    public static final String MNAME = "Actor";

}
