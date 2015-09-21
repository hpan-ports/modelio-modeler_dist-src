/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.uml.statik.VisibilityMode;

/**
 * NameSpace v0.0.9054
 * 
 * 
 * A NameSpace is a named element that can own other named elements. Each named element may be owned by at most one NameSpace. 
 * 
 * A NameSpace provides a means of identifying named elements by name. Named elements can be identified by name in a NameSpace either by being directly owned by the NameSpace or by being introduced into the NameSpace by other means, for example, import or inheritance. 
 * 
 * Namespace is an abstract metaclass. 
 * 
 * A NameSpace can own Constraints. The Constraint does not necessarily apply to the NameSpace itself, but may also apply to elements in the NameSpace.  In Modelio, NameSpaces are generalizable. They can contain Interactions and are the definition context for Instances.
 * 
 * In Modelio, a NameSpace belongs to another NameSpace, with the single exception of the Root NameSpace, which is associated to the Project.
 */
@objid ("00115274-c4bf-1fd8-97fe-001ec947cd2a")
public interface NameSpace extends ModelTree {
    @objid ("e210cef3-42a4-4863-b966-9ac460748b65")
    public static final String MNAME = "NameSpace";

    /**
     * Getter for attribute 'NameSpace.IsAbstract'
     * 
     * Metamodel description:
     * <i>An abstract NameSpace is defined on a very general level and does not have direct instances.</i>
     */
    @objid ("668c96e9-500f-411f-bb4a-9a3c93b32a08")
    boolean isIsAbstract();

    /**
     * Setter for attribute 'NameSpace.IsAbstract'
     * 
     * Metamodel description:
     * <i>An abstract NameSpace is defined on a very general level and does not have direct instances.</i>
     */
    @objid ("542d645e-10cf-44cd-b2a8-29a9b50fb158")
    void setIsAbstract(boolean value);

    /**
     * Getter for attribute 'NameSpace.IsLeaf'
     * 
     * Metamodel description:
     * <i>Determines if the NameSpace is an inheritance tree leaf. This prohibits future inheritance.</i>
     */
    @objid ("2763ec4f-4d2c-43a3-8393-7405b2d90a55")
    boolean isIsLeaf();

    /**
     * Setter for attribute 'NameSpace.IsLeaf'
     * 
     * Metamodel description:
     * <i>Determines if the NameSpace is an inheritance tree leaf. This prohibits future inheritance.</i>
     */
    @objid ("f58392ab-c402-4804-88dd-d713f07f7e4a")
    void setIsLeaf(boolean value);

    /**
     * Getter for attribute 'NameSpace.IsRoot'
     * 
     * Metamodel description:
     * <i>Determines that the current NameSpace is the root of a Generalization tree.</i>
     */
    @objid ("1de188a5-dd24-4116-a807-ad3f5794982d")
    boolean isIsRoot();

    /**
     * Setter for attribute 'NameSpace.IsRoot'
     * 
     * Metamodel description:
     * <i>Determines that the current NameSpace is the root of a Generalization tree.</i>
     */
    @objid ("0551d1b7-a184-4885-a5fc-34993195ae7f")
    void setIsRoot(boolean value);

    /**
     * Getter for attribute 'NameSpace.Visibility'
     * 
     * Metamodel description:
     * <i>Defines the visibility of the NameSpace, inside its owning NameSpace (visibility of a Class in a Package, for example).</i>
     */
    @objid ("fc4e1f74-10d5-435f-9032-6621265ea010")
    VisibilityMode getVisibility();

    /**
     * Setter for attribute 'NameSpace.Visibility'
     * 
     * Metamodel description:
     * <i>Defines the visibility of the NameSpace, inside its owning NameSpace (visibility of a Class in a Package, for example).</i>
     */
    @objid ("65797235-c587-412e-ada3-da7c8ea95a02")
    void setVisibility(VisibilityMode value);

    /**
     * Getter for relation 'NameSpace->Parent'
     * 
     * Metamodel description:
     * <i>Association to the Parent NameSpace through the intermediate Generalization class.</i>
     */
    @objid ("16034ba6-dff0-4906-a62a-c0c4789930d3")
    EList<Generalization> getParent();

    /**
     * Filtered Getter for relation 'NameSpace->Parent'
     * 
     * Metamodel description:
     * <i>Association to the Parent NameSpace through the intermediate Generalization class.</i>
     */
    @objid ("777ddb3b-4d68-48d7-8cc5-cb01c7b4ded0")
    <T extends Generalization> List<T> getParent(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NameSpace->TemplateInstanciation'
     * 
     * Metamodel description:
     * <i>Relates to the template that is instanciated by the current NameSpace.</i>
     */
    @objid ("10478af3-d010-4017-8fef-017ae78476ed")
    EList<TemplateBinding> getTemplateInstanciation();

    /**
     * Filtered Getter for relation 'NameSpace->TemplateInstanciation'
     * 
     * Metamodel description:
     * <i>Relates to the template that is instanciated by the current NameSpace.</i>
     */
    @objid ("0aa49fdc-4397-4923-a1b5-93bab554d032")
    <T extends TemplateBinding> List<T> getTemplateInstanciation(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NameSpace->Representing'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("82b0f1cb-1c5b-4ff3-b90e-ed234af0ae69")
    EList<Instance> getRepresenting();

    /**
     * Filtered Getter for relation 'NameSpace->Representing'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e4185b8b-9fdc-435d-8caa-56afefc0b0c3")
    <T extends Instance> List<T> getRepresenting(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NameSpace->OwnedBehavior'
     * 
     * Metamodel description:
     * <i>Behavior specification that specifies the behavior of the namespace itself.</i>
     */
    @objid ("a1955824-5a51-4ffe-bce7-d95c38458abe")
    EList<Behavior> getOwnedBehavior();

    /**
     * Filtered Getter for relation 'NameSpace->OwnedBehavior'
     * 
     * Metamodel description:
     * <i>Behavior specification that specifies the behavior of the namespace itself.</i>
     */
    @objid ("26f552e4-0764-46ff-9ae2-215825e15375")
    <T extends Behavior> List<T> getOwnedBehavior(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NameSpace->Received'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2e2ce60d-96a4-46e6-8380-523806e95d9a")
    EList<DataFlow> getReceived();

    /**
     * Filtered Getter for relation 'NameSpace->Received'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("79d7d512-93bf-45f5-991e-05b4dfa48340")
    <T extends DataFlow> List<T> getReceived(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NameSpace->UsedNsu'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9815663c-e3d9-4c4f-b1f7-6cfa792a95d0")
    EList<NamespaceUse> getUsedNsu();

    /**
     * Filtered Getter for relation 'NameSpace->UsedNsu'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("969eedc1-279d-46ef-be4c-d5cab02365d9")
    <T extends NamespaceUse> List<T> getUsedNsu(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NameSpace->OwnedInformationFlow'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("8461f542-35f3-4432-8d86-8e7ed87df1e4")
    EList<InformationFlow> getOwnedInformationFlow();

    /**
     * Filtered Getter for relation 'NameSpace->OwnedInformationFlow'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("c0cf0047-a8bb-4863-823f-dcaa23667f9a")
    <T extends InformationFlow> List<T> getOwnedInformationFlow(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NameSpace->Importing'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3dbc5039-3f5b-498f-81f3-ee6ee1c67fac")
    EList<ElementImport> getImporting();

    /**
     * Filtered Getter for relation 'NameSpace->Importing'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("33f19169-2734-4430-ac1c-0b873ba6b054")
    <T extends ElementImport> List<T> getImporting(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NameSpace->Sent'
     * 
     * Metamodel description:
     * <i>DataFlows sent by the NameSpace.</i>
     */
    @objid ("a4c1e312-c245-4437-9572-356e1a507e5b")
    EList<DataFlow> getSent();

    /**
     * Filtered Getter for relation 'NameSpace->Sent'
     * 
     * Metamodel description:
     * <i>DataFlows sent by the NameSpace.</i>
     */
    @objid ("ce7eaaa6-6372-419a-b14e-6a76dfaca5d8")
    <T extends DataFlow> List<T> getSent(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NameSpace->OwnedDataFlow'
     * 
     * Metamodel description:
     * <i>DataFlows belong to a NameSpace. If they have an origin NameSpace, then this is the owner. Otherwise, the NameSpace constituting the definition context of the DataFlow (this typically designates the Package in which the diagram has been defined) will be the owner.</i>
     */
    @objid ("586a43f8-6b8c-4c68-96c4-2489b8799194")
    EList<DataFlow> getOwnedDataFlow();

    /**
     * Filtered Getter for relation 'NameSpace->OwnedDataFlow'
     * 
     * Metamodel description:
     * <i>DataFlows belong to a NameSpace. If they have an origin NameSpace, then this is the owner. Otherwise, the NameSpace constituting the definition context of the DataFlow (this typically designates the Package in which the diagram has been defined) will be the owner.</i>
     */
    @objid ("8a4c4e27-eba0-4bef-878a-18f8bcaebea4")
    <T extends DataFlow> List<T> getOwnedDataFlow(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NameSpace->OwnedCollaborationUse'
     * 
     * Metamodel description:
     * <i>Collaboration occurences can be owned by NameSpaces such as Packages, Classes and Collaborations.</i>
     */
    @objid ("1caad733-7f63-4db1-8860-a59a8bcf76f1")
    EList<CollaborationUse> getOwnedCollaborationUse();

    /**
     * Filtered Getter for relation 'NameSpace->OwnedCollaborationUse'
     * 
     * Metamodel description:
     * <i>Collaboration occurences can be owned by NameSpaces such as Packages, Classes and Collaborations.</i>
     */
    @objid ("d617be55-779d-4aaf-a1f2-58574945667a")
    <T extends CollaborationUse> List<T> getOwnedCollaborationUse(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NameSpace->OwnedPackageImport'
     * 
     * Metamodel description:
     * <i>Packages imported by the NameSpace.</i>
     */
    @objid ("13159a89-7246-4b93-b6ab-9eccc4f982cb")
    EList<PackageImport> getOwnedPackageImport();

    /**
     * Filtered Getter for relation 'NameSpace->OwnedPackageImport'
     * 
     * Metamodel description:
     * <i>Packages imported by the NameSpace.</i>
     */
    @objid ("8e24cdbd-11bd-4835-8580-ecb6314e7840")
    <T extends PackageImport> List<T> getOwnedPackageImport(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NameSpace->Template'
     * 
     * Metamodel description:
     * <i>In the case of template classes, this association defines its template parameters.</i>
     */
    @objid ("79c7e567-5991-45f2-a76e-96492c5b9cc5")
    EList<TemplateParameter> getTemplate();

    /**
     * Filtered Getter for relation 'NameSpace->Template'
     * 
     * Metamodel description:
     * <i>In the case of template classes, this association defines its template parameters.</i>
     */
    @objid ("5e666e2b-6dc9-4521-a6ff-0c76cda020c0")
    <T extends TemplateParameter> List<T> getTemplate(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NameSpace->Specialization'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f1a87e9b-2f8f-4181-9e3d-b7f910d6eb52")
    EList<Generalization> getSpecialization();

    /**
     * Filtered Getter for relation 'NameSpace->Specialization'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1d6c31c8-679d-44e7-bcab-d6f5e95c3134")
    <T extends Generalization> List<T> getSpecialization(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NameSpace->Realized'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2c8f3a76-d766-470d-840c-d6beccf9547f")
    EList<InterfaceRealization> getRealized();

    /**
     * Filtered Getter for relation 'NameSpace->Realized'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ab98698d-904b-46ee-90d4-8c9cc25f35f0")
    <T extends InterfaceRealization> List<T> getRealized(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NameSpace->Declared'
     * 
     * Metamodel description:
     * <i>Instances declared in the context of the current NameSpace.  </i>
     */
    @objid ("999af883-027b-4a91-bc24-a26e481e14f2")
    EList<Instance> getDeclared();

    /**
     * Filtered Getter for relation 'NameSpace->Declared'
     * 
     * Metamodel description:
     * <i>Instances declared in the context of the current NameSpace.  </i>
     */
    @objid ("c0d5478f-34ca-4242-b7bb-82c6256177ae")
    <T extends Instance> List<T> getDeclared(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NameSpace->InstanciatingBinding'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5bf49fb5-445e-456e-8b6a-151a627e2790")
    EList<TemplateBinding> getInstanciatingBinding();

    /**
     * Filtered Getter for relation 'NameSpace->InstanciatingBinding'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fda042a6-b4e4-4db3-94b3-11d0aceb2c8b")
    <T extends TemplateBinding> List<T> getInstanciatingBinding(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NameSpace->OwnedImport'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e77647f0-2ec9-4569-a55b-5e2c48540d09")
    EList<ElementImport> getOwnedImport();

    /**
     * Filtered Getter for relation 'NameSpace->OwnedImport'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9a8cc1ef-69a6-4bce-a0c0-e03ec4ad3124")
    <T extends ElementImport> List<T> getOwnedImport(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NameSpace->UserNsu'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("dd91076d-c121-495e-b491-8131339ea6aa")
    EList<NamespaceUse> getUserNsu();

    /**
     * Filtered Getter for relation 'NameSpace->UserNsu'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5d7d2236-bd87-4422-a396-b923950d3515")
    <T extends NamespaceUse> List<T> getUserNsu(java.lang.Class<T> filterClass);

}
