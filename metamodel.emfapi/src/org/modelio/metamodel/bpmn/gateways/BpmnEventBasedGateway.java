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
package org.modelio.metamodel.bpmn.gateways;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGatewayType;

@objid ("0097e370-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnEventBasedGateway extends BpmnGateway {
    @objid ("505eaa99-30c9-4812-a43b-5dc31f5baa1a")
    boolean isInstanciate();

    @objid ("b6f8990e-0fee-4ee8-b452-739f79d75ac0")
    void setInstanciate(boolean value);

    @objid ("ae3609ff-6603-4e9e-b314-45d0984a3d2c")
    BpmnEventBasedGatewayType getEventGatewayType();

    @objid ("79f6dcb1-1fbe-4495-984e-4969197af538")
    void setEventGatewayType(BpmnEventBasedGatewayType value);

}
