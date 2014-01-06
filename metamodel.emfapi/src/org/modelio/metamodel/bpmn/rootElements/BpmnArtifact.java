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
package org.modelio.metamodel.bpmn.rootElements;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;

@objid ("00787d78-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnArtifact extends BpmnBaseElement {
    @objid ("dc432c0c-a268-4bbb-8461-e339d581b219")
    BpmnSubProcess getSubProcess();

    @objid ("52d904e7-a553-4146-b2f3-fae8f1681781")
    void setSubProcess(BpmnSubProcess value);

    @objid ("bc96f9db-9ba6-4eff-ae81-20d162511fbe")
    BpmnCollaboration getCollaboration();

    @objid ("325b8151-8680-4457-8683-389ad07bad01")
    void setCollaboration(BpmnCollaboration value);

    @objid ("59fd49df-d655-4ac5-a6fe-41cafec596bd")
    BpmnProcess getProcess();

    @objid ("8199e43f-5a95-4379-b484-00b60862c859")
    void setProcess(BpmnProcess value);

}
