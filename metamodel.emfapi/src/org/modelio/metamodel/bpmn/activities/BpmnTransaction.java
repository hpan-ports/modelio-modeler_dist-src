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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.TransactionMethod;

@objid ("00855ebc-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnTransaction extends BpmnSubProcess {
    @objid ("ba223738-ffa9-4e64-a850-a0071768e8d8")
    String getProtocol();

    @objid ("57ad8197-d067-4841-8111-73dbf83b00c5")
    void setProtocol(String value);

    @objid ("2febe538-07ba-4a70-ad60-edbf1b2a2a2d")
    TransactionMethod getMethod();

    @objid ("d65ff6f6-d6ca-4bab-ab5a-201db593a334")
    void setMethod(TransactionMethod value);

}
