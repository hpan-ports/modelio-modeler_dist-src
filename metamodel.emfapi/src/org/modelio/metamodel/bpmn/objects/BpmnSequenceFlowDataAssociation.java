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
package org.modelio.metamodel.bpmn.objects;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("00051888-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnSequenceFlowDataAssociation extends BpmnBaseElement {
    @objid ("707a06fb-db09-4916-abc5-5d8268e1ae40")
    BpmnSequenceFlow getConnected();

    @objid ("0de78a7b-b210-47bf-ab3c-6b2df23ecc5a")
    void setConnected(BpmnSequenceFlow value);

    @objid ("35291b08-a32e-4ab5-ace4-5f8463f9753f")
    EList<BpmnDataAssociation> getDataAssociation();

    @objid ("bf97d141-4820-4d84-b52f-ee64d51287dd")
    <T extends BpmnDataAssociation> List<T> getDataAssociation(java.lang.Class<T> filterClass);

}
