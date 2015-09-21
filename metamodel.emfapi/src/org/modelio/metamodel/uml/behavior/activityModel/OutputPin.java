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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;

/**
 * OutputPin v0.0.9054
 * 
 * 
 * An output pin is a pin that holds output values produced by an action.
 * 
 * An action cannot terminate itself if an output pin has fewer values than the lower multiplicity. An action may not put more values in an output pin in a single execution than the upper multiplicity of the pin.
 */
@objid ("003aad54-c4bf-1fd8-97fe-001ec947cd2a")
public interface OutputPin extends Pin {
    @objid ("feeadc1f-e0b7-41cf-8dbf-a8c7d1250573")
    public static final String MNAME = "OutputPin";

    /**
     * Getter for relation 'OutputPin->Outputing'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e1deab53-b838-42b2-b840-2f20ec468165")
    ActivityAction getOutputing();

    /**
     * Setter for relation 'OutputPin->Outputing'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7574b9df-70e7-4683-a988-7c699da2211c")
    void setOutputing(ActivityAction value);

}
