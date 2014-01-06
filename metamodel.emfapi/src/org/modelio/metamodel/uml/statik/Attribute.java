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
    @objid ("442f5c4b-21a7-4074-9d9a-8eb867744453")
    String getTypeConstraint();

    @objid ("560a74a3-08b3-447a-98f2-c9943b213f3d")
    void setTypeConstraint(String value);

    @objid ("a88d3278-0438-4e97-b8cf-63aa3db65647")
    String getValue();

    @objid ("64360e42-9d17-40a3-8b96-003eaed14880")
    void setValue(String value);

    @objid ("dac01877-73a2-432f-a9de-c08e66647e2f")
    boolean isTargetIsClass();

    @objid ("7f682d7d-b035-4063-b41d-e4439a683247")
    void setTargetIsClass(boolean value);

    @objid ("5700cb9b-44c5-40b3-af05-0ba279b5fe2f")
    GeneralClass getType();

    @objid ("42feb1b9-179d-4425-a341-98db9183c957")
    void setType(GeneralClass value);

    @objid ("0973244b-722d-4484-b513-fb908aec60a9")
    Classifier getOwner();

    @objid ("181dee9a-777f-438f-920c-2bd1b7638c78")
    void setOwner(Classifier value);

    @objid ("62a6ec02-42c3-4ae6-9d15-dcf83668f29a")
    EList<AttributeLink> getOccurence();

    @objid ("3bc678e1-77d4-48a2-a60b-8dc8e6c83a9f")
    <T extends AttributeLink> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("1a411d5f-3814-4bd8-80d3-378f7b6661de")
    EList<BpmnItemAwareElement> getRepresentingItem();

    @objid ("d97b62f6-64f5-4271-8b11-dc4a67e81eb9")
    <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass);

    @objid ("dfdfc486-a350-4df0-a801-2cf5c6c4e12a")
    EList<ObjectNode> getRepresentingObjectNode();

    @objid ("0cbcdbf1-fec8-4e36-8731-e311e7d54493")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    @objid ("1fdf5533-994d-4e43-bbee-047f4d137f5c")
    AssociationEnd getQualified();

    @objid ("3544204a-f351-4262-878a-0cfbfa7cf34c")
    void setQualified(AssociationEnd value);

}
