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
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;

/**
 * Stereotype v0.0.9054
 * 
 * 
 * Through Stereotypes, the end user can create new icons and new adaptations of ModelElements. 
 * 
 * Stereotypes cannot be created with the J language. They are defined at meta level, and do not belong to a ModelElement at model level.
 */
@objid ("008d239a-c4be-1fd8-97fe-001ec947cd2a")
public interface Stereotype extends ModelElement {
    @objid ("76c2ebe6-976a-4c2c-986d-a5540c099bc4")
    public static final String MNAME = "Stereotype";

    @objid ("27dde74f-c802-420a-8472-e6f2e9d112a7")
    ModuleComponent getModule();

    /**
     * Getter for attribute 'Stereotype.Image'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2f84fafc-7365-42fe-9b78-990c1403b9af")
    String getImage();

    /**
     * Setter for attribute 'Stereotype.Image'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f2c5ec52-c2fa-45b0-91b9-b2401a805ff7")
    void setImage(String value);

    /**
     * Getter for attribute 'Stereotype.Icon'
     * 
     * Metamodel description:
     * <i>Icon that can represent the stereotyped ModelElement.</i>
     */
    @objid ("7220e666-19cd-425f-a582-afe816da4eef")
    String getIcon();

    /**
     * Setter for attribute 'Stereotype.Icon'
     * 
     * Metamodel description:
     * <i>Icon that can represent the stereotyped ModelElement.</i>
     */
    @objid ("e916e081-5435-48ba-bba0-50d1a8098bff")
    void setIcon(String value);

    /**
     * Getter for attribute 'Stereotype.IsHidden'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("1d98722f-9f0c-4af6-9b21-dc320fd2669b")
    boolean isIsHidden();

    /**
     * Setter for attribute 'Stereotype.IsHidden'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("771a081f-f349-4c30-b520-83866beb8d8c")
    void setIsHidden(boolean value);

    /**
     * Getter for attribute 'Stereotype.LabelKey'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("ec04ded9-8ebd-4cb2-b04c-25697da2dda4")
    String getLabelKey();

    /**
     * Setter for attribute 'Stereotype.LabelKey'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("f190da92-a7a3-4c71-9012-f6a80033e053")
    void setLabelKey(String value);

    /**
     * Getter for attribute 'Stereotype.BaseClassName'
     * 
     * Metamodel description:
     * <i>MetaClass whose instances can be annotated by the current Stereotype.</i>
     */
    @objid ("07342616-87b8-46eb-bbdf-e3baa35f0a28")
    String getBaseClassName();

    /**
     * Setter for attribute 'Stereotype.BaseClassName'
     * 
     * Metamodel description:
     * <i>MetaClass whose instances can be annotated by the current Stereotype.</i>
     */
    @objid ("9f1c9b1d-332b-4807-96e7-139b18bcde14")
    void setBaseClassName(String value);

    /**
     * Getter for relation 'Stereotype->DefinedTable'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a45c89b3-9fff-43d9-8f05-44318d01bbac")
    PropertyTableDefinition getDefinedTable();

    /**
     * Setter for relation 'Stereotype->DefinedTable'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cd587953-b551-4069-b993-0762d9946154")
    void setDefinedTable(PropertyTableDefinition value);

    /**
     * Getter for relation 'Stereotype->ExtendedElement'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("b02cd203-db95-495d-a2f8-75f60e29387b")
    EList<ModelElement> getExtendedElement();

    /**
     * Filtered Getter for relation 'Stereotype->ExtendedElement'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("0db61777-98d5-4c4c-9257-f8de6281cfa6")
    <T extends ModelElement> List<T> getExtendedElement(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Stereotype->DefinedExternDocumentType'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ed9df6ec-17b4-4d7f-8590-a71b0ca61958")
    EList<ExternDocumentType> getDefinedExternDocumentType();

    /**
     * Filtered Getter for relation 'Stereotype->DefinedExternDocumentType'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("519dfd8a-90c7-4fa8-bdd5-ebdb2b95a5d5")
    <T extends ExternDocumentType> List<T> getDefinedExternDocumentType(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Stereotype->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("28c571ea-7d64-4eb6-808f-740cb193859c")
    Profile getOwner();

    /**
     * Setter for relation 'Stereotype->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f03eba43-6583-42e9-b92b-f21ec84e0038")
    void setOwner(Profile value);

    /**
     * Getter for relation 'Stereotype->Parent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c138b88d-4f43-4c99-9a2b-5cf7d93ad941")
    Stereotype getParent();

    /**
     * Setter for relation 'Stereotype->Parent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bb583f59-eda3-43d2-a520-483c150b41ca")
    void setParent(Stereotype value);

    /**
     * Getter for relation 'Stereotype->DefinedTagType'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("59f0c63c-1dd9-4526-b310-62f44c9bd0cc")
    EList<TagType> getDefinedTagType();

    /**
     * Filtered Getter for relation 'Stereotype->DefinedTagType'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("858ad1de-f1ee-4358-b8a2-bd08aa3566ce")
    <T extends TagType> List<T> getDefinedTagType(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Stereotype->Child'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a611ddee-ccd5-4e60-8e42-220fd3f006ad")
    EList<Stereotype> getChild();

    /**
     * Filtered Getter for relation 'Stereotype->Child'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b30359df-7712-4d26-b39b-b473b689bc4c")
    <T extends Stereotype> List<T> getChild(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Stereotype->DefinedNoteType'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("e8a01547-7d9c-4deb-b7bc-9fb043189401")
    EList<NoteType> getDefinedNoteType();

    /**
     * Filtered Getter for relation 'Stereotype->DefinedNoteType'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("772c15ee-8c7c-4b39-9f7f-5568279606f6")
    <T extends NoteType> List<T> getDefinedNoteType(java.lang.Class<T> filterClass);

}
