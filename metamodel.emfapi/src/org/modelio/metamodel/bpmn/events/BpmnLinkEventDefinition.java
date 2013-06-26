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
package org.modelio.metamodel.bpmn.events;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("0090129e-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnLinkEventDefinition extends BpmnEventDefinition {
    @objid ("e5b04714-c197-4704-bec8-422976d8b662")
    EList<BpmnLinkEventDefinition> getSource();

    @objid ("927c6324-c1ff-4a47-8c8a-9c814f8da7c1")
    <T extends BpmnLinkEventDefinition> List<T> getSource(java.lang.Class<T> filterClass);

    @objid ("05967fcc-6a89-4e8e-821b-04770fb2369c")
    BpmnLinkEventDefinition getTarget();

    @objid ("0ebbf3ee-99f0-4d55-abf9-0e0b67795858")
    void setTarget(BpmnLinkEventDefinition value);

}
