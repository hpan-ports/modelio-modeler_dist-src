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
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.RaisedException;

@objid ("0003645c-c4bf-1fd8-97fe-001ec947cd2a")
public interface Classifier extends NameSpace {
    @objid ("dc36ff11-349a-4c8e-b32c-b775e6d00f10")
    EList<Operation> getOwnedOperation();

    @objid ("5cd167c0-b012-413d-ab1e-3c3f71e89b13")
    <T extends Operation> List<T> getOwnedOperation(java.lang.Class<T> filterClass);

    @objid ("f0e45487-19a8-47a7-b8dd-5d230c5832eb")
    EList<InformationItem> getRepresentation();

    @objid ("27062605-8844-4c11-af84-ad77d8ba7ea4")
    <T extends InformationItem> List<T> getRepresentation(java.lang.Class<T> filterClass);

    @objid ("31f28ec1-a423-4b9a-8276-fc011058f727")
    EList<Substitution> getSubstitued();

    @objid ("e887a0b1-4190-4378-8b21-67fb9cfa7e7b")
    <T extends Substitution> List<T> getSubstitued(java.lang.Class<T> filterClass);

    @objid ("8dc0e0cc-14e6-44ff-be38-c19380fbe022")
    EList<Attribute> getOwnedAttribute();

    @objid ("f41dc5cd-af0a-4bcc-bef8-3218ed4626ba")
    <T extends Attribute> List<T> getOwnedAttribute(java.lang.Class<T> filterClass);

    @objid ("856026a1-fa63-40bf-8be4-1923816ff34f")
    EList<NaryAssociationEnd> getOwnedNaryEnd();

    @objid ("2fd8c1bc-3904-4879-a7f7-b3b46d1be58d")
    <T extends NaryAssociationEnd> List<T> getOwnedNaryEnd(java.lang.Class<T> filterClass);

    @objid ("77e321be-7192-402e-9b15-3b60ee88dce2")
    EList<InformationFlow> getConveyer();

    @objid ("8bc26f21-60c3-42ff-8ddf-18b133997833")
    <T extends InformationFlow> List<T> getConveyer(java.lang.Class<T> filterClass);

    @objid ("4178fd4b-fa6d-4dde-8f36-91cb7ad71845")
    EList<Substitution> getSubstitutingSubstitution();

    @objid ("067dbc86-24d3-469d-bd88-83372dd5fe08")
    <T extends Substitution> List<T> getSubstitutingSubstitution(java.lang.Class<T> filterClass);

    @objid ("a9e37514-7920-4f51-b0d6-886b0a8ca3da")
    EList<AssociationEnd> getTargetingEnd();

    @objid ("b0f0a816-034e-4d38-b9e5-959f3bc105f1")
    <T extends AssociationEnd> List<T> getTargetingEnd(java.lang.Class<T> filterClass);

    @objid ("88bded19-3e7e-439f-9465-60bc82cbb80d")
    EList<AssociationEnd> getOwnedEnd();

    @objid ("69153888-7833-46c4-bb4e-d86814844c7e")
    <T extends AssociationEnd> List<T> getOwnedEnd(java.lang.Class<T> filterClass);

    @objid ("37cc1c27-87f3-4b1e-907e-499ab6ff29d0")
    EList<BpmnParticipant> getBpmnRepresents();

    @objid ("84308953-4691-4d37-a2c9-24eb48603837")
    <T extends BpmnParticipant> List<T> getBpmnRepresents(java.lang.Class<T> filterClass);

    @objid ("88d133d2-de82-48ed-a0ad-cd8afa41a75f")
    EList<RaisedException> getThrowing();

    @objid ("82cef488-0988-40fb-87d2-b87a8f1cd0aa")
    <T extends RaisedException> List<T> getThrowing(java.lang.Class<T> filterClass);

    @objid ("97cf6c4b-80ec-4901-ba4c-3dab7c0daa99")
    EList<BindableInstance> getInternalStructure();

    @objid ("024b4618-8330-4749-a2ef-0e3f10cc0be4")
    <T extends BindableInstance> List<T> getInternalStructure(java.lang.Class<T> filterClass);

}
