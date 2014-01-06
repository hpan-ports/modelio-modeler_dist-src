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
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;

@objid ("008f48d2-c4be-1fd8-97fe-001ec947cd2a")
public interface TagType extends ModelElement {
    @objid ("1bb2d0a1-acf1-4d78-85d4-08a7d74e0427")
    ModuleComponent getModule();

    @objid ("93596d58-4b09-4905-b9ef-d10721d88cce")
    String getParamNumber();

    @objid ("d7887f17-a942-4826-a619-d8ac96f6a591")
    void setParamNumber(String value);

    @objid ("480e6cec-b6ed-4911-a090-cbf0595c5a42")
    boolean isIsQualified();

    @objid ("05544f73-9b30-47a2-84e6-2f17b08f8da5")
    void setIsQualified(boolean value);

    @objid ("96a55b75-efad-474d-99c5-f469a0ff4882")
    boolean isBelongToPrototype();

    @objid ("fe781c13-6dc1-471d-b3b1-a8b758d2a110")
    void setBelongToPrototype(boolean value);

    @objid ("0f4923e0-d48d-4969-ba4c-cdda6fb86a17")
    boolean isIsHidden();

    @objid ("f928b198-04e4-47fa-978e-9e449f16962e")
    void setIsHidden(boolean value);

    @objid ("2bc67e37-c342-46a4-ada5-0939421ada69")
    String getLabelKey();

    @objid ("0cf36c5e-36b7-4219-b757-6edd0b7ee616")
    void setLabelKey(String value);

    @objid ("9b4c4cba-0534-4c3e-b0e7-69c41e9d73b7")
    EList<TaggedValue> getTagOccurence();

    @objid ("8621d34a-5bda-4393-86fe-99008ba33476")
    <T extends TaggedValue> List<T> getTagOccurence(java.lang.Class<T> filterClass);

    @objid ("88b1c587-9b3e-4108-b815-3023ca4ea765")
    Stereotype getOwnerStereotype();

    @objid ("d0ca9415-e18a-4aee-af06-c6e038785c7c")
    void setOwnerStereotype(Stereotype value);

    @objid ("1e1d75f3-83ef-413f-babb-3a2030f4aeff")
    MetaclassReference getOwnerReference();

    @objid ("53a222f9-bb1a-4496-a674-e7b29a3bfb9e")
    void setOwnerReference(MetaclassReference value);

}
