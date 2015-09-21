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
import org.modelio.metamodel.analyst.Requirement;

/**
 * RequirementContainer v0.0.9054
 * 
 * 
 * A RequirementContainer defines a hierarchy that breaks down the requirement model. A RequirementContainer can contain RequirementContainers or Requirements.
 */
@objid ("0ba1c716-f645-446a-a591-f70aa2d0071d")
public interface RequirementContainer extends AnalystContainer {
    @objid ("0888cd20-c1cb-43a6-82b8-f7654ce3e0d6")
    public static final String MNAME = "RequirementContainer";

    /**
     * Getter for relation 'RequirementContainer->OwnedRequirement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("09723ac1-863e-4f5a-95a5-10c00041a199")
    EList<Requirement> getOwnedRequirement();

    /**
     * Filtered Getter for relation 'RequirementContainer->OwnedRequirement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8f85e891-05f5-468f-aa67-02c2e35d06d9")
    <T extends Requirement> List<T> getOwnedRequirement(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'RequirementContainer->OwnerContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3a8cf4c3-4a24-4a0f-b033-a1d55cbc89dc")
    RequirementContainer getOwnerContainer();

    /**
     * Setter for relation 'RequirementContainer->OwnerContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f402a8de-c99a-4a3c-a984-e7a9812c25df")
    void setOwnerContainer(RequirementContainer value);

    /**
     * Getter for relation 'RequirementContainer->OwnedContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8ecbf19b-8d76-47f6-bfba-b1fabf458443")
    EList<RequirementContainer> getOwnedContainer();

    /**
     * Filtered Getter for relation 'RequirementContainer->OwnedContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("365d3687-cde3-4f7e-8f78-c0ee098a1bd4")
    <T extends RequirementContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'RequirementContainer->OwnerProject'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ba5b3cfc-0f3b-4348-9026-fe841b79adce")
    AnalystProject getOwnerProject();

    /**
     * Setter for relation 'RequirementContainer->OwnerProject'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d52be24c-1f7e-4b43-8bc8-0369c91d1d03")
    void setOwnerProject(AnalystProject value);

}
