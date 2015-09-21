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
package org.modelio.metamodel.uml.behavior.communicationModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;

/**
 * CommunicationInteraction v0.0.9054
 */
@objid ("005a13d8-c4bf-1fd8-97fe-001ec947cd2a")
public interface CommunicationInteraction extends Behavior {
    @objid ("9bf5c6c7-f0d2-487e-b19c-f1740cf132a2")
    public static final String MNAME = "CommunicationInteraction";

    /**
     * Getter for relation 'CommunicationInteraction->Owned'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("d52aca26-15b0-4f04-a14c-8769bdec080a")
    EList<CommunicationNode> getOwned();

    /**
     * Filtered Getter for relation 'CommunicationInteraction->Owned'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("4089773f-fe62-4745-a3ce-5ef86224cb0b")
    <T extends CommunicationNode> List<T> getOwned(java.lang.Class<T> filterClass);

}
