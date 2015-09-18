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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("0097ec08-c4be-1fd8-97fe-001ec947cd2a")
public interface Attribute extends StructuralFeature {
    @objid ("cb713782-ac1d-4711-ae58-01984b0b700e")
    String getTypeConstraint();

    @objid ("44d80ef4-1abf-49c6-8643-4250bc6f1607")
    void setTypeConstraint(String value);

    @objid ("b2063ed1-3e64-445c-acc9-c08b694d75d6")
    String getValue();

    @objid ("19f0a147-e90b-47f5-93c6-68b94eaa03d7")
    void setValue(String value);

    @objid ("0527376e-da95-4c40-8a46-dc60aadef9c6")
    boolean isTargetIsClass();

    @objid ("321a7cdb-8f9b-4360-8439-b57f42b1283d")
    void setTargetIsClass(boolean value);

    @objid ("54004820-7df0-4ef8-817c-02360d3926d4")
    GeneralClass getType();

    @objid ("bd8e983e-65fd-45c0-952f-c4c574d4e5f2")
    void setType(GeneralClass value);

    @objid ("a4fabce9-59a2-4a3b-bae4-c7ead75061d0")
    Classifier getOwner();

    @objid ("4e5a81a9-f5a1-4865-a36f-c0c1541d4ab9")
    void setOwner(Classifier value);

    @objid ("edbc39e1-6af0-434e-b28c-1d5f28cba586")
    EList<AttributeLink> getOccurence();

    @objid ("6d6de170-ba95-4ac7-bd28-884d0f749323")
    <T extends AttributeLink> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("f67b58ee-f96c-4768-9c79-938b3f2605d5")
    EList<BpmnItemAwareElement> getRepresentingItem();

    @objid ("19509ba9-a3cf-41ab-9e48-48818d8391f6")
    <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass);

    @objid ("99458a9d-58fc-472d-b8b3-858bbcd7e448")
    EList<ObjectNode> getRepresentingObjectNode();

    @objid ("81c2e550-cf09-408a-aa76-c9394cd8b079")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    @objid ("4346dfad-3a38-486e-bea6-f46180973d31")
    AssociationEnd getQualified();

    @objid ("f44815f5-b4b1-42ec-af0b-bfde3e218a3c")
    void setQualified(AssociationEnd value);

}
