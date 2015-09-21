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
import org.modelio.metamodel.analyst.GenericAnalystElement;

/**
 * GenericAnalystContainer v0.0.9054
 * 
 * 
 * A GenericAnalystContainer defines a hierarchy that breaks down the analyst model. A GenericAnalystContainer can contain GenericAnalystContainer or GenericAnalystElement.
 */
@objid ("57374567-a655-4223-8606-596d9088326b")
public interface GenericAnalystContainer extends AnalystContainer {
    @objid ("9baa5a5c-29a5-42a8-89d3-2fe63bf4e449")
    public static final String MNAME = "GenericAnalystContainer";

    /**
     * Getter for relation 'GenericAnalystContainer->OwnedElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d90c47ae-83cc-4659-b52a-9f50b0f48e23")
    EList<GenericAnalystElement> getOwnedElement();

    /**
     * Filtered Getter for relation 'GenericAnalystContainer->OwnedElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9b974200-6b69-49b2-8450-cb2a44baae8d")
    <T extends GenericAnalystElement> List<T> getOwnedElement(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'GenericAnalystContainer->OwnerContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e1563402-7ccc-433a-b1b4-bc670cc7e048")
    GenericAnalystContainer getOwnerContainer();

    /**
     * Setter for relation 'GenericAnalystContainer->OwnerContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("95e97824-e21f-4c9a-b596-f13bf8a23d94")
    void setOwnerContainer(GenericAnalystContainer value);

    /**
     * Getter for relation 'GenericAnalystContainer->OwnedContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e2b66167-cdd8-4685-83b2-9e6651f49b55")
    EList<GenericAnalystContainer> getOwnedContainer();

    /**
     * Filtered Getter for relation 'GenericAnalystContainer->OwnedContainer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c8d8b9f4-6ce5-405e-addb-f6296ee55384")
    <T extends GenericAnalystContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'GenericAnalystContainer->OwnerProject'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("820966c1-9ee9-4944-93c0-cd4337c4d41d")
    AnalystProject getOwnerProject();

    /**
     * Setter for relation 'GenericAnalystContainer->OwnerProject'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a13706d5-6a1a-40e0-8aa2-453c31fc8bce")
    void setOwnerProject(AnalystProject value);

}
