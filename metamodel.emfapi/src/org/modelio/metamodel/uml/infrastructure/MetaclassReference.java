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
    @objid ("2918451e-ec6c-454a-8e60-b9916965206c")
    String getReferencedClassName();

    @objid ("50f6e073-7b6a-4dbb-9d8f-96892fa2c849")
    void setReferencedClassName(String value);

    @objid ("1e248786-7b67-4fef-9f0e-325ec1fda1da")
    PropertyTableDefinition getDefinedTable();

    @objid ("5dda5d23-db5a-4a86-b77b-9cc887857426")
    void setDefinedTable(PropertyTableDefinition value);

    @objid ("90e8396c-52db-4f53-9cd2-7e579534636f")
    EList<NoteType> getDefinedNoteType();

    @objid ("d9ce180b-f461-4b43-853a-3a2a0cbe51ed")
    <T extends NoteType> List<T> getDefinedNoteType(java.lang.Class<T> filterClass);

    @objid ("5c4e1a14-13cb-49d3-a25f-51e0775d5368")
    EList<ExternDocumentType> getDefinedExternDocumentType();

    @objid ("3a13f0e3-c8a4-497e-bc5f-7760ed096c4b")
    <T extends ExternDocumentType> List<T> getDefinedExternDocumentType(java.lang.Class<T> filterClass);

    @objid ("a566e422-3bde-4218-9432-5968b4646ae4")
    Profile getOwnerProfile();

    @objid ("d120777e-09dc-4777-aa1f-3c87bf1290a0")
    void setOwnerProfile(Profile value);

    @objid ("305c7508-a9e8-495b-9ae8-123802084967")
    EList<TagType> getDefinedTagType();

    @objid ("42a6531d-dc27-4b79-8af5-6412c25a73f2")
    <T extends TagType> List<T> getDefinedTagType(java.lang.Class<T> filterClass);

}
