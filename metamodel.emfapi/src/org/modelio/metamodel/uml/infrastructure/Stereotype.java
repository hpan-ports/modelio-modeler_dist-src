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
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;

@objid ("008d239a-c4be-1fd8-97fe-001ec947cd2a")
public interface Stereotype extends ModelElement {
    @objid ("27dde74f-c802-420a-8472-e6f2e9d112a7")
    ModuleComponent getModule();

    @objid ("d8a4244a-ec16-4631-bb3c-3fbb2f779279")
    String getImage();

    @objid ("6c338f28-5bf2-46d5-90f9-3cdef119e06b")
    void setImage(String value);

    @objid ("bbcf9a9a-22ea-40d7-a145-fd23b141522a")
    String getIcon();

    @objid ("7d77e5be-e1b3-459d-aa35-d477eb952736")
    void setIcon(String value);

    @objid ("575841e1-a609-4f4f-823f-c24d24eadaf6")
    boolean isIsHidden();

    @objid ("f5fac9ca-5385-4754-bd9d-ed39bac7c4f1")
    void setIsHidden(boolean value);

    @objid ("0b6c4349-48b7-41a6-a018-47b24f0842be")
    String getLabelKey();

    @objid ("6bbe55c4-57d3-4be5-a4db-851c8e39a83c")
    void setLabelKey(String value);

    @objid ("73b8e0ce-fcd6-41bf-bb9a-f958903355fb")
    String getBaseClassName();

    @objid ("d08397a9-1b6b-43fa-9215-4fa31bc71626")
    void setBaseClassName(String value);

    @objid ("8875d630-ff94-4e02-be68-1554958173ad")
    PropertyTableDefinition getDefinedTable();

    @objid ("71054d1a-1b39-4635-87ee-e446cdab1c7c")
    void setDefinedTable(PropertyTableDefinition value);

    @objid ("3bd4cdf5-247b-4e53-939b-5a2854481e5e")
    EList<ModelElement> getExtendedElement();

    @objid ("acea35e1-1c6f-4903-9786-54a0c830c91b")
    <T extends ModelElement> List<T> getExtendedElement(java.lang.Class<T> filterClass);

    @objid ("b020e24f-3b3f-45c9-aa38-ec8fb6d6d1d3")
    EList<ExternDocumentType> getDefinedExternDocumentType();

    @objid ("bee531b3-0b46-441f-9896-653081c0fe28")
    <T extends ExternDocumentType> List<T> getDefinedExternDocumentType(java.lang.Class<T> filterClass);

    @objid ("0163a5ae-2187-40ca-8c38-daa45e324fdf")
    Profile getOwner();

    @objid ("927f1bf5-f5c4-4b20-abf2-80bd979c5743")
    void setOwner(Profile value);

    @objid ("7d8d232d-8246-48a9-8f45-272b484f39aa")
    Stereotype getParent();

    @objid ("695474e4-c4fb-40c8-ae0b-ee00322f6744")
    void setParent(Stereotype value);

    @objid ("86704172-1222-484a-9d97-9d039b38bd53")
    EList<TagType> getDefinedTagType();

    @objid ("857235af-c956-43a6-a7ac-ad07cefa84df")
    <T extends TagType> List<T> getDefinedTagType(java.lang.Class<T> filterClass);

    @objid ("e1e1c3c0-c033-41b7-b801-c824609fc7cc")
    EList<Stereotype> getChild();

    @objid ("7958a977-b93c-4825-a3bb-10f0327b809d")
    <T extends Stereotype> List<T> getChild(java.lang.Class<T> filterClass);

    @objid ("ab3a6707-3217-4f2f-aaf3-49cdb18ba915")
    EList<NoteType> getDefinedNoteType();

    @objid ("1c1e7c4f-b071-4c77-8775-bce68b342025")
    <T extends NoteType> List<T> getDefinedNoteType(java.lang.Class<T> filterClass);

}
