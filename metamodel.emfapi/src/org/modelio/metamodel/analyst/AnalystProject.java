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
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0061ba52-c4bf-1fd8-97fe-001ec947cd2a")
public interface AnalystProject extends ModelElement {
    @objid ("2ae5b2b8-5625-46b3-8ec3-6ef0da3eea84")
    PropertyContainer getPropertyRoot();

    @objid ("6468ae42-2814-4ecd-a4f2-c2b829ac5108")
    void setPropertyRoot(PropertyContainer value);

    @objid ("0f00ff25-e03b-4671-9d14-aeec3fcc4c2a")
    EList<GoalContainer> getGoalRoot();

    @objid ("bdf4b7cf-e6a4-49ef-afc8-db2a79925f84")
    <T extends GoalContainer> List<T> getGoalRoot(java.lang.Class<T> filterClass);

    @objid ("7e05fac8-e727-45a7-a600-0c07f72e3d84")
    EList<BusinessRuleContainer> getBusinessRuleRoot();

    @objid ("d0ea8dcf-14fc-411f-9d39-e8d5dcc23388")
    <T extends BusinessRuleContainer> List<T> getBusinessRuleRoot(java.lang.Class<T> filterClass);

    @objid ("8f20b8fa-3e1e-4ac4-ade9-7776a8b6efbe")
    EList<Dictionary> getDictionaryRoot();

    @objid ("ab6bdc30-c88b-4166-94db-99557c328f86")
    <T extends Dictionary> List<T> getDictionaryRoot(java.lang.Class<T> filterClass);

    @objid ("f5ec33bb-2511-49d9-8889-65141f96913d")
    EList<RequirementContainer> getRequirementRoot();

    @objid ("5fa5c78a-d702-4f61-9ac9-a2de94cf12b0")
    <T extends RequirementContainer> List<T> getRequirementRoot(java.lang.Class<T> filterClass);

    @objid ("3849dba5-6d6a-45e5-af9e-b81d2c04938a")
    EList<GenericAnalystContainer> getGenericRoot();

    @objid ("8f38fe5c-2870-4517-830e-31b724784e59")
    <T extends GenericAnalystContainer> List<T> getGenericRoot(java.lang.Class<T> filterClass);

}
