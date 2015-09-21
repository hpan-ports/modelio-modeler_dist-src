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
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.behavior.activityModel.OutputPin;

/**
 * ActivityAction v0.0.9054
 * 
 * 
 * The execution of an action represents some transformation or processing in the modeled system, be it a computer system or otherwise.
 * 
 * An action may have sets of incoming and outgoing activity edges that specify control flow and data flow to and from other nodes. An action will not begin execution until all of its input conditions are satisfied. The completion of the execution of an action may enable the execution of a set of successor nodes and actions that take their inputs from the outputs of the action.
 * 
 * Action can have pre- and post-conditions (using constraints).
 */
@objid ("002688d8-c4bf-1fd8-97fe-001ec947cd2a")
public interface ActivityAction extends ActivityNode {
    @objid ("3dfc9c4b-814e-46ff-bae2-f5acbbfb2879")
    public static final String MNAME = "ActivityAction";

    /**
     * Getter for attribute 'ActivityAction.IsMultipleInstance'
     * 
     * Metamodel description:
     * <i>BPMN: Expresses if several action instances can be run in parallel.</i>
     */
    @objid ("8e1742e0-fe76-4c07-af48-1fb3746855f4")
    boolean isIsMultipleInstance();

    /**
     * Setter for attribute 'ActivityAction.IsMultipleInstance'
     * 
     * Metamodel description:
     * <i>BPMN: Expresses if several action instances can be run in parallel.</i>
     */
    @objid ("2d109f8e-b9cb-4866-b04e-1be46795c070")
    void setIsMultipleInstance(boolean value);

    /**
     * Getter for attribute 'ActivityAction.IsCompensation'
     * 
     * Metamodel description:
     * <i>BPMN : Some activities produce complex effects or specific outputs. If the outcome is determined to be undesirable by some specified criteria (such as an order being cancelled), then it will be necessary to "undo" the activities. Compensation activities are activities that "undo" the effect of other activities, in reaction to a compensation event.
     * The Compensation Activity is special in that it does not follow the normal Sequence Flow rules--as mentioned, it is outside the Normal Flow of the Process. This activity cannot have any incoming or outgoing Sequence Flows. The Compensation marker (as is in the Compensation Intermediate Event) will be displayed in the bottom center of the Activity to show this status of the activity.</i>
     */
    @objid ("d29a7df1-a94f-4cb2-b02e-d9a48919cc66")
    boolean isIsCompensation();

    /**
     * Setter for attribute 'ActivityAction.IsCompensation'
     * 
     * Metamodel description:
     * <i>BPMN : Some activities produce complex effects or specific outputs. If the outcome is determined to be undesirable by some specified criteria (such as an order being cancelled), then it will be necessary to "undo" the activities. Compensation activities are activities that "undo" the effect of other activities, in reaction to a compensation event.
     * The Compensation Activity is special in that it does not follow the normal Sequence Flow rules--as mentioned, it is outside the Normal Flow of the Process. This activity cannot have any incoming or outgoing Sequence Flows. The Compensation marker (as is in the Compensation Intermediate Event) will be displayed in the bottom center of the Activity to show this status of the activity.</i>
     */
    @objid ("80834036-584b-4298-bd5d-966debcfae08")
    void setIsCompensation(boolean value);

    /**
     * Getter for relation 'ActivityAction->Output'
     * 
     * Metamodel description:
     * <i>Output pins connected to the Action. The action places its results onto pins in this set.</i>
     */
    @objid ("8ea48c1e-3dc8-4423-9e89-5fe433c5a12d")
    EList<OutputPin> getOutput();

    /**
     * Filtered Getter for relation 'ActivityAction->Output'
     * 
     * Metamodel description:
     * <i>Output pins connected to the Action. The action places its results onto pins in this set.</i>
     */
    @objid ("896b93b0-ddc0-41f7-83a8-ac2761fd5fbc")
    <T extends OutputPin> List<T> getOutput(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ActivityAction->Input'
     * 
     * Metamodel description:
     * <i>Input pins connected to the Action. These are among the total set of inputs. </i>
     */
    @objid ("bd52a09d-7751-41ae-8123-12da62864786")
    EList<InputPin> getInput();

    /**
     * Filtered Getter for relation 'ActivityAction->Input'
     * 
     * Metamodel description:
     * <i>Input pins connected to the Action. These are among the total set of inputs. </i>
     */
    @objid ("869f6371-8291-4499-9cd7-21aada3e415b")
    <T extends InputPin> List<T> getInput(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ActivityAction->Handler'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4891deea-c034-4c18-8db3-cd489fb0df52")
    EList<ExceptionHandler> getHandler();

    /**
     * Filtered Getter for relation 'ActivityAction->Handler'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("29fd2bc4-2d59-489f-bbc8-55d09e98bfc1")
    <T extends ExceptionHandler> List<T> getHandler(java.lang.Class<T> filterClass);

}
