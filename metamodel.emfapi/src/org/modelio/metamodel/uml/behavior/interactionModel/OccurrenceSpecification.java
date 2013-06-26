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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.interactionModel.GeneralOrdering;

@objid ("004a586c-c4bf-1fd8-97fe-001ec947cd2a")
public interface OccurrenceSpecification extends InteractionFragment {
    @objid ("e5f3f208-e3e4-4e7c-86b3-283f17821cf4")
    EList<GeneralOrdering> getToAfter();

    @objid ("6cfe1da4-2008-4f34-906d-bd532a4db0c8")
    <T extends GeneralOrdering> List<T> getToAfter(java.lang.Class<T> filterClass);

    @objid ("3b42bc63-c300-4b01-8ea8-d3c66f8a0785")
    EList<GeneralOrdering> getToBefore();

    @objid ("ed982ca1-22a6-44f5-896f-c554eaeb216c")
    <T extends GeneralOrdering> List<T> getToBefore(java.lang.Class<T> filterClass);

}
