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
import org.modelio.metamodel.analyst.BusinessRule;

@objid ("26a924f1-2881-4dea-bc77-f6f2a6d7406b")
public interface BusinessRuleContainer extends AnalystContainer {
    @objid ("79d92ccd-c723-4d3d-8328-522fc7e4bdbf")
    EList<BusinessRule> getOwnedRule();

    @objid ("68809949-b837-41b4-97b1-e436c8d1952c")
    <T extends BusinessRule> List<T> getOwnedRule(java.lang.Class<T> filterClass);

    @objid ("83b56647-507c-42b2-a5dd-5e1ebbcc327a")
    BusinessRuleContainer getOwnerContainer();

    @objid ("cc1c7c84-ddbb-4f6c-8509-bdcd872e9ee6")
    void setOwnerContainer(BusinessRuleContainer value);

    @objid ("738f812b-94dd-4d7c-9de9-65e86cccee9e")
    EList<BusinessRuleContainer> getOwnedContainer();

    @objid ("53a00f83-738f-4f4d-98a1-59d1727dc17f")
    <T extends BusinessRuleContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    @objid ("64f26536-6cef-4f73-a6d7-467428f3747e")
    AnalystProject getOwnerProject();

    @objid ("bbf644ce-b0f0-43ec-a037-17b068ad2259")
    void setOwnerProject(AnalystProject value);

}
