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
import org.modelio.metamodel.uml.statik.VisibilityMode;

@objid ("0008034a-c4bf-1fd8-97fe-001ec947cd2a")
public interface ElementImport extends ModelElement {
    @objid ("cc3bf0b1-77bd-4bcc-9a0c-4c072cc3e0d0")
    VisibilityMode getVisibility();

    @objid ("a2c7e0db-97e8-42e4-a6e6-2a68c6ada381")
    void setVisibility(VisibilityMode value);

    @objid ("38471c53-cc7e-4409-abc3-929b7f7aa3a3")
    NameSpace getImportingNameSpace();

    @objid ("f620750d-7122-4b63-bbff-6147747caa4b")
    void setImportingNameSpace(NameSpace value);

    @objid ("1a0b7968-dfd6-4260-9d4e-314e653dab1c")
    NameSpace getImportedElement();

    @objid ("c87570bf-9579-4f4f-bb54-5e510f784726")
    void setImportedElement(NameSpace value);

    @objid ("e558b97d-8e58-4e1c-9d92-087604853f76")
    Operation getImportingOperation();

    @objid ("1091746c-563b-4c0e-a3e1-473952d584f4")
    void setImportingOperation(Operation value);

}
