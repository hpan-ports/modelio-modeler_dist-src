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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;

@objid ("0091820a-c4be-1fd8-97fe-001ec947cd2a")
public interface MetaclassReference extends Element {
    @objid ("2b9f1ceb-9405-46d7-b680-b74c17c24d9f")
    String getReferencedClassName();

    @objid ("e5d3ae67-51bb-42cd-a902-d74ee51e31cb")
    void setReferencedClassName(String value);

    @objid ("c422f056-f871-4e4d-8a4a-4c52e31349e7")
    PropertyTableDefinition getDefinedTable();

    @objid ("0390e348-d1bb-4d13-a917-b577dfcba3c6")
    void setDefinedTable(PropertyTableDefinition value);

    @objid ("e9eaa7e0-3866-4ee7-b292-eaf23f0501b1")
    EList<NoteType> getDefinedNoteType();

    @objid ("a874ced8-6e37-4707-92ce-1762f5c916d1")
    <T extends NoteType> List<T> getDefinedNoteType(java.lang.Class<T> filterClass);

    @objid ("9b6c114a-3725-4333-90ac-1b46e45d2174")
    EList<ExternDocumentType> getDefinedExternDocumentType();

    @objid ("17e3f5e8-bbde-48a4-8003-e8f785d3c778")
    <T extends ExternDocumentType> List<T> getDefinedExternDocumentType(java.lang.Class<T> filterClass);

    @objid ("d65100e2-c10f-4661-94e9-2428774c2835")
    Profile getOwnerProfile();

    @objid ("1e163a53-2d07-4d93-8977-ee38c2c21cf5")
    void setOwnerProfile(Profile value);

    @objid ("b46c0a46-93fa-4456-be1e-67af6785a173")
    EList<TagType> getDefinedTagType();

    @objid ("a7ff1304-1d48-4c79-ba54-7b6b0c54ecd5")
    <T extends TagType> List<T> getDefinedTagType(java.lang.Class<T> filterClass);

}
