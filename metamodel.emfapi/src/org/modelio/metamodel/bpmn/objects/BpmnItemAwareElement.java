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
    @objid ("dc4c37e5-aeeb-4882-9b4d-c8b26c09dfe2")
    GeneralClass getType();

    @objid ("e538e05e-e0be-4acd-b020-2f73e40264ad")
    void setType(GeneralClass value);

    @objid ("c2841c08-6d25-47c1-9996-85a01ad9e9e9")
    EList<BpmnDataAssociation> getTargetOfDataAssociation();

    @objid ("a2b67303-4fd8-4078-8ce2-cf0f208eb1e4")
    <T extends BpmnDataAssociation> List<T> getTargetOfDataAssociation(java.lang.Class<T> filterClass);

    @objid ("5248be82-521b-447b-94d3-f9813da9eab8")
    BpmnItemDefinition getItemSubjectRef();

    @objid ("549c4f3e-5640-44b4-b22a-c12665b325e0")
    void setItemSubjectRef(BpmnItemDefinition value);

    @objid ("48a45521-3a88-47ab-825b-d3c78a58c5b0")
    State getInState();

    @objid ("5d522e97-cee5-44c7-99a9-235c4d5dda0e")
    void setInState(State value);

    @objid ("db6c7d7f-c1f7-4945-8085-6dad337776c5")
    AssociationEnd getRepresentedAssociationEnd();

    @objid ("d24a7f96-ed22-4e3a-b086-f1f118e7a404")
    void setRepresentedAssociationEnd(AssociationEnd value);

    @objid ("bd9005a9-ca7e-44c1-a392-1a08c59687b7")
    BpmnDataState getDataState();

    @objid ("14e4b59c-c8d0-4b41-8348-d111f95d2e3a")
    void setDataState(BpmnDataState value);

    @objid ("c71004d7-5217-4ac6-a4b7-c1394cdd557e")
    EList<BpmnDataAssociation> getSourceOfDataAssociation();

    @objid ("bdbf6336-b1ea-41c1-a8d6-39658e11972f")
    <T extends BpmnDataAssociation> List<T> getSourceOfDataAssociation(java.lang.Class<T> filterClass);

    @objid ("c537c9ca-2c3d-45da-be50-34ab7ee85531")
    Attribute getRepresentedAttribute();

    @objid ("0b7652d9-1c89-418c-a4a4-43aa262bc741")
    void setRepresentedAttribute(Attribute value);

    @objid ("532127b7-3760-4ef3-a188-ab5b1f194a5c")
    Instance getRepresentedInstance();

    @objid ("1a2c13b6-0161-4fc9-9b48-be6a7e75fd09")
    void setRepresentedInstance(Instance value);

}
