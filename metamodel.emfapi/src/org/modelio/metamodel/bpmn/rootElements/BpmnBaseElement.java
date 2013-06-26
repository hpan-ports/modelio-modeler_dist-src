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
package org.modelio.metamodel.bpmn.rootElements;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociation;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0077d2a6-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnBaseElement extends ModelElement {
    @objid ("3549dee7-cc9a-49c9-9ca8-4ab3b105e5fa")
    EList<BpmnAssociation> getOutgoingAssoc();

    @objid ("05c094a9-7d6e-4b84-afbb-78e198b48ec7")
    <T extends BpmnAssociation> List<T> getOutgoingAssoc(java.lang.Class<T> filterClass);

    @objid ("5b14d304-b148-4a29-89c9-e3cd571868ea")
    EList<BpmnAssociation> getIncomingAssoc();

    @objid ("22ed2e56-9f2f-481b-97c8-b8322db38b65")
    <T extends BpmnAssociation> List<T> getIncomingAssoc(java.lang.Class<T> filterClass);

    @objid ("bbd196e5-3a58-4758-b73a-983a4d19513d")
    EList<BpmnMessageFlow> getIncomingFlow();

    @objid ("47c887b8-9cf1-4c38-af90-f5e9a6b7a2b4")
    <T extends BpmnMessageFlow> List<T> getIncomingFlow(java.lang.Class<T> filterClass);

    @objid ("de52859a-b2f5-4801-a966-73b5278a49c7")
    EList<BpmnMessageFlow> getOutgoingFlow();

    @objid ("5142ac0d-f6a2-4719-aa34-22ee2f6f1c0a")
    <T extends BpmnMessageFlow> List<T> getOutgoingFlow(java.lang.Class<T> filterClass);

}
