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
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.VisibilityMode;

@objid ("00160b66-c4bf-1fd8-97fe-001ec947cd2a")
public interface PackageImport extends ModelElement {
    @objid ("cbee90d4-6714-4d90-977b-43e2b7a04e10")
    VisibilityMode getVisibility();

    @objid ("ecc12398-7f31-4a3e-a8e8-557d028d1cd7")
    void setVisibility(VisibilityMode value);

    @objid ("c983f1c9-6e27-4195-be3f-081e36328552")
    Operation getImportingOperation();

    @objid ("b21befba-cde5-4a1a-af22-0870946e384d")
    void setImportingOperation(Operation value);

    @objid ("2fee423a-c21a-48c1-aaba-e2ad04b2c6b2")
    NameSpace getImportingNameSpace();

    @objid ("8ecd36ca-0356-404b-918d-1d5b5dab85ea")
    void setImportingNameSpace(NameSpace value);

    @objid ("64b9d2f3-aab4-4dbe-add2-0f0a438a60e6")
    Package getImportedPackage();

    @objid ("c6879d6d-fdda-4b4e-9c7c-4f1d6a461669")
    void setImportedPackage(Package value);

}
