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
package org.modelio.metamodel.bpmn.events;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("0090129e-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnLinkEventDefinition extends BpmnEventDefinition {
    @objid ("90332cd7-3613-4e34-a7d0-09e34c9187ce")
    EList<BpmnLinkEventDefinition> getSource();

    @objid ("fd899263-f375-4182-809f-d71940a8b337")
    <T extends BpmnLinkEventDefinition> List<T> getSource(java.lang.Class<T> filterClass);

    @objid ("30708b64-f6ed-447f-915c-edb72225fe53")
    BpmnLinkEventDefinition getTarget();

    @objid ("304eb8b0-1cb1-4139-8e83-86d9e3b26942")
    void setTarget(BpmnLinkEventDefinition value);

}
