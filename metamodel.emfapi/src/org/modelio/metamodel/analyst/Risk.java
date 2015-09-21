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
import org.modelio.metamodel.analyst.RiskContainer;

/**
 * Risk v0.0.9055
 * 
 * 
 * <p>Expression of a Risk. A Risk is owned by his risk container, or is part of decomposition of a parent Risk. A Risk may own older versions of itself for archive and comparison purposes.</p>
 */
@objid ("eafd6c46-920d-47c6-b0e4-a528a211754a")
public interface Risk extends AnalystElement {
    @objid ("c24ff9e0-5fe2-4ed6-9c22-aeb3ef9ce7d0")
    public static final String MNAME = "Risk";

    /**
     * Getter for relation 'Risk->SubRisk'
     * 
     * Metamodel description:
     * <i>Decomposition of the requirement into sub requirements.</i>
     */
    @objid ("f03ae3fc-94d3-4e78-b1ed-ad13a85cb1e0")
    EList<Risk> getSubRisk();

    /**
     * Filtered Getter for relation 'Risk->SubRisk'
     * 
     * Metamodel description:
     * <i>Decomposition of the requirement into sub requirements.</i>
     */
    @objid ("be75d0d7-b7f1-4a96-a85f-5455fed9e5c4")
    <T extends Risk> List<T> getSubRisk(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Risk->OwnerContainer'
     * 
     * Metamodel description:
     * <i>Container of the requirement.</i>
     */
    @objid ("9b56ee1d-39c7-4a8f-afec-87407d0c072c")
    RiskContainer getOwnerContainer();

    /**
     * Setter for relation 'Risk->OwnerContainer'
     * 
     * Metamodel description:
     * <i>Container of the requirement.</i>
     */
    @objid ("afa50f82-5823-419a-9295-31ca860e022c")
    void setOwnerContainer(RiskContainer value);

    /**
     * Getter for relation 'Risk->ParentRisk'
     * 
     * Metamodel description:
     * <i>Requirement this requirement decomposes.</i>
     */
    @objid ("afdb9b15-5633-46e2-9d40-2339bada0eae")
    Risk getParentRisk();

    /**
     * Setter for relation 'Risk->ParentRisk'
     * 
     * Metamodel description:
     * <i>Requirement this requirement decomposes.</i>
     */
    @objid ("2ea1d0ab-4ace-4a0c-b2ae-9ec4353f8c22")
    void setParentRisk(Risk value);

    /**
     * Getter for relation 'Risk->ArchivedRiskVersion'
     * 
     * Metamodel description:
     * <i>Older versions of this requirement that have been archived.</i>
     */
    @objid ("7d976622-0ab8-489b-afbf-6b062450ed6f")
    EList<Risk> getArchivedRiskVersion();

    /**
     * Filtered Getter for relation 'Risk->ArchivedRiskVersion'
     * 
     * Metamodel description:
     * <i>Older versions of this requirement that have been archived.</i>
     */
    @objid ("660bf689-b903-46d5-b6b8-710d365b7c87")
    <T extends Risk> List<T> getArchivedRiskVersion(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Risk->LastRiskVersion'
     * 
     * Metamodel description:
     * <i>Last version of this requirement, owning this version of the requirement.</i>
     */
    @objid ("47529f0d-0d61-4b5b-88ce-39f5033af58f")
    Risk getLastRiskVersion();

    /**
     * Setter for relation 'Risk->LastRiskVersion'
     * 
     * Metamodel description:
     * <i>Last version of this requirement, owning this version of the requirement.</i>
     */
    @objid ("94d9501d-2800-4aac-9aaa-2d12a5f4090b")
    void setLastRiskVersion(Risk value);

}
