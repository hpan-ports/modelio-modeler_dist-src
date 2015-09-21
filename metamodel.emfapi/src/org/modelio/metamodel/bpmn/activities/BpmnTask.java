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
package org.modelio.metamodel.bpmn.activities;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;

/**
 * BpmnTask v0.0.9054
 * 
 * 
 * A Task is an atomic Activity within a Process flow. A Task is used when the work in the Process cannot be broken down to a finer level of detail. Generally, an end-user and/or applications are used to perform the Task when it is executed.
 */
@objid ("0084bb4c-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnTask extends BpmnActivity {
    @objid ("5a1f996b-11e2-4389-8b3e-4763ade12bfd")
    public static final String MNAME = "BpmnTask";

    /**
     * Getter for attribute 'BpmnTask.IsGlobal'
     * 
     * Metamodel description:
     * <i>A Global Task is a reusable, atomic Task definition that can be called from within any Process by a Call Activity.</i>
     */
    @objid ("8e3ed2fc-6d13-45db-a8ff-54a5d934ca0f")
    boolean isIsGlobal();

    /**
     * Setter for attribute 'BpmnTask.IsGlobal'
     * 
     * Metamodel description:
     * <i>A Global Task is a reusable, atomic Task definition that can be called from within any Process by a Call Activity.</i>
     */
    @objid ("9d0cbdac-eaa4-4b46-9298-5b123c8c0bfa")
    void setIsGlobal(boolean value);

    /**
     * Getter for relation 'BpmnTask->Caller'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("08af34e9-1cb7-454e-a95f-191daa3c8803")
    EList<BpmnCallActivity> getCaller();

    /**
     * Filtered Getter for relation 'BpmnTask->Caller'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ed33cfa0-5752-4a77-a395-5a1d356051cb")
    <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass);

}
