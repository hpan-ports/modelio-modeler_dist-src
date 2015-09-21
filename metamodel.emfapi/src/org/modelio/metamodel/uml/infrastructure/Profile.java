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
package org.modelio.metamodel.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Package;

/**
 * Profile v0.0.9054
 */
@objid ("008c74a4-c4be-1fd8-97fe-001ec947cd2a")
public interface Profile extends Package {
    @objid ("6095ee37-2427-430a-8900-05536fe9abed")
    public static final String MNAME = "Profile";

    /**
     * Getter for attribute 'Profile.JCode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("645d5cdc-a0a1-4fd9-8196-c851a25300d4")
    String getJCode();

    /**
     * Setter for attribute 'Profile.JCode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e56fc453-4760-4347-bf90-c4999de57b0d")
    void setJCode(String value);

    /**
     * Getter for relation 'Profile->DefinedStereotype'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("9b552766-668e-4a8f-ac3a-1aa744956475")
    EList<Stereotype> getDefinedStereotype();

    /**
     * Filtered Getter for relation 'Profile->DefinedStereotype'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("02aa6d65-711d-426e-ba32-7126791d67a1")
    <T extends Stereotype> List<T> getDefinedStereotype(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Profile->OwnerModule'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4d6b1c58-540d-45c5-8cc7-62de7424a283")
    ModuleComponent getOwnerModule();

    /**
     * Setter for relation 'Profile->OwnerModule'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d9293607-f47a-434f-a72b-dc87d5320987")
    void setOwnerModule(ModuleComponent value);

    /**
     * Getter for relation 'Profile->OwnedReference'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("102c43a6-44c9-42cb-9d80-1ce26e76f575")
    EList<MetaclassReference> getOwnedReference();

    /**
     * Filtered Getter for relation 'Profile->OwnedReference'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("89d6c710-be34-41b4-b749-ef0f54b2f4eb")
    <T extends MetaclassReference> List<T> getOwnedReference(java.lang.Class<T> filterClass);

}
