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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;

@objid ("003df874-c4bf-1fd8-97fe-001ec947cd2a")
public interface StructuredActivityNode extends ActivityAction {
    @objid ("221e0cac-b0ba-474f-a977-d562b0b0f109")
    boolean isMustIsolate();

    @objid ("a57467b8-35d9-494b-a6aa-e4567ef5cd5d")
    void setMustIsolate(boolean value);

    @objid ("12a29d99-d7f5-493f-accc-28c6525853af")
    EList<ActivityNode> getBody();

    @objid ("13c3d010-52f2-4930-a5e8-1ca7a1403ada")
    <T extends ActivityNode> List<T> getBody(java.lang.Class<T> filterClass);

}
