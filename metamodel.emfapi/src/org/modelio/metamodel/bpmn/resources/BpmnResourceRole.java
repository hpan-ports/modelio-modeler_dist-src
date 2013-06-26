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
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;

@objid ("000a8606-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnResourceRole extends BpmnBaseElement {
    @objid ("1fbb5110-fb08-4258-bd46-d2f56a645e49")
    BpmnResource getResourceRef();

    @objid ("511af3fc-0401-4d19-8f53-c4762cea9778")
    void setResourceRef(BpmnResource value);

    @objid ("f9d70e63-8a78-4a1e-b937-4881d9695bac")
    BpmnFlowNode getAnnotated();

    @objid ("e9fb011f-93cc-4fa8-94d2-7f557f00e41e")
    void setAnnotated(BpmnFlowNode value);

    @objid ("c5df886e-ec35-4476-8460-c5bdeeb16bee")
    EList<BpmnResourceParameterBinding> getResourceParameterBinding();

    @objid ("22cb4a4e-dd5a-4e7d-98ba-33a3f0dbd8f1")
    <T extends BpmnResourceParameterBinding> List<T> getResourceParameterBinding(java.lang.Class<T> filterClass);

    @objid ("9a71e038-c577-4ace-ac42-edbd76bf29a9")
    BpmnProcess getProcess();

    @objid ("05d2f061-ef24-4ade-bd6b-44125d54f3df")
    void setProcess(BpmnProcess value);

}
