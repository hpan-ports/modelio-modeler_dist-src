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
import org.modelio.metamodel.uml.infrastructure.Constraint;

@objid ("0043d1ea-c4bf-1fd8-97fe-001ec947cd2a")
public interface DurationConstraint extends Constraint {
    @objid ("89ad07fa-1b37-4d44-9c7d-86000681f51b")
    String getDurationMin();

    @objid ("9ab14501-812c-4077-a765-d2a7420da9e9")
    void setDurationMin(String value);

    @objid ("8874e982-96d7-4d4e-86c5-66ebc41d8645")
    String getDurationMax();

    @objid ("7e8f4568-c8bb-47a4-9035-f938382fefcf")
    void setDurationMax(String value);

}
