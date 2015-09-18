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
package org.modelio.metamodel.bpmn.objects;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("0006fc34-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnItemAwareElement extends BpmnFlowElement {
    @objid ("d6c5b21e-44ae-4748-99ee-3791b9d9822e")
    GeneralClass getType();

    @objid ("a2fcc11f-9753-4a5f-a87c-2e5b473e7d66")
    void setType(GeneralClass value);

    @objid ("98f79e44-0eb3-407d-b44b-8252cae03d61")
    EList<BpmnDataAssociation> getTargetOfDataAssociation();

    @objid ("d852e2ad-a27f-4776-8ba2-4b901f1a6af8")
    <T extends BpmnDataAssociation> List<T> getTargetOfDataAssociation(java.lang.Class<T> filterClass);

    @objid ("c8c62a43-b3f8-493b-8e37-d4208cb5865e")
    BpmnItemDefinition getItemSubjectRef();

    @objid ("0ba3e294-568b-436b-8440-b259d8d18047")
    void setItemSubjectRef(BpmnItemDefinition value);

    @objid ("46fa4e6b-827d-401b-a9e2-bbeb4d56d6ce")
    State getInState();

    @objid ("7d3973a6-4c97-4a5a-b4c4-f1cba7efd292")
    void setInState(State value);

    @objid ("9892a04f-a8d2-418b-bc16-310b159f0b5f")
    AssociationEnd getRepresentedAssociationEnd();

    @objid ("b43b6bab-e59a-48c5-8bd4-1664a4efb2f8")
    void setRepresentedAssociationEnd(AssociationEnd value);

    @objid ("b1b339e7-9405-450e-85fc-5fd4ef0eecdf")
    BpmnDataState getDataState();

    @objid ("82b9c688-c89b-493f-8f56-143064e00c8c")
    void setDataState(BpmnDataState value);

    @objid ("e3e032f2-6203-4130-bb2c-d1b38f269c16")
    EList<BpmnDataAssociation> getSourceOfDataAssociation();

    @objid ("1219e764-1117-4689-9ca0-76a0880d5cd1")
    <T extends BpmnDataAssociation> List<T> getSourceOfDataAssociation(java.lang.Class<T> filterClass);

    @objid ("70f2b576-84ef-4409-a6f8-c111d6d5c915")
    Attribute getRepresentedAttribute();

    @objid ("10909a27-6bfe-4ab1-8712-503708082c7f")
    void setRepresentedAttribute(Attribute value);

    @objid ("db7dedd1-5ac8-4fc8-b15e-5a1d0a59e8ad")
    Instance getRepresentedInstance();

    @objid ("9250d399-9b55-402f-8e5a-cfe7c2ab2990")
    void setRepresentedInstance(Instance value);

}
