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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityGroup;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;

@objid ("0026094e-c4bf-1fd8-97fe-001ec947cd2a")
public interface Activity extends Behavior {
    @objid ("abb25070-f4db-443c-a5df-f6c3414e9fc3")
    boolean isIsSingleExecution();

    @objid ("ef493d6f-4578-4207-abb2-836c4a882fc9")
    void setIsSingleExecution(boolean value);

    @objid ("3f0bf8ad-7ec7-46be-926e-f21a21618796")
    boolean isIsReadOnly();

    @objid ("07dd5692-efb7-43e6-ad1e-188a131e89d9")
    void setIsReadOnly(boolean value);

    @objid ("bba2c556-c12b-4af2-97e4-a168272518e5")
    EList<ActivityGroup> getOwnedGroup();

    @objid ("1d0e34f7-47bd-4713-8d58-042128c79808")
    <T extends ActivityGroup> List<T> getOwnedGroup(java.lang.Class<T> filterClass);

    @objid ("92919846-bf70-43cc-ad37-84cffdd2637d")
    EList<ActivityNode> getOwnedNode();

    @objid ("bf20fc05-6a8d-412e-a0f1-527ab4f6abd5")
    <T extends ActivityNode> List<T> getOwnedNode(java.lang.Class<T> filterClass);

}
