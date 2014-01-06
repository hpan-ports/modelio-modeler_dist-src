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
package org.modelio.metamodel.bpmn.processCollaboration;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcessType;
import org.modelio.metamodel.bpmn.processCollaboration.OptionalBoolean;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;

@objid ("00762104-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnProcess extends BpmnRootElement {
    @objid ("2da070c8-a72c-48e3-816d-2d71dcf97d9b")
    BpmnProcessType getProcessType();

    @objid ("f0146086-c687-4ced-bbf3-89ac6f90803e")
    void setProcessType(BpmnProcessType value);

    @objid ("c9f2ed8f-1f93-48c7-9617-8936ba0467d7")
    boolean isIsClosed();

    @objid ("6a745b43-3a43-4920-a0e4-268c191c2150")
    void setIsClosed(boolean value);

    @objid ("5cce6bd3-b13a-43ad-a771-c9d81f78eebc")
    OptionalBoolean getIsExecutable();

    @objid ("2f7143ee-d473-4171-814e-f316f9df591d")
    void setIsExecutable(OptionalBoolean value);

    @objid ("af926f43-9334-4f93-bd2f-3dcaa0cc4632")
    EList<BpmnCallActivity> getCaller();

    @objid ("27069996-e0db-4c05-b2d9-69bc67d3cdb4")
    <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass);

    @objid ("86532f44-d52e-486b-977b-1c87cde5df1f")
    EList<BpmnProcess> getSupports();

    @objid ("aea23d25-8d51-4f6b-9fdd-2c42b645fce9")
    <T extends BpmnProcess> List<T> getSupports(java.lang.Class<T> filterClass);

    @objid ("908f3cfe-06ef-44b7-a155-0314c5417c11")
    EList<BpmnArtifact> getArtifact();

    @objid ("3b004de5-0fbd-4200-b3a5-48de648c66b0")
    <T extends BpmnArtifact> List<T> getArtifact(java.lang.Class<T> filterClass);

    @objid ("07238ad2-f5b1-4333-9bc4-c481d9cc7be8")
    EList<BpmnLaneSet> getLaneSet();

    @objid ("c8634853-22e5-47e8-9c79-c209f919b09a")
    <T extends BpmnLaneSet> List<T> getLaneSet(java.lang.Class<T> filterClass);

    @objid ("6510392c-c24b-4585-b3f9-90e55f201325")
    EList<BpmnProcess> getSupported();

    @objid ("c9bd2122-2206-40da-b641-d8b937c441d8")
    <T extends BpmnProcess> List<T> getSupported(java.lang.Class<T> filterClass);

    @objid ("27eaddd3-5009-4618-938f-40f87fbe8acd")
    BpmnParticipant getParticipant();

    @objid ("6c0190a4-0e03-412e-9c42-f69704ac48c1")
    void setParticipant(BpmnParticipant value);

    @objid ("c3061589-cd44-481e-b19c-cc51d69a304d")
    EList<BpmnFlowElement> getFlowElement();

    @objid ("ed36f283-4bcd-4f9d-a7b4-995d8239265f")
    <T extends BpmnFlowElement> List<T> getFlowElement(java.lang.Class<T> filterClass);

    @objid ("9ec81f59-69c6-4909-abfc-b0aa6c34583b")
    EList<BpmnResourceRole> getResource();

    @objid ("db81cb46-b077-42d2-950a-9c3fabe2ad1d")
    <T extends BpmnResourceRole> List<T> getResource(java.lang.Class<T> filterClass);

}
