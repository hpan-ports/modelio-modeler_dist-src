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
/*   Metamodel version: 9022              */
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
    @objid ("941baef4-8e22-42d9-b432-fe31061106f7")
    VisibilityMode getVisibility();

    @objid ("3283b5b0-aec8-4672-ae76-ea6a9f3d4fb8")
    void setVisibility(VisibilityMode value);

    @objid ("3e662144-8afc-4b34-8b76-86f255b10263")
    Operation getImportingOperation();

    @objid ("312bb199-4908-4f29-96ae-eefa93e56564")
    void setImportingOperation(Operation value);

    @objid ("c9b7ca8d-b834-4424-9807-4222a1479dfb")
    NameSpace getImportingNameSpace();

    @objid ("2b65ec3a-2e77-408f-8e05-83a88ef704cd")
    void setImportingNameSpace(NameSpace value);

    @objid ("478f587c-6496-461c-8743-938895bb51b6")
    Package getImportedPackage();

    @objid ("5675e042-7982-4909-95c0-0f0a2067b811")
    void setImportedPackage(Package value);

}
