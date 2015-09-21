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
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;

/**
 * TagType v0.0.9054
 * 
 * 
 * TagTypes are defined in MDA Modeler projects. 
 * 
 * TagTypes cannot be created using the J language. They belong at metalevel, and are not structured at model level.
 */
@objid ("008f48d2-c4be-1fd8-97fe-001ec947cd2a")
public interface TagType extends ModelElement {
    @objid ("47adb8a7-1d83-453f-81d3-cf4073c8f824")
    public static final String MNAME = "TagType";

    @objid ("1bb2d0a1-acf1-4d78-85d4-08a7d74e0427")
    ModuleComponent getModule();

    /**
     * Getter for attribute 'TagType.ParamNumber'
     * 
     * Metamodel description:
     * <i>Number of parameters an occurrence may have.</i>
     */
    @objid ("23b4112d-b7d3-41f4-a5df-d28daeb31616")
    String getParamNumber();

    /**
     * Setter for attribute 'TagType.ParamNumber'
     * 
     * Metamodel description:
     * <i>Number of parameters an occurrence may have.</i>
     */
    @objid ("914e98e1-a614-4181-927a-e59fe5b5b296")
    void setParamNumber(String value);

    /**
     * Getter for attribute 'TagType.IsQualified'
     * 
     * Metamodel description:
     * <i>Determines whether or not an occurrence (TaggedValue) has a qualifier.</i>
     */
    @objid ("5d0be54a-d570-43ae-b13b-a80c5429d555")
    boolean isIsQualified();

    /**
     * Setter for attribute 'TagType.IsQualified'
     * 
     * Metamodel description:
     * <i>Determines whether or not an occurrence (TaggedValue) has a qualifier.</i>
     */
    @objid ("193e71a9-75fd-466d-929f-e1dd66213cbb")
    void setIsQualified(boolean value);

    /**
     * Getter for attribute 'TagType.BelongToPrototype'
     * 
     * Metamodel description:
     * <i>Determines whether or not a TagType occurrence  belongs to the signature. For example, the TagType * that defines a pointer declaration in C++ belongs to the prototype of operations.</i>
     */
    @objid ("41aeae29-1230-4c97-b87b-f34c8a61b696")
    boolean isBelongToPrototype();

    /**
     * Setter for attribute 'TagType.BelongToPrototype'
     * 
     * Metamodel description:
     * <i>Determines whether or not a TagType occurrence  belongs to the signature. For example, the TagType * that defines a pointer declaration in C++ belongs to the prototype of operations.</i>
     */
    @objid ("016b506f-479a-4af2-9810-0e47d54ed741")
    void setBelongToPrototype(boolean value);

    /**
     * Getter for attribute 'TagType.IsHidden'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5233baf5-0300-4187-9efb-9c9910b48254")
    boolean isIsHidden();

    /**
     * Setter for attribute 'TagType.IsHidden'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("43ba78be-8f3f-416e-bdbd-31991d7221e0")
    void setIsHidden(boolean value);

    /**
     * Getter for attribute 'TagType.LabelKey'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("df41ed7e-a122-4aa9-897d-4ab684e608f9")
    String getLabelKey();

    /**
     * Setter for attribute 'TagType.LabelKey'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("974cd5fa-7d38-42df-aa47-5168837f7274")
    void setLabelKey(String value);

    /**
     * Getter for relation 'TagType->TagOccurence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ef5c1f86-28fe-4351-8ec7-66d1a59e0553")
    EList<TaggedValue> getTagOccurence();

    /**
     * Filtered Getter for relation 'TagType->TagOccurence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d43ba355-321d-4587-8972-bfa1e373ace1")
    <T extends TaggedValue> List<T> getTagOccurence(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'TagType->OwnerStereotype'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("dfaa22ec-2220-45bf-86f6-2591d12bad7c")
    Stereotype getOwnerStereotype();

    /**
     * Setter for relation 'TagType->OwnerStereotype'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0ebe0793-54ca-4305-b895-195d373b4a7a")
    void setOwnerStereotype(Stereotype value);

    /**
     * Getter for relation 'TagType->OwnerReference'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5d4b3b4a-3400-434f-a2e1-5d3d0c98b1d4")
    MetaclassReference getOwnerReference();

    /**
     * Setter for relation 'TagType->OwnerReference'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6a1e2ab9-e2e6-42fd-9763-b3f99ae8eefc")
    void setOwnerReference(MetaclassReference value);

}
