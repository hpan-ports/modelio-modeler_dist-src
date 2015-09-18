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
import org.modelio.metamodel.analyst.BusinessRule;

@objid ("26a924f1-2881-4dea-bc77-f6f2a6d7406b")
public interface BusinessRuleContainer extends AnalystContainer {
    @objid ("96bf243d-6287-4181-bd6c-906e7bf8fc6c")
    EList<BusinessRule> getOwnedRule();

    @objid ("c168e400-88f1-4831-85b3-2ad91092ce76")
    <T extends BusinessRule> List<T> getOwnedRule(java.lang.Class<T> filterClass);

    @objid ("40f1a6ae-5e15-4613-b90e-c00f19cb36eb")
    BusinessRuleContainer getOwnerContainer();

    @objid ("8ef5518b-7314-4816-af76-6c718d76583f")
    void setOwnerContainer(BusinessRuleContainer value);

    @objid ("dd6dd71f-8e22-45d6-8db9-68e89e691b4b")
    EList<BusinessRuleContainer> getOwnedContainer();

    @objid ("d5cae6c8-7633-4d8b-9f3c-1da18ccf9b25")
    <T extends BusinessRuleContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    @objid ("dc37ae49-66ba-4910-b247-78e44c8693f0")
    AnalystProject getOwnerProject();

    @objid ("a7c04476-266e-41ee-8e1b-2eec49af208f")
    void setOwnerProject(AnalystProject value);

}
