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

    @objid ("72c3ae3d-7b96-48fd-97ea-70fa97d5ad0b")
    String getImage();

    @objid ("de79d213-fbd2-4ee6-957e-b3fb44a18d53")
    void setImage(String value);

    @objid ("6f8b7106-88c0-4b2f-90b7-990842480f88")
    String getIcon();

    @objid ("4c41df3a-8835-4e95-9c45-f573ea963d3b")
    void setIcon(String value);

    @objid ("98c631fa-e2bc-4c35-9ca4-cd94eb32a5f6")
    boolean isIsHidden();

    @objid ("29106cdf-cfc2-448d-a273-3d5da9889875")
    void setIsHidden(boolean value);

    @objid ("b8906586-fe55-4b73-9693-8c6fe388e07f")
    String getLabelKey();

    @objid ("546351d3-ede6-4fc4-a9f3-219fd02fe903")
    void setLabelKey(String value);

    @objid ("9db53837-bd91-4763-9b64-1fbe758a6cac")
    String getBaseClassName();

    @objid ("a71cdbfd-8bd4-4ec3-af35-a8bc775d9588")
    void setBaseClassName(String value);

    @objid ("fc8fc21a-4834-4131-9d4c-53133d2f7015")
    PropertyTableDefinition getDefinedTable();

    @objid ("8fed3874-cda9-4c13-b83c-15435830cf4d")
    void setDefinedTable(PropertyTableDefinition value);

    @objid ("152f37b6-4f4e-4127-a4ab-b22935691af1")
    EList<ModelElement> getExtendedElement();

    @objid ("7d3f56b2-07b4-4502-b43f-05167f5ee41a")
    <T extends ModelElement> List<T> getExtendedElement(java.lang.Class<T> filterClass);

    @objid ("2ef468e6-74c7-483e-9731-aae50be63fbc")
    EList<ExternDocumentType> getDefinedExternDocumentType();

    @objid ("622d75b7-6473-4295-b8c5-0ddf3239389f")
    <T extends ExternDocumentType> List<T> getDefinedExternDocumentType(java.lang.Class<T> filterClass);

    @objid ("766d78ca-5955-48c3-a778-5a6c59a3d908")
    Profile getOwner();

    @objid ("d62adf2c-4351-45f9-bf01-e4f180bbf793")
    void setOwner(Profile value);

    @objid ("28dbb50c-d23b-4ed3-a51c-544986003b88")
    Stereotype getParent();

    @objid ("5252715d-147f-4791-9dff-4f449947c2ff")
    void setParent(Stereotype value);

    @objid ("cd926573-ae23-44b0-9f8b-abd94e0701c9")
    EList<TagType> getDefinedTagType();

    @objid ("ff72ba24-3c3a-4e44-a6e5-49fea3cd820d")
    <T extends TagType> List<T> getDefinedTagType(java.lang.Class<T> filterClass);

    @objid ("c1073e12-47cf-4d99-97de-1d8fb8e5dd3c")
    EList<Stereotype> getChild();

    @objid ("6d7d8b71-6a47-4494-a324-06e0cf9b1e78")
    <T extends Stereotype> List<T> getChild(java.lang.Class<T> filterClass);

    @objid ("949137f3-2dbf-48d5-9b9f-a263046e6b8e")
    EList<NoteType> getDefinedNoteType();

    @objid ("ecbdddf5-121f-467c-983f-f926f1a00efc")
    <T extends NoteType> List<T> getDefinedNoteType(java.lang.Class<T> filterClass);

}
