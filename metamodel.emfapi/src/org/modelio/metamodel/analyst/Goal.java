/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.GoalContainer;

/**
 * Goal v0.0.9054
 * 
 * 
 * null
 */
@objid ("27409471-f678-4fe5-b443-f3d418f746a1")
public interface Goal extends AnalystElement {
    @objid ("023e966a-133c-49de-8519-d1fddff033dd")
    public static final String MNAME = "Goal";

    /**
     * Getter for relation 'Goal->SubGoal'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("eaa19297-179b-429f-8a35-b8381b02cf82")
    EList<Goal> getSubGoal();

    /**
     * Filtered Getter for relation 'Goal->SubGoal'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4454c345-b3bc-41c0-9546-c21436368dbd")
    <T extends Goal> List<T> getSubGoal(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Goal->OwnerContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ac7b0b0a-dd5f-4c82-aa90-4ae9f0da5bad")
    GoalContainer getOwnerContainer();

    /**
     * Setter for relation 'Goal->OwnerContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1f49c4c2-1400-4032-9eab-af107a07f352")
    void setOwnerContainer(GoalContainer value);

    /**
     * Getter for relation 'Goal->ParentGoal'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("de6b24d3-f22b-4987-8338-718b51e85c2e")
    Goal getParentGoal();

    /**
     * Setter for relation 'Goal->ParentGoal'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("764acffb-386a-401e-8cf7-0ce4b52c256b")
    void setParentGoal(Goal value);

    /**
     * Getter for relation 'Goal->LastGoalVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("42e5ceee-85e4-4c9b-9982-edabcc497d32")
    Goal getLastGoalVersion();

    /**
     * Setter for relation 'Goal->LastGoalVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3baf9534-0ff2-435a-86cf-f5b6c8d99453")
    void setLastGoalVersion(Goal value);

    /**
     * Getter for relation 'Goal->ArchivedGoalVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8c2e5ec9-c0a2-4945-a7ba-d64498200d96")
    EList<Goal> getArchivedGoalVersion();

    /**
     * Filtered Getter for relation 'Goal->ArchivedGoalVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8121198c-1552-4dee-9fd0-bac7ddfe5e7c")
    <T extends Goal> List<T> getArchivedGoalVersion(java.lang.Class<T> filterClass);

}
