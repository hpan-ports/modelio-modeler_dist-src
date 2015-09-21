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
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Goal;

/**
 * GoalContainer v0.0.9054
 * 
 * 
 * null
 */
@objid ("37c1a4e9-5d7e-4442-9d86-e66dd60b684c")
public interface GoalContainer extends AnalystContainer {
    @objid ("f74a0b6b-a5d3-41fc-8282-40bbe1d957b1")
    public static final String MNAME = "GoalContainer";

    /**
     * Getter for relation 'GoalContainer->OwnedGoal'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e481feb3-0352-4c3a-9bfb-6ec61eecd4e9")
    EList<Goal> getOwnedGoal();

    /**
     * Filtered Getter for relation 'GoalContainer->OwnedGoal'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("16096e1c-fa14-44a4-ab01-3217f451ac22")
    <T extends Goal> List<T> getOwnedGoal(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'GoalContainer->OwnerContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6f8ef169-1cbe-48d9-a35d-cdb0b31d62fa")
    GoalContainer getOwnerContainer();

    /**
     * Setter for relation 'GoalContainer->OwnerContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4a38f53f-7236-410a-b44b-8d0029ff2acc")
    void setOwnerContainer(GoalContainer value);

    /**
     * Getter for relation 'GoalContainer->OwnedContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bb5aa669-918c-4400-8fa0-f7fbe95ea781")
    EList<GoalContainer> getOwnedContainer();

    /**
     * Filtered Getter for relation 'GoalContainer->OwnedContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("634e6f90-7090-4b56-b9e5-0249e21e7250")
    <T extends GoalContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'GoalContainer->OwnerProject'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("67fad5af-d29c-4f9f-ae74-20de3842a436")
    AnalystProject getOwnerProject();

    /**
     * Setter for relation 'GoalContainer->OwnerProject'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2ad65b36-3ab0-417e-8293-059c573eb6fa")
    void setOwnerProject(AnalystProject value);

}
