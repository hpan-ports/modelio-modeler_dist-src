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
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Goal;

@objid ("37c1a4e9-5d7e-4442-9d86-e66dd60b684c")
public interface GoalContainer extends AnalystContainer {
    @objid ("938607f1-1a0e-403e-95ff-58c80bdbbed3")
    EList<Goal> getOwnedGoal();

    @objid ("d7ea113a-c54a-4a63-b4bf-1c3f04d815c7")
    <T extends Goal> List<T> getOwnedGoal(java.lang.Class<T> filterClass);

    @objid ("f9d4b9d0-d351-4489-9cef-1df94dd9024a")
    GoalContainer getOwnerContainer();

    @objid ("cb59cee2-b7c4-439f-8530-6fe22d3cafa0")
    void setOwnerContainer(GoalContainer value);

    @objid ("71b6602a-8219-48d1-a71e-ffddc2246e5c")
    EList<GoalContainer> getOwnedContainer();

    @objid ("4e31c7d4-d7b2-4eb7-b653-67e4cd72eca7")
    <T extends GoalContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    @objid ("4c7003c1-9c44-4fb2-8f4d-3728676162ad")
    AnalystProject getOwnerProject();

    @objid ("284e26df-9dbb-43fb-ad31-e63d1abb4043")
    void setOwnerProject(AnalystProject value);

}
