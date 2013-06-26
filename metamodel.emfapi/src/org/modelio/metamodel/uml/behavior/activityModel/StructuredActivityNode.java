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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;

@objid ("003df874-c4bf-1fd8-97fe-001ec947cd2a")
public interface StructuredActivityNode extends ActivityAction {
    @objid ("0c835786-54cd-4014-b8a3-52263dba1030")
    boolean isMustIsolate();

    @objid ("414beb5f-04c9-4dc9-a7a1-e549ac3e9d5a")
    void setMustIsolate(boolean value);

    @objid ("9b4b2e12-4f15-48cd-af0a-d754e38c85e5")
    EList<ActivityNode> getBody();

    @objid ("d6fd23bf-e937-4562-a066-1fd8dd1e99f5")
    <T extends ActivityNode> List<T> getBody(java.lang.Class<T> filterClass);

}
