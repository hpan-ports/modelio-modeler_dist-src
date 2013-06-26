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
import org.modelio.metamodel.uml.statik.VisibilityMode;

@objid ("0008034a-c4bf-1fd8-97fe-001ec947cd2a")
public interface ElementImport extends ModelElement {
    @objid ("141a89f8-e2ba-4d74-917d-5a3bed620da1")
    VisibilityMode getVisibility();

    @objid ("87983343-a834-416b-aeb1-82b4af0efe63")
    void setVisibility(VisibilityMode value);

    @objid ("33be54fb-de20-4a03-8f77-620b304545ac")
    NameSpace getImportingNameSpace();

    @objid ("36cffcdb-e368-4806-b4cd-18d1d78b4b41")
    void setImportingNameSpace(NameSpace value);

    @objid ("10eeb4bc-62c4-4694-8e18-86ae3562a368")
    NameSpace getImportedElement();

    @objid ("16728776-4c9a-4df4-9f6a-7d0beb64b2d8")
    void setImportedElement(NameSpace value);

    @objid ("4ce7c8d5-0056-4363-86a1-43e8ee3c8b6d")
    Operation getImportingOperation();

    @objid ("1111ae9a-a0cf-4724-a70b-929a6ce54ea0")
    void setImportingOperation(Operation value);

}
