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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;

/**
 * AcceptSignalAction v0.0.9054
 * 
 * 
 * AcceptSignalAction is an accept event action representing the receipt of an asynchronous signal.
 */
@objid ("00250f30-c4bf-1fd8-97fe-001ec947cd2a")
public interface AcceptSignalAction extends ActivityAction {
    @objid ("cfa61e76-b1aa-4259-a971-def0a2225130")
    public static final String MNAME = "AcceptSignalAction";

    /**
     * Getter for relation 'AcceptSignalAction->Accepted'
     * 
     * Metamodel description:
     * <i>The type of signal accepted.</i>
     */
    @objid ("e11a0145-34dd-4d5c-9f3f-ccc7777603fe")
    EList<Signal> getAccepted();

    /**
     * Filtered Getter for relation 'AcceptSignalAction->Accepted'
     * 
     * Metamodel description:
     * <i>The type of signal accepted.</i>
     */
    @objid ("fb079119-3866-4334-813c-fcf3646f354c")
    <T extends Signal> List<T> getAccepted(java.lang.Class<T> filterClass);

}
