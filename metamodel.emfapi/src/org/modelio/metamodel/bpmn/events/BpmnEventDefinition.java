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
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnEvent;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

/**
 * BpmnEventDefinition v0.0.9054
 * 
 * 
 * Defines the type of contained triggers expected for an Event
 */
@objid ("008d3f9c-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnEventDefinition extends BpmnBaseElement {
    @objid ("bbcea51b-d86e-4c42-a23b-7cb5f32e446f")
    public static final String MNAME = "BpmnEventDefinition";

    /**
     * Getter for relation 'BpmnEventDefinition->Defined'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1f33fb20-0bd9-43e3-a847-fae0a2cc420b")
    BpmnEvent getDefined();

    /**
     * Setter for relation 'BpmnEventDefinition->Defined'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a1062463-8d9a-4630-b5c2-ad04d69b1187")
    void setDefined(BpmnEvent value);

    /**
     * Getter for relation 'BpmnEventDefinition->LoopRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bfa06b6e-f9db-46d1-8487-3edb1a69230c")
    EList<BpmnMultiInstanceLoopCharacteristics> getLoopRef();

    /**
     * Filtered Getter for relation 'BpmnEventDefinition->LoopRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6b58e610-57c7-464d-828e-907f07c8ac72")
    <T extends BpmnMultiInstanceLoopCharacteristics> List<T> getLoopRef(java.lang.Class<T> filterClass);

}
