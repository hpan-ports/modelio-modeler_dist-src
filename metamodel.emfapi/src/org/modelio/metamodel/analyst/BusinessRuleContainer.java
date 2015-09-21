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
import org.modelio.metamodel.analyst.BusinessRule;

/**
 * BusinessRuleContainer v0.0.9054
 * 
 * 
 * null
 */
@objid ("26a924f1-2881-4dea-bc77-f6f2a6d7406b")
public interface BusinessRuleContainer extends AnalystContainer {
    @objid ("66f0d126-452d-4ff5-b512-c2e9c91d87ec")
    public static final String MNAME = "BusinessRuleContainer";

    /**
     * Getter for relation 'BusinessRuleContainer->OwnedRule'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0a85a2f9-b10b-4ab9-8870-a65cbe338c55")
    EList<BusinessRule> getOwnedRule();

    /**
     * Filtered Getter for relation 'BusinessRuleContainer->OwnedRule'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d8f3ad7c-aae9-4835-a478-af3e2b3e39c6")
    <T extends BusinessRule> List<T> getOwnedRule(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BusinessRuleContainer->OwnerContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fd11ffde-938d-4b5c-9fa8-130967435d0b")
    BusinessRuleContainer getOwnerContainer();

    /**
     * Setter for relation 'BusinessRuleContainer->OwnerContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("852c0402-2cc4-4c96-8ef5-ade42078d95d")
    void setOwnerContainer(BusinessRuleContainer value);

    /**
     * Getter for relation 'BusinessRuleContainer->OwnedContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("48ac2643-f6a7-4c0a-b70e-2547b7aff289")
    EList<BusinessRuleContainer> getOwnedContainer();

    /**
     * Filtered Getter for relation 'BusinessRuleContainer->OwnedContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("046fa381-ca67-4e78-bd7a-45b8ee8c60ef")
    <T extends BusinessRuleContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BusinessRuleContainer->OwnerProject'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8a1c180d-4ff4-40b0-9226-6877575de0ba")
    AnalystProject getOwnerProject();

    /**
     * Setter for relation 'BusinessRuleContainer->OwnerProject'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a5bb7b2e-9aaa-47fb-9d0b-aa4d2eb4de48")
    void setOwnerProject(AnalystProject value);

}
