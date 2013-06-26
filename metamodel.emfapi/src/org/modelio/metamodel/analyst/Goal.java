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
import org.modelio.metamodel.analyst.GoalContainer;

@objid ("27409471-f678-4fe5-b443-f3d418f746a1")
public interface Goal extends AnalystElement {
    @objid ("3d2ec9fd-cb71-45f4-ab6f-8c0f2a28ab91")
    EList<Goal> getSubGoal();

    @objid ("56bb8d14-b06c-4357-b08a-603dba0fbf3c")
    <T extends Goal> List<T> getSubGoal(java.lang.Class<T> filterClass);

    @objid ("b82954fd-e702-411a-887c-bc1e42d847cf")
    GoalContainer getOwnerContainer();

    @objid ("311e0772-ddae-4ba2-bb84-6daa7520a091")
    void setOwnerContainer(GoalContainer value);

    @objid ("d687565c-914c-4068-bf01-b84243fcfc47")
    Goal getParentGoal();

    @objid ("89edf034-e60a-4768-874d-86e0de4a4070")
    void setParentGoal(Goal value);

}
