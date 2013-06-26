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
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Goal;

@objid ("37c1a4e9-5d7e-4442-9d86-e66dd60b684c")
public interface GoalContainer extends AnalystContainer {
    @objid ("937da1b9-dc8d-41eb-9fec-68729b124cd5")
    EList<Goal> getOwnedGoal();

    @objid ("3e99f404-95b9-475c-b093-885d72d2fa12")
    <T extends Goal> List<T> getOwnedGoal(java.lang.Class<T> filterClass);

    @objid ("a3e01a23-67a1-4d0d-bffb-9b2d49d562be")
    GoalContainer getOwnerContainer();

    @objid ("c90874ce-71b0-4735-86a5-a704330e3bf2")
    void setOwnerContainer(GoalContainer value);

    @objid ("2778f31f-4c59-420b-b030-8e1931cef013")
    EList<GoalContainer> getOwnedContainer();

    @objid ("a14e7daa-44bc-4d87-8035-de71caf7e282")
    <T extends GoalContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    @objid ("d0864e97-4e48-4875-830d-dede96ec409c")
    AnalystProject getOwnerProject();

    @objid ("17f9ad4c-98ff-41df-98d4-26fa77fd00f1")
    void setOwnerProject(AnalystProject value);

}
