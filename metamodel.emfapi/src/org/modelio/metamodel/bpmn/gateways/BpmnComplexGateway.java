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
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;

@objid ("00973ae2-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnComplexGateway extends BpmnGateway {
    @objid ("18f79ed2-d9bf-4082-9f97-8422dadb12e3")
    String getActivationExpression();

    @objid ("1e081171-2ec9-4b28-8d1b-b01ccc0c8628")
    void setActivationExpression(String value);

    @objid ("23056305-f0fa-44fe-8a9f-228496e83c53")
    BpmnSequenceFlow getDefaultFlow();

    @objid ("c49b3aaa-d676-479b-b521-a3265272c6c8")
    void setDefaultFlow(BpmnSequenceFlow value);

}
