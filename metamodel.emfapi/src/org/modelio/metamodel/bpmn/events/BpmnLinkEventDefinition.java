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

/**
 * BpmnLinkEventDefinition v0.0.9054
 * 
 * 
 * A Link Event is a mechanism for connecting two sections of a Process. Link Events can be used to create looping situations or to avoid long Sequence Flow lines. The use of Link Events is limited to a single Process level (i.e., they cannot link a parent Process with a Sub-Process).
 * Paired Link Events can also be used as ?Off-Page Connectors? for printing a Process across multiple pages. They can also be used as generic ?Go To? objects within the Process level. There can be multiple source Link Events, but there can only be one target Link Event. When used to ?catch? from the source Link, the Event marker will be unfilled. When used to ?throw? to the target Link, the Event marker will be filled.
 */
@objid ("0090129e-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnLinkEventDefinition extends BpmnEventDefinition {
    @objid ("3a2e2f0a-e37e-42ba-be32-7772b3a9055d")
    public static final String MNAME = "BpmnLinkEventDefinition";

    /**
     * Getter for relation 'BpmnLinkEventDefinition->Source'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7fc34b52-1cbf-4fb1-b5ac-20e8e82a5701")
    EList<BpmnLinkEventDefinition> getSource();

    /**
     * Filtered Getter for relation 'BpmnLinkEventDefinition->Source'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0d2eaff8-33b7-4c71-b617-0604a756ad9a")
    <T extends BpmnLinkEventDefinition> List<T> getSource(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnLinkEventDefinition->Target'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d7957a1f-a112-4d74-bbf1-8080062da358")
    BpmnLinkEventDefinition getTarget();

    /**
     * Setter for relation 'BpmnLinkEventDefinition->Target'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a970e5d7-d858-4e1d-92be-9f95312bb17e")
    void setTarget(BpmnLinkEventDefinition value);

}
