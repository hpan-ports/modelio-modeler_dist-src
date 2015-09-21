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
import org.modelio.metamodel.uml.statik.VisibilityMode;

/**
 * ElementImport v0.0.9054
 * 
 * 
 * ModelElement.Name: Specifies the name that should be added to the namespace of the importing Package in lieu of the name of the imported PackagableElement. The aliased name must not clash with any other member name in the importing Package. By default, no alias is used.
 */
@objid ("0008034a-c4bf-1fd8-97fe-001ec947cd2a")
public interface ElementImport extends ModelElement {
    @objid ("555a76e2-6e9d-4c0b-ac7c-e77d688a447a")
    public static final String MNAME = "ElementImport";

    /**
     * Getter for attribute 'ElementImport.Visibility'
     * 
     * Metamodel description:
     * <i>Specifies the visibility of the imported PackageableElement within the importing Package. The default visibility is the same as that of the imported element. If the imported element does not have a visibility, it is possible to add visibility to the element import.
     * 
     * The visibility of an ElementImport is either public or private.</i>
     */
    @objid ("e3c64a62-b370-4b35-a6c9-140160834b19")
    VisibilityMode getVisibility();

    /**
     * Setter for attribute 'ElementImport.Visibility'
     * 
     * Metamodel description:
     * <i>Specifies the visibility of the imported PackageableElement within the importing Package. The default visibility is the same as that of the imported element. If the imported element does not have a visibility, it is possible to add visibility to the element import.
     * 
     * The visibility of an ElementImport is either public or private.</i>
     */
    @objid ("63ff81ef-1f56-4344-b3db-006ffd039626")
    void setVisibility(VisibilityMode value);

    /**
     * Getter for relation 'ElementImport->ImportingNameSpace'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f8dd5cc7-30f6-4f64-8fc6-58ca04ec2bde")
    NameSpace getImportingNameSpace();

    /**
     * Setter for relation 'ElementImport->ImportingNameSpace'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ddde9b92-d314-4bde-b447-cb2329c18abb")
    void setImportingNameSpace(NameSpace value);

    /**
     * Getter for relation 'ElementImport->ImportedElement'
     * 
     * Metamodel description:
     * <i>Specifies the PackageableElement whose name is to be added to a Namespace. Subsets DirectedRelationship::target.</i>
     */
    @objid ("7d684b6f-0dc4-441c-a6b7-ceca70edf389")
    NameSpace getImportedElement();

    /**
     * Setter for relation 'ElementImport->ImportedElement'
     * 
     * Metamodel description:
     * <i>Specifies the PackageableElement whose name is to be added to a Namespace. Subsets DirectedRelationship::target.</i>
     */
    @objid ("7e5e5b5c-08d6-48be-b333-89393936b76d")
    void setImportedElement(NameSpace value);

    /**
     * Getter for relation 'ElementImport->ImportingOperation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f0e6244a-c2a3-40ca-8529-42da97c0cb27")
    Operation getImportingOperation();

    /**
     * Setter for relation 'ElementImport->ImportingOperation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5076f0b3-e75f-4890-bb1b-6bc2e2f44161")
    void setImportingOperation(Operation value);

}
