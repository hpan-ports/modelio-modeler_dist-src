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
    @objid ("76b442d3-6d35-4689-a75b-4380cd9c8ef8")
    BpmnItemKind getItemKind();

    @objid ("472612ff-ec02-4e2d-985f-f22f86ed962d")
    void setItemKind(BpmnItemKind value);

    @objid ("671eb206-8f69-421d-9495-eb56150077af")
    boolean isIsCollection();

    @objid ("d5718c5a-9b18-4595-a09f-17ddbea12763")
    void setIsCollection(boolean value);

    @objid ("cc93e81b-e581-4af8-b630-30f107f35fa4")
    GeneralClass getStructureRef();

    @objid ("439f3807-4602-418e-b95f-74697c9dc6c0")
    void setStructureRef(GeneralClass value);

    @objid ("1cd0083c-7a29-4ce9-8afb-c16808e0ae3f")
    EList<BpmnMessage> getTypedMessage();

    @objid ("76c40be8-d071-4173-85c8-a15804e29fac")
    <T extends BpmnMessage> List<T> getTypedMessage(java.lang.Class<T> filterClass);

    @objid ("e1ee7766-ad63-43e9-93a7-0bd428e95a90")
    EList<BpmnItemAwareElement> getTypedItem();

    @objid ("c0306b0e-3ff1-4197-a5da-6231a42933ca")
    <T extends BpmnItemAwareElement> List<T> getTypedItem(java.lang.Class<T> filterClass);

    @objid ("b0e18cf9-ee47-4034-8fb6-69f358928dbc")
    EList<BpmnResourceParameter> getTypedResourceParameter();

    @objid ("e05994f2-3eb2-4d91-90d4-b3d83d04f40d")
    <T extends BpmnResourceParameter> List<T> getTypedResourceParameter(java.lang.Class<T> filterClass);

}
