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
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.GoalContainer;

@objid ("27409471-f678-4fe5-b443-f3d418f746a1")
public interface Goal extends AnalystElement {
    @objid ("ce0c7c9b-0b5f-4c85-8f36-b20af8b244ba")
    EList<Goal> getSubGoal();

    @objid ("3db9617e-3efc-476c-a055-55b0d2fec5a6")
    <T extends Goal> List<T> getSubGoal(java.lang.Class<T> filterClass);

    @objid ("c5fe3992-810f-4c2a-9dbc-78c4ca766a89")
    GoalContainer getOwnerContainer();

    @objid ("bde6d5de-8214-40a6-b8e4-77c5d9f15ada")
    void setOwnerContainer(GoalContainer value);

    @objid ("14893f21-92f5-455f-ae8b-d2f2a01de6c1")
    Goal getParentGoal();

    @objid ("ddf836e9-05b5-4b27-8163-43b67b07b3a7")
    void setParentGoal(Goal value);

    @objid ("f287a612-e30f-4eba-a662-e2fccb43db07")
    Goal getLastGoalVersion();

    @objid ("7ec4656b-6e33-43ee-8083-ddd6e16bce5d")
    void setLastGoalVersion(Goal value);

    @objid ("97a7830a-6bdd-41e9-ae7c-e9f8ac8533b9")
    EList<Goal> getArchivedGoalVersion();

    @objid ("e9416768-32fa-4d75-b14d-9d8b083b7c71")
    <T extends Goal> List<T> getArchivedGoalVersion(java.lang.Class<T> filterClass);

}
