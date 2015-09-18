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
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;

@objid ("00444a76-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExecutionOccurenceSpecification extends MessageEnd {
    @objid ("7b09b071-4d8a-49cb-9f57-b5e6c9772b82")
    ExecutionSpecification getFinished();

    @objid ("939f7917-e22d-4405-a1e1-3c5ec4d854b5")
    void setFinished(ExecutionSpecification value);

    @objid ("9a93937e-0508-4e9e-8dff-2b55accc1a9e")
    ExecutionSpecification getStarted();

    @objid ("604981ab-3e6a-4f2b-b51f-35fd31fe57c6")
    void setStarted(ExecutionSpecification value);

}
