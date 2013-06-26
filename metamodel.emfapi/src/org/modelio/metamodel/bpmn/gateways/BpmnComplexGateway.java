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
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;

@objid ("00973ae2-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnComplexGateway extends BpmnGateway {
    @objid ("04971c10-3e1a-4e28-8996-7368e7ff0d97")
    String getActivationExpression();

    @objid ("f54cdf13-7d72-4e61-862a-a81311dd14fe")
    void setActivationExpression(String value);

    @objid ("624ea40b-9ed0-4fbf-b1f5-c3105962ae2d")
    BpmnSequenceFlow getDefaultFlow();

    @objid ("9c95a688-4d8a-4434-bda4-f57cf0a6c159")
    void setDefaultFlow(BpmnSequenceFlow value);

}
