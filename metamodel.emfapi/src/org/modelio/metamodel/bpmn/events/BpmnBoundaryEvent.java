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
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.bpmn.events;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;

@objid ("00875c94-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnBoundaryEvent extends BpmnCatchEvent {
    @objid ("21d5deab-eee8-477d-af9c-65e74e184171")
    boolean isCancelActivity();

    @objid ("00b48c78-884c-49ad-a3ba-9b87fec33a3a")
    void setCancelActivity(boolean value);

    @objid ("91f6b6ef-ec53-4c94-aa5d-b7eca75f3452")
    BpmnActivity getAttachedToRef();

    @objid ("6ec3fe5a-c8bb-4390-b68a-af32df717ae4")
    void setAttachedToRef(BpmnActivity value);

}
