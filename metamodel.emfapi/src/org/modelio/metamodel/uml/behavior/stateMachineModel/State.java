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
package org.modelio.metamodel.uml.behavior.stateMachineModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;

@objid ("0053788e-c4bf-1fd8-97fe-001ec947cd2a")
public interface State extends StateVertex {
    @objid ("16584f63-5dc6-42c6-b960-8b0af12df1dc")
    EList<ExitPointPseudoState> getExitPoint();

    @objid ("96d79b64-0317-4648-8e1b-0515e9134d2e")
    <T extends ExitPointPseudoState> List<T> getExitPoint(java.lang.Class<T> filterClass);

    @objid ("5d87d585-4b30-4589-896a-fcbafa745daf")
    EList<BpmnDataState> getBpmnDataStateRefs();

    @objid ("cc60eb97-e71b-4052-9f8d-993171e50b0c")
    <T extends BpmnDataState> List<T> getBpmnDataStateRefs(java.lang.Class<T> filterClass);

    @objid ("9eba8c52-825f-4fb4-ad5a-bf1cc4dd397b")
    EList<Event> getDeffered();

    @objid ("6b97a37d-1f2c-4fe0-9913-fd2530a6bc19")
    <T extends Event> List<T> getDeffered(java.lang.Class<T> filterClass);

    @objid ("27bccdf8-114a-436a-bba1-fa217334d63f")
    EList<InternalTransition> getInternal();

    @objid ("1a7c5aef-b919-4e29-a554-3942c13b6288")
    <T extends InternalTransition> List<T> getInternal(java.lang.Class<T> filterClass);

    @objid ("dbfb67c8-8842-4b2d-8645-980388cfe48f")
    EList<EntryPointPseudoState> getEntryPoint();

    @objid ("ef903084-011d-4d95-8c03-f09c0386502f")
    <T extends EntryPointPseudoState> List<T> getEntryPoint(java.lang.Class<T> filterClass);

    @objid ("c037ed08-7749-4729-8588-e23ee1b8353e")
    EList<Region> getOwnedRegion();

    @objid ("b645a7b2-fc88-4788-a77f-3a03a70df514")
    <T extends Region> List<T> getOwnedRegion(java.lang.Class<T> filterClass);

    @objid ("0e81e601-5a99-44b8-934c-778ba5d65834")
    EList<BpmnMessage> getRequiredStateOfBpmnMessage();

    @objid ("c7bda481-64be-439c-b601-9fcd22b2a84a")
    <T extends BpmnMessage> List<T> getRequiredStateOfBpmnMessage(java.lang.Class<T> filterClass);

    @objid ("9dd04a3b-e9be-44f6-9ddb-7a8109313d7f")
    EList<ObjectNode> getRequiredStateOf();

    @objid ("8e1ecc68-55f9-482f-8241-862b1b0e1d60")
    <T extends ObjectNode> List<T> getRequiredStateOf(java.lang.Class<T> filterClass);

    @objid ("b61e902f-9b85-4b13-bde4-9f988d44b6b2")
    EList<ConnectionPointReference> getConnection();

    @objid ("93696a5a-38c2-4ace-be07-659f46386954")
    <T extends ConnectionPointReference> List<T> getConnection(java.lang.Class<T> filterClass);

    @objid ("4e9e2b10-8a09-42c0-8fd4-7c90983f8ba2")
    StateMachine getSubMachine();

    @objid ("66568ff8-68c8-48f9-91ec-5a22192be7cd")
    void setSubMachine(StateMachine value);

    @objid ("52d96d86-1519-4fac-930c-6942c3f78bb5")
    EList<BpmnItemAwareElement> getRequiredStateOfBpmnItem();

    @objid ("9c35b9b4-1773-4104-ad3f-9c9f9e388029")
    <T extends BpmnItemAwareElement> List<T> getRequiredStateOfBpmnItem(java.lang.Class<T> filterClass);

}
