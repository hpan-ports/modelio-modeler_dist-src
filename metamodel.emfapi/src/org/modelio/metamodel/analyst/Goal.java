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
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.GoalContainer;

@objid ("27409471-f678-4fe5-b443-f3d418f746a1")
public interface Goal extends AnalystElement {
    @objid ("04661953-ca36-4e38-92fd-c4a9eaa471d8")
    int getVersion();

    @objid ("736f9601-017e-4867-a487-108beb479309")
    void setVersion(int value);

    @objid ("247be263-5959-4918-b0c2-f18fa653bb0f")
    EList<Goal> getSubGoal();

    @objid ("031e7e1d-5446-4d12-95d0-58a2f643d946")
    <T extends Goal> List<T> getSubGoal(java.lang.Class<T> filterClass);

    @objid ("b52a423f-f68d-413b-ab61-eae9cb24232e")
    GoalContainer getOwnerContainer();

    @objid ("167453fe-2652-411b-886b-ec3e0350b5e5")
    void setOwnerContainer(GoalContainer value);

    @objid ("f280af18-8d26-4847-908d-5e6430adcb1f")
    Goal getParentGoal();

    @objid ("33430e00-8cf7-4fd0-a0a1-9374ef409a54")
    void setParentGoal(Goal value);

    @objid ("004841ad-ff06-4a6f-b306-4b1aa93d655f")
    Goal getLastGoalVersion();

    @objid ("b96b3ba4-4243-41aa-83a4-d9409627903b")
    void setLastGoalVersion(Goal value);

    @objid ("3c3c7934-f934-49cb-ae94-8ceb8c9ccb4d")
    EList<Goal> getArchivedGoalVersion();

    @objid ("4593e500-42b4-43c0-986e-c743eaf3f901")
    <T extends Goal> List<T> getArchivedGoalVersion(java.lang.Class<T> filterClass);

}
