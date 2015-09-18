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
package org.modelio.metamodel.bpmn.rootElements;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;

@objid ("007a3514-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnGroup extends BpmnArtifact {
    @objid ("bc6bc115-bbe3-4423-9e11-16826f9f5696")
    String getCategory();

    @objid ("1a4bc707-93ac-42d8-84bf-f4c4a4865e9f")
    void setCategory(String value);

    @objid ("687fbf43-d488-47ba-80df-c1f411289f06")
    EList<BpmnFlowElement> getCategorized();

    @objid ("c54c5a79-3013-45ef-b916-44f9d92f1ed4")
    <T extends BpmnFlowElement> List<T> getCategorized(java.lang.Class<T> filterClass);

}
