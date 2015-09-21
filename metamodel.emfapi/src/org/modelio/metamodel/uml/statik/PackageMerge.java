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
import org.modelio.metamodel.uml.statik.Package;

/**
 * PackageMerge v0.0.9054
 * 
 * 
 * A PackageMerge is a relationship between two Packages, where the contents of the target Package (the one pointed at) is merged with the contents of the source Package through specialization and redefinition, where applicable. This is a mechanism that should be used when elements of the same name are intended to represent the same concept, regardless of the Package in which they are defined. 
 * 
 * A merging Package will take elements of the same kind with the same name from one or more Packages and merge them together into a single element using Generalization and redefinitions. 
 * 
 * It should be noted that a PackageMerge can be viewed as a short-hand way of explicitly defining those Generalizations and redefinitions. The merged Packages are still available, and the elements in those Packages can be separately qualified.
 */
@objid ("0016e662-c4bf-1fd8-97fe-001ec947cd2a")
public interface PackageMerge extends ModelElement {
    @objid ("06e13015-ed32-46cd-9874-a5780dc4ecb0")
    public static final String MNAME = "PackageMerge";

    /**
     * Getter for relation 'PackageMerge->MergedPackage'
     * 
     * Metamodel description:
     * <i>Package that is merged with the current Package.</i>
     */
    @objid ("8642d636-ee50-460f-81bd-5057fec5b365")
    Package getMergedPackage();

    /**
     * Setter for relation 'PackageMerge->MergedPackage'
     * 
     * Metamodel description:
     * <i>Package that is merged with the current Package.</i>
     */
    @objid ("a5d02213-d890-4fd0-b0ca-d3d12bf1c976")
    void setMergedPackage(Package value);

    /**
     * Getter for relation 'PackageMerge->ReceivingPackage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("30dcfe6b-c00b-4400-b43d-99564733859c")
    Package getReceivingPackage();

    /**
     * Setter for relation 'PackageMerge->ReceivingPackage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e28845e1-6ab2-411e-896b-adafc5c6583f")
    void setReceivingPackage(Package value);

}
