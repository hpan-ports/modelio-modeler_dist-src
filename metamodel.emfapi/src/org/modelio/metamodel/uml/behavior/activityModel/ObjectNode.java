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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNodeOrderingKind;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;

/**
 * ObjectNode v0.0.9054
 * 
 * 
 * An object node is an activity node that indicates an instance of a particular classifier, possibly in a particular state, may be available at a particular point in the activity. Object nodes can be used in a variety of ways, depending on where objects are flowing from and to, as described in the semantics section.
 * 
 * The ordering of an object node specifies the order in which tokens in the node are offered to the outgoing edges. This can be set to require that tokens do not overtake each other as they pass through the node (FIFO), or that they do (LIFO or modeler-defined ordering). Modeler-defined ordering is indicated by an ordering value of ordered, and a selection expression that determines what token to offer to the edges. 
 * 
 * Modelio extension:
 * An object node can represent an attribute, a parameter, an association role or an instance.
 */
@objid ("003940c2-c4bf-1fd8-97fe-001ec947cd2a")
public interface ObjectNode extends ActivityNode {
    @objid ("307aad6e-8e2c-4708-9cef-6d0c7cde9111")
    public static final String MNAME = "ObjectNode";

    /**
     * Getter for attribute 'ObjectNode.IsControlType'
     * 
     * Metamodel description:
     * <i>Indicates whether the type of the object node is to be treated as control.</i>
     */
    @objid ("32ec0391-8a46-48ad-93c1-63be4969a50b")
    boolean isIsControlType();

    /**
     * Setter for attribute 'ObjectNode.IsControlType'
     * 
     * Metamodel description:
     * <i>Indicates whether the type of the object node is to be treated as control.</i>
     */
    @objid ("7b9227ee-42e1-497a-9fe8-a52f2e7c9e37")
    void setIsControlType(boolean value);

    /**
     * Getter for attribute 'ObjectNode.Ordering'
     * 
     * Metamodel description:
     * <i>Indicates if and how the tokens in the object node are ordered for selection to traverse edges outgoing from the object node.</i>
     */
    @objid ("2ce4ef37-71f7-4131-93c4-cf0079584c06")
    ObjectNodeOrderingKind getOrdering();

    /**
     * Setter for attribute 'ObjectNode.Ordering'
     * 
     * Metamodel description:
     * <i>Indicates if and how the tokens in the object node are ordered for selection to traverse edges outgoing from the object node.</i>
     */
    @objid ("217766f7-8eb9-415d-9e31-5ee916939d2d")
    void setOrdering(ObjectNodeOrderingKind value);

    /**
     * Getter for attribute 'ObjectNode.SelectionBehavior'
     * 
     * Metamodel description:
     * <i>Selects tokens for outgoing edges.</i>
     */
    @objid ("ee3a90a6-f74b-4c50-950d-5be131f79b33")
    String getSelectionBehavior();

    /**
     * Setter for attribute 'ObjectNode.SelectionBehavior'
     * 
     * Metamodel description:
     * <i>Selects tokens for outgoing edges.</i>
     */
    @objid ("126355ac-88c8-4feb-8385-d4de08e7c9a1")
    void setSelectionBehavior(String value);

    /**
     * Getter for attribute 'ObjectNode.UpperBound'
     * 
     * Metamodel description:
     * <i>The maximum number of tokens allowed in the node. Objects cannot flow into the node if the upper bound is reached.</i>
     */
    @objid ("9a5172a1-928b-4f2c-907b-0f773cd03c18")
    String getUpperBound();

    /**
     * Setter for attribute 'ObjectNode.UpperBound'
     * 
     * Metamodel description:
     * <i>The maximum number of tokens allowed in the node. Objects cannot flow into the node if the upper bound is reached.</i>
     */
    @objid ("886aa03f-da7a-4417-a4dc-ba4aa9575d24")
    void setUpperBound(String value);

    /**
     * Getter for relation 'ObjectNode->Represented'
     * 
     * Metamodel description:
     * <i>Instance that is represented by the ObjectNode.</i>
     */
    @objid ("b5a20a46-039b-497b-83c6-f64074235e8e")
    Instance getRepresented();

    /**
     * Setter for relation 'ObjectNode->Represented'
     * 
     * Metamodel description:
     * <i>Instance that is represented by the ObjectNode.</i>
     */
    @objid ("7f1674c8-9988-4949-a141-a19483d38f64")
    void setRepresented(Instance value);

    /**
     * Getter for relation 'ObjectNode->RepresentedRealParameter'
     * 
     * Metamodel description:
     * <i>The represented parameter. For a Pin on a CallOperationAction or a CallBehaviorAction, links to the matched parameter of the called operation or behavior.</i>
     */
    @objid ("83438d40-70ee-49c2-bfd8-b603ed8c0b5d")
    BehaviorParameter getRepresentedRealParameter();

    /**
     * Setter for relation 'ObjectNode->RepresentedRealParameter'
     * 
     * Metamodel description:
     * <i>The represented parameter. For a Pin on a CallOperationAction or a CallBehaviorAction, links to the matched parameter of the called operation or behavior.</i>
     */
    @objid ("a7bfc26c-db04-469c-87de-d9d07525394f")
    void setRepresentedRealParameter(BehaviorParameter value);

    /**
     * Getter for relation 'ObjectNode->Type'
     * 
     * Metamodel description:
     * <i>Type of the object node.</i>
     */
    @objid ("e26f1143-f83b-4242-83ca-1c19072c1fee")
    GeneralClass getType();

    /**
     * Setter for relation 'ObjectNode->Type'
     * 
     * Metamodel description:
     * <i>Type of the object node.</i>
     */
    @objid ("74bfed15-6bbf-4621-b240-c28ba3a9d75e")
    void setType(GeneralClass value);

    /**
     * Getter for relation 'ObjectNode->RepresentedRole'
     * 
     * Metamodel description:
     * <i>Shortcut to directly represent an association end by the node. This replaces the normal way: representing an instance bound to the associationEnd.</i>
     */
    @objid ("a13cf57d-6e2e-4bae-82ba-3ef2b5336ed8")
    AssociationEnd getRepresentedRole();

    /**
     * Setter for relation 'ObjectNode->RepresentedRole'
     * 
     * Metamodel description:
     * <i>Shortcut to directly represent an association end by the node. This replaces the normal way: representing an instance bound to the associationEnd.</i>
     */
    @objid ("a8a4617a-e70f-49ab-90a3-567408f3ef60")
    void setRepresentedRole(AssociationEnd value);

    /**
     * Getter for relation 'ObjectNode->RepresentedAttribute'
     * 
     * Metamodel description:
     * <i>Represented attribute. Shortcut to directly represent an attribute, instead of representing an instance bound to the attribute.</i>
     */
    @objid ("b92312f8-8b58-40cb-aa8c-5222b14f58ea")
    Attribute getRepresentedAttribute();

    /**
     * Setter for relation 'ObjectNode->RepresentedAttribute'
     * 
     * Metamodel description:
     * <i>Represented attribute. Shortcut to directly represent an attribute, instead of representing an instance bound to the attribute.</i>
     */
    @objid ("9d0f657c-5d47-4e80-ab27-e84ae36a4180")
    void setRepresentedAttribute(Attribute value);

    /**
     * Getter for relation 'ObjectNode->InState'
     * 
     * Metamodel description:
     * <i>The required state of the object available at this point in the activity. This state must belong to the type of the objectNode, or of the represented element. </i>
     */
    @objid ("96991095-6c0a-4d69-bc7e-ad88588139a7")
    State getInState();

    /**
     * Setter for relation 'ObjectNode->InState'
     * 
     * Metamodel description:
     * <i>The required state of the object available at this point in the activity. This state must belong to the type of the objectNode, or of the represented element. </i>
     */
    @objid ("7e460bc8-f0cb-481b-8f68-d69fc473f923")
    void setInState(State value);

}
