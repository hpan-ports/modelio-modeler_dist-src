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
    @objid ("c526a465-6b5b-40a4-ab10-e2b1babd0f47")
    BpmnProcessType getProcessType();

    @objid ("973e35a9-9956-435c-ada3-01da67974fe5")
    void setProcessType(BpmnProcessType value);

    @objid ("da976b9b-6908-4954-98f0-7d6e1d9aedcb")
    boolean isIsClosed();

    @objid ("6cac6d9c-bc67-4dac-b7ec-f1ba77adb58a")
    void setIsClosed(boolean value);

    @objid ("89d34251-2655-444b-9e6d-0e255097dacb")
    OptionalBoolean getIsExecutable();

    @objid ("053f573a-6f34-4a63-81c8-89e299f0347e")
    void setIsExecutable(OptionalBoolean value);

    @objid ("7ddb3e38-0aa6-4267-a110-b0047fdec378")
    EList<BpmnCallActivity> getCaller();

    @objid ("748c9d7f-161b-4bd1-9bd7-4c8c16ba4f2f")
    <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass);

    @objid ("220be243-b12f-4150-a196-a07fc10d30fd")
    EList<BpmnProcess> getSupports();

    @objid ("445fb416-90de-4fac-a51d-41e39ac608db")
    <T extends BpmnProcess> List<T> getSupports(java.lang.Class<T> filterClass);

    @objid ("5dd69129-ab34-402f-9769-7754bbb856a4")
    EList<BpmnArtifact> getArtifact();

    @objid ("c5590aeb-2163-48d2-89f5-4895f6c81dd8")
    <T extends BpmnArtifact> List<T> getArtifact(java.lang.Class<T> filterClass);

    @objid ("707551ce-8fcc-4e50-9391-2c0eef0807e1")
    EList<BpmnLaneSet> getLaneSet();

    @objid ("0add436c-1d41-41bf-bc9e-9aade409e2ad")
    <T extends BpmnLaneSet> List<T> getLaneSet(java.lang.Class<T> filterClass);

    @objid ("297834d5-da17-45c4-9504-3e22d45f58d3")
    EList<BpmnProcess> getSupported();

    @objid ("cf0785a5-6e9d-4ab8-b590-053bb6210a78")
    <T extends BpmnProcess> List<T> getSupported(java.lang.Class<T> filterClass);

    @objid ("0246ad31-d294-4e6d-ac90-a80a1a0db8c2")
    BpmnParticipant getParticipant();

    @objid ("fda1c531-fb42-4535-b02a-2b1edf6999d5")
    void setParticipant(BpmnParticipant value);

    @objid ("d419bf87-474f-491a-a2b6-6ea2e731bd62")
    EList<BpmnFlowElement> getFlowElement();

    @objid ("0bd6f466-5670-43c4-a9e0-122d1c9a94f2")
    <T extends BpmnFlowElement> List<T> getFlowElement(java.lang.Class<T> filterClass);

    @objid ("76f93dc1-7075-4e59-8b25-5fffd715a068")
    EList<BpmnResourceRole> getResource();

    @objid ("67aed4af-6189-4747-94e2-4003d6ac8e26")
    <T extends BpmnResourceRole> List<T> getResource(java.lang.Class<T> filterClass);

}
