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
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0061ba52-c4bf-1fd8-97fe-001ec947cd2a")
public interface AnalystProject extends ModelElement {
    @objid ("393da575-6988-4077-9430-a22400cc5e55")
    PropertyContainer getPropertyRoot();

    @objid ("f8b1b4d3-b3dd-46dd-8347-e6385e495b41")
    void setPropertyRoot(PropertyContainer value);

    @objid ("8c6ba099-861c-41af-912b-6a2f88d1322a")
    EList<GoalContainer> getGoalRoot();

    @objid ("64e5ae63-3c78-480b-a802-c20fd6a05065")
    <T extends GoalContainer> List<T> getGoalRoot(java.lang.Class<T> filterClass);

    @objid ("c211d68a-d9d0-4462-a6c4-bdf6a506e9f7")
    EList<BusinessRuleContainer> getBusinessRuleRoot();

    @objid ("d9ae2b7c-f48b-4ac9-b0be-d5073c804d09")
    <T extends BusinessRuleContainer> List<T> getBusinessRuleRoot(java.lang.Class<T> filterClass);

    @objid ("14bb0856-fce8-41e9-880c-92a51f48ff2b")
    EList<Dictionary> getDictionaryRoot();

    @objid ("1e1b1bcf-b7f7-480a-baeb-4ec07de478d0")
    <T extends Dictionary> List<T> getDictionaryRoot(java.lang.Class<T> filterClass);

    @objid ("5dc03154-be29-4a6f-9592-5c947c9da62b")
    EList<RequirementContainer> getRequirementRoot();

    @objid ("b1c64c5c-8c68-415f-bfe2-bd06daeada54")
    <T extends RequirementContainer> List<T> getRequirementRoot(java.lang.Class<T> filterClass);

}
