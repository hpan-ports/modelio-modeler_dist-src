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
package org.modelio.metamodel.uml.behavior.activityModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;

@objid ("0037db42-c4bf-1fd8-97fe-001ec947cd2a")
public interface MessageFlow extends ActivityEdge {
    @objid ("8fc0e316-45d4-4899-aad5-f6a22aff5e64")
    ActivityPartition getTargetPartition();

    @objid ("8efeb583-6816-4ab3-90ab-9febe7e3ba0b")
    void setTargetPartition(ActivityPartition value);

    @objid ("e40f9a4d-a3cc-496f-bfef-fbf61e270832")
    ActivityPartition getSourcePartition();

    @objid ("ccce1856-9068-4b72-860c-3451b8f37c39")
    void setSourcePartition(ActivityPartition value);

}
