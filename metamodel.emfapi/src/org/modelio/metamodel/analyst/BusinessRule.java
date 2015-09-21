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
import org.modelio.metamodel.analyst.BusinessRuleContainer;

/**
 * BusinessRule v0.0.9054
 * 
 * 
 * null
 */
@objid ("5a95b6be-0c64-44a2-a18c-e3ca290c5245")
public interface BusinessRule extends AnalystElement {
    @objid ("b2ffeaba-c555-4e61-8c12-a9ad9865a776")
    public static final String MNAME = "BusinessRule";

    /**
     * Getter for relation 'BusinessRule->SubRule'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("257b435a-00dc-4ccc-bfc4-bb210b70782f")
    EList<BusinessRule> getSubRule();

    /**
     * Filtered Getter for relation 'BusinessRule->SubRule'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4f4e1b46-cb6e-4e8d-aff5-764bf027696a")
    <T extends BusinessRule> List<T> getSubRule(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BusinessRule->OwnerContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3075af46-d289-4c63-98c7-92a1e315e24c")
    BusinessRuleContainer getOwnerContainer();

    /**
     * Setter for relation 'BusinessRule->OwnerContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fd8185b3-f133-40f0-a823-84754b9bd9ea")
    void setOwnerContainer(BusinessRuleContainer value);

    /**
     * Getter for relation 'BusinessRule->ParentRule'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ed2edfd2-302f-4e27-9466-fdc9d6043f84")
    BusinessRule getParentRule();

    /**
     * Setter for relation 'BusinessRule->ParentRule'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("83696ac4-56f1-45f6-8ab8-795134225339")
    void setParentRule(BusinessRule value);

    /**
     * Getter for relation 'BusinessRule->LastRuleVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5bbc7676-0e42-41d1-a783-534f0a1cfd89")
    BusinessRule getLastRuleVersion();

    /**
     * Setter for relation 'BusinessRule->LastRuleVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("dee325b5-9b0f-4c95-8801-eb1076301f65")
    void setLastRuleVersion(BusinessRule value);

    /**
     * Getter for relation 'BusinessRule->ArchivedRuleVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e4920149-32cf-4f7f-bd7b-9619a1645786")
    EList<BusinessRule> getArchivedRuleVersion();

    /**
     * Filtered Getter for relation 'BusinessRule->ArchivedRuleVersion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b9a813f9-d6e8-42a1-bbb3-a005f034f8e3")
    <T extends BusinessRule> List<T> getArchivedRuleVersion(java.lang.Class<T> filterClass);

}
