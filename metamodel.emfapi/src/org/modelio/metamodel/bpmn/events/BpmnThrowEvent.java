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
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;

/**
 * BpmnThrowEvent v0.0.9054
 * 
 * 
 * Events that throw a Result. All End Events and some Intermediate Events are throwing Events that may
 * eventually be caught by another Event.
 */
@objid ("00956d84-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnThrowEvent extends BpmnEvent {
    @objid ("cb46eec7-d365-43ac-80a1-59fed5042f53")
    public static final String MNAME = "BpmnThrowEvent";

    /**
     * Getter for relation 'BpmnThrowEvent->DataInputAssociation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f646764d-f858-4922-9acc-2829c4af8d19")
    EList<BpmnDataAssociation> getDataInputAssociation();

    /**
     * Filtered Getter for relation 'BpmnThrowEvent->DataInputAssociation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b3f0da8f-4f8f-4e36-bbfc-2fad2734b4bf")
    <T extends BpmnDataAssociation> List<T> getDataInputAssociation(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnThrowEvent->DataInput'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("618e4b9f-1fe2-4968-be2b-11cd6ea32f0b")
    BpmnDataInput getDataInput();

    /**
     * Setter for relation 'BpmnThrowEvent->DataInput'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("df19f003-ee6e-40e0-b798-081c7d7d74d8")
    void setDataInput(BpmnDataInput value);

}
