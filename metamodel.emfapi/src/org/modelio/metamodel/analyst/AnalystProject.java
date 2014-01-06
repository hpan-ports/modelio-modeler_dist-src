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
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0061ba52-c4bf-1fd8-97fe-001ec947cd2a")
public interface AnalystProject extends ModelElement {
    @objid ("4c803169-7f77-4614-bdc1-e11a6bc9cb4d")
    PropertyContainer getPropertyRoot();

    @objid ("ba0199e0-934f-4040-8d30-3fc4503968c8")
    void setPropertyRoot(PropertyContainer value);

    @objid ("9b446f82-82a9-48a6-acce-bf8880c26c9d")
    EList<GoalContainer> getGoalRoot();

    @objid ("f66ecd36-575e-4553-bcc6-3dd2925ad6a4")
    <T extends GoalContainer> List<T> getGoalRoot(java.lang.Class<T> filterClass);

    @objid ("60571fe9-9b63-4fb1-9a7c-146ff1a02e49")
    EList<BusinessRuleContainer> getBusinessRuleRoot();

    @objid ("8e764477-f765-41b2-a987-3d150953ca60")
    <T extends BusinessRuleContainer> List<T> getBusinessRuleRoot(java.lang.Class<T> filterClass);

    @objid ("19b5d027-9796-4bb0-a3b0-a13435d8b7f1")
    EList<Dictionary> getDictionaryRoot();

    @objid ("2e3431d6-6986-483d-b345-d55bb28d5b39")
    <T extends Dictionary> List<T> getDictionaryRoot(java.lang.Class<T> filterClass);

    @objid ("32a6f160-6960-4ca2-b787-b4b8519b3401")
    EList<RequirementContainer> getRequirementRoot();

    @objid ("608d4957-8de5-42db-b283-9b773d4184ba")
    <T extends RequirementContainer> List<T> getRequirementRoot(java.lang.Class<T> filterClass);

    @objid ("7ca4fc7d-ba6e-4026-a752-ffa59862e4dc")
    EList<GenericAnalystContainer> getGenericRoot();

    @objid ("ea12fbcb-af05-46d2-892e-44d3e373c383")
    <T extends GenericAnalystContainer> List<T> getGenericRoot(java.lang.Class<T> filterClass);

}
