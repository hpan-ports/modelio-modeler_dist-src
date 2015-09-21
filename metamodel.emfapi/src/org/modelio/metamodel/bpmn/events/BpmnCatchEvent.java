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
package org.modelio.metamodel.bpmn.events;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;

/**
 * BpmnCatchEvent v0.0.9054
 * 
 * 
 * Events catching some sort of signal or condition (message, condition, timer, etc.).
 * Initial events are always catch events. Intermediate events may catch events.
 */
@objid ("00889ec4-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnCatchEvent extends BpmnEvent {
    @objid ("4fd3baf7-0529-4c55-a49b-a369b8552c06")
    public static final String MNAME = "BpmnCatchEvent";

    /**
     * Getter for attribute 'BpmnCatchEvent.ParallelMultiple'
     * 
     * Metamodel description:
     * <i>This means that there are multiple triggers required before the events triggers outcoming sequence flows. All of the types of triggers that are listed in the catcht Event MUST be triggered before the processing continues.  </i>
     */
    @objid ("f766d48c-09c3-4b6b-9ec0-9b41578658c0")
    boolean isParallelMultiple();

    /**
     * Setter for attribute 'BpmnCatchEvent.ParallelMultiple'
     * 
     * Metamodel description:
     * <i>This means that there are multiple triggers required before the events triggers outcoming sequence flows. All of the types of triggers that are listed in the catcht Event MUST be triggered before the processing continues.  </i>
     */
    @objid ("1fbebb06-39a4-4901-b12c-5a341b53e83c")
    void setParallelMultiple(boolean value);

    /**
     * Getter for relation 'BpmnCatchEvent->DataOutputAssociation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a1ee1736-0577-4c27-a350-519d0de5652c")
    EList<BpmnDataAssociation> getDataOutputAssociation();

    /**
     * Filtered Getter for relation 'BpmnCatchEvent->DataOutputAssociation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1f9adc5f-1005-41ec-b701-5a95a3c6cebc")
    <T extends BpmnDataAssociation> List<T> getDataOutputAssociation(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnCatchEvent->DataOutput'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("34120552-1fc0-4eb3-83eb-77232ac8eb58")
    BpmnDataOutput getDataOutput();

    /**
     * Setter for relation 'BpmnCatchEvent->DataOutput'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("54dd3253-8b53-4775-a2f5-dbef7236c558")
    void setDataOutput(BpmnDataOutput value);

}
