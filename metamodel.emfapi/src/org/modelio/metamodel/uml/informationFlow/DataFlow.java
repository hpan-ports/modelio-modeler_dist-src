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
package org.modelio.metamodel.uml.informationFlow;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;

/**
 * DataFlow v0.0.9054
 * 
 * 
 * DataFlows are the representation of all types of information that can be transmitted between elements. For example, DataFlows can be objects or requests. 
 * 
 * A DataFlow between elements expresses that the kind of information that it represents (defined through its ModelSignal) can circulate between the connected elements. This can provide high level (system level) information exchange diagrams.
 */
@objid ("00645dc0-c4bf-1fd8-97fe-001ec947cd2a")
public interface DataFlow extends ModelElement {
    @objid ("2b1ceaf4-f7b8-4588-8c18-e0b0406e37b1")
    public static final String MNAME = "DataFlow";

    /**
     * Getter for relation 'DataFlow->Destination'
     * 
     * Metamodel description:
     * <i>Designates the NameSpaces (Packages, Classes, and so on) that are targeted by the DataFlow.</i>
     */
    @objid ("6d6c992c-9a89-41e1-9aa8-2da307f26c6e")
    NameSpace getDestination();

    /**
     * Setter for relation 'DataFlow->Destination'
     * 
     * Metamodel description:
     * <i>Designates the NameSpaces (Packages, Classes, and so on) that are targeted by the DataFlow.</i>
     */
    @objid ("e612b342-1ea8-4e33-b7fb-32b4b2dfcef2")
    void setDestination(NameSpace value);

    /**
     * Getter for relation 'DataFlow->Origin'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("585bfac9-d633-48ee-ad14-e9cd4412a976")
    NameSpace getOrigin();

    /**
     * Setter for relation 'DataFlow->Origin'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("33a45ce8-eb53-42e7-b971-fb3478266855")
    void setOrigin(NameSpace value);

    /**
     * Getter for relation 'DataFlow->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0d65a149-ac6a-4d85-bd87-95fb18e894dc")
    NameSpace getOwner();

    /**
     * Setter for relation 'DataFlow->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("afcee630-7e31-48e4-99b6-febbda5527ba")
    void setOwner(NameSpace value);

    /**
     * Getter for relation 'DataFlow->SModel'
     * 
     * Metamodel description:
     * <i>Defines the DataFlow as being an instance of the associated Signal.</i>
     */
    @objid ("a2c2eff9-52c1-41c0-8b70-e0af59f5d1b1")
    Signal getSModel();

    /**
     * Setter for relation 'DataFlow->SModel'
     * 
     * Metamodel description:
     * <i>Defines the DataFlow as being an instance of the associated Signal.</i>
     */
    @objid ("6bfa440e-4438-4287-b1a1-4bf1a4b88be3")
    void setSModel(Signal value);

}
