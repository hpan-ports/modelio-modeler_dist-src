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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.GeneralClass;

/**
 * Attribute v0.0.9054
 * 
 * 
 * An Attribute is a named slot within a Classifier that describes a range of values that instances of the Classifier may hold.  
 * 
 * In Modelio, an Attribute belongs to a Classifier as a Feature or to an AssociationEnd as a Qualifier.
 */
@objid ("0097ec08-c4be-1fd8-97fe-001ec947cd2a")
public interface Attribute extends StructuralFeature {
    @objid ("05117e1a-412b-47c5-a033-d466b3d7efca")
    public static final String MNAME = "Attribute";

    /**
     * Getter for attribute 'Attribute.TypeConstraint'
     * 
     * Metamodel description:
     * <i>Provides an indication of the instanciation of the Attribute's elementary class. For example, in the case of an attribute string, TypeConstraint determines the size of the string (*, 10, etc.).</i>
     */
    @objid ("f9546c06-f760-412e-b183-12d730d2c0f5")
    String getTypeConstraint();

    /**
     * Setter for attribute 'Attribute.TypeConstraint'
     * 
     * Metamodel description:
     * <i>Provides an indication of the instanciation of the Attribute's elementary class. For example, in the case of an attribute string, TypeConstraint determines the size of the string (*, 10, etc.).</i>
     */
    @objid ("7bcca178-0c41-4916-9e26-dd8c9e35213f")
    void setTypeConstraint(String value);

    /**
     * Getter for attribute 'Attribute.Value'
     * 
     * Metamodel description:
     * <i>Default value of the Attribute. This value is assigned at creation time, unless a specific value is specified.</i>
     */
    @objid ("c0bc8648-a2e5-4471-a347-cbe98b7eed6d")
    String getValue();

    /**
     * Setter for attribute 'Attribute.Value'
     * 
     * Metamodel description:
     * <i>Default value of the Attribute. This value is assigned at creation time, unless a specific value is specified.</i>
     */
    @objid ("9e2aa8c4-a2dc-46ab-8b20-bf7517fb0138")
    void setValue(String value);

    /**
     * Getter for attribute 'Attribute.TargetIsClass'
     * 
     * Metamodel description:
     * <i>Determines that the target is itself a metaclass.</i>
     */
    @objid ("fafde33f-151a-460e-baf8-acb2c1ce1115")
    boolean isTargetIsClass();

    /**
     * Setter for attribute 'Attribute.TargetIsClass'
     * 
     * Metamodel description:
     * <i>Determines that the target is itself a metaclass.</i>
     */
    @objid ("537fea21-d0c4-4f2c-86b4-aeeb1c5cb27e")
    void setTargetIsClass(boolean value);

    /**
     * Getter for relation 'Attribute->Type'
     * 
     * Metamodel description:
     * <i>Determines which Class is the Attribute's type.</i>
     */
    @objid ("17ea6810-6228-41b1-ab66-98b353a07ebc")
    GeneralClass getType();

    /**
     * Setter for relation 'Attribute->Type'
     * 
     * Metamodel description:
     * <i>Determines which Class is the Attribute's type.</i>
     */
    @objid ("24a7bb21-0c82-4a96-8630-0d504edcca8f")
    void setType(GeneralClass value);

    /**
     * Getter for relation 'Attribute->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d75409dc-0bee-4def-8097-2a79676a547c")
    Classifier getOwner();

    /**
     * Setter for relation 'Attribute->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("13d72172-f89c-4280-816f-06a59c2f0403")
    void setOwner(Classifier value);

    /**
     * Getter for relation 'Attribute->Occurence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f60d1f43-6c33-4a7a-a601-4bdc4cd4070e")
    EList<AttributeLink> getOccurence();

    /**
     * Filtered Getter for relation 'Attribute->Occurence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("de162593-9f50-4189-a7c6-55c20e2f43ee")
    <T extends AttributeLink> List<T> getOccurence(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Attribute->RepresentingItem'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("111d3eb1-688f-4fde-a64d-1cdee0d404e8")
    EList<BpmnItemAwareElement> getRepresentingItem();

    /**
     * Filtered Getter for relation 'Attribute->RepresentingItem'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("52ffdb9a-9feb-42c8-8b0e-03554e8a37fa")
    <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Attribute->RepresentingObjectNode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("91a76c7b-f693-4ce9-a2b5-ea11b4d46e41")
    EList<ObjectNode> getRepresentingObjectNode();

    /**
     * Filtered Getter for relation 'Attribute->RepresentingObjectNode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f8f8e79a-5a59-4d7c-bddd-44b018b01038")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Attribute->Qualified'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b44b8d63-e18a-4418-ad0f-8f235ccba65d")
    AssociationEnd getQualified();

    /**
     * Setter for relation 'Attribute->Qualified'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a9516383-0070-4399-9ca8-1d512d5f38b8")
    void setQualified(AssociationEnd value);

}
