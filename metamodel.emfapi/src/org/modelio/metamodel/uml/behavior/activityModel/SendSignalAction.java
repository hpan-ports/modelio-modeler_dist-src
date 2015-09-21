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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;

/**
 * SendSignalAction v0.0.9054
 * 
 * 
 * SendSignalAction is an action that creates a signal instance from its inputs, and transmits it to the target object, where it may cause the firing of a state machine transition or the execution of an activity. The argument values are available to the execution of associated behaviors. The requestor continues execution immediately. 
 */
@objid ("003d3af6-c4bf-1fd8-97fe-001ec947cd2a")
public interface SendSignalAction extends ActivityAction {
    @objid ("d2659031-6594-4677-aaf7-f3eefdfc3383")
    public static final String MNAME = "SendSignalAction";

    /**
     * Getter for relation 'SendSignalAction->Sent'
     * 
     * Metamodel description:
     * <i>The type of signal transmitted.</i>
     */
    @objid ("20ffa4ce-73a9-4ca2-9dad-6ea50e6219e6")
    Signal getSent();

    /**
     * Setter for relation 'SendSignalAction->Sent'
     * 
     * Metamodel description:
     * <i>The type of signal transmitted.</i>
     */
    @objid ("f56f8143-887f-428f-8c45-b99ca6dd270f")
    void setSent(Signal value);

}
