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
import org.modelio.metamodel.analyst.BusinessRule;

@objid ("26a924f1-2881-4dea-bc77-f6f2a6d7406b")
public interface BusinessRuleContainer extends AnalystContainer {
    @objid ("af9eeb80-c6e1-4a51-af7d-b6945aea14c3")
    EList<BusinessRule> getOwnedRule();

    @objid ("aa7455f8-1880-431e-b8e2-ffda421b3ebe")
    <T extends BusinessRule> List<T> getOwnedRule(java.lang.Class<T> filterClass);

    @objid ("a1ef8f1c-5f58-4fe3-baf7-cc8122012a2d")
    BusinessRuleContainer getOwnerContainer();

    @objid ("38563618-575d-4bc6-a559-36077e9886ca")
    void setOwnerContainer(BusinessRuleContainer value);

    @objid ("0b5dd57f-2a13-45d1-be91-8eced718e6d1")
    EList<BusinessRuleContainer> getOwnedContainer();

    @objid ("7cce86c5-10e5-41f6-a52d-b09bd8c75216")
    <T extends BusinessRuleContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    @objid ("05af9d07-71f8-424f-b62f-21590c74f6b4")
    AnalystProject getOwnerProject();

    @objid ("7a6ce13d-86fe-42c1-b349-a125b2a85aff")
    void setOwnerProject(AnalystProject value);

}
