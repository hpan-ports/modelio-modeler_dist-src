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

@objid ("5a95b6be-0c64-44a2-a18c-e3ca290c5245")
public interface BusinessRule extends AnalystElement {
    @objid ("3606f41b-c306-4af6-8a2d-4883cde87d28")
    EList<BusinessRule> getSubRule();

    @objid ("4469548a-7df2-4b13-b5e3-66da1ff3cd1f")
    <T extends BusinessRule> List<T> getSubRule(java.lang.Class<T> filterClass);

    @objid ("23a43b50-509f-4a4e-a91c-984bde4ddb3e")
    BusinessRuleContainer getOwnerContainer();

    @objid ("51e40f44-226b-41c0-81c8-a3c6662c681c")
    void setOwnerContainer(BusinessRuleContainer value);

    @objid ("487e0f0d-37d4-4f09-bead-058f0dda9371")
    BusinessRule getParentRule();

    @objid ("db809a24-29af-4382-a78a-73bd14108824")
    void setParentRule(BusinessRule value);

    @objid ("0ccbd46d-fc1b-4612-a0f8-10a893ce8029")
    BusinessRule getLastRuleVersion();

    @objid ("cf045874-4e9c-4d49-a22d-d8f759b2ae03")
    void setLastRuleVersion(BusinessRule value);

    @objid ("ae34706e-0295-4ef1-abfe-1873ec99339c")
    EList<BusinessRule> getArchivedRuleVersion();

    @objid ("4c6b63dc-2d7f-4e13-8ff7-844a2ad7a414")
    <T extends BusinessRule> List<T> getArchivedRuleVersion(java.lang.Class<T> filterClass);

}
