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
package org.modelio.metamodel.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.MessageFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * ActivityPartition v0.0.9054
 * 
 * 
 * Partitions divide the nodes and edges to constrain and show a view of the contained nodes. Partitions can share contents. They often correspond to organizational units in a business model. They may be used to allocate characteristics or resources among the nodes of an activity.
 * 
 * Partitions do not affect the token flow of the model. They constrain and provide a view on the behaviors invoked in activities. Constraints vary according to the type of element that the partition represents. The following constraints are normative:
 * 
 * 1) Classifier
 * Behaviors of invocations contained by the partition are the responsibility of instances of the classifier represented by the partition. This means the context of invoked behaviors is the classifier. Invoked procedures containing a call to an operation or sending a signal must target objects at runtime that are instances of the classifier.
 * 
 * 2) Instance
 * This imposes the same constraints as classifier, but restricted to a particular instance of the classifier.
 * 
 * 3) Part
 * Behaviors of invocations contained by the partition are the responsibility of instances playing the part represented by the partition. This imposes the constraints for classifiers above according to the type of the part. In addition, invoked procedures containing a call to an operation or sending a signal must target objects at runtime that play the part at the time the message is sent. Just as partitions in the same dimension and nesting must be represented by parts of the same classifier�??s internal structure, all the runtime target objects of operation and signal passing invoked by the same execution of the activity must play parts of the same instance of the structured classifier. In particular, if an activity is executed in the context of a particular object at runtime, the parts of that object will be used as targets. If a part has more than one object playing it at runtime, the invocations are treated as if they were multiple, that is, the calls are sent in parallel, and 
 * the invocation does not complete until all the operations return.
 * 
 * 4) Attribute and Value
 * A partition may be represented by an attribute and its subpartitions by values of that attribute. Behaviors of invocations contained by the subpartition have this attribute and the value represented by the subpartition. For example, a partition may represent the location at which a behavior is carried out, and the subpartitions would represent specific values for that attribute, such as Chicago. The location attribute could be on the process class associated with an activity, or added in a profile to extend behaviors with these attributes.
 */
@objid ("0029d8f8-c4bf-1fd8-97fe-001ec947cd2a")
public interface ActivityPartition extends ActivityGroup {
    @objid ("6573a929-d342-458a-bbe4-14df9d2e9e24")
    public static final String MNAME = "ActivityPartition";

    /**
     * Getter for attribute 'ActivityPartition.IsDimension'
     * 
     * Metamodel description:
     * <i>Indicates whether the partition groups other partitions along a dimension.</i>
     */
    @objid ("050acd01-ec79-4626-af69-f617eb1ac04c")
    boolean isIsDimension();

    /**
     * Setter for attribute 'ActivityPartition.IsDimension'
     * 
     * Metamodel description:
     * <i>Indicates whether the partition groups other partitions along a dimension.</i>
     */
    @objid ("e3dcf253-b144-4d9f-8aaa-73bc94acf896")
    void setIsDimension(boolean value);

    /**
     * Getter for attribute 'ActivityPartition.IsExternal'
     * 
     * Metamodel description:
     * <i>Indicates whether the partition represents an entity to which the partitioning structure does not apply.</i>
     */
    @objid ("42fd5b51-65ba-40cc-aaf9-90bdaacf95e0")
    boolean isIsExternal();

    /**
     * Setter for attribute 'ActivityPartition.IsExternal'
     * 
     * Metamodel description:
     * <i>Indicates whether the partition represents an entity to which the partitioning structure does not apply.</i>
     */
    @objid ("3cea7ef0-225b-4e17-a486-b69788be8198")
    void setIsExternal(boolean value);

    /**
     * Getter for relation 'ActivityPartition->Represented'
     * 
     * Metamodel description:
     * <i>An element constraining behaviors invoked by nodes in the partition. A partition should represent a classifier, an attribute, its value a parameter or an instance.</i>
     */
    @objid ("76ea24b2-f12b-4702-91a8-bfe7f997b996")
    ModelElement getRepresented();

    /**
     * Setter for relation 'ActivityPartition->Represented'
     * 
     * Metamodel description:
     * <i>An element constraining behaviors invoked by nodes in the partition. A partition should represent a classifier, an attribute, its value a parameter or an instance.</i>
     */
    @objid ("e29937f2-6894-4a6a-943e-4467044d3e2a")
    void setRepresented(ModelElement value);

    /**
     * Getter for relation 'ActivityPartition->ContainedNode'
     * 
     * Metamodel description:
     * <i>Nodes immediately contained in the partition. </i>
     */
    @objid ("377d1d0d-e968-4ded-bd89-677ba7ca3d8f")
    EList<ActivityNode> getContainedNode();

    /**
     * Filtered Getter for relation 'ActivityPartition->ContainedNode'
     * 
     * Metamodel description:
     * <i>Nodes immediately contained in the partition. </i>
     */
    @objid ("504c550f-28f6-451b-ae01-d5e09e2a6f67")
    <T extends ActivityNode> List<T> getContainedNode(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ActivityPartition->Outgoing'
     * 
     * Metamodel description:
     * <i>Outgoing BPMN messages.</i>
     */
    @objid ("b8d649a0-6a8b-45de-bf1d-9f38643fff11")
    EList<MessageFlow> getOutgoing();

    /**
     * Filtered Getter for relation 'ActivityPartition->Outgoing'
     * 
     * Metamodel description:
     * <i>Outgoing BPMN messages.</i>
     */
    @objid ("1a747049-5928-4a14-91f8-a890577d8574")
    <T extends MessageFlow> List<T> getOutgoing(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ActivityPartition->SuperPartition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c25f7133-f16b-434f-8cb0-313c36a1cf13")
    ActivityPartition getSuperPartition();

    /**
     * Setter for relation 'ActivityPartition->SuperPartition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7366d736-8da7-4326-b97a-ece57d6608f6")
    void setSuperPartition(ActivityPartition value);

    /**
     * Getter for relation 'ActivityPartition->SubPartition'
     * 
     * Metamodel description:
     * <i>Partitions immediately contained in the partition.</i>
     */
    @objid ("e15f56be-5bf5-40d8-ade8-466fe3c36026")
    EList<ActivityPartition> getSubPartition();

    /**
     * Filtered Getter for relation 'ActivityPartition->SubPartition'
     * 
     * Metamodel description:
     * <i>Partitions immediately contained in the partition.</i>
     */
    @objid ("1270d132-405a-4f24-b495-2d5ba95e8711")
    <T extends ActivityPartition> List<T> getSubPartition(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ActivityPartition->Incoming'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6c5ea20e-3b33-4f2e-95da-0ea36c9ac551")
    EList<MessageFlow> getIncoming();

    /**
     * Filtered Getter for relation 'ActivityPartition->Incoming'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("79a97626-b418-4c78-91cf-be43c2117445")
    <T extends MessageFlow> List<T> getIncoming(java.lang.Class<T> filterClass);

}
