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
package org.modelio.metamodel.bpmn.events;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("00965cf8-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnTimerEventDefinition extends BpmnEventDefinition {
    @objid ("7a3f7544-1247-4b77-9514-0cdb210c3ea8")
    String getTimeCycle();

    @objid ("25fb1756-3309-40d2-8453-63da980590a9")
    void setTimeCycle(String value);

    @objid ("a334c78e-9058-4229-bed4-07425f9b4cf6")
    String getTimeD();

    @objid ("3fbb34b3-3be6-40d1-ac9d-2e873c64f958")
    void setTimeD(String value);

}
