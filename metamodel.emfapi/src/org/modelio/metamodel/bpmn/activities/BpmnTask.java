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
package org.modelio.metamodel.bpmn.activities;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;

@objid ("0084bb4c-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnTask extends BpmnActivity {
    @objid ("bf938f05-c248-4427-97c1-11b8caba9f9d")
    boolean isIsGlobal();

    @objid ("703c3acc-6051-4f7d-b880-67de17047623")
    void setIsGlobal(boolean value);

    @objid ("f55ed732-2828-4563-b163-52eccb469f6a")
    EList<BpmnCallActivity> getCaller();

    @objid ("7ae1fa04-41ea-4dfc-8d7f-f60a0d5c8cf1")
    <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass);

}
