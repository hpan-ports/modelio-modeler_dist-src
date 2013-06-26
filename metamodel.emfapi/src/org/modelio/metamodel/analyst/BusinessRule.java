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

@objid ("5a95b6be-0c64-44a2-a18c-e3ca290c5245")
public interface BusinessRule extends AnalystElement {
    @objid ("4f383e19-4e69-42e6-8eba-38f8d9c8d06a")
    EList<BusinessRule> getSubRule();

    @objid ("6bf4c231-3194-4466-87b7-de8adaf8b7b0")
    <T extends BusinessRule> List<T> getSubRule(java.lang.Class<T> filterClass);

    @objid ("026cd9d3-1764-40fb-aa3d-25be14841042")
    BusinessRuleContainer getOwnerContainer();

    @objid ("8c764c2a-c063-4a7e-8a75-fa0f55f02998")
    void setOwnerContainer(BusinessRuleContainer value);

    @objid ("a8f36345-79aa-42b7-a436-03bcfddd6bb1")
    BusinessRule getParentRule();

    @objid ("f9417254-beac-4fda-b0fb-8431a5692cd1")
    void setParentRule(BusinessRule value);

}
