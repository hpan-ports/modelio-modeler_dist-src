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

@objid ("004b7b34-c4bf-1fd8-97fe-001ec947cd2a")
public interface StateInvariant extends OccurrenceSpecification {
    @objid ("7d0143e2-0404-4dea-9bd8-6916b44a28b3")
    String getBody();

    @objid ("c071e365-555e-4ea8-9d59-95175facb24e")
    void setBody(String value);

    @objid ("fa51f81c-3d8e-4676-9d44-a02dd93b85f5")
    int getEndLineNumber();

    @objid ("722bc203-458c-435b-981a-ecc9cd8d3053")
    void setEndLineNumber(int value);

}
