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
package org.modelio.metamodel.bpmn.rootElements;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;

/**
 * BpmnBehavior v0.0.9054
 * 
 * 
 * Definitions BPMN metaclass.
 */
@objid ("007b2cd0-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnBehavior extends Behavior {
    @objid ("241147d5-c9be-4917-a562-fb6d0fdf5330")
    public static final String MNAME = "BpmnBehavior";

    /**
     * Getter for relation 'BpmnBehavior->RootElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("02624829-fe93-4702-ae86-f937a68171e7")
    EList<BpmnRootElement> getRootElement();

    /**
     * Filtered Getter for relation 'BpmnBehavior->RootElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f6051777-0538-4758-98da-b3dbdbd1d971")
    <T extends BpmnRootElement> List<T> getRootElement(java.lang.Class<T> filterClass);

}
