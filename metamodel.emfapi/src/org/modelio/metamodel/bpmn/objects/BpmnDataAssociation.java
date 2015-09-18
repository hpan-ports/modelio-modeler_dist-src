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
    @objid ("5270ee70-bef4-4ad0-99a6-85630097d970")
    String getAssignment();

    @objid ("0b949b61-6813-4725-9bc5-4bd05a532d62")
    void setAssignment(String value);

    @objid ("9c26aadf-c3dc-4caa-8fe8-c6b327f3e74b")
    String getTransfomation();

    @objid ("0af377d2-26cb-42d2-873c-fc3a7334528f")
    void setTransfomation(String value);

    @objid ("3f4153e8-ef81-4aab-b6ef-b7522b3c44b5")
    String getLanguage();

    @objid ("3f04b20c-17fa-49a9-bcff-f138222c4611")
    void setLanguage(String value);

    @objid ("a99e2b11-a312-4958-836b-c9627094043e")
    EList<BpmnItemAwareElement> getSourceRef();

    @objid ("dc3398a5-01e0-4e25-8c08-75d7d7f0bafb")
    <T extends BpmnItemAwareElement> List<T> getSourceRef(java.lang.Class<T> filterClass);

    @objid ("fc03ad64-140f-452e-a8c3-6ce1fa9b7a45")
    BpmnItemAwareElement getTargetRef();

    @objid ("03890877-b11d-41c8-a72b-4ef50ee94aea")
    void setTargetRef(BpmnItemAwareElement value);

    @objid ("8449e3ab-b69e-4456-a073-35ac2abfe39c")
    BpmnActivity getEndingActivity();

    @objid ("a4fea852-3220-4a79-8e3e-023848cc8b3e")
    void setEndingActivity(BpmnActivity value);

    @objid ("c4560843-ce13-45c1-8ae0-8ad0c7f40262")
    BpmnActivity getStartingActivity();

    @objid ("1c59792a-46f7-41ae-a519-c14c0df745c8")
    void setStartingActivity(BpmnActivity value);

    @objid ("5d7f7b1c-5e4b-4acd-bc7b-692e0f30f4cb")
    BpmnThrowEvent getStartingEvent();

    @objid ("8ff71a9f-7285-4c96-a423-0a531c8a4e27")
    void setStartingEvent(BpmnThrowEvent value);

    @objid ("98a82143-13b9-4103-96fc-5deeca3b654f")
    EList<BpmnSequenceFlowDataAssociation> getVisualShortCut();

    @objid ("32013430-7703-4c3e-9706-95bbc350308e")
    <T extends BpmnSequenceFlowDataAssociation> List<T> getVisualShortCut(java.lang.Class<T> filterClass);

    @objid ("f5471d64-7ba0-4224-8940-7c48e90ea7be")
    BpmnCatchEvent getEndingEvent();

    @objid ("e05af63f-179f-47ce-b843-0639fdc041d2")
    void setEndingEvent(BpmnCatchEvent value);

}
