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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;

@objid ("008720b2-c4be-1fd8-97fe-001ec947cd2a")
public interface LocalNote extends Element {
    @objid ("24b2fd72-2d01-4ac3-9ad9-7cfbd73982da")
    String getName();

    @objid ("de4fc028-dac9-46af-b7ee-0273319fc16b")
    void setName(String value);

    @objid ("4b5cf531-eba2-4116-8aae-4a23fafce0e1")
    String getContent();

    @objid ("3888e4b5-2476-4440-be8f-3c2c9ae7a121")
    void setContent(String value);

    @objid ("93379dc8-2a15-4a04-9c3c-801b9aed17a6")
    boolean isIsVisible();

    @objid ("6038c3ad-3040-47ce-ae82-9b4c8114ca85")
    void setIsVisible(boolean value);

    @objid ("9e3b1f84-7da6-49b8-8a79-0ebd1323a01c")
    NoteType getLocalModel();

    @objid ("66abb81d-1bd4-4822-ad50-5f9dfa317675")
    void setLocalModel(NoteType value);

    @objid ("84e16b52-54f9-4c2d-bad8-aa41aa4921f1")
    ModelElement getLocalSubject();

    @objid ("d7e89108-2a22-4fdc-a44b-e9a36b4b6c34")
    void setLocalSubject(ModelElement value);

}
