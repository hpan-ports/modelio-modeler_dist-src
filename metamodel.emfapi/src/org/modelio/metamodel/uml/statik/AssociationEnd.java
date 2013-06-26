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

    @objid ("de6d9313-f6ca-4695-a277-bc9a062d1d49")
    AggregationKind getAggregation();

    @objid ("a8ae50c4-e912-442a-a3dc-f35b59f1d4ae")
    void setAggregation(AggregationKind value);

    @objid ("eae0b022-0ef2-4068-954f-44c6484eb864")
    boolean isIsChangeable();

    @objid ("e0c2944a-84d7-4e7b-9794-14da35bd09d1")
    void setIsChangeable(boolean value);

    @objid ("9cc9f728-61fd-41f6-a679-ac2a006df7db")
    Classifier getTarget();

    @objid ("8f76701f-0b95-482e-9c53-05d7e3a867b6")
    void setTarget(Classifier value);

    @objid ("907c9325-3948-418b-a681-86844da4993b")
    AssociationEnd getOppositeOwner();

    @objid ("10101dd1-cfba-4d0f-a4c3-23b8841a5fc8")
    void setOppositeOwner(AssociationEnd value);

    @objid ("392412e8-39bb-46e5-a48f-0ae7588a2d9e")
    Classifier getSource();

    @objid ("e6460533-0e7e-4d27-abfa-7cfbebc23e3f")
    void setSource(Classifier value);

    @objid ("cb30ae35-084f-47af-bf74-1dc5f44f5de6")
    EList<LinkEnd> getOccurence();

    @objid ("19168e23-8ce7-49ad-8ed7-db9296968235")
    <T extends LinkEnd> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("11f4f6d9-69f3-4dde-bf63-c1ebe8e10c4b")
    EList<InformationFlow> getSent();

    @objid ("8f8a642e-4593-4536-bcd5-f3dd1cc4b4dd")
    <T extends InformationFlow> List<T> getSent(java.lang.Class<T> filterClass);

    @objid ("af3178b7-f91c-4e63-8813-42d9305319bc")
    EList<Attribute> getQualifier();

    @objid ("b925bd1e-c55b-4749-8a4e-aa5eadd1f0b9")
    <T extends Attribute> List<T> getQualifier(java.lang.Class<T> filterClass);

    @objid ("b77d03ee-46a7-42f8-a1e4-4651a6456019")
    AssociationEnd getOpposite();

    @objid ("0ae227e3-d361-41e7-8ffb-b912a1c3e356")
    void setOpposite(AssociationEnd value);

    @objid ("a8376591-323c-4ff0-b2e1-87ca63ecd4a6")
    EList<ObjectNode> getRepresentingObjectNode();

    @objid ("4ccc7929-8030-4b2c-908b-c3e9918887e5")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    @objid ("c5d13ece-f42a-4bed-b993-f349730650d5")
    Association getAssociation();

    @objid ("b2bf33a6-70d0-47c6-afc1-beb22f476990")
    void setAssociation(Association value);

    @objid ("e1ffc636-2a19-481e-9158-74482c4aba15")
    EList<BpmnItemAwareElement> getRepresentingItem();

    @objid ("3e15e60e-fa47-4847-9244-f8d3abb67dd8")
    <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass);

}
