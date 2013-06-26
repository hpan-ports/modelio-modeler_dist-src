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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("5aef28b9-3059-41d2-87f8-a9f69fa63262")
    VisibilityMode getVisibility();

    @objid ("d8fe56cf-5a15-4b57-a536-0705046ab3b4")
    void setVisibility(VisibilityMode value);

    @objid ("84ece303-feb0-4f5c-827e-24224a152068")
    Operation getImportingOperation();

    @objid ("69eb010d-840f-434b-b6db-7301245242d5")
    void setImportingOperation(Operation value);

    @objid ("676cc778-4560-4260-8062-3af3684f2418")
    NameSpace getImportingNameSpace();

    @objid ("bd6f71de-25f9-492d-ba0c-1203f671935d")
    void setImportingNameSpace(NameSpace value);

    @objid ("8aa53949-ab46-4429-90b3-66770d89be7a")
    Package getImportedPackage();

    @objid ("f4dc83fd-f575-459c-b66e-30d91b406b17")
    void setImportedPackage(Package value);

}
