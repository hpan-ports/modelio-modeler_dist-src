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
    @objid ("2d4fb963-7aab-4857-b5ea-3c34bffd6a5b")
    EList<BpmnAssociation> getOutgoingAssoc();

    @objid ("2dc6f710-f01a-4ca6-81b5-2b3ce60de111")
    <T extends BpmnAssociation> List<T> getOutgoingAssoc(java.lang.Class<T> filterClass);

    @objid ("e4831eb4-5c38-41cf-8c17-4f32c8526737")
    EList<BpmnAssociation> getIncomingAssoc();

    @objid ("1e18db67-0968-46b9-a140-8365ed01b106")
    <T extends BpmnAssociation> List<T> getIncomingAssoc(java.lang.Class<T> filterClass);

    @objid ("0c30db83-cc82-4c6e-8a0d-a2539621ef63")
    EList<BpmnMessageFlow> getIncomingFlow();

    @objid ("fcb5bb82-7a02-4201-81b7-0391bd71937f")
    <T extends BpmnMessageFlow> List<T> getIncomingFlow(java.lang.Class<T> filterClass);

    @objid ("90c59bd9-d327-488b-8660-1a9a1f6b60cf")
    EList<BpmnMessageFlow> getOutgoingFlow();

    @objid ("bca913b1-8a4a-447c-ab1d-7df936e0faaf")
    <T extends BpmnMessageFlow> List<T> getOutgoingFlow(java.lang.Class<T> filterClass);

}
