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
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.AggregationKind;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.LinkEnd;

@objid ("00974ea6-c4be-1fd8-97fe-001ec947cd2a")
public interface AssociationEnd extends StructuralFeature {
    /**
     * Get the 'graphical owner' related to this end.
     * The owner is the current source or the opposite end's target according to the navigability.
     */
    @objid ("1bfd0899-45a2-49c8-b8dc-083141e68be2")
    Classifier getOwner();

    /**
     * Sets both ends sources and targets according to the given navigability.
     * <ul>
     * <li>THISSIDE: only current source and target must be filled.</li>
     * <li>OHERSIDE: only opposite source and target must be filled.</li>
     * <li>BOTHSIDES: current source must be equals to opposite target as well as current target and opposite source.</li>
     * <li>NONE: both sources must be filled, but no target</li>
     * </ul>
     * @param value whether or not to synchronize the other end and both source/target values. This end will be made navigable whatever the current navigability is.
     */
    @objid ("00788250-28da-1080-943a-001ec947cd2a")
    void setNavigable(boolean value);

    /**
     * Sets the value of the 'target' dependency.
     * @param fixModel whether or not to synchronize the other end and both source/target values. This end will be made navigable whatever the current navigability is.
     */
    @objid ("00308234-28fb-1080-943a-001ec947cd2a")
    void setTarget(Classifier value, boolean fixModel);

    /**
     * Sets the value of the 'source' dependency.
     * @param fixModel whether or not to synchronize the other end and both source/target values. This end will be made navigable whatever the current navigability is.
     */
    @objid ("000bdc7c-291a-1080-943a-001ec947cd2a")
    void setSource(Classifier value, boolean fixModel);

    @objid ("44b82fff-5b39-4aaa-ac0d-ddb26b837ecd")
    boolean isNavigable();

    @objid ("5c3902e7-09ac-4102-a31c-0d8c7045e9f8")
    AggregationKind getAggregation();

    @objid ("f0402181-df0f-4fc6-8c19-a2d64cd02b16")
    void setAggregation(AggregationKind value);

    @objid ("ae423f6d-10d7-4bb1-82f4-4d547602942b")
    boolean isIsChangeable();

    @objid ("636dc4d8-44c3-49b3-9a34-8d06f61d5cd6")
    void setIsChangeable(boolean value);

    @objid ("8e0ff414-7553-41ee-b337-767e499d781e")
    Classifier getTarget();

    @objid ("9fecd59a-7b58-4b0c-9743-ec8337f553e9")
    void setTarget(Classifier value);

    @objid ("81451826-2a3d-414d-aa15-4cc8471362b2")
    AssociationEnd getOppositeOwner();

    @objid ("509fb17c-a3be-474d-9b19-d7c893971699")
    void setOppositeOwner(AssociationEnd value);

    @objid ("24d97813-33cd-425d-8a07-1397d74b9aae")
    Classifier getSource();

    @objid ("5861baed-0d69-413e-9c08-469640bd78a3")
    void setSource(Classifier value);

    @objid ("a94e5e71-8458-48e9-bd6f-c356520eba65")
    EList<LinkEnd> getOccurence();

    @objid ("9a18839a-f8d5-49ec-b562-3a723d328660")
    <T extends LinkEnd> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("d4bcc96f-72d6-48d0-b4bf-ddd3b041dae7")
    EList<InformationFlow> getSent();

    @objid ("3361c0e5-4b58-446f-ab39-3fe39a976446")
    <T extends InformationFlow> List<T> getSent(java.lang.Class<T> filterClass);

    @objid ("3d673164-6de6-4c2a-931c-ebbf07229e11")
    EList<Attribute> getQualifier();

    @objid ("5f230190-aa97-4c13-ae4e-3edd2e0271b7")
    <T extends Attribute> List<T> getQualifier(java.lang.Class<T> filterClass);

    @objid ("3d2e726f-3c5a-4b29-8884-292353621b04")
    AssociationEnd getOpposite();

    @objid ("fb97d03b-0df2-4478-b18c-9b19eb9b2ee2")
    void setOpposite(AssociationEnd value);

    @objid ("58e0c036-61e0-49e5-81c2-b8813a861167")
    EList<ObjectNode> getRepresentingObjectNode();

    @objid ("2ba1d1e6-7daa-44c4-a941-02b0ae8ffd40")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    @objid ("52e71142-afe7-4915-94e0-e1292cac3c05")
    Association getAssociation();

    @objid ("cf8f3ff9-2ee6-4e80-8315-0350ae08d91d")
    void setAssociation(Association value);

    @objid ("15b4119d-f6ad-4b4f-8793-98557f59f0bc")
    EList<BpmnItemAwareElement> getRepresentingItem();

    @objid ("1db448ef-dc04-4bd6-81b1-7340ae497333")
    <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass);

}
