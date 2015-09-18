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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;

@objid ("0089d1ea-c4be-1fd8-97fe-001ec947cd2a")
public interface Note extends ModelElement {
    @objid ("0bac4736-748e-4c97-a0d0-2cb08106f50d")
    String getContent();

    @objid ("85534326-6681-455b-8178-85ee579ff014")
    void setContent(String value);

    @objid ("324d4ce5-13a0-4f0d-9aed-ad036fb4bdad")
    String getMimeType();

    @objid ("9c16bf70-050e-4e98-b347-a30f9e43554b")
    void setMimeType(String value);

    @objid ("4c8f934f-c073-44cb-aa66-944e81d79d5b")
    NoteType getModel();

    @objid ("723d8812-b627-473a-818e-0a36a041a86d")
    void setModel(NoteType value);

    @objid ("513d062f-2154-4ebe-ae34-1b629a2811e7")
    ModelElement getSubject();

    @objid ("340672f9-4d7d-40a4-bfe1-acc18c997b97")
    void setSubject(ModelElement value);

}
