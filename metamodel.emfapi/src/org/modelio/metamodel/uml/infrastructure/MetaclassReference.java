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
    @objid ("61d04908-7b55-4d7b-9304-49313eb48d99")
    String getReferencedClassName();

    @objid ("fbefcf8b-40aa-4058-8cfe-586578ef9fbb")
    void setReferencedClassName(String value);

    @objid ("e514957a-1f64-465a-b004-174881dc10f9")
    PropertyTableDefinition getDefinedTable();

    @objid ("ce1326be-c3d8-4004-bed8-441f16656d64")
    void setDefinedTable(PropertyTableDefinition value);

    @objid ("611a6070-2274-4900-af8d-871567334cc2")
    EList<NoteType> getDefinedNoteType();

    @objid ("0886911d-34ad-4d26-9fc3-bb7339404e23")
    <T extends NoteType> List<T> getDefinedNoteType(java.lang.Class<T> filterClass);

    @objid ("f720b5fd-0112-4a43-bed1-9578fe6f64b4")
    EList<ExternDocumentType> getDefinedExternDocumentType();

    @objid ("8cc6eca2-8b9b-40f7-bb70-aac73da42a5e")
    <T extends ExternDocumentType> List<T> getDefinedExternDocumentType(java.lang.Class<T> filterClass);

    @objid ("c948e9a5-a14b-4fe9-800b-9a438ac9485f")
    Profile getOwnerProfile();

    @objid ("bc6f7fd8-2bae-41cc-9b7a-1cab950d7f7a")
    void setOwnerProfile(Profile value);

    @objid ("b853f5d8-5b00-4e9c-afce-acb3be115f80")
    EList<TagType> getDefinedTagType();

    @objid ("8e13f064-d70c-4877-95db-c3611137ba4d")
    <T extends TagType> List<T> getDefinedTagType(java.lang.Class<T> filterClass);

}
