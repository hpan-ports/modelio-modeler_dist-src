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
package org.modelio.metamodel.bpmn.resources;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("0009e2dc-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnResourceParameter extends BpmnBaseElement {
    @objid ("f1e2a69d-c9a5-4a29-8cb7-7d91d896763e")
    boolean isIsRequired();

    @objid ("26c7acab-40fb-4d27-86b4-e0514fbda63f")
    void setIsRequired(boolean value);

    @objid ("97f4b1f3-f6da-47c6-9ae3-4c5b000976a5")
    BpmnResource getResource();

    @objid ("1ebdb221-8412-46a3-8fca-c1ff3bd0522b")
    void setResource(BpmnResource value);

    @objid ("9bfac6c0-cc17-4364-b7a0-37dc2c073d3d")
    BpmnItemDefinition getType();

    @objid ("b85bca1d-5f21-4e79-bcec-78ce46f9ae03")
    void setType(BpmnItemDefinition value);

    @objid ("c3b3e97d-63e4-4112-9eb9-02dde579f1a5")
    EList<BpmnResourceParameterBinding> getParameterBindingRefs();

    @objid ("93c1efce-e48f-4c07-a888-7daf41fef973")
    <T extends BpmnResourceParameterBinding> List<T> getParameterBindingRefs(java.lang.Class<T> filterClass);

}
