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
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.VisibilityMode;

/**
 * PackageImport v0.0.9054
 * 
 * 
 * A PackageImport is defined as a directed relationship that identifies a Package whose members are to be imported by a NameSpace.  
 * 
 * A PackageImport is a relationship between an importing NameSpace and a Package, indicating that the importing NameSpace adds the names of the members of the Package to its own NameSpace. 
 * 
 * Conceptually, a PackageImport is equivalent to having an ElementImport to each individual member of the imported NameSpace, unless there is already a separately defined ElementImport.
 */
@objid ("00160b66-c4bf-1fd8-97fe-001ec947cd2a")
public interface PackageImport extends ModelElement {
    @objid ("779d7a9a-dca2-444c-9f13-67dc89a22b34")
    public static final String MNAME = "PackageImport";

    /**
     * Getter for attribute 'PackageImport.Visibility'
     * 
     * Metamodel description:
     * <i>Member visibility (public or private).</i>
     */
    @objid ("08810f78-a1aa-42fd-8b6a-4fa9ecd94719")
    VisibilityMode getVisibility();

    /**
     * Setter for attribute 'PackageImport.Visibility'
     * 
     * Metamodel description:
     * <i>Member visibility (public or private).</i>
     */
    @objid ("555a7372-ad23-49a7-ad3b-387851e67ed3")
    void setVisibility(VisibilityMode value);

    /**
     * Getter for relation 'PackageImport->ImportingOperation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8c1bd6aa-500d-4d75-b0e7-ac51e76d2791")
    Operation getImportingOperation();

    /**
     * Setter for relation 'PackageImport->ImportingOperation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("318d17b3-ef10-4f6e-930d-f080960fb6fb")
    void setImportingOperation(Operation value);

    /**
     * Getter for relation 'PackageImport->ImportingNameSpace'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6baa4d7b-7a81-444d-903d-aeb4cd715f58")
    NameSpace getImportingNameSpace();

    /**
     * Setter for relation 'PackageImport->ImportingNameSpace'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bc3171b4-7722-4f8a-baef-8f121003937b")
    void setImportingNameSpace(NameSpace value);

    /**
     * Getter for relation 'PackageImport->ImportedPackage'
     * 
     * Metamodel description:
     * <i>Specifies the Package whose members are imported into a Namespace. Subsets DirectedRelationship:: target.</i>
     */
    @objid ("8ff1d63c-b948-4b7d-985f-9ab45ba21d65")
    Package getImportedPackage();

    /**
     * Setter for relation 'PackageImport->ImportedPackage'
     * 
     * Metamodel description:
     * <i>Specifies the Package whose members are imported into a Namespace. Subsets DirectedRelationship:: target.</i>
     */
    @objid ("e4e985d3-f06d-4617-967a-93ca513dfb5e")
    void setImportedPackage(Package value);

}
