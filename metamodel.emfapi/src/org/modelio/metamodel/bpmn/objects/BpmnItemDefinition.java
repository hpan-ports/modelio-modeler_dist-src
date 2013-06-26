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
package org.modelio.metamodel.bpmn.objects;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnItemKind;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("0007a24c-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnItemDefinition extends BpmnRootElement {
    @objid ("e07450a6-0997-4617-8abd-50ea6e907147")
    BpmnItemKind getItemKind();

    @objid ("a1c6320e-507b-4497-aea7-7065ce5830d0")
    void setItemKind(BpmnItemKind value);

    @objid ("07761cba-1f91-4484-aff7-5f345147332c")
    boolean isIsCollection();

    @objid ("e5524423-fefe-45e1-9a3b-210f35e23470")
    void setIsCollection(boolean value);

    @objid ("afb3f343-ae5f-4907-a24a-58d007ae3e54")
    GeneralClass getStructureRef();

    @objid ("fa78008d-2942-4ef2-885a-b75f5448428d")
    void setStructureRef(GeneralClass value);

    @objid ("a7994276-07f5-4310-b0d8-826a48f7fe92")
    EList<BpmnMessage> getTypedMessage();

    @objid ("2f3d3b5a-e69e-43a1-b59f-900742e618ed")
    <T extends BpmnMessage> List<T> getTypedMessage(java.lang.Class<T> filterClass);

    @objid ("88b93862-ad83-449c-a05d-11d41cc44bbe")
    EList<BpmnItemAwareElement> getTypedItem();

    @objid ("e2a68b11-6866-403a-a380-f612bc5d23ce")
    <T extends BpmnItemAwareElement> List<T> getTypedItem(java.lang.Class<T> filterClass);

    @objid ("a47c6de3-131f-4217-83f9-6ecae7e39655")
    EList<BpmnResourceParameter> getTypedResourceParameter();

    @objid ("33dfc30b-25e9-4c64-b95c-5cf10a88c30f")
    <T extends BpmnResourceParameter> List<T> getTypedResourceParameter(java.lang.Class<T> filterClass);

}
