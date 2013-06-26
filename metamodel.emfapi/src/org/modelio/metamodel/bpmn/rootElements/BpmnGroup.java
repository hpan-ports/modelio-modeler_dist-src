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
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;

@objid ("007a3514-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnGroup extends BpmnArtifact {
    @objid ("1eb3879e-f49f-4cd3-abd3-466fa62f60d4")
    String getCategory();

    @objid ("e2da6032-e1d4-442f-88e9-be6b9764ceff")
    void setCategory(String value);

    @objid ("8db70dd1-dece-4d99-9413-12884257af67")
    EList<BpmnFlowElement> getCategorized();

    @objid ("399abe9e-d10c-4a7c-8048-d2bc6097f82e")
    <T extends BpmnFlowElement> List<T> getCategorized(java.lang.Class<T> filterClass);

}
