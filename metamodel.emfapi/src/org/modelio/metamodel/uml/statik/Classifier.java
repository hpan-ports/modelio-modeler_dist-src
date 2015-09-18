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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.informationFlow.InformationItem;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.ComponentRealization;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.RaisedException;

@objid ("0003645c-c4bf-1fd8-97fe-001ec947cd2a")
public interface Classifier extends NameSpace {
    @objid ("12267bcd-b2e7-4ad6-8aa1-4ca5b58a0e1f")
    EList<Operation> getOwnedOperation();

    @objid ("82680331-9c13-4c47-836e-f49ba861a677")
    <T extends Operation> List<T> getOwnedOperation(java.lang.Class<T> filterClass);

    @objid ("e178d82b-8249-425e-8471-3c8d2f3bae31")
    EList<InformationItem> getRepresentation();

    @objid ("6c978c9c-a9fb-4781-a533-475be140396c")
    <T extends InformationItem> List<T> getRepresentation(java.lang.Class<T> filterClass);

    @objid ("f60c3616-f309-4bd5-97f5-76307d3b6f38")
    EList<Substitution> getSubstitued();

    @objid ("e036c5d8-5b6a-4af3-b1ef-a07ec563094b")
    <T extends Substitution> List<T> getSubstitued(java.lang.Class<T> filterClass);

    @objid ("eca428ac-b341-42f2-9c17-837540e21085")
    EList<Attribute> getOwnedAttribute();

    @objid ("6fc11ee3-d220-436c-9908-4cba47a97856")
    <T extends Attribute> List<T> getOwnedAttribute(java.lang.Class<T> filterClass);

    @objid ("ddb99f64-2d5c-490c-9158-aa8049697434")
    EList<NaryAssociationEnd> getOwnedNaryEnd();

    @objid ("1820ea20-263a-44b0-9848-5d8a544b7ed1")
    <T extends NaryAssociationEnd> List<T> getOwnedNaryEnd(java.lang.Class<T> filterClass);

    @objid ("e483c609-bb91-4588-aad1-952bf147e8b9")
    EList<InformationFlow> getConveyer();

    @objid ("3baf58e8-1b2a-4784-8760-d0feaff9d090")
    <T extends InformationFlow> List<T> getConveyer(java.lang.Class<T> filterClass);

    @objid ("e37813e3-990e-40e9-b9f8-871b0491d453")
    EList<Substitution> getSubstitutingSubstitution();

    @objid ("e66f7a0d-482b-48de-8a3b-41227b7dbc13")
    <T extends Substitution> List<T> getSubstitutingSubstitution(java.lang.Class<T> filterClass);

    @objid ("035d4173-622e-409a-902c-0061dabd81aa")
    EList<AssociationEnd> getTargetingEnd();

    @objid ("50b0623f-7fda-4a8e-9d78-57640dcb534d")
    <T extends AssociationEnd> List<T> getTargetingEnd(java.lang.Class<T> filterClass);

    @objid ("f6d3c721-0525-42bf-8ccc-977c60f97dac")
    EList<AssociationEnd> getOwnedEnd();

    @objid ("10b602b6-c281-4620-947b-98b8736bd1a2")
    <T extends AssociationEnd> List<T> getOwnedEnd(java.lang.Class<T> filterClass);

    @objid ("c937b64b-f62e-4573-89ce-7bbdb0136650")
    EList<BpmnParticipant> getBpmnRepresents();

    @objid ("7afaa113-4af8-4b97-84b3-2153e1f7fe7d")
    <T extends BpmnParticipant> List<T> getBpmnRepresents(java.lang.Class<T> filterClass);

    @objid ("0caf8be5-2415-4a3e-a88b-4cd66ccf8793")
    EList<RaisedException> getThrowing();

    @objid ("6f2ba866-a81a-4669-ba92-f15ecdec466c")
    <T extends RaisedException> List<T> getThrowing(java.lang.Class<T> filterClass);

    @objid ("b4431966-20b4-4c10-9f63-46e76c47b25f")
    EList<BindableInstance> getInternalStructure();

    @objid ("8c847eb5-d409-48f4-bc14-96e88139c2e0")
    <T extends BindableInstance> List<T> getInternalStructure(java.lang.Class<T> filterClass);

    @objid ("4f156606-a8de-4409-a85d-ae4440d09725")
    EList<ComponentRealization> getRealizedComponent();

    @objid ("17ef6ffa-3d2a-4c57-8487-6d8043164f27")
    <T extends ComponentRealization> List<T> getRealizedComponent(java.lang.Class<T> filterClass);

}
