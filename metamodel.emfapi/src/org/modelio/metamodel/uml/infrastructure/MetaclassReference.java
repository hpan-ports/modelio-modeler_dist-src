/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;

/**
 * MetaclassReference v0.0.9054
 */
@objid ("0091820a-c4be-1fd8-97fe-001ec947cd2a")
public interface MetaclassReference extends Element {
    @objid ("fe517e0f-5c79-4e1f-92ca-9aa1a2cb94d8")
    public static final String MNAME = "MetaclassReference";

    /**
     * Getter for attribute 'MetaclassReference.ReferencedClassName'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bbe8352b-1b66-4c4a-a254-c7bb199458c6")
    String getReferencedClassName();

    /**
     * Setter for attribute 'MetaclassReference.ReferencedClassName'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("71d1cfb0-0a23-4d2f-a711-f03e805db6ad")
    void setReferencedClassName(String value);

    /**
     * Getter for relation 'MetaclassReference->DefinedTable'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("29042999-50f0-4d47-a124-2ab76297bc02")
    PropertyTableDefinition getDefinedTable();

    /**
     * Setter for relation 'MetaclassReference->DefinedTable'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1d163942-6418-440c-8cb9-97813875c63a")
    void setDefinedTable(PropertyTableDefinition value);

    /**
     * Getter for relation 'MetaclassReference->DefinedNoteType'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("fa6f949e-aaab-4f46-9849-123426d498cd")
    EList<NoteType> getDefinedNoteType();

    /**
     * Filtered Getter for relation 'MetaclassReference->DefinedNoteType'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("52647e28-3a01-4766-9cfc-88b6db83d581")
    <T extends NoteType> List<T> getDefinedNoteType(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'MetaclassReference->DefinedExternDocumentType'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("6c0e9fc7-02e1-4e24-9ad4-ced7286957cb")
    EList<ExternDocumentType> getDefinedExternDocumentType();

    /**
     * Filtered Getter for relation 'MetaclassReference->DefinedExternDocumentType'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("00eda3ec-c7e4-45bf-9e46-eedc022cb8e0")
    <T extends ExternDocumentType> List<T> getDefinedExternDocumentType(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'MetaclassReference->OwnerProfile'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("66a361b4-9575-49da-b884-a67262b2ec9a")
    Profile getOwnerProfile();

    /**
     * Setter for relation 'MetaclassReference->OwnerProfile'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fca1ba08-a69e-418a-8e88-2ba5ff93ad3c")
    void setOwnerProfile(Profile value);

    /**
     * Getter for relation 'MetaclassReference->DefinedTagType'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("5de00214-f0f6-4ddf-99d3-6ac48e108e48")
    EList<TagType> getDefinedTagType();

    /**
     * Filtered Getter for relation 'MetaclassReference->DefinedTagType'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("92df6873-aa28-4a89-ad02-461552178d83")
    <T extends TagType> List<T> getDefinedTagType(java.lang.Class<T> filterClass);

}
