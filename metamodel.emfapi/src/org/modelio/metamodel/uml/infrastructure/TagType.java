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
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;

@objid ("008f48d2-c4be-1fd8-97fe-001ec947cd2a")
public interface TagType extends ModelElement {
    @objid ("1bb2d0a1-acf1-4d78-85d4-08a7d74e0427")
    ModuleComponent getModule();

    @objid ("cd009a77-963b-4535-b23b-f2c2ac049ad0")
    String getParamNumber();

    @objid ("81bf55c0-3208-4fae-92ff-fb3b128044fb")
    void setParamNumber(String value);

    @objid ("06e92692-b457-44c6-bc01-7b627623a7b5")
    boolean isIsQualified();

    @objid ("424aeccf-f0db-4a6c-98ee-af976719e269")
    void setIsQualified(boolean value);

    @objid ("e63d8d4c-25a9-449b-b19c-d38aa1b6ee98")
    boolean isBelongToPrototype();

    @objid ("36d8f459-66fc-48e8-a74a-bdbe8fde53f1")
    void setBelongToPrototype(boolean value);

    @objid ("105900d0-f6eb-4bf6-81a4-c1e3ed5c7565")
    boolean isIsHidden();

    @objid ("3a38851c-fded-4949-bda2-f7cc1836b6e7")
    void setIsHidden(boolean value);

    @objid ("a0cc622d-5286-4b9f-b6c9-1b4f3f408628")
    String getLabelKey();

    @objid ("3e2888b9-faa9-4490-a8f6-99e63e85f5d5")
    void setLabelKey(String value);

    @objid ("1e06f203-537e-4ec4-9468-a7ab8064a79f")
    EList<TaggedValue> getTagOccurence();

    @objid ("72613109-f68f-4c89-87c5-f3c19f1f1e03")
    <T extends TaggedValue> List<T> getTagOccurence(java.lang.Class<T> filterClass);

    @objid ("6ff790be-cc85-4b34-a4c6-a4338afb9ca5")
    Stereotype getOwnerStereotype();

    @objid ("0743c15d-3316-4570-9d32-a16dc76c571a")
    void setOwnerStereotype(Stereotype value);

    @objid ("4a4d1703-cd34-4c22-86de-3946647659d1")
    MetaclassReference getOwnerReference();

    @objid ("8277b397-4ec0-422d-b093-ceb935af1180")
    void setOwnerReference(MetaclassReference value);

}
