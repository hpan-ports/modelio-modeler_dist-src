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
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlowEffectKind;

/**
 * ObjectFlow v0.0.9054
 * 
 * 
 * An object flow is an activity edge that only passes object and data tokens. 
 * Tokens offered by the source node are all offered to the target node.
 * 
 * If transformation behavior is specified, then each token offered to the edge is passed to the behavior, and the output of the behavior is given to the target node for consideration instead of the token that was input to the transformation expression.
 * 
 * If a selection expression is specified, then it is used to offer a token from the source object node to the edge, rather than using object node�??s ordering. It has the same semantics as selection expression on object nodes. 
 * 
 * Modelio specific : 
 * In order to make the selection and transformation sections easier to fill, these are string expressions in Modelio, instead of Behaviors in the OMG UML specification.
 */
@objid ("00388c90-c4bf-1fd8-97fe-001ec947cd2a")
public interface ObjectFlow extends ActivityEdge {
    @objid ("92576a52-9795-4e89-89aa-98349d668940")
    public static final String MNAME = "ObjectFlow";

    /**
     * Getter for attribute 'ObjectFlow.TransformationBehavior'
     * 
     * Metamodel description:
     * <i>Expression that changes or replaces data tokens flowing along edge.</i>
     */
    @objid ("2be60608-acc3-493f-a71f-16bb60681f68")
    String getTransformationBehavior();

    /**
     * Setter for attribute 'ObjectFlow.TransformationBehavior'
     * 
     * Metamodel description:
     * <i>Expression that changes or replaces data tokens flowing along edge.</i>
     */
    @objid ("ba389bd4-f482-481d-9ba1-42cbd5ba4e72")
    void setTransformationBehavior(String value);

    /**
     * Getter for attribute 'ObjectFlow.SelectionBehavior'
     * 
     * Metamodel description:
     * <i>Selects tokens from a source object node.</i>
     */
    @objid ("8a194452-f4cb-4126-88d1-4328621d4f0e")
    String getSelectionBehavior();

    /**
     * Setter for attribute 'ObjectFlow.SelectionBehavior'
     * 
     * Metamodel description:
     * <i>Selects tokens from a source object node.</i>
     */
    @objid ("58f7ff4d-4e57-4620-8b89-d5f6e924664f")
    void setSelectionBehavior(String value);

    /**
     * Getter for attribute 'ObjectFlow.IsMultiCast'
     * 
     * Metamodel description:
     * <i>Indicates whether the objects in the flow are passed by multicasting.</i>
     */
    @objid ("d8387114-9ed6-4736-a87a-e7e9e7b33e61")
    boolean isIsMultiCast();

    /**
     * Setter for attribute 'ObjectFlow.IsMultiCast'
     * 
     * Metamodel description:
     * <i>Indicates whether the objects in the flow are passed by multicasting.</i>
     */
    @objid ("8a88fde7-ee34-4f44-ade2-2fbb3b33250e")
    void setIsMultiCast(boolean value);

    /**
     * Getter for attribute 'ObjectFlow.IsMultiReceive'
     * 
     * Metamodel description:
     * <i>Indicates whether the objects in the flow are gathered from respondents to multicasting.</i>
     */
    @objid ("51dff441-0ebd-402a-9a6e-18cb715683c4")
    boolean isIsMultiReceive();

    /**
     * Setter for attribute 'ObjectFlow.IsMultiReceive'
     * 
     * Metamodel description:
     * <i>Indicates whether the objects in the flow are gathered from respondents to multicasting.</i>
     */
    @objid ("95f4e9d6-0b2a-4c35-a14f-9b46df6e982c")
    void setIsMultiReceive(boolean value);

    /**
     * Getter for attribute 'ObjectFlow.Effect'
     * 
     * Metamodel description:
     * <i>Specifies the effect that the owner of the object flow has on values that it represents.</i>
     */
    @objid ("a58b6fe7-92e7-46fe-89ad-73059344ec96")
    ObjectFlowEffectKind getEffect();

    /**
     * Setter for attribute 'ObjectFlow.Effect'
     * 
     * Metamodel description:
     * <i>Specifies the effect that the owner of the object flow has on values that it represents.</i>
     */
    @objid ("8ac434f2-d353-4012-b68c-b4a7d2cf7e2f")
    void setEffect(ObjectFlowEffectKind value);

}
