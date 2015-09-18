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
package org.modelio.metamodel.bpmn.gateways;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGatewayType;

@objid ("0097e370-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnEventBasedGateway extends BpmnGateway {
    @objid ("92c67550-3d2e-4799-b3b1-ce1c28d48b6e")
    boolean isInstanciate();

    @objid ("50f6a652-39cf-4272-b254-2e95f4b85fb4")
    void setInstanciate(boolean value);

    @objid ("63b68b87-e8db-4702-9137-2bd1162167fd")
    BpmnEventBasedGatewayType getEventGatewayType();

    @objid ("ec482da3-0a32-43a4-b6b0-356480de64c1")
    void setEventGatewayType(BpmnEventBasedGatewayType value);

}
