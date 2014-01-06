/*
 * Copyright 2013 Modeliosoft
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
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.bpmn.events;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;

@objid ("00875c94-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnBoundaryEvent extends BpmnCatchEvent {
    @objid ("e0511638-b72c-4cce-a42f-22eb604d2dfc")
    boolean isCancelActivity();

    @objid ("7a572c48-401f-4f5f-b4dd-3ca9f6f5e3da")
    void setCancelActivity(boolean value);

    @objid ("83f3bdfe-c7f0-4705-b59e-7bf9fef2a917")
    BpmnActivity getAttachedToRef();

    @objid ("e3e32240-6550-49a7-babf-a017c2437c34")
    void setAttachedToRef(BpmnActivity value);

}
