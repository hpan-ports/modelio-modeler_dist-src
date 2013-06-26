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
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("00047c84-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnDataAssociation extends BpmnBaseElement {
    @objid ("58ebc149-8b96-4384-9fdf-a7a13a842879")
    String getAssignment();

    @objid ("78f38d34-3313-4c97-b0d6-a2252da4e86e")
    void setAssignment(String value);

    @objid ("5901444f-88f0-4fec-ab54-d0b2138a5c38")
    String getTransfomation();

    @objid ("96082255-3a40-49a3-a09c-6460d9cc6f47")
    void setTransfomation(String value);

    @objid ("f5de51bb-5ac3-40bb-9cb4-ba9b102a32bc")
    String getLanguage();

    @objid ("0f036ccf-f218-49d0-9afe-ae9e3faec8d7")
    void setLanguage(String value);

    @objid ("eb23fba8-804b-4cc8-b3e1-76ccf745b267")
    EList<BpmnItemAwareElement> getSourceRef();

    @objid ("0daf297b-480f-45c3-b94c-e6d89ff3da77")
    <T extends BpmnItemAwareElement> List<T> getSourceRef(java.lang.Class<T> filterClass);

    @objid ("90ac8b72-78aa-4591-ba19-00fa2ec0fec6")
    BpmnItemAwareElement getTargetRef();

    @objid ("33f7ce8d-77e5-48c1-a353-f6a023974afd")
    void setTargetRef(BpmnItemAwareElement value);

    @objid ("6f0ab3e5-4023-4c72-a987-46f6484c93a6")
    BpmnActivity getEndingActivity();

    @objid ("1d6e75c8-94f1-4664-b9e9-49b3125096e6")
    void setEndingActivity(BpmnActivity value);

    @objid ("141195ac-fa1e-416c-a9fd-7623b5808874")
    BpmnActivity getStartingActivity();

    @objid ("97a4c37b-7494-4776-9d60-fb0108ba1b48")
    void setStartingActivity(BpmnActivity value);

    @objid ("4878a9c6-c0d6-40c6-a122-9b45558369c6")
    BpmnThrowEvent getStartingEvent();

    @objid ("3a7d9a5c-df7a-4586-a53a-a944fd1d90a6")
    void setStartingEvent(BpmnThrowEvent value);

    @objid ("46b743b4-9f89-4436-8ad7-4cd34aae0297")
    EList<BpmnSequenceFlowDataAssociation> getVisualShortCut();

    @objid ("941ebdec-33da-4c86-8359-2398510f87c4")
    <T extends BpmnSequenceFlowDataAssociation> List<T> getVisualShortCut(java.lang.Class<T> filterClass);

    @objid ("fc6d9d1e-8ed4-40b6-8f0e-45a7b591a598")
    BpmnCatchEvent getEndingEvent();

    @objid ("f578c55d-0e96-4a21-b7cc-9f2add15d484")
    void setEndingEvent(BpmnCatchEvent value);

}
