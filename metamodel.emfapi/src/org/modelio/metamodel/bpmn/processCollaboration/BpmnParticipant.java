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
import org.modelio.metamodel.bpmn.bpmnService.BpmnEndPoint;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Package;

@objid ("007577d6-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnParticipant extends BpmnBaseElement {
    @objid ("a8feebf5-1b95-46ca-afb3-592e3b41b3ae")
    int getMultiplicityMin();

    @objid ("4474cb7a-9950-4332-8650-726f326edfa8")
    void setMultiplicityMin(int value);

    @objid ("bb0efae6-187d-4425-8c98-ac86871df8cc")
    int getMultiplicityMax();

    @objid ("6cc7ecc1-eff4-46ec-a798-a7925f54d261")
    void setMultiplicityMax(int value);

    @objid ("e240747c-6ae0-4586-b6af-7781bd3071ca")
    BpmnProcess getProcess();

    @objid ("ae807605-125d-486a-9af8-a7cb2f0d7c4e")
    void setProcess(BpmnProcess value);

    @objid ("b44a8061-383c-495f-9b2b-7a534644d936")
    BpmnCollaboration getContainer();

    @objid ("ed3068d4-db37-4ed9-b5e4-0d89b3888c49")
    void setContainer(BpmnCollaboration value);

    @objid ("77361853-fb96-4025-ae3e-f54a14c5491b")
    Classifier getType();

    @objid ("25980abb-e47b-4277-bd77-7619522c7eb0")
    void setType(Classifier value);

    @objid ("4bc95027-d797-478f-9508-f1347aae6bf2")
    EList<BpmnEndPoint> getEndPointRefs();

    @objid ("de29d909-30bd-4d44-930b-3d524ae1ead2")
    <T extends BpmnEndPoint> List<T> getEndPointRefs(java.lang.Class<T> filterClass);

    @objid ("ced12937-4771-41a3-8aea-5e2c27bd8a84")
    EList<BpmnInterface> getInterfaceRefs();

    @objid ("fcf86ff6-030a-495d-b0b2-0b18d10c98e7")
    <T extends BpmnInterface> List<T> getInterfaceRefs(java.lang.Class<T> filterClass);

    @objid ("e6309f18-4902-4f87-86a1-a54353f489bf")
    Package getPackageRef();

    @objid ("4d95a82c-23ed-417a-9454-9a65db153b34")
    void setPackageRef(Package value);

}
