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

@objid ("00115274-c4bf-1fd8-97fe-001ec947cd2a")
public interface NameSpace extends ModelTree {
    @objid ("a9a145c5-91f7-4875-a45d-c5e7d6c8e00e")
    boolean isIsAbstract();

    @objid ("57bf094e-d68a-42b3-b5ef-06a8ce5d3ee0")
    void setIsAbstract(boolean value);

    @objid ("784f2d7e-6751-4ca3-90c2-b3130f108af5")
    boolean isIsLeaf();

    @objid ("b3c4c054-555d-4434-99df-2fca8a3daca2")
    void setIsLeaf(boolean value);

    @objid ("7db83ae2-3613-4e0e-a1b7-4046a61fd8a0")
    boolean isIsRoot();

    @objid ("f6f0ddf7-d330-4d47-b9af-2c41fc992142")
    void setIsRoot(boolean value);

    @objid ("152450c0-7474-4477-8dac-44712e175bff")
    VisibilityMode getVisibility();

    @objid ("d2e40f5c-2f10-4194-9c47-fffd45ed459d")
    void setVisibility(VisibilityMode value);

    @objid ("430e6a6d-7047-4d9a-82e1-64d9e5bf73ad")
    EList<Generalization> getParent();

    @objid ("159729d0-a4f4-4040-aeca-ab6209ddba44")
    <T extends Generalization> List<T> getParent(java.lang.Class<T> filterClass);

    @objid ("168d7411-82b3-4f79-bcc1-f9aea57d5b3a")
    EList<TemplateBinding> getTemplateInstanciation();

    @objid ("6954a50e-423f-4c22-9b4c-da3ca4804121")
    <T extends TemplateBinding> List<T> getTemplateInstanciation(java.lang.Class<T> filterClass);

    @objid ("0e04c87d-0960-4764-a98f-d46551318c6a")
    EList<Instance> getRepresenting();

    @objid ("fea32893-9acb-4d25-8b2c-8a610dae6532")
    <T extends Instance> List<T> getRepresenting(java.lang.Class<T> filterClass);

    @objid ("7165d1cf-fef4-40e1-a631-d0a014fe15e9")
    EList<Behavior> getOwnedBehavior();

    @objid ("3535149f-e43f-44ac-8ffa-8b482055ceb1")
    <T extends Behavior> List<T> getOwnedBehavior(java.lang.Class<T> filterClass);

    @objid ("48ad47d3-e6d5-40fa-b075-5dc8c8633ae1")
    EList<DataFlow> getReceived();

    @objid ("9677ecf8-a383-4ce3-a10d-e4c29c06a882")
    <T extends DataFlow> List<T> getReceived(java.lang.Class<T> filterClass);

    @objid ("985ce732-9c66-4fff-9cd7-d8ded1b8324d")
    EList<NamespaceUse> getUsedNsu();

    @objid ("6f65b46e-1c6d-4caa-aa2b-735b92970263")
    <T extends NamespaceUse> List<T> getUsedNsu(java.lang.Class<T> filterClass);

    @objid ("d17b1f66-7716-4e67-a726-b0a73c1d4d27")
    EList<InformationFlow> getOwnedInformationFlow();

    @objid ("3f3a3b74-1f78-48dd-9f7c-31df47d94785")
    <T extends InformationFlow> List<T> getOwnedInformationFlow(java.lang.Class<T> filterClass);

    @objid ("ffeaf417-2fdc-484f-8301-5fb52008aaf5")
    EList<ElementImport> getImporting();

    @objid ("234ce33a-d72d-4d45-b9ad-9870b2299e46")
    <T extends ElementImport> List<T> getImporting(java.lang.Class<T> filterClass);

    @objid ("c7b59f98-01b9-4048-942e-eb837933688d")
    EList<DataFlow> getSent();

    @objid ("9bd1b56c-b069-4f49-b9ae-602574ced10b")
    <T extends DataFlow> List<T> getSent(java.lang.Class<T> filterClass);

    @objid ("09fa219f-ffb6-4ab3-81e9-59b6f6c9a758")
    EList<DataFlow> getOwnedDataFlow();

    @objid ("cfce0f8d-5ecc-4db4-aa65-fe86d5c091a6")
    <T extends DataFlow> List<T> getOwnedDataFlow(java.lang.Class<T> filterClass);

    @objid ("eddeabfd-423f-40c5-8e16-db481605025b")
    EList<CollaborationUse> getOwnedCollaborationUse();

    @objid ("3768e148-0948-455a-a0b2-10fa0dc4b584")
    <T extends CollaborationUse> List<T> getOwnedCollaborationUse(java.lang.Class<T> filterClass);

    @objid ("e6f57f8f-4db9-4f66-9549-5ed90bfba730")
    EList<PackageImport> getOwnedPackageImport();

    @objid ("1767346b-9c32-4723-b542-4d3b01ee19df")
    <T extends PackageImport> List<T> getOwnedPackageImport(java.lang.Class<T> filterClass);

    @objid ("d5b37bcb-82b9-489b-a764-6c0d4d42e8ea")
    EList<TemplateParameter> getTemplate();

    @objid ("2c82fdaa-5c47-4386-a2c8-84e984c6b1e6")
    <T extends TemplateParameter> List<T> getTemplate(java.lang.Class<T> filterClass);

    @objid ("8c9fc5ea-1c58-4010-8466-9e6399c951e4")
    EList<Generalization> getSpecialization();

    @objid ("2b11c35d-ee6f-4ff5-b4ab-ef265f9f3383")
    <T extends Generalization> List<T> getSpecialization(java.lang.Class<T> filterClass);

    @objid ("3fa7ea3c-e3e6-42f4-aaa0-ea9570f578a7")
    EList<InterfaceRealization> getRealized();

    @objid ("ef0b18c7-0d8a-4065-9f14-0d0de298b83a")
    <T extends InterfaceRealization> List<T> getRealized(java.lang.Class<T> filterClass);

    @objid ("1dfae4bf-1b67-47cf-a46f-17624939baac")
    EList<Instance> getDeclared();

    @objid ("bf85c009-2de8-43b5-ab7c-e43bca6445c1")
    <T extends Instance> List<T> getDeclared(java.lang.Class<T> filterClass);

    @objid ("a6877b49-f5fe-4758-bd25-b3232b6cd889")
    EList<TemplateBinding> getInstanciatingBinding();

    @objid ("5630c574-4206-49da-bbda-286367f95566")
    <T extends TemplateBinding> List<T> getInstanciatingBinding(java.lang.Class<T> filterClass);

    @objid ("8036fe54-1f08-41d6-85c7-a5103710c8fe")
    EList<ElementImport> getOwnedImport();

    @objid ("c49fc7f6-143a-42fe-81d6-5079f47828bb")
    <T extends ElementImport> List<T> getOwnedImport(java.lang.Class<T> filterClass);

    @objid ("477e5c8c-cc12-4c2d-90aa-fcb3c33d90b4")
    EList<NamespaceUse> getUserNsu();

    @objid ("aa205e31-4c59-425d-9145-1b0ecc19ec33")
    <T extends NamespaceUse> List<T> getUserNsu(java.lang.Class<T> filterClass);

}
