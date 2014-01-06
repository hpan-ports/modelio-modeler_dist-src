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
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.uml.behavior.activityModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;

@objid ("0037db42-c4bf-1fd8-97fe-001ec947cd2a")
public interface MessageFlow extends ActivityEdge {
    @objid ("f06ebdf4-0e42-4b76-8f6c-362ce1200f39")
    ActivityPartition getTargetPartition();

    @objid ("c7b2da81-d447-41d5-b7a0-249da988baf8")
    void setTargetPartition(ActivityPartition value);

    @objid ("2eb70c1b-ee0c-4f73-ae95-c437921986c3")
    ActivityPartition getSourcePartition();

    @objid ("7ec1e3bf-6ff6-4338-9210-0c19cd32e4e0")
    void setSourcePartition(ActivityPartition value);

}
