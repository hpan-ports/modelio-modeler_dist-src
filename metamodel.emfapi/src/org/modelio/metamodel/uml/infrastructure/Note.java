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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;

@objid ("0089d1ea-c4be-1fd8-97fe-001ec947cd2a")
public interface Note extends ModelElement {
    @objid ("7692f016-501d-4e27-9719-49a8ea7aea3b")
    String getContent();

    @objid ("455425b1-1236-437b-9da1-109da5d04d9e")
    void setContent(String value);

    @objid ("1faa164f-5a53-4c83-917e-f067c368d977")
    NoteType getModel();

    @objid ("db8231dd-2d2c-41e5-bc5c-3ca16d380244")
    void setModel(NoteType value);

    @objid ("a8cefaa9-8b7f-483c-81f3-fafd50f84bcc")
    ModelElement getSubject();

    @objid ("9c91148f-f3be-4f01-8c54-c830e1d0f568")
    void setSubject(ModelElement value);

}
