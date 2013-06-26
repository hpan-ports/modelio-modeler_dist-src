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
package org.modelio.metamodel.bpmn.events;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("00965cf8-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnTimerEventDefinition extends BpmnEventDefinition {
    @objid ("71a54f6c-db47-4212-a695-22dfcea0df6a")
    String getTimeCycle();

    @objid ("c46a4450-c0ae-40bd-a672-643101913330")
    void setTimeCycle(String value);

    @objid ("bcd018fd-fe0b-45b8-bf8e-1e6f00730468")
    String getTimeD();

    @objid ("b5e4554f-d597-4502-a05d-a34d9a459e3d")
    void setTimeD(String value);

}
