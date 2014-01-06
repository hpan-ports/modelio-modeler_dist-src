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
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;

@objid ("0092fefa-c4be-1fd8-97fe-001ec947cd2a")
public interface ExternDocumentType extends ModelElement {
    @objid ("1cb032b7-9ac9-46f1-b30f-f2f395b83488")
    ModuleComponent getModule();

    @objid ("e3b7a053-3c99-4a1c-acb5-142060a60d3f")
    boolean isIsHidden();

    @objid ("dd2a2d55-cb5a-480f-ada4-f12432de89eb")
    void setIsHidden(boolean value);

    @objid ("eba82e8d-a162-4f23-baff-0996268e11ce")
    String getLabelKey();

    @objid ("69bdfba5-d57a-43a6-a8d9-0bc8fa5952e5")
    void setLabelKey(String value);

    @objid ("674518a4-70d0-4f9b-ad69-986e15033967")
    String getIcon();

    @objid ("3b6c2139-eb59-486e-a955-60ccbc8925b2")
    void setIcon(String value);

    @objid ("e1fdba71-135a-4944-91b2-48224582e40e")
    String getImage();

    @objid ("6be597e6-29b7-4243-8536-b3297e27eb74")
    void setImage(String value);

    @objid ("74569419-1337-4ae4-9aa4-190ff3673ad5")
    Stereotype getOwnerStereotype();

    @objid ("1a843c0e-b910-483d-aca1-65426bbc9ab3")
    void setOwnerStereotype(Stereotype value);

    @objid ("bcf9c9b7-f625-40fd-bedd-052f06dcdf44")
    EList<ExternDocument> getTypedDoc();

    @objid ("cda079a0-7d1c-492b-b88e-67c66a4f510b")
    <T extends ExternDocument> List<T> getTypedDoc(java.lang.Class<T> filterClass);

    @objid ("65f5ba19-ed4d-4397-837e-9106332cb09d")
    MetaclassReference getOwnerReference();

    @objid ("d835bc37-d157-46ec-842b-8cc54b5a1037")
    void setOwnerReference(MetaclassReference value);

}
