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
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;

@objid ("0092fefa-c4be-1fd8-97fe-001ec947cd2a")
public interface ExternDocumentType extends ModelElement {
    @objid ("1cb032b7-9ac9-46f1-b30f-f2f395b83488")
    ModuleComponent getModule();

    @objid ("79c4a97e-08d4-41d5-ab14-453b466f122e")
    boolean isIsHidden();

    @objid ("78f42b95-fca3-4ccb-89d3-f2ac7ee50f5d")
    void setIsHidden(boolean value);

    @objid ("61144824-cffd-43d0-89e5-c5ac5b441d3d")
    String getLabelKey();

    @objid ("0a86881f-63b5-4e6d-9485-20e16bae7410")
    void setLabelKey(String value);

    @objid ("b8ae62f6-8678-4aea-9f7c-9ab1330bb41e")
    String getIcon();

    @objid ("637ee0ac-6e69-4104-9fc8-fb095cea8123")
    void setIcon(String value);

    @objid ("eecf9f5e-80e9-45da-af0d-fc8bf4f79394")
    String getImage();

    @objid ("c309b1fd-9ffb-4d0d-a1e4-c5a25f262d5b")
    void setImage(String value);

    @objid ("91ce91e3-0cc4-4e35-b310-8225372278a7")
    Stereotype getOwnerStereotype();

    @objid ("d3187fab-8a32-472a-8875-b29b4a979826")
    void setOwnerStereotype(Stereotype value);

    @objid ("a7d47da1-9a3c-4082-89b4-5a86e61f6322")
    EList<ExternDocument> getTypedDoc();

    @objid ("4a7019c9-1cd9-4058-a454-015bba056f5b")
    <T extends ExternDocument> List<T> getTypedDoc(java.lang.Class<T> filterClass);

    @objid ("4b0e31a3-3289-44b4-826b-bb506be8238c")
    MetaclassReference getOwnerReference();

    @objid ("f43e9c15-e500-4164-a89f-0145ffd1e8d9")
    void setOwnerReference(MetaclassReference value);

}
