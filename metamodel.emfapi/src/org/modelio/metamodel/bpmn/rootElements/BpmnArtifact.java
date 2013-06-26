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
package org.modelio.metamodel.bpmn.rootElements;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;

@objid ("00787d78-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnArtifact extends BpmnBaseElement {
    @objid ("f0d719a9-3c66-42fd-9bf4-9d4c08064525")
    BpmnSubProcess getSubProcess();

    @objid ("a4305e48-9a4f-46ef-abb9-8427a356e861")
    void setSubProcess(BpmnSubProcess value);

    @objid ("a3a81499-0e43-46d3-aff0-bbabed24d1b6")
    BpmnCollaboration getCollaboration();

    @objid ("909ba307-7e46-4ebc-8f5a-ee28d55f100f")
    void setCollaboration(BpmnCollaboration value);

    @objid ("204fe2e6-0114-4608-926c-a625a135b16d")
    BpmnProcess getProcess();

    @objid ("cf9afdfd-5046-4970-9b98-2fb23d1a08e9")
    void setProcess(BpmnProcess value);

}
