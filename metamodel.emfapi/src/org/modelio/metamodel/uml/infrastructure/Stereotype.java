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

    @objid ("c3e4e88b-c5d1-4ff6-82d3-3e72fa290ca6")
    String getImage();

    @objid ("7df8f535-01d8-44d1-8293-de50fe44a827")
    void setImage(String value);

    @objid ("5cd6d2af-ef2f-4e7b-860f-99404f92dd83")
    String getIcon();

    @objid ("9e23a996-cce7-463d-9369-ff6c7f7e1592")
    void setIcon(String value);

    @objid ("3890bc2a-f4eb-4028-9c0d-9d86d223b7df")
    boolean isIsHidden();

    @objid ("76f0c385-faee-45d9-8f4b-a8f240cf1ecc")
    void setIsHidden(boolean value);

    @objid ("3b4304ce-d949-432d-abce-69d029a33708")
    String getLabelKey();

    @objid ("f2ac66c5-f505-45d8-8297-1a1321dac440")
    void setLabelKey(String value);

    @objid ("0d76dcd3-abb7-4917-bc59-5544867e0fe0")
    String getBaseClassName();

    @objid ("4df5d41b-7abd-427e-9525-d45c2a6dc1a2")
    void setBaseClassName(String value);

    @objid ("43733726-a441-467c-81b6-c97bb1e4f32d")
    PropertyTableDefinition getDefinedTable();

    @objid ("6cd19657-53d8-4a55-a521-73df4625139e")
    void setDefinedTable(PropertyTableDefinition value);

    @objid ("c66e4709-1534-445b-b5c2-4148ec462b26")
    EList<ModelElement> getExtendedElement();

    @objid ("92434626-ca24-4d35-be88-1f49f4c3e094")
    <T extends ModelElement> List<T> getExtendedElement(java.lang.Class<T> filterClass);

    @objid ("55be66c1-caa8-43a5-b29c-926a26671fc1")
    EList<ExternDocumentType> getDefinedExternDocumentType();

    @objid ("fc4ee524-f7ba-4195-bf7c-ba86d689b08b")
    <T extends ExternDocumentType> List<T> getDefinedExternDocumentType(java.lang.Class<T> filterClass);

    @objid ("b27c0b59-b499-4bfb-a8f9-ea58e4466329")
    Profile getOwner();

    @objid ("9fc07554-3d8f-45b3-86da-01d664b89ca4")
    void setOwner(Profile value);

    @objid ("06510345-f990-4df2-bc2b-568a36828ad3")
    Stereotype getParent();

    @objid ("4000b872-1144-41c8-9a8f-31d4415c0612")
    void setParent(Stereotype value);

    @objid ("2874de65-a1ca-4841-ab91-4231096a7e26")
    EList<TagType> getDefinedTagType();

    @objid ("812de514-26c9-416e-a1d7-f325c2f76834")
    <T extends TagType> List<T> getDefinedTagType(java.lang.Class<T> filterClass);

    @objid ("d28e0811-e268-4152-8310-318b4ed18b43")
    EList<Stereotype> getChild();

    @objid ("21bce9e8-1248-4c84-b556-5e9dfabbdc40")
    <T extends Stereotype> List<T> getChild(java.lang.Class<T> filterClass);

    @objid ("0383ddf7-a3b2-4316-8db7-5e09bb4fd233")
    EList<NoteType> getDefinedNoteType();

    @objid ("1a8c020a-a177-4028-9e3e-269332f0699b")
    <T extends NoteType> List<T> getDefinedNoteType(java.lang.Class<T> filterClass);

}
