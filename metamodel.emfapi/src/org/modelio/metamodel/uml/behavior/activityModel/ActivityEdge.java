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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.InterruptibleActivityRegion;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * ActivityEdge v0.0.9054
 * 
 * 
 * ActivityEdge is an abstract class for the connections along which tokens flow between activity nodes. It covers control and data flow edges. 
 * 
 * Activity edges can control token flow.
 */
@objid ("00270a1a-c4bf-1fd8-97fe-001ec947cd2a")
public interface ActivityEdge extends ModelElement {
    @objid ("e8a230bc-c65e-4219-8c0f-15e1e3f2c651")
    public static final String MNAME = "ActivityEdge";

    /**
     * Getter for attribute 'ActivityEdge.Guard'
     * 
     * Metamodel description:
     * <i>Specification evaluated at runtime to determine if the edge can be traversed. </i>
     */
    @objid ("09b37351-ecfc-49cd-9165-008a420dda02")
    String getGuard();

    /**
     * Setter for attribute 'ActivityEdge.Guard'
     * 
     * Metamodel description:
     * <i>Specification evaluated at runtime to determine if the edge can be traversed. </i>
     */
    @objid ("4e1c2b7b-243e-4e44-a858-34d4387a1b07")
    void setGuard(String value);

    /**
     * Getter for attribute 'ActivityEdge.Weight'
     * 
     * Metamodel description:
     * <i>Number of tokens consumed from the source node on each traversal.</i>
     */
    @objid ("e80232f2-edab-402e-a369-eccb004c6493")
    String getWeight();

    /**
     * Setter for attribute 'ActivityEdge.Weight'
     * 
     * Metamodel description:
     * <i>Number of tokens consumed from the source node on each traversal.</i>
     */
    @objid ("dcf95231-6d83-4135-b136-1e4fd794f93a")
    void setWeight(String value);

    /**
     * Getter for relation 'ActivityEdge->Target'
     * 
     * Metamodel description:
     * <i>Node to which tokens are put when they traverse the edge.</i>
     */
    @objid ("bdb9f44d-d841-4839-b6ae-d5e5d27fcccc")
    ActivityNode getTarget();

    /**
     * Setter for relation 'ActivityEdge->Target'
     * 
     * Metamodel description:
     * <i>Node to which tokens are put when they traverse the edge.</i>
     */
    @objid ("f1010c0a-2f85-4f45-b322-b92bc4137b5f")
    void setTarget(ActivityNode value);

    /**
     * Getter for relation 'ActivityEdge->Source'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("98c3ac0e-e5e3-44d9-a323-bfcdaf38495a")
    ActivityNode getSource();

    /**
     * Setter for relation 'ActivityEdge->Source'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5d950e14-13d2-4e6d-96b3-3e3e60487c8f")
    void setSource(ActivityNode value);

    /**
     * Getter for relation 'ActivityEdge->Interrupts'
     * 
     * Metamodel description:
     * <i>Region that the edge can interrupt.</i>
     */
    @objid ("a4fce7aa-3510-4c57-82f5-7365f0f51347")
    InterruptibleActivityRegion getInterrupts();

    /**
     * Setter for relation 'ActivityEdge->Interrupts'
     * 
     * Metamodel description:
     * <i>Region that the edge can interrupt.</i>
     */
    @objid ("6ab407dc-eb61-4a4a-a659-d6b027087102")
    void setInterrupts(InterruptibleActivityRegion value);

    /**
     * Getter for relation 'ActivityEdge->RealizedInformationFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("96ea9c89-5d60-40b5-9000-dd0ddbd29ef9")
    EList<InformationFlow> getRealizedInformationFlow();

    /**
     * Filtered Getter for relation 'ActivityEdge->RealizedInformationFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("383f6417-0db6-47bc-916c-1aa506014fbb")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

}
