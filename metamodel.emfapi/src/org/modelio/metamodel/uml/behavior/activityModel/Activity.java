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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityGroup;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;

@objid ("0026094e-c4bf-1fd8-97fe-001ec947cd2a")
public interface Activity extends Behavior {
    @objid ("ac3824e7-ae44-43fc-bcef-cc74c46acc6f")
    boolean isIsSingleExecution();

    @objid ("2e11f2c6-0be9-45f3-b833-774420d83988")
    void setIsSingleExecution(boolean value);

    @objid ("07106601-0ac6-4de0-b965-24df2e8df9cd")
    boolean isIsReadOnly();

    @objid ("cfc5bfa2-87c0-44bc-911a-d67c6d231621")
    void setIsReadOnly(boolean value);

    @objid ("bf99fb62-3b5a-4d88-9622-51ec0434a44d")
    EList<ActivityGroup> getOwnedGroup();

    @objid ("05db418b-8bdc-4862-92cf-2bb91d493a21")
    <T extends ActivityGroup> List<T> getOwnedGroup(java.lang.Class<T> filterClass);

    @objid ("cb71eb85-1029-49e5-a9b5-5e65e9f76056")
    EList<ActivityNode> getOwnedNode();

    @objid ("298ad041-f383-4c10-b1f6-2f6e1a705c15")
    <T extends ActivityNode> List<T> getOwnedNode(java.lang.Class<T> filterClass);

}
