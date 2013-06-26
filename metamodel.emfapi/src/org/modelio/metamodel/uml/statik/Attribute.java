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
    @objid ("e46c55c9-f9bc-44b1-bc0a-a70f310c3719")
    String getTypeConstraint();

    @objid ("d4eef569-cd42-43ea-a08f-9f762b1cb332")
    void setTypeConstraint(String value);

    @objid ("f5ccfaef-b417-4ba5-9697-74a6fd17455d")
    String getValue();

    @objid ("1420c995-c08b-41a6-9ed1-a7b764fe8b80")
    void setValue(String value);

    @objid ("3c4c8a8d-6f3b-4aec-a6b6-d141b784706d")
    boolean isTargetIsClass();

    @objid ("e6ff5d7f-8112-418c-95fa-61edaec14bc0")
    void setTargetIsClass(boolean value);

    @objid ("fae5c747-730b-4a4d-9531-7a71b4806bfd")
    GeneralClass getType();

    @objid ("fe381f7a-803d-4173-bd97-5c416cc97fe0")
    void setType(GeneralClass value);

    @objid ("113ececb-221c-474e-87f6-ae9feb8a1adc")
    Classifier getOwner();

    @objid ("5c644eab-4b15-4c3b-b588-50f1b973f2f7")
    void setOwner(Classifier value);

    @objid ("f0b31527-f939-4df6-becd-66215a1fa113")
    EList<AttributeLink> getOccurence();

    @objid ("9c23b7e1-6f4b-4487-bd21-63a8dd91a29a")
    <T extends AttributeLink> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("13e30f43-9976-4ac8-8a4f-49b9b0dd7f82")
    EList<BpmnItemAwareElement> getRepresentingItem();

    @objid ("465d8f21-da22-4ad8-964f-d83963868fa4")
    <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass);

    @objid ("423bbf7d-811c-4382-95a6-704acac6a8ed")
    EList<ObjectNode> getRepresentingObjectNode();

    @objid ("8bc9174e-b87c-407d-9e0f-6e811be83b51")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    @objid ("bcda4551-3c33-40d8-bc57-f8fa960fb188")
    AssociationEnd getQualified();

    @objid ("46d4fe43-bb5f-4427-a0e2-a1ffab59b6e0")
    void setQualified(AssociationEnd value);

}
