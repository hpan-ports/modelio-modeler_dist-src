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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;

/**
 * InputPin v0.0.9054
 * 
 * 
 * An input pin is a pin that holds input values to be consumed by an action.
 * 
 * An action cannot start execution if an input pin has fewer values than the lower multiplicity. The upper multiplicity determines how many values are consumed by a single execution of the action.
 */
@objid ("003503ea-c4bf-1fd8-97fe-001ec947cd2a")
public interface InputPin extends Pin {
    @objid ("171fb513-75bc-4c92-ae2d-b75fa5ee10a9")
    public static final String MNAME = "InputPin";

    /**
     * Getter for attribute 'InputPin.IsSelf'
     * 
     * Metamodel description:
     * <i>Modelio extension: expresses that the pin represents the target object on which the action is executed.</i>
     */
    @objid ("ebbdbf76-41a5-4b2a-88bd-b1f43e0d85a6")
    boolean isIsSelf();

    /**
     * Setter for attribute 'InputPin.IsSelf'
     * 
     * Metamodel description:
     * <i>Modelio extension: expresses that the pin represents the target object on which the action is executed.</i>
     */
    @objid ("2f9508c7-0ead-490f-8385-9e4749ee45a5")
    void setIsSelf(boolean value);

    /**
     * Getter for relation 'InputPin->Handler'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("374eb643-a13d-46dc-b59f-c814b5ca1e7e")
    EList<ExceptionHandler> getHandler();

    /**
     * Filtered Getter for relation 'InputPin->Handler'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9ed127e1-3f9a-4433-bfc6-587428580ae3")
    <T extends ExceptionHandler> List<T> getHandler(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'InputPin->Inputing'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8204f326-63b7-4ffe-91fa-c73d04a64204")
    ActivityAction getInputing();

    /**
     * Setter for relation 'InputPin->Inputing'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d591c303-5a06-47c2-87ea-0503b7b2c873")
    void setInputing(ActivityAction value);

}
