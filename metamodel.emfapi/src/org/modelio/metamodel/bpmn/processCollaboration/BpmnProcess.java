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
    @objid ("7150394b-6306-4ee6-b91c-5f584cbb0bd2")
    BpmnProcessType getProcessType();

    @objid ("ede1c404-567d-4335-bc7a-7cd85d2d9660")
    void setProcessType(BpmnProcessType value);

    @objid ("f60dbaee-17f7-4a3d-8282-aeb39e9393ea")
    boolean isIsClosed();

    @objid ("5f6bc624-eaea-46a2-90b8-b75340ce6fb0")
    void setIsClosed(boolean value);

    @objid ("da3189f8-d72e-421b-bbba-a6d87adbd0b5")
    OptionalBoolean getIsExecutable();

    @objid ("0cf707de-36cc-476b-a969-e74e51055147")
    void setIsExecutable(OptionalBoolean value);

    @objid ("f32357d5-bc29-4070-82c6-ed42ead9def1")
    EList<BpmnCallActivity> getCaller();

    @objid ("fa20c8c7-c2ff-4f68-8763-d6e3a161825e")
    <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass);

    @objid ("85f9b04f-de26-4839-9e00-8ba458ccf30c")
    EList<BpmnProcess> getSupports();

    @objid ("91b0d6b5-546b-4931-9fd0-885bceffed56")
    <T extends BpmnProcess> List<T> getSupports(java.lang.Class<T> filterClass);

    @objid ("4d7a3d43-a7a9-4628-9b74-5cb5f4ba9bea")
    EList<BpmnArtifact> getArtifact();

    @objid ("a6a0401d-bb4d-4127-8b96-3f6f455d7ded")
    <T extends BpmnArtifact> List<T> getArtifact(java.lang.Class<T> filterClass);

    @objid ("0d46c94e-9cf8-4086-86d2-540106137cba")
    EList<BpmnLaneSet> getLaneSet();

    @objid ("7e4f069a-863a-460d-b0cb-f0150a34acbf")
    <T extends BpmnLaneSet> List<T> getLaneSet(java.lang.Class<T> filterClass);

    @objid ("a55da339-2cea-47bf-ab2d-ada130293fe2")
    EList<BpmnProcess> getSupported();

    @objid ("16bccdb8-e7f1-47e4-ad6c-76564dd98e67")
    <T extends BpmnProcess> List<T> getSupported(java.lang.Class<T> filterClass);

    @objid ("b605838a-9aa6-4676-b543-f5333dbe8be2")
    BpmnParticipant getParticipant();

    @objid ("e9a22c24-9820-4496-98a6-0652705db346")
    void setParticipant(BpmnParticipant value);

    @objid ("a95a403e-125c-4538-b050-ab3c00b49d5b")
    EList<BpmnFlowElement> getFlowElement();

    @objid ("b07b9751-779a-4366-85b2-5f3fa1ca118d")
    <T extends BpmnFlowElement> List<T> getFlowElement(java.lang.Class<T> filterClass);

    @objid ("75f21723-d140-4c99-8a6d-e542d98e7a97")
    EList<BpmnResourceRole> getResource();

    @objid ("7549c28c-9cd0-4661-bc95-00a4940387d9")
    <T extends BpmnResourceRole> List<T> getResource(java.lang.Class<T> filterClass);

}
