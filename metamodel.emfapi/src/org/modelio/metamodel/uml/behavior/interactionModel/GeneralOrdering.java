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
import org.modelio.metamodel.uml.behavior.interactionModel.OccurrenceSpecification;
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("0045de18-c4bf-1fd8-97fe-001ec947cd2a")
public interface GeneralOrdering extends Element {
    @objid ("846f440a-40ae-41cf-99d5-16f51c555297")
    OccurrenceSpecification getBefore();

    @objid ("ff89d888-234f-4118-9459-2b683cf8a38a")
    void setBefore(OccurrenceSpecification value);

    @objid ("e05b9be9-fa74-4dad-869a-611c99e69472")
    OccurrenceSpecification getAfter();

    @objid ("9f513c0b-13bb-41d7-b5fd-ab135b280a6f")
    void setAfter(OccurrenceSpecification value);

}
