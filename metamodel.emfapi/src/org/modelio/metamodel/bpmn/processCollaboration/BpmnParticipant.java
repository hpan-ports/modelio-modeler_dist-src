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
import org.modelio.metamodel.bpmn.bpmnService.BpmnEndPoint;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Package;

@objid ("007577d6-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnParticipant extends BpmnBaseElement {
    @objid ("c1deb952-f924-4f5c-8bce-1df412c8e749")
    int getMultiplicityMin();

    @objid ("a70d9ea6-8794-4099-b1bb-15f4ffddf0ae")
    void setMultiplicityMin(int value);

    @objid ("553536a3-9fdc-4c01-b301-c5022be33f29")
    int getMultiplicityMax();

    @objid ("51593ec8-e1cb-4119-b035-0a0bc19a00af")
    void setMultiplicityMax(int value);

    @objid ("d160b976-1b84-40c0-8a53-62e5ce74d80d")
    BpmnProcess getProcess();

    @objid ("2f0cf81f-b018-4591-bcf9-e01a619943d5")
    void setProcess(BpmnProcess value);

    @objid ("2c9f9147-4858-48a4-8e63-57e5f7d8e37c")
    BpmnCollaboration getContainer();

    @objid ("f7732c50-5e15-47d9-8513-c19570044578")
    void setContainer(BpmnCollaboration value);

    @objid ("1f640dfd-2039-44f6-9ed7-2273c9bffde6")
    Classifier getType();

    @objid ("d556e462-a0cd-4fa5-8025-a755bccdccd0")
    void setType(Classifier value);

    @objid ("d20d94ef-ec78-40b0-b7f6-471292a63cf1")
    EList<BpmnEndPoint> getEndPointRefs();

    @objid ("e09686af-fc10-48e3-927b-cc01ef81a12d")
    <T extends BpmnEndPoint> List<T> getEndPointRefs(java.lang.Class<T> filterClass);

    @objid ("240a36d5-23f5-4703-b048-7558ddc60167")
    EList<BpmnInterface> getInterfaceRefs();

    @objid ("32eea7b0-e9a9-4762-b3bb-e8bb6743d260")
    <T extends BpmnInterface> List<T> getInterfaceRefs(java.lang.Class<T> filterClass);

    @objid ("6c5eacbf-1efc-42cb-9646-64fc705b95f2")
    Package getPackageRef();

    @objid ("0f92be22-dbb1-46c2-a81c-ac144c8d90a2")
    void setPackageRef(Package value);

}
