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
package org.modelio.metamodel.bpmn.objects;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

/**
 * BpmnSequenceFlowDataAssociation v0.0.9054
 * 
 * 
 * Data Objects may be directly associated with a Sequence Flow connector to represent  two data associations. This is a visual short cut that normalizes two Data Associations: one from a item-aware element (e.g., an Activity) contained by the source of the Sequence Flow, connecting to the Data Object; and the other from the Data Object connecting to a item-aware element contained by the target of the Sequence Flow.
 * 
 * This is an extension of Modelio to the BPMN standard metamodel.
 * 
 * Note: Voir ownership Ceci pourriat �tre process/Subprocess
 */
@objid ("00051888-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnSequenceFlowDataAssociation extends BpmnBaseElement {
    @objid ("c8acfc24-c294-4501-8826-4c605517f59a")
    public static final String MNAME = "BpmnSequenceFlowDataAssociation";

    /**
     * Getter for relation 'BpmnSequenceFlowDataAssociation->Connected'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6aab1224-f763-4119-8025-844d070d712d")
    BpmnSequenceFlow getConnected();

    /**
     * Setter for relation 'BpmnSequenceFlowDataAssociation->Connected'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("43951d37-fcdf-44b8-ad9b-478d8e126022")
    void setConnected(BpmnSequenceFlow value);

    /**
     * Getter for relation 'BpmnSequenceFlowDataAssociation->DataAssociation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fead113b-ab51-4ab9-9c0a-a1b17465df96")
    EList<BpmnDataAssociation> getDataAssociation();

    /**
     * Filtered Getter for relation 'BpmnSequenceFlowDataAssociation->DataAssociation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("aac2287d-2001-4998-b38a-78982b14e0cb")
    <T extends BpmnDataAssociation> List<T> getDataAssociation(java.lang.Class<T> filterClass);

}
