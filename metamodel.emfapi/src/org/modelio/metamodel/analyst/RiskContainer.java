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
 Metamodel: Standard, version 0.0.9024, by Modeliosoft
 Generator version: 3.2.10.9023
 Generated on: Mar 19, 2015
 */
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
import org.modelio.metamodel.analyst.Risk;

/**
 * RiskContainer v0.0.9055
 * 
 * 
 * <p>A RiskContainer defines a hierarchy that breaks down the risk model. A RiskContainer can contain RiskContainers or Risks.</p>
 */
@objid ("7dd50ca0-69b0-4a0e-9f34-31e1b024becc")
public interface RiskContainer extends AnalystContainer {
    @objid ("7d471004-7fb3-48e6-a786-9cb226343857")
    public static final String MNAME = "RiskContainer";

    /**
     * Getter for relation 'RiskContainer->OwnedRisk'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("039819ee-696f-4fb9-a448-285efb7928bb")
    EList<Risk> getOwnedRisk();

    /**
     * Filtered Getter for relation 'RiskContainer->OwnedRisk'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d316a300-f43b-4155-a8a2-0a02f21ce005")
    <T extends Risk> List<T> getOwnedRisk(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'RiskContainer->OwnerContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9c885ae4-1db5-43f4-921d-56babef4633c")
    RiskContainer getOwnerContainer();

    /**
     * Setter for relation 'RiskContainer->OwnerContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("97fc3f2d-6d90-408b-b5e1-51d95604e665")
    void setOwnerContainer(RiskContainer value);

    /**
     * Getter for relation 'RiskContainer->OwnedContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8f31e181-b2bf-4f5d-9ab2-9f3e43318f8d")
    EList<RiskContainer> getOwnedContainer();

    /**
     * Filtered Getter for relation 'RiskContainer->OwnedContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5f6f506a-5043-4c27-9b69-2c5bf2f17d2b")
    <T extends RiskContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'RiskContainer->OwnerProject'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("19b1d188-0a15-424d-8b31-f41bf2a54345")
    AnalystProject getOwnerProject();

    /**
     * Setter for relation 'RiskContainer->OwnerProject'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1ad88478-24d2-49ed-bbb5-4b6090044cfa")
    void setOwnerProject(AnalystProject value);

}
