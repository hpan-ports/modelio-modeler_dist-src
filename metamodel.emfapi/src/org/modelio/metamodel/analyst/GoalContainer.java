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
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Goal;

@objid ("37c1a4e9-5d7e-4442-9d86-e66dd60b684c")
public interface GoalContainer extends AnalystContainer {
    @objid ("9ba294f1-99ac-4f84-abf7-d41ef49b28f4")
    EList<Goal> getOwnedGoal();

    @objid ("5499ab92-f469-4c70-84ae-dac4da45c128")
    <T extends Goal> List<T> getOwnedGoal(java.lang.Class<T> filterClass);

    @objid ("3e6f2293-97a7-447a-9b5c-066a50ac137b")
    GoalContainer getOwnerContainer();

    @objid ("17a538ca-e0be-4601-a36e-87cdb7aaa697")
    void setOwnerContainer(GoalContainer value);

    @objid ("c9caee46-f5f5-45bd-916c-adf607920a0a")
    EList<GoalContainer> getOwnedContainer();

    @objid ("1ce46ead-ec7a-4fcb-a5e6-72c7265c6488")
    <T extends GoalContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    @objid ("04b8a416-784c-4a61-b710-0af607e48aba")
    AnalystProject getOwnerProject();

    @objid ("c8db1fcb-5df3-453b-90ea-f1d5a32749b3")
    void setOwnerProject(AnalystProject value);

}
