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
import org.modelio.metamodel.analyst.RequirementContainer;

/**
 * Requirement v0.0.9054
 * 
 * 
 * Expression of a requirement.
 * 
 * A requirement is owned by his requirement container, or is part of decomposition of a parent requirement.
 * 
 * A requirement may own older versions of itself for archive and comparison purposes.
 */
@objid ("2a1baa12-05dd-4955-bc67-2839831d9bb9")
public interface Requirement extends AnalystElement {
    @objid ("a4a71e49-5731-4d70-ba20-3b60d894e72e")
    public static final String MNAME = "Requirement";

    /**
     * Getter for relation 'Requirement->SubRequirement'
     * 
     * Metamodel description:
     * <i>Decomposition of the requirement into sub requirements.</i>
     */
    @objid ("adfe2759-2781-428d-8bac-35821d53e734")
    EList<Requirement> getSubRequirement();

    /**
     * Filtered Getter for relation 'Requirement->SubRequirement'
     * 
     * Metamodel description:
     * <i>Decomposition of the requirement into sub requirements.</i>
     */
    @objid ("0f104695-4c65-465f-b578-413bb9a3276d")
    <T extends Requirement> List<T> getSubRequirement(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Requirement->OwnerContainer'
     * 
     * Metamodel description:
     * <i>Container of the requirement.</i>
     */
    @objid ("857b8e91-7f72-4a96-9f99-b2a829b54d6f")
    RequirementContainer getOwnerContainer();

    /**
     * Setter for relation 'Requirement->OwnerContainer'
     * 
     * Metamodel description:
     * <i>Container of the requirement.</i>
     */
    @objid ("91c2e369-5e92-4b5d-bd19-139897fe0902")
    void setOwnerContainer(RequirementContainer value);

    /**
     * Getter for relation 'Requirement->ParentRequirement'
     * 
     * Metamodel description:
     * <i>Requirement this requirement decomposes.</i>
     */
    @objid ("19f753ee-6adb-4a8e-86bd-a5d183a5bf82")
    Requirement getParentRequirement();

    /**
     * Setter for relation 'Requirement->ParentRequirement'
     * 
     * Metamodel description:
     * <i>Requirement this requirement decomposes.</i>
     */
    @objid ("dd4ed7fe-cdac-457a-ad0e-c56c6db1c0a3")
    void setParentRequirement(Requirement value);

    /**
     * Getter for relation 'Requirement->ArchivedRequirementVersion'
     * 
     * Metamodel description:
     * <i>Older versions of this requirement that have been archived.</i>
     */
    @objid ("f1bce676-f149-436b-8aac-2dfe26fefe01")
    EList<Requirement> getArchivedRequirementVersion();

    /**
     * Filtered Getter for relation 'Requirement->ArchivedRequirementVersion'
     * 
     * Metamodel description:
     * <i>Older versions of this requirement that have been archived.</i>
     */
    @objid ("2345fa4b-6fc9-4d4e-b389-98513cad6956")
    <T extends Requirement> List<T> getArchivedRequirementVersion(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Requirement->LastRequirementVersion'
     * 
     * Metamodel description:
     * <i>Last version of this requirement, owning this version of the requirement.</i>
     */
    @objid ("4e608e83-6536-4b19-91aa-3b626e9ac14c")
    Requirement getLastRequirementVersion();

    /**
     * Setter for relation 'Requirement->LastRequirementVersion'
     * 
     * Metamodel description:
     * <i>Last version of this requirement, owning this version of the requirement.</i>
     */
    @objid ("076c957a-a10e-4158-9710-7ed1af213267")
    void setLastRequirementVersion(Requirement value);

}
