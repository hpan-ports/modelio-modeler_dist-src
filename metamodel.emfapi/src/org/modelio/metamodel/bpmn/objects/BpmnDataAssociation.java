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
    @objid ("f89d10f7-397f-4f5f-a8bd-8fb62f316411")
    String getAssignment();

    @objid ("2f643aa9-fd35-4302-8d38-080f46b8ed28")
    void setAssignment(String value);

    @objid ("2deff641-b909-4451-83c3-96bffcfc3d54")
    String getTransfomation();

    @objid ("8ee3ba1c-b867-456a-b450-529e53cc76f7")
    void setTransfomation(String value);

    @objid ("2c4f9981-be24-46f4-8515-2c2ed297dd04")
    String getLanguage();

    @objid ("b2e73477-25e6-461f-a3a6-d8c19d216c5d")
    void setLanguage(String value);

    @objid ("db3cce75-d0aa-40cc-95d2-c0c898f4621e")
    EList<BpmnItemAwareElement> getSourceRef();

    @objid ("424da2c4-f8d1-4da6-8f60-40492dbdaf00")
    <T extends BpmnItemAwareElement> List<T> getSourceRef(java.lang.Class<T> filterClass);

    @objid ("b050c992-77e5-4e5b-94b7-ac010ae2d40c")
    BpmnItemAwareElement getTargetRef();

    @objid ("70cdce3b-f7e3-4c58-b759-9f5b50f7ced9")
    void setTargetRef(BpmnItemAwareElement value);

    @objid ("8fb4c837-36cb-4547-bb4f-4194f05af5e8")
    BpmnActivity getEndingActivity();

    @objid ("4a6797a7-5e74-4fbd-88f9-9bc6e9fcb098")
    void setEndingActivity(BpmnActivity value);

    @objid ("a7dfa294-4bf8-4772-b277-8b4c96ebe306")
    BpmnActivity getStartingActivity();

    @objid ("70ca4d34-35e3-434b-b3ed-61667ec55bac")
    void setStartingActivity(BpmnActivity value);

    @objid ("1ffc4874-267a-4513-b153-b5e2ee6bfbeb")
    BpmnThrowEvent getStartingEvent();

    @objid ("8c73ae84-dc22-481f-bc0e-f93c81f65d65")
    void setStartingEvent(BpmnThrowEvent value);

    @objid ("c1357a47-1d79-4aa9-bdd3-7e90959e9812")
    EList<BpmnSequenceFlowDataAssociation> getVisualShortCut();

    @objid ("4ceb7ad1-06a6-40c6-af6e-4f38656c44fe")
    <T extends BpmnSequenceFlowDataAssociation> List<T> getVisualShortCut(java.lang.Class<T> filterClass);

    @objid ("c95b30a8-7ebe-4d96-bd30-712f1cfa28c3")
    BpmnCatchEvent getEndingEvent();

    @objid ("4afa7206-7b9b-4f00-bb83-149d77d1fc34")
    void setEndingEvent(BpmnCatchEvent value);

}
