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
package org.modelio.metamodel.bpmn.rootElements;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;

@objid ("00787d78-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnArtifact extends BpmnBaseElement {
    @objid ("42c64ac4-e2f1-45a2-94b3-d1dc3e1eacba")
    BpmnSubProcess getSubProcess();

    @objid ("1587cd0c-9cfa-441b-afba-5aa44284c063")
    void setSubProcess(BpmnSubProcess value);

    @objid ("67d09172-e270-46f9-85d4-02b408c6b743")
    BpmnCollaboration getCollaboration();

    @objid ("7fa0f46e-6146-4017-84b4-99f60ebbacd4")
    void setCollaboration(BpmnCollaboration value);

    @objid ("20588351-14f9-44a7-8d36-de3e272de3e2")
    BpmnProcess getProcess();

    @objid ("ba633eb0-8159-41fc-b34c-b16a31ad636f")
    void setProcess(BpmnProcess value);

}
