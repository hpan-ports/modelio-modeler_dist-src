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
package org.modelio.metamodel.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;

@objid ("00366bf4-c4bf-1fd8-97fe-001ec947cd2a")
public interface InterruptibleActivityRegion extends ActivityGroup {
    @objid ("5818238c-5eae-4e9c-819e-5776bf9f3901")
    EList<ActivityEdge> getInterruptingEdge();

    @objid ("c4a96235-42e6-4a5f-a074-cab8f53dbb4d")
    <T extends ActivityEdge> List<T> getInterruptingEdge(java.lang.Class<T> filterClass);

}
