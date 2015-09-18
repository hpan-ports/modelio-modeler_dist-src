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
import org.modelio.metamodel.bpmn.bpmnService.BpmnEndPoint;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Package;

@objid ("007577d6-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnParticipant extends BpmnBaseElement {
    @objid ("5a76dd0d-f498-41bb-aa2e-6bb625a3f63a")
    int getMultiplicityMin();

    @objid ("4db426e3-b532-49f4-a6bd-4d7d8735e92b")
    void setMultiplicityMin(int value);

    @objid ("6c25084d-e04d-4994-93ef-277583ebd177")
    int getMultiplicityMax();

    @objid ("0a65fb34-5024-41cf-901b-dc1b3321adbf")
    void setMultiplicityMax(int value);

    @objid ("514cce3c-61fd-41d5-8988-c9c94f300bde")
    BpmnProcess getProcess();

    @objid ("c8ee4f24-70d8-48da-ae58-2b152e09ef2a")
    void setProcess(BpmnProcess value);

    @objid ("5aaa9f82-b2bb-42c8-9472-f80e03b455bb")
    BpmnCollaboration getContainer();

    @objid ("6b96f57c-267e-4041-801f-ae81f1764201")
    void setContainer(BpmnCollaboration value);

    @objid ("897aa1b5-e956-40ff-b7ca-63be8de78eff")
    Classifier getType();

    @objid ("8eb09302-f633-44ea-bb73-4fd151e949bc")
    void setType(Classifier value);

    @objid ("abcf5ee3-a029-4642-83ea-69371f52a13d")
    EList<BpmnEndPoint> getEndPointRefs();

    @objid ("66029f4a-9b17-44a5-9785-715ddab2db77")
    <T extends BpmnEndPoint> List<T> getEndPointRefs(java.lang.Class<T> filterClass);

    @objid ("f8216aa6-ba0f-44d8-aa1e-8efbb2892828")
    EList<BpmnInterface> getInterfaceRefs();

    @objid ("006116ce-0790-415f-8727-f0b6aa1c73ed")
    <T extends BpmnInterface> List<T> getInterfaceRefs(java.lang.Class<T> filterClass);

    @objid ("aa5b2473-ab6e-44f7-ac9d-97ec52597bde")
    Package getPackageRef();

    @objid ("c1ad92ea-c541-46ff-9526-b721a72d4704")
    void setPackageRef(Package value);

}
