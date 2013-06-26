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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
package org.modelio.metamodel.bpmn.gateways;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGatewayType;

@objid ("0097e370-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnEventBasedGateway extends BpmnGateway {
    @objid ("3e5569f9-adde-49aa-81b0-5e0fba659d22")
    boolean isInstanciate();

    @objid ("2362d677-3bbd-4cb0-9c14-5a6241b86d58")
    void setInstanciate(boolean value);

    @objid ("be61e616-ec35-4f72-9e43-4c4b09cb09e7")
    BpmnEventBasedGatewayType getEventGatewayType();

    @objid ("2ec66aa5-4bf9-4f73-b794-5104826843f7")
    void setEventGatewayType(BpmnEventBasedGatewayType value);

}
