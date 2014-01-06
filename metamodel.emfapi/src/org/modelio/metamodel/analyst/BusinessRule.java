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

@objid ("5a95b6be-0c64-44a2-a18c-e3ca290c5245")
public interface BusinessRule extends AnalystElement {
    @objid ("2cc48d0a-bc11-4eef-bdb0-b1c3e65698c4")
    int getVersion();

    @objid ("b7b158e5-5f1b-4537-8dd7-c281331e7139")
    void setVersion(int value);

    @objid ("a69c58cf-f7e5-4f24-a20f-11910c1bd041")
    EList<BusinessRule> getSubRule();

    @objid ("bb5f3121-2e3d-4876-a3da-7f7c436bf727")
    <T extends BusinessRule> List<T> getSubRule(java.lang.Class<T> filterClass);

    @objid ("3c18f21b-9bac-4426-b7fa-120467d8234a")
    BusinessRuleContainer getOwnerContainer();

    @objid ("760dfa75-5811-4228-a1e3-e337f7089755")
    void setOwnerContainer(BusinessRuleContainer value);

    @objid ("c7ff5461-6a96-4f0f-b7b8-ade637d7549c")
    BusinessRule getParentRule();

    @objid ("76410233-04d8-453c-bec7-d4a9cc233d04")
    void setParentRule(BusinessRule value);

    @objid ("cb3aef25-74df-4dfa-87b4-cc093bf59247")
    BusinessRule getLastRuleVersion();

    @objid ("01e6814c-5b55-44d4-999f-14c1a880264f")
    void setLastRuleVersion(BusinessRule value);

    @objid ("79ffaef2-d494-42af-ba51-2cc5d20f16fd")
    EList<BusinessRule> getArchivedRuleVersion();

    @objid ("dc5a21d8-f55f-47a3-9274-dd9fcfc2c11c")
    <T extends BusinessRule> List<T> getArchivedRuleVersion(java.lang.Class<T> filterClass);

}
