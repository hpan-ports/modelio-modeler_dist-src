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

@objid ("008f48d2-c4be-1fd8-97fe-001ec947cd2a")
public interface TagType extends ModelElement {
    @objid ("1bb2d0a1-acf1-4d78-85d4-08a7d74e0427")
    ModuleComponent getModule();

    @objid ("f30eb3a4-245c-4c7d-8aba-5ff46b826938")
    String getParamNumber();

    @objid ("cc713a28-6318-4ade-8407-438f8fd368b2")
    void setParamNumber(String value);

    @objid ("67bd8cd0-b684-4a55-bf85-cb75a4a196aa")
    boolean isIsQualified();

    @objid ("f797593f-df90-4a83-a3ba-5e34155d1f34")
    void setIsQualified(boolean value);

    @objid ("ef7e2639-19ba-48c0-a0cf-92db3f6e5ae4")
    boolean isBelongToPrototype();

    @objid ("439e40ba-9897-48fe-a03b-6c593684e972")
    void setBelongToPrototype(boolean value);

    @objid ("c2327c7b-f32f-4d68-804f-716b448f5899")
    boolean isIsHidden();

    @objid ("33d354d1-2009-4ab0-99b6-2e15f8736af9")
    void setIsHidden(boolean value);

    @objid ("a3f44d7a-2f2c-4189-bdcd-06b314fd5f5e")
    String getLabelKey();

    @objid ("f5c90b6b-60bc-4f29-9748-524ea0d2526d")
    void setLabelKey(String value);

    @objid ("6643a4d5-377a-4d4e-af17-f73373baaba9")
    EList<TaggedValue> getTagOccurence();

    @objid ("6ef139b9-1da5-4be6-aaf4-ac38907bbad8")
    <T extends TaggedValue> List<T> getTagOccurence(java.lang.Class<T> filterClass);

    @objid ("d055b5ab-807a-4ea4-9484-6fb97f64aa38")
    Stereotype getOwnerStereotype();

    @objid ("4aa95813-49c7-4293-a7f6-b11b48792244")
    void setOwnerStereotype(Stereotype value);

    @objid ("dde3f981-50f9-4afb-9ca3-01c942a60d65")
    MetaclassReference getOwnerReference();

    @objid ("33301765-e28e-4dae-a8a3-9433fd0aab95")
    void setOwnerReference(MetaclassReference value);

}
